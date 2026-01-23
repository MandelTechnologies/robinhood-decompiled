package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes27.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    @Keep
    public static Response execute(Call call) throws IOException {
        NetworkRequestMetricBuilder networkRequestMetricBuilderBuilder = NetworkRequestMetricBuilder.builder(TransportManager.getInstance());
        Timer timer = new Timer();
        long micros = timer.getMicros();
        try {
            Response responseExecute = call.execute();
            sendNetworkMetric(responseExecute, networkRequestMetricBuilderBuilder, micros, timer.getDurationMicros());
            return responseExecute;
        } catch (IOException e) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.getUrl();
                if (url != null) {
                    networkRequestMetricBuilderBuilder.setUrl(url.url().toString());
                }
                if (request.getMethod() != null) {
                    networkRequestMetricBuilderBuilder.setHttpMethod(request.getMethod());
                }
            }
            networkRequestMetricBuilderBuilder.setRequestStartTimeMicros(micros);
            networkRequestMetricBuilderBuilder.setTimeToResponseCompletedMicros(timer.getDurationMicros());
            NetworkRequestMetricBuilderUtil.logError(networkRequestMetricBuilderBuilder);
            throw e;
        }
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        call.enqueue(new InstrumentOkHttpEnqueueCallback(callback, TransportManager.getInstance(), timer, timer.getMicros()));
    }

    static void sendNetworkMetric(Response response, NetworkRequestMetricBuilder networkRequestMetricBuilder, long j, long j2) throws IOException {
        Request request = response.getRequest();
        if (request == null) {
            return;
        }
        networkRequestMetricBuilder.setUrl(request.getUrl().url().toString());
        networkRequestMetricBuilder.setHttpMethod(request.getMethod());
        if (request.getBody() != null) {
            long jContentLength = request.getBody().contentLength();
            if (jContentLength != -1) {
                networkRequestMetricBuilder.setRequestPayloadBytes(jContentLength);
            }
        }
        ResponseBody body = response.getBody();
        if (body != null) {
            long contentLength = body.getContentLength();
            if (contentLength != -1) {
                networkRequestMetricBuilder.setResponsePayloadBytes(contentLength);
            }
            MediaType mediaType = body.get$contentType();
            if (mediaType != null) {
                networkRequestMetricBuilder.setResponseContentType(mediaType.getMediaType());
            }
        }
        networkRequestMetricBuilder.setHttpResponseCode(response.getCode());
        networkRequestMetricBuilder.setRequestStartTimeMicros(j);
        networkRequestMetricBuilder.setTimeToResponseCompletedMicros(j2);
        networkRequestMetricBuilder.build();
    }
}

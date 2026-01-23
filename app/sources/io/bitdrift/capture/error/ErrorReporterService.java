package io.bitdrift.capture.error;

import android.util.Log;
import com.github.michaelbull.result.Err;
import com.github.michaelbull.result.Ok;
import com.github.michaelbull.result.Result;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.bitdrift.capture.ApiError;
import io.bitdrift.capture.Error;
import io.bitdrift.capture.network.okhttp.OkHttpApiClient;
import io.bitdrift.capture.network.okhttp.OkHttpApiClient4;
import io.bitdrift.capture.providers.FieldProvider;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ErrorReporterService.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002J.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/error/ErrorReporterService;", "Lio/bitdrift/capture/error/IErrorReporter;", "fieldProviders", "", "Lio/bitdrift/capture/providers/FieldProvider;", "apiClient", "Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;", "(Ljava/util/List;Lio/bitdrift/capture/network/okhttp/OkHttpApiClient;)V", "headers", "", "", "reportError", "", "message", ErrorBundle.DETAIL_ENTRY, "fields", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ErrorReporterService implements IErrorReporter {
    private final OkHttpApiClient apiClient;
    private final List<FieldProvider> fieldProviders;

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorReporterService(List<? extends FieldProvider> fieldProviders, OkHttpApiClient apiClient) {
        Intrinsics.checkNotNullParameter(fieldProviders, "fieldProviders");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        this.fieldProviders = fieldProviders;
        this.apiClient = apiClient;
    }

    private final Map<String, String> headers() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<FieldProvider> it = this.fieldProviders.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, ? extends String> entry : it.next().invoke().entrySet()) {
                String key = entry.getKey();
                linkedHashMap.put("x-" + StringsKt.replace$default(key, "_", "-", false, 4, (Object) null), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // io.bitdrift.capture.error.IErrorReporter
    public void reportError(String message, String details, Map<String, String> fields) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(fields, "fields");
        ErrorReportRequest errorReportRequest = new ErrorReportRequest(message, details);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(headers());
        mapCreateMapBuilder.putAll(fields);
        Map<String, String> mapBuild = MapsKt.build(mapCreateMapBuilder);
        final OkHttpApiClient okHttpApiClient = this.apiClient;
        OkHttpApiClient4.ReportSdkError reportSdkError = OkHttpApiClient4.ReportSdkError.INSTANCE;
        final C454731 c454731 = new Function1<Result<? extends Unit, ? extends Error>, Unit>() { // from class: io.bitdrift.capture.error.ErrorReporterService.reportError.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Result<Unit, ? extends Error> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof Ok) {
                    Log.i("capture", "Successfully reported error to bitdrift service");
                }
                if (result instanceof Err) {
                    Error error = (Error) ((Err) result).getError();
                    if (error instanceof ApiError.ServerError) {
                        Log.w("capture", "Failed to report error to bitdrift service, got " + ((ApiError.ServerError) error).getStatusCode() + " response");
                        return;
                    }
                    Log.e("capture", "Failed to report error to bitdrift service: " + error.getMessage());
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends Unit, ? extends Error> result) {
                invoke2((Result<Unit, ? extends Error>) result);
                return Unit.INSTANCE;
            }
        };
        try {
            String json = okHttpApiClient.gson.toJson(errorReportRequest);
            Request.Builder builderUrl = new Request.Builder().url(okHttpApiClient.apiBaseUrl.newBuilder().addPathSegments(reportSdkError.getPath()).build());
            RequestBody.Companion companion = RequestBody.INSTANCE;
            Intrinsics.checkNotNull(json);
            Request.Builder builderMethod = builderUrl.method("POST", companion.create(json, okHttpApiClient.jsonContentType));
            if (mapBuild != null) {
                builderMethod.headers(Headers.INSTANCE.m3819of(mapBuild));
            }
            builderMethod.header("x-bitdrift-api-key", okHttpApiClient.apiKey);
            okHttpApiClient.client.newCall(builderMethod.build()).enqueue(new Callback() { // from class: io.bitdrift.capture.error.ErrorReporterService$reportError$$inlined$perform$1
                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    OkHttpApiClient okHttpApiClient2 = okHttpApiClient;
                    Function1 function1 = c454731;
                    try {
                        if (response.isSuccessful()) {
                            try {
                                Gson gson = okHttpApiClient2.gson;
                                ResponseBody body = response.getBody();
                                String strString = body != null ? body.string() : null;
                                if (strString == null) {
                                    strString = "";
                                }
                                function1.invoke(new Ok(gson.fromJson(strString, new TypeToken<Unit>() { // from class: io.bitdrift.capture.error.ErrorReporterService$reportError$$inlined$perform$1.1
                                }.getType())));
                            } catch (Exception e) {
                                function1.invoke(new Err(okHttpApiClient2.toSerializationError(e)));
                            }
                        } else {
                            ResponseBody body2 = response.getBody();
                            function1.invoke(new Err(new ApiError.ServerError(response.getCode(), body2 != null ? body2.string() : null)));
                        }
                        Log.e("bitdrift", "done");
                        Closeable.closeFinally(response, null);
                    } finally {
                    }
                }

                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    c454731.invoke(new Err(okHttpApiClient.toNetworkError(e)));
                }
            });
        } catch (Exception e) {
            c454731.invoke((C454731) new Err(okHttpApiClient.toSerializationError(e)));
        }
    }
}

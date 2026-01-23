package io.bitdrift.capture.network.okhttp;

import com.adjust.sdk.Constants;
import io.bitdrift.capture.CaptureJniLibrary;
import io.bitdrift.capture.network.ICaptureNetwork;
import io.bitdrift.capture.network.ICaptureNetwork2;
import io.bitdrift.capture.network.ICaptureNetwork3;
import io.bitdrift.capture.threading.CaptureDispatchers;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

/* compiled from: OkHttpNetwork.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\u0016R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u000bR\u00020\u00000\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/OkHttpNetwork;", "Lio/bitdrift/capture/network/ICaptureNetwork;", "apiBaseUrl", "Lokhttp3/HttpUrl;", "timeoutSeconds", "", "networkDispatcher", "Lio/bitdrift/capture/threading/CaptureDispatchers$Network;", "(Lokhttp3/HttpUrl;JLio/bitdrift/capture/threading/CaptureDispatchers$Network;)V", "activeStream", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/bitdrift/capture/network/okhttp/OkHttpNetwork$StreamState;", "client", "Lokhttp3/OkHttpClient;", "url", "startStream", "Lio/bitdrift/capture/network/ICaptureStream;", "streamId", "headers", "", "", "StreamState", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class OkHttpNetwork implements ICaptureNetwork {
    private final AtomicReference<StreamState> activeStream;
    private final OkHttpClient client;
    private final CaptureDispatchers.Network networkDispatcher;
    private final HttpUrl url;

    public OkHttpNetwork(HttpUrl apiBaseUrl, long j, CaptureDispatchers.Network networkDispatcher) {
        List<? extends Protocol> listListOf;
        Intrinsics.checkNotNullParameter(apiBaseUrl, "apiBaseUrl");
        Intrinsics.checkNotNullParameter(networkDispatcher, "networkDispatcher");
        this.networkDispatcher = networkDispatcher;
        OkHttpClient.Builder builderNewBuilder = new OkHttpClient().newBuilder();
        builderNewBuilder.interceptors().clear();
        builderNewBuilder.networkInterceptors().clear();
        if (Intrinsics.areEqual(apiBaseUrl.getScheme(), Constants.SCHEME)) {
            listListOf = CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
        } else {
            listListOf = CollectionsKt.listOf(Protocol.H2_PRIOR_KNOWLEDGE);
        }
        OkHttpClient.Builder builderProtocols = builderNewBuilder.protocols(listListOf);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.client = builderProtocols.writeTimeout(j, timeUnit).readTimeout(j, timeUnit).retryOnConnectionFailure(false).build();
        this.url = apiBaseUrl.newBuilder().addPathSegments("bitdrift_public.protobuf.client.v1.ApiService/Mux").build();
        this.activeStream = new AtomicReference<>(null);
    }

    public /* synthetic */ OkHttpNetwork(HttpUrl httpUrl, long j, CaptureDispatchers.Network network, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(httpUrl, (i & 2) != 0 ? 120L : j, (i & 4) != 0 ? CaptureDispatchers.Network.INSTANCE : network);
    }

    @Override // io.bitdrift.capture.network.ICaptureNetwork
    public ICaptureNetwork2 startStream(long streamId, Map<String, String> headers) {
        DeallocationGuard<Long> streamId2;
        Intrinsics.checkNotNullParameter(headers, "headers");
        StreamState streamState = new StreamState(this, streamId, headers);
        StreamState andSet = this.activeStream.getAndSet(streamState);
        if (andSet != null && (streamId2 = andSet.getStreamId()) != null) {
            streamId2.deallocate();
        }
        return streamState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OkHttpNetwork.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m3636d2 = {"Lio/bitdrift/capture/network/okhttp/OkHttpNetwork$StreamState;", "Lio/bitdrift/capture/network/ICaptureStream;", "", "streamId", "", "", "headers", "<init>", "(Lio/bitdrift/capture/network/okhttp/OkHttpNetwork;JLjava/util/Map;)V", "reason", "", "closeStream", "(Ljava/lang/String;)V", "Lokhttp3/Response;", "response", "consumeResponse", "(Lokhttp3/Response;)V", "", "buffer", "", "length", "handleReceivedData", "([BI)V", "dataToSend", "sendData", "([B)V", "shutdown", "()V", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSink;", "getSink", "()Lokio/BufferedSink;", "Lokhttp3/Call;", "call", "Lokhttp3/Call;", "getCall", "()Lokhttp3/Call;", "Lio/bitdrift/capture/network/okhttp/DeallocationGuard;", "Lio/bitdrift/capture/network/okhttp/DeallocationGuard;", "getStreamId", "()Lio/bitdrift/capture/network/okhttp/DeallocationGuard;", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    final class StreamState implements ICaptureNetwork2 {
        private final Call call;
        private final BufferedSink sink;
        private final DeallocationGuard<Long> streamId;
        final /* synthetic */ OkHttpNetwork this$0;

        public StreamState(OkHttpNetwork okHttpNetwork, long j, Map<String, String> headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.this$0 = okHttpNetwork;
            this.streamId = new DeallocationGuard<>(Long.valueOf(j), new OkHttpNetwork5(ICaptureNetwork3.INSTANCE));
            String str = headers.get("content-type");
            OkHttpNetwork7 okHttpNetwork7NewDuplexRequestBody = OkHttpNetwork6.newDuplexRequestBody(MediaType.INSTANCE.get(str == null ? "application/grpc" : str));
            Request.Builder builderMethod = new Request.Builder().url(okHttpNetwork.url).method("POST", okHttpNetwork7NewDuplexRequestBody);
            for (Map.Entry<String, String> entry : headers.entrySet()) {
                if (!Intrinsics.areEqual(entry.getKey(), "content-type")) {
                    builderMethod.addHeader(entry.getKey(), entry.getValue());
                }
            }
            this.sink = okHttpNetwork7NewDuplexRequestBody.createSink();
            Call callNewCall = this.this$0.client.newCall(builderMethod.build());
            this.call = callNewCall;
            final OkHttpNetwork okHttpNetwork2 = this.this$0;
            callNewCall.enqueue(new Callback() { // from class: io.bitdrift.capture.network.okhttp.OkHttpNetwork.StreamState.2
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    StreamState.this.closeStream(e.toString());
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, final Response response) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    CaptureDispatchers.Network network = okHttpNetwork2.networkDispatcher;
                    final StreamState streamState = StreamState.this;
                    network.runAsync(new Function0<Unit>() { // from class: io.bitdrift.capture.network.okhttp.OkHttpNetwork$StreamState$2$onResponse$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Response response2 = response;
                            try {
                                streamState.consumeResponse(response2);
                                Unit unit = Unit.INSTANCE;
                                Closeable.closeFinally(response2, null);
                            } finally {
                            }
                        }
                    });
                }
            });
        }

        public final DeallocationGuard<Long> getStreamId() {
            return this.streamId;
        }

        @Override // io.bitdrift.capture.network.ICaptureNetwork2
        public void sendData(byte[] dataToSend) {
            Intrinsics.checkNotNullParameter(dataToSend, "dataToSend");
            Buffer buffer = new Buffer();
            buffer.write(dataToSend);
            try {
                this.sink.write(buffer, dataToSend.length);
                this.sink.flush();
            } catch (IOException e) {
                CaptureJniLibrary.INSTANCE.debugError("Failed to write data over API stream: " + e);
            }
        }

        @Override // io.bitdrift.capture.network.ICaptureNetwork2
        public void shutdown() {
            this.call.cancel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void closeStream(final String reason) {
            this.streamId.safeAccess(new Function1<Long, Unit>() { // from class: io.bitdrift.capture.network.okhttp.OkHttpNetwork$StreamState$closeStream$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    ICaptureNetwork3.INSTANCE.onApiStreamClosed(j, reason);
                }
            });
        }

        private final synchronized void handleReceivedData(final byte[] buffer, final int length) {
            this.streamId.safeAccess(new Function1<Long, Unit>() { // from class: io.bitdrift.capture.network.okhttp.OkHttpNetwork$StreamState$handleReceivedData$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    ICaptureNetwork3.INSTANCE.onApiChunkReceived(j, buffer, length);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void consumeResponse(Response response) {
            String str;
            str = "closed";
            ResponseBody body = response.getBody();
            Intrinsics.checkNotNull(body);
            BufferedSource bodySource = body.getSource();
            while (true) {
                try {
                    byte[] bArr = new byte[1024];
                    int i = bodySource.read(bArr);
                    if (i == -1) {
                        return;
                    } else {
                        handleReceivedData(bArr, i);
                    }
                } catch (Exception e) {
                    String string2 = e.toString();
                    str = string2 != null ? string2 : "closed";
                    return;
                } finally {
                    closeStream("closed");
                }
            }
        }
    }
}

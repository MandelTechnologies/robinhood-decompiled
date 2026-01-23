package okhttp3.internal.sse;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p481io.Closeable;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.sse.ServerSentEventReader;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;

/* compiled from: RealEventSource.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010\u0014\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010.¨\u0006/"}, m3636d2 = {"Lokhttp3/internal/sse/RealEventSource;", "Lokhttp3/sse/EventSource;", "Lokhttp3/internal/sse/ServerSentEventReader$Callback;", "Lokhttp3/Callback;", "Lokhttp3/Request;", "request", "Lokhttp3/sse/EventSourceListener;", "listener", "<init>", "(Lokhttp3/Request;Lokhttp3/sse/EventSourceListener;)V", "Lokhttp3/ResponseBody;", "", "isEventStream", "(Lokhttp3/ResponseBody;)Z", "Lokhttp3/OkHttpClient;", "client", "", "connect", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Call;", "call", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "processResponse", "(Lokhttp3/Response;)V", "Ljava/io/IOException;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "cancel", "()V", "", "id", "type", WebsocketGatewayConstants.DATA_KEY, "onEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "timeMs", "onRetryChange", "(J)V", "Lokhttp3/Request;", "Lokhttp3/sse/EventSourceListener;", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealCall;", "okhttp-sse"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class RealEventSource implements EventSource, ServerSentEventReader.Callback, Callback {
    private RealCall call;
    private final EventSourceListener listener;
    private final Request request;

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onRetryChange(long timeMs) {
    }

    public RealEventSource(Request request, EventSourceListener listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.request = request;
        this.listener = listener;
    }

    public final void connect(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Call callNewCall = client.newBuilder().eventListener(EventListener.NONE).build().newCall(this.request);
        Intrinsics.checkNotNull(callNewCall, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall");
        RealCall realCall = (RealCall) callNewCall;
        this.call = realCall;
        if (realCall == null) {
            Intrinsics.throwUninitializedPropertyAccessException("call");
            realCall = null;
        }
        realCall.enqueue(this);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        processResponse(response);
    }

    public final void processResponse(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (!response.isSuccessful()) {
                this.listener.onFailure(this, null, response);
                Closeable.closeFinally(response, null);
                return;
            }
            ResponseBody body = response.getBody();
            Intrinsics.checkNotNull(body);
            if (!isEventStream(body)) {
                this.listener.onFailure(this, new IllegalStateException("Invalid content-type: " + body.get$contentType()), response);
                Closeable.closeFinally(response, null);
                return;
            }
            RealCall realCall = this.call;
            if (realCall == null) {
                Intrinsics.throwUninitializedPropertyAccessException("call");
                realCall = null;
            }
            realCall.timeoutEarlyExit();
            Response responseBuild = response.newBuilder().body(Util.EMPTY_RESPONSE).build();
            ServerSentEventReader serverSentEventReader = new ServerSentEventReader(body.getBodySource(), this);
            try {
                this.listener.onOpen(this, responseBuild);
                do {
                } while (serverSentEventReader.processNextEvent());
                this.listener.onClosed(this);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(response, null);
            } catch (Exception e) {
                this.listener.onFailure(this, e, responseBuild);
                Closeable.closeFinally(response, null);
            }
        } finally {
        }
    }

    private final boolean isEventStream(ResponseBody responseBody) {
        MediaType mediaType = responseBody.get$contentType();
        return mediaType != null && Intrinsics.areEqual(mediaType.getType(), "text") && Intrinsics.areEqual(mediaType.getSubtype(), "event-stream");
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        this.listener.onFailure(this, e, null);
    }

    @Override // okhttp3.sse.EventSource
    public void cancel() {
        RealCall realCall = this.call;
        if (realCall == null) {
            Intrinsics.throwUninitializedPropertyAccessException("call");
            realCall = null;
        }
        realCall.cancel();
    }

    @Override // okhttp3.internal.sse.ServerSentEventReader.Callback
    public void onEvent(String id, String type2, String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.listener.onEvent(this, id, type2, data);
    }
}

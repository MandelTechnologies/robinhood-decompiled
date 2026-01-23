package okhttp3;

import kotlin.Metadata;

/* compiled from: WebSocket.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lokhttp3/WebSocket;", "", "", "text", "", "send", "(Ljava/lang/String;)Z", "", "cancel", "()V", "Factory", "okhttp"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface WebSocket {

    /* compiled from: WebSocket.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3636d2 = {"Lokhttp3/WebSocket$Factory;", "", "okhttp"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public interface Factory {
    }

    void cancel();

    boolean send(String text);
}

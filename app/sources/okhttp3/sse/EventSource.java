package okhttp3.sse;

import kotlin.Metadata;
import okhttp3.Request;

/* compiled from: EventSource.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lokhttp3/sse/EventSource;", "", "", "cancel", "()V", "Factory", "okhttp-sse"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public interface EventSource {

    /* compiled from: EventSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lokhttp3/sse/EventSource$Factory;", "", "newEventSource", "Lokhttp3/sse/EventSource;", "request", "Lokhttp3/Request;", "listener", "Lokhttp3/sse/EventSourceListener;", "okhttp-sse"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public interface Factory {
        EventSource newEventSource(Request request, EventSourceListener listener);
    }

    void cancel();
}

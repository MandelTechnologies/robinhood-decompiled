package microgram;

import kotlin.Metadata;

/* compiled from: MessageDispatcher.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/MessageDispatcher;", "", "", "target", "Lmicrogram/MessageHandler;", "handler", "", "registerMessageHandler", "(Ljava/lang/String;Lmicrogram/MessageHandler;)V", "microgram-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface MessageDispatcher {
    void registerMessageHandler(String target, MessageDispatcher2 handler);
}

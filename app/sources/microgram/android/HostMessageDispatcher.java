package microgram.android;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.Message;
import microgram.MicrogramError;

/* compiled from: HostMessageDispatcher.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/HostMessageDispatcher;", "", "sendMessage", "Lmicrogram/MicrogramError;", "target", "", "message", "Lmicrogram/Message;", "(Ljava/lang/String;Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessageWithReply", "registerMessageHandler", "", "identifier", "handler", "Lmicrogram/android/MessageHandler;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface HostMessageDispatcher {
    void registerMessageHandler(String identifier, MessageHandler handler);

    Object sendMessage(String str, Message message, Continuation<? super MicrogramError> continuation);

    Object sendMessageWithReply(String str, Message message, Continuation<? super Message> continuation);
}

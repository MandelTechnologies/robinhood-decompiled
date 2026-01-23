package microgram.android.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import microgram.android.MessageHandler;

/* compiled from: HostPlatformMessageTunnel.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/HostPlatformMessageTunnel;", "", "", "messageData", "", "sendMessage", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "onReady", "()V", "identifier", "Lmicrogram/android/MessageHandler;", "handler", "registerMessageHandler", "(Ljava/lang/String;Lmicrogram/android/MessageHandler;)V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface HostPlatformMessageTunnel {
    void onReady();

    void registerMessageHandler(String identifier, MessageHandler handler);

    Object sendMessage(String str, Continuation<? super Integer> continuation);
}

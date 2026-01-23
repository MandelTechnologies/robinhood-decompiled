package microgram.android.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import microgram.MicrogramError;
import microgram.RpcMessage;
import microgram.android.MessageHandler;

/* compiled from: InboundMessageRouter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH&J2\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H¦@¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lmicrogram/android/internal/InboundMessageRouter;", "", "accept", "Lmicrogram/MicrogramError;", "message", "Lmicrogram/RpcMessage;", "(Lmicrogram/RpcMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "installExtension", "", "id", "", "registerHandler", "", "target", "handler", "Lmicrogram/android/MessageHandler;", "withUnknownTargetBuffering", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface InboundMessageRouter {
    Object accept(RpcMessage rpcMessage, Continuation<? super MicrogramError> continuation);

    boolean installExtension(String id);

    void registerHandler(String target, MessageHandler handler);

    <R> Object withUnknownTargetBuffering(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation);
}

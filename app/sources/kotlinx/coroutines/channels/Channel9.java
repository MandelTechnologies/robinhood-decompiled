package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.StackTraceRecovery;

/* compiled from: Channel.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00042#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u0010H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\r8&X§\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m3636d2 = {"Lkotlinx/coroutines/channels/SendChannel;", "E", "", "element", "", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "offer", "(Ljava/lang/Object;)Z", "isClosedForSend", "()Z", "isClosedForSend$annotations", "()V", "kotlinx-coroutines-core"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: kotlinx.coroutines.channels.SendChannel, reason: use source file name */
/* loaded from: classes23.dex */
public interface Channel9<E> {
    boolean close(Throwable cause);

    /* renamed from: invokeOnClose */
    void mo28845invokeOnClose(Function1<? super Throwable, Unit> handler);

    boolean isClosedForSend();

    @Deprecated
    boolean offer(E element);

    Object send(E e, Continuation<? super Unit> continuation);

    /* renamed from: trySend-JP2dKIU */
    Object mo8337trySendJP2dKIU(E element);

    /* compiled from: Channel.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlinx.coroutines.channels.SendChannel$DefaultImpls */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean close$default(Channel9 channel9, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return channel9.close(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        public static <E> boolean offer(Channel9<? super E> channel9, E e) throws Throwable {
            Object objMo8337trySendJP2dKIU = channel9.mo8337trySendJP2dKIU(e);
            if (Channel5.m28810isSuccessimpl(objMo8337trySendJP2dKIU)) {
                return true;
            }
            Throwable thM28805exceptionOrNullimpl = Channel5.m28805exceptionOrNullimpl(objMo8337trySendJP2dKIU);
            if (thM28805exceptionOrNullimpl == null) {
                return false;
            }
            throw StackTraceRecovery.recoverStackTrace(thM28805exceptionOrNullimpl);
        }
    }
}

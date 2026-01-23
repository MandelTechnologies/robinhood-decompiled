package microgram.android.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import microgram.MicrogramError;
import microgram.android.MessageHandler;

/* compiled from: HostReceiveMessageHandler.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000f"}, m3636d2 = {"Lmicrogram/android/internal/HostReceiveMessageHandler;", "", "processIncomingMessage", "Lmicrogram/MicrogramError;", "message", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUnderlyingTransportReset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerMessageHandler", "identifier", "handler", "Lmicrogram/android/MessageHandler;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public interface HostReceiveMessageHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Object handleUnderlyingTransportReset(Continuation<? super Unit> continuation);

    Object processIncomingMessage(String str, Continuation<? super MicrogramError> continuation);

    void registerMessageHandler(String identifier, MessageHandler handler);

    /* compiled from: HostReceiveMessageHandler.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\b¨\u0006\t"}, m3636d2 = {"Lmicrogram/android/internal/HostReceiveMessageHandler$Companion;", "", "<init>", "()V", "wrapping", "Lmicrogram/android/internal/HostReceiveMessageHandler;", "delegate", "Lkotlin/Lazy;", "Lkotlin/Function0;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final HostReceiveMessageHandler wrapping(final Lazy<? extends HostReceiveMessageHandler> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return new HostReceiveMessageHandler() { // from class: microgram.android.internal.HostReceiveMessageHandler$Companion$wrapping$1
                @Override // microgram.android.internal.HostReceiveMessageHandler
                public Object processIncomingMessage(String str, Continuation<? super MicrogramError> continuation) {
                    return delegate.getValue().processIncomingMessage(str, continuation);
                }

                @Override // microgram.android.internal.HostReceiveMessageHandler
                public Object handleUnderlyingTransportReset(Continuation<? super Unit> continuation) {
                    Object objHandleUnderlyingTransportReset = delegate.getValue().handleUnderlyingTransportReset(continuation);
                    return objHandleUnderlyingTransportReset == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleUnderlyingTransportReset : Unit.INSTANCE;
                }

                @Override // microgram.android.internal.HostReceiveMessageHandler
                public void registerMessageHandler(String identifier, MessageHandler handler) {
                    Intrinsics.checkNotNullParameter(identifier, "identifier");
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    delegate.getValue().registerMessageHandler(identifier, handler);
                }
            };
        }

        public final HostReceiveMessageHandler wrapping(Function0<? extends HostReceiveMessageHandler> delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            return wrapping(LazyKt.lazy(delegate));
        }
    }
}

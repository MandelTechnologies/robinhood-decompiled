package microgram.android.internal.guest;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import microgram.android.internal.guest.GuestRuntimeTunnel;

/* compiled from: GuestRuntimeTunnel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel$handleEvent$2$stateJob$1", m3645f = "GuestRuntimeTunnel.kt", m3646l = {87, 88}, m3647m = "invokeSuspend")
/* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$handleEvent$2$stateJob$1, reason: use source file name */
/* loaded from: classes14.dex */
final class GuestRuntimeTunnel3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GuestRuntimeTunnel.Event $event;
    Object L$0;
    int label;
    final /* synthetic */ GuestRuntimeTunnel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuestRuntimeTunnel3(GuestRuntimeTunnel.Event event, GuestRuntimeTunnel guestRuntimeTunnel, Continuation<? super GuestRuntimeTunnel3> continuation) {
        super(2, continuation);
        this.$event = event;
        this.this$0 = guestRuntimeTunnel;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GuestRuntimeTunnel3(this.$event, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GuestRuntimeTunnel3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r4.send(r5, r7) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0069 -> B:7:0x0015). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel3<RuntimeMessage> it;
        Channel3<RuntimeMessage> channel3;
        Object objHasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            it = ((GuestRuntimeTunnel.Event.Load) this.$event).getHostPort().getMessages().iterator();
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel3 = (Channel3) this.L$0;
            ResultKt.throwOnFailure(obj);
            it = channel3;
            this.L$0 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != coroutine_suspended) {
                channel3 = it;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    RuntimeMessage next = channel3.next();
                    Channel channel = this.this$0.events;
                    GuestRuntimeTunnel.Event.IncomingMessage incomingMessage = new GuestRuntimeTunnel.Event.IncomingMessage(next);
                    this.L$0 = channel3;
                    this.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        channel3 = (Channel3) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}

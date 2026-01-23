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
import kotlinx.coroutines.channels.Channel3;
import microgram.android.internal.guest.GuestRuntimeTunnel;

/* compiled from: GuestRuntimeTunnel.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "microgram.android.internal.guest.GuestRuntimeTunnel$run$2$2$1", m3645f = "GuestRuntimeTunnel.kt", m3646l = {75, 76}, m3647m = "invokeSuspend")
/* renamed from: microgram.android.internal.guest.GuestRuntimeTunnel$run$2$2$1, reason: use source file name */
/* loaded from: classes14.dex */
final class GuestRuntimeTunnel5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GuestRuntime $runtime;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GuestRuntimeTunnel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GuestRuntimeTunnel5(GuestRuntimeTunnel guestRuntimeTunnel, GuestRuntime guestRuntime, Continuation<? super GuestRuntimeTunnel5> continuation) {
        super(2, continuation);
        this.this$0 = guestRuntimeTunnel;
        this.$runtime = guestRuntime;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GuestRuntimeTunnel5 guestRuntimeTunnel5 = new GuestRuntimeTunnel5(this.this$0, this.$runtime, continuation);
        guestRuntimeTunnel5.L$0 = obj;
        return guestRuntimeTunnel5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GuestRuntimeTunnel5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r5.handleEvent(r4, r6, r9, r8) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006c -> B:7:0x0019). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Channel3 it;
        CoroutineScope coroutineScope2;
        Object objHasNext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            it = this.this$0.events.iterator();
            this.L$0 = coroutineScope;
            this.L$1 = it;
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
            it = (Channel3) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            this.L$0 = coroutineScope;
            this.L$1 = it;
            this.label = 1;
            objHasNext = it.hasNext(this);
            if (objHasNext != coroutine_suspended) {
                coroutineScope2 = coroutineScope;
                obj = objHasNext;
                if (!((Boolean) obj).booleanValue()) {
                    GuestRuntimeTunnel.Event event = (GuestRuntimeTunnel.Event) it.next();
                    GuestRuntimeTunnel guestRuntimeTunnel = this.this$0;
                    GuestRuntime guestRuntime = this.$runtime;
                    this.L$0 = coroutineScope2;
                    this.L$1 = it;
                    this.label = 2;
                } else {
                    return Unit.INSTANCE;
                }
            }
            return coroutine_suspended;
        }
        it = (Channel3) this.L$1;
        coroutineScope2 = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}

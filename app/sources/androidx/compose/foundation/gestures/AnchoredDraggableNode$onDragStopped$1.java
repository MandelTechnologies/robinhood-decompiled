package androidx.compose.foundation.gestures;

import androidx.compose.foundation.Overscroll;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnchoredDraggable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", m3645f = "AnchoredDraggable.kt", m3646l = {434, 436}, m3647m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AnchoredDraggableNode$onDragStopped$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j, Continuation<? super AnchoredDraggableNode$onDragStopped$1> continuation) {
        super(2, continuation);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r1.fling(r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (r1.mo4859applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
            float fM4951toFloatTH1AsA0 = anchoredDraggableNode.m4951toFloatTH1AsA0(anchoredDraggableNode.m4949reverseIfNeededAH228Gc(this.$velocity));
            if (((AnchoredDraggableNode) this.this$0).overscrollEffect != null) {
                Overscroll overscroll = ((AnchoredDraggableNode) this.this$0).overscrollEffect;
                Intrinsics.checkNotNull(overscroll);
                long jM4954toVelocityadjELrA = this.this$0.m4954toVelocityadjELrA(fM4951toFloatTH1AsA0);
                C10801 c10801 = new C10801(this.this$0, null);
                this.label = 2;
            } else {
                AnchoredDraggableNode<T> anchoredDraggableNode2 = this.this$0;
                this.label = 1;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "T", "availableVelocity"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", m3645f = "AnchoredDraggable.kt", m3646l = {438}, m3647m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 */
    static final class C10801 extends ContinuationImpl7 implements Function2<Velocity, Continuation<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10801(AnchoredDraggableNode<T> anchoredDraggableNode, Continuation<? super C10801> continuation) {
            super(2, continuation);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10801 c10801 = new C10801(this.this$0, continuation);
            c10801.J$0 = ((Velocity) obj).getPackedValue();
            return c10801;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
            return m4958invokesFctU(velocity.getPackedValue(), continuation);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m4958invokesFctU(long j, Continuation<? super Velocity> continuation) {
            return ((C10801) create(Velocity.m8095boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            long jM4954toVelocityadjELrA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                float fM4951toFloatTH1AsA0 = anchoredDraggableNode.m4951toFloatTH1AsA0(j);
                this.J$0 = j;
                this.label = 1;
                obj = anchoredDraggableNode.fling(fM4951toFloatTH1AsA0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                jM4954toVelocityadjELrA = j;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jM4954toVelocityadjELrA = this.J$0;
                ResultKt.throwOnFailure(obj);
            }
            float fFloatValue = ((Number) obj).floatValue();
            float fRequireOffset = ((AnchoredDraggableNode) this.this$0).state.requireOffset();
            float fMinPosition = ((AnchoredDraggableNode) this.this$0).state.getAnchors().minPosition();
            if (fRequireOffset >= ((AnchoredDraggableNode) this.this$0).state.getAnchors().maxPosition() || fRequireOffset <= fMinPosition) {
                jM4954toVelocityadjELrA = this.this$0.m4954toVelocityadjELrA(fFloatValue);
            }
            return Velocity.m8095boximpl(jM4954toVelocityadjELrA);
        }
    }
}

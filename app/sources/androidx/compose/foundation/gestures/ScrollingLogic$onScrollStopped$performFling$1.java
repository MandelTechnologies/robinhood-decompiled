package androidx.compose.foundation.gestures;

import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier2;
import androidx.compose.p011ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Scrollable.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", m3645f = "Scrollable.kt", m3646l = {748, 751, 754}, m3647m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ScrollingLogic$onScrollStopped$performFling$1 extends ContinuationImpl7 implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onScrollStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onScrollStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onScrollStopped$performFling$1.J$0 = ((Velocity) obj).getPackedValue();
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m5044invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m5044invokesFctU(long j, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onScrollStopped$performFling$1) create(Velocity.m8095boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r0 != r6) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM7130dispatchPreFlingQWom1Mo;
        long j;
        Object objM5036doFlingAnimationQWom1Mo;
        long j2;
        long j3;
        long j4;
        Object objM7128dispatchPostFlingRZ2iAVY;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j5 = this.J$0;
            NestedScrollModifier2 nestedScrollModifier2 = this.this$0.nestedScrollDispatcher;
            this.J$0 = j5;
            this.label = 1;
            objM7130dispatchPreFlingQWom1Mo = nestedScrollModifier2.m7130dispatchPreFlingQWom1Mo(j5, this);
            if (objM7130dispatchPreFlingQWom1Mo != coroutine_suspended) {
                j = j5;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            objM7130dispatchPreFlingQWom1Mo = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = this.J$1;
                long j7 = this.J$0;
                ResultKt.throwOnFailure(obj);
                j2 = j7;
                j4 = j6;
                objM7128dispatchPostFlingRZ2iAVY = obj;
                return Velocity.m8095boximpl(Velocity.m8104minusAH228Gc(j2, Velocity.m8104minusAH228Gc(j4, ((Velocity) objM7128dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            j3 = this.J$1;
            j2 = this.J$0;
            ResultKt.throwOnFailure(obj);
            objM5036doFlingAnimationQWom1Mo = obj;
            long packedValue = ((Velocity) objM5036doFlingAnimationQWom1Mo).getPackedValue();
            NestedScrollModifier2 nestedScrollModifier22 = this.this$0.nestedScrollDispatcher;
            long jM8104minusAH228Gc = Velocity.m8104minusAH228Gc(j3, packedValue);
            this.J$0 = j2;
            this.J$1 = packedValue;
            this.label = 3;
            j4 = packedValue;
            objM7128dispatchPostFlingRZ2iAVY = nestedScrollModifier22.m7128dispatchPostFlingRZ2iAVY(jM8104minusAH228Gc, j4, this);
        }
        long jM8104minusAH228Gc2 = Velocity.m8104minusAH228Gc(j, ((Velocity) objM7130dispatchPreFlingQWom1Mo).getPackedValue());
        ScrollingLogic scrollingLogic = this.this$0;
        this.J$0 = j;
        this.J$1 = jM8104minusAH228Gc2;
        this.label = 2;
        objM5036doFlingAnimationQWom1Mo = scrollingLogic.m5036doFlingAnimationQWom1Mo(jM8104minusAH228Gc2, this);
        if (objM5036doFlingAnimationQWom1Mo != coroutine_suspended) {
            j2 = j;
            j3 = jM8104minusAH228Gc2;
            long packedValue2 = ((Velocity) objM5036doFlingAnimationQWom1Mo).getPackedValue();
            NestedScrollModifier2 nestedScrollModifier222 = this.this$0.nestedScrollDispatcher;
            long jM8104minusAH228Gc3 = Velocity.m8104minusAH228Gc(j3, packedValue2);
            this.J$0 = j2;
            this.J$1 = packedValue2;
            this.label = 3;
            j4 = packedValue2;
            objM7128dispatchPostFlingRZ2iAVY = nestedScrollModifier222.m7128dispatchPostFlingRZ2iAVY(jM8104minusAH228Gc3, j4, this);
        }
        return coroutine_suspended;
    }
}

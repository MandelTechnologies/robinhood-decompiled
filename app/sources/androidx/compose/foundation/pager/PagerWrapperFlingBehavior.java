package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* compiled from: LazyLayoutPager.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u00020\t*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "originalFlingBehavior", "Landroidx/compose/foundation/pager/PagerState;", "pagerState", "<init>", "(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V", "Landroidx/compose/foundation/gestures/ScrollScope;", "", "initialVelocity", "performFling", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "getOriginalFlingBehavior", "()Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "Landroidx/compose/foundation/pager/PagerState;", "getPagerState", "()Landroidx/compose/foundation/pager/PagerState;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
final class PagerWrapperFlingBehavior implements FlingBehavior {
    private final TargetedFlingBehavior originalFlingBehavior;
    private final PagerState pagerState;

    /* compiled from: LazyLayoutPager.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.pager.PagerWrapperFlingBehavior", m3645f = "LazyLayoutPager.kt", m3646l = {386}, m3647m = "performFling")
    /* renamed from: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$1 */
    static final class C13151 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C13151(Continuation<? super C13151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PagerWrapperFlingBehavior.this.performFling(null, 0.0f, this);
        }
    }

    public PagerWrapperFlingBehavior(TargetedFlingBehavior targetedFlingBehavior, PagerState pagerState) {
        this.originalFlingBehavior = targetedFlingBehavior;
        this.pagerState = pagerState;
    }

    public final PagerState getPagerState() {
        return this.pagerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(final ScrollableState4 scrollableState4, float f, Continuation<? super Float> continuation) {
        C13151 c13151;
        PagerWrapperFlingBehavior pagerWrapperFlingBehavior;
        if (continuation instanceof C13151) {
            c13151 = (C13151) continuation;
            int i = c13151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13151.label = i - Integer.MIN_VALUE;
            } else {
                c13151 = new C13151(continuation);
            }
        }
        Object objPerformFling = c13151.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13151.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPerformFling);
            TargetedFlingBehavior targetedFlingBehavior = this.originalFlingBehavior;
            Function1<Float, Unit> function1 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.pager.PagerWrapperFlingBehavior$performFling$resultVelocity$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                    invoke(f2.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f2) {
                    this.this$0.getPagerState().updateTargetPage(scrollableState4, MathKt.roundToInt(this.this$0.getPagerState().getPageSizeWithSpacing$foundation_release() != 0 ? f2 / this.this$0.getPagerState().getPageSizeWithSpacing$foundation_release() : 0.0f) + this.this$0.getPagerState().getCurrentPage());
                }
            };
            c13151.L$0 = this;
            c13151.label = 1;
            objPerformFling = targetedFlingBehavior.performFling(scrollableState4, f, function1, c13151);
            if (objPerformFling == coroutine_suspended) {
                return coroutine_suspended;
            }
            pagerWrapperFlingBehavior = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) c13151.L$0;
            ResultKt.throwOnFailure(objPerformFling);
        }
        float fFloatValue = ((Number) objPerformFling).floatValue();
        if (pagerWrapperFlingBehavior.pagerState.getCurrentPageOffsetFraction() != 0.0f && Math.abs(pagerWrapperFlingBehavior.pagerState.getCurrentPageOffsetFraction()) < 0.001d) {
            PagerState pagerState = pagerWrapperFlingBehavior.pagerState;
            PagerState.requestScrollToPage$default(pagerState, pagerState.getCurrentPage(), 0.0f, 2, null);
        } else {
            pagerWrapperFlingBehavior.pagerState.getCurrentPageOffsetFraction();
        }
        return boxing.boxFloat(fFloatValue);
    }
}

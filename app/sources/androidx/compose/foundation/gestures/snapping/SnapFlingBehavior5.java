package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationState3;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.DecayAnimationSpec3;
import androidx.compose.foundation.gestures.ScrollableState4;
import androidx.compose.foundation.internal.InlineClassHelper;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "Landroidx/compose/foundation/gestures/snapping/AnimationResult;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", m3645f = "SnapFlingBehavior.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 151}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1, reason: use source file name */
/* loaded from: classes4.dex */
final class SnapFlingBehavior5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>>, Object> {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1<Float, Unit> $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollableState4 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SnapFlingBehavior5(SnapFlingBehavior snapFlingBehavior, float f, Function1<? super Float, Unit> function1, ScrollableState4 scrollableState4, Continuation<? super SnapFlingBehavior5> continuation) {
        super(2, continuation);
        this.this$0 = snapFlingBehavior;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = function1;
        this.$this_fling = scrollableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SnapFlingBehavior5(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SnapFlingBehavior2<Float, AnimationVectors2>> continuation) {
        return ((SnapFlingBehavior5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        final Ref.FloatRef floatRef;
        Object objTryApproach;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            float fCalculateApproachOffset = this.this$0.snapLayoutInfoProvider.calculateApproachOffset(this.$initialVelocity, DecayAnimationSpec3.calculateTargetValue(this.this$0.decayAnimationSpec, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fCalculateApproachOffset)) {
                InlineClassHelper.throwIllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            floatRef = new Ref.FloatRef();
            float fAbs = Math.abs(fCalculateApproachOffset) * Math.signum(this.$initialVelocity);
            floatRef.element = fAbs;
            this.$onRemainingScrollOffsetUpdate.invoke(boxing.boxFloat(fAbs));
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollableState4 scrollableState4 = this.$this_fling;
            float f = floatRef.element;
            float f2 = this.$initialVelocity;
            final Function1<Float, Unit> function1 = this.$onRemainingScrollOffsetUpdate;
            Function1<Float, Unit> function12 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1$animationState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                    invoke(f3.floatValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(float f3) {
                    Ref.FloatRef floatRef2 = floatRef;
                    float f4 = floatRef2.element - f3;
                    floatRef2.element = f4;
                    function1.invoke(Float.valueOf(f4));
                }
            };
            this.L$0 = floatRef;
            this.label = 1;
            objTryApproach = snapFlingBehavior.tryApproach(scrollableState4, f, f2, function12, this);
            if (objTryApproach != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        Ref.FloatRef floatRef2 = (Ref.FloatRef) this.L$0;
        ResultKt.throwOnFailure(obj);
        floatRef = floatRef2;
        objTryApproach = obj;
        AnimationState animationState = (AnimationState) objTryApproach;
        float fCalculateSnapOffset = this.this$0.snapLayoutInfoProvider.calculateSnapOffset(((Number) animationState.getVelocity()).floatValue());
        if (Float.isNaN(fCalculateSnapOffset)) {
            InlineClassHelper.throwIllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        floatRef.element = fCalculateSnapOffset;
        ScrollableState4 scrollableState42 = this.$this_fling;
        AnimationState animationStateCopy$default = AnimationState3.copy$default(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
        AnimationSpec animationSpec = this.this$0.snapAnimationSpec;
        final Function1<Float, Unit> function13 = this.$onRemainingScrollOffsetUpdate;
        Function1<Float, Unit> function14 = new Function1<Float, Unit>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f3) {
                invoke(f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f3) {
                Ref.FloatRef floatRef3 = floatRef;
                float f4 = floatRef3.element - f3;
                floatRef3.element = f4;
                function13.invoke(Float.valueOf(f4));
            }
        };
        this.L$0 = null;
        this.label = 2;
        Object objAnimateWithTarget = SnapFlingBehavior7.animateWithTarget(scrollableState42, fCalculateSnapOffset, fCalculateSnapOffset, animationStateCopy$default, animationSpec, function14, this);
        return objAnimateWithTarget == coroutine_suspended ? coroutine_suspended : objAnimateWithTarget;
    }
}

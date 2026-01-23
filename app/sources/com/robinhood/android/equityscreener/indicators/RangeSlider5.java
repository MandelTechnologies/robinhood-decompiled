package com.robinhood.android.equityscreener.indicators;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equityscreener.indicators.RangeSlider2;
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
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RangeSlider.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$gestureEndAction$1$1$1", m3645f = "RangeSlider.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$gestureEndAction$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class RangeSlider5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $current;
    final /* synthetic */ SnapshotState<Ranges3<Float>> $currentRange;
    final /* synthetic */ boolean $isStart;
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ Ranges3<Float> $range;
    final /* synthetic */ SnapshotFloatState2 $rawOffsetEnd;
    final /* synthetic */ SnapshotFloatState2 $rawOffsetStart;
    final /* synthetic */ RangeSlider $sliderAlgorithm;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RangeSlider5(float f, float f2, boolean z, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, RangeSlider rangeSlider, Ranges3<Float> ranges3, SnapshotState<Ranges3<Float>> snapshotState, SnapshotState4<? extends Function2<? super Boolean, ? super Ranges3<Float>, Unit>> snapshotState4, Continuation<? super RangeSlider5> continuation) {
        super(2, continuation);
        this.$current = f;
        this.$target = f2;
        this.$isStart = z;
        this.$rawOffsetStart = snapshotFloatState2;
        this.$rawOffsetEnd = snapshotFloatState22;
        this.$maxPx = floatRef;
        this.$minPx = floatRef2;
        this.$sliderAlgorithm = rangeSlider;
        this.$range = ranges3;
        this.$currentRange = snapshotState;
        this.$onValueChangeState = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RangeSlider5(this.$current, this.$target, this.$isStart, this.$rawOffsetStart, this.$rawOffsetEnd, this.$maxPx, this.$minPx, this.$sliderAlgorithm, this.$range, this.$currentRange, this.$onValueChangeState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RangeSlider5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable animatableAnimatable$default = Animatable2.Animatable$default(this.$current, 0.0f, 2, null);
            Float fBoxFloat = boxing.boxFloat(this.$target);
            TweenSpec tweenSpec = RangeSlider2.SliderToTickAnimation;
            Float fBoxFloat2 = boxing.boxFloat(0.0f);
            final boolean z = this.$isStart;
            final SnapshotFloatState2 snapshotFloatState2 = this.$rawOffsetStart;
            final SnapshotFloatState2 snapshotFloatState22 = this.$rawOffsetEnd;
            final Ref.FloatRef floatRef = this.$maxPx;
            final Ref.FloatRef floatRef2 = this.$minPx;
            final RangeSlider rangeSlider = this.$sliderAlgorithm;
            final Ranges3<Float> ranges3 = this.$range;
            final SnapshotState<Ranges3<Float>> snapshotState = this.$currentRange;
            final SnapshotState4<Function2<Boolean, Ranges3<Float>, Unit>> snapshotState4 = this.$onValueChangeState;
            Function1 function1 = new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$gestureEndAction$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return RangeSlider5.invokeSuspend$lambda$0(z, snapshotFloatState2, snapshotFloatState22, floatRef, floatRef2, rangeSlider, ranges3, snapshotState, snapshotState4, (Animatable) obj2);
                }
            };
            this.label = 1;
            if (animatableAnimatable$default.animateTo(fBoxFloat, tweenSpec, fBoxFloat2, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        RangeSlider2.RangeSlider$onValueChangeState(this.$currentRange, this.$onValueChangeState, true, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(boolean z, SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, RangeSlider rangeSlider, Ranges3 ranges3, SnapshotState snapshotState, SnapshotState4 snapshotState4, Animatable animatable) {
        (z ? snapshotFloatState2 : snapshotFloatState22).setFloatValue(((Number) animatable.getValue()).floatValue());
        RangeSlider2.RangeSlider$onValueChangeState(snapshotState, snapshotState4, false, RangeSlider2.C157291.invoke$scaleToUserValue$2(floatRef, floatRef2, rangeSlider, ranges3, RangesKt.rangeTo(snapshotFloatState2.getFloatValue(), snapshotFloatState22.getFloatValue())));
        return Unit.INSTANCE;
    }
}

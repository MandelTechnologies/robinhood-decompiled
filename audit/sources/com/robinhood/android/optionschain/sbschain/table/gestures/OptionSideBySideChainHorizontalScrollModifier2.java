package com.robinhood.android.optionschain.sbschain.table.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.unit.Density;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainHorizontalScrollModifier.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifierKt$optionSideBySideChainHorizontalScroll$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionSideBySideChainHorizontalScrollModifier2 implements PointerInputEventHandler {
    final /* synthetic */ OptionSideBySideChainDataState2 $callPutSwitcherState;
    final /* synthetic */ float $cellWidth;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Density $density;
    final /* synthetic */ Function0<Unit> $logHorizontalScrollStart;
    final /* synthetic */ int $metricSize;
    final /* synthetic */ int $numOfCellsCanHoldOneSide;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $sharedScrollValue;
    final /* synthetic */ Ref.FloatRef $velocityX;

    OptionSideBySideChainHorizontalScrollModifier2(Density density, OptionSideBySideChainDataState2 optionSideBySideChainDataState2, int i, float f, CoroutineScope coroutineScope, Animatable<Float, AnimationVectors2> animatable, Ref.FloatRef floatRef, int i2, Function0<Unit> function0) {
        this.$density = density;
        this.$callPutSwitcherState = optionSideBySideChainDataState2;
        this.$numOfCellsCanHoldOneSide = i;
        this.$cellWidth = f;
        this.$coroutineScope = coroutineScope;
        this.$sharedScrollValue = animatable;
        this.$velocityX = floatRef;
        this.$metricSize = i2;
        this.$logHorizontalScrollStart = function0;
    }

    @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        int i;
        final float fMo5016toPx0680j_4 = this.$density.mo5016toPx0680j_4(this.$cellWidth);
        if (this.$callPutSwitcherState == OptionSideBySideChainDataState2.BOTH) {
            i = this.$numOfCellsCanHoldOneSide;
        } else {
            i = this.$numOfCellsCanHoldOneSide * 2;
        }
        final int i2 = i;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final Animatable<Float, AnimationVectors2> animatable = this.$sharedScrollValue;
        final Ref.FloatRef floatRef = this.$velocityX;
        final int i3 = this.$metricSize;
        Function0 function0 = new Function0() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifierKt$optionSideBySideChainHorizontalScroll$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionSideBySideChainHorizontalScrollModifier2.invoke$lambda$1(fMo5016toPx0680j_4, coroutineScope, animatable, floatRef, i3, i2);
            }
        };
        final Function0<Unit> function02 = this.$logHorizontalScrollStart;
        final Ref.FloatRef floatRef2 = this.$velocityX;
        Function1 function1 = new Function1() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifierKt$optionSideBySideChainHorizontalScroll$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionSideBySideChainHorizontalScrollModifier2.invoke$lambda$2(function02, floatRef2, (Offset) obj);
            }
        };
        final int i4 = this.$metricSize;
        final Animatable<Float, AnimationVectors2> animatable2 = this.$sharedScrollValue;
        final CoroutineScope coroutineScope2 = this.$coroutineScope;
        final Ref.FloatRef floatRef3 = this.$velocityX;
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, function1, function0, function0, new Function2() { // from class: com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifierKt$optionSideBySideChainHorizontalScroll$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OptionSideBySideChainHorizontalScrollModifier2.invoke$lambda$3(i4, i2, fMo5016toPx0680j_4, animatable2, coroutineScope2, floatRef3, (PointerInputChange) obj, (Offset) obj2);
            }
        }, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(float f, CoroutineScope coroutineScope, Animatable animatable, Ref.FloatRef floatRef, int i, int i2) {
        CoroutineScope coroutineScope2;
        int iCoerceAtLeast;
        if (Math.abs(f) < 0.001f) {
            coroutineScope2 = coroutineScope;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new OptionSideBySideChainHorizontalScrollModifier4(animatable, null), 3, null);
        } else {
            coroutineScope2 = coroutineScope;
        }
        float fFloatValue = ((Number) animatable.getValue()).floatValue();
        float f2 = floatRef.element;
        float fAbs = (fFloatValue + ((f2 * Math.abs(f2)) / 20000.0f)) / f;
        float f3 = 0.0f;
        if (i > i2 && fAbs > 1.0f) {
            if (fAbs <= 2.0f) {
                f3 = 2.01f;
            } else {
                int i3 = i - i2;
                if (fAbs >= i3) {
                    iCoerceAtLeast = RangesKt.coerceAtLeast(i3, 2);
                } else {
                    iCoerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(fAbs), 2);
                }
                f3 = iCoerceAtLeast;
            }
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new OptionSideBySideChainHorizontalScrollModifier5(animatable, f3, f, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(Function0 function0, Ref.FloatRef floatRef, Offset offset) {
        function0.invoke();
        floatRef.element = 0.0f;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3(int i, int i2, float f, Animatable animatable, CoroutineScope coroutineScope, Ref.FloatRef floatRef, PointerInputChange change, Offset offset) {
        Intrinsics.checkNotNullParameter(change, "change");
        float fCoerceAtLeast = i <= i2 ? 0.0f : RangesKt.coerceAtLeast(i - i2, 2) * f;
        float f2 = fCoerceAtLeast + 100.0f;
        float fCoerceIn = RangesKt.coerceIn(((Number) animatable.getValue()).floatValue(), -100.0f, f2);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new OptionSideBySideChainHorizontalScrollModifier3(animatable, RangesKt.coerceIn(((Number) animatable.getValue()).floatValue() - (((Number) animatable.getValue()).floatValue() < 0.0f ? (Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)) * ((fCoerceIn + 100.0f) / 100.0f)) / 2.0f : ((Number) animatable.getValue()).floatValue() > fCoerceAtLeast ? (Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)) * ((f2 - fCoerceIn) / 100.0f)) / 2.0f : Float.intBitsToFloat((int) (offset.getPackedValue() >> 32))), -100.0f, f2), null), 3, null);
        if (change.getUptimeMillis() - change.getPreviousUptimeMillis() > 0) {
            floatRef.element = ((-Float.intBitsToFloat((int) (offset.getPackedValue() >> 32))) / (change.getUptimeMillis() - change.getPreviousUptimeMillis())) * 1000;
        }
        return Unit.INSTANCE;
    }
}

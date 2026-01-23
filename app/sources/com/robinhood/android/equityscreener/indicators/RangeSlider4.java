package com.robinhood.android.equityscreener.indicators;

import com.robinhood.android.equityscreener.indicators.RangeSlider2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.Ranges3;

/* compiled from: RangeSlider.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderKt$RangeSlider$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class RangeSlider4 extends FunctionReferenceImpl implements Function1<Float, Float> {
    final /* synthetic */ Ref.FloatRef $maxPx;
    final /* synthetic */ Ref.FloatRef $minPx;
    final /* synthetic */ Ranges3<Float> $range;
    final /* synthetic */ RangeSlider $sliderAlgorithm;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RangeSlider4(RangeSlider rangeSlider, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Ranges3<Float> ranges3) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "invoke$scaleToOffset(Lcom/robinhood/android/equityscreener/indicators/RangeSliderAlgorithm;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/ranges/ClosedFloatingPointRange;F)F", 0);
        this.$sliderAlgorithm = rangeSlider;
        this.$minPx = floatRef;
        this.$maxPx = floatRef2;
        this.$range = ranges3;
    }

    public final Float invoke(float f) {
        return Float.valueOf(RangeSlider2.C157291.invoke$scaleToOffset(this.$sliderAlgorithm, this.$minPx, this.$maxPx, this.$range, f));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}

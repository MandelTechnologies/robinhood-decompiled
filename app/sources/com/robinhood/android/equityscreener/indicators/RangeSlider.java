package com.robinhood.android.equityscreener.indicators;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RangeSlider.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/indicators/RangeSliderAlgorithm;", "", "to", "Lkotlin/Function1;", "", "from", "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getTo", "()Lkotlin/jvm/functions/Function1;", "getFrom", "LINEAR", "LOG", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.indicators.RangeSliderAlgorithm, reason: use source file name */
/* loaded from: classes3.dex */
public final class RangeSlider {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RangeSlider[] $VALUES;
    public static final RangeSlider LINEAR = new RangeSlider("LINEAR", 0, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderAlgorithm$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(RangeSlider._init_$lambda$0(((Float) obj).floatValue()));
        }
    }, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderAlgorithm$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(RangeSlider._init_$lambda$1(((Float) obj).floatValue()));
        }
    });
    public static final RangeSlider LOG = new RangeSlider("LOG", 1, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderAlgorithm$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(RangeSlider._init_$lambda$2(((Float) obj).floatValue()));
        }
    }, new Function1() { // from class: com.robinhood.android.equityscreener.indicators.RangeSliderAlgorithm$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Float.valueOf(RangeSlider._init_$lambda$3(((Float) obj).floatValue()));
        }
    });
    private final Function1<Float, Float> from;
    private final Function1<Float, Float> to;

    private static final /* synthetic */ RangeSlider[] $values() {
        return new RangeSlider[]{LINEAR, LOG};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$0(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$1(float f) {
        return f;
    }

    public static EnumEntries<RangeSlider> getEntries() {
        return $ENTRIES;
    }

    private RangeSlider(String str, int i, Function1 function1, Function1 function12) {
        this.to = function1;
        this.from = function12;
    }

    public final Function1<Float, Float> getTo() {
        return this.to;
    }

    public final Function1<Float, Float> getFrom() {
        return this.from;
    }

    static {
        RangeSlider[] rangeSliderArr$values = $values();
        $VALUES = rangeSliderArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rangeSliderArr$values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$2(float f) {
        return (float) Math.pow(f, 2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float _init_$lambda$3(float f) {
        return (float) Math.pow(f, 0.5f);
    }

    public static RangeSlider valueOf(String str) {
        return (RangeSlider) Enum.valueOf(RangeSlider.class, str);
    }

    public static RangeSlider[] values() {
        return (RangeSlider[]) $VALUES.clone();
    }
}

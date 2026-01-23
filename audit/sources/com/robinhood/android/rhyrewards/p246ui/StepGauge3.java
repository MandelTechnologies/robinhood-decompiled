package com.robinhood.android.rhyrewards.p246ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepGauge.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/GaugeArcType;", "", "<init>", "(Ljava/lang/String;I)V", "STROKE", "FILL", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyrewards.ui.GaugeArcType, reason: use source file name */
/* loaded from: classes5.dex */
final class StepGauge3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StepGauge3[] $VALUES;
    public static final StepGauge3 STROKE = new StepGauge3("STROKE", 0);
    public static final StepGauge3 FILL = new StepGauge3("FILL", 1);

    private static final /* synthetic */ StepGauge3[] $values() {
        return new StepGauge3[]{STROKE, FILL};
    }

    public static EnumEntries<StepGauge3> getEntries() {
        return $ENTRIES;
    }

    private StepGauge3(String str, int i) {
    }

    static {
        StepGauge3[] stepGauge3Arr$values = $values();
        $VALUES = stepGauge3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(stepGauge3Arr$values);
    }

    public static StepGauge3 valueOf(String str) {
        return (StepGauge3) Enum.valueOf(StepGauge3.class, str);
    }

    public static StepGauge3[] values() {
        return (StepGauge3[]) $VALUES.clone();
    }
}

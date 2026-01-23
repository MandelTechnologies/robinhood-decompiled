package com.robinhood.android.trade.options.profitloss.local;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfitAndLossChartGenerator.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/local/Section;", "", "<init>", "(Ljava/lang/String;I)V", "UNSET", "POSITIVE", "NEGATIVE", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.local.Section, reason: use source file name */
/* loaded from: classes9.dex */
final class ProfitAndLossChartGenerator5 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProfitAndLossChartGenerator5[] $VALUES;
    public static final ProfitAndLossChartGenerator5 UNSET = new ProfitAndLossChartGenerator5("UNSET", 0);
    public static final ProfitAndLossChartGenerator5 POSITIVE = new ProfitAndLossChartGenerator5("POSITIVE", 1);
    public static final ProfitAndLossChartGenerator5 NEGATIVE = new ProfitAndLossChartGenerator5("NEGATIVE", 2);

    private static final /* synthetic */ ProfitAndLossChartGenerator5[] $values() {
        return new ProfitAndLossChartGenerator5[]{UNSET, POSITIVE, NEGATIVE};
    }

    public static EnumEntries<ProfitAndLossChartGenerator5> getEntries() {
        return $ENTRIES;
    }

    private ProfitAndLossChartGenerator5(String str, int i) {
    }

    static {
        ProfitAndLossChartGenerator5[] profitAndLossChartGenerator5Arr$values = $values();
        $VALUES = profitAndLossChartGenerator5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(profitAndLossChartGenerator5Arr$values);
    }

    public static ProfitAndLossChartGenerator5 valueOf(String str) {
        return (ProfitAndLossChartGenerator5) Enum.valueOf(ProfitAndLossChartGenerator5.class, str);
    }

    public static ProfitAndLossChartGenerator5[] values() {
        return (ProfitAndLossChartGenerator5[]) $VALUES.clone();
    }
}

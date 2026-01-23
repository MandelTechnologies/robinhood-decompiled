package com.robinhood.shared.chart.contracts.advancedChart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlackWidowAdvancedChartFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "EQUITY", "CRYPTO", "FUTURES_CONTRACT", "FUTURES_PRODUCT", "isFuturesInstrument", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.chart.contracts.advancedChart.BwAdvanceChartInstrumentType, reason: use source file name */
/* loaded from: classes26.dex */
public final class BlackWidowAdvancedChartFragmentKey2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlackWidowAdvancedChartFragmentKey2[] $VALUES;
    public static final BlackWidowAdvancedChartFragmentKey2 EQUITY = new BlackWidowAdvancedChartFragmentKey2("EQUITY", 0);
    public static final BlackWidowAdvancedChartFragmentKey2 CRYPTO = new BlackWidowAdvancedChartFragmentKey2("CRYPTO", 1);
    public static final BlackWidowAdvancedChartFragmentKey2 FUTURES_CONTRACT = new BlackWidowAdvancedChartFragmentKey2("FUTURES_CONTRACT", 2);
    public static final BlackWidowAdvancedChartFragmentKey2 FUTURES_PRODUCT = new BlackWidowAdvancedChartFragmentKey2("FUTURES_PRODUCT", 3);

    private static final /* synthetic */ BlackWidowAdvancedChartFragmentKey2[] $values() {
        return new BlackWidowAdvancedChartFragmentKey2[]{EQUITY, CRYPTO, FUTURES_CONTRACT, FUTURES_PRODUCT};
    }

    public static EnumEntries<BlackWidowAdvancedChartFragmentKey2> getEntries() {
        return $ENTRIES;
    }

    private BlackWidowAdvancedChartFragmentKey2(String str, int i) {
    }

    static {
        BlackWidowAdvancedChartFragmentKey2[] blackWidowAdvancedChartFragmentKey2Arr$values = $values();
        $VALUES = blackWidowAdvancedChartFragmentKey2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(blackWidowAdvancedChartFragmentKey2Arr$values);
    }

    public final boolean isFuturesInstrument() {
        return this == FUTURES_PRODUCT || this == FUTURES_CONTRACT;
    }

    public static BlackWidowAdvancedChartFragmentKey2 valueOf(String str) {
        return (BlackWidowAdvancedChartFragmentKey2) Enum.valueOf(BlackWidowAdvancedChartFragmentKey2.class, str);
    }

    public static BlackWidowAdvancedChartFragmentKey2[] values() {
        return (BlackWidowAdvancedChartFragmentKey2[]) $VALUES.clone();
    }
}

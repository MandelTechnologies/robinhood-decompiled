package com.robinhood.android.equitytradeladder.bin;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityTradeLadderBinManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/bin/BinIntervals;", "", "intervals", "", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getIntervals", "()Ljava/util/List;", "PENNY_STOCK", "STANDARD", "HIGH_PRICE", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.bin.BinIntervals, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderBinManager2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityTradeLadderBinManager2[] $VALUES;
    private final List<BigDecimal> intervals;
    public static final EquityTradeLadderBinManager2 PENNY_STOCK = new EquityTradeLadderBinManager2("PENNY_STOCK", 0, EquityTradeLadderBinManager3.getPENNY_STOCK_INTERVALS());
    public static final EquityTradeLadderBinManager2 STANDARD = new EquityTradeLadderBinManager2("STANDARD", 1, EquityTradeLadderBinManager3.getSTANDARD_INTERVALS());
    public static final EquityTradeLadderBinManager2 HIGH_PRICE = new EquityTradeLadderBinManager2("HIGH_PRICE", 2, EquityTradeLadderBinManager3.getSTANDARD_INTERVALS());

    private static final /* synthetic */ EquityTradeLadderBinManager2[] $values() {
        return new EquityTradeLadderBinManager2[]{PENNY_STOCK, STANDARD, HIGH_PRICE};
    }

    public static EnumEntries<EquityTradeLadderBinManager2> getEntries() {
        return $ENTRIES;
    }

    private EquityTradeLadderBinManager2(String str, int i, List list) {
        this.intervals = list;
    }

    public final List<BigDecimal> getIntervals() {
        return this.intervals;
    }

    static {
        EquityTradeLadderBinManager2[] equityTradeLadderBinManager2Arr$values = $values();
        $VALUES = equityTradeLadderBinManager2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityTradeLadderBinManager2Arr$values);
    }

    public static EquityTradeLadderBinManager2 valueOf(String str) {
        return (EquityTradeLadderBinManager2) Enum.valueOf(EquityTradeLadderBinManager2.class, str);
    }

    public static EquityTradeLadderBinManager2[] values() {
        return (EquityTradeLadderBinManager2[]) $VALUES.clone();
    }
}

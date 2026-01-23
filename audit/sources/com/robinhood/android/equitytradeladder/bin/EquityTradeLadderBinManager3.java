package com.robinhood.android.equitytradeladder.bin;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: EquityTradeLadderBinManager.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"PENNY_STOCK_INTERVALS", "", "Ljava/math/BigDecimal;", "getPENNY_STOCK_INTERVALS", "()Ljava/util/List;", "STANDARD_INTERVALS", "getSTANDARD_INTERVALS", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.bin.EquityTradeLadderBinManagerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityTradeLadderBinManager3 {
    private static final List<BigDecimal> PENNY_STOCK_INTERVALS = CollectionsKt.listOf((Object[]) new BigDecimal[]{new BigDecimal("0.01"), new BigDecimal("0.02"), new BigDecimal("0.05"), new BigDecimal("0.25"), new BigDecimal("0.50")});
    private static final List<BigDecimal> STANDARD_INTERVALS = CollectionsKt.listOf((Object[]) new BigDecimal[]{new BigDecimal("0.01"), new BigDecimal("0.02"), new BigDecimal("0.05"), new BigDecimal("0.25"), new BigDecimal("0.50"), new BigDecimal("1.00"), new BigDecimal("1.50"), new BigDecimal("2.00"), new BigDecimal("2.50"), new BigDecimal("5.00")});

    public static final List<BigDecimal> getPENNY_STOCK_INTERVALS() {
        return PENNY_STOCK_INTERVALS;
    }

    public static final List<BigDecimal> getSTANDARD_INTERVALS() {
        return STANDARD_INTERVALS;
    }
}

package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PortfolioHoldings.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "", "<init>", "(Ljava/lang/String;I)V", "PERCENT", "DOLLAR", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.ViewMode, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioHoldings3 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioHoldings3[] $VALUES;
    public static final PortfolioHoldings3 PERCENT = new PortfolioHoldings3("PERCENT", 0);
    public static final PortfolioHoldings3 DOLLAR = new PortfolioHoldings3("DOLLAR", 1);

    private static final /* synthetic */ PortfolioHoldings3[] $values() {
        return new PortfolioHoldings3[]{PERCENT, DOLLAR};
    }

    public static EnumEntries<PortfolioHoldings3> getEntries() {
        return $ENTRIES;
    }

    private PortfolioHoldings3(String str, int i) {
    }

    static {
        PortfolioHoldings3[] portfolioHoldings3Arr$values = $values();
        $VALUES = portfolioHoldings3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioHoldings3Arr$values);
    }

    public static PortfolioHoldings3 valueOf(String str) {
        return (PortfolioHoldings3) Enum.valueOf(PortfolioHoldings3.class, str);
    }

    public static PortfolioHoldings3[] values() {
        return (PortfolioHoldings3[]) $VALUES.clone();
    }
}

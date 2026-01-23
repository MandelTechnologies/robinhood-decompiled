package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PortfolioHoldingsViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;", "", "<init>", "(Ljava/lang/String;I)V", "ADJUST_PORTFOLIO_CTA_ONLY", "FULL_ACCOUNT_SECTION", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.AccountConfigStyle, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioHoldingsViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioHoldingsViewState2[] $VALUES;
    public static final PortfolioHoldingsViewState2 ADJUST_PORTFOLIO_CTA_ONLY = new PortfolioHoldingsViewState2("ADJUST_PORTFOLIO_CTA_ONLY", 0);
    public static final PortfolioHoldingsViewState2 FULL_ACCOUNT_SECTION = new PortfolioHoldingsViewState2("FULL_ACCOUNT_SECTION", 1);

    private static final /* synthetic */ PortfolioHoldingsViewState2[] $values() {
        return new PortfolioHoldingsViewState2[]{ADJUST_PORTFOLIO_CTA_ONLY, FULL_ACCOUNT_SECTION};
    }

    public static EnumEntries<PortfolioHoldingsViewState2> getEntries() {
        return $ENTRIES;
    }

    private PortfolioHoldingsViewState2(String str, int i) {
    }

    static {
        PortfolioHoldingsViewState2[] portfolioHoldingsViewState2Arr$values = $values();
        $VALUES = portfolioHoldingsViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioHoldingsViewState2Arr$values);
    }

    public static PortfolioHoldingsViewState2 valueOf(String str) {
        return (PortfolioHoldingsViewState2) Enum.valueOf(PortfolioHoldingsViewState2.class, str);
    }

    public static PortfolioHoldingsViewState2[] values() {
        return (PortfolioHoldingsViewState2[]) $VALUES.clone();
    }
}

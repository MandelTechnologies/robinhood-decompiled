package com.robinhood.android.retirement.p239ui.funded;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DashboardSectionKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/DashboardSectionKey;", "", "<init>", "(Ljava/lang/String;I)V", "Header", "Chart", "ChartFooter", "Disclosure", "RecurringSection", "FeatureDiscovery", "PortfolioHoldings", "InsightsSections", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DashboardSectionKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DashboardSectionKey[] $VALUES;
    public static final DashboardSectionKey Header = new DashboardSectionKey("Header", 0);
    public static final DashboardSectionKey Chart = new DashboardSectionKey("Chart", 1);
    public static final DashboardSectionKey ChartFooter = new DashboardSectionKey("ChartFooter", 2);
    public static final DashboardSectionKey Disclosure = new DashboardSectionKey("Disclosure", 3);
    public static final DashboardSectionKey RecurringSection = new DashboardSectionKey("RecurringSection", 4);
    public static final DashboardSectionKey FeatureDiscovery = new DashboardSectionKey("FeatureDiscovery", 5);
    public static final DashboardSectionKey PortfolioHoldings = new DashboardSectionKey("PortfolioHoldings", 6);
    public static final DashboardSectionKey InsightsSections = new DashboardSectionKey("InsightsSections", 7);

    private static final /* synthetic */ DashboardSectionKey[] $values() {
        return new DashboardSectionKey[]{Header, Chart, ChartFooter, Disclosure, RecurringSection, FeatureDiscovery, PortfolioHoldings, InsightsSections};
    }

    public static EnumEntries<DashboardSectionKey> getEntries() {
        return $ENTRIES;
    }

    private DashboardSectionKey(String str, int i) {
    }

    static {
        DashboardSectionKey[] dashboardSectionKeyArr$values = $values();
        $VALUES = dashboardSectionKeyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(dashboardSectionKeyArr$values);
    }

    public static DashboardSectionKey valueOf(String str) {
        return (DashboardSectionKey) Enum.valueOf(DashboardSectionKey.class, str);
    }

    public static DashboardSectionKey[] values() {
        return (DashboardSectionKey[]) $VALUES.clone();
    }
}

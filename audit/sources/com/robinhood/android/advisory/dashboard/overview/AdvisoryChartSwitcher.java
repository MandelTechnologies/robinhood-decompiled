package com.robinhood.android.advisory.dashboard.overview;

import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.C20690R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisoryChartSwitcher.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/dashboard/overview/AdvisoryChart;", "", "<init>", "(Ljava/lang/String;I)V", "PERFORMANCE", "PORTFOLIO", "RETURNS", "icon", "", "getIcon$lib_advisory_dashboard_externalDebug", "()I", "contentDescription", "getContentDescription$lib_advisory_dashboard_externalDebug", "loggingIdentifier", "", "getLoggingIdentifier$lib_advisory_dashboard_externalDebug", "()Ljava/lang/String;", "rotate180", "", "getRotate180$lib_advisory_dashboard_externalDebug", "()Z", "flipXAxis", "getFlipXAxis$lib_advisory_dashboard_externalDebug", "lib-advisory-dashboard_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisoryChart, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryChartSwitcher {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisoryChartSwitcher[] $VALUES;
    public static final AdvisoryChartSwitcher PERFORMANCE = new AdvisoryChartSwitcher("PERFORMANCE", 0);
    public static final AdvisoryChartSwitcher PORTFOLIO = new AdvisoryChartSwitcher("PORTFOLIO", 1);
    public static final AdvisoryChartSwitcher RETURNS = new AdvisoryChartSwitcher("RETURNS", 2);

    /* compiled from: AdvisoryChartSwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.AdvisoryChart$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdvisoryChartSwitcher.values().length];
            try {
                iArr[AdvisoryChartSwitcher.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvisoryChartSwitcher.PORTFOLIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvisoryChartSwitcher.RETURNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AdvisoryChartSwitcher[] $values() {
        return new AdvisoryChartSwitcher[]{PERFORMANCE, PORTFOLIO, RETURNS};
    }

    public static EnumEntries<AdvisoryChartSwitcher> getEntries() {
        return $ENTRIES;
    }

    private AdvisoryChartSwitcher(String str, int i) {
    }

    static {
        AdvisoryChartSwitcher[] advisoryChartSwitcherArr$values = $values();
        $VALUES = advisoryChartSwitcherArr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisoryChartSwitcherArr$values);
    }

    public final int getIcon$lib_advisory_dashboard_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return C20690R.drawable.pict_mono_rds_investing;
        }
        if (i == 2) {
            return C20690R.drawable.pict_mono_rds_pie_chart;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C20690R.drawable.pict_mono_rds_bar_chart;
    }

    public final int getContentDescription$lib_advisory_dashboard_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return C8626R.string.content_description_performance_chart;
        }
        if (i == 2) {
            return C8626R.string.content_description_portfolio_chart;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C8626R.string.content_description_top_returns_chart;
    }

    public final String getLoggingIdentifier$lib_advisory_dashboard_externalDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "performance";
        }
        if (i == 2) {
            return AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "returns";
    }

    public final boolean getRotate180$lib_advisory_dashboard_externalDebug() {
        return this == PORTFOLIO;
    }

    public final boolean getFlipXAxis$lib_advisory_dashboard_externalDebug() {
        return this == RETURNS;
    }

    public static AdvisoryChartSwitcher valueOf(String str) {
        return (AdvisoryChartSwitcher) Enum.valueOf(AdvisoryChartSwitcher.class, str);
    }

    public static AdvisoryChartSwitcher[] values() {
        return (AdvisoryChartSwitcher[]) $VALUES.clone();
    }
}

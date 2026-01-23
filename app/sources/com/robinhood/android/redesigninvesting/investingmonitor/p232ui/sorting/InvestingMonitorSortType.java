package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.sorting;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.redesigninvesting.investingmonitor.C26507R;
import com.robinhood.models.api.ApiCuratedList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InvestingMonitorSortType.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018j\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/investingmonitor/ui/sorting/InvestingMonitorSortType;", "", AnnotatedPrivateKey.LABEL, "", "analyticsName", "", "sortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "<init>", "(Ljava/lang/String;IILjava/lang/String;Lcom/robinhood/models/api/ApiCuratedList$SortOrder;)V", "getLabel", "()I", "getAnalyticsName", "()Ljava/lang/String;", "getSortOrder", "()Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "SYMBOL", "CHART", "ONE_DAY_CHANGE", "PRICE", "CUSTOM", "noIcon", "", "getNoIcon", "()Z", "feature-investing-monitor_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class InvestingMonitorSortType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InvestingMonitorSortType[] $VALUES;
    private final String analyticsName;
    private final int label;
    private final ApiCuratedList.SortOrder sortOrder;
    public static final InvestingMonitorSortType SYMBOL = new InvestingMonitorSortType("SYMBOL", 0, C26507R.string.investing_monitor_sorting_symbol, "symbol", ApiCuratedList.SortOrder.SYMBOL);
    public static final InvestingMonitorSortType CHART = new InvestingMonitorSortType("CHART", 1, C26507R.string.investing_monitor_sorting_chart, "TODO", ApiCuratedList.SortOrder.UNKNOWN);
    public static final InvestingMonitorSortType ONE_DAY_CHANGE = new InvestingMonitorSortType("ONE_DAY_CHANGE", 2, C26507R.string.investing_monitor_sorting_1d_change, "1d_change", ApiCuratedList.SortOrder.ONE_DAY_PERCENT_CHANGE);
    public static final InvestingMonitorSortType PRICE = new InvestingMonitorSortType("PRICE", 3, C26507R.string.investing_monitor_sorting_price, AnalyticsStrings.TAG_SORT_ORDER_PRICE, ApiCuratedList.SortOrder.PRICE);
    public static final InvestingMonitorSortType CUSTOM = new InvestingMonitorSortType("CUSTOM", 4, C26507R.string.investing_monitor_sorting_custom, "custom", ApiCuratedList.SortOrder.CUSTOM);

    private static final /* synthetic */ InvestingMonitorSortType[] $values() {
        return new InvestingMonitorSortType[]{SYMBOL, CHART, ONE_DAY_CHANGE, PRICE, CUSTOM};
    }

    public static EnumEntries<InvestingMonitorSortType> getEntries() {
        return $ENTRIES;
    }

    private InvestingMonitorSortType(String str, int i, int i2, String str2, ApiCuratedList.SortOrder sortOrder) {
        this.label = i2;
        this.analyticsName = str2;
        this.sortOrder = sortOrder;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final ApiCuratedList.SortOrder getSortOrder() {
        return this.sortOrder;
    }

    static {
        InvestingMonitorSortType[] investingMonitorSortTypeArr$values = $values();
        $VALUES = investingMonitorSortTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(investingMonitorSortTypeArr$values);
    }

    public final boolean getNoIcon() {
        return this == CHART;
    }

    public static InvestingMonitorSortType valueOf(String str) {
        return (InvestingMonitorSortType) Enum.valueOf(InvestingMonitorSortType.class, str);
    }

    public static InvestingMonitorSortType[] values() {
        return (InvestingMonitorSortType[]) $VALUES.clone();
    }
}

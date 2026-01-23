package com.robinhood.store.futures.marketdata;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketdataPollLocation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/futures/marketdata/MarketdataPollLocation;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "ORDER_FORM", "EDP", "FDP", "INVEST_TAB", "BRACKET", "HUB", "SEARCH_HIGHLIGHTS", "DEFAULT", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MarketdataPollLocation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarketdataPollLocation[] $VALUES;
    private final String serverValue;
    public static final MarketdataPollLocation ORDER_FORM = new MarketdataPollLocation("ORDER_FORM", 0, "orderform");
    public static final MarketdataPollLocation EDP = new MarketdataPollLocation("EDP", 1, "edp");
    public static final MarketdataPollLocation FDP = new MarketdataPollLocation("FDP", 2, "fdp");
    public static final MarketdataPollLocation INVEST_TAB = new MarketdataPollLocation("INVEST_TAB", 3, "investtab");
    public static final MarketdataPollLocation BRACKET = new MarketdataPollLocation("BRACKET", 4, "bracket");
    public static final MarketdataPollLocation HUB = new MarketdataPollLocation("HUB", 5, "eventshub");
    public static final MarketdataPollLocation SEARCH_HIGHLIGHTS = new MarketdataPollLocation("SEARCH_HIGHLIGHTS", 6, "searchhighlights");
    public static final MarketdataPollLocation DEFAULT = new MarketdataPollLocation("DEFAULT", 7, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT);

    private static final /* synthetic */ MarketdataPollLocation[] $values() {
        return new MarketdataPollLocation[]{ORDER_FORM, EDP, FDP, INVEST_TAB, BRACKET, HUB, SEARCH_HIGHLIGHTS, DEFAULT};
    }

    public static EnumEntries<MarketdataPollLocation> getEntries() {
        return $ENTRIES;
    }

    private MarketdataPollLocation(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        MarketdataPollLocation[] marketdataPollLocationArr$values = $values();
        $VALUES = marketdataPollLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(marketdataPollLocationArr$values);
    }

    public static MarketdataPollLocation valueOf(String str) {
        return (MarketdataPollLocation) Enum.valueOf(MarketdataPollLocation.class, str);
    }

    public static MarketdataPollLocation[] values() {
        return (MarketdataPollLocation[]) $VALUES.clone();
    }
}

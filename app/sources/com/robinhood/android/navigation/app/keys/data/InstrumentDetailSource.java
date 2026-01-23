package com.robinhood.android.navigation.app.keys.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.advisory.dashboard.overview.LoadedManagedDashboardOverview;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.contracts.ScreenerTableKeys2;
import com.robinhood.android.search.highlights.util.SearchHighlightsAnalytics;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstrumentDetailSource.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b3\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 >2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001>B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000208R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "Landroid/os/Parcelable;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "HOME_TAB_LIST", "HOME_TAB_POSITIONS", "CURATED_LIST_DETAIL", "USER_LIST_DETAIL", "REDESIGN_PORTFOLIO_ACCOUNT", "REDESIGN_PORTFOLIO_WATCHLIST", "RETIREMENT_TAB_POSITIONS", "ISA_TAB_POSITIONS", "CRYPTO_HOME_POSITIONS", "CRYPTO_HOME_NEWS", "CRYPTO_NEWS", "SEARCH", "NEWS_FEED", "SLIP_HUB", "PRICE_MOVEMENT", "EARNINGS_UPCOMING", "EARNINGS_ANNOUNCED", "ADVANCED_ALERT_ANNOUNCED", "SCREENER", "ASSET_HOME", "MANAGED_PORTFOLIO_BREAKDOWN", "TRADING_TRENDS_ONBOARDING", "COMPANY_FINANCIALS_ONBOARDING", "ETP_COMPOSITION", "ANALYST_REPORT", "SIMILAR_INSTRUMENTS", "EARNINGS", "ASSET_NEWS", "SDP_TRADE_BAR", "OPTIONS_DETAIL", "OPTIONS_ORDER_DETAIL", "OPTIONS_SIMULATED_RETURNS", "HISTORY_DETAIL", "ADVANCED_CHART", "IPOA_SUMMARY", "DEEPLINK_EARNINGS_QA", "DEEPLINK_STOCKS", "DEEPLINK_TRADING_TRENDS", "DEEPLINK_INSTRUMENT", "INVESTING_MONITOR", "COPILOT_DIGEST_ONBOARDING", "BREAKING_NEWS", "COMBO_ORDER", "OPTION_PORTFOLIO_RISK_ANALYZER", "SEARCH_HIGHLIGHTS", "NONE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstrumentDetailSource implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentDetailSource[] $VALUES;
    public static final Parcelable.Creator<InstrumentDetailSource> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, InstrumentDetailSource> MAPPINGS;
    private final String serverValue;
    public static final InstrumentDetailSource HOME_TAB_LIST = new InstrumentDetailSource("HOME_TAB_LIST", 0, "home_tab_list");
    public static final InstrumentDetailSource HOME_TAB_POSITIONS = new InstrumentDetailSource("HOME_TAB_POSITIONS", 1, "home_tab");
    public static final InstrumentDetailSource CURATED_LIST_DETAIL = new InstrumentDetailSource("CURATED_LIST_DETAIL", 2, "collection_list");
    public static final InstrumentDetailSource USER_LIST_DETAIL = new InstrumentDetailSource("USER_LIST_DETAIL", 3, "collection_list");
    public static final InstrumentDetailSource REDESIGN_PORTFOLIO_ACCOUNT = new InstrumentDetailSource("REDESIGN_PORTFOLIO_ACCOUNT", 4, "redesign_portfolio_account");
    public static final InstrumentDetailSource REDESIGN_PORTFOLIO_WATCHLIST = new InstrumentDetailSource("REDESIGN_PORTFOLIO_WATCHLIST", 5, "redesign_portfolio_watchlist");
    public static final InstrumentDetailSource RETIREMENT_TAB_POSITIONS = new InstrumentDetailSource("RETIREMENT_TAB_POSITIONS", 6, "retirement_tab");
    public static final InstrumentDetailSource ISA_TAB_POSITIONS = new InstrumentDetailSource("ISA_TAB_POSITIONS", 7, "isa_tab");
    public static final InstrumentDetailSource CRYPTO_HOME_POSITIONS = new InstrumentDetailSource("CRYPTO_HOME_POSITIONS", 8, "crypto_home_positions");
    public static final InstrumentDetailSource CRYPTO_HOME_NEWS = new InstrumentDetailSource("CRYPTO_HOME_NEWS", 9, "crypto_home_news");
    public static final InstrumentDetailSource CRYPTO_NEWS = new InstrumentDetailSource("CRYPTO_NEWS", 10, "crypto_news");
    public static final InstrumentDetailSource SEARCH = new InstrumentDetailSource("SEARCH", 11, "search");
    public static final InstrumentDetailSource NEWS_FEED = new InstrumentDetailSource("NEWS_FEED", 12, "feed_news");
    public static final InstrumentDetailSource SLIP_HUB = new InstrumentDetailSource("SLIP_HUB", 13, "slip_hub");
    public static final InstrumentDetailSource PRICE_MOVEMENT = new InstrumentDetailSource("PRICE_MOVEMENT", 14, "price_movement");
    public static final InstrumentDetailSource EARNINGS_UPCOMING = new InstrumentDetailSource("EARNINGS_UPCOMING", 15, "earnings_upcoming");
    public static final InstrumentDetailSource EARNINGS_ANNOUNCED = new InstrumentDetailSource("EARNINGS_ANNOUNCED", 16, "earnings_announced");
    public static final InstrumentDetailSource ADVANCED_ALERT_ANNOUNCED = new InstrumentDetailSource("ADVANCED_ALERT_ANNOUNCED", 17, "advanced_alert_announced");
    public static final InstrumentDetailSource SCREENER = new InstrumentDetailSource("SCREENER", 18, "screener");
    public static final InstrumentDetailSource ASSET_HOME = new InstrumentDetailSource("ASSET_HOME", 19, ScreenerTableKeys2.AssetHome);
    public static final InstrumentDetailSource MANAGED_PORTFOLIO_BREAKDOWN = new InstrumentDetailSource("MANAGED_PORTFOLIO_BREAKDOWN", 20, LoadedManagedDashboardOverview.PortfolioBreakdownTestTag);
    public static final InstrumentDetailSource TRADING_TRENDS_ONBOARDING = new InstrumentDetailSource("TRADING_TRENDS_ONBOARDING", 21, "trading_trends_onboarding");
    public static final InstrumentDetailSource COMPANY_FINANCIALS_ONBOARDING = new InstrumentDetailSource("COMPANY_FINANCIALS_ONBOARDING", 22, "company_financials_onboarding");
    public static final InstrumentDetailSource ETP_COMPOSITION = new InstrumentDetailSource("ETP_COMPOSITION", 23, "etp_composition");
    public static final InstrumentDetailSource ANALYST_REPORT = new InstrumentDetailSource("ANALYST_REPORT", 24, "analyst_report");
    public static final InstrumentDetailSource SIMILAR_INSTRUMENTS = new InstrumentDetailSource("SIMILAR_INSTRUMENTS", 25, AnalyticsStrings.BUTTON_TITLE_PEOPLE_ALSO_BOUGHT);
    public static final InstrumentDetailSource EARNINGS = new InstrumentDetailSource("EARNINGS", 26, "earnings");
    public static final InstrumentDetailSource ASSET_NEWS = new InstrumentDetailSource("ASSET_NEWS", 27, "asset_news");
    public static final InstrumentDetailSource SDP_TRADE_BAR = new InstrumentDetailSource("SDP_TRADE_BAR", 28, "sdp_trade_bar");
    public static final InstrumentDetailSource OPTIONS_DETAIL = new InstrumentDetailSource("OPTIONS_DETAIL", 29, "option_position_detail");
    public static final InstrumentDetailSource OPTIONS_ORDER_DETAIL = new InstrumentDetailSource("OPTIONS_ORDER_DETAIL", 30, "option_order_detail");
    public static final InstrumentDetailSource OPTIONS_SIMULATED_RETURNS = new InstrumentDetailSource("OPTIONS_SIMULATED_RETURNS", 31, "options_simulated_returns");
    public static final InstrumentDetailSource HISTORY_DETAIL = new InstrumentDetailSource("HISTORY_DETAIL", 32, "equity_order_detail");
    public static final InstrumentDetailSource ADVANCED_CHART = new InstrumentDetailSource("ADVANCED_CHART", 33, "advanced_chart");
    public static final InstrumentDetailSource IPOA_SUMMARY = new InstrumentDetailSource("IPOA_SUMMARY", 34, "ipo_access_summary");
    public static final InstrumentDetailSource DEEPLINK_EARNINGS_QA = new InstrumentDetailSource("DEEPLINK_EARNINGS_QA", 35, "deeplink_earnings_qa");
    public static final InstrumentDetailSource DEEPLINK_STOCKS = new InstrumentDetailSource("DEEPLINK_STOCKS", 36, "deeplink_stocks");
    public static final InstrumentDetailSource DEEPLINK_TRADING_TRENDS = new InstrumentDetailSource("DEEPLINK_TRADING_TRENDS", 37, "deeplink_trading_trends");
    public static final InstrumentDetailSource DEEPLINK_INSTRUMENT = new InstrumentDetailSource("DEEPLINK_INSTRUMENT", 38, "deeplink_instrument");
    public static final InstrumentDetailSource INVESTING_MONITOR = new InstrumentDetailSource("INVESTING_MONITOR", 39, AnalyticsStrings.TAB_NAV_TAB_BAR_MONITOR);
    public static final InstrumentDetailSource COPILOT_DIGEST_ONBOARDING = new InstrumentDetailSource("COPILOT_DIGEST_ONBOARDING", 40, "copilot_digest_onboarding");
    public static final InstrumentDetailSource BREAKING_NEWS = new InstrumentDetailSource("BREAKING_NEWS", 41, CryptoDetailSource.BREAKING_NEWS);
    public static final InstrumentDetailSource COMBO_ORDER = new InstrumentDetailSource("COMBO_ORDER", 42, "combo_order");
    public static final InstrumentDetailSource OPTION_PORTFOLIO_RISK_ANALYZER = new InstrumentDetailSource("OPTION_PORTFOLIO_RISK_ANALYZER", 43, "option_portfolio_risk_analyzer");
    public static final InstrumentDetailSource SEARCH_HIGHLIGHTS = new InstrumentDetailSource("SEARCH_HIGHLIGHTS", 44, SearchHighlightsAnalytics.SEARCH_HIGHLIGHTS_ENTRYPOINT);
    public static final InstrumentDetailSource NONE = new InstrumentDetailSource("NONE", 45, "");

    private static final /* synthetic */ InstrumentDetailSource[] $values() {
        return new InstrumentDetailSource[]{HOME_TAB_LIST, HOME_TAB_POSITIONS, CURATED_LIST_DETAIL, USER_LIST_DETAIL, REDESIGN_PORTFOLIO_ACCOUNT, REDESIGN_PORTFOLIO_WATCHLIST, RETIREMENT_TAB_POSITIONS, ISA_TAB_POSITIONS, CRYPTO_HOME_POSITIONS, CRYPTO_HOME_NEWS, CRYPTO_NEWS, SEARCH, NEWS_FEED, SLIP_HUB, PRICE_MOVEMENT, EARNINGS_UPCOMING, EARNINGS_ANNOUNCED, ADVANCED_ALERT_ANNOUNCED, SCREENER, ASSET_HOME, MANAGED_PORTFOLIO_BREAKDOWN, TRADING_TRENDS_ONBOARDING, COMPANY_FINANCIALS_ONBOARDING, ETP_COMPOSITION, ANALYST_REPORT, SIMILAR_INSTRUMENTS, EARNINGS, ASSET_NEWS, SDP_TRADE_BAR, OPTIONS_DETAIL, OPTIONS_ORDER_DETAIL, OPTIONS_SIMULATED_RETURNS, HISTORY_DETAIL, ADVANCED_CHART, IPOA_SUMMARY, DEEPLINK_EARNINGS_QA, DEEPLINK_STOCKS, DEEPLINK_TRADING_TRENDS, DEEPLINK_INSTRUMENT, INVESTING_MONITOR, COPILOT_DIGEST_ONBOARDING, BREAKING_NEWS, COMBO_ORDER, OPTION_PORTFOLIO_RISK_ANALYZER, SEARCH_HIGHLIGHTS, NONE};
    }

    @JvmStatic
    public static final InstrumentDetailSource fromServerValue(String str, InstrumentDetailSource instrumentDetailSource) {
        return INSTANCE.fromServerValue(str, instrumentDetailSource);
    }

    public static EnumEntries<InstrumentDetailSource> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    private InstrumentDetailSource(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        InstrumentDetailSource[] instrumentDetailSourceArr$values = $values();
        $VALUES = instrumentDetailSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instrumentDetailSourceArr$values);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<InstrumentDetailSource>() { // from class: com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentDetailSource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return InstrumentDetailSource.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentDetailSource[] newArray(int i) {
                return new InstrumentDetailSource[i];
            }
        };
        EnumEntries<InstrumentDetailSource> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
        for (InstrumentDetailSource instrumentDetailSource : entries) {
            linkedHashMap.put(instrumentDetailSource.serverValue, instrumentDetailSource);
        }
        MAPPINGS = linkedHashMap;
    }

    /* compiled from: InstrumentDetailSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource$Companion;", "", "<init>", "()V", "MAPPINGS", "", "", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "fromServerValue", "serverValue", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ InstrumentDetailSource fromServerValue$default(Companion companion, String str, InstrumentDetailSource instrumentDetailSource, int i, Object obj) {
            if ((i & 2) != 0) {
                instrumentDetailSource = InstrumentDetailSource.NONE;
            }
            return companion.fromServerValue(str, instrumentDetailSource);
        }

        @JvmStatic
        public final InstrumentDetailSource fromServerValue(String serverValue, InstrumentDetailSource instrumentDetailSource) {
            InstrumentDetailSource instrumentDetailSource2;
            Intrinsics.checkNotNullParameter(instrumentDetailSource, "default");
            return (serverValue == null || (instrumentDetailSource2 = (InstrumentDetailSource) InstrumentDetailSource.MAPPINGS.get(serverValue)) == null) ? instrumentDetailSource : instrumentDetailSource2;
        }
    }

    public static InstrumentDetailSource valueOf(String str) {
        return (InstrumentDetailSource) Enum.valueOf(InstrumentDetailSource.class, str);
    }

    public static InstrumentDetailSource[] values() {
        return (InstrumentDetailSource[]) $VALUES.clone();
    }
}

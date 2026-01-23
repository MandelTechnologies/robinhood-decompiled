package com.robinhood.android.trading.contracts;

import com.robinhood.android.slip.onboarding.hub.SlipHubComposable3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EquityOrderFlowSource.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "", "loggingValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingValue", "()Ljava/lang/String;", "SDP_TRADE_BAR", "OPTION_EXERCISE", "RECURRING_FLOW_COMPLETION", "ORDER_SUBMIT_NOTIFICATION", "ORDER_DETAIL_IPO_EDIT", "ORDER_DETAIL_EXTEND", SlipHubComposable3.INSTRUMENT_ROW_TEST_TAG, "DEEPLINK_INSTRUMENT", "DEEPLINK_IPO_ENTER_ORDER", "DEEPLINK_IPO_PLACE_PRE_IPO_ORDER", "EQUITY_ORDER_WITH_SYMBOL_ACTIVITY", "ANALYST_REPORT", "FRACTIONAL_NUX_BOTTOM_SHEET", "LEVEL_2_MARKET_DATA", "ADVANCED_CHART", "BW_ADVANCED_CHART", "CANCEL_NEW_HISTORY", "REDESIGN_PORTFOLIO", "LADDER", "WATCHLIST_TAB", "WATCHLIST_ROW", "MAINTENANCE_CALL", "isInstrumentRow", "", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EquityOrderFlowSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EquityOrderFlowSource[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String loggingValue;
    public static final EquityOrderFlowSource SDP_TRADE_BAR = new EquityOrderFlowSource("SDP_TRADE_BAR", 0, "STOCK_DETAIL_PAGE_TRADE_BAR");
    public static final EquityOrderFlowSource OPTION_EXERCISE = new EquityOrderFlowSource("OPTION_EXERCISE", 1, "OPTION-EXERCISE");
    public static final EquityOrderFlowSource RECURRING_FLOW_COMPLETION = new EquityOrderFlowSource("RECURRING_FLOW_COMPLETION", 2, "RECURRING-FLOW-COMPLETION");
    public static final EquityOrderFlowSource ORDER_SUBMIT_NOTIFICATION = new EquityOrderFlowSource("ORDER_SUBMIT_NOTIFICATION", 3, "ORDER-SUBMIT-NOTIFICATION");
    public static final EquityOrderFlowSource ORDER_DETAIL_IPO_EDIT = new EquityOrderFlowSource("ORDER_DETAIL_IPO_EDIT", 4, "PRE_IPO");
    public static final EquityOrderFlowSource ORDER_DETAIL_EXTEND = new EquityOrderFlowSource("ORDER_DETAIL_EXTEND", 5, "EXTEND_ORDER");
    public static final EquityOrderFlowSource INSTRUMENT_ROW = new EquityOrderFlowSource(SlipHubComposable3.INSTRUMENT_ROW_TEST_TAG, 6, SlipHubComposable3.INSTRUMENT_ROW_TEST_TAG);
    public static final EquityOrderFlowSource DEEPLINK_INSTRUMENT = new EquityOrderFlowSource("DEEPLINK_INSTRUMENT", 7, "DEEPLINK");
    public static final EquityOrderFlowSource DEEPLINK_IPO_ENTER_ORDER = new EquityOrderFlowSource("DEEPLINK_IPO_ENTER_ORDER", 8, "DEEPLINK-IPO-ENTER-ORDER");
    public static final EquityOrderFlowSource DEEPLINK_IPO_PLACE_PRE_IPO_ORDER = new EquityOrderFlowSource("DEEPLINK_IPO_PLACE_PRE_IPO_ORDER", 9, "DEEPLINK-IPO-PLACE-PRE-IPO-ORDER");
    public static final EquityOrderFlowSource EQUITY_ORDER_WITH_SYMBOL_ACTIVITY = new EquityOrderFlowSource("EQUITY_ORDER_WITH_SYMBOL_ACTIVITY", 10, "EQUITY-ORDER-WITH-SYMBOL-ACTIVITY");
    public static final EquityOrderFlowSource ANALYST_REPORT = new EquityOrderFlowSource("ANALYST_REPORT", 11, "RESEARCH_REPORT");
    public static final EquityOrderFlowSource FRACTIONAL_NUX_BOTTOM_SHEET = new EquityOrderFlowSource("FRACTIONAL_NUX_BOTTOM_SHEET", 12, "FRACTIONAL-NUX-BOTTOM-SHEET");
    public static final EquityOrderFlowSource LEVEL_2_MARKET_DATA = new EquityOrderFlowSource("LEVEL_2_MARKET_DATA", 13, "LEVEL_TWO_MARKET_DATA");
    public static final EquityOrderFlowSource ADVANCED_CHART = new EquityOrderFlowSource("ADVANCED_CHART", 14, "ADVANCED_CHART");
    public static final EquityOrderFlowSource BW_ADVANCED_CHART = new EquityOrderFlowSource("BW_ADVANCED_CHART", 15, "BW_ADVANCED_CHART");
    public static final EquityOrderFlowSource CANCEL_NEW_HISTORY = new EquityOrderFlowSource("CANCEL_NEW_HISTORY", 16, "CANCEL_NEW_HISTORY");
    public static final EquityOrderFlowSource REDESIGN_PORTFOLIO = new EquityOrderFlowSource("REDESIGN_PORTFOLIO", 17, "REDESIGN_PORTFOLIO");
    public static final EquityOrderFlowSource LADDER = new EquityOrderFlowSource("LADDER", 18, "LADDER");
    public static final EquityOrderFlowSource WATCHLIST_TAB = new EquityOrderFlowSource("WATCHLIST_TAB", 19, "WATCHLIST_TAB");
    public static final EquityOrderFlowSource WATCHLIST_ROW = new EquityOrderFlowSource("WATCHLIST_ROW", 20, "WATCHLIST_ROW_SWIPE");
    public static final EquityOrderFlowSource MAINTENANCE_CALL = new EquityOrderFlowSource("MAINTENANCE_CALL", 21, "MAINTENANCE_CALL");

    /* compiled from: EquityOrderFlowSource.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EquityOrderFlowSource.values().length];
            try {
                iArr[EquityOrderFlowSource.INSTRUMENT_ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ EquityOrderFlowSource[] $values() {
        return new EquityOrderFlowSource[]{SDP_TRADE_BAR, OPTION_EXERCISE, RECURRING_FLOW_COMPLETION, ORDER_SUBMIT_NOTIFICATION, ORDER_DETAIL_IPO_EDIT, ORDER_DETAIL_EXTEND, INSTRUMENT_ROW, DEEPLINK_INSTRUMENT, DEEPLINK_IPO_ENTER_ORDER, DEEPLINK_IPO_PLACE_PRE_IPO_ORDER, EQUITY_ORDER_WITH_SYMBOL_ACTIVITY, ANALYST_REPORT, FRACTIONAL_NUX_BOTTOM_SHEET, LEVEL_2_MARKET_DATA, ADVANCED_CHART, BW_ADVANCED_CHART, CANCEL_NEW_HISTORY, REDESIGN_PORTFOLIO, LADDER, WATCHLIST_TAB, WATCHLIST_ROW, MAINTENANCE_CALL};
    }

    public static EnumEntries<EquityOrderFlowSource> getEntries() {
        return $ENTRIES;
    }

    private EquityOrderFlowSource(String str, int i, String str2) {
        this.loggingValue = str2;
    }

    public final String getLoggingValue() {
        return this.loggingValue;
    }

    static {
        EquityOrderFlowSource[] equityOrderFlowSourceArr$values = $values();
        $VALUES = equityOrderFlowSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(equityOrderFlowSourceArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isInstrumentRow() {
        return WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1;
    }

    /* compiled from: EquityOrderFlowSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource$Companion;", "", "<init>", "()V", "fromDeepLinkActionSource", "Lcom/robinhood/android/trading/contracts/EquityOrderFlowSource;", "value", "", "isReplaceOrder", "", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ EquityOrderFlowSource fromDeepLinkActionSource$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.fromDeepLinkActionSource(str, z);
        }

        public final EquityOrderFlowSource fromDeepLinkActionSource(String value, boolean isReplaceOrder) {
            if (Intrinsics.areEqual(value, "instrument_row")) {
                return EquityOrderFlowSource.INSTRUMENT_ROW;
            }
            return null;
        }
    }

    public static EquityOrderFlowSource valueOf(String str) {
        return (EquityOrderFlowSource) Enum.valueOf(EquityOrderFlowSource.class, str);
    }

    public static EquityOrderFlowSource[] values() {
        return (EquityOrderFlowSource[]) $VALUES.clone();
    }
}

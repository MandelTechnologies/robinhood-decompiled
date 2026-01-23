package com.robinhood.android.equitydetail.p123ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeButtonLogger.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0007JB\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0007R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/TradeButtonLogger;", "", "<init>", "()V", "getGroupString", "", "instrument", "Lcom/robinhood/models/db/Instrument;", "buyEnabled", "", "buyToCloseEnabled", "optionsEnabled", "sellEnabled", "shortEnabled", "logButtonAppearances", "", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "BUTTON_GROUP_TRADE_PREFIX", "BUTTON_GROUP_TRADE_BUY", "BUTTON_GROUP_TRADE_BUY_TO_CLOSE", "BUTTON_GROUP_TRADE_OPTIONS", "BUTTON_GROUP_TRADE_SELL", "BUTTON_GROUP_TRADE_SHORT", "BUTTON_GROUP_TRADE_TRADE", "BUTTON_GROUP_OPTIONS_UPGRADE_HOOK", "BUTTON_OPTIONS_UPGRADE_SIGN_UP_HOOK", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradeButtonLogger {
    public static final int $stable = 0;
    public static final String BUTTON_GROUP_OPTIONS_UPGRADE_HOOK = "options_upgrade";
    public static final String BUTTON_GROUP_TRADE_BUY = "buy";
    public static final String BUTTON_GROUP_TRADE_BUY_TO_CLOSE = "buy_to_close";
    public static final String BUTTON_GROUP_TRADE_OPTIONS = "options";
    public static final String BUTTON_GROUP_TRADE_PREFIX = "trade_";
    public static final String BUTTON_GROUP_TRADE_SELL = "sell";
    public static final String BUTTON_GROUP_TRADE_SHORT = "short";
    public static final String BUTTON_GROUP_TRADE_TRADE = "trade";
    public static final String BUTTON_OPTIONS_UPGRADE_SIGN_UP_HOOK = "sign_up";
    public static final TradeButtonLogger INSTANCE = new TradeButtonLogger();

    private TradeButtonLogger() {
    }

    @JvmStatic
    public static final String getGroupString(Instrument instrument, boolean buyEnabled, boolean buyToCloseEnabled, boolean optionsEnabled, boolean sellEnabled, boolean shortEnabled) {
        StringBuilder sb = new StringBuilder(BUTTON_GROUP_TRADE_PREFIX);
        sb.append(instrument != null ? instrument.getSymbol() : null);
        sb.append('_');
        sb.append(CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{buyEnabled ? "buy" : null, buyToCloseEnabled ? BUTTON_GROUP_TRADE_BUY_TO_CLOSE : null, optionsEnabled ? "options" : null, sellEnabled ? "sell" : null, shortEnabled ? "short" : null}), ",", null, null, 0, null, null, 62, null));
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    @JvmStatic
    public static final void logButtonAppearances(AnalyticsLogger analytics, Instrument instrument, boolean buyEnabled, boolean buyToCloseEnabled, boolean optionsEnabled, boolean sellEnabled, boolean shortEnabled) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        String groupString = getGroupString(instrument, buyEnabled, buyToCloseEnabled, optionsEnabled, sellEnabled, shortEnabled);
        if (buyEnabled) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, groupString, "buy", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (buyToCloseEnabled) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, groupString, BUTTON_GROUP_TRADE_BUY_TO_CLOSE, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (optionsEnabled) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, groupString, "options", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (sellEnabled) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, groupString, "sell", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
        if (shortEnabled) {
            AnalyticsLogger.DefaultImpls.logButtonGroupAppear$default(analytics, groupString, "short", null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
    }
}

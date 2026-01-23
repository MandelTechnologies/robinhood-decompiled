package com.robinhood.android.tradingtrends.p264ui.details;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equitydetail.p123ui.TradeButtonLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradingTrendsDetailsLogging.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/details/TradingTrendsDetailsLogging;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "detailsOpen", "", "getDetailsOpen", "()Z", "setDetailsOpen", "(Z)V", "selectedSegment", "", "instrumentId", "detailsPageOpen", "", "detailsPageClosed", "logTradeBarTap", "logTradeBarAppear", "logAdvanceAlertTap", "logAddWatchListTap", "logToolBarAppear", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class TradingTrendsDetailsLogging {
    public static final int $stable = 8;
    private boolean detailsOpen;
    private final EventLogger eventLogger;
    private String instrumentId;
    private String selectedSegment;

    public TradingTrendsDetailsLogging(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public final boolean getDetailsOpen() {
        return this.detailsOpen;
    }

    public final void setDetailsOpen(boolean z) {
        this.detailsOpen = z;
    }

    public final void detailsPageOpen(String selectedSegment, String instrumentId) {
        Intrinsics.checkNotNullParameter(selectedSegment, "selectedSegment");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.detailsOpen = true;
        this.selectedSegment = selectedSegment;
        this.instrumentId = instrumentId;
    }

    public final void detailsPageClosed() {
        this.detailsOpen = false;
        this.selectedSegment = null;
        this.instrumentId = null;
    }

    public final void logTradeBarTap() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.TRADING_TRENDS;
        String str = this.selectedSegment;
        String str2 = str == null ? "" : str;
        String str3 = this.instrumentId;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, str3 != null ? str3 : "", str2, null, 8, null), new Component(Component.ComponentType.TRADE_BAR, TradeButtonLogger.BUTTON_GROUP_TRADE_TRADE, null, 4, null), null, null, false, 57, null);
    }

    public final void logTradeBarAppear() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.TRADING_TRENDS;
        String str = this.selectedSegment;
        String str2 = str == null ? "" : str;
        String str3 = this.instrumentId;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(name, str3 != null ? str3 : "", str2, null, 8, null), new Component(Component.ComponentType.TRADE_BAR, null, null, 6, null), null, null, 25, null);
    }

    public final void logAdvanceAlertTap() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.TRADING_TRENDS;
        String str = this.selectedSegment;
        String str2 = str == null ? "" : str;
        String str3 = this.instrumentId;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, str3 != null ? str3 : "", str2, null, 8, null), new Component(Component.ComponentType.BUTTON, "advanced-alerts", null, 4, null), null, null, false, 57, null);
    }

    public final void logAddWatchListTap() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.TRADING_TRENDS;
        String str = this.selectedSegment;
        String str2 = str == null ? "" : str;
        String str3 = this.instrumentId;
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(name, str3 != null ? str3 : "", str2, null, 8, null), new Component(Component.ComponentType.BUTTON, "add-to-watch-list", null, 4, null), null, null, false, 57, null);
    }

    public final void logToolBarAppear() {
        EventLogger eventLogger = this.eventLogger;
        Screen.Name name = Screen.Name.TRADING_TRENDS;
        String str = this.selectedSegment;
        String str2 = str == null ? "" : str;
        String str3 = this.instrumentId;
        Screen screen = new Screen(name, str3 == null ? "" : str3, str2, null, 8, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(componentType, "add-to-watch-list", null, 4, null), null, null, 25, null);
        EventLogger eventLogger2 = this.eventLogger;
        String str4 = this.selectedSegment;
        String str5 = str4 == null ? "" : str4;
        String str6 = this.instrumentId;
        EventLogger.DefaultImpls.logAppear$default(eventLogger2, null, new Screen(name, str6 == null ? "" : str6, str5, null, 8, null), new Component(componentType, "advanced-alerts", null, 4, null), null, null, 25, null);
    }
}

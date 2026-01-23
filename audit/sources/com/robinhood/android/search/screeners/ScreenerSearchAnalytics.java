package com.robinhood.android.search.screeners;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.screener.p248ui.ScreenerRows;
import com.robinhood.android.screener.p248ui.ScreenersAdapter;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchEquityScreenerContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenerSearchAnalytics.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J \u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0017H\u0016J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/search/screeners/ScreenerSearchAnalytics;", "Lcom/robinhood/android/screener/ui/ScreenersAdapter$LoggingCallbacks;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/analytics/LogOnceEventLogger;)V", "createButton", "Lcom/robinhood/rosetta/eventlogging/Component;", "screenerRowButton", "truncationButton", "screenerContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "row", "Lcom/robinhood/android/screener/ui/ScreenerRows$ScreenerRow;", "pos", "", "count", "truncationAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "truncated", "", "onScreenerClicked", "", "screenerRow", "position", "onScreenerAppear", "onCreateNewScreenerAppear", "onCreateNewScreenerClicked", "onToggleScreenersTruncated", "truncate", "onToggleScreenersAppear", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ScreenerSearchAnalytics implements ScreenersAdapter.LoggingCallbacks {
    public static final int $stable = 8;
    private final Component createButton;
    private final EventLogger eventLogger;
    private final LogOnceEventLogger logOnceEventLogger;
    private final Component screenerRowButton;
    private final Component truncationButton;

    public ScreenerSearchAnalytics(EventLogger eventLogger, LogOnceEventLogger logOnceEventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(logOnceEventLogger, "logOnceEventLogger");
        this.eventLogger = eventLogger;
        this.logOnceEventLogger = logOnceEventLogger;
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        this.createButton = new Component(componentType, "search_equity_screeners_create", null, 4, null);
        this.screenerRowButton = new Component(Component.ComponentType.LIST_ROW, "search_equity_screener_list_row", null, 4, null);
        this.truncationButton = new Component(componentType, "search_equity_screeners_list_show", null, 4, null);
    }

    private final Context screenerContext(ScreenerRows.ScreenerRow row, int pos, int count) {
        return new Context(pos, count, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new SearchEquityScreenerContext(row.getDisplayName(), row.getId(), row.isPreset(), null, 8, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, -1, -1, -134217729, -1, -1, 16383, null);
    }

    private final UserInteractionEventData.Action truncationAction(boolean truncated) {
        return truncated ? UserInteractionEventData.Action.EXPAND : UserInteractionEventData.Action.COLLAPSE;
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onScreenerClicked(ScreenerRows.ScreenerRow screenerRow, int position, int count) {
        Intrinsics.checkNotNullParameter(screenerRow, "screenerRow");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.screenerRowButton, null, screenerContext(screenerRow, position, count), false, 41, null);
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onScreenerAppear(ScreenerRows.ScreenerRow screenerRow, int position, int count) {
        Intrinsics.checkNotNullParameter(screenerRow, "screenerRow");
        LogOnceEventLogger.logAppear$default(this.logOnceEventLogger, "search_equity_screener_list_row" + screenerRow.getId(), null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.screenerRowButton, screenerContext(screenerRow, position, count), 2, null);
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onCreateNewScreenerAppear() {
        LogOnceEventLogger.logAppear$default(this.logOnceEventLogger, "search_equity_screeners_create", null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.createButton, null, 18, null);
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onCreateNewScreenerClicked() {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.createButton, null, null, false, 57, null);
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onToggleScreenersTruncated(boolean truncate) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, truncationAction(!truncate), new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.truncationButton, null, null, false, 56, null);
    }

    @Override // com.robinhood.android.screener.ui.ScreenersAdapter.LoggingCallbacks
    public void onToggleScreenersAppear(boolean truncated) {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, truncationAction(truncated), new Screen(Screen.Name.BROWSE_SEARCH, null, null, null, 14, null), this.truncationButton, null, null, 24, null);
    }
}

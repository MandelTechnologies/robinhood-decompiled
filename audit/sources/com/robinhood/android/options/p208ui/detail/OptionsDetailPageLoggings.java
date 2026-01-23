package com.robinhood.android.options.p208ui.detail;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.options.p208ui.detail.OptionRow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageLoggings.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u001a\u001e\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\u001a0\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u001a\u001a\u0010\u0016\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u001a$\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u001a$\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u001a\u001a\u0010\u001a\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c\u001a\"\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f\u001a\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\"\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"logOptionsDetailPageAppear", "", "Lcom/robinhood/analytics/EventLogger;", "strategyCode", "", "optionsDetailPageContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "logOptionsDetailPageDisappear", "logLateCloseUpsellTapped", "logLateCloseUpsellDismissed", "logLateCloseInfoClicked", "logOptionsDetailPageSimulatedReturnTooltipAppear", "loggingState", "Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "logOptionsDetailPageSimulatedReturnTooltipTap", "logOptionHistoryRowTap", "rowType", "Lcom/robinhood/android/options/ui/detail/OptionRow$OptionRowType;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "context", "logSectionAppear", "sectionIdentifier", "logIndexCurbTooltipAppear", "logChartSettingBottomSheetAppear", "logCandlestickSwitchClicked", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "logShowAllHoursToggled", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getOptionsDetailPageScreen", "ODP_SIMULATED_RETURNS_TOOLTIP_IDENTIFIER", "ODP_SECTION_GREEKS", "ODP_SECTION_OPTIONS", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.detail.OptionsDetailPageLoggingsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageLoggings {
    public static final String ODP_SECTION_GREEKS = "greeks_section";
    public static final String ODP_SECTION_OPTIONS = "options_section";
    public static final String ODP_SIMULATED_RETURNS_TOOLTIP_IDENTIFIER = "odp_simulated_returns";

    public static final void logOptionsDetailPageAppear(EventLogger eventLogger, String strategyCode, Context optionsDetailPageContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(optionsDetailPageContext, "optionsDetailPageContext");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, getOptionsDetailPageScreen(strategyCode), null, null, optionsDetailPageContext, 13, null);
    }

    public static final void logOptionsDetailPageDisappear(EventLogger eventLogger, String strategyCode, Context optionsDetailPageContext) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(optionsDetailPageContext, "optionsDetailPageContext");
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, getOptionsDetailPageScreen(strategyCode), null, null, optionsDetailPageContext, 13, null);
    }

    public static final void logLateCloseUpsellTapped(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_DEEPLINK, new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.LINK_BUTTON, "late_close_etf_announcement_card", null, 4, null), null, null, false, 56, null);
    }

    public static final void logLateCloseUpsellDismissed(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DISMISS, new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "late_close_etf_announcement_card", null, 4, null), null, null, false, 56, null);
    }

    public static final void logLateCloseInfoClicked(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "odp_late_close_tag", null, 4, null), null, null, false, 57, null);
    }

    public static final void logOptionsDetailPageSimulatedReturnTooltipAppear(EventLogger eventLogger, OptionsDetailPageLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, loggingState.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "odp_simulated_returns", null, 4, null), null, loggingState.getEventContext(), 9, null);
    }

    public static final void logOptionsDetailPageSimulatedReturnTooltipTap(EventLogger eventLogger, OptionsDetailPageLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingState.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, "odp_simulated_returns", null, 4, null), null, loggingState.getEventContext(), false, 41, null);
    }

    public static /* synthetic */ void logOptionHistoryRowTap$default(EventLogger eventLogger, OptionRow.OptionRowType optionRowType, Screen screen, Context context, int i, Object obj) {
        if ((i & 2) != 0) {
            screen = null;
        }
        if ((i & 4) != 0) {
            context = null;
        }
        logOptionHistoryRowTap(eventLogger, optionRowType, screen, context);
    }

    public static final void logOptionHistoryRowTap(EventLogger eventLogger, OptionRow.OptionRowType rowType, Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(rowType, "rowType");
        EventLogger.DefaultImpls.logTap$default(eventLogger, rowType.getAction(), screen, new Component(rowType.getComponentType(), null, null, 6, null), null, context, false, 40, null);
    }

    public static final void logSectionAppear(EventLogger eventLogger, String sectionIdentifier, OptionsDetailPageLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, loggingState.getEventScreen(), new Component(null, sectionIdentifier, null, 5, null), null, loggingState.getEventContext(), 9, null);
    }

    public static final void logIndexCurbTooltipAppear(EventLogger eventLogger, Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, "index_curb_tooltip", null, 4, null), null, context, 9, null);
    }

    public static final void logChartSettingBottomSheetAppear(EventLogger eventLogger, Screen screen, Context context) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.BOTTOM_SHEET, "options_chart_settings", null, 4, null), null, context, 9, null);
    }

    public static final void logCandlestickSwitchClicked(EventLogger eventLogger, OptionsDetailPageLoggingState loggingState, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Intrinsics.checkNotNullParameter(component, "component");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingState.getEventScreen(), component, null, loggingState.getEventContext(), false, 41, null);
    }

    public static final void logShowAllHoursToggled(EventLogger eventLogger, OptionsDetailPageLoggingState loggingState, Component component, UserInteractionEventData.Action action) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(action, "action");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, loggingState.getEventScreen(), component, null, loggingState.getEventContext(), false, 40, null);
    }

    private static final Screen getOptionsDetailPageScreen(String str) {
        return new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, str, null, 10, null);
    }
}

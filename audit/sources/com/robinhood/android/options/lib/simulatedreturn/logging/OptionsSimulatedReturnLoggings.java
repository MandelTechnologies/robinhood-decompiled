package com.robinhood.android.options.lib.simulatedreturn.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnErrorState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionSimulatedReturnsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Clock2;

/* compiled from: OptionsSimulatedReturnLoggings.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u001a\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b\u001a\u001a\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\"\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"logOptionsSimulatedReturnAppear", "", "Lcom/robinhood/analytics/EventLogger;", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "logOptionsSimulatedReturnDisappear", "logOptionsSimulatedReturnButtonTap", "buttonIdentifier", "", "logOptionsSimulatedReturnChartDrag", "logOptionsSimulatedReturnSliderDrag", "getEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Lcom/robinhood/android/options/lib/simulatedreturn/OptionsSimulatedReturnErrorState;", "logOptionsSimulatedReturnTooltipAppear", "tooltipIdentifier", "logOptionsSimulatedReturnTooltipTap", "logOptionsSimulatedReturnResetChartMetrics", "SIMULATED_RETURNS_INFO_ICON_IDENTIFIER", "SIMULATED_RETURNS_VIEW_UNDERLIER_IDENTIFIER", "SIMULATED_RETURNS_SWITCH_TO_DOLLAR_IDENTIFIER", "SIMULATED_RETURNS_SWITCH_TO_PERCENT_IDENTIFIER", "SIMULATED_RETURNS_FLOATING_PILL_IDENTIFIER", "SIMULATED_RETURNS_SLIDER_TOOLTIP_IDENTIFIER", "SIMULATED_RETURNS_INFO_TOOLTIP_IDENTIFIER", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnLoggings {
    public static final String SIMULATED_RETURNS_FLOATING_PILL_IDENTIFIER = "floating_pill";
    public static final String SIMULATED_RETURNS_INFO_ICON_IDENTIFIER = "simulated_returns_info_icon";
    public static final String SIMULATED_RETURNS_INFO_TOOLTIP_IDENTIFIER = "options_simulated_returns_info_icon";
    public static final String SIMULATED_RETURNS_SLIDER_TOOLTIP_IDENTIFIER = "options_simulated_returns_slider";
    public static final String SIMULATED_RETURNS_SWITCH_TO_DOLLAR_IDENTIFIER = "switch_to_dollar";
    public static final String SIMULATED_RETURNS_SWITCH_TO_PERCENT_IDENTIFIER = "switch_to_percent";
    public static final String SIMULATED_RETURNS_VIEW_UNDERLIER_IDENTIFIER = "view_underlier";

    public static final void logOptionsSimulatedReturnAppear(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, loggingState.getEventScreen(), null, null, loggingState.getEventContext(), 13, null);
    }

    public static final void logOptionsSimulatedReturnDisappear(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState) {
        OptionSimulatedReturnsContext optionSimulatedReturnsContext;
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Screen eventScreen = loggingState.getEventScreen();
        int epochMilliseconds = (int) (Clock2.INSTANCE.now().toEpochMilliseconds() - loggingState.getLastAppearEventTimestamp());
        Double estimatedContractPrice = loggingState.getEstimatedContractPrice();
        if (estimatedContractPrice != null) {
            optionSimulatedReturnsContext = new OptionSimulatedReturnsContext(estimatedContractPrice.doubleValue(), null, 2, null);
        } else {
            optionSimulatedReturnsContext = null;
        }
        EventLogger.DefaultImpls.logDisappear$default(eventLogger, null, eventScreen, null, null, new Context(0, 0, 0, null, null, null, null, null, epochMilliseconds, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingState.getOptionStrategyContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, loggingState.getBrokerageAccountContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionSimulatedReturnsContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -8388609, -1, -257, -262145, -1, 16383, null), 13, null);
    }

    public static final void logOptionsSimulatedReturnButtonTap(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState, String buttonIdentifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Intrinsics.checkNotNullParameter(buttonIdentifier, "buttonIdentifier");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingState.getEventScreen(), new Component(Component.ComponentType.BUTTON, buttonIdentifier, null, 4, null), null, loggingState.getEventContext(), false, 41, null);
    }

    public static final void logOptionsSimulatedReturnChartDrag(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, null, loggingState.getEventScreen(), loggingState.getEventChartComponent(), null, loggingState.getEventContext(), false, 41, null);
    }

    public static final void logOptionsSimulatedReturnSliderDrag(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logDrag$default(eventLogger, null, loggingState.getEventScreen(), loggingState.getEventSliderComponent(), null, loggingState.getEventContext(), false, 41, null);
    }

    public static final UserInteractionEventDescriptor getEventDescriptor(OptionsSimulatedReturnErrorState optionsSimulatedReturnErrorState, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState) {
        Intrinsics.checkNotNullParameter(optionsSimulatedReturnErrorState, "<this>");
        return new UserInteractionEventDescriptor(null, optionsSimulatedReturnLoggingState != null ? optionsSimulatedReturnLoggingState.getEventScreen() : null, null, optionsSimulatedReturnLoggingState != null ? optionsSimulatedReturnLoggingState.getEventContext() : null, new Component(Component.ComponentType.ERROR_ALERT, optionsSimulatedReturnErrorState.getLoggingIdentifier(), null, 4, null), null, 37, null);
    }

    public static final void logOptionsSimulatedReturnTooltipAppear(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState, String tooltipIdentifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Intrinsics.checkNotNullParameter(tooltipIdentifier, "tooltipIdentifier");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, loggingState.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, tooltipIdentifier, null, 4, null), null, loggingState.getEventContext(), 9, null);
    }

    public static final void logOptionsSimulatedReturnTooltipTap(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState, String tooltipIdentifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        Intrinsics.checkNotNullParameter(tooltipIdentifier, "tooltipIdentifier");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, loggingState.getEventScreen(), new Component(Component.ComponentType.TOOLTIP, tooltipIdentifier, null, 4, null), null, loggingState.getEventContext(), false, 41, null);
    }

    public static final void logOptionsSimulatedReturnResetChartMetrics(EventLogger eventLogger, OptionsSimulatedReturnLoggingState loggingState) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(loggingState, "loggingState");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.DESELECT, loggingState.getEventScreen(), loggingState.getEventChartComponent(), null, loggingState.getEventContext(), false, 40, null);
    }
}

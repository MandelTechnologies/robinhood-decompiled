package com.robinhood.android.investFlow.logging;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.models.p320db.EtpDetails;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowActivityLoggingHelpers.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investFlow/logging/InvestFlowActivityLoggingHelpers;", "", "<init>", "()V", "logDoubleClick", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "id", "Ljava/util/UUID;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "logCartRemove", "logUndo", "logProspectusToastTap", "etpDetails", "Lcom/robinhood/models/db/EtpDetails;", "logMaxToast", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InvestFlowActivityLoggingHelpers {
    public static final int $stable = 0;
    public static final InvestFlowActivityLoggingHelpers INSTANCE = new InvestFlowActivityLoggingHelpers();

    private InvestFlowActivityLoggingHelpers() {
    }

    public final void logDoubleClick(EventLogger eventLogger, UUID id, Context context) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(context, "context");
        Screen screen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.LIST_CHIP;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, screen, new Component(componentType, string2, null, 4, null), null, context, false, 40, null);
    }

    public final void logCartRemove(EventLogger eventLogger, UUID id) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(id, "id");
        Screen screen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null);
        Component.ComponentType componentType = Component.ComponentType.DELETE_BUTTON;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.REMOVE_FROM_BASKET, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
    }

    public final void logUndo(EventLogger eventLogger, UUID id) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(id, "id");
        Screen screen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null);
        Component.ComponentType componentType = Component.ComponentType.INVESTMENT_ADDED_TOAST;
        String string2 = id.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.UNDO, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
    }

    public final void logProspectusToastTap(EventLogger eventLogger, EtpDetails etpDetails) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(etpDetails, "etpDetails");
        Screen screen = new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null);
        Component.ComponentType componentType = Component.ComponentType.INVESTMENT_ADDED_TOAST;
        String string2 = etpDetails.getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_PROSPECTUS, screen, new Component(componentType, string2, null, 4, null), null, null, false, 56, null);
    }

    public final void logMaxToast(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(Screen.Name.INVEST_FLOW_DISCOVER, null, InvestFlowConstants.Logging.STOCKS_AND_ETFS, null, 10, null), new Component(Component.ComponentType.BASKET_FULL_TOAST, null, null, 6, null), null, null, 25, null);
    }
}

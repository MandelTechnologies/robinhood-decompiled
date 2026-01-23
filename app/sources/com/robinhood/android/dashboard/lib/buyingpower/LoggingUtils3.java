package com.robinhood.android.dashboard.lib.buyingpower;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.models.p320db.MarginHealth;
import com.robinhood.rosetta.converters.brokerage.BuyingPowerRowContext2;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000¨\u0006\f"}, m3636d2 = {"updateWithBuyingPowerData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "marginHealthState", "Lcom/robinhood/models/db/MarginHealth$MarginHealthState;", "hasAccountDeficit", "", "logTooltipViewed", "", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "logTooltipClicked", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.buyingpower.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LoggingUtils3 {
    public static final UserInteractionEventDescriptor updateWithBuyingPowerData(UserInteractionEventDescriptor userInteractionEventDescriptor, MarginHealth.MarginHealthState marginHealthState, boolean z) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        return UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, marginHealthState != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BuyingPowerRowContext(BuyingPowerRowContext2.toProtobuf(marginHealthState), z, null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -131073, -1, -1, 16383, null) : null, new Component(Component.ComponentType.BUYING_POWER_ROW, null, null, 6, null), null, 39, null));
    }

    public static final void logTooltipViewed(EventLogger eventLogger, Screen screen) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, PortfolioBuyingPower5.BuyingPowerTooltipTag, null, 4, null), null, null, 25, null);
    }

    public static final void logTooltipClicked(EventLogger eventLogger, Screen screen) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.TOOLTIP, PortfolioBuyingPower5.BuyingPowerTooltipTag, null, 4, null), null, null, false, 57, null);
    }
}

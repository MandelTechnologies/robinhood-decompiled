package com.robinhood.android.instant.p160ui;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MarginUpgradeContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantCashLogger.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JR\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015J4\u0010\u0016\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0015J4\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0015J\"\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/instant/ui/InstantCashLogger;", "", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/analytics/EventLogger;)V", "logTap", "", "account", "Lcom/robinhood/models/db/Account;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentIdentifier", "", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "shouldLogMarginUpgradeContext", "", "logScreenAppear", "shouldLogEventContext", "logScreenDisappear", "getEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "feature-lib-instant_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InstantCashLogger {
    public static final int $stable = 8;
    private final EventLogger eventLogger;

    public InstantCashLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.eventLogger = eventLogger;
    }

    public static /* synthetic */ void logTap$default(InstantCashLogger instantCashLogger, Account account, UserInteractionEventData.Action action, Screen screen, Component.ComponentType componentType, String str, ComponentHierarchy componentHierarchy, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            account = null;
        }
        if ((i & 2) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 4) != 0) {
            screen = null;
        }
        if ((i & 8) != 0) {
            componentType = Component.ComponentType.BUTTON;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        if ((i & 32) != 0) {
            componentHierarchy = null;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        instantCashLogger.logTap(account, action, screen, componentType, str, componentHierarchy, z);
    }

    public final void logTap(Account account, UserInteractionEventData.Action action, Screen screen, Component.ComponentType componentType, String componentIdentifier, ComponentHierarchy componentHierarchy, boolean shouldLogMarginUpgradeContext) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(componentIdentifier, "componentIdentifier");
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, action, screen, new Component(componentType, componentIdentifier, null, 4, null), componentHierarchy, getEventContext(account, shouldLogMarginUpgradeContext), false, 32, null);
    }

    public static /* synthetic */ void logScreenAppear$default(InstantCashLogger instantCashLogger, Account account, Screen screen, ComponentHierarchy componentHierarchy, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            account = null;
        }
        if ((i & 2) != 0) {
            screen = null;
        }
        if ((i & 4) != 0) {
            componentHierarchy = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        instantCashLogger.logScreenAppear(account, screen, componentHierarchy, z);
    }

    public final void logScreenAppear(Account account, Screen screen, ComponentHierarchy componentHierarchy, boolean shouldLogEventContext) {
        EventLogger.DefaultImpls.logScreenAppear$default(this.eventLogger, null, screen, null, componentHierarchy, shouldLogEventContext ? getEventContext(account, false) : null, 5, null);
    }

    public static /* synthetic */ void logScreenDisappear$default(InstantCashLogger instantCashLogger, Account account, Screen screen, ComponentHierarchy componentHierarchy, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            account = null;
        }
        if ((i & 2) != 0) {
            screen = null;
        }
        if ((i & 4) != 0) {
            componentHierarchy = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        instantCashLogger.logScreenDisappear(account, screen, componentHierarchy, z);
    }

    public final void logScreenDisappear(Account account, Screen screen, ComponentHierarchy componentHierarchy, boolean shouldLogEventContext) {
        EventLogger.DefaultImpls.logScreenDisappear$default(this.eventLogger, null, screen, null, componentHierarchy, shouldLogEventContext ? getEventContext(account, false) : null, 5, null);
    }

    private final Context getEventContext(Account account, boolean shouldLogMarginUpgradeContext) {
        MarginUpgradeContext marginUpgradeContext;
        if (account == null) {
            return null;
        }
        BrokerageAccountContext brokerageAccountContext = new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(account.getBrokerageAccountType()), null, null, null, false, false, null, null, null, null, 1022, null);
        if (shouldLogMarginUpgradeContext) {
            marginUpgradeContext = new MarginUpgradeContext(account.getType().getServerValue(), "", account.isGold() ? Boolean.TRUE : Boolean.FALSE, null, 8, null);
        } else {
            marginUpgradeContext = null;
        }
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, marginUpgradeContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1048577, -257, -1, -1, 16383, null);
    }
}

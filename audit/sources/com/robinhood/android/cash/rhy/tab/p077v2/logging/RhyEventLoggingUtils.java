package com.robinhood.android.cash.rhy.tab.p077v2.logging;

import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyEventLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\b\u0002\u0010\u0014\u001a\u00060\u0015j\u0002`\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/logging/RhyEventLoggingUtils;", "", "<init>", "()V", "rhyTabContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getRhyTabContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "defaultLoggingConfig", "Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "getDefaultLoggingConfig", "()Lcom/robinhood/android/autoeventlogging/AutoLoggingConfig;", "rhyTabScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getRhyTabScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "toRhyTabEventData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "identifier", "", "rhyNuxActivateCard", "rhyNuxActivateCardComplete", "rhyNuxFund", "rhyNuxFundComplete", "rhyNuxLearnRur", "rhyNuxLearnRurComplete", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyEventLoggingUtils {
    public static final int $stable;
    public static final RhyEventLoggingUtils INSTANCE = new RhyEventLoggingUtils();
    private static final AutoLoggingConfig defaultLoggingConfig;
    public static final String rhyNuxActivateCard = "rhy-activate-card";
    public static final String rhyNuxActivateCardComplete = "rhy-activate-card-completed";
    public static final String rhyNuxFund = "rhy-fund";
    public static final String rhyNuxFundComplete = "rhy-fund-completed";
    public static final String rhyNuxLearnRur = "rhy-learn-round-up";
    public static final String rhyNuxLearnRurComplete = "rhy-learn-round-up-completed";
    private static final Context rhyTabContext;
    private static final Screen rhyTabScreen;

    private RhyEventLoggingUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        rhyTabContext = new Context(0, 0, 0, null, null, objArr, objArr2, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.SPENDING, "rhy_home", "cash_tab", RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED, null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
        defaultLoggingConfig = new AutoLoggingConfig(false, false);
        rhyTabScreen = new Screen(Screen.Name.RHY_SPENDING_HOME, null, null, null, 14, null);
        $stable = 8;
    }

    public final Context getRhyTabContext() {
        return rhyTabContext;
    }

    public final AutoLoggingConfig getDefaultLoggingConfig() {
        return defaultLoggingConfig;
    }

    public final Screen getRhyTabScreen() {
        return rhyTabScreen;
    }

    public static /* synthetic */ UserInteractionEventDescriptor toRhyTabEventData$default(RhyEventLoggingUtils rhyEventLoggingUtils, Component.ComponentType componentType, UserInteractionEventData.Action action, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return rhyEventLoggingUtils.toRhyTabEventData(componentType, action, str);
    }

    public final UserInteractionEventDescriptor toRhyTabEventData(Component.ComponentType componentType, UserInteractionEventData.Action action, String identifier) {
        Intrinsics.checkNotNullParameter(componentType, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Component component = new Component(componentType, identifier, null, 4, null);
        return new UserInteractionEventDescriptor(null, rhyTabScreen, action, rhyTabContext, component, null, 33, null);
    }
}

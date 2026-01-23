package com.robinhood.android.creditcard.p091ui.creditapplication;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: loggingUtils.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0018\u0010\u0015\u001a\u00020\u0011*\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u0011*\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000\u001a \u0010\u0017\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"ccScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getCcScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "setCcScreen", "(Lcom/robinhood/rosetta/eventlogging/Screen;)V", "entryPointIdentifier", "", "getEntryPointIdentifier", "()Ljava/lang/String;", "setEntryPointIdentifier", "(Ljava/lang/String;)V", "BOTTOM_SHEET", "Lcom/robinhood/rosetta/eventlogging/Component;", "getBOTTOM_SHEET", "()Lcom/robinhood/rosetta/eventlogging/Component;", "logContinue", "", "Lcom/robinhood/analytics/EventLogger;", "component", "logDismiss", "logAccept", "logEdit", "logLinkClick", "url", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.LoggingUtilsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class loggingUtils {
    private static String entryPointIdentifier;
    private static Screen ccScreen = new Screen(Screen.Name.CC_APPLICATION_LOADING, null, null, null, 14, null);
    private static final Component BOTTOM_SHEET = new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null);

    public static final Screen getCcScreen() {
        return ccScreen;
    }

    public static final void setCcScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<set-?>");
        ccScreen = screen;
    }

    public static final String getEntryPointIdentifier() {
        return entryPointIdentifier;
    }

    public static final void setEntryPointIdentifier(String str) {
        entryPointIdentifier = str;
    }

    public static final Component getBOTTOM_SHEET() {
        return BOTTOM_SHEET;
    }

    public static /* synthetic */ void logContinue$default(EventLogger eventLogger, Component component, int i, Object obj) {
        if ((i & 1) != 0) {
            component = null;
        }
        logContinue(eventLogger, component);
    }

    public static final void logContinue(EventLogger eventLogger, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Screen screen = ccScreen;
        Component component2 = component == null ? new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null) : component;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
        String str = entryPointIdentifier;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component2, null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
    }

    public static /* synthetic */ void logDismiss$default(EventLogger eventLogger, Component component, int i, Object obj) {
        if ((i & 1) != 0) {
            component = null;
        }
        logDismiss(eventLogger, component);
    }

    public static final void logDismiss(EventLogger eventLogger, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Screen screen = ccScreen;
        Component component2 = component == null ? new Component(Component.ComponentType.CANCEL_BUTTON, null, null, 6, null) : component;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.DISMISS;
        String str = entryPointIdentifier;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component2, null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
    }

    public static /* synthetic */ void logAccept$default(EventLogger eventLogger, Component component, int i, Object obj) {
        if ((i & 1) != 0) {
            component = null;
        }
        logAccept(eventLogger, component);
    }

    public static final void logAccept(EventLogger eventLogger, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Screen screen = ccScreen;
        Component component2 = component == null ? new Component(Component.ComponentType.BUTTON, null, null, 6, null) : component;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.ACCEPT;
        String str = entryPointIdentifier;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component2, null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
    }

    public static /* synthetic */ void logEdit$default(EventLogger eventLogger, Component component, int i, Object obj) {
        if ((i & 1) != 0) {
            component = null;
        }
        logEdit(eventLogger, component);
    }

    public static final void logEdit(EventLogger eventLogger, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Screen screen = ccScreen;
        Component component2 = component == null ? new Component(Component.ComponentType.BUTTON, null, null, 6, null) : component;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.EDIT;
        String str = entryPointIdentifier;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component2, null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
    }

    public static /* synthetic */ void logLinkClick$default(EventLogger eventLogger, String str, Component component, int i, Object obj) {
        if ((i & 2) != 0) {
            component = null;
        }
        logLinkClick(eventLogger, str, component);
    }

    public static final void logLinkClick(EventLogger eventLogger, String url, Component component) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Screen screen = ccScreen;
        Component component2 = component == null ? new Component(Component.ComponentType.LINK_BUTTON, null, null, 6, null) : component;
        UserInteractionEventData.Action action = UserInteractionEventData.Action.OPEN_URL;
        String str = entryPointIdentifier;
        if (str == null) {
            str = "";
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, screen, component2, null, new Context(0, 0, 0, null, null, null, url, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1089, -1, -1, -1, -1, -1, 16383, null), false, 40, null);
    }
}

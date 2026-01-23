package com.robinhood.shared.settings.iibsettings;

import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceEventLogger;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.settings.models.p253ui.TypedSettingsItem;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.settings.contracts.Constants6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SettingsItemLoggingUtils.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a(\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0005H\u0002¨\u0006\u000e"}, m3636d2 = {"logSettingsItemAppearOnce", "", "logOnceEventLogger", "Lcom/robinhood/analytics/LogOnceEventLogger;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/settings/models/ui/TypedSettingsItem;", "logSettingsItemTap", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "screenDescription", "", "entryPointIdentifier", "getComponentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "lib-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.settings.iibsettings.SettingsItemLoggingUtilsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SettingsItemLoggingUtils {
    public static final void logSettingsItemAppearOnce(LogOnceEventLogger logOnceEventLogger, TypedSettingsItem item) {
        Intrinsics.checkNotNullParameter(logOnceEventLogger, "logOnceEventLogger");
        Intrinsics.checkNotNullParameter(item, "item");
        LogOnceEventLogger.logAppear$default(logOnceEventLogger, item.getId(), UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.ACCOUNT_OVERVIEW, null, Constants6.ACCOUNT_MENU_PAGE_ID, null, 10, null), new Component(getComponentType(item), item.getId(), null, 4, null), null, 16, null);
    }

    public static final void logSettingsItemTap(EventLogger eventLogger, TypedSettingsItem item, String screenDescription, String str) {
        Component.ComponentType componentType;
        Context context;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        if (item instanceof TypedSettingsItem.ButtonItem) {
            componentType = Component.ComponentType.BUTTON;
        } else {
            componentType = Component.ComponentType.ROW;
        }
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SELECT;
        if (str != null) {
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null);
        } else {
            context = null;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(Screen.Name.BONFIRE_SETTINGS_PAGE, null, screenDescription, null, 10, null), new Component(componentType, item.getId(), null, 4, null), null, context, false, 40, null);
    }

    public static final void logSettingsItemTap(EventLogger eventLogger, TypedSettingsItem item) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(item, "item");
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.ACCOUNT_OVERVIEW, null, Constants6.ACCOUNT_MENU_PAGE_ID, null, 10, null), new Component(getComponentType(item), item.getId(), null, 4, null), null, null, false, 56, null);
    }

    private static final Component.ComponentType getComponentType(TypedSettingsItem typedSettingsItem) {
        if (typedSettingsItem instanceof TypedSettingsItem.ButtonItem) {
            return Component.ComponentType.BUTTON;
        }
        return Component.ComponentType.ROW;
    }
}

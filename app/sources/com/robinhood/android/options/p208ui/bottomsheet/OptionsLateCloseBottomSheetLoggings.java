package com.robinhood.android.options.p208ui.bottomsheet;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsLateCloseBottomSheetLoggings.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\"\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"logOptionsLateCloseBottomSheetCtaTap", "", "Lcom/robinhood/analytics/EventLogger;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "identifier", "", "SCREEN_NAME_FOR_LOGGING", "feature-options-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.ui.bottomsheet.OptionsLateCloseBottomSheetLoggingsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsLateCloseBottomSheetLoggings {
    public static final String SCREEN_NAME_FOR_LOGGING = "LateCloseETFBottomSheet";

    public static final void logOptionsLateCloseBottomSheetCtaTap(EventLogger eventLogger, Screen.Name screenName, UserInteractionEventData.Action action, String identifier) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "LateCloseETFBottomSheet-" + identifier, null, 4, null), null, null, false, 56, null);
    }
}

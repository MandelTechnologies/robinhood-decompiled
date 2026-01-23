package com.robinhood.android.transfers.util;

import com.robinhood.analytics.EventLogger;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreCreateLoggingEvents.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\n"}, m3636d2 = {"logPreCreateBottomSheetClick", "", "Lcom/robinhood/analytics/EventLogger;", "type", "Lcom/robinhood/models/api/bonfire/transfer/PreCreatePopupType;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "logPreCreateBottomSheetAppeared", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.util.PreCreateLoggingEventsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PreCreateLoggingEvents {
    public static /* synthetic */ void logPreCreateBottomSheetClick$default(EventLogger eventLogger, PreCreatePopupType preCreatePopupType, UserInteractionEventData.Action action, Screen.Name name, int i, Object obj) {
        if ((i & 4) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        logPreCreateBottomSheetClick(eventLogger, preCreatePopupType, action, name);
    }

    public static final void logPreCreateBottomSheetClick(EventLogger eventLogger, PreCreatePopupType type2, UserInteractionEventData.Action action, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        EventLogger.DefaultImpls.logTap$default(eventLogger, action, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.BOTTOM_SHEET, type2.getServerValue(), null, 4, null), null, null, false, 56, null);
    }

    public static /* synthetic */ void logPreCreateBottomSheetAppeared$default(EventLogger eventLogger, PreCreatePopupType preCreatePopupType, Screen.Name name, int i, Object obj) {
        if ((i & 2) != 0) {
            name = Screen.Name.CREATE_MAX_TRANSFER;
        }
        logPreCreateBottomSheetAppeared(eventLogger, preCreatePopupType, name);
    }

    public static final void logPreCreateBottomSheetAppeared(EventLogger eventLogger, PreCreatePopupType type2, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(eventLogger, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, new Screen(screenName, null, null, null, 14, null), new Component(Component.ComponentType.BOTTOM_SHEET, type2.getServerValue(), null, 4, null), null, null, 25, null);
    }
}

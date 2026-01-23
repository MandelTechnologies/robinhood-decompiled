package com.robinhood.analytics;

import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.bitdrift.BitdriftCapture;
import kotlin.Metadata;

/* compiled from: BaseEventLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0002¨\u0006\u0006"}, m3636d2 = {"sendToBitdrift", "", "event", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "toBitdriftEvent", "Lcom/robinhood/shared/bitdrift/BitdriftCapture$UserInteractionEvent;", "lib-analytics_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.BaseEventLoggerKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class BaseEventLogger2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendToBitdrift(UserInteractionEventData userInteractionEventData) {
        BitdriftCapture.INSTANCE.logEvent(toBitdriftEvent(userInteractionEventData));
    }

    private static final BitdriftCapture.UserInteractionEvent toBitdriftEvent(UserInteractionEventData userInteractionEventData) {
        Component.ComponentType component_type;
        Screen.Name name;
        String strName = userInteractionEventData.getEvent_type().name();
        Screen screen = userInteractionEventData.getScreen();
        String strName2 = (screen == null || (name = screen.getName()) == null) ? null : name.name();
        Screen screen2 = userInteractionEventData.getScreen();
        String identifier = screen2 != null ? screen2.getIdentifier() : null;
        Component component = userInteractionEventData.getComponent();
        String strName3 = (component == null || (component_type = component.getComponent_type()) == null) ? null : component_type.name();
        Component component2 = userInteractionEventData.getComponent();
        String identifier2 = component2 != null ? component2.getIdentifier() : null;
        Context context = userInteractionEventData.getContext();
        return new BitdriftCapture.UserInteractionEvent(strName, strName2, identifier, strName3, identifier2, context != null ? context.getEntry_point_identifier() : null);
    }
}

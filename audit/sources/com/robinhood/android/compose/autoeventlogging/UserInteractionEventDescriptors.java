package com.robinhood.android.compose.autoeventlogging;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInteractionEventDescriptors.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007¨\u0006\b"}, m3636d2 = {"updateWith", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "newDescriptor", "toEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "lib-compose-auto-event-logging_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptorsKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class UserInteractionEventDescriptors {
    public static final UserInteractionEventDescriptor updateWith(UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor newDescriptor) {
        String identifier;
        String str;
        UserInteractionEventData.Action action;
        ComponentHierarchy componentHierarchy;
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(newDescriptor, "newDescriptor");
        if (userInteractionEventDescriptor.getIdentifier() == null && newDescriptor.getIdentifier() == null) {
            str = null;
        } else {
            if (userInteractionEventDescriptor.getIdentifier() != null && newDescriptor.getIdentifier() == null) {
                identifier = userInteractionEventDescriptor.getIdentifier();
            } else if (userInteractionEventDescriptor.getIdentifier() != null || newDescriptor.getIdentifier() == null) {
                identifier = userInteractionEventDescriptor.getIdentifier() + "-" + newDescriptor.getIdentifier();
            } else {
                identifier = newDescriptor.getIdentifier();
            }
            str = identifier;
        }
        if (newDescriptor.getAction() == UserInteractionEventData.Action.ACTION_UNSPECIFIED) {
            action = userInteractionEventDescriptor.getAction();
        } else {
            action = newDescriptor.getAction();
        }
        UserInteractionEventData.Action action2 = action;
        ComponentHierarchy componentHierarchy2 = userInteractionEventDescriptor.getComponentHierarchy();
        if (userInteractionEventDescriptor.getComponent() == null || newDescriptor.getComponent() == null) {
            componentHierarchy = componentHierarchy2;
        } else {
            ComponentHierarchy componentHierarchy3 = userInteractionEventDescriptor.getComponentHierarchy();
            Component parent_0 = componentHierarchy3 != null ? componentHierarchy3.getParent_0() : null;
            ComponentHierarchy componentHierarchy4 = userInteractionEventDescriptor.getComponentHierarchy();
            Component parent_1 = componentHierarchy4 != null ? componentHierarchy4.getParent_1() : null;
            ComponentHierarchy componentHierarchy5 = userInteractionEventDescriptor.getComponentHierarchy();
            Component parent_2 = componentHierarchy5 != null ? componentHierarchy5.getParent_2() : null;
            if (componentHierarchy2 == null) {
                componentHierarchy = new ComponentHierarchy(userInteractionEventDescriptor.getComponent(), null, null, null, null, 30, null);
            } else {
                if (componentHierarchy2.getParent_1() == null) {
                    componentHierarchy2 = ComponentHierarchy.copy$default(componentHierarchy2, userInteractionEventDescriptor.getComponent(), parent_0, null, null, null, 28, null);
                } else if (componentHierarchy2.getParent_2() == null) {
                    componentHierarchy2 = ComponentHierarchy.copy$default(componentHierarchy2, userInteractionEventDescriptor.getComponent(), parent_0, parent_1, null, null, 24, null);
                } else if (componentHierarchy2.getParent_3() == null) {
                    componentHierarchy2 = ComponentHierarchy.copy$default(componentHierarchy2, userInteractionEventDescriptor.getComponent(), parent_0, parent_1, parent_2, null, 16, null);
                }
                componentHierarchy = componentHierarchy2;
            }
        }
        Screen screen = newDescriptor.getScreen();
        if (screen == null) {
            screen = userInteractionEventDescriptor.getScreen();
        }
        Screen screen2 = screen;
        Context context = newDescriptor.getContext();
        if (context == null) {
            context = userInteractionEventDescriptor.getContext();
        }
        Context context2 = context;
        Component component = newDescriptor.getComponent();
        if (component == null) {
            component = userInteractionEventDescriptor.getComponent();
        }
        return new UserInteractionEventDescriptor(str, screen2, action2, context2, component, componentHierarchy);
    }

    public static final UserInteractionEventData toEventData(UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventData.EventType eventType) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new UserInteractionEventData(eventType, userInteractionEventDescriptor.getScreen(), userInteractionEventDescriptor.getComponent(), userInteractionEventDescriptor.getAction(), userInteractionEventDescriptor.getContext(), userInteractionEventDescriptor.getComponentHierarchy(), null, 64, null);
    }
}

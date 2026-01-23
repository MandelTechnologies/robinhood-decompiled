package com.robinhood.android.autoeventlogging;

import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInteractionEventDescriptor.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\r\u0010 \u001a\u00060\u0007j\u0002`\bHÆ\u0003J\u0011\u0010!\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003JY\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "", "identifier", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;)V", "getIdentifier", "()Ljava/lang/String;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "getComponentHierarchy", "()Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserInteractionEventDescriptor {
    private final UserInteractionEventData.Action action;
    private final Component component;
    private final ComponentHierarchy componentHierarchy;
    private final Context context;
    private final String identifier;
    private final Screen screen;

    public UserInteractionEventDescriptor() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UserInteractionEventDescriptor copy$default(UserInteractionEventDescriptor userInteractionEventDescriptor, String str, Screen screen, UserInteractionEventData.Action action, Context context, Component component, ComponentHierarchy componentHierarchy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInteractionEventDescriptor.identifier;
        }
        if ((i & 2) != 0) {
            screen = userInteractionEventDescriptor.screen;
        }
        if ((i & 4) != 0) {
            action = userInteractionEventDescriptor.action;
        }
        if ((i & 8) != 0) {
            context = userInteractionEventDescriptor.context;
        }
        if ((i & 16) != 0) {
            component = userInteractionEventDescriptor.component;
        }
        if ((i & 32) != 0) {
            componentHierarchy = userInteractionEventDescriptor.componentHierarchy;
        }
        Component component2 = component;
        ComponentHierarchy componentHierarchy2 = componentHierarchy;
        return userInteractionEventDescriptor.copy(str, screen, action, context, component2, componentHierarchy2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component3, reason: from getter */
    public final UserInteractionEventData.Action getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: component5, reason: from getter */
    public final Component getComponent() {
        return this.component;
    }

    /* renamed from: component6, reason: from getter */
    public final ComponentHierarchy getComponentHierarchy() {
        return this.componentHierarchy;
    }

    public final UserInteractionEventDescriptor copy(String identifier, Screen screen, UserInteractionEventData.Action action, Context context, Component component, ComponentHierarchy componentHierarchy) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new UserInteractionEventDescriptor(identifier, screen, action, context, component, componentHierarchy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInteractionEventDescriptor)) {
            return false;
        }
        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) other;
        return Intrinsics.areEqual(this.identifier, userInteractionEventDescriptor.identifier) && Intrinsics.areEqual(this.screen, userInteractionEventDescriptor.screen) && this.action == userInteractionEventDescriptor.action && Intrinsics.areEqual(this.context, userInteractionEventDescriptor.context) && Intrinsics.areEqual(this.component, userInteractionEventDescriptor.component) && Intrinsics.areEqual(this.componentHierarchy, userInteractionEventDescriptor.componentHierarchy);
    }

    public int hashCode() {
        String str = this.identifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Screen screen = this.screen;
        int iHashCode2 = (((iHashCode + (screen == null ? 0 : screen.hashCode())) * 31) + this.action.hashCode()) * 31;
        Context context = this.context;
        int iHashCode3 = (iHashCode2 + (context == null ? 0 : context.hashCode())) * 31;
        Component component = this.component;
        int iHashCode4 = (iHashCode3 + (component == null ? 0 : component.hashCode())) * 31;
        ComponentHierarchy componentHierarchy = this.componentHierarchy;
        return iHashCode4 + (componentHierarchy != null ? componentHierarchy.hashCode() : 0);
    }

    public String toString() {
        return "UserInteractionEventDescriptor(identifier=" + this.identifier + ", screen=" + this.screen + ", action=" + this.action + ", context=" + this.context + ", component=" + this.component + ", componentHierarchy=" + this.componentHierarchy + ")";
    }

    public UserInteractionEventDescriptor(String str, Screen screen, UserInteractionEventData.Action action, Context context, Component component, ComponentHierarchy componentHierarchy) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.identifier = str;
        this.screen = screen;
        this.action = action;
        this.context = context;
        this.component = component;
        this.componentHierarchy = componentHierarchy;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public /* synthetic */ UserInteractionEventDescriptor(String str, Screen screen, UserInteractionEventData.Action action, Context context, Component component, ComponentHierarchy componentHierarchy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? UserInteractionEventData.Action.ACTION_UNSPECIFIED : action, (i & 8) != 0 ? null : context, (i & 16) != 0 ? null : component, (i & 32) != 0 ? null : componentHierarchy);
    }

    public final UserInteractionEventData.Action getAction() {
        return this.action;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Component getComponent() {
        return this.component;
    }

    public final ComponentHierarchy getComponentHierarchy() {
        return this.componentHierarchy;
    }
}

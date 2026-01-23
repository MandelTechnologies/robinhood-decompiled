package com.robinhood.android.autoeventlogging;

import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserInteractionEventBuilder.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0002R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/autoeventlogging/UserInteractionEventBuilder;", "", "eventType", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/robinhood/rosetta/eventlogging/EventType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;)V", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "componentHierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "_identifier", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "setData", "newData", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "setScreen", "isScreenSet", "", "build", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "setComponentHierarchy", "newComponent", "lib-auto-event-logging_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class UserInteractionEventBuilder {
    private final StringBuilder _identifier;
    private UserInteractionEventData.Action action;
    private Component component;
    private ComponentHierarchy componentHierarchy;
    private Context context;
    private final UserInteractionEventData.EventType eventType;
    private Screen screen;

    public UserInteractionEventBuilder(UserInteractionEventData.EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        this._identifier = new StringBuilder();
    }

    public final String getIdentifier() {
        String string2 = this._identifier.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final UserInteractionEventBuilder setData(UserInteractionEventDescriptor newData) {
        if (newData != null) {
            Screen screen = this.screen;
            if (screen == null) {
                screen = newData.getScreen();
            }
            this.screen = screen;
            UserInteractionEventData.Action action = this.action;
            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
            if (action == action2 && newData.getAction() != action2) {
                this.action = newData.getAction();
            }
            Context context = this.context;
            if (context == null) {
                context = newData.getContext();
            }
            this.context = context;
            if (this.component == null) {
                this.component = newData.getComponent();
            } else {
                setComponentHierarchy(newData.getComponent());
            }
            String identifier = newData.getIdentifier();
            if (identifier != null) {
                StringBuilder sb = this._identifier;
                sb.append((sb.length() == 0 ? "" : "-") + identifier);
            }
        }
        return this;
    }

    public final UserInteractionEventBuilder setScreen(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.screen = screen;
        return this;
    }

    public final boolean isScreenSet() {
        return this.screen != null;
    }

    public final UserInteractionEventData build() {
        return new UserInteractionEventData(this.eventType, this.screen, this.component, this.action, this.context, this.componentHierarchy, null, 64, null);
    }

    private final UserInteractionEventBuilder setComponentHierarchy(Component newComponent) {
        if (newComponent != null) {
            ComponentHierarchy componentHierarchyCopy$default = this.componentHierarchy;
            if (componentHierarchyCopy$default == null) {
                componentHierarchyCopy$default = new ComponentHierarchy(newComponent, null, null, null, null, 30, null);
            } else if (componentHierarchyCopy$default.getParent_1() == null) {
                componentHierarchyCopy$default = ComponentHierarchy.copy$default(componentHierarchyCopy$default, null, newComponent, null, null, null, 29, null);
            } else if (componentHierarchyCopy$default.getParent_2() == null) {
                componentHierarchyCopy$default = ComponentHierarchy.copy$default(componentHierarchyCopy$default, null, null, newComponent, null, null, 27, null);
            } else if (componentHierarchyCopy$default.getParent_3() == null) {
                componentHierarchyCopy$default = ComponentHierarchy.copy$default(componentHierarchyCopy$default, null, null, null, newComponent, null, 23, null);
            }
            this.componentHierarchy = componentHierarchyCopy$default;
        }
        return this;
    }
}

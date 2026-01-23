package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContextActionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "", "<init>", "()V", "Action", "Component", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent$Action;", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent$Component;", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public abstract class ContextActionEvent {
    public /* synthetic */ ContextActionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ContextActionEvent() {
    }

    /* compiled from: ContextActionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ContextActionEvent$Action;", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "eventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "getEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Action extends ContextActionEvent {
        private final UserInteractionEventData.Action eventData;

        public static /* synthetic */ Action copy$default(Action action, UserInteractionEventData.Action action2, int i, Object obj) {
            if ((i & 1) != 0) {
                action2 = action.eventData;
            }
            return action.copy(action2);
        }

        /* renamed from: component1, reason: from getter */
        public final UserInteractionEventData.Action getEventData() {
            return this.eventData;
        }

        public final Action copy(UserInteractionEventData.Action eventData) {
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            return new Action(eventData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && this.eventData == ((Action) other).eventData;
        }

        public int hashCode() {
            return this.eventData.hashCode();
        }

        public String toString() {
            return "Action(eventData=" + this.eventData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(UserInteractionEventData.Action eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.eventData = eventData;
        }

        public final UserInteractionEventData.Action getEventData() {
            return this.eventData;
        }
    }

    /* compiled from: ContextActionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ContextActionEvent$Component;", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Component;)V", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Component extends ContextActionEvent {
        private final com.robinhood.rosetta.eventlogging.Component component;

        public static /* synthetic */ Component copy$default(Component component, com.robinhood.rosetta.eventlogging.Component component2, int i, Object obj) {
            if ((i & 1) != 0) {
                component2 = component.component;
            }
            return component.copy(component2);
        }

        /* renamed from: component1, reason: from getter */
        public final com.robinhood.rosetta.eventlogging.Component getComponent() {
            return this.component;
        }

        public final Component copy(com.robinhood.rosetta.eventlogging.Component component) {
            Intrinsics.checkNotNullParameter(component, "component");
            return new Component(component);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Component) && Intrinsics.areEqual(this.component, ((Component) other).component);
        }

        public int hashCode() {
            return this.component.hashCode();
        }

        public String toString() {
            return "Component(component=" + this.component + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Component(com.robinhood.rosetta.eventlogging.Component component) {
            super(null);
            Intrinsics.checkNotNullParameter(component, "component");
            this.component = component;
        }

        public final com.robinhood.rosetta.eventlogging.Component getComponent() {
            return this.component;
        }
    }
}

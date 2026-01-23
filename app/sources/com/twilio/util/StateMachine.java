package com.twilio.util;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.singular.sdk.internal.Constants;
import com.twilio.util.StateMachine;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicFU4;

/* compiled from: StateMachine.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 $*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0002:\u0005$%&'(B!\b\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0002\u0010\u0013JC\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002)\u0010\u0015\u001a%\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0002\b\u0019J#\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001b*\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011*\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u0018*\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010!J\u0019\u0010\"\u001a\u00020\u0018*\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u00020\u0018*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0011H\u0002R \u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006)"}, m3636d2 = {"Lcom/twilio/util/StateMachine;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "graph", "Lcom/twilio/util/StateMachine$Graph;", "(Lcom/twilio/util/StateMachine$Graph;)V", "<set-?>", "state", "getState", "()Ljava/lang/Object;", "setState", "(Ljava/lang/Object;)V", "state$delegate", "Lkotlinx/atomicfu/AtomicRef;", NavTransition2.KEY_TRANSITION, "Lcom/twilio/util/StateMachine$Transition;", "event", "(Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Transition;", "with", "init", "Lkotlin/Function1;", "Lcom/twilio/util/StateMachine$GraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "getDefinition", "Lcom/twilio/util/StateMachine$Graph$State;", "(Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Graph$State;", "getTransition", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Transition;", "notifyOnEnter", "cause", "(Ljava/lang/Object;Ljava/lang/Object;)V", "notifyOnExit", "notifyOnTransition", "Companion", "Graph", "GraphBuilder", "Matcher", "Transition", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class StateMachine<STATE, EVENT, SIDE_EFFECT> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Graph<STATE, EVENT, SIDE_EFFECT> graph;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final AtomicFU4 state;

    public /* synthetic */ StateMachine(Graph graph, DefaultConstructorMarker defaultConstructorMarker) {
        this(graph);
    }

    private StateMachine(Graph<STATE, EVENT, SIDE_EFFECT> graph) {
        this.graph = graph;
        this.state = AtomicFU.atomic(graph.getInitialState());
    }

    private final void setState(STATE state) {
        this.state.setValue(state);
    }

    public final STATE getState() {
        return (STATE) this.state.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Transition<STATE, EVENT, SIDE_EFFECT> transition(EVENT event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Object state = getState();
        Transition<STATE, EVENT, SIDE_EFFECT> transition = getTransition(state, event);
        boolean z = transition instanceof Transition.Valid;
        if (z) {
            setState(((Transition.Valid) transition).getToState());
        }
        notifyOnTransition(transition);
        if (z) {
            notifyOnExit(state, event);
            notifyOnEnter(((Transition.Valid) transition).getToState(), event);
        }
        return transition;
    }

    public final StateMachine<STATE, EVENT, SIDE_EFFECT> with(Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        return INSTANCE.create(Graph.copy$default(this.graph, getState(), null, null, 6, null), init);
    }

    private final Transition<STATE, EVENT, SIDE_EFFECT> getTransition(STATE state, EVENT event) {
        for (Map.Entry<Matcher<EVENT, EVENT>, Function2<STATE, EVENT, Graph.State.TransitionTo<STATE, SIDE_EFFECT>>> entry : getDefinition(state).getTransitions().entrySet()) {
            Matcher<EVENT, EVENT> key = entry.getKey();
            Function2<STATE, EVENT, Graph.State.TransitionTo<STATE, SIDE_EFFECT>> value = entry.getValue();
            if (key.matches(event)) {
                Graph.State.TransitionTo<STATE, SIDE_EFFECT> transitionToInvoke = value.invoke(state, event);
                STATE stateComponent1 = transitionToInvoke.component1();
                SIDE_EFFECT side_effectComponent2 = transitionToInvoke.component2();
                if (transitionToInvoke.getIsDontTransition()) {
                    return new Transition.DontTransition(state, event, side_effectComponent2);
                }
                return new Transition.Valid(state, event, stateComponent1, side_effectComponent2);
            }
        }
        return new Transition.Invalid(state, event);
    }

    private final Graph.State<STATE, EVENT, SIDE_EFFECT> getDefinition(STATE state) {
        Map<Matcher<STATE, STATE>, Graph.State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions = this.graph.getStateDefinitions();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Matcher<STATE, STATE>, Graph.State<STATE, EVENT, SIDE_EFFECT>> entry : stateDefinitions.entrySet()) {
            if (entry.getKey().matches(state)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Graph.State) ((Map.Entry) it.next()).getValue());
        }
        Graph.State<STATE, EVENT, SIDE_EFFECT> state2 = (Graph.State) CollectionsKt.firstOrNull((List) arrayList);
        if (state2 != null) {
            return state2;
        }
        throw new IllegalStateException(("Missing definition for state " + Reflection.getOrCreateKotlinClass(state.getClass()).getSimpleName() + '!').toString());
    }

    private final void notifyOnEnter(STATE state, EVENT event) {
        Iterator<T> it = getDefinition(state).getOnEnterListeners().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void notifyOnExit(STATE state, EVENT event) {
        Iterator<T> it = getDefinition(state).getOnExitListeners().iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(state, event);
        }
    }

    private final void notifyOnTransition(Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT> transition) {
        Iterator<T> it = this.graph.getOnTransitionListeners().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(transition);
        }
    }

    /* compiled from: StateMachine.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0003\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u00020\u0002*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00022\u00020\u0002:\u0003\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00028\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Transition;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "()V", "event", "getEvent", "()Ljava/lang/Object;", "fromState", "getFromState", "DontTransition", "Invalid", "Valid", "Lcom/twilio/util/StateMachine$Transition$DontTransition;", "Lcom/twilio/util/StateMachine$Transition$Invalid;", "Lcom/twilio/util/StateMachine$Transition$Valid;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Transition<STATE, EVENT, SIDE_EFFECT> {
        public /* synthetic */ Transition(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract EVENT getEvent();

        public abstract STATE getFromState();

        private Transition() {
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0002*\n\b\b\u0010\u0004 \u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B)\b\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0007\u0012\u0006\u0010\b\u001a\u00028\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00018\b¢\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0012\u001a\u00028\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\u000e\u0010\u0013\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00018\bHÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u00072\b\b\u0002\u0010\b\u001a\u00028\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0007\u001a\u00028\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00028\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00018\b¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u00028\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Transition$Valid;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "Lcom/twilio/util/StateMachine$Transition;", "fromState", "event", "toState", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFromState", "getSideEffect", "getToState", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Transition$Valid;", "equals", "", "other", "hashCode", "", "toString", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Valid<STATE, EVENT, SIDE_EFFECT> extends Transition<STATE, EVENT, SIDE_EFFECT> {
            private final EVENT event;
            private final STATE fromState;
            private final SIDE_EFFECT sideEffect;
            private final STATE toState;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Valid copy$default(Valid valid, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
                if ((i & 1) != 0) {
                    obj = valid.fromState;
                }
                if ((i & 2) != 0) {
                    obj2 = valid.event;
                }
                if ((i & 4) != 0) {
                    obj3 = valid.toState;
                }
                if ((i & 8) != 0) {
                    obj4 = valid.sideEffect;
                }
                return valid.copy(obj, obj2, obj3, obj4);
            }

            public final STATE component1() {
                return this.fromState;
            }

            public final EVENT component2() {
                return this.event;
            }

            public final STATE component3() {
                return this.toState;
            }

            public final SIDE_EFFECT component4() {
                return this.sideEffect;
            }

            public final Valid<STATE, EVENT, SIDE_EFFECT> copy(STATE fromState, EVENT event, STATE toState, SIDE_EFFECT sideEffect) {
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(toState, "toState");
                return new Valid<>(fromState, event, toState, sideEffect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Valid)) {
                    return false;
                }
                Valid valid = (Valid) other;
                return Intrinsics.areEqual(this.fromState, valid.fromState) && Intrinsics.areEqual(this.event, valid.event) && Intrinsics.areEqual(this.toState, valid.toState) && Intrinsics.areEqual(this.sideEffect, valid.sideEffect);
            }

            public int hashCode() {
                int iHashCode = ((((this.fromState.hashCode() * 31) + this.event.hashCode()) * 31) + this.toState.hashCode()) * 31;
                SIDE_EFFECT side_effect = this.sideEffect;
                return iHashCode + (side_effect == null ? 0 : side_effect.hashCode());
            }

            public String toString() {
                return "Valid(fromState=" + this.fromState + ", event=" + this.event + ", toState=" + this.toState + ", sideEffect=" + this.sideEffect + ')';
            }

            @Override // com.twilio.util.StateMachine.Transition
            public STATE getFromState() {
                return this.fromState;
            }

            @Override // com.twilio.util.StateMachine.Transition
            public EVENT getEvent() {
                return this.event;
            }

            public final STATE getToState() {
                return this.toState;
            }

            public final SIDE_EFFECT getSideEffect() {
                return this.sideEffect;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Valid(STATE fromState, EVENT event, STATE toState, SIDE_EFFECT side_effect) {
                super(null);
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(toState, "toState");
                this.fromState = fromState;
                this.event = event;
                this.toState = toState;
                this.sideEffect = side_effect;
            }
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0002*\n\b\b\u0010\u0004 \u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B!\b\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00018\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0007HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00018\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ@\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\bHÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0007\u001a\u00028\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00028\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00018\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Transition$DontTransition;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "Lcom/twilio/util/StateMachine$Transition;", "fromState", "event", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFromState", "getSideEffect", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Transition$DontTransition;", "equals", "", "other", "hashCode", "", "toString", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DontTransition<STATE, EVENT, SIDE_EFFECT> extends Transition<STATE, EVENT, SIDE_EFFECT> {
            private final EVENT event;
            private final STATE fromState;
            private final SIDE_EFFECT sideEffect;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ DontTransition copy$default(DontTransition dontTransition, Object obj, Object obj2, Object obj3, int i, Object obj4) {
                if ((i & 1) != 0) {
                    obj = dontTransition.fromState;
                }
                if ((i & 2) != 0) {
                    obj2 = dontTransition.event;
                }
                if ((i & 4) != 0) {
                    obj3 = dontTransition.sideEffect;
                }
                return dontTransition.copy(obj, obj2, obj3);
            }

            public final STATE component1() {
                return this.fromState;
            }

            public final EVENT component2() {
                return this.event;
            }

            public final SIDE_EFFECT component3() {
                return this.sideEffect;
            }

            public final DontTransition<STATE, EVENT, SIDE_EFFECT> copy(STATE fromState, EVENT event, SIDE_EFFECT sideEffect) {
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                return new DontTransition<>(fromState, event, sideEffect);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DontTransition)) {
                    return false;
                }
                DontTransition dontTransition = (DontTransition) other;
                return Intrinsics.areEqual(this.fromState, dontTransition.fromState) && Intrinsics.areEqual(this.event, dontTransition.event) && Intrinsics.areEqual(this.sideEffect, dontTransition.sideEffect);
            }

            public int hashCode() {
                int iHashCode = ((this.fromState.hashCode() * 31) + this.event.hashCode()) * 31;
                SIDE_EFFECT side_effect = this.sideEffect;
                return iHashCode + (side_effect == null ? 0 : side_effect.hashCode());
            }

            public String toString() {
                return "DontTransition(fromState=" + this.fromState + ", event=" + this.event + ", sideEffect=" + this.sideEffect + ')';
            }

            @Override // com.twilio.util.StateMachine.Transition
            public STATE getFromState() {
                return this.fromState;
            }

            @Override // com.twilio.util.StateMachine.Transition
            public EVENT getEvent() {
                return this.event;
            }

            public final SIDE_EFFECT getSideEffect() {
                return this.sideEffect;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DontTransition(STATE fromState, EVENT event, SIDE_EFFECT side_effect) {
                super(null);
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                this.fromState = fromState;
                this.event = event;
                this.sideEffect = side_effect;
            }
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0006\u0010\u0001 \u0001*\u00020\u0002*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0002*\n\b\b\u0010\u0004 \u0001*\u00020\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B\u0017\b\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00028\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00028\u0007HÆ\u0003¢\u0006\u0002\u0010\nJ4\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0007HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0007\u001a\u00028\u0007X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00028\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Transition$Invalid;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "Lcom/twilio/util/StateMachine$Transition;", "fromState", "event", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getEvent", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getFromState", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Transition$Invalid;", "equals", "", "other", "hashCode", "", "toString", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class Invalid<STATE, EVENT, SIDE_EFFECT> extends Transition<STATE, EVENT, SIDE_EFFECT> {
            private final EVENT event;
            private final STATE fromState;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Invalid copy$default(Invalid invalid, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    obj = invalid.fromState;
                }
                if ((i & 2) != 0) {
                    obj2 = invalid.event;
                }
                return invalid.copy(obj, obj2);
            }

            public final STATE component1() {
                return this.fromState;
            }

            public final EVENT component2() {
                return this.event;
            }

            public final Invalid<STATE, EVENT, SIDE_EFFECT> copy(STATE fromState, EVENT event) {
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                return new Invalid<>(fromState, event);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Invalid)) {
                    return false;
                }
                Invalid invalid = (Invalid) other;
                return Intrinsics.areEqual(this.fromState, invalid.fromState) && Intrinsics.areEqual(this.event, invalid.event);
            }

            public int hashCode() {
                return (this.fromState.hashCode() * 31) + this.event.hashCode();
            }

            public String toString() {
                return "Invalid(fromState=" + this.fromState + ", event=" + this.event + ')';
            }

            @Override // com.twilio.util.StateMachine.Transition
            public STATE getFromState() {
                return this.fromState;
            }

            @Override // com.twilio.util.StateMachine.Transition
            public EVENT getEvent() {
                return this.event;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Invalid(STATE fromState, EVENT event) {
                super(null);
                Intrinsics.checkNotNullParameter(fromState, "fromState");
                Intrinsics.checkNotNullParameter(event, "event");
                this.fromState = fromState;
                this.event = event;
            }
        }
    }

    /* compiled from: StateMachine.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001#Bk\u0012\u0006\u0010\u0005\u001a\u00028\u0003\u00120\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007\u0012*\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J3\u0010\u0018\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007HÆ\u0003J-\u0010\u0019\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bHÆ\u0003J\u008c\u0001\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u000322\b\u0002\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u00072,\b\u0002\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R5\u0010\n\u001a&\u0012\"\u0012 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R;\u0010\u0006\u001a,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00030\b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Graph;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "initialState", "stateDefinitions", "", "Lcom/twilio/util/StateMachine$Matcher;", "Lcom/twilio/util/StateMachine$Graph$State;", "onTransitionListeners", "", "Lkotlin/Function1;", "Lcom/twilio/util/StateMachine$Transition;", "", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)V", "getInitialState", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOnTransitionListeners", "()Ljava/util/List;", "getStateDefinitions", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;)Lcom/twilio/util/StateMachine$Graph;", "equals", "", "other", "hashCode", "", "toString", "", "State", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class Graph<STATE, EVENT, SIDE_EFFECT> {
        private final STATE initialState;
        private final List<Function1<Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners;
        private final Map<Matcher<STATE, STATE>, State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Graph copy$default(Graph graph, Object obj, Map map, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = graph.initialState;
            }
            if ((i & 2) != 0) {
                map = graph.stateDefinitions;
            }
            if ((i & 4) != 0) {
                list = graph.onTransitionListeners;
            }
            return graph.copy(obj, map, list);
        }

        public final STATE component1() {
            return this.initialState;
        }

        public final Map<Matcher<STATE, STATE>, State<STATE, EVENT, SIDE_EFFECT>> component2() {
            return this.stateDefinitions;
        }

        public final List<Function1<Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> component3() {
            return this.onTransitionListeners;
        }

        public final Graph<STATE, EVENT, SIDE_EFFECT> copy(STATE initialState, Map<Matcher<STATE, STATE>, State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions, List<? extends Function1<? super Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNullParameter(stateDefinitions, "stateDefinitions");
            Intrinsics.checkNotNullParameter(onTransitionListeners, "onTransitionListeners");
            return new Graph<>(initialState, stateDefinitions, onTransitionListeners);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Graph)) {
                return false;
            }
            Graph graph = (Graph) other;
            return Intrinsics.areEqual(this.initialState, graph.initialState) && Intrinsics.areEqual(this.stateDefinitions, graph.stateDefinitions) && Intrinsics.areEqual(this.onTransitionListeners, graph.onTransitionListeners);
        }

        public int hashCode() {
            return (((this.initialState.hashCode() * 31) + this.stateDefinitions.hashCode()) * 31) + this.onTransitionListeners.hashCode();
        }

        public String toString() {
            return "Graph(initialState=" + this.initialState + ", stateDefinitions=" + this.stateDefinitions + ", onTransitionListeners=" + this.onTransitionListeners + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Graph(STATE initialState, Map<Matcher<STATE, STATE>, State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions, List<? extends Function1<? super Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNullParameter(stateDefinitions, "stateDefinitions");
            Intrinsics.checkNotNullParameter(onTransitionListeners, "onTransitionListeners");
            this.initialState = initialState;
            this.stateDefinitions = stateDefinitions;
            this.onTransitionListeners = onTransitionListeners;
        }

        public final STATE getInitialState() {
            return this.initialState;
        }

        public final Map<Matcher<STATE, STATE>, State<STATE, EVENT, SIDE_EFFECT>> getStateDefinitions() {
            return this.stateDefinitions;
        }

        public final List<Function1<Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> getOnTransitionListeners() {
            return this.onTransitionListeners;
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00020\u0002*\b\b\u0007\u0010\u0003*\u00020\u0002*\b\b\b\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001\u0015B\u0007\b\u0000¢\u0006\u0002\u0010\u0005R)\u0010\u0006\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR)\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0081\u0001\u0010\u000e\u001ar\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00110\b0\u000fj8\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00070\u0010\u0012\"\u0012 \u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\b0\u00110\b`\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Graph$State;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "()V", "onEnterListeners", "", "Lkotlin/Function2;", "", "getOnEnterListeners", "()Ljava/util/List;", "onExitListeners", "getOnExitListeners", "transitions", "Ljava/util/LinkedHashMap;", "Lcom/twilio/util/StateMachine$Matcher;", "Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "Lkotlin/collections/LinkedHashMap;", "getTransitions", "()Ljava/util/LinkedHashMap;", "TransitionTo", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class State<STATE, EVENT, SIDE_EFFECT> {
            private final List<Function2<STATE, EVENT, Unit>> onEnterListeners = new ArrayList();
            private final List<Function2<STATE, EVENT, Unit>> onExitListeners = new ArrayList();
            private final LinkedHashMap<Matcher<EVENT, EVENT>, Function2<STATE, EVENT, TransitionTo<STATE, SIDE_EFFECT>>> transitions = new LinkedHashMap<>();

            public final List<Function2<STATE, EVENT, Unit>> getOnEnterListeners() {
                return this.onEnterListeners;
            }

            public final List<Function2<STATE, EVENT, Unit>> getOnExitListeners() {
                return this.onExitListeners;
            }

            public final LinkedHashMap<Matcher<EVENT, EVENT>, Function2<STATE, EVENT, TransitionTo<STATE, SIDE_EFFECT>>> getTransitions() {
                return this.transitions;
            }

            /* compiled from: StateMachine.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\n\b\t\u0010\u0001 \u0001*\u00020\u0002*\n\b\n\u0010\u0003 \u0001*\u00020\u00022\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00028\t\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\n\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00028\tHÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00018\nHÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J:\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0\u00002\b\b\u0002\u0010\u0004\u001a\u00028\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\n¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00028\t¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "STATE", "", "SIDE_EFFECT", "toState", "sideEffect", "isDontTransition", "", "(Ljava/lang/Object;Ljava/lang/Object;Z)V", "()Z", "getSideEffect", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getToState", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Z)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "equals", "other", "hashCode", "", "toString", "", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final /* data */ class TransitionTo<STATE, SIDE_EFFECT> {
                private final boolean isDontTransition;
                private final SIDE_EFFECT sideEffect;
                private final STATE toState;

                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ TransitionTo copy$default(TransitionTo transitionTo, Object obj, Object obj2, boolean z, int i, Object obj3) {
                    if ((i & 1) != 0) {
                        obj = transitionTo.toState;
                    }
                    if ((i & 2) != 0) {
                        obj2 = transitionTo.sideEffect;
                    }
                    if ((i & 4) != 0) {
                        z = transitionTo.isDontTransition;
                    }
                    return transitionTo.copy(obj, obj2, z);
                }

                public final STATE component1() {
                    return this.toState;
                }

                public final SIDE_EFFECT component2() {
                    return this.sideEffect;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getIsDontTransition() {
                    return this.isDontTransition;
                }

                public final TransitionTo<STATE, SIDE_EFFECT> copy(STATE toState, SIDE_EFFECT sideEffect, boolean isDontTransition) {
                    Intrinsics.checkNotNullParameter(toState, "toState");
                    return new TransitionTo<>(toState, sideEffect, isDontTransition);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TransitionTo)) {
                        return false;
                    }
                    TransitionTo transitionTo = (TransitionTo) other;
                    return Intrinsics.areEqual(this.toState, transitionTo.toState) && Intrinsics.areEqual(this.sideEffect, transitionTo.sideEffect) && this.isDontTransition == transitionTo.isDontTransition;
                }

                public int hashCode() {
                    int iHashCode = this.toState.hashCode() * 31;
                    SIDE_EFFECT side_effect = this.sideEffect;
                    return ((iHashCode + (side_effect == null ? 0 : side_effect.hashCode())) * 31) + Boolean.hashCode(this.isDontTransition);
                }

                public String toString() {
                    return "TransitionTo(toState=" + this.toState + ", sideEffect=" + this.sideEffect + ", isDontTransition=" + this.isDontTransition + ')';
                }

                public TransitionTo(STATE toState, SIDE_EFFECT side_effect, boolean z) {
                    Intrinsics.checkNotNullParameter(toState, "toState");
                    this.toState = toState;
                    this.sideEffect = side_effect;
                    this.isDontTransition = z;
                }

                public final STATE getToState() {
                    return this.toState;
                }

                public final SIDE_EFFECT getSideEffect() {
                    return this.sideEffect;
                }

                public final boolean isDontTransition() {
                    return this.isDontTransition;
                }
            }
        }
    }

    /* compiled from: StateMachine.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0011*\b\b\u0003\u0010\u0001*\u00020\u0002*\n\b\u0004\u0010\u0003 \u0001*\u0002H\u00012\u00020\u0002:\u0001\u0011B\u0015\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0003¢\u0006\u0002\u0010\rJ+\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00040\u0005X\u0088\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Matcher;", "T", "", "R", "clazz", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)V", "predicates", "", "Lkotlin/Function1;", "", "matches", "value", "(Ljava/lang/Object;)Z", "where", "predicate", "Lkotlin/ExtensionFunctionType;", "Companion", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Matcher<T, R extends T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final KClass<R> clazz;
        private final List<Function1<T, Boolean>> predicates;

        public /* synthetic */ Matcher(KClass kClass, DefaultConstructorMarker defaultConstructorMarker) {
            this(kClass);
        }

        private Matcher(KClass<R> kClass) {
            this.clazz = kClass;
            this.predicates = CollectionsKt.mutableListOf(new Function1<T, Boolean>(this) { // from class: com.twilio.util.StateMachine$Matcher$predicates$1
                final /* synthetic */ StateMachine.Matcher<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(((StateMachine.Matcher) this.this$0).clazz.isInstance(it));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((StateMachine$Matcher$predicates$1<T>) obj);
                }
            });
        }

        public final Matcher<T, R> where(final Function1<? super R, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            this.predicates.add(new Function1<T, Boolean>() { // from class: com.twilio.util.StateMachine$Matcher$where$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((StateMachine$Matcher$where$1$1<T>) obj);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(T it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return predicate.invoke(it);
                }
            });
            return this;
        }

        public final boolean matches(T value) {
            Intrinsics.checkNotNullParameter(value, "value");
            List<Function1<T, Boolean>> list = this.predicates;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((Function1) it.next()).invoke(value)).booleanValue()) {
                    return false;
                }
            }
            return true;
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\n\b\u0006\u0010\u0006\u0018\u0001*\u0002H\u0005H\u0086\bJ4\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\b\b\u0006\u0010\u0006*\u0002H\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bJ8\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\b\b\u0005\u0010\u0005*\u00020\u0001\"\n\b\u0006\u0010\u0006\u0018\u0001*\u0002H\u00052\u0006\u0010\n\u001a\u0002H\u0006H\u0086\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Matcher$Companion;", "", "()V", "any", "Lcom/twilio/util/StateMachine$Matcher;", "T", "R", "clazz", "Lkotlin/reflect/KClass;", "eq", "value", "(Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Matcher;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final <T, R extends T> Matcher<T, R> any(KClass<R> clazz) {
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                return new Matcher<>(clazz, null);
            }

            public final /* synthetic */ <T, R extends T> Matcher<T, R> any() {
                Intrinsics.reifiedOperationMarker(4, "R");
                return any(Reflection.getOrCreateKotlinClass(Object.class));
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: eq */
            public final /* synthetic */ <T, R extends T> Matcher<T, R> m3187eq(final R value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.reifiedOperationMarker(4, "R");
                Matcher matcherAny = any(Reflection.getOrCreateKotlinClass(Object.class));
                Intrinsics.needClassReification();
                return matcherAny.where(new Function1<R, Boolean>() { // from class: com.twilio.util.StateMachine$Matcher$Companion$eq$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(R where) {
                        Intrinsics.checkNotNullParameter(where, "$this$where");
                        return Boolean.valueOf(Intrinsics.areEqual(where, value));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((StateMachine$Matcher$Companion$eq$1<R>) obj);
                    }
                });
            }
        }
    }

    /* compiled from: StateMachine.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0001*\u00020\u0002*\b\b\u0004\u0010\u0003*\u00020\u0002*\b\b\u0005\u0010\u0004*\u00020\u00022\u00020\u0002:\u0001!B#\u0012\u001c\b\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0006J\u0013\u0010\b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0003¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u000e2$\u0010\u0019\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e0\fJ\\\u0010\u001a\u001a\u00020\u000e\"\n\b\u0006\u0010\u001b\u0018\u0001*\u00028\u00032\u0006\u0010\u001a\u001a\u0002H\u001b25\b\b\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u001fJO\u0010\u001a\u001a\u00020\u000e\"\n\b\u0006\u0010\u001b\u0018\u0001*\u00028\u000325\b\b\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eH\u0086\bø\u0001\u0000JY\u0010\u001a\u001a\u00020\u000e\"\b\b\u0006\u0010\u001b*\u00028\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u0002H\u001b0\u001323\u0010\u001c\u001a/\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u001b0\u001dR\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0000\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u001eR\u0012\u0010\b\u001a\u0004\u0018\u00018\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR§\u0001\u0010\n\u001a\u009a\u0001\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e \u000f*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f0\u000bjL\u0012H\u0012F\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e \u000f*\"\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000RÃ\u0001\u0010\u0011\u001a¶\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u000f*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00130\u0013\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u000f*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00140\u00140\u0012jZ\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003 \u000f*\u0010\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u00130\u0013\u00120\u0012.\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005 \u000f*\u0016\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0018\u00010\u00140\u0014`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, m3636d2 = {"Lcom/twilio/util/StateMachine$GraphBuilder;", "STATE", "", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "graph", "Lcom/twilio/util/StateMachine$Graph;", "(Lcom/twilio/util/StateMachine$Graph;)V", "initialState", "Ljava/lang/Object;", "onTransitionListeners", "Ljava/util/ArrayList;", "Lkotlin/Function1;", "Lcom/twilio/util/StateMachine$Transition;", "", "kotlin.jvm.PlatformType", "Lkotlin/collections/ArrayList;", "stateDefinitions", "Ljava/util/LinkedHashMap;", "Lcom/twilio/util/StateMachine$Matcher;", "Lcom/twilio/util/StateMachine$Graph$State;", "Lkotlin/collections/LinkedHashMap;", "build", "(Ljava/lang/Object;)V", "onTransition", "listener", "state", "S", "init", "Lcom/twilio/util/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "stateMatcher", "StateDefinitionBuilder", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class GraphBuilder<STATE, EVENT, SIDE_EFFECT> {
        private STATE initialState;
        private final ArrayList<Function1<Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners;
        private final LinkedHashMap<Matcher<STATE, STATE>, Graph.State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions;

        /* JADX WARN: Multi-variable type inference failed */
        public GraphBuilder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public GraphBuilder(Graph<STATE, EVENT, SIDE_EFFECT> graph) {
            List<Function1<Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit>> onTransitionListeners;
            Map<Matcher<STATE, STATE>, Graph.State<STATE, EVENT, SIDE_EFFECT>> stateDefinitions;
            this.initialState = graph != null ? graph.getInitialState() : null;
            this.stateDefinitions = new LinkedHashMap<>((graph == null || (stateDefinitions = graph.getStateDefinitions()) == null) ? MapsKt.emptyMap() : stateDefinitions);
            this.onTransitionListeners = new ArrayList<>((graph == null || (onTransitionListeners = graph.getOnTransitionListeners()) == null) ? CollectionsKt.emptyList() : onTransitionListeners);
        }

        public /* synthetic */ GraphBuilder(Graph graph, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : graph);
        }

        public final void initialState(STATE initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            this.initialState = initialState;
        }

        public final <S extends STATE> void state(Matcher<STATE, ? extends S> stateMatcher, Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>.StateDefinitionBuilder<S>, Unit> init) {
            Intrinsics.checkNotNullParameter(stateMatcher, "stateMatcher");
            Intrinsics.checkNotNullParameter(init, "init");
            LinkedHashMap<Matcher<STATE, STATE>, Graph.State<STATE, EVENT, SIDE_EFFECT>> linkedHashMap = this.stateDefinitions;
            StateDefinitionBuilder stateDefinitionBuilder = new StateDefinitionBuilder();
            init.invoke(stateDefinitionBuilder);
            linkedHashMap.put(stateMatcher, stateDefinitionBuilder.build());
        }

        public final /* synthetic */ <S extends STATE> void state(Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>.StateDefinitionBuilder<S>, Unit> init) {
            Intrinsics.checkNotNullParameter(init, "init");
            Matcher.Companion companion = Matcher.INSTANCE;
            Intrinsics.reifiedOperationMarker(4, "S");
            state((Matcher) companion.any(Reflection.getOrCreateKotlinClass(Object.class)), (Function1) init);
        }

        public final /* synthetic */ <S extends STATE> void state(final S state, Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>.StateDefinitionBuilder<S>, Unit> init) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(init, "init");
            Matcher.Companion companion = Matcher.INSTANCE;
            Intrinsics.reifiedOperationMarker(4, "S");
            Matcher matcherAny = companion.any(Reflection.getOrCreateKotlinClass(Object.class));
            Intrinsics.needClassReification();
            state((Matcher) matcherAny.where(new Function1<S, Boolean>() { // from class: com.twilio.util.StateMachine$GraphBuilder$state$$inlined$eq$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(S where) {
                    Intrinsics.checkNotNullParameter(where, "$this$where");
                    return Boolean.valueOf(Intrinsics.areEqual(where, state));
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                    return invoke((StateMachine$GraphBuilder$state$$inlined$eq$1<S>) obj);
                }
            }), (Function1) init);
        }

        public final void onTransition(Function1<? super Transition<? extends STATE, ? extends EVENT, ? extends SIDE_EFFECT>, Unit> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.onTransitionListeners.add(listener);
        }

        public final Graph<STATE, EVENT, SIDE_EFFECT> build() {
            STATE state = this.initialState;
            if (state != null) {
                return new Graph<>(state, MapsKt.toMap(this.stateDefinitions), CollectionsKt.toList(this.onTransitionListeners));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        /* compiled from: StateMachine.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00028\u00032\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u0007\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u0004H\u0086\bJ\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005J.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\u000b0\u0007\"\n\b\u0007\u0010\u000b\u0018\u0001*\u00028\u00042\u0006\u0010\f\u001a\u0002H\u000bH\u0086\b¢\u0006\u0002\u0010\rJR\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042\u0006\u0010\u0010\u001a\u0002H\b2+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0015JE\u0010\u000e\u001a\u00020\u000f\"\n\b\u0007\u0010\b\u0018\u0001*\u00028\u00042+\b\b\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014H\u0086\bø\u0001\u0000JO\u0010\u000e\u001a\u00020\u000f\"\b\b\u0007\u0010\b*\u00028\u00042\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u0002H\b0\u00072)\u0010\u0011\u001a%\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u0002H\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u00130\u0012¢\u0006\u0002\b\u0014J%\u0010\u0017\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J%\u0010\u001a\u001a\u00020\u00182\u001d\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00020\u000f0\u0012¢\u0006\u0002\b\u0014J'\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u00062\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u0005¢\u0006\u0002\u0010\u001dJ9\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00050\u0013*\u00028\u00062\u0006\u0010\u001f\u001a\u00028\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00018\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0002\u0010 R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, m3636d2 = {"Lcom/twilio/util/StateMachine$GraphBuilder$StateDefinitionBuilder;", "S", "", "(Lcom/twilio/util/StateMachine$GraphBuilder;)V", "stateDefinition", "Lcom/twilio/util/StateMachine$Graph$State;", "any", "Lcom/twilio/util/StateMachine$Matcher;", "E", "build", "eq", "R", "value", "(Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Matcher;", "on", "", "event", "createTransitionTo", "Lkotlin/Function2;", "Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "eventMatcher", "onEnter", "", "listener", "onExit", "dontTransition", "sideEffect", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "transitionTo", "state", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Lcom/twilio/util/StateMachine$Graph$State$TransitionTo;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        @SourceDebugExtension
        public final class StateDefinitionBuilder<S extends STATE> {
            private final Graph.State<STATE, EVENT, SIDE_EFFECT> stateDefinition = new Graph.State<>();

            public StateDefinitionBuilder() {
            }

            public final /* synthetic */ <E extends EVENT> Matcher<EVENT, E> any() {
                Matcher.Companion companion = Matcher.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "E");
                return companion.any(Reflection.getOrCreateKotlinClass(Object.class));
            }

            /* renamed from: on */
            public final /* synthetic */ <E extends EVENT> void m3186on(Function2<? super S, ? super E, ? extends Graph.State.TransitionTo<? extends STATE, ? extends SIDE_EFFECT>> createTransitionTo) {
                Intrinsics.checkNotNullParameter(createTransitionTo, "createTransitionTo");
                Matcher.Companion companion = Matcher.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "E");
                m3184on((Matcher) companion.any(Reflection.getOrCreateKotlinClass(Object.class)), (Function2) createTransitionTo);
            }

            /* renamed from: eq */
            public final /* synthetic */ <R extends EVENT> Matcher<EVENT, R> m3183eq(final R value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Matcher.Companion companion = Matcher.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "R");
                Matcher matcherAny = companion.any(Reflection.getOrCreateKotlinClass(Object.class));
                Intrinsics.needClassReification();
                return matcherAny.where(new Function1<R, Boolean>() { // from class: com.twilio.util.StateMachine$GraphBuilder$StateDefinitionBuilder$eq$$inlined$eq$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(R where) {
                        Intrinsics.checkNotNullParameter(where, "$this$where");
                        return Boolean.valueOf(Intrinsics.areEqual(where, value));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((C43528xad3ddf62<R>) obj);
                    }
                });
            }

            /* renamed from: on */
            public final /* synthetic */ <E extends EVENT> void m3185on(final E event, Function2<? super S, ? super E, ? extends Graph.State.TransitionTo<? extends STATE, ? extends SIDE_EFFECT>> createTransitionTo) {
                Intrinsics.checkNotNullParameter(event, "event");
                Intrinsics.checkNotNullParameter(createTransitionTo, "createTransitionTo");
                Matcher.Companion companion = Matcher.INSTANCE;
                Intrinsics.reifiedOperationMarker(4, "E");
                Matcher matcherAny = companion.any(Reflection.getOrCreateKotlinClass(Object.class));
                Intrinsics.needClassReification();
                m3184on((Matcher) matcherAny.where(new Function1<E, Boolean>() { // from class: com.twilio.util.StateMachine$GraphBuilder$StateDefinitionBuilder$on$$inlined$eq$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(E where) {
                        Intrinsics.checkNotNullParameter(where, "$this$where");
                        return Boolean.valueOf(Intrinsics.areEqual(where, event));
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                        return invoke((C43529x6f5e4b55<E>) obj);
                    }
                }), (Function2) createTransitionTo);
            }

            /* renamed from: on */
            public final <E extends EVENT> void m3184on(Matcher<EVENT, ? extends E> eventMatcher, final Function2<? super S, ? super E, ? extends Graph.State.TransitionTo<? extends STATE, ? extends SIDE_EFFECT>> createTransitionTo) {
                Intrinsics.checkNotNullParameter(eventMatcher, "eventMatcher");
                Intrinsics.checkNotNullParameter(createTransitionTo, "createTransitionTo");
                this.stateDefinition.getTransitions().put(eventMatcher, new Function2<STATE, EVENT, Graph.State.TransitionTo<? extends STATE, ? extends SIDE_EFFECT>>() { // from class: com.twilio.util.StateMachine$GraphBuilder$StateDefinitionBuilder$on$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return invoke((StateMachine$GraphBuilder$StateDefinitionBuilder$on$1<EVENT, SIDE_EFFECT, STATE>) obj, obj2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final StateMachine.Graph.State.TransitionTo<STATE, SIDE_EFFECT> invoke(STATE state, EVENT event) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(event, "event");
                        return createTransitionTo.invoke(state, event);
                    }
                });
            }

            public final boolean onEnter(final Function2<? super S, ? super EVENT, Unit> listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                return this.stateDefinition.getOnEnterListeners().add(new Function2<STATE, EVENT, Unit>() { // from class: com.twilio.util.StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                        invoke2((StateMachine$GraphBuilder$StateDefinitionBuilder$onEnter$1$1<EVENT, STATE>) obj, obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(STATE state, EVENT cause) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(cause, "cause");
                        listener.invoke(state, cause);
                    }
                });
            }

            public final boolean onExit(final Function2<? super S, ? super EVENT, Unit> listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                return this.stateDefinition.getOnExitListeners().add(new Function2<STATE, EVENT, Unit>() { // from class: com.twilio.util.StateMachine$GraphBuilder$StateDefinitionBuilder$onExit$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                        invoke2((StateMachine$GraphBuilder$StateDefinitionBuilder$onExit$1$1<EVENT, STATE>) obj, obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(STATE state, EVENT cause) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(cause, "cause");
                        listener.invoke(state, cause);
                    }
                });
            }

            public final Graph.State<STATE, EVENT, SIDE_EFFECT> build() {
                return this.stateDefinition;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Graph.State.TransitionTo transitionTo$default(StateDefinitionBuilder stateDefinitionBuilder, Object obj, Object obj2, Object obj3, boolean z, int i, Object obj4) {
                if ((i & 2) != 0) {
                    obj3 = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                return stateDefinitionBuilder.transitionTo(obj, obj2, obj3, z);
            }

            public final Graph.State.TransitionTo<STATE, SIDE_EFFECT> transitionTo(S s, STATE state, SIDE_EFFECT side_effect, boolean z) {
                Intrinsics.checkNotNullParameter(s, "<this>");
                Intrinsics.checkNotNullParameter(state, "state");
                return new Graph.State.TransitionTo<>(state, side_effect, z);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Graph.State.TransitionTo dontTransition$default(StateDefinitionBuilder stateDefinitionBuilder, Object obj, Object obj2, int i, Object obj3) {
                if ((i & 1) != 0) {
                    obj2 = null;
                }
                return stateDefinitionBuilder.dontTransition(obj, obj2);
            }

            public final Graph.State.TransitionTo<STATE, SIDE_EFFECT> dontTransition(S s, SIDE_EFFECT side_effect) {
                Intrinsics.checkNotNullParameter(s, "<this>");
                return transitionTo(s, s, side_effect, true);
            }
        }
    }

    /* compiled from: StateMachine.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u007f\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0001\"\b\b\u0004\u0010\u0006*\u00020\u0001\"\b\b\u0005\u0010\u0007*\u00020\u00012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\t2)\u0010\n\u001a%\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0002Ja\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0004\"\b\b\u0003\u0010\u0005*\u00020\u0001\"\b\b\u0004\u0010\u0006*\u00020\u0001\"\b\b\u0005\u0010\u0007*\u00020\u00012)\u0010\n\u001a%\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/twilio/util/StateMachine$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/twilio/util/StateMachine;", "STATE", Constants.API_TYPE_EVENT, "SIDE_EFFECT", "graph", "Lcom/twilio/util/StateMachine$Graph;", "init", "Lkotlin/Function1;", "Lcom/twilio/util/StateMachine$GraphBuilder;", "", "Lkotlin/ExtensionFunctionType;", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <STATE, EVENT, SIDE_EFFECT> StateMachine<STATE, EVENT, SIDE_EFFECT> create(Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>, Unit> init) {
            Intrinsics.checkNotNullParameter(init, "init");
            return create(null, init);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <STATE, EVENT, SIDE_EFFECT> StateMachine<STATE, EVENT, SIDE_EFFECT> create(Graph<STATE, EVENT, SIDE_EFFECT> graph, Function1<? super GraphBuilder<STATE, EVENT, SIDE_EFFECT>, Unit> init) {
            GraphBuilder graphBuilder = new GraphBuilder(graph);
            init.invoke(graphBuilder);
            return new StateMachine<>(graphBuilder.build(), null);
        }
    }
}

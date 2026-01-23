package com.robinhood.disposer;

import io.reactivex.Observable;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0000R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/disposer/LifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "DEAD", "CREATED", "STARTED", "RESUMED", "transitionToDead", "Lcom/robinhood/disposer/LifecycleState$Transition;", "getTransitionToDead", "()Lcom/robinhood/disposer/LifecycleState$Transition;", "transitionToCreated", "getTransitionToCreated", "transitionToStarted", "getTransitionToStarted", "transitionToResumed", "getTransitionToResumed", "transitionTo", "other", "Transition", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class LifecycleState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LifecycleState[] $VALUES;
    public static final LifecycleState CREATED;
    public static final LifecycleState DEAD;
    public static final LifecycleState RESUMED;
    public static final LifecycleState STARTED;
    private static final Transition TRANSITION_CREATED_TO_CREATED;
    private static final Transition TRANSITION_CREATED_TO_DEAD;
    private static final Transition TRANSITION_CREATED_TO_RESUMED;
    private static final Transition TRANSITION_CREATED_TO_STARTED;
    private static final Transition TRANSITION_DEAD_TO_CREATED;
    private static final Transition TRANSITION_DEAD_TO_DEAD;
    private static final Transition TRANSITION_DEAD_TO_RESUMED;
    private static final Transition TRANSITION_DEAD_TO_STARTED;
    private static final Transition TRANSITION_RESUMED_TO_CREATED;
    private static final Transition TRANSITION_RESUMED_TO_DEAD;
    private static final Transition TRANSITION_RESUMED_TO_RESUMED;
    private static final Transition TRANSITION_RESUMED_TO_STARTED;
    private static final Transition TRANSITION_STARTED_TO_CREATED;
    private static final Transition TRANSITION_STARTED_TO_DEAD;
    private static final Transition TRANSITION_STARTED_TO_RESUMED;
    private static final Transition TRANSITION_STARTED_TO_STARTED;

    /* compiled from: Disposer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            try {
                iArr[LifecycleState.DEAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleState.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleState.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LifecycleState.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ LifecycleState[] $values() {
        return new LifecycleState[]{DEAD, CREATED, STARTED, RESUMED};
    }

    public /* synthetic */ LifecycleState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<LifecycleState> getEntries() {
        return $ENTRIES;
    }

    public abstract Transition getTransitionToCreated();

    public abstract Transition getTransitionToDead();

    public abstract Transition getTransitionToResumed();

    public abstract Transition getTransitionToStarted();

    private LifecycleState(String str, int i) {
    }

    static {
        LifecycleState lifecycleState = new LifecycleState("DEAD", 0) { // from class: com.robinhood.disposer.LifecycleState.DEAD
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToDead() {
                return LifecycleState.TRANSITION_DEAD_TO_DEAD;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToCreated() {
                return LifecycleState.TRANSITION_DEAD_TO_CREATED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToStarted() {
                return LifecycleState.TRANSITION_DEAD_TO_STARTED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToResumed() {
                return LifecycleState.TRANSITION_DEAD_TO_RESUMED;
            }
        };
        DEAD = lifecycleState;
        LifecycleState lifecycleState2 = new LifecycleState("CREATED", 1) { // from class: com.robinhood.disposer.LifecycleState.CREATED
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToDead() {
                return LifecycleState.TRANSITION_CREATED_TO_DEAD;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToCreated() {
                return LifecycleState.TRANSITION_CREATED_TO_CREATED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToStarted() {
                return LifecycleState.TRANSITION_CREATED_TO_STARTED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToResumed() {
                return LifecycleState.TRANSITION_CREATED_TO_RESUMED;
            }
        };
        CREATED = lifecycleState2;
        LifecycleState lifecycleState3 = new LifecycleState("STARTED", 2) { // from class: com.robinhood.disposer.LifecycleState.STARTED
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToDead() {
                return LifecycleState.TRANSITION_STARTED_TO_DEAD;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToCreated() {
                return LifecycleState.TRANSITION_STARTED_TO_CREATED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToStarted() {
                return LifecycleState.TRANSITION_STARTED_TO_STARTED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToResumed() {
                return LifecycleState.TRANSITION_STARTED_TO_RESUMED;
            }
        };
        STARTED = lifecycleState3;
        LifecycleState lifecycleState4 = new LifecycleState("RESUMED", 3) { // from class: com.robinhood.disposer.LifecycleState.RESUMED
            {
                DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToDead() {
                return LifecycleState.TRANSITION_RESUMED_TO_DEAD;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToCreated() {
                return LifecycleState.TRANSITION_RESUMED_TO_CREATED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToStarted() {
                return LifecycleState.TRANSITION_RESUMED_TO_STARTED;
            }

            @Override // com.robinhood.disposer.LifecycleState
            public Transition getTransitionToResumed() {
                return LifecycleState.TRANSITION_RESUMED_TO_RESUMED;
            }
        };
        RESUMED = lifecycleState4;
        LifecycleState[] lifecycleStateArr$values = $values();
        $VALUES = lifecycleStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lifecycleStateArr$values);
        INSTANCE = new Companion(null);
        TRANSITION_DEAD_TO_DEAD = new Transition(lifecycleState, lifecycleState, CollectionsKt.emptyList());
        LifecycleEvent lifecycleEvent = LifecycleEvent.ON_CREATE;
        TRANSITION_DEAD_TO_CREATED = new Transition(lifecycleState, lifecycleState2, CollectionsKt.listOf(lifecycleEvent));
        LifecycleEvent lifecycleEvent2 = LifecycleEvent.ON_START;
        TRANSITION_DEAD_TO_STARTED = new Transition(lifecycleState, lifecycleState3, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent, lifecycleEvent2}));
        LifecycleEvent lifecycleEvent3 = LifecycleEvent.ON_RESUME;
        TRANSITION_DEAD_TO_RESUMED = new Transition(lifecycleState, lifecycleState4, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent, lifecycleEvent2, lifecycleEvent3}));
        LifecycleEvent lifecycleEvent4 = LifecycleEvent.ON_DESTROY;
        TRANSITION_CREATED_TO_DEAD = new Transition(lifecycleState2, lifecycleState, CollectionsKt.listOf(lifecycleEvent4));
        TRANSITION_CREATED_TO_CREATED = new Transition(lifecycleState2, lifecycleState2, CollectionsKt.emptyList());
        TRANSITION_CREATED_TO_STARTED = new Transition(lifecycleState2, lifecycleState3, CollectionsKt.listOf(lifecycleEvent2));
        TRANSITION_CREATED_TO_RESUMED = new Transition(lifecycleState2, lifecycleState4, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent2, lifecycleEvent3}));
        LifecycleEvent lifecycleEvent5 = LifecycleEvent.ON_STOP;
        TRANSITION_STARTED_TO_DEAD = new Transition(lifecycleState3, lifecycleState, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent5, lifecycleEvent4}));
        TRANSITION_STARTED_TO_CREATED = new Transition(lifecycleState3, lifecycleState2, CollectionsKt.listOf(lifecycleEvent5));
        TRANSITION_STARTED_TO_STARTED = new Transition(lifecycleState3, lifecycleState3, CollectionsKt.emptyList());
        TRANSITION_STARTED_TO_RESUMED = new Transition(lifecycleState3, lifecycleState4, CollectionsKt.listOf(lifecycleEvent3));
        LifecycleEvent lifecycleEvent6 = LifecycleEvent.ON_PAUSE;
        TRANSITION_RESUMED_TO_DEAD = new Transition(lifecycleState4, lifecycleState, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent6, lifecycleEvent5, lifecycleEvent4}));
        TRANSITION_RESUMED_TO_CREATED = new Transition(lifecycleState4, lifecycleState2, CollectionsKt.listOf((Object[]) new LifecycleEvent[]{lifecycleEvent6, lifecycleEvent5}));
        TRANSITION_RESUMED_TO_STARTED = new Transition(lifecycleState4, lifecycleState3, CollectionsKt.listOf(lifecycleEvent6));
        TRANSITION_RESUMED_TO_RESUMED = new Transition(lifecycleState4, lifecycleState4, CollectionsKt.emptyList());
    }

    public final Transition transitionTo(LifecycleState other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = WhenMappings.$EnumSwitchMapping$0[other.ordinal()];
        if (i == 1) {
            return getTransitionToDead();
        }
        if (i == 2) {
            return getTransitionToCreated();
        }
        if (i == 3) {
            return getTransitionToStarted();
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return getTransitionToResumed();
    }

    /* compiled from: Disposer.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/disposer/LifecycleState$Transition;", "", "fromState", "Lcom/robinhood/disposer/LifecycleState;", "toState", "events", "", "Lcom/robinhood/disposer/LifecycleEvent;", "<init>", "(Lcom/robinhood/disposer/LifecycleState;Lcom/robinhood/disposer/LifecycleState;Ljava/util/List;)V", "getFromState", "()Lcom/robinhood/disposer/LifecycleState;", "getToState", "getEvents", "()Ljava/util/List;", "eventsObservable", "Lio/reactivex/Observable;", "getEventsObservable", "()Lio/reactivex/Observable;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Transition {
        public static final int $stable = 8;
        private final List<LifecycleEvent> events;
        private final Observable<LifecycleEvent> eventsObservable;
        private final LifecycleState fromState;
        private final LifecycleState toState;

        /* JADX WARN: Multi-variable type inference failed */
        public Transition(LifecycleState fromState, LifecycleState toState, List<? extends LifecycleEvent> events) {
            Intrinsics.checkNotNullParameter(fromState, "fromState");
            Intrinsics.checkNotNullParameter(toState, "toState");
            Intrinsics.checkNotNullParameter(events, "events");
            this.fromState = fromState;
            this.toState = toState;
            this.events = events;
            LifecycleEvent[] lifecycleEventArr = (LifecycleEvent[]) events.toArray(new LifecycleEvent[0]);
            Observable<LifecycleEvent> observableFromArray = Observable.fromArray(Arrays.copyOf(lifecycleEventArr, lifecycleEventArr.length));
            Intrinsics.checkNotNullExpressionValue(observableFromArray, "fromArray(...)");
            this.eventsObservable = observableFromArray;
        }

        public final LifecycleState getFromState() {
            return this.fromState;
        }

        public final LifecycleState getToState() {
            return this.toState;
        }

        public final List<LifecycleEvent> getEvents() {
            return this.events;
        }

        public final Observable<LifecycleEvent> getEventsObservable() {
            return this.eventsObservable;
        }
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}

package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.disposer.LifecycleState;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.EnumMap;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Disposer.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0007\u001a\u00020\b*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000e2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\u000f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00102\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\u0011\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\u0013\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a\"\u0010\u000b\u001a\u00020\u0015*\u00020\u00162\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\u0001\u001a\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\b\u0012\u0004\u0012\u00020\u00180\u000e\"\u001b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"currentEvent", "Lcom/robinhood/disposer/LifecycleEvent;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "getCurrentEvent", "(Lcom/jakewharton/rxrelay2/BehaviorRelay;)Lcom/robinhood/disposer/LifecycleEvent;", "currentToTerminalMap", "Ljava/util/EnumMap;", "disposeWhen", "Lio/reactivex/disposables/Disposable;", "lifecycle", "terminalEvent", "bindTo", "Lcom/robinhood/disposer/ScopedObservable;", "T", "Lio/reactivex/Observable;", "Lcom/robinhood/disposer/ScopedFlowable;", "Lio/reactivex/Flowable;", "Lcom/robinhood/disposer/ScopedMaybe;", "Lio/reactivex/Maybe;", "Lcom/robinhood/disposer/ScopedSingle;", "Lio/reactivex/Single;", "Lcom/robinhood/disposer/ScopedCompletable;", "Lio/reactivex/Completable;", "transitionEvents", "Lcom/robinhood/disposer/LifecycleState;", "lib-utils-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class DisposerKt {
    private static final EnumMap<LifecycleEvent, LifecycleEvent> currentToTerminalMap;

    public static final LifecycleEvent getCurrentEvent(BehaviorRelay<LifecycleEvent> behaviorRelay) {
        Intrinsics.checkNotNullParameter(behaviorRelay, "<this>");
        LifecycleEvent value = behaviorRelay.getValue();
        return value == null ? LifecycleEvent.ON_CREATE : value;
    }

    static {
        LifecycleEvent lifecycleEvent = LifecycleEvent.ON_ATTACH;
        LifecycleEvent lifecycleEvent2 = LifecycleEvent.ON_DETACH;
        Tuples2 tuples2M3642to = Tuples4.m3642to(lifecycleEvent, lifecycleEvent2);
        LifecycleEvent lifecycleEvent3 = LifecycleEvent.ON_CREATE;
        LifecycleEvent lifecycleEvent4 = LifecycleEvent.ON_DESTROY;
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(lifecycleEvent3, lifecycleEvent4);
        LifecycleEvent lifecycleEvent5 = LifecycleEvent.ON_CREATE_VIEW;
        LifecycleEvent lifecycleEvent6 = LifecycleEvent.ON_DESTROY_VIEW;
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(lifecycleEvent5, lifecycleEvent6);
        LifecycleEvent lifecycleEvent7 = LifecycleEvent.ON_START;
        LifecycleEvent lifecycleEvent8 = LifecycleEvent.ON_STOP;
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(lifecycleEvent7, lifecycleEvent8);
        LifecycleEvent lifecycleEvent9 = LifecycleEvent.ON_RESUME;
        LifecycleEvent lifecycleEvent10 = LifecycleEvent.ON_PAUSE;
        Tuples2[] tuples2Arr = {tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, Tuples4.m3642to(lifecycleEvent9, lifecycleEvent10), Tuples4.m3642to(lifecycleEvent10, lifecycleEvent8), Tuples4.m3642to(lifecycleEvent8, lifecycleEvent6), Tuples4.m3642to(lifecycleEvent6, lifecycleEvent4), Tuples4.m3642to(lifecycleEvent4, lifecycleEvent4), Tuples4.m3642to(lifecycleEvent2, lifecycleEvent2)};
        EnumMap<LifecycleEvent, LifecycleEvent> enumMap = new EnumMap<>(LifecycleEvent.class);
        MapsKt.putAll(enumMap, tuples2Arr);
        currentToTerminalMap = enumMap;
    }

    public static /* synthetic */ Disposable disposeWhen$default(Disposable disposable, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return disposeWhen(disposable, behaviorRelay, lifecycleEvent);
    }

    public static final Disposable disposeWhen(final Disposable disposable, BehaviorRelay<LifecycleEvent> lifecycle, final LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(disposable, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        if (disposable.getDisposed()) {
            return disposable;
        }
        LifecycleEvent currentEvent = getCurrentEvent(lifecycle);
        if (currentEvent.compareTo(terminalEvent) >= 0) {
            throw new IllegalStateException(("Can't disposeWhen in " + currentEvent).toString());
        }
        final CompositeDisposable compositeDisposable = new CompositeDisposable();
        Disposable disposableSubscribe = lifecycle.subscribe(new Consumer() { // from class: com.robinhood.disposer.DisposerKt$disposeWhen$selfDisposable$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(LifecycleEvent lifecycleEvent) {
                if (lifecycleEvent.isAtLeast(terminalEvent) || disposable.getDisposed()) {
                    compositeDisposable.dispose();
                }
            }
        });
        compositeDisposable.add(disposable);
        compositeDisposable.add(disposableSubscribe);
        return compositeDisposable;
    }

    public static /* synthetic */ ScopedObservable bindTo$default(Observable observable, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return bindTo(observable, (BehaviorRelay<LifecycleEvent>) behaviorRelay, lifecycleEvent);
    }

    public static final <T> ScopedObservable<T> bindTo(Observable<T> observable, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        return new ScopedObservable<>(observable, lifecycle, terminalEvent);
    }

    public static /* synthetic */ ScopedFlowable bindTo$default(Flowable flowable, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return bindTo(flowable, (BehaviorRelay<LifecycleEvent>) behaviorRelay, lifecycleEvent);
    }

    public static final <T> ScopedFlowable<T> bindTo(Flowable<T> flowable, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(flowable, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        return new ScopedFlowable<>(flowable, lifecycle, terminalEvent);
    }

    public static /* synthetic */ ScopedMaybe bindTo$default(Maybe maybe, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return bindTo(maybe, (BehaviorRelay<LifecycleEvent>) behaviorRelay, lifecycleEvent);
    }

    public static final <T> ScopedMaybe<T> bindTo(Maybe<T> maybe, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(maybe, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        return new ScopedMaybe<>(maybe, lifecycle, terminalEvent);
    }

    public static /* synthetic */ ScopedSingle bindTo$default(Single single, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return bindTo(single, (BehaviorRelay<LifecycleEvent>) behaviorRelay, lifecycleEvent);
    }

    public static final <T> ScopedSingle<T> bindTo(Single<T> single, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        return new ScopedSingle<>(single, lifecycle, terminalEvent);
    }

    public static /* synthetic */ ScopedCompletable bindTo$default(Completable completable, BehaviorRelay behaviorRelay, LifecycleEvent lifecycleEvent, int i, Object obj) {
        if ((i & 2) != 0) {
            LifecycleEvent lifecycleEvent2 = currentToTerminalMap.get(getCurrentEvent(behaviorRelay));
            Intrinsics.checkNotNull(lifecycleEvent2);
            lifecycleEvent = lifecycleEvent2;
        }
        return bindTo(completable, (BehaviorRelay<LifecycleEvent>) behaviorRelay, lifecycleEvent);
    }

    public static final ScopedCompletable bindTo(Completable completable, BehaviorRelay<LifecycleEvent> lifecycle, LifecycleEvent terminalEvent) {
        Intrinsics.checkNotNullParameter(completable, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
        return new ScopedCompletable(completable, lifecycle, terminalEvent);
    }

    public static final Observable<LifecycleEvent> transitionEvents(Observable<LifecycleState> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Observable<LifecycleEvent> observableFlatMap = observable.scan(LifecycleState.DEAD.getTransitionToDead(), new BiFunction() { // from class: com.robinhood.disposer.DisposerKt.transitionEvents.1
            @Override // io.reactivex.functions.BiFunction
            public final LifecycleState.Transition apply(LifecycleState.Transition priorTransition, LifecycleState next) {
                Intrinsics.checkNotNullParameter(priorTransition, "priorTransition");
                Intrinsics.checkNotNullParameter(next, "next");
                return priorTransition.getToState().transitionTo(next);
            }
        }).flatMap(new Function() { // from class: com.robinhood.disposer.DisposerKt.transitionEvents.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends LifecycleEvent> apply(LifecycleState.Transition it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getEventsObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }
}

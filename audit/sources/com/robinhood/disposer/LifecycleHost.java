package com.robinhood.disposer;

import com.jakewharton.rxrelay2.BehaviorRelay;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleHost.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u000f\"\b\b\u0000\u0010\u0010*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\u00100\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013\"\b\b\u0000\u0010\u0010*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\u00100\u00142\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0015\"\b\b\u0000\u0010\u0010*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\u00100\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0016J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0017\"\b\b\u0000\u0010\u0010*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\u00100\u00182\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0016J\u0016\u0010\u000e\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010\u0012\u001a\u00020\u0004H\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/disposer/LifecycleHost;", "", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "lifecycleScope", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "bind", "Lcom/robinhood/disposer/ScopedObservable;", "T", "Lio/reactivex/Observable;", "terminalEvent", "Lcom/robinhood/disposer/ScopedFlowable;", "Lio/reactivex/Flowable;", "Lcom/robinhood/disposer/ScopedMaybe;", "Lio/reactivex/Maybe;", "Lcom/robinhood/disposer/ScopedSingle;", "Lio/reactivex/Single;", "Lcom/robinhood/disposer/ScopedCompletable;", "Lio/reactivex/Completable;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface LifecycleHost {
    ScopedCompletable bind(Completable completable, LifecycleEvent lifecycleEvent);

    <T> ScopedFlowable<T> bind(Flowable<T> flowable, LifecycleEvent lifecycleEvent);

    <T> ScopedMaybe<T> bind(Maybe<T> maybe, LifecycleEvent lifecycleEvent);

    <T> ScopedObservable<T> bind(Observable<T> observable, LifecycleEvent lifecycleEvent);

    <T> ScopedSingle<T> bind(Single<T> single, LifecycleEvent lifecycleEvent);

    BehaviorRelay<LifecycleEvent> getLifecycleEvents();

    LifecycleHostCoroutineScope getLifecycleScope();

    BehaviorRelay<LifecycleState> getLifecycleState();

    /* compiled from: LifecycleHost.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ ScopedObservable bind$default(LifecycleHost lifecycleHost, Observable observable, LifecycleEvent lifecycleEvent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i & 1) != 0) {
                lifecycleEvent = DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent();
            }
            return lifecycleHost.bind(observable, lifecycleEvent);
        }

        public static <T> ScopedObservable<T> bind(LifecycleHost lifecycleHost, Observable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return DisposerKt.bindTo(receiver, lifecycleHost.getLifecycleEvents(), terminalEvent);
        }

        public static /* synthetic */ ScopedFlowable bind$default(LifecycleHost lifecycleHost, Flowable flowable, LifecycleEvent lifecycleEvent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i & 1) != 0) {
                lifecycleEvent = DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent();
            }
            return lifecycleHost.bind(flowable, lifecycleEvent);
        }

        public static <T> ScopedFlowable<T> bind(LifecycleHost lifecycleHost, Flowable<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return DisposerKt.bindTo(receiver, lifecycleHost.getLifecycleEvents(), terminalEvent);
        }

        public static /* synthetic */ ScopedMaybe bind$default(LifecycleHost lifecycleHost, Maybe maybe, LifecycleEvent lifecycleEvent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i & 1) != 0) {
                lifecycleEvent = DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent();
            }
            return lifecycleHost.bind(maybe, lifecycleEvent);
        }

        public static <T> ScopedMaybe<T> bind(LifecycleHost lifecycleHost, Maybe<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return DisposerKt.bindTo(receiver, lifecycleHost.getLifecycleEvents(), terminalEvent);
        }

        public static /* synthetic */ ScopedSingle bind$default(LifecycleHost lifecycleHost, Single single, LifecycleEvent lifecycleEvent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i & 1) != 0) {
                lifecycleEvent = DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent();
            }
            return lifecycleHost.bind(single, lifecycleEvent);
        }

        public static <T> ScopedSingle<T> bind(LifecycleHost lifecycleHost, Single<T> receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return DisposerKt.bindTo(receiver, lifecycleHost.getLifecycleEvents(), terminalEvent);
        }

        public static /* synthetic */ ScopedCompletable bind$default(LifecycleHost lifecycleHost, Completable completable, LifecycleEvent lifecycleEvent, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
            }
            if ((i & 1) != 0) {
                lifecycleEvent = DisposerKt.getCurrentEvent(lifecycleHost.getLifecycleEvents()).getTerminalEvent();
            }
            return lifecycleHost.bind(completable, lifecycleEvent);
        }

        public static ScopedCompletable bind(LifecycleHost lifecycleHost, Completable receiver, LifecycleEvent terminalEvent) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(terminalEvent, "terminalEvent");
            return DisposerKt.bindTo(receiver, lifecycleHost.getLifecycleEvents(), terminalEvent);
        }
    }
}

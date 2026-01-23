package com.robinhood.utils.transition;

import android.transition.Transition;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.utils.p408rx.RxPreconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionEventObservable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/transition/TransitionEventObservable;", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/transition/TransitionEvent;", NavTransition2.KEY_TRANSITION, "Landroid/transition/Transition;", "<init>", "(Landroid/transition/Transition;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class TransitionEventObservable extends Observable<TransitionEvent> {
    private final Transition transition;

    public TransitionEventObservable(Transition transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.transition = transition;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super TransitionEvent> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (RxPreconditions.INSTANCE.checkMainThread(observer)) {
            Listener listener = new Listener(this.transition, observer);
            observer.onSubscribe(listener);
            this.transition.addListener(listener);
        }
    }

    /* compiled from: TransitionEventObservable.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/utils/transition/TransitionEventObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Landroid/transition/Transition$TransitionListener;", NavTransition2.KEY_TRANSITION, "Landroid/transition/Transition;", "observer", "Lio/reactivex/Observer;", "Lcom/robinhood/utils/transition/TransitionEvent;", "<init>", "(Landroid/transition/Transition;Lio/reactivex/Observer;)V", "onTransitionStart", "", "onTransitionEnd", "onTransitionCancel", "onTransitionPause", "onTransitionResume", "onDispose", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class Listener extends MainThreadDisposable implements Transition.TransitionListener {
        private final Observer<? super TransitionEvent> observer;
        private final Transition transition;

        public Listener(Transition transition, Observer<? super TransitionEvent> observer) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.transition = transition;
            this.observer = observer;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(TransitionEvent.START);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(TransitionEvent.END);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(TransitionEvent.CANCEL);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(TransitionEvent.PAUSE);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "transition");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(TransitionEvent.RESUME);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        protected void onDispose() {
            this.transition.removeListener(this);
        }
    }
}

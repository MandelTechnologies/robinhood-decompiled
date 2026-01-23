package com.robinhood.android.common.util.p090rx.view;

import android.view.View;
import com.robinhood.utils.p408rx.RxPreconditions;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewAttachState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/view/ViewAttachStateObservable;", "Lio/reactivex/Observable;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.util.rx.view.ViewAttachStateObservable, reason: use source file name */
/* loaded from: classes17.dex */
final class ViewAttachState2 extends Observable<Boolean> {
    private final View view;

    public ViewAttachState2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super Boolean> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (RxPreconditions.INSTANCE.checkMainThread(observer)) {
            Listener listener = new Listener(this.view, observer);
            observer.onSubscribe(listener);
            if (!listener.getDisposed()) {
                observer.onNext(Boolean.valueOf(this.view.isAttachedToWindow()));
            }
            this.view.addOnAttachStateChangeListener(listener);
        }
    }

    /* compiled from: ViewAttachState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/util/rx/view/ViewAttachStateObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Landroid/view/View$OnAttachStateChangeListener;", "view", "Landroid/view/View;", "observer", "Lio/reactivex/Observer;", "", "<init>", "(Landroid/view/View;Lio/reactivex/Observer;)V", "onViewAttachedToWindow", "", "v", "onViewDetachedFromWindow", "onDispose", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.util.rx.view.ViewAttachStateObservable$Listener */
    public static final class Listener extends MainThreadDisposable implements View.OnAttachStateChangeListener {
        public static final int $stable = 8;
        private final Observer<? super Boolean> observer;
        private final View view;

        public Listener(View view, Observer<? super Boolean> observer) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.view = view;
            this.observer = observer;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(Boolean.TRUE);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (getDisposed()) {
                return;
            }
            this.observer.onNext(Boolean.FALSE);
        }

        @Override // io.reactivex.android.MainThreadDisposable
        protected void onDispose() {
            this.view.removeOnAttachStateChangeListener(this);
        }
    }
}

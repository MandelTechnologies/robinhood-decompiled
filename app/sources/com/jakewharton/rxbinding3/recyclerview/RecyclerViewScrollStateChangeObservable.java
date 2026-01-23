package com.jakewharton.rxbinding3.recyclerview;

import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.internal.mainThread;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecyclerViewScrollStateChangeObservable.kt */
@Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/recyclerview/RecyclerViewScrollStateChangeObservable;", "Lio/reactivex/Observable;", "", "view", "Landroidx/recyclerview/widget/RecyclerView;", "(Landroidx/recyclerview/widget/RecyclerView;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "rxbinding-recyclerview_release"}, m3637k = 1, m3638mv = {1, 1, 15})
/* loaded from: classes27.dex */
final class RecyclerViewScrollStateChangeObservable extends Observable<Integer> {
    private final RecyclerView view;

    public RecyclerViewScrollStateChangeObservable(RecyclerView view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        this.view = view;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super Integer> observer) {
        Intrinsics.checkParameterIsNotNull(observer, "observer");
        if (mainThread.checkMainThread(observer)) {
            Listener listener = new Listener(this.view, observer);
            observer.onSubscribe(listener);
            this.view.addOnScrollListener(listener.getScrollListener());
        }
    }

    /* compiled from: RecyclerViewScrollStateChangeObservable.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m3636d2 = {"Lcom/jakewharton/rxbinding3/recyclerview/RecyclerViewScrollStateChangeObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "observer", "Lio/reactivex/Observer;", "", "(Landroidx/recyclerview/widget/RecyclerView;Lio/reactivex/Observer;)V", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onDispose", "", "rxbinding-recyclerview_release"}, m3637k = 1, m3638mv = {1, 1, 15})
    public static final class Listener extends MainThreadDisposable {
        private final RecyclerView recyclerView;
        private final RecyclerView.OnScrollListener scrollListener;

        public Listener(RecyclerView recyclerView, final Observer<? super Integer> observer) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            Intrinsics.checkParameterIsNotNull(observer, "observer");
            this.recyclerView = recyclerView;
            this.scrollListener = new RecyclerView.OnScrollListener() { // from class: com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollStateChangeObservable$Listener$scrollListener$1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int newState) {
                    Intrinsics.checkParameterIsNotNull(recyclerView2, "recyclerView");
                    if (this.this$0.getDisposed()) {
                        return;
                    }
                    observer.onNext(Integer.valueOf(newState));
                }
            };
        }

        public final RecyclerView.OnScrollListener getScrollListener() {
            return this.scrollListener;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        protected void onDispose() {
            this.recyclerView.removeOnScrollListener(this.scrollListener);
        }
    }
}

package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes21.dex */
public final class ObservableFromArray<T> extends Observable<T> {

    /* renamed from: array, reason: collision with root package name */
    final T[] f10707array;

    public ObservableFromArray(T[] tArr) {
        this.f10707array = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.f10707array);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.fusionMode) {
            return;
        }
        fromArrayDisposable.run();
    }

    static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {

        /* renamed from: array, reason: collision with root package name */
        final T[] f10708array;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.f10708array = tArr;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() {
            int i = this.index;
            T[] tArr = this.f10708array;
            if (i == tArr.length) {
                return null;
            }
            this.index = i + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i], "The array element is null");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.f10708array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.f10708array.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: isDisposed */
        public boolean getDisposed() {
            return this.disposed;
        }

        void run() {
            T[] tArr = this.f10708array;
            int length = tArr.length;
            for (int i = 0; i < length && !getDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    this.downstream.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.downstream.onNext(t);
            }
            if (getDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }
    }
}

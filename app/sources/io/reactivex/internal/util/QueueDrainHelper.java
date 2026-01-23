package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;

/* loaded from: classes14.dex */
public final class QueueDrainHelper {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        r1 = r8.leave(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int iLeave = 1;
        while (true) {
            SimplePlainQueue<T> simplePlainQueue2 = simplePlainQueue;
            Observer<? super U> observer2 = observer;
            boolean z2 = z;
            Disposable disposable2 = disposable;
            ObservableQueueDrain<T, U> observableQueueDrain2 = observableQueueDrain;
            if (checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer2, z2, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                return;
            }
            while (true) {
                boolean zDone = observableQueueDrain2.done();
                T tPoll = simplePlainQueue2.poll();
                boolean z3 = tPoll == null;
                boolean z4 = z3;
                if (checkTerminated(zDone, z3, observer2, z2, simplePlainQueue2, disposable2, observableQueueDrain2)) {
                    return;
                }
                if (z4) {
                    break;
                } else {
                    observableQueueDrain2.accept(observer2, tPoll);
                }
            }
            observer = observer2;
            z = z2;
            simplePlainQueue = simplePlainQueue2;
            disposable = disposable2;
            observableQueueDrain = observableQueueDrain2;
        }
    }

    public static <T, U> boolean checkTerminated(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        if (z3) {
            if (!z2) {
                return false;
            }
            if (disposable != null) {
                disposable.dispose();
            }
            Throwable thError = observableQueueDrain.error();
            if (thError != null) {
                observer.onError(thError);
            } else {
                observer.onComplete();
            }
            return true;
        }
        Throwable thError2 = observableQueueDrain.error();
        if (thError2 != null) {
            simpleQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thError2);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    public static <T> SimpleQueue<T> createQueue(int i) {
        if (i < 0) {
            return new SpscLinkedArrayQueue(-i);
        }
        return new SpscArrayQueue(i);
    }
}

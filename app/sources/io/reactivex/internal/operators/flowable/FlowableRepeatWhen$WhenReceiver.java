package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes14.dex */
final class FlowableRepeatWhen$WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {
    final Publisher<T> source;
    FlowableRepeatWhen$WhenSourceSubscriber<T, U> subscriber;
    final AtomicReference<Subscription> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    FlowableRepeatWhen$WhenReceiver(Publisher<T> publisher) {
        this.source = publisher;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(Subscription subscription) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, subscription);
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.source.subscribe(this.subscriber);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        this.subscriber.cancel();
        this.subscriber.downstream.onError(th);
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        this.subscriber.cancel();
        this.subscriber.downstream.onComplete();
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j);
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
    }
}

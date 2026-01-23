package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.processors.FlowableProcessor;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes14.dex */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
    protected final Subscriber<? super T> downstream;
    protected final FlowableProcessor<U> processor;
    private long produced;
    protected final Subscription receiver;

    FlowableRepeatWhen$WhenSourceSubscriber(Subscriber<? super T> subscriber, FlowableProcessor<U> flowableProcessor, Subscription subscription) {
        super(false);
        this.downstream = subscriber;
        this.processor = flowableProcessor;
        this.receiver = subscription;
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public final void onSubscribe(Subscription subscription) {
        setSubscription(subscription);
    }

    @Override // org.reactivestreams.Subscriber
    public final void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    protected final void again(U u) {
        setSubscription(EmptySubscription.INSTANCE);
        long j = this.produced;
        if (j != 0) {
            this.produced = 0L;
            produced(j);
        }
        this.receiver.request(1L);
        this.processor.onNext(u);
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, org.reactivestreams.Subscription
    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }
}

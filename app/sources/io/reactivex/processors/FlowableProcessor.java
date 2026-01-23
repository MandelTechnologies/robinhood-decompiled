package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes14.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Subscriber, Publisher, FlowableSubscriber<T> {
    public final FlowableProcessor<T> toSerialized() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor(this);
    }
}

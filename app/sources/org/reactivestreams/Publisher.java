package org.reactivestreams;

/* loaded from: classes23.dex */
public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}

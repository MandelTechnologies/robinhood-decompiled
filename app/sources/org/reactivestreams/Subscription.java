package org.reactivestreams;

/* loaded from: classes25.dex */
public interface Subscription {
    void cancel();

    void request(long j);
}

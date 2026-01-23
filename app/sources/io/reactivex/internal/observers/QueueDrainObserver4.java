package io.reactivex.internal.observers;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: QueueDrainObserver.java */
/* renamed from: io.reactivex.internal.observers.QueueDrainSubscriberWip, reason: use source file name */
/* loaded from: classes14.dex */
class QueueDrainObserver4 extends QueueDrainObserver2 {
    final AtomicInteger wip = new AtomicInteger();

    QueueDrainObserver4() {
    }
}

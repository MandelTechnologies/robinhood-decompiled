package com.robinhood.test.idler;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* compiled from: ListAdapterIdleTracker.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/test/idler/ListAdapterIdleTracker;", "", "<init>", "()V", "idlingResourceType", "Lcom/robinhood/test/idler/IdlingResourceType;", "isDiffing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onSubmit", "", "onCommit", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ListAdapterIdleTracker {
    private final IdlingResourceType idlingResourceType = IdlingResourceType.LIST_ADAPTER_DIFFING;
    private final AtomicBoolean isDiffing = new AtomicBoolean(false);

    public final void onSubmit() {
        if (this.isDiffing.compareAndSet(false, true)) {
            IdlingResourceCounters2.increment(this.idlingResourceType);
        }
    }

    public final void onCommit() {
        if (this.isDiffing.compareAndSet(true, false)) {
            IdlingResourceCounters2.decrement(this.idlingResourceType);
        }
    }
}

package com.robinhood.android.moria.p196db.reactor;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;

/* compiled from: RefreshEach.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/moria/db/reactor/RefreshEach;", "P", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "factory", "Lkotlin/Function1;", "Lkotlinx/coroutines/Job;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "jobs", "", "getJobs$lib_moria", "()Ljava/util/Map;", "onSubscriptionAdded", "", "params", "(Ljava/lang/Object;)V", "onSubscriptionRemoved", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RefreshEach<P> implements Reactor<P> {
    private final Function1<P, Job> factory;
    private final Map<P, Job> jobs;

    /* JADX WARN: Multi-variable type inference failed */
    public RefreshEach(Function1<? super P, ? extends Job> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.jobs = new LinkedHashMap();
    }

    public final Map<P, Job> getJobs$lib_moria() {
        return this.jobs;
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionAdded(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Job jobRemove = this.jobs.remove(params);
        if (jobRemove != null) {
            Job6.cancel$default(jobRemove, "Duplicate subscription params=" + params, null, 2, null);
        }
        this.jobs.put(params, this.factory.invoke(params));
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionRemoved(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Job jobRemove = this.jobs.remove(params);
        if (jobRemove != null) {
            Job6.cancel$default(jobRemove, "Subscription removed", null, 2, null);
        }
    }
}

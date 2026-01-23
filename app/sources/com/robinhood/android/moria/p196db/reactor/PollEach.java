package com.robinhood.android.moria.p196db.reactor;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PollEach.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0004B)\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/moria/db/reactor/PollEach;", "P", "", "T", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "poller", "Lkotlin/Function1;", "Lkotlinx/coroutines/flow/Flow;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "activePolls", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlinx/coroutines/Job;", "getActivePolls$lib_moria", "()Ljava/util/concurrent/ConcurrentHashMap;", "onSubscriptionAdded", "", "params", "(Ljava/lang/Object;)V", "onSubscriptionRemoved", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class PollEach<P, T> implements Reactor<P> {
    private final ConcurrentHashMap<P, Job> activePolls;
    private final Function1<P, Flow<T>> poller;
    private final CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public PollEach(CoroutineScope scope, Function1<? super P, ? extends Flow<? extends T>> poller) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(poller, "poller");
        this.scope = scope;
        this.poller = poller;
        this.activePolls = new ConcurrentHashMap<>();
    }

    public final ConcurrentHashMap<P, Job> getActivePolls$lib_moria() {
        return this.activePolls;
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionAdded(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new PollEach2(this, params, null), 3, null);
        Job jobPutIfAbsent = this.activePolls.putIfAbsent(params, jobLaunch$default);
        if (jobPutIfAbsent == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(jobLaunch$default, null, 1, null);
        throw new IllegalStateException(("PollEach already polling on " + params + ": " + jobPutIfAbsent).toString());
    }

    @Override // com.robinhood.android.moria.p196db.reactor.Reactor
    public void onSubscriptionRemoved(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Job jobRemove = this.activePolls.remove(params);
        if (jobRemove != null) {
            Job6.cancel$default(jobRemove, "Subscription removed", null, 2, null);
            return;
        }
        throw new IllegalStateException(("PollEach is not polling on " + params).toString());
    }
}

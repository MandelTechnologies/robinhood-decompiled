package com.robinhood.android.moria.p196db;

import com.robinhood.android.moria.p196db.reactor.Reactor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ActiveSubscriptions.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/moria/db/ActiveSubscriptions;", "P", "", "queryName", "", "reactors", "", "Lcom/robinhood/android/moria/db/reactor/Reactor;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "activeQueries", "", "", "getActiveQueries$lib_moria", "()Ljava/util/Map;", "lock", "onSubscribe", "", "params", "onSubscribe$lib_moria", "(Ljava/lang/Object;)V", "onDispose", "onDispose$lib_moria", "reportSubscriptionAdded", "reportSubscriptionRemoved", "lib-moria"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ActiveSubscriptions<P> {
    private final Map<P, Integer> activeQueries;
    private final Object lock;
    private final String queryName;
    private final List<Reactor<P>> reactors;

    /* JADX WARN: Multi-variable type inference failed */
    public ActiveSubscriptions(String queryName, List<? extends Reactor<? super P>> reactors) {
        Intrinsics.checkNotNullParameter(queryName, "queryName");
        Intrinsics.checkNotNullParameter(reactors, "reactors");
        this.queryName = queryName;
        this.reactors = reactors;
        this.activeQueries = new LinkedHashMap();
        this.lock = new Object();
    }

    public /* synthetic */ ActiveSubscriptions(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final Map<P, Integer> getActiveQueries$lib_moria() {
        return this.activeQueries;
    }

    public final void onSubscribe$lib_moria(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        synchronized (this.lock) {
            try {
                Integer num = this.activeQueries.get(params);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.activeQueries.put(params, Integer.valueOf(iIntValue));
                if (iIntValue == 1) {
                    reportSubscriptionAdded(params);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onDispose$lib_moria(P params) {
        Intrinsics.checkNotNullParameter(params, "params");
        synchronized (this.lock) {
            try {
                Integer num = this.activeQueries.get(params);
                if (num == null) {
                    throw new IllegalStateException(("ActiveSubscriptions.onDispose() called for unknown params: " + this.queryName + " - " + params).toString());
                }
                if (num.intValue() <= 0) {
                    throw new IllegalStateException(("ActiveSubscriptions.onDispose() called: " + this.queryName + " - " + params + " with " + num + " subscribers").toString());
                }
                int iIntValue = num.intValue() - 1;
                if (iIntValue > 0) {
                    this.activeQueries.put(params, Integer.valueOf(iIntValue));
                } else {
                    this.activeQueries.remove(params);
                    reportSubscriptionRemoved(params);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void reportSubscriptionAdded(P params) {
        Iterator<T> it = this.reactors.iterator();
        while (it.hasNext()) {
            ((Reactor) it.next()).onSubscriptionAdded(params);
        }
    }

    private final void reportSubscriptionRemoved(P params) {
        Iterator<T> it = this.reactors.iterator();
        while (it.hasNext()) {
            ((Reactor) it.next()).onSubscriptionRemoved(params);
        }
    }
}

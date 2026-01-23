package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.models.api.ApiMarkThreadsAsReadRequest;
import com.robinhood.models.api.ApiThread;
import com.robinhood.models.dao.InboxThreadDao;
import com.robinhood.models.p320db.InboxThread;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Duration;

/* compiled from: InboxThreadStore.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\fJ\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001b0\u0017J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00172\u0006\u0010\u0019\u001a\u00020\fJ\u001c\u0010#\u001a\u00020\u00102\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u001bH\u0086@¢\u0006\u0002\u0010%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/InboxThreadStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/InboxThreadDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/InboxThreadDao;)V", "getThreadEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/ApiThread;", "getThreads", "Lcom/robinhood/api/PaginatedEndpoint;", "", "getGetThreads", "()Lcom/robinhood/api/PaginatedEndpoint;", "getThreadCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamThread", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/InboxThread;", "threadId", "streamThreads", "", "refreshThread", "Lkotlinx/coroutines/Job;", "force", "", "fetchThreads", "Lio/reactivex/Completable;", "pollThread", "markThreadsAsRead", "threadIds", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-store-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class InboxThreadStore extends Store {
    private final Brokeback brokeback;
    private final InboxThreadDao dao;
    private final Endpoint<String, ApiThread> getThreadEndpoint;
    private final PaginatedEndpoint<Unit, ApiThread> getThreads;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxThreadStore(Brokeback brokeback, StoreBundle storeBundle, InboxThreadDao dao) {
        super(storeBundle, InboxThread.INSTANCE);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.dao = dao;
        this.getThreadEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new InboxThreadStore2(this, null), getLogoutKillswitch(), new InboxThreadStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.getThreads = PaginatedEndpoint.Companion.create$default(PaginatedEndpoint.INSTANCE, new InboxThreadStore4(this, null), getLogoutKillswitch(), new InboxThreadStore5(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final PaginatedEndpoint<Unit, ApiThread> getGetThreads() {
        return this.getThreads;
    }

    public final Object getThreadCount(Continuation<? super Integer> continuation) {
        return this.dao.getCount(continuation);
    }

    public final Observable<InboxThread> streamThread(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        return asObservable(takeWhileLoggedIn(FlowKt.filterNotNull(this.dao.get(threadId))));
    }

    public final Observable<List<InboxThread>> streamThreads() {
        return asObservable(takeWhileLoggedIn(this.dao.get()));
    }

    public final Job refreshThread(String threadId, boolean force) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        return Endpoint.DefaultImpls.refresh$default(this.getThreadEndpoint, threadId, force, null, 4, null);
    }

    public final Completable fetchThreads(boolean force) {
        Flow flowFetchAllPages;
        if (force) {
            flowFetchAllPages = PaginatedEndpointKt.forceFetchAllPages(this.getThreads);
        } else {
            flowFetchAllPages = PaginatedEndpointKt.fetchAllPages(this.getThreads);
        }
        Completable completableCache = asObservable(flowFetchAllPages).ignoreElements().cache();
        Intrinsics.checkNotNull(completableCache);
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableCache), getStoreScope());
        return completableCache;
    }

    public final Observable<ApiThread> pollThread(String threadId) {
        Intrinsics.checkNotNullParameter(threadId, "threadId");
        Endpoint<String, ApiThread> endpoint = this.getThreadEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        Observable<ApiThread> observableTakeUntil = asObservable(Endpoint.DefaultImpls.poll$default(endpoint, threadId, durationOfSeconds, null, 4, null)).takeUntil(getLogoutKillswitch().getKillswitchObservable());
        Intrinsics.checkNotNullExpressionValue(observableTakeUntil, "takeUntil(...)");
        return observableTakeUntil;
    }

    public final Object markThreadsAsRead(List<String> list, Continuation<? super Unit> continuation) {
        Object objMarkThreadsAsRead = this.brokeback.markThreadsAsRead(new ApiMarkThreadsAsReadRequest(list), continuation);
        return objMarkThreadsAsRead == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMarkThreadsAsRead : Unit.INSTANCE;
    }
}

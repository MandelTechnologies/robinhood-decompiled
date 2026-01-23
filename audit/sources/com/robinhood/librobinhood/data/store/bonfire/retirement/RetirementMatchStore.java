package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.dao.RetirementSypDao;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RetirementMatchStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0010\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "Lcom/robinhood/store/Store;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "dao", "Lcom/robinhood/android/models/retirement/dao/RetirementSypDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Lcom/robinhood/android/models/retirement/dao/RetirementSypDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "query", "Lcom/robinhood/android/moria/db/Query;", "getQuery", "()Lcom/robinhood/android/moria/db/Query;", "queryNoPolling", "getQueryNoPolling", "stream", "Lio/reactivex/Observable;", "streamNoPolling", "refresh", "force", "", "lib-store-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RetirementMatchStore extends Store {
    private final RetirementSypDao dao;
    private final Endpoint<Unit, RetirementMatchRate> endpoint;
    private final Query<Unit, RetirementMatchRate> query;
    private final Query<Unit, RetirementMatchRate> queryNoPolling;
    private final RetirementApi retirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetirementMatchStore(RetirementApi retirementApi, RetirementSypDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.retirementApi = retirementApi;
        this.dao = dao;
        Endpoint<Unit, RetirementMatchRate> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RetirementMatchStore2(this, null), getLogoutKillswitch(), new RetirementMatchStore3(dao), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        Query.Companion companion = Query.INSTANCE;
        this.query = Store.create$default(this, companion, "queryRetirementMatchRate", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementMatchStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementMatchStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
        this.queryNoPolling = Store.create$default(this, companion, "queryRetirementMatchRate", CollectionsKt.listOf(new RefreshEach(new RetirementMatchStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementMatchStore.queryNoPolling$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insertMatchRate(RetirementSypDao retirementSypDao, RetirementMatchRate retirementMatchRate, Continuation continuation) {
        retirementSypDao.insertMatchRate(retirementMatchRate);
        return Unit.INSTANCE;
    }

    public final Query<Unit, RetirementMatchRate> getQuery() {
        return this.query;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RetirementMatchStore retirementMatchStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(retirementMatchStore.endpoint, Unit.INSTANCE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RetirementMatchStore retirementMatchStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirementMatchStore.dao.getMatchRate();
    }

    public final Query<Unit, RetirementMatchRate> getQueryNoPolling() {
        return this.queryNoPolling;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryNoPolling$lambda$2(RetirementMatchStore retirementMatchStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return retirementMatchStore.dao.getMatchRate();
    }

    public final Observable<RetirementMatchRate> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public final Observable<RetirementMatchRate> streamNoPolling() {
        return this.queryNoPolling.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ void refresh$default(RetirementMatchStore retirementMatchStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        retirementMatchStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}

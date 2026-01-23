package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.dao.RoundupPendingTransactionsDao;
import com.robinhood.models.dao.RoundupTransactionsDao;
import com.robinhood.models.p320db.mcduckling.RoundupPendingTransactions;
import com.robinhood.models.p320db.mcduckling.RoundupTransactions;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RoundupTransactionsStore.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c2\u0006\u0010\u0018\u001a\u00020\u000eJ\u000e\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RoundupTransactionsStore;", "Lcom/robinhood/store/Store;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RoundupTransactionsDao;", "pendingTransactionsDao", "Lcom/robinhood/models/dao/RoundupPendingTransactionsDao;", "<init>", "(Lcom/robinhood/api/pluto/PlutoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RoundupTransactionsDao;Lcom/robinhood/models/dao/RoundupPendingTransactionsDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/db/mcduckling/RoundupTransactions;", "pendingTransactionsEndpoint", "", "Lcom/robinhood/models/db/mcduckling/RoundupPendingTransactions;", "query", "Lcom/robinhood/android/moria/db/Query;", "pendingTransactionsQuery", "refresh", "Lkotlinx/coroutines/Job;", "roundupId", "force", "", "stream", "Lio/reactivex/Observable;", "refreshPendingTransactions", "streamPendingTransactions", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RoundupTransactionsStore extends Store {
    private final RoundupTransactionsDao dao;
    private final Endpoint<UUID, RoundupTransactions> endpoint;
    private final RoundupPendingTransactionsDao pendingTransactionsDao;
    private final Endpoint<Unit, RoundupPendingTransactions> pendingTransactionsEndpoint;
    private final Query<Unit, RoundupPendingTransactions> pendingTransactionsQuery;
    private final PlutoApi pluto;
    private final Query<UUID, RoundupTransactions> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundupTransactionsStore(PlutoApi pluto, StoreBundle storeBundle, RoundupTransactionsDao dao, RoundupPendingTransactionsDao pendingTransactionsDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(pendingTransactionsDao, "pendingTransactionsDao");
        this.pluto = pluto;
        this.dao = dao;
        this.pendingTransactionsDao = pendingTransactionsDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.endpoint = Endpoint.Companion.create$default(companion, new RoundupTransactionsStore2(this, null), getLogoutKillswitch(), new RoundupTransactionsStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.pendingTransactionsEndpoint = Endpoint.Companion.create$default(companion, new RoundupTransactionsStore4(this, null), getLogoutKillswitch(), new RoundupTransactionsStore5(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.query = Store.create$default(this, companion2, "streamRoundupTransactions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTransactionsStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTransactionsStore.query$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTransactionsStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTransactionsStore.query$lambda$1(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.pendingTransactionsQuery = Store.create$default(this, companion2, "streamRoundupPendingTransactions", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTransactionsStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTransactionsStore.pendingTransactionsQuery$lambda$2(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupTransactionsStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupTransactionsStore.pendingTransactionsQuery$lambda$3(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RoundupTransactionsStore roundupTransactionsStore, UUID roundupId) {
        Intrinsics.checkNotNullParameter(roundupId, "roundupId");
        return Endpoint.DefaultImpls.poll$default(roundupTransactionsStore.endpoint, roundupId, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RoundupTransactionsStore roundupTransactionsStore, UUID roundupId) {
        Intrinsics.checkNotNullParameter(roundupId, "roundupId");
        return roundupTransactionsStore.dao.getRoundupTransactions(roundupId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pendingTransactionsQuery$lambda$2(RoundupTransactionsStore roundupTransactionsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(roundupTransactionsStore.pendingTransactionsEndpoint, Unit.INSTANCE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow pendingTransactionsQuery$lambda$3(RoundupTransactionsStore roundupTransactionsStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return roundupTransactionsStore.pendingTransactionsDao.getRoundupPendingTransactions();
    }

    public final Job refresh(UUID roundupId, boolean force) {
        Intrinsics.checkNotNullParameter(roundupId, "roundupId");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, roundupId, force, null, 4, null);
    }

    public final Observable<RoundupTransactions> stream(UUID roundupId) {
        Intrinsics.checkNotNullParameter(roundupId, "roundupId");
        return this.query.asObservable(roundupId);
    }

    public final Job refreshPendingTransactions(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.pendingTransactionsEndpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<RoundupPendingTransactions> streamPendingTransactions() {
        return this.pendingTransactionsQuery.asObservable(Unit.INSTANCE);
    }
}

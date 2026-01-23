package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaIncentivesSummary;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.models.p320db.matcha.MatchaIncentivesSummary;
import com.robinhood.models.p320db.matcha.dao.MatchaIncentivesSummaryDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MatchaIncentivesSummaryStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/store/matcha/MatchaIncentivesSummaryStore;", "Lcom/robinhood/store/Store;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "dao", "Lcom/robinhood/models/db/matcha/dao/MatchaIncentivesSummaryDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/models/db/matcha/dao/MatchaIncentivesSummaryDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/android/models/matcha/api/ApiMatchaIncentivesSummary;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/matcha/MatchaIncentivesSummary;", "stream", "Lio/reactivex/Observable;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class MatchaIncentivesSummaryStore extends Store {
    private final MatchaIncentivesSummaryDao dao;
    private final Endpoint<Unit, ApiMatchaIncentivesSummary> endpoint;
    private final MatchaApi matchaApi;
    private final Query<Unit, MatchaIncentivesSummary> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchaIncentivesSummaryStore(MatchaApi matchaApi, MatchaIncentivesSummaryDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.matchaApi = matchaApi;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new MatchaIncentivesSummaryStore2(this, null), getLogoutKillswitch(), new MatchaIncentivesSummaryStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "queryMatchIncentives", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesSummaryStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.store.matcha.MatchaIncentivesSummaryStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaIncentivesSummaryStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(matchaIncentivesSummaryStore.endpoint, Unit.INSTANCE, Durations.INSTANCE.getONE_MINUTE(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MatchaIncentivesSummaryDao.DefaultImpls.get$default(matchaIncentivesSummaryStore.dao, 0, 1, null);
    }

    public final Observable<MatchaIncentivesSummary> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }

    public static /* synthetic */ Job refresh$default(MatchaIncentivesSummaryStore matchaIncentivesSummaryStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return matchaIncentivesSummaryStore.refresh(z);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }
}

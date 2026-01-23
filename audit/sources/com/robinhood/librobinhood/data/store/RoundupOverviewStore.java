package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.pluto.ApiRoundupOverview;
import com.robinhood.models.dao.RoundupOverviewDao;
import com.robinhood.models.p320db.mcduckling.RoundupOverview;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RoundupOverviewStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RoundupOverviewStore;", "Lcom/robinhood/store/Store;", "pluto", "Lcom/robinhood/api/pluto/PlutoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/RoundupOverviewDao;", "<init>", "(Lcom/robinhood/api/pluto/PlutoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/RoundupOverviewDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/pluto/ApiRoundupOverview;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/mcduckling/RoundupOverview;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "stream", "Lio/reactivex/Observable;", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RoundupOverviewStore extends Store {
    private final RoundupOverviewDao dao;
    private final Endpoint<Unit, ApiRoundupOverview> endpoint;
    private final PlutoApi pluto;
    private final Query<Unit, RoundupOverview> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundupOverviewStore(PlutoApi pluto, StoreBundle storeBundle, RoundupOverviewDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pluto, "pluto");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.pluto = pluto;
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RoundupOverviewStore2(this, null), getLogoutKillswitch(), new RoundupOverviewStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.query = Store.create$default(this, Query.INSTANCE, "streamRoundupOverview", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupOverviewStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupOverviewStore.query$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.RoundupOverviewStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoundupOverviewStore.query$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RoundupOverviewStore roundupOverviewStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(roundupOverviewStore.endpoint, Unit.INSTANCE, RoundupOverview.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$1(RoundupOverviewStore roundupOverviewStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return roundupOverviewStore.dao.getRoundupOverview();
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, Unit.INSTANCE, force, null, 4, null);
    }

    public final Observable<RoundupOverview> stream() {
        return this.query.asObservable(Unit.INSTANCE);
    }
}

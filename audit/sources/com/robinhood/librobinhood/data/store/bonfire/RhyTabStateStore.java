package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTabStateResponse;
import com.robinhood.models.dao.RhyTabStateDao;
import com.robinhood.models.p320db.rhy.RhyTabState;
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

/* compiled from: RhyTabStateStore.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/RhyTabStateStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "bonfire", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "dao", "Lcom/robinhood/models/dao/RhyTabStateDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/models/dao/RhyTabStateDao;)V", "rhyTabStateEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTabStateResponse;", "queryRhyTabState", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/rhy/RhyTabState;", "streamRhyTabState", "Lio/reactivex/Observable;", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyTabStateStore extends Store {
    private final RhyBonfireApi bonfire;
    private final RhyTabStateDao dao;
    private final Query<Unit, RhyTabState> queryRhyTabState;
    private final Endpoint<Unit, ApiRhyTabStateResponse> rhyTabStateEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyTabStateStore(StoreBundle storeBundle, RhyBonfireApi bonfire2, RhyTabStateDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfire = bonfire2;
        this.dao = dao;
        this.rhyTabStateEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyTabStateStore2(this, null), getLogoutKillswitch(), new RhyTabStateStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.queryRhyTabState = Store.create$default(this, Query.INSTANCE, "streamRhyTabState", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTabStateStore.queryRhyTabState$lambda$0(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.RhyTabStateStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyTabStateStore.queryRhyTabState$lambda$1(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryRhyTabState$lambda$0(RhyTabStateStore rhyTabStateStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Endpoint.DefaultImpls.poll$default(rhyTabStateStore.rhyTabStateEndpoint, Unit.INSTANCE, RhyTabState.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow queryRhyTabState$lambda$1(RhyTabStateStore rhyTabStateStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return RhyTabStateDao.DefaultImpls.get$default(rhyTabStateStore.dao, 0, 1, null);
    }

    public final Observable<RhyTabState> streamRhyTabState() {
        return this.queryRhyTabState.asObservable(Unit.INSTANCE);
    }

    public final Job refresh(boolean force) {
        return Endpoint.DefaultImpls.refresh$default(this.rhyTabStateEndpoint, Unit.INSTANCE, force, null, 4, null);
    }
}

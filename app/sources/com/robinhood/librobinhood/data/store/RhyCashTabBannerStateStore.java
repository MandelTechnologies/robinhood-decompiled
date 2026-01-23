package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.dao.bonfire.RhyCashTabBannerStateDao;
import com.robinhood.models.p320db.bonfire.RhyCashTabBannerState;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhyCashTabBannerStateStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011J\u001d\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyCashTabBannerStateStore;", "Lcom/robinhood/store/Store;", "bonfire", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/RhyCashTabBannerStateDao;", "<init>", "(Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/RhyCashTabBannerStateDao;)V", "get", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/bonfire/RhyCashTabBannerState;", "pollQuery", "Lcom/robinhood/android/moria/db/Query;", "streamRhyCashTabBannerState", "Lio/reactivex/Observable;", "getRhyCashTabBannerState", "Lkotlinx/coroutines/flow/Flow;", "ignored", "(Lkotlin/Unit;)Lkotlinx/coroutines/flow/Flow;", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyCashTabBannerStateStore extends Store {
    private final RhyBonfireApi bonfire;
    private final RhyCashTabBannerStateDao dao;
    private final Endpoint<Unit, RhyCashTabBannerState> get;
    private final Query<Unit, RhyCashTabBannerState> pollQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyCashTabBannerStateStore(RhyBonfireApi bonfire2, StoreBundle storeBundle, RhyCashTabBannerStateDao dao) {
        super(storeBundle, RhyCashTabBannerState.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.bonfire = bonfire2;
        this.dao = dao;
        Endpoint<Unit, RhyCashTabBannerState> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhyCashTabBannerStateStore2(this, null), getLogoutKillswitch(), new RhyCashTabBannerStateStore3(dao), storeBundle.getClock(), null, 16, null);
        this.get = endpointCreate$default;
        this.pollQuery = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new PollEach(getStoreScope(), new RhyCashTabBannerStateStore4(endpointCreate$default))), new RhyCashTabBannerStateStore5(this), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object get$insert(RhyCashTabBannerStateDao rhyCashTabBannerStateDao, RhyCashTabBannerState rhyCashTabBannerState, Continuation continuation) {
        rhyCashTabBannerStateDao.insert(rhyCashTabBannerState);
        return Unit.INSTANCE;
    }

    public final Observable<RhyCashTabBannerState> streamRhyCashTabBannerState() {
        return this.pollQuery.asObservable(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<RhyCashTabBannerState> getRhyCashTabBannerState(Unit ignored) {
        return this.dao.get();
    }
}

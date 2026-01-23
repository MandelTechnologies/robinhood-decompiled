package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.rhy.RhyBonfireApi;
import com.robinhood.models.dao.RhySpendingAccountLearnMoreDao;
import com.robinhood.models.p320db.rhy.RhySpendingAccountLearnMore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: RhySpendingAccountLearnMoreStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/rhy/RhySpendingAccountLearnMoreStore;", "Lcom/robinhood/store/Store;", "dao", "Lcom/robinhood/models/dao/RhySpendingAccountLearnMoreDao;", "bonfireApi", "Lcom/robinhood/api/rhy/RhyBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/models/dao/RhySpendingAccountLearnMoreDao;Lcom/robinhood/api/rhy/RhyBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lkotlin/Pair;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/db/rhy/RhySpendingAccountLearnMore;", "query", "Lcom/robinhood/android/moria/db/Query;", "stream", "Lio/reactivex/Observable;", "id", "p2pContentOverride", "lib-store-rhy_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhySpendingAccountLearnMoreStore extends Store {
    private final RhySpendingAccountLearnMoreDao dao;
    private final Endpoint<Tuples2<UUID, Boolean>, RhySpendingAccountLearnMore> endpoint;
    private final Query<Tuples2<UUID, Boolean>, RhySpendingAccountLearnMore> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhySpendingAccountLearnMoreStore(RhySpendingAccountLearnMoreDao dao, RhyBonfireApi bonfireApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.dao = dao;
        Endpoint<Tuples2<UUID, Boolean>, RhySpendingAccountLearnMore> endpointCreate$default = Endpoint.Companion.create$default(Endpoint.INSTANCE, new RhySpendingAccountLearnMoreStore2(bonfireApi, null), getLogoutKillswitch(), new RhySpendingAccountLearnMoreStore3(dao), storeBundle.getClock(), null, 16, null);
        this.endpoint = endpointCreate$default;
        this.query = Store.create$default(this, Query.INSTANCE, "queryRhySpendingAccountLearnMore", CollectionsKt.listOf(new RefreshEach(new RhySpendingAccountLearnMoreStore4(endpointCreate$default))), new Function1() { // from class: com.robinhood.librobinhood.data.store.rhy.RhySpendingAccountLearnMoreStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhySpendingAccountLearnMoreStore.query$lambda$0(this.f$0, (Tuples2) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$insert(RhySpendingAccountLearnMoreDao rhySpendingAccountLearnMoreDao, RhySpendingAccountLearnMore rhySpendingAccountLearnMore, Continuation continuation) {
        rhySpendingAccountLearnMoreDao.insert(rhySpendingAccountLearnMore);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(RhySpendingAccountLearnMoreStore rhySpendingAccountLearnMoreStore, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return rhySpendingAccountLearnMoreStore.dao.getRhySpendingAccountLearnMore((UUID) tuples2.component1());
    }

    public final Observable<RhySpendingAccountLearnMore> stream(UUID id, boolean p2pContentOverride) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.query.asObservable(Tuples4.m3642to(id, Boolean.valueOf(p2pContentOverride)));
    }
}

package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.Batch;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.directipo.models.api.ApiIpoAccessItem;
import com.robinhood.directipo.models.p292db.IpoAccessItem;
import com.robinhood.models.dao.bonfire.IpoAccessItemDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: IpoAccessItemStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0014\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/IpoAccessItemStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/bonfire/IpoAccessItemDao;", "<init>", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/bonfire/IpoAccessItemDao;)V", "query", "Lcom/robinhood/android/moria/db/Query;", "Ljava/util/UUID;", "Lcom/robinhood/directipo/models/db/IpoAccessItem;", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Lcom/robinhood/directipo/models/api/ApiIpoAccessItem;", "stream", "Lio/reactivex/Observable;", "instrumentId", "Companion", "lib-store-direct-ipo_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class IpoAccessItemStore extends Store {
    private static final int MAX_BATCH_SIZE = 50;
    private final DirectIpoApi api;
    private final IpoAccessItemDao dao;
    private final PaginatedEndpoint<Iterable<UUID>, ApiIpoAccessItem> endpoint;
    private final Query<UUID, IpoAccessItem> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoAccessItemStore(DirectIpoApi api, StoreBundle storeBundle, IpoAccessItemDao dao) {
        super(storeBundle, IpoAccessItem.INSTANCE);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.api = api;
        this.dao = dao;
        this.query = Store.create$default(this, Query.INSTANCE, CollectionsKt.listOf(new Batch(getStoreScope(), 50, false, 0L, new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IpoAccessItemStore.query$lambda$0(this.f$0, (Collection) obj);
            }
        }, 12, null)), new IpoAccessItemStore4(dao), false, 4, null);
        this.endpoint = PaginatedEndpoint.Companion.createBatched$default(PaginatedEndpoint.INSTANCE, 50, new IpoAccessItemStore2(this, null), getLogoutKillswitch(), new IpoAccessItemStore3(this, null), storeBundle.getClock(), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(IpoAccessItemStore ipoAccessItemStore, Collection uuids) {
        Intrinsics.checkNotNullParameter(uuids, "uuids");
        return PaginatedEndpoint.DefaultImpls.pollAllPages$default(ipoAccessItemStore.endpoint, uuids, null, 2, null);
    }

    public final Observable<IpoAccessItem> stream(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.query.asObservable(instrumentId);
    }
}

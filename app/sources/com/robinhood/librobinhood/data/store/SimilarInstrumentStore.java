package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.retrofit.DoraApi;
import com.robinhood.models.dao.SimilarInstrumentDao;
import com.robinhood.models.p320db.SimilarInstrument;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimilarInstrumentStore.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u00142\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SimilarInstrumentStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/SimilarInstrumentDao;", "doraApi", "Lcom/robinhood/api/retrofit/DoraApi;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/SimilarInstrumentDao;Lcom/robinhood/api/retrofit/DoraApi;Lcom/robinhood/librobinhood/data/store/InstrumentStore;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "", "Lcom/robinhood/models/db/SimilarInstrument;", "query", "Lcom/robinhood/android/moria/db/Query;", "streamSimilarInstrumentIds", "Lio/reactivex/Observable;", "instrumentId", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SimilarInstrumentStore extends Store {
    private final SimilarInstrumentDao dao;
    private final DoraApi doraApi;
    private final Endpoint<UUID, List<SimilarInstrument>> endpoint;
    private final InstrumentStore instrumentStore;
    private final Query<UUID, List<UUID>> query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarInstrumentStore(StoreBundle storeBundle, SimilarInstrumentDao dao, DoraApi doraApi, InstrumentStore instrumentStore) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(doraApi, "doraApi");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        this.dao = dao;
        this.doraApi = doraApi;
        this.instrumentStore = instrumentStore;
        Endpoint<UUID, List<SimilarInstrument>> endpointCreateWithParams = Endpoint.INSTANCE.createWithParams(new SimilarInstrumentStore2(this, null), getLogoutKillswitch(), new SimilarInstrumentStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getONE_DAY(), storeBundle.getClock()));
        this.endpoint = endpointCreateWithParams;
        this.query = Store.create$default(this, Query.INSTANCE, "querySimilarInstrumentIds", CollectionsKt.listOf(new RefreshEach(new SimilarInstrumentStore4(endpointCreateWithParams))), new SimilarInstrumentStore5(dao), false, 8, null);
    }

    public final Observable<List<UUID>> streamSimilarInstrumentIds(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return this.query.asObservable(instrumentId);
    }
}

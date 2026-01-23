package com.robinhood.librobinhood.data.store.marketupdates;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.newsfeed.NewsFeedApi;
import com.robinhood.models.market.updates.api.ApiMarketIndices;
import com.robinhood.models.market.updates.p332db.MarketIndices;
import com.robinhood.models.market.updates.p332db.MarketIndicesDao;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import retrofit2.Response;

/* compiled from: MarketIndicesStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/marketupdates/MarketIndicesStore;", "Lcom/robinhood/store/Store;", "newsfeedApi", "Lcom/robinhood/api/newsfeed/NewsFeedApi;", "dao", "Lcom/robinhood/models/market/updates/db/MarketIndicesDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/newsfeed/NewsFeedApi;Lcom/robinhood/models/market/updates/db/MarketIndicesDao;Lcom/robinhood/store/StoreBundle;)V", "marketIndicesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lretrofit2/Response;", "Lcom/robinhood/models/market/updates/api/ApiMarketIndices;", "indicesQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/market/updates/db/MarketIndices;", "streamMarketIndices", "Lio/reactivex/Observable;", "keys", "lib-store-market-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class MarketIndicesStore extends Store {
    private final MarketIndicesDao dao;
    private final Query<List<String>, MarketIndices> indicesQuery;
    private final Endpoint<List<String>, Response<ApiMarketIndices>> marketIndicesEndpoint;
    private final NewsFeedApi newsfeedApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketIndicesStore(NewsFeedApi newsfeedApi, MarketIndicesDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(newsfeedApi, "newsfeedApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.newsfeedApi = newsfeedApi;
        this.dao = dao;
        this.marketIndicesEndpoint = Endpoint.Companion.createWithParams$default(Endpoint.INSTANCE, new MarketIndicesStore2(this, null), getLogoutKillswitch(), new MarketIndicesStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.indicesQuery = Store.create$default(this, Query.INSTANCE, "pollMarketIndices", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketIndicesStore.indicesQuery$lambda$0(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.marketupdates.MarketIndicesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketIndicesStore.indicesQuery$lambda$1(this.f$0, (List) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indicesQuery$lambda$0(MarketIndicesStore marketIndicesStore, List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        if (!keys.isEmpty()) {
            return Endpoint.DefaultImpls.poll$default(marketIndicesStore.marketIndicesEndpoint, keys, Durations.INSTANCE.getFIVE_SECONDS(), null, 4, null);
        }
        return FlowKt.emptyFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow indicesQuery$lambda$1(MarketIndicesStore marketIndicesStore, List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return marketIndicesStore.dao.get(keys);
    }

    public final Observable<MarketIndices> streamMarketIndices(List<String> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        return this.indicesQuery.asObservable(keys);
    }
}

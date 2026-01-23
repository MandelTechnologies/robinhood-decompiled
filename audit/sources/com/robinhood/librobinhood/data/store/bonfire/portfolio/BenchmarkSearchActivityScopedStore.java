package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: BenchmarkSearchActivityScopedStore.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0010\u001a\u00020\rR\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/BenchmarkSearchActivityScopedStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "portfolioApi", "Lcom/robinhood/android/api/portfolio/PortfolioApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/android/api/portfolio/PortfolioApi;)V", "defaultSearchResults", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "searchEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "search", "Lkotlinx/coroutines/flow/Flow;", "query", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class BenchmarkSearchActivityScopedStore extends Store {
    private final StateFlow2<BenchmarkingSearchResults> defaultSearchResults;
    private final Endpoint<String, BenchmarkingSearchResults> searchEndpoint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenchmarkSearchActivityScopedStore(StoreBundle storeBundle, PortfolioApi portfolioApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(portfolioApi, "portfolioApi");
        this.defaultSearchResults = StateFlow4.MutableStateFlow(null);
        this.searchEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new BenchmarkSearchActivityScopedStore2(portfolioApi, null), getLogoutKillswitch(), new BenchmarkSearchActivityScopedStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Flow<BenchmarkingSearchResults> search(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Flow<BenchmarkingSearchResults> flowPoll$default = Endpoint.DefaultImpls.poll$default(this.searchEndpoint, query, null, null, 6, null);
        return Intrinsics.areEqual(query, "") ? FlowKt.merge(CollectionsKt.listOf((Object[]) new Flow[]{flowPoll$default, FlowKt.filterNotNull(this.defaultSearchResults)})) : flowPoll$default;
    }
}

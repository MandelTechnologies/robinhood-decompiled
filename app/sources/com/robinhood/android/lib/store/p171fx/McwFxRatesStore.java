package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.common.modelsfxdb.dao.McwFxRatesDao;
import com.robinhood.android.lib.api.p164fx.MarketDataApi;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.models.p325fx.api.ApiMcwFxQuotes;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwFxRatesStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0002\u0010\u0018J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u001a2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0018\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/McwFxRatesStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "marketDataApi", "Lcom/robinhood/android/lib/api/fx/MarketDataApi;", "dao", "Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/lib/api/fx/MarketDataApi;Lcom/robinhood/android/common/modelsfxdb/dao/McwFxRatesDao;Lcom/robinhood/store/StoreBundle;)V", "mcwFxQuotesEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "", "Lcom/robinhood/models/fx/api/ApiMcwFxQuotes;", "mcwFxQuotesQuery", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/fx/db/McwFxRate;", "getLocalFxRate", "symbol", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFxRates", "symbols", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFxRates", "Lkotlinx/coroutines/flow/Flow;", "streamFromUsdFxRate", "currency", "Lcom/robinhood/rosetta/common/Currency;", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class McwFxRatesStore extends Store implements McwFxRatesProvider {
    private final McwFxRatesDao dao;
    private final MarketDataApi marketDataApi;
    private final Endpoint<List<String>, ApiMcwFxQuotes> mcwFxQuotesEndpoint;
    private final Query<List<String>, List<McwFxRate>> mcwFxQuotesQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McwFxRatesStore(MarketDataApi marketDataApi, McwFxRatesDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(marketDataApi, "marketDataApi");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.marketDataApi = marketDataApi;
        this.dao = dao;
        this.mcwFxQuotesEndpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new McwFxRatesStore2(this, null), getLogoutKillswitch(), new McwFxRatesStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.mcwFxQuotesQuery = Store.create$default(this, Query.INSTANCE, "mcwFxQuotesQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.lib.store.fx.McwFxRatesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesStore.mcwFxQuotesQuery$lambda$0(this.f$0, (List) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.lib.store.fx.McwFxRatesStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return McwFxRatesStore.mcwFxQuotesQuery$lambda$1(this.f$0, (List) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow mcwFxQuotesQuery$lambda$0(McwFxRatesStore mcwFxRatesStore, List params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return Endpoint.DefaultImpls.poll$default(mcwFxRatesStore.mcwFxQuotesEndpoint, params, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow mcwFxQuotesQuery$lambda$1(McwFxRatesStore mcwFxRatesStore, List symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return mcwFxRatesStore.dao.streamMcwFxRates(symbols);
    }

    @Override // com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider
    public Object getLocalFxRate(String str, Continuation<? super McwFxRate> continuation) {
        return this.dao.getMcwFxRate(str);
    }

    @Override // com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider
    public Object fetchFxRates(List<String> list, Continuation<? super ApiMcwFxQuotes> continuation) {
        return Endpoint.DefaultImpls.forceFetch$default(this.mcwFxQuotesEndpoint, list, null, continuation, 2, null);
    }

    @Override // com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider
    public Flow<List<McwFxRate>> streamFxRates(List<String> symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return this.mcwFxQuotesQuery.asFlow(symbols);
    }

    @Override // com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider
    public Flow<McwFxRate> streamFromUsdFxRate(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return this.dao.streamMcwFxRate("USD" + currency.name());
    }
}

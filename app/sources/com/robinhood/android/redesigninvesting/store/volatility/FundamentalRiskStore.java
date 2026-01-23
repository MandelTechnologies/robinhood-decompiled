package com.robinhood.android.redesigninvesting.store.volatility;

import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.redesigninvesting.api.highlights.volatility.HighlightsMarketdataApi;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.api.ApiFundamentalRisk;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRisk;
import com.robinhood.android.redesigninvesting.models.highlights.volatility.p233db.FundamentalRiskDao;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: FundamentalRiskStore.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/store/volatility/FundamentalRiskStore;", "Lcom/robinhood/store/Store;", "api", "Lcom/robinhood/android/redesigninvesting/api/highlights/volatility/HighlightsMarketdataApi;", "dao", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRiskDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/redesigninvesting/api/highlights/volatility/HighlightsMarketdataApi;Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRiskDao;Lcom/robinhood/store/StoreBundle;)V", "endpoint", "Lcom/robinhood/api/PaginatedEndpoint;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/api/ApiFundamentalRisk;", "fundamentalRiskListQuery", "Lcom/robinhood/android/moria/db/Query;", "", "", "Lcom/robinhood/android/redesigninvesting/models/highlights/volatility/db/FundamentalRisk;", "streamFundamentalRisks", "Lkotlinx/coroutines/flow/Flow;", "instrumentIds", "lib-store-volatility_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FundamentalRiskStore extends Store {
    private final HighlightsMarketdataApi api;
    private final FundamentalRiskDao dao;
    private final PaginatedEndpoint<Iterable<UUID>, ApiFundamentalRisk> endpoint;
    private final Query<Collection<UUID>, List<FundamentalRisk>> fundamentalRiskListQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundamentalRiskStore(HighlightsMarketdataApi api, FundamentalRiskDao dao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.endpoint = PaginatedEndpoint.Companion.createBatched$default(PaginatedEndpoint.INSTANCE, 10, new FundamentalRiskStore2(this, null), getLogoutKillswitch(), new FundamentalRiskStore3(this, null), storeBundle.getClock(), null, 32, null);
        this.fundamentalRiskListQuery = Store.create$default(this, Query.INSTANCE, "fundamentalRiskListQuery", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FundamentalRiskStore.fundamentalRiskListQuery$lambda$0(this.f$0, (Collection) obj);
            }
        })), new Function1() { // from class: com.robinhood.android.redesigninvesting.store.volatility.FundamentalRiskStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FundamentalRiskStore.fundamentalRiskListQuery$lambda$1(this.f$0, (Collection) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fundamentalRiskListQuery$lambda$0(FundamentalRiskStore fundamentalRiskStore, Collection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PaginatedEndpoint<Iterable<UUID>, ApiFundamentalRisk> paginatedEndpoint = fundamentalRiskStore.endpoint;
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        return paginatedEndpoint.pollAllPages(it, durationOfMinutes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow fundamentalRiskListQuery$lambda$1(FundamentalRiskStore fundamentalRiskStore, Collection instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return fundamentalRiskStore.dao.getList(instrumentIds);
    }

    public final Flow<List<FundamentalRisk>> streamFundamentalRisks(Collection<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        return this.fundamentalRiskListQuery.asFlow(instrumentIds);
    }
}

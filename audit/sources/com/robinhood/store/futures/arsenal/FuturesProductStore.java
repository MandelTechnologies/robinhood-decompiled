package com.robinhood.store.futures.arsenal;

import com.robinhood.android.models.futures.arsenal.dao.FuturesProductDao;
import com.robinhood.android.models.futures.arsenal.p188db.FuturesProduct;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.arsenal.proto.p281v1.idl.InstrumentService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: FuturesProductStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/store/futures/arsenal/FuturesProductStore;", "Lcom/robinhood/store/Store;", "arsenalService", "Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;", "futuresProductDao", "Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/InstrumentService;Lcom/robinhood/android/models/futures/arsenal/dao/FuturesProductDao;Lcom/robinhood/store/StoreBundle;)V", "futuresProductEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/android/models/futures/arsenal/db/FuturesProduct;", "futuresProductQuery", "Lcom/robinhood/android/moria/db/Query;", "streamFuturesProduct", "Lkotlinx/coroutines/flow/Flow;", "productId", "lib-store-futures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class FuturesProductStore extends Store {
    private final InstrumentService arsenalService;
    private final FuturesProductDao futuresProductDao;
    private final Endpoint<UUID, FuturesProduct> futuresProductEndpoint;
    private final Query<UUID, FuturesProduct> futuresProductQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesProductStore(InstrumentService arsenalService, FuturesProductDao futuresProductDao, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(arsenalService, "arsenalService");
        Intrinsics.checkNotNullParameter(futuresProductDao, "futuresProductDao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.arsenalService = arsenalService;
        this.futuresProductDao = futuresProductDao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        FuturesProductStore2 futuresProductStore2 = new FuturesProductStore2(arsenalService);
        LogoutKillswitch logoutKillswitch = storeBundle.getLogoutKillswitch();
        FuturesProductStore3 futuresProductStore3 = new FuturesProductStore3(this, null);
        Clock clock = storeBundle.getClock();
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfMinutes, "ofMinutes(...)");
        Endpoint<UUID, FuturesProduct> endpointCreate = companion.create(futuresProductStore2, logoutKillswitch, futuresProductStore3, clock, new DefaultStaleDecider(durationOfMinutes, storeBundle.getClock()));
        this.futuresProductEndpoint = endpointCreate;
        this.futuresProductQuery = Query.Companion.create$default(Query.INSTANCE, storeBundle.getRxFactory(), "queryFuturesProduct", CollectionsKt.listOf(new RefreshEach(new FuturesProductStore4(endpointCreate))), new FuturesProductStore5(futuresProductDao), false, 16, null);
    }

    public final Flow<FuturesProduct> streamFuturesProduct(UUID productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        return FlowKt.distinctUntilChanged(this.futuresProductQuery.asFlow(productId));
    }
}

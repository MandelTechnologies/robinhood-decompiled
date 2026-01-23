package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.bonfire.ApiOrderDetail;
import com.robinhood.models.dao.OrderDetailDao;
import com.robinhood.models.p320db.bonfire.OrderDetail;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Duration;

/* compiled from: OrderDetailStore.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/OrderDetailStore;", "Lcom/robinhood/store/Store;", "bonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/OrderDetailDao;", "<init>", "(Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/OrderDetailDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Ljava/util/UUID;", "Lcom/robinhood/models/api/bonfire/ApiOrderDetail;", "stream", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/OrderDetail;", "getStream", "()Lcom/robinhood/android/moria/db/Query;", "refresh", "Lkotlinx/coroutines/Job;", "orderId", "force", "", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OrderDetailStore extends Store {
    private final OrderDetailDao dao;
    private final Endpoint<UUID, ApiOrderDetail> endpoint;
    private final Query<UUID, OrderDetail> stream;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailStore(TradeEquityBonfireApi bonfireApi, StoreBundle storeBundle, OrderDetailDao dao) {
        super(storeBundle, OrderDetail.INSTANCE);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
        this.endpoint = Endpoint.Companion.create$default(Endpoint.INSTANCE, new OrderDetailStore2(bonfireApi), getLogoutKillswitch(), new OrderDetailStore3(this, null), storeBundle.getClock(), null, 16, null);
        this.stream = Store.create$default(this, Query.INSTANCE, "queryOrderDetail", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.bonfire.OrderDetailStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderDetailStore.stream$lambda$0(this.f$0, (UUID) obj);
            }
        })), new OrderDetailStore4(dao), false, 8, null);
    }

    public final Query<UUID, OrderDetail> getStream() {
        return this.stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow stream$lambda$0(OrderDetailStore orderDetailStore, UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Endpoint<UUID, ApiOrderDetail> endpoint = orderDetailStore.endpoint;
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint.DefaultImpls.poll$default(endpoint, orderId, durationOfSeconds, null, 4, null);
    }

    public final Job refresh(UUID orderId, boolean force) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return Endpoint.DefaultImpls.refresh$default(this.endpoint, orderId, force, null, 4, null);
    }
}

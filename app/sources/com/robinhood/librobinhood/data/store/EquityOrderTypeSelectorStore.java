package com.robinhood.librobinhood.data.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.RefreshEach;
import com.robinhood.api.trade.equity.retrofit.TradeEquityBonfireApi;
import com.robinhood.models.api.bonfire.ApiOrderTypeSelectorResponse;
import com.robinhood.models.dao.EquityOrderTypeSelectorDao;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.bonfire.OrderTypeSelector;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.datetime.Durations;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EquityOrderTypeSelectorStore.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0017\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/EquityOrderTypeSelectorStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "tradeEquityBonfireApi", "Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;", "orderTypeSelectorDao", "Lcom/robinhood/models/dao/EquityOrderTypeSelectorDao;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/trade/equity/retrofit/TradeEquityBonfireApi;Lcom/robinhood/models/dao/EquityOrderTypeSelectorDao;)V", "endpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/db/EquityOrderSide;", "Lcom/robinhood/models/api/bonfire/ApiOrderTypeSelectorResponse;", "getEndpoint$lib_store_equity_shared_externalDebug$annotations", "()V", "getEndpoint$lib_store_equity_shared_externalDebug", "()Lcom/robinhood/android/moria/network/Endpoint;", "query", "Lcom/robinhood/android/moria/db/Query;", "Lcom/robinhood/models/db/bonfire/OrderTypeSelector;", "orderTypeSelector", "Lio/reactivex/Observable;", "orderSide", "lib-store-equity-shared_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class EquityOrderTypeSelectorStore extends Store {
    private final Endpoint<EquityOrderSide, ApiOrderTypeSelectorResponse> endpoint;
    private final EquityOrderTypeSelectorDao orderTypeSelectorDao;
    private final Query<EquityOrderSide, OrderTypeSelector> query;
    private final TradeEquityBonfireApi tradeEquityBonfireApi;

    public static /* synthetic */ void getEndpoint$lib_store_equity_shared_externalDebug$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityOrderTypeSelectorStore(StoreBundle storeBundle, TradeEquityBonfireApi tradeEquityBonfireApi, EquityOrderTypeSelectorDao orderTypeSelectorDao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(tradeEquityBonfireApi, "tradeEquityBonfireApi");
        Intrinsics.checkNotNullParameter(orderTypeSelectorDao, "orderTypeSelectorDao");
        this.tradeEquityBonfireApi = tradeEquityBonfireApi;
        this.orderTypeSelectorDao = orderTypeSelectorDao;
        Endpoint<EquityOrderSide, ApiOrderTypeSelectorResponse> endpointCreate = Endpoint.INSTANCE.create(new EquityOrderTypeSelectorStore2(this, null), getLogoutKillswitch(), new EquityOrderTypeSelectorStore3(this, null), storeBundle.getClock(), new DefaultStaleDecider(Durations.INSTANCE.getTHIRTY_MINUTES(), storeBundle.getClock()));
        this.endpoint = endpointCreate;
        this.query = Store.create$default(this, Query.INSTANCE, "refreshOrderTypeSelector", CollectionsKt.listOf(new RefreshEach(new EquityOrderTypeSelectorStore4(endpointCreate))), new Function1() { // from class: com.robinhood.librobinhood.data.store.EquityOrderTypeSelectorStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EquityOrderTypeSelectorStore.query$lambda$0(this.f$0, (EquityOrderSide) obj);
            }
        }, false, 8, null);
    }

    public final Endpoint<EquityOrderSide, ApiOrderTypeSelectorResponse> getEndpoint$lib_store_equity_shared_externalDebug() {
        return this.endpoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow query$lambda$0(EquityOrderTypeSelectorStore equityOrderTypeSelectorStore, EquityOrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return equityOrderTypeSelectorStore.orderTypeSelectorDao.get(orderSide);
    }

    public final Observable<OrderTypeSelector> orderTypeSelector(EquityOrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        return this.query.asObservable(orderSide);
    }
}

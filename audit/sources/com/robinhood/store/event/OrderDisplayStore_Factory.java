package com.robinhood.store.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.models.event.p186db.dao.OrderFormDisplayDetailsDao;
import com.robinhood.prediction_markets.proto.p361v1.idl.InstrumentService;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.util.PredictionMarketsRequestHeaderDelegate2;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDisplayStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/store/event/OrderDisplayStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/event/OrderDisplayStore;", "orderFormDisplayDetailsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/event/db/dao/OrderFormDisplayDetailsDao;", "instrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class OrderDisplayStore_Factory implements Factory<OrderDisplayStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InstrumentService> instrumentService;
    private final Provider<OrderFormDisplayDetailsDao> orderFormDisplayDetailsDao;
    private final Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final OrderDisplayStore_Factory create(Provider<OrderFormDisplayDetailsDao> provider, Provider<InstrumentService> provider2, Provider<PredictionMarketsRequestHeaderDelegate2> provider3, Provider<StoreBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final OrderDisplayStore newInstance(OrderFormDisplayDetailsDao orderFormDisplayDetailsDao, InstrumentService instrumentService, PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2, StoreBundle storeBundle) {
        return INSTANCE.newInstance(orderFormDisplayDetailsDao, instrumentService, predictionMarketsRequestHeaderDelegate2, storeBundle);
    }

    public OrderDisplayStore_Factory(Provider<OrderFormDisplayDetailsDao> orderFormDisplayDetailsDao, Provider<InstrumentService> instrumentService, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(orderFormDisplayDetailsDao, "orderFormDisplayDetailsDao");
        Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
        Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.orderFormDisplayDetailsDao = orderFormDisplayDetailsDao;
        this.instrumentService = instrumentService;
        this.requestHeaderPlugin = requestHeaderPlugin;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public OrderDisplayStore get() {
        Companion companion = INSTANCE;
        OrderFormDisplayDetailsDao orderFormDisplayDetailsDao = this.orderFormDisplayDetailsDao.get();
        Intrinsics.checkNotNullExpressionValue(orderFormDisplayDetailsDao, "get(...)");
        InstrumentService instrumentService = this.instrumentService.get();
        Intrinsics.checkNotNullExpressionValue(instrumentService, "get(...)");
        PredictionMarketsRequestHeaderDelegate2 predictionMarketsRequestHeaderDelegate2 = this.requestHeaderPlugin.get();
        Intrinsics.checkNotNullExpressionValue(predictionMarketsRequestHeaderDelegate2, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(orderFormDisplayDetailsDao, instrumentService, predictionMarketsRequestHeaderDelegate2, storeBundle);
    }

    /* compiled from: OrderDisplayStore_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/store/event/OrderDisplayStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/event/OrderDisplayStore_Factory;", "orderFormDisplayDetailsDao", "Ljavax/inject/Provider;", "Lcom/robinhood/android/models/event/db/dao/OrderFormDisplayDetailsDao;", "instrumentService", "Lcom/robinhood/prediction_markets/proto/v1/idl/InstrumentService;", "requestHeaderPlugin", "Lcom/robinhood/store/util/PredictionMarketsRequestHeaderPlugin;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/event/OrderDisplayStore;", "lib-store-event_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderDisplayStore_Factory create(Provider<OrderFormDisplayDetailsDao> orderFormDisplayDetailsDao, Provider<InstrumentService> instrumentService, Provider<PredictionMarketsRequestHeaderDelegate2> requestHeaderPlugin, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(orderFormDisplayDetailsDao, "orderFormDisplayDetailsDao");
            Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OrderDisplayStore_Factory(orderFormDisplayDetailsDao, instrumentService, requestHeaderPlugin, storeBundle);
        }

        @JvmStatic
        public final OrderDisplayStore newInstance(OrderFormDisplayDetailsDao orderFormDisplayDetailsDao, InstrumentService instrumentService, PredictionMarketsRequestHeaderDelegate2 requestHeaderPlugin, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(orderFormDisplayDetailsDao, "orderFormDisplayDetailsDao");
            Intrinsics.checkNotNullParameter(instrumentService, "instrumentService");
            Intrinsics.checkNotNullParameter(requestHeaderPlugin, "requestHeaderPlugin");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new OrderDisplayStore(orderFormDisplayDetailsDao, instrumentService, requestHeaderPlugin, storeBundle);
        }
    }
}

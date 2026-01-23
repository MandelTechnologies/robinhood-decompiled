package com.robinhood.librobinhood.data.store.bff;

import bff_money_movement.service.p019v1.BffMoneyMovementService;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.dao.PaymentIntentDao;
import com.robinhood.store.StoreBundle;
import com.robinhood.store.paymentinstrument.PaymentInstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentIntentStore_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "api", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "dao", "Lcom/robinhood/models/dao/PaymentIntentDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PaymentIntentStore_Factory implements Factory<PaymentIntentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<BffMoneyMovementService> api;
    private final Provider<PaymentIntentDao> dao;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<PaymentInstrumentStore> paymentInstrumentStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PaymentIntentStore_Factory create(Provider<BffMoneyMovementService> provider, Provider<PaymentIntentDao> provider2, Provider<ExperimentsStore> provider3, Provider<PaymentInstrumentStore> provider4, Provider<StoreBundle> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final PaymentIntentStore newInstance(BffMoneyMovementService bffMoneyMovementService, PaymentIntentDao paymentIntentDao, ExperimentsStore experimentsStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
        return INSTANCE.newInstance(bffMoneyMovementService, paymentIntentDao, experimentsStore, paymentInstrumentStore, storeBundle);
    }

    public PaymentIntentStore_Factory(Provider<BffMoneyMovementService> api, Provider<PaymentIntentDao> dao, Provider<ExperimentsStore> experimentsStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.experimentsStore = experimentsStore;
        this.paymentInstrumentStore = paymentInstrumentStore;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public PaymentIntentStore get() {
        Companion companion = INSTANCE;
        BffMoneyMovementService bffMoneyMovementService = this.api.get();
        Intrinsics.checkNotNullExpressionValue(bffMoneyMovementService, "get(...)");
        PaymentIntentDao paymentIntentDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(paymentIntentDao, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        PaymentInstrumentStore paymentInstrumentStore = this.paymentInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(bffMoneyMovementService, paymentIntentDao, experimentsStore, paymentInstrumentStore, storeBundle);
    }

    /* compiled from: PaymentIntentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore_Factory;", "api", "Ljavax/inject/Provider;", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "dao", "Lcom/robinhood/models/dao/PaymentIntentDao;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "paymentInstrumentStore", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/librobinhood/data/store/bff/PaymentIntentStore;", "lib-store-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentIntentStore_Factory create(Provider<BffMoneyMovementService> api, Provider<PaymentIntentDao> dao, Provider<ExperimentsStore> experimentsStore, Provider<PaymentInstrumentStore> paymentInstrumentStore, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PaymentIntentStore_Factory(api, dao, experimentsStore, paymentInstrumentStore, storeBundle);
        }

        @JvmStatic
        public final PaymentIntentStore newInstance(BffMoneyMovementService api, PaymentIntentDao dao, ExperimentsStore experimentsStore, PaymentInstrumentStore paymentInstrumentStore, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(paymentInstrumentStore, "paymentInstrumentStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PaymentIntentStore(api, dao, experimentsStore, paymentInstrumentStore, storeBundle);
        }
    }
}

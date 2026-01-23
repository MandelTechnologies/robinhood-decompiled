package com.robinhood.store.paymentinstrument;

import com.robinhood.android.api.transfers.PaymentInstrumentBonfireApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.paymentinstrument.dao.PaymentInstrumentV2Dao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentInstrumentStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "dao", "Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PaymentInstrumentStore_Factory implements Factory<PaymentInstrumentStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<PaymentInstrumentBonfireApi> api;
    private final Provider<PaymentInstrumentV2Dao> dao;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final PaymentInstrumentStore_Factory create(Provider<PaymentInstrumentBonfireApi> provider, Provider<PaymentInstrumentV2Dao> provider2, Provider<StoreBundle> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final PaymentInstrumentStore newInstance(PaymentInstrumentBonfireApi paymentInstrumentBonfireApi, PaymentInstrumentV2Dao paymentInstrumentV2Dao, StoreBundle storeBundle) {
        return INSTANCE.newInstance(paymentInstrumentBonfireApi, paymentInstrumentV2Dao, storeBundle);
    }

    public PaymentInstrumentStore_Factory(Provider<PaymentInstrumentBonfireApi> api, Provider<PaymentInstrumentV2Dao> dao, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
        this.dao = dao;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public PaymentInstrumentStore get() {
        Companion companion = INSTANCE;
        PaymentInstrumentBonfireApi paymentInstrumentBonfireApi = this.api.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentBonfireApi, "get(...)");
        PaymentInstrumentV2Dao paymentInstrumentV2Dao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(paymentInstrumentV2Dao, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.newInstance(paymentInstrumentBonfireApi, paymentInstrumentV2Dao, storeBundle);
    }

    /* compiled from: PaymentInstrumentStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore_Factory;", "api", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/transfers/PaymentInstrumentBonfireApi;", "dao", "Lcom/robinhood/models/paymentinstrument/dao/PaymentInstrumentV2Dao;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "newInstance", "Lcom/robinhood/store/paymentinstrument/PaymentInstrumentStore;", "lib-store-payment-instrument_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentInstrumentStore_Factory create(Provider<PaymentInstrumentBonfireApi> api, Provider<PaymentInstrumentV2Dao> dao, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PaymentInstrumentStore_Factory(api, dao, storeBundle);
        }

        @JvmStatic
        public final PaymentInstrumentStore newInstance(PaymentInstrumentBonfireApi api, PaymentInstrumentV2Dao dao, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(api, "api");
            Intrinsics.checkNotNullParameter(dao, "dao");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new PaymentInstrumentStore(api, dao, storeBundle);
        }
    }
}

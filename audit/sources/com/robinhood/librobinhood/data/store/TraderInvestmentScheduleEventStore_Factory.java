package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringApi;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.bonfire.PaymentTransferStore;
import com.robinhood.recurring.models.dao.InvestmentScheduleEventDao;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderInvestmentScheduleEventStore_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore;", "recurringApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "uiCurrencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/InvestmentScheduleEventDao;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class TraderInvestmentScheduleEventStore_Factory implements Factory<TraderInvestmentScheduleEventStore> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<InvestmentScheduleEventDao> dao;
    private final Provider<TraderInvestmentScheduleStore> investmentScheduleStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<PaymentTransferStore> paymentTransferStore;
    private final Provider<RecurringApi> recurringApi;
    private final Provider<StoreBundle> storeBundle;
    private final Provider<CurrencyPairStore> uiCurrencyPairStore;

    @JvmStatic
    public static final TraderInvestmentScheduleEventStore_Factory create(Provider<RecurringApi> provider, Provider<PaymentTransferStore> provider2, Provider<TraderInvestmentScheduleStore> provider3, Provider<OrderStore> provider4, Provider<CurrencyPairStore> provider5, Provider<StoreBundle> provider6, Provider<InvestmentScheduleEventDao> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final TraderInvestmentScheduleEventStore newInstance(RecurringApi recurringApi, PaymentTransferStore paymentTransferStore, TraderInvestmentScheduleStore traderInvestmentScheduleStore, OrderStore orderStore, CurrencyPairStore currencyPairStore, StoreBundle storeBundle, InvestmentScheduleEventDao investmentScheduleEventDao) {
        return INSTANCE.newInstance(recurringApi, paymentTransferStore, traderInvestmentScheduleStore, orderStore, currencyPairStore, storeBundle, investmentScheduleEventDao);
    }

    public TraderInvestmentScheduleEventStore_Factory(Provider<RecurringApi> recurringApi, Provider<PaymentTransferStore> paymentTransferStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<OrderStore> orderStore, Provider<CurrencyPairStore> uiCurrencyPairStore, Provider<StoreBundle> storeBundle, Provider<InvestmentScheduleEventDao> dao) {
        Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
        Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(uiCurrencyPairStore, "uiCurrencyPairStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.recurringApi = recurringApi;
        this.paymentTransferStore = paymentTransferStore;
        this.investmentScheduleStore = investmentScheduleStore;
        this.orderStore = orderStore;
        this.uiCurrencyPairStore = uiCurrencyPairStore;
        this.storeBundle = storeBundle;
        this.dao = dao;
    }

    @Override // javax.inject.Provider
    public TraderInvestmentScheduleEventStore get() {
        Companion companion = INSTANCE;
        RecurringApi recurringApi = this.recurringApi.get();
        Intrinsics.checkNotNullExpressionValue(recurringApi, "get(...)");
        PaymentTransferStore paymentTransferStore = this.paymentTransferStore.get();
        Intrinsics.checkNotNullExpressionValue(paymentTransferStore, "get(...)");
        TraderInvestmentScheduleStore traderInvestmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(traderInvestmentScheduleStore, "get(...)");
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        CurrencyPairStore currencyPairStore = this.uiCurrencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairStore, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        InvestmentScheduleEventDao investmentScheduleEventDao = this.dao.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleEventDao, "get(...)");
        return companion.newInstance(recurringApi, paymentTransferStore, traderInvestmentScheduleStore, orderStore, currencyPairStore, storeBundle, investmentScheduleEventDao);
    }

    /* compiled from: TraderInvestmentScheduleEventStore_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore_Factory;", "recurringApi", "Ljavax/inject/Provider;", "Lcom/robinhood/android/api/recurring/retrofit/RecurringApi;", "paymentTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/PaymentTransferStore;", "investmentScheduleStore", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleStore;", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "uiCurrencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/recurring/models/dao/InvestmentScheduleEventDao;", "newInstance", "Lcom/robinhood/librobinhood/data/store/TraderInvestmentScheduleEventStore;", "lib-store-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TraderInvestmentScheduleEventStore_Factory create(Provider<RecurringApi> recurringApi, Provider<PaymentTransferStore> paymentTransferStore, Provider<TraderInvestmentScheduleStore> investmentScheduleStore, Provider<OrderStore> orderStore, Provider<CurrencyPairStore> uiCurrencyPairStore, Provider<StoreBundle> storeBundle, Provider<InvestmentScheduleEventDao> dao) {
            Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(uiCurrencyPairStore, "uiCurrencyPairStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new TraderInvestmentScheduleEventStore_Factory(recurringApi, paymentTransferStore, investmentScheduleStore, orderStore, uiCurrencyPairStore, storeBundle, dao);
        }

        @JvmStatic
        public final TraderInvestmentScheduleEventStore newInstance(RecurringApi recurringApi, PaymentTransferStore paymentTransferStore, TraderInvestmentScheduleStore investmentScheduleStore, OrderStore orderStore, CurrencyPairStore uiCurrencyPairStore, StoreBundle storeBundle, InvestmentScheduleEventDao dao) {
            Intrinsics.checkNotNullParameter(recurringApi, "recurringApi");
            Intrinsics.checkNotNullParameter(paymentTransferStore, "paymentTransferStore");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(uiCurrencyPairStore, "uiCurrencyPairStore");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Intrinsics.checkNotNullParameter(dao, "dao");
            return new TraderInvestmentScheduleEventStore(recurringApi, paymentTransferStore, investmentScheduleStore, orderStore, uiCurrencyPairStore, storeBundle, dao);
        }
    }
}

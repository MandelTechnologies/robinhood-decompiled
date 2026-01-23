package com.robinhood.shared.order.type.priceInput;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.crypto.perpetuals.store.PerpetualContractStore;
import com.robinhood.crypto.perpetuals.store.PerpetualsOrderPriceValidationStore;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypePriceInputDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "marketDataStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "orderPriceValidationStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsOrderPriceValidationStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderTypePriceInputDuxo_Factory implements Factory<OrderTypePriceInputDuxo> {
    private final Provider<PerpetualContractStore> contractStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MarketDataProxyStore> marketDataStore;
    private final Provider<PerpetualsOrderPriceValidationStore> orderPriceValidationStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OrderTypePriceInputDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderTypePriceInputDuxo_Factory create(Provider<DuxoBundle> provider, Provider<OrderTypePriceInputDuxo2> provider2, Provider<SavedStateHandle> provider3, Provider<PerpetualContractStore> provider4, Provider<MarketDataProxyStore> provider5, Provider<PerpetualsOrderPriceValidationStore> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OrderTypePriceInputDuxo newInstance(DuxoBundle duxoBundle, OrderTypePriceInputDuxo2 orderTypePriceInputDuxo2, SavedStateHandle savedStateHandle, PerpetualContractStore perpetualContractStore, MarketDataProxyStore marketDataProxyStore, PerpetualsOrderPriceValidationStore perpetualsOrderPriceValidationStore) {
        return INSTANCE.newInstance(duxoBundle, orderTypePriceInputDuxo2, savedStateHandle, perpetualContractStore, marketDataProxyStore, perpetualsOrderPriceValidationStore);
    }

    public OrderTypePriceInputDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<OrderTypePriceInputDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<PerpetualContractStore> contractStore, Provider<MarketDataProxyStore> marketDataStore, Provider<PerpetualsOrderPriceValidationStore> orderPriceValidationStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(contractStore, "contractStore");
        Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
        Intrinsics.checkNotNullParameter(orderPriceValidationStore, "orderPriceValidationStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.contractStore = contractStore;
        this.marketDataStore = marketDataStore;
        this.orderPriceValidationStore = orderPriceValidationStore;
    }

    @Override // javax.inject.Provider
    public OrderTypePriceInputDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OrderTypePriceInputDuxo2 orderTypePriceInputDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(orderTypePriceInputDuxo2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        PerpetualContractStore perpetualContractStore = this.contractStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualContractStore, "get(...)");
        MarketDataProxyStore marketDataProxyStore = this.marketDataStore.get();
        Intrinsics.checkNotNullExpressionValue(marketDataProxyStore, "get(...)");
        PerpetualsOrderPriceValidationStore perpetualsOrderPriceValidationStore = this.orderPriceValidationStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualsOrderPriceValidationStore, "get(...)");
        return companion.newInstance(duxoBundle, orderTypePriceInputDuxo2, savedStateHandle, perpetualContractStore, marketDataProxyStore, perpetualsOrderPriceValidationStore);
    }

    /* compiled from: OrderTypePriceInputDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "contractStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualContractStore;", "marketDataStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "orderPriceValidationStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsOrderPriceValidationStore;", "newInstance", "Lcom/robinhood/shared/order/type/priceInput/OrderTypePriceInputDuxo;", "lib-order-type_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTypePriceInputDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<OrderTypePriceInputDuxo2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<PerpetualContractStore> contractStore, Provider<MarketDataProxyStore> marketDataStore, Provider<PerpetualsOrderPriceValidationStore> orderPriceValidationStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
            Intrinsics.checkNotNullParameter(orderPriceValidationStore, "orderPriceValidationStore");
            return new OrderTypePriceInputDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, contractStore, marketDataStore, orderPriceValidationStore);
        }

        @JvmStatic
        public final OrderTypePriceInputDuxo newInstance(DuxoBundle duxoBundle, OrderTypePriceInputDuxo2 stateProvider, SavedStateHandle savedStateHandle, PerpetualContractStore contractStore, MarketDataProxyStore marketDataStore, PerpetualsOrderPriceValidationStore orderPriceValidationStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(contractStore, "contractStore");
            Intrinsics.checkNotNullParameter(marketDataStore, "marketDataStore");
            Intrinsics.checkNotNullParameter(orderPriceValidationStore, "orderPriceValidationStore");
            return new OrderTypePriceInputDuxo(duxoBundle, stateProvider, savedStateHandle, contractStore, marketDataStore, orderPriceValidationStore);
        }
    }
}

package com.robinhood.shared.education.order;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/education/order/OrderTypeEducationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderTypeEducationDuxo_Factory implements Factory<OrderTypeEducationDuxo> {
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OrderTypeEducationManager> orderTypeEducationManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<OrderTypeEducationStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderTypeEducationDuxo_Factory create(Provider<OrderTypeEducationStateProvider> provider, Provider<DuxoBundle> provider2, Provider<OrderTypeEducationManager> provider3, Provider<CurrencyPairV2Store> provider4, Provider<InstrumentStore> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final OrderTypeEducationDuxo newInstance(OrderTypeEducationStateProvider orderTypeEducationStateProvider, DuxoBundle duxoBundle, OrderTypeEducationManager orderTypeEducationManager, CurrencyPairV2Store currencyPairV2Store, InstrumentStore instrumentStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(orderTypeEducationStateProvider, duxoBundle, orderTypeEducationManager, currencyPairV2Store, instrumentStore, savedStateHandle);
    }

    public OrderTypeEducationDuxo_Factory(Provider<OrderTypeEducationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<OrderTypeEducationManager> orderTypeEducationManager, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<InstrumentStore> instrumentStore, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.orderTypeEducationManager = orderTypeEducationManager;
        this.currencyPairV2Store = currencyPairV2Store;
        this.instrumentStore = instrumentStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public OrderTypeEducationDuxo get() {
        Companion companion = INSTANCE;
        OrderTypeEducationStateProvider orderTypeEducationStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeEducationStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeEducationManager, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(orderTypeEducationStateProvider, duxoBundle, orderTypeEducationManager, currencyPairV2Store, instrumentStore, savedStateHandle);
    }

    /* compiled from: OrderTypeEducationDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo_Factory;", "stateProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/education/order/OrderTypeEducationStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/shared/education/order/OrderTypeEducationDuxo;", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderTypeEducationDuxo_Factory create(Provider<OrderTypeEducationStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<OrderTypeEducationManager> orderTypeEducationManager, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<InstrumentStore> instrumentStore, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OrderTypeEducationDuxo_Factory(stateProvider, duxoBundle, orderTypeEducationManager, currencyPairV2Store, instrumentStore, savedStateHandle);
        }

        @JvmStatic
        public final OrderTypeEducationDuxo newInstance(OrderTypeEducationStateProvider stateProvider, DuxoBundle duxoBundle, OrderTypeEducationManager orderTypeEducationManager, CurrencyPairV2Store currencyPairV2Store, InstrumentStore instrumentStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new OrderTypeEducationDuxo(stateProvider, duxoBundle, orderTypeEducationManager, currencyPairV2Store, instrumentStore, savedStateHandle);
        }
    }
}

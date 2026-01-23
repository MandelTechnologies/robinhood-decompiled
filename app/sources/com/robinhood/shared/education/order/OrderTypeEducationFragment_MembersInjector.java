package com.robinhood.shared.education.order;

import com.robinhood.android.common.p088ui.BaseFragment_MembersInjector;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import dagger.MembersInjector;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderTypeEducationFragment_MembersInjector.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationFragment_MembersInjector;", "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "injectMembers", "", "instance", "Companion", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OrderTypeEducationFragment_MembersInjector implements MembersInjector<OrderTypeEducationFragment> {
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<OrderTypeEducationManager> orderTypeEducationManager;
    private final Provider<BaseFragmentSingletons> singletons;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final MembersInjector<OrderTypeEducationFragment> create(Provider<BaseFragmentSingletons> provider, Provider<InstrumentStore> provider2, Provider<CurrencyPairV2Store> provider3, Provider<OrderTypeEducationManager> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final void injectCurrencyPairV2Store(OrderTypeEducationFragment orderTypeEducationFragment, CurrencyPairV2Store currencyPairV2Store) {
        INSTANCE.injectCurrencyPairV2Store(orderTypeEducationFragment, currencyPairV2Store);
    }

    @JvmStatic
    public static final void injectInstrumentStore(OrderTypeEducationFragment orderTypeEducationFragment, InstrumentStore instrumentStore) {
        INSTANCE.injectInstrumentStore(orderTypeEducationFragment, instrumentStore);
    }

    @JvmStatic
    public static final void injectOrderTypeEducationManager(OrderTypeEducationFragment orderTypeEducationFragment, OrderTypeEducationManager orderTypeEducationManager) {
        INSTANCE.injectOrderTypeEducationManager(orderTypeEducationFragment, orderTypeEducationManager);
    }

    public OrderTypeEducationFragment_MembersInjector(Provider<BaseFragmentSingletons> singletons, Provider<InstrumentStore> instrumentStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<OrderTypeEducationManager> orderTypeEducationManager) {
        Intrinsics.checkNotNullParameter(singletons, "singletons");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
        this.singletons = singletons;
        this.instrumentStore = instrumentStore;
        this.currencyPairV2Store = currencyPairV2Store;
        this.orderTypeEducationManager = orderTypeEducationManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OrderTypeEducationFragment instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        BaseFragment_MembersInjector.Companion companion = BaseFragment_MembersInjector.INSTANCE;
        BaseFragmentSingletons baseFragmentSingletons = this.singletons.get();
        Intrinsics.checkNotNullExpressionValue(baseFragmentSingletons, "get(...)");
        companion.injectSingletons(instance, baseFragmentSingletons);
        Companion companion2 = INSTANCE;
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        companion2.injectInstrumentStore(instance, instrumentStore);
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        companion2.injectCurrencyPairV2Store(instance, currencyPairV2Store);
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager.get();
        Intrinsics.checkNotNullExpressionValue(orderTypeEducationManager, "get(...)");
        companion2.injectOrderTypeEducationManager(instance, orderTypeEducationManager);
    }

    /* compiled from: OrderTypeEducationFragment_MembersInjector.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/education/order/OrderTypeEducationFragment_MembersInjector$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Ldagger/MembersInjector;", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragment;", "singletons", "Ljavax/inject/Provider;", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "injectInstrumentStore", "", "instance", "injectCurrencyPairV2Store", "injectOrderTypeEducationManager", "lib-order-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MembersInjector<OrderTypeEducationFragment> create(Provider<BaseFragmentSingletons> singletons, Provider<InstrumentStore> instrumentStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<OrderTypeEducationManager> orderTypeEducationManager) {
            Intrinsics.checkNotNullParameter(singletons, "singletons");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            return new OrderTypeEducationFragment_MembersInjector(singletons, instrumentStore, currencyPairV2Store, orderTypeEducationManager);
        }

        @JvmStatic
        public final void injectInstrumentStore(OrderTypeEducationFragment instance, InstrumentStore instrumentStore) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            instance.setInstrumentStore(instrumentStore);
        }

        @JvmStatic
        public final void injectCurrencyPairV2Store(OrderTypeEducationFragment instance, CurrencyPairV2Store currencyPairV2Store) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            instance.setCurrencyPairV2Store(currencyPairV2Store);
        }

        @JvmStatic
        public final void injectOrderTypeEducationManager(OrderTypeEducationFragment instance, OrderTypeEducationManager orderTypeEducationManager) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            Intrinsics.checkNotNullParameter(orderTypeEducationManager, "orderTypeEducationManager");
            instance.setOrderTypeEducationManager(orderTypeEducationManager);
        }
    }
}

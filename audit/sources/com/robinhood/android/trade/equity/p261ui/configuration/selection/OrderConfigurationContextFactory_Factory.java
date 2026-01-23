package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.OptionUpgradePromotionStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.bonfire.TraderRecurringTradabilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationContextFactory_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "positionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class OrderConfigurationContextFactory_Factory implements Factory<OrderConfigurationContextFactory> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore;
    private final Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RxFactory> rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OrderConfigurationContextFactory_Factory create(Provider<PositionStore> provider, Provider<TraderRecurringTradabilityStore> provider2, Provider<AccountAccessStore> provider3, Provider<OptionUpgradePromotionStore> provider4, Provider<RxFactory> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final OrderConfigurationContextFactory newInstance(PositionStore positionStore, TraderRecurringTradabilityStore traderRecurringTradabilityStore, AccountAccessStore accountAccessStore, OptionUpgradePromotionStore optionUpgradePromotionStore, RxFactory rxFactory) {
        return INSTANCE.newInstance(positionStore, traderRecurringTradabilityStore, accountAccessStore, optionUpgradePromotionStore, rxFactory);
    }

    public OrderConfigurationContextFactory_Factory(Provider<PositionStore> positionStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<AccountAccessStore> accountAccessStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.positionStore = positionStore;
        this.instrumentRecurringTradabilityStore = instrumentRecurringTradabilityStore;
        this.accountAccessStore = accountAccessStore;
        this.optionUpgradePromotionStore = optionUpgradePromotionStore;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public OrderConfigurationContextFactory get() {
        Companion companion = INSTANCE;
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        TraderRecurringTradabilityStore traderRecurringTradabilityStore = this.instrumentRecurringTradabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(traderRecurringTradabilityStore, "get(...)");
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        OptionUpgradePromotionStore optionUpgradePromotionStore = this.optionUpgradePromotionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionUpgradePromotionStore, "get(...)");
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(positionStore, traderRecurringTradabilityStore, accountAccessStore, optionUpgradePromotionStore, rxFactory);
    }

    /* compiled from: OrderConfigurationContextFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory_Factory;", "positionStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "instrumentRecurringTradabilityStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TraderRecurringTradabilityStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "optionUpgradePromotionStore", "Lcom/robinhood/librobinhood/data/store/OptionUpgradePromotionStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationContextFactory;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OrderConfigurationContextFactory_Factory create(Provider<PositionStore> positionStore, Provider<TraderRecurringTradabilityStore> instrumentRecurringTradabilityStore, Provider<AccountAccessStore> accountAccessStore, Provider<OptionUpgradePromotionStore> optionUpgradePromotionStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OrderConfigurationContextFactory_Factory(positionStore, instrumentRecurringTradabilityStore, accountAccessStore, optionUpgradePromotionStore, rxFactory);
        }

        @JvmStatic
        public final OrderConfigurationContextFactory newInstance(PositionStore positionStore, TraderRecurringTradabilityStore instrumentRecurringTradabilityStore, AccountAccessStore accountAccessStore, OptionUpgradePromotionStore optionUpgradePromotionStore, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(instrumentRecurringTradabilityStore, "instrumentRecurringTradabilityStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(optionUpgradePromotionStore, "optionUpgradePromotionStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OrderConfigurationContextFactory(positionStore, instrumentRecurringTradabilityStore, accountAccessStore, optionUpgradePromotionStore, rxFactory);
        }
    }
}

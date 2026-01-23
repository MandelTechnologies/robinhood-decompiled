package com.robinhood.android.common.options.order;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.data.store.MarketHoursStore;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AggregateOptionPositionStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OptionChainStore;
import com.robinhood.librobinhood.data.store.OptionInstrumentStore;
import com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore;
import com.robinhood.librobinhood.data.store.OptionOrderStrategyStore;
import com.robinhood.librobinhood.data.store.OptionPositionStore;
import com.robinhood.librobinhood.data.store.OptionQuoteStore;
import com.robinhood.librobinhood.data.store.OptionSettingsStore;
import com.robinhood.librobinhood.data.store.OptionsBuyingPowerStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderContextFactory_Factory.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Bç\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContextFactory_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionOrderStrategyStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class OptionOrderContextFactory_Factory implements Factory<OptionOrderContextFactory> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AggregateOptionPositionStore> aggregateOptionPositionStore;
    private final Provider<CollateralStore> collateralStore;
    private final Provider<InstrumentStore> equityInstrumentStore;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<MarketHoursStore> marketHoursStore;
    private final Provider<OptionChainStore> optionChainStore;
    private final Provider<OptionInstrumentStore> optionInstrumentStore;
    private final Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore;
    private final Provider<OptionOrderStrategyStore> optionOrderStrategyStore;
    private final Provider<OptionPositionStore> optionPositionStore;
    private final Provider<OptionQuoteStore> optionQuoteStore;
    private final Provider<OptionSettingsStore> optionSettingsStore;
    private final Provider<OptionsBuyingPowerStore> optionsBuyingPowerStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<RxFactory> rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final OptionOrderContextFactory_Factory create(Provider<AccountProvider> provider, Provider<AggregateOptionPositionStore> provider2, Provider<PositionStore> provider3, Provider<CollateralStore> provider4, Provider<MarketHoursStore> provider5, Provider<OptionChainStore> provider6, Provider<OptionInstrumentStore> provider7, Provider<OptionOrderStrategyStore> provider8, Provider<OptionOrderNomenclatureStore> provider9, Provider<OptionPositionStore> provider10, Provider<OptionQuoteStore> provider11, Provider<OptionSettingsStore> provider12, Provider<InstrumentStore> provider13, Provider<ExperimentsStore> provider14, Provider<OptionsBuyingPowerStore> provider15, Provider<RxFactory> provider16) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @JvmStatic
    public static final OptionOrderContextFactory newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, PositionStore positionStore, CollateralStore collateralStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionOrderStrategyStore optionOrderStrategyStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, InstrumentStore instrumentStore, ExperimentsStore experimentsStore, OptionsBuyingPowerStore optionsBuyingPowerStore, RxFactory rxFactory) {
        return INSTANCE.newInstance(accountProvider, aggregateOptionPositionStore, positionStore, collateralStore, marketHoursStore, optionChainStore, optionInstrumentStore, optionOrderStrategyStore, optionOrderNomenclatureStore, optionPositionStore, optionQuoteStore, optionSettingsStore, instrumentStore, experimentsStore, optionsBuyingPowerStore, rxFactory);
    }

    public OptionOrderContextFactory_Factory(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<PositionStore> positionStore, Provider<CollateralStore> collateralStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionOrderStrategyStore> optionOrderStrategyStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<InstrumentStore> equityInstrumentStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionsBuyingPowerStore> optionsBuyingPowerStore, Provider<RxFactory> rxFactory) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
        Intrinsics.checkNotNullParameter(optionOrderStrategyStore, "optionOrderStrategyStore");
        Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
        Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
        Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
        Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
        Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(optionsBuyingPowerStore, "optionsBuyingPowerStore");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.accountProvider = accountProvider;
        this.aggregateOptionPositionStore = aggregateOptionPositionStore;
        this.positionStore = positionStore;
        this.collateralStore = collateralStore;
        this.marketHoursStore = marketHoursStore;
        this.optionChainStore = optionChainStore;
        this.optionInstrumentStore = optionInstrumentStore;
        this.optionOrderStrategyStore = optionOrderStrategyStore;
        this.optionOrderNomenclatureStore = optionOrderNomenclatureStore;
        this.optionPositionStore = optionPositionStore;
        this.optionQuoteStore = optionQuoteStore;
        this.optionSettingsStore = optionSettingsStore;
        this.equityInstrumentStore = equityInstrumentStore;
        this.experimentsStore = experimentsStore;
        this.optionsBuyingPowerStore = optionsBuyingPowerStore;
        this.rxFactory = rxFactory;
    }

    @Override // javax.inject.Provider
    public OptionOrderContextFactory get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AggregateOptionPositionStore aggregateOptionPositionStore = this.aggregateOptionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(aggregateOptionPositionStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        CollateralStore collateralStore = this.collateralStore.get();
        Intrinsics.checkNotNullExpressionValue(collateralStore, "get(...)");
        MarketHoursStore marketHoursStore = this.marketHoursStore.get();
        Intrinsics.checkNotNullExpressionValue(marketHoursStore, "get(...)");
        OptionChainStore optionChainStore = this.optionChainStore.get();
        Intrinsics.checkNotNullExpressionValue(optionChainStore, "get(...)");
        OptionInstrumentStore optionInstrumentStore = this.optionInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(optionInstrumentStore, "get(...)");
        OptionOrderStrategyStore optionOrderStrategyStore = this.optionOrderStrategyStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderStrategyStore, "get(...)");
        OptionOrderNomenclatureStore optionOrderNomenclatureStore = this.optionOrderNomenclatureStore.get();
        Intrinsics.checkNotNullExpressionValue(optionOrderNomenclatureStore, "get(...)");
        OptionPositionStore optionPositionStore = this.optionPositionStore.get();
        Intrinsics.checkNotNullExpressionValue(optionPositionStore, "get(...)");
        OptionQuoteStore optionQuoteStore = this.optionQuoteStore.get();
        Intrinsics.checkNotNullExpressionValue(optionQuoteStore, "get(...)");
        OptionSettingsStore optionSettingsStore = this.optionSettingsStore.get();
        Intrinsics.checkNotNullExpressionValue(optionSettingsStore, "get(...)");
        InstrumentStore instrumentStore = this.equityInstrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        OptionsBuyingPowerStore optionsBuyingPowerStore = this.optionsBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(optionsBuyingPowerStore, "get(...)");
        OptionsBuyingPowerStore optionsBuyingPowerStore2 = optionsBuyingPowerStore;
        RxFactory rxFactory = this.rxFactory.get();
        Intrinsics.checkNotNullExpressionValue(rxFactory, "get(...)");
        return companion.newInstance(accountProvider, aggregateOptionPositionStore, positionStore, collateralStore, marketHoursStore, optionChainStore, optionInstrumentStore, optionOrderStrategyStore, optionOrderNomenclatureStore, optionPositionStore, optionQuoteStore, optionSettingsStore, instrumentStore, experimentsStore2, optionsBuyingPowerStore2, rxFactory);
    }

    /* compiled from: OptionOrderContextFactory_Factory.kt */
    @Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jè\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0007H\u0007J\u0088\u0001\u0010'\u001a\u00020(2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0007¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/options/order/OptionOrderContextFactory_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "aggregateOptionPositionStore", "Lcom/robinhood/librobinhood/data/store/AggregateOptionPositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "marketHoursStore", "Lcom/robinhood/android/markethours/data/store/MarketHoursStore;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionInstrumentStore", "Lcom/robinhood/librobinhood/data/store/OptionInstrumentStore;", "optionOrderStrategyStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStrategyStore;", "optionOrderNomenclatureStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderNomenclatureStore;", "optionPositionStore", "Lcom/robinhood/librobinhood/data/store/OptionPositionStore;", "optionQuoteStore", "Lcom/robinhood/librobinhood/data/store/OptionQuoteStore;", "optionSettingsStore", "Lcom/robinhood/librobinhood/data/store/OptionSettingsStore;", "equityInstrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "optionsBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/OptionsBuyingPowerStore;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "newInstance", "Lcom/robinhood/android/common/options/order/OptionOrderContextFactory;", "feature-lib-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderContextFactory_Factory create(Provider<AccountProvider> accountProvider, Provider<AggregateOptionPositionStore> aggregateOptionPositionStore, Provider<PositionStore> positionStore, Provider<CollateralStore> collateralStore, Provider<MarketHoursStore> marketHoursStore, Provider<OptionChainStore> optionChainStore, Provider<OptionInstrumentStore> optionInstrumentStore, Provider<OptionOrderStrategyStore> optionOrderStrategyStore, Provider<OptionOrderNomenclatureStore> optionOrderNomenclatureStore, Provider<OptionPositionStore> optionPositionStore, Provider<OptionQuoteStore> optionQuoteStore, Provider<OptionSettingsStore> optionSettingsStore, Provider<InstrumentStore> equityInstrumentStore, Provider<ExperimentsStore> experimentsStore, Provider<OptionsBuyingPowerStore> optionsBuyingPowerStore, Provider<RxFactory> rxFactory) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionOrderStrategyStore, "optionOrderStrategyStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionsBuyingPowerStore, "optionsBuyingPowerStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OptionOrderContextFactory_Factory(accountProvider, aggregateOptionPositionStore, positionStore, collateralStore, marketHoursStore, optionChainStore, optionInstrumentStore, optionOrderStrategyStore, optionOrderNomenclatureStore, optionPositionStore, optionQuoteStore, optionSettingsStore, equityInstrumentStore, experimentsStore, optionsBuyingPowerStore, rxFactory);
        }

        @JvmStatic
        public final OptionOrderContextFactory newInstance(AccountProvider accountProvider, AggregateOptionPositionStore aggregateOptionPositionStore, PositionStore positionStore, CollateralStore collateralStore, MarketHoursStore marketHoursStore, OptionChainStore optionChainStore, OptionInstrumentStore optionInstrumentStore, OptionOrderStrategyStore optionOrderStrategyStore, OptionOrderNomenclatureStore optionOrderNomenclatureStore, OptionPositionStore optionPositionStore, OptionQuoteStore optionQuoteStore, OptionSettingsStore optionSettingsStore, InstrumentStore equityInstrumentStore, ExperimentsStore experimentsStore, OptionsBuyingPowerStore optionsBuyingPowerStore, RxFactory rxFactory) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(aggregateOptionPositionStore, "aggregateOptionPositionStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(marketHoursStore, "marketHoursStore");
            Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
            Intrinsics.checkNotNullParameter(optionInstrumentStore, "optionInstrumentStore");
            Intrinsics.checkNotNullParameter(optionOrderStrategyStore, "optionOrderStrategyStore");
            Intrinsics.checkNotNullParameter(optionOrderNomenclatureStore, "optionOrderNomenclatureStore");
            Intrinsics.checkNotNullParameter(optionPositionStore, "optionPositionStore");
            Intrinsics.checkNotNullParameter(optionQuoteStore, "optionQuoteStore");
            Intrinsics.checkNotNullParameter(optionSettingsStore, "optionSettingsStore");
            Intrinsics.checkNotNullParameter(equityInstrumentStore, "equityInstrumentStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(optionsBuyingPowerStore, "optionsBuyingPowerStore");
            Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
            return new OptionOrderContextFactory(accountProvider, aggregateOptionPositionStore, positionStore, collateralStore, marketHoursStore, optionChainStore, optionInstrumentStore, optionOrderStrategyStore, optionOrderNomenclatureStore, optionPositionStore, optionQuoteStore, optionSettingsStore, equityInstrumentStore, experimentsStore, optionsBuyingPowerStore, rxFactory);
        }
    }
}

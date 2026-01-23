package com.robinhood.android.equityadvancedorder;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.EquityOrderExpireDateStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.shared.equities.store.subzero.ShortingInfoStore;
import com.robinhood.store.base.BackupWithholdingStore;
import com.robinhood.store.base.SuitabilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.inject.MicrogramComponent;
import p479j$.time.Clock;

/* compiled from: EquityAdvancedOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB«\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0003\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u0003\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0003\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010BR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010BR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010BR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010BR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010BR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010BR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010BR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010BR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010BR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010BR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010BR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010BR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010BR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010BR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010BR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010BR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010BR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010BR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010BR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010BR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010BR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010BR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010BR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010B¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "tradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/prefs/StringPreference;", "defaultTradingHoursPref", "defaultTimeInForcePref", "Lcom/robinhood/prefs/BooleanPreference;", "streamlinedLimitOrderBuyOnboardingSeenPref", "streamlinedLimitOrderSellOnboardingSeenPref", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/store/base/SuitabilityStore;", "suitabilityStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "taxLotsCachedService", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "Ljavax/inject/Provider;", "Companion", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class EquityAdvancedOrderDuxo_Factory implements Factory<EquityAdvancedOrderDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<InstrumentAccountSwitcherStore> accountSwitcherStore;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<Clock> clock;
    private final Provider<StringPreference> defaultTimeInForcePref;
    private final Provider<StringPreference> defaultTradingHoursPref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderCheckValidator> equityOrderCheckValidator;
    private final Provider<EquityOrderManager> equityOrderManager;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<EquityOrderExpireDateStore> orderExpireDateStore;
    private final Provider<OrderStore> orderStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ShortingInfoStore> shortingInfoStore;
    private final Provider<EquityAdvancedOrderStateProvider> stateProvider;
    private final Provider<BooleanPreference> streamlinedLimitOrderBuyOnboardingSeenPref;
    private final Provider<BooleanPreference> streamlinedLimitOrderSellOnboardingSeenPref;
    private final Provider<SuitabilityStore> suitabilityStore;
    private final Provider<TaxLotsCachedService> taxLotsCachedService;
    private final Provider<EquityTradingSessionChangedStore> tradingSessionChangedStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityAdvancedOrderDuxo_Factory create(Provider<InstrumentAccountSwitcherStore> provider, Provider<AccountProvider> provider2, Provider<BackupWithholdingStore> provider3, Provider<EquityOrderExpireDateStore> provider4, Provider<InstrumentStore> provider5, Provider<NbboSummaryStore> provider6, Provider<TraderMarketHoursManager> provider7, Provider<EquityTradingSessionChangedStore> provider8, Provider<PositionStore> provider9, Provider<QuoteStore> provider10, Provider<InstrumentBuyingPowerStore> provider11, Provider<StringPreference> provider12, Provider<StringPreference> provider13, Provider<BooleanPreference> provider14, Provider<BooleanPreference> provider15, Provider<EquityOrderCheckValidator> provider16, Provider<SuitabilityStore> provider17, Provider<ExperimentsStore> provider18, Provider<RegionGateProvider> provider19, Provider<TraderEventLogger> provider20, Provider<OrderStore> provider21, Provider<TaxLotsCachedService> provider22, Provider<ShortingInfoStore> provider23, Provider<EquityOrderManager> provider24, Provider<AccountAccessStore> provider25, Provider<MicrogramComponent.Factory> provider26, Provider<EquityAdvancedOrderStateProvider> provider27, Provider<SavedStateHandle> provider28, Provider<Clock> provider29, Provider<DuxoBundle> provider30) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30);
    }

    @JvmStatic
    public static final EquityAdvancedOrderDuxo newInstance(InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderExpireDateStore equityOrderExpireDateStore, InstrumentStore instrumentStore, NbboSummaryStore nbboSummaryStore, TraderMarketHoursManager traderMarketHoursManager, EquityTradingSessionChangedStore equityTradingSessionChangedStore, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, StringPreference stringPreference, StringPreference stringPreference2, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, EquityOrderCheckValidator equityOrderCheckValidator, SuitabilityStore suitabilityStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, TraderEventLogger traderEventLogger, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, EquityOrderManager equityOrderManager, AccountAccessStore accountAccessStore, MicrogramComponent.Factory factory, EquityAdvancedOrderStateProvider equityAdvancedOrderStateProvider, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(instrumentAccountSwitcherStore, accountProvider, backupWithholdingStore, equityOrderExpireDateStore, instrumentStore, nbboSummaryStore, traderMarketHoursManager, equityTradingSessionChangedStore, positionStore, quoteStore, instrumentBuyingPowerStore, stringPreference, stringPreference2, booleanPreference, booleanPreference2, equityOrderCheckValidator, suitabilityStore, experimentsStore, regionGateProvider, traderEventLogger, orderStore, taxLotsCachedService, shortingInfoStore, equityOrderManager, accountAccessStore, factory, equityAdvancedOrderStateProvider, savedStateHandle, clock, duxoBundle);
    }

    public EquityAdvancedOrderDuxo_Factory(Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<InstrumentStore> instrumentStore, Provider<NbboSummaryStore> nbboSummaryStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityTradingSessionChangedStore> tradingSessionChangedStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<StringPreference> defaultTradingHoursPref, Provider<StringPreference> defaultTimeInForcePref, Provider<BooleanPreference> streamlinedLimitOrderBuyOnboardingSeenPref, Provider<BooleanPreference> streamlinedLimitOrderSellOnboardingSeenPref, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<SuitabilityStore> suitabilityStore, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<TraderEventLogger> eventLogger, Provider<OrderStore> orderStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<ShortingInfoStore> shortingInfoStore, Provider<EquityOrderManager> equityOrderManager, Provider<AccountAccessStore> accountAccessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<EquityAdvancedOrderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(tradingSessionChangedStore, "tradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(defaultTradingHoursPref, "defaultTradingHoursPref");
        Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
        Intrinsics.checkNotNullParameter(streamlinedLimitOrderBuyOnboardingSeenPref, "streamlinedLimitOrderBuyOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(streamlinedLimitOrderSellOnboardingSeenPref, "streamlinedLimitOrderSellOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountSwitcherStore = accountSwitcherStore;
        this.accountProvider = accountProvider;
        this.backupWithholdingStore = backupWithholdingStore;
        this.orderExpireDateStore = orderExpireDateStore;
        this.instrumentStore = instrumentStore;
        this.nbboSummaryStore = nbboSummaryStore;
        this.marketHoursManager = marketHoursManager;
        this.tradingSessionChangedStore = tradingSessionChangedStore;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.defaultTradingHoursPref = defaultTradingHoursPref;
        this.defaultTimeInForcePref = defaultTimeInForcePref;
        this.streamlinedLimitOrderBuyOnboardingSeenPref = streamlinedLimitOrderBuyOnboardingSeenPref;
        this.streamlinedLimitOrderSellOnboardingSeenPref = streamlinedLimitOrderSellOnboardingSeenPref;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.suitabilityStore = suitabilityStore;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
        this.orderStore = orderStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.shortingInfoStore = shortingInfoStore;
        this.equityOrderManager = equityOrderManager;
        this.accountAccessStore = accountAccessStore;
        this.microgramComponentFactory = microgramComponentFactory;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.clock = clock;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public EquityAdvancedOrderDuxo get() {
        Companion companion = INSTANCE;
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.accountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        EquityOrderExpireDateStore equityOrderExpireDateStore = this.orderExpireDateStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderExpireDateStore, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        EquityTradingSessionChangedStore equityTradingSessionChangedStore = this.tradingSessionChangedStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSessionChangedStore, "get(...)");
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        StringPreference stringPreference = this.defaultTradingHoursPref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference, "get(...)");
        StringPreference stringPreference2 = this.defaultTimeInForcePref.get();
        Intrinsics.checkNotNullExpressionValue(stringPreference2, "get(...)");
        BooleanPreference booleanPreference = this.streamlinedLimitOrderBuyOnboardingSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.streamlinedLimitOrderSellOnboardingSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        EquityOrderCheckValidator equityOrderCheckValidator = this.equityOrderCheckValidator.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderCheckValidator, "get(...)");
        EquityOrderCheckValidator equityOrderCheckValidator2 = equityOrderCheckValidator;
        SuitabilityStore suitabilityStore = this.suitabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(suitabilityStore, "get(...)");
        SuitabilityStore suitabilityStore2 = suitabilityStore;
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        ExperimentsStore experimentsStore2 = experimentsStore;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        TraderEventLogger traderEventLogger2 = traderEventLogger;
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        OrderStore orderStore2 = orderStore;
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(taxLotsCachedService, "get(...)");
        TaxLotsCachedService taxLotsCachedService2 = taxLotsCachedService;
        ShortingInfoStore shortingInfoStore = this.shortingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(shortingInfoStore, "get(...)");
        ShortingInfoStore shortingInfoStore2 = shortingInfoStore;
        EquityOrderManager equityOrderManager = this.equityOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        EquityOrderManager equityOrderManager2 = equityOrderManager;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountAccessStore accountAccessStore2 = accountAccessStore;
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        MicrogramComponent.Factory factory2 = factory;
        EquityAdvancedOrderStateProvider equityAdvancedOrderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(equityAdvancedOrderStateProvider, "get(...)");
        EquityAdvancedOrderStateProvider equityAdvancedOrderStateProvider2 = equityAdvancedOrderStateProvider;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Clock clock2 = clock;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(instrumentAccountSwitcherStore, accountProvider, backupWithholdingStore, equityOrderExpireDateStore, instrumentStore, nbboSummaryStore, traderMarketHoursManager, equityTradingSessionChangedStore, positionStore, quoteStore, instrumentBuyingPowerStore, stringPreference, stringPreference2, booleanPreference2, booleanPreference4, equityOrderCheckValidator2, suitabilityStore2, experimentsStore2, regionGateProvider2, traderEventLogger2, orderStore2, taxLotsCachedService2, shortingInfoStore2, equityOrderManager2, accountAccessStore2, factory2, equityAdvancedOrderStateProvider2, savedStateHandle2, clock2, duxoBundle);
    }

    /* compiled from: EquityAdvancedOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J³\u0003\u0010@\u001a\u00020?2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0004H\u0007¢\u0006\u0004\b@\u0010AJÿ\u0001\u0010C\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0004\bC\u0010D¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "accountSwitcherStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/store/base/BackupWithholdingStore;", "backupWithholdingStore", "Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;", "orderExpireDateStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "nbboSummaryStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "tradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "positionStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/prefs/StringPreference;", "defaultTradingHoursPref", "defaultTimeInForcePref", "Lcom/robinhood/prefs/BooleanPreference;", "streamlinedLimitOrderBuyOnboardingSeenPref", "streamlinedLimitOrderSellOnboardingSeenPref", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityOrderCheckValidator", "Lcom/robinhood/store/base/SuitabilityStore;", "suitabilityStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/analytics/TraderEventLogger;", "eventLogger", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "orderStore", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "taxLotsCachedService", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "shortingInfoStore", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "equityOrderManager", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "accountAccessStore", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "microgramComponentFactory", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;", "stateProvider", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo_Factory;", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "newInstance", "(Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/store/base/BackupWithholdingStore;Lcom/robinhood/librobinhood/data/store/EquityOrderExpireDateStore;Lcom/robinhood/librobinhood/data/store/InstrumentStore;Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;Lcom/robinhood/librobinhood/data/store/PositionStore;Lcom/robinhood/librobinhood/data/store/QuoteStore;Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;Lcom/robinhood/store/base/SuitabilityStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/analytics/TraderEventLogger;Lcom/robinhood/librobinhood/data/store/OrderStore;Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;Lcom/robinhood/android/equity/submission/EquityOrderManager;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lmicrogram/android/inject/MicrogramComponent$Factory;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderStateProvider;Landroidx/lifecycle/SavedStateHandle;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderDuxo;", "lib-equity-advanced-order_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityAdvancedOrderDuxo_Factory create(Provider<InstrumentAccountSwitcherStore> accountSwitcherStore, Provider<AccountProvider> accountProvider, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<EquityOrderExpireDateStore> orderExpireDateStore, Provider<InstrumentStore> instrumentStore, Provider<NbboSummaryStore> nbboSummaryStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<EquityTradingSessionChangedStore> tradingSessionChangedStore, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<StringPreference> defaultTradingHoursPref, Provider<StringPreference> defaultTimeInForcePref, Provider<BooleanPreference> streamlinedLimitOrderBuyOnboardingSeenPref, Provider<BooleanPreference> streamlinedLimitOrderSellOnboardingSeenPref, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<SuitabilityStore> suitabilityStore, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<TraderEventLogger> eventLogger, Provider<OrderStore> orderStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<ShortingInfoStore> shortingInfoStore, Provider<EquityOrderManager> equityOrderManager, Provider<AccountAccessStore> accountAccessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<EquityAdvancedOrderStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<Clock> clock, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(tradingSessionChangedStore, "tradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(defaultTradingHoursPref, "defaultTradingHoursPref");
            Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
            Intrinsics.checkNotNullParameter(streamlinedLimitOrderBuyOnboardingSeenPref, "streamlinedLimitOrderBuyOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(streamlinedLimitOrderSellOnboardingSeenPref, "streamlinedLimitOrderSellOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EquityAdvancedOrderDuxo_Factory(accountSwitcherStore, accountProvider, backupWithholdingStore, orderExpireDateStore, instrumentStore, nbboSummaryStore, marketHoursManager, tradingSessionChangedStore, positionStore, quoteStore, instrumentBuyingPowerStore, defaultTradingHoursPref, defaultTimeInForcePref, streamlinedLimitOrderBuyOnboardingSeenPref, streamlinedLimitOrderSellOnboardingSeenPref, equityOrderCheckValidator, suitabilityStore, experimentsStore, regionGateProvider, eventLogger, orderStore, taxLotsCachedService, shortingInfoStore, equityOrderManager, accountAccessStore, microgramComponentFactory, stateProvider, savedStateHandle, clock, duxoBundle);
        }

        @JvmStatic
        public final EquityAdvancedOrderDuxo newInstance(InstrumentAccountSwitcherStore accountSwitcherStore, AccountProvider accountProvider, BackupWithholdingStore backupWithholdingStore, EquityOrderExpireDateStore orderExpireDateStore, InstrumentStore instrumentStore, NbboSummaryStore nbboSummaryStore, TraderMarketHoursManager marketHoursManager, EquityTradingSessionChangedStore tradingSessionChangedStore, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, StringPreference defaultTradingHoursPref, StringPreference defaultTimeInForcePref, BooleanPreference streamlinedLimitOrderBuyOnboardingSeenPref, BooleanPreference streamlinedLimitOrderSellOnboardingSeenPref, EquityOrderCheckValidator equityOrderCheckValidator, SuitabilityStore suitabilityStore, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, TraderEventLogger eventLogger, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, EquityOrderManager equityOrderManager, AccountAccessStore accountAccessStore, MicrogramComponent.Factory microgramComponentFactory, EquityAdvancedOrderStateProvider stateProvider, SavedStateHandle savedStateHandle, Clock clock, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(accountSwitcherStore, "accountSwitcherStore");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(orderExpireDateStore, "orderExpireDateStore");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(tradingSessionChangedStore, "tradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(defaultTradingHoursPref, "defaultTradingHoursPref");
            Intrinsics.checkNotNullParameter(defaultTimeInForcePref, "defaultTimeInForcePref");
            Intrinsics.checkNotNullParameter(streamlinedLimitOrderBuyOnboardingSeenPref, "streamlinedLimitOrderBuyOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(streamlinedLimitOrderSellOnboardingSeenPref, "streamlinedLimitOrderSellOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(equityOrderManager, "equityOrderManager");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new EquityAdvancedOrderDuxo(accountSwitcherStore, accountProvider, backupWithholdingStore, orderExpireDateStore, instrumentStore, nbboSummaryStore, marketHoursManager, tradingSessionChangedStore, positionStore, quoteStore, instrumentBuyingPowerStore, defaultTradingHoursPref, defaultTimeInForcePref, streamlinedLimitOrderBuyOnboardingSeenPref, streamlinedLimitOrderSellOnboardingSeenPref, equityOrderCheckValidator, suitabilityStore, experimentsStore, regionGateProvider, eventLogger, orderStore, taxLotsCachedService, shortingInfoStore, equityOrderManager, accountAccessStore, microgramComponentFactory, stateProvider, savedStateHandle, clock, duxoBundle);
        }
    }
}

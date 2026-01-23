package com.robinhood.android.trade.equity.p261ui.share;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.ordercheck.EquityOrderCheckValidator;
import com.robinhood.android.equity.submission.EquityOrderManager;
import com.robinhood.android.equity.validation.EquityOrderContextStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.BuySellOrderOnboardingStore;
import com.robinhood.librobinhood.data.store.CollateralStore;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore;
import com.robinhood.librobinhood.data.store.InstrumentStore;
import com.robinhood.librobinhood.data.store.OrderStore;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.librobinhood.data.store.QuoteStore;
import com.robinhood.librobinhood.data.store.bonfire.EquityTradingSeenStatusStore;
import com.robinhood.librobinhood.data.store.bonfire.NbboSummaryStore;
import com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore;
import com.robinhood.librobinhood.data.util.TwentyFourHourMarketOnboardingBottomSheetManager;
import com.robinhood.prefs.BooleanPreference;
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

/* compiled from: EquityShareOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB¹\u0003\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020+0\u0004\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0004\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0004\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0004¢\u0006\u0004\bA\u0010BJ\b\u0010C\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020+0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\b\u0012\u0004\u0012\u0002080\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "equityOrderContextStore", "Lcom/robinhood/android/equity/validation/EquityOrderContextStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "hasShownAdtOnboardingBottomSheetPref", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class EquityShareOrderDuxo_Factory implements Factory<EquityShareOrderDuxo> {
    private final Provider<AccountAccessStore> accountAccessStore;
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<BackupWithholdingStore> backupWithholdingStore;
    private final Provider<BooleanPreference> buySellOrderOnboardingSeenPref;
    private final Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore;
    private final Provider<CollateralStore> collateralStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EquityOrderCheckValidator> equityOrderCheckValidator;
    private final Provider<EquityOrderContextStore> equityOrderContextStore;
    private final Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore;
    private final Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore;
    private final Provider<TraderEventLogger> eventLogger;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref;
    private final Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore;
    private final Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore;
    private final Provider<InstrumentStore> instrumentStore;
    private final Provider<TraderMarketHoursManager> marketHoursManager;
    private final Provider<MicrogramComponent.Factory> microgramComponentFactory;
    private final Provider<NbboSummaryStore> nbboSummaryStore;
    private final Provider<EquityOrderManager> orderManager;
    private final Provider<OrderStore> orderStore;
    private final Provider<PositionStore> positionStore;
    private final Provider<QuoteStore> quoteStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ShortingInfoStore> shortingInfoStore;
    private final Provider<SuitabilityStore> suitabilityStore;
    private final Provider<TaxLotsCachedService> taxLotsCachedService;
    private final Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final EquityShareOrderDuxo_Factory create(Provider<AccountProvider> provider, Provider<AnalyticsLogger> provider2, Provider<BackupWithholdingStore> provider3, Provider<CollateralStore> provider4, Provider<EquityOrderContextStore> provider5, Provider<EquityOrderCheckValidator> provider6, Provider<EquityTradingSessionChangedStore> provider7, Provider<TraderEventLogger> provider8, Provider<ExperimentsStore> provider9, Provider<RegionGateProvider> provider10, Provider<InstrumentStore> provider11, Provider<InstrumentAccountSwitcherStore> provider12, Provider<TraderMarketHoursManager> provider13, Provider<NbboSummaryStore> provider14, Provider<EquityOrderManager> provider15, Provider<PositionStore> provider16, Provider<QuoteStore> provider17, Provider<InstrumentBuyingPowerStore> provider18, Provider<SuitabilityStore> provider19, Provider<BooleanPreference> provider20, Provider<BuySellOrderOnboardingStore> provider21, Provider<EquityTradingSeenStatusStore> provider22, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> provider23, Provider<BooleanPreference> provider24, Provider<OrderStore> provider25, Provider<TaxLotsCachedService> provider26, Provider<ShortingInfoStore> provider27, Provider<AccountAccessStore> provider28, Provider<MicrogramComponent.Factory> provider29, Provider<DuxoBundle> provider30, Provider<SavedStateHandle> provider31) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31);
    }

    @JvmStatic
    public static final EquityShareOrderDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analyticsLogger, BackupWithholdingStore backupWithholdingStore, CollateralStore collateralStore, EquityOrderContextStore equityOrderContextStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger traderEventLogger, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, TraderMarketHoursManager traderMarketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderManager equityOrderManager, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, BooleanPreference booleanPreference, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, BooleanPreference booleanPreference2, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, AccountAccessStore accountAccessStore, MicrogramComponent.Factory factory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, analyticsLogger, backupWithholdingStore, collateralStore, equityOrderContextStore, equityOrderCheckValidator, equityTradingSessionChangedStore, traderEventLogger, experimentsStore, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, traderMarketHoursManager, nbboSummaryStore, equityOrderManager, positionStore, quoteStore, instrumentBuyingPowerStore, suitabilityStore, booleanPreference, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, booleanPreference2, orderStore, taxLotsCachedService, shortingInfoStore, accountAccessStore, factory, duxoBundle, savedStateHandle);
    }

    public EquityShareOrderDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<CollateralStore> collateralStore, Provider<EquityOrderContextStore> equityOrderContextStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<EquityOrderManager> orderManager, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<SuitabilityStore> suitabilityStore, Provider<BooleanPreference> buySellOrderOnboardingSeenPref, Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref, Provider<OrderStore> orderStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<ShortingInfoStore> shortingInfoStore, Provider<AccountAccessStore> accountAccessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
        Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
        Intrinsics.checkNotNullParameter(equityOrderContextStore, "equityOrderContextStore");
        Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
        Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
        Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
        Intrinsics.checkNotNullParameter(orderManager, "orderManager");
        Intrinsics.checkNotNullParameter(positionStore, "positionStore");
        Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
        Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
        Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
        Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
        Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
        Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
        Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
        Intrinsics.checkNotNullParameter(orderStore, "orderStore");
        Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
        Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.analytics = analytics;
        this.backupWithholdingStore = backupWithholdingStore;
        this.collateralStore = collateralStore;
        this.equityOrderContextStore = equityOrderContextStore;
        this.equityOrderCheckValidator = equityOrderCheckValidator;
        this.equityTradingSessionChangedStore = equityTradingSessionChangedStore;
        this.eventLogger = eventLogger;
        this.experimentsStore = experimentsStore;
        this.regionGateProvider = regionGateProvider;
        this.instrumentStore = instrumentStore;
        this.instrumentAccountSwitcherStore = instrumentAccountSwitcherStore;
        this.marketHoursManager = marketHoursManager;
        this.nbboSummaryStore = nbboSummaryStore;
        this.orderManager = orderManager;
        this.positionStore = positionStore;
        this.quoteStore = quoteStore;
        this.instrumentBuyingPowerStore = instrumentBuyingPowerStore;
        this.suitabilityStore = suitabilityStore;
        this.buySellOrderOnboardingSeenPref = buySellOrderOnboardingSeenPref;
        this.buySellOrderOnboardingStore = buySellOrderOnboardingStore;
        this.equityTradingSeenStatusStore = equityTradingSeenStatusStore;
        this.twentyFourHourMarketOnboardingBottomSheetManager = twentyFourHourMarketOnboardingBottomSheetManager;
        this.hasShownAdtOnboardingBottomSheetPref = hasShownAdtOnboardingBottomSheetPref;
        this.orderStore = orderStore;
        this.taxLotsCachedService = taxLotsCachedService;
        this.shortingInfoStore = shortingInfoStore;
        this.accountAccessStore = accountAccessStore;
        this.microgramComponentFactory = microgramComponentFactory;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public EquityShareOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        BackupWithholdingStore backupWithholdingStore = this.backupWithholdingStore.get();
        Intrinsics.checkNotNullExpressionValue(backupWithholdingStore, "get(...)");
        CollateralStore collateralStore = this.collateralStore.get();
        Intrinsics.checkNotNullExpressionValue(collateralStore, "get(...)");
        EquityOrderContextStore equityOrderContextStore = this.equityOrderContextStore.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderContextStore, "get(...)");
        EquityOrderCheckValidator equityOrderCheckValidator = this.equityOrderCheckValidator.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderCheckValidator, "get(...)");
        EquityTradingSessionChangedStore equityTradingSessionChangedStore = this.equityTradingSessionChangedStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSessionChangedStore, "get(...)");
        TraderEventLogger traderEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        InstrumentStore instrumentStore = this.instrumentStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentStore, "get(...)");
        InstrumentAccountSwitcherStore instrumentAccountSwitcherStore = this.instrumentAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentAccountSwitcherStore, "get(...)");
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager.get();
        Intrinsics.checkNotNullExpressionValue(traderMarketHoursManager, "get(...)");
        NbboSummaryStore nbboSummaryStore = this.nbboSummaryStore.get();
        Intrinsics.checkNotNullExpressionValue(nbboSummaryStore, "get(...)");
        NbboSummaryStore nbboSummaryStore2 = nbboSummaryStore;
        EquityOrderManager equityOrderManager = this.orderManager.get();
        Intrinsics.checkNotNullExpressionValue(equityOrderManager, "get(...)");
        EquityOrderManager equityOrderManager2 = equityOrderManager;
        PositionStore positionStore = this.positionStore.get();
        Intrinsics.checkNotNullExpressionValue(positionStore, "get(...)");
        PositionStore positionStore2 = positionStore;
        QuoteStore quoteStore = this.quoteStore.get();
        Intrinsics.checkNotNullExpressionValue(quoteStore, "get(...)");
        QuoteStore quoteStore2 = quoteStore;
        InstrumentBuyingPowerStore instrumentBuyingPowerStore = this.instrumentBuyingPowerStore.get();
        Intrinsics.checkNotNullExpressionValue(instrumentBuyingPowerStore, "get(...)");
        InstrumentBuyingPowerStore instrumentBuyingPowerStore2 = instrumentBuyingPowerStore;
        SuitabilityStore suitabilityStore = this.suitabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(suitabilityStore, "get(...)");
        SuitabilityStore suitabilityStore2 = suitabilityStore;
        BooleanPreference booleanPreference = this.buySellOrderOnboardingSeenPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BuySellOrderOnboardingStore buySellOrderOnboardingStore = this.buySellOrderOnboardingStore.get();
        Intrinsics.checkNotNullExpressionValue(buySellOrderOnboardingStore, "get(...)");
        BuySellOrderOnboardingStore buySellOrderOnboardingStore2 = buySellOrderOnboardingStore;
        EquityTradingSeenStatusStore equityTradingSeenStatusStore = this.equityTradingSeenStatusStore.get();
        Intrinsics.checkNotNullExpressionValue(equityTradingSeenStatusStore, "get(...)");
        EquityTradingSeenStatusStore equityTradingSeenStatusStore2 = equityTradingSeenStatusStore;
        TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager = this.twentyFourHourMarketOnboardingBottomSheetManager.get();
        Intrinsics.checkNotNullExpressionValue(twentyFourHourMarketOnboardingBottomSheetManager, "get(...)");
        TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager2 = twentyFourHourMarketOnboardingBottomSheetManager;
        BooleanPreference booleanPreference3 = this.hasShownAdtOnboardingBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        OrderStore orderStore = this.orderStore.get();
        Intrinsics.checkNotNullExpressionValue(orderStore, "get(...)");
        OrderStore orderStore2 = orderStore;
        TaxLotsCachedService taxLotsCachedService = this.taxLotsCachedService.get();
        Intrinsics.checkNotNullExpressionValue(taxLotsCachedService, "get(...)");
        TaxLotsCachedService taxLotsCachedService2 = taxLotsCachedService;
        ShortingInfoStore shortingInfoStore = this.shortingInfoStore.get();
        Intrinsics.checkNotNullExpressionValue(shortingInfoStore, "get(...)");
        ShortingInfoStore shortingInfoStore2 = shortingInfoStore;
        AccountAccessStore accountAccessStore = this.accountAccessStore.get();
        Intrinsics.checkNotNullExpressionValue(accountAccessStore, "get(...)");
        AccountAccessStore accountAccessStore2 = accountAccessStore;
        MicrogramComponent.Factory factory = this.microgramComponentFactory.get();
        Intrinsics.checkNotNullExpressionValue(factory, "get(...)");
        MicrogramComponent.Factory factory2 = factory;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, analyticsLogger, backupWithholdingStore, collateralStore, equityOrderContextStore, equityOrderCheckValidator, equityTradingSessionChangedStore, traderEventLogger, experimentsStore, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, traderMarketHoursManager, nbboSummaryStore2, equityOrderManager2, positionStore2, quoteStore2, instrumentBuyingPowerStore2, suitabilityStore2, booleanPreference2, buySellOrderOnboardingStore2, equityTradingSeenStatusStore2, twentyFourHourMarketOnboardingBottomSheetManager2, booleanPreference4, orderStore2, taxLotsCachedService2, shortingInfoStore2, accountAccessStore2, factory2, duxoBundle2, savedStateHandle);
    }

    /* compiled from: EquityShareOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jº\u0003\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00072\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020.0\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00072\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u00072\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00072\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00072\f\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00072\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00072\f\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u0007H\u0007J\u0080\u0002\u0010D\u001a\u00020E2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020.2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0007¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo_Factory;", "accountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "backupWithholdingStore", "Lcom/robinhood/store/base/BackupWithholdingStore;", "collateralStore", "Lcom/robinhood/librobinhood/data/store/CollateralStore;", "equityOrderContextStore", "Lcom/robinhood/android/equity/validation/EquityOrderContextStore;", "equityOrderCheckValidator", "Lcom/robinhood/android/equity/ordercheck/EquityOrderCheckValidator;", "equityTradingSessionChangedStore", "Lcom/robinhood/librobinhood/data/store/EquityTradingSessionChangedStore;", "eventLogger", "Lcom/robinhood/analytics/TraderEventLogger;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "instrumentStore", "Lcom/robinhood/librobinhood/data/store/InstrumentStore;", "instrumentAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/bonfire/instrument/InstrumentAccountSwitcherStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "nbboSummaryStore", "Lcom/robinhood/librobinhood/data/store/bonfire/NbboSummaryStore;", "orderManager", "Lcom/robinhood/android/equity/submission/EquityOrderManager;", "positionStore", "Lcom/robinhood/librobinhood/data/store/PositionStore;", "quoteStore", "Lcom/robinhood/librobinhood/data/store/QuoteStore;", "instrumentBuyingPowerStore", "Lcom/robinhood/librobinhood/data/store/InstrumentBuyingPowerStore;", "suitabilityStore", "Lcom/robinhood/store/base/SuitabilityStore;", "buySellOrderOnboardingSeenPref", "Lcom/robinhood/prefs/BooleanPreference;", "buySellOrderOnboardingStore", "Lcom/robinhood/librobinhood/data/store/BuySellOrderOnboardingStore;", "equityTradingSeenStatusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/EquityTradingSeenStatusStore;", "twentyFourHourMarketOnboardingBottomSheetManager", "Lcom/robinhood/librobinhood/data/util/TwentyFourHourMarketOnboardingBottomSheetManager;", "hasShownAdtOnboardingBottomSheetPref", "orderStore", "Lcom/robinhood/librobinhood/data/store/OrderStore;", "taxLotsCachedService", "Lcom/robinhood/android/equities/taxlots/microgram/TaxLotsCachedService;", "shortingInfoStore", "Lcom/robinhood/shared/equities/store/subzero/ShortingInfoStore;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDuxo;", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final EquityShareOrderDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AnalyticsLogger> analytics, Provider<BackupWithholdingStore> backupWithholdingStore, Provider<CollateralStore> collateralStore, Provider<EquityOrderContextStore> equityOrderContextStore, Provider<EquityOrderCheckValidator> equityOrderCheckValidator, Provider<EquityTradingSessionChangedStore> equityTradingSessionChangedStore, Provider<TraderEventLogger> eventLogger, Provider<ExperimentsStore> experimentsStore, Provider<RegionGateProvider> regionGateProvider, Provider<InstrumentStore> instrumentStore, Provider<InstrumentAccountSwitcherStore> instrumentAccountSwitcherStore, Provider<TraderMarketHoursManager> marketHoursManager, Provider<NbboSummaryStore> nbboSummaryStore, Provider<EquityOrderManager> orderManager, Provider<PositionStore> positionStore, Provider<QuoteStore> quoteStore, Provider<InstrumentBuyingPowerStore> instrumentBuyingPowerStore, Provider<SuitabilityStore> suitabilityStore, Provider<BooleanPreference> buySellOrderOnboardingSeenPref, Provider<BuySellOrderOnboardingStore> buySellOrderOnboardingStore, Provider<EquityTradingSeenStatusStore> equityTradingSeenStatusStore, Provider<TwentyFourHourMarketOnboardingBottomSheetManager> twentyFourHourMarketOnboardingBottomSheetManager, Provider<BooleanPreference> hasShownAdtOnboardingBottomSheetPref, Provider<OrderStore> orderStore, Provider<TaxLotsCachedService> taxLotsCachedService, Provider<ShortingInfoStore> shortingInfoStore, Provider<AccountAccessStore> accountAccessStore, Provider<MicrogramComponent.Factory> microgramComponentFactory, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(equityOrderContextStore, "equityOrderContextStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityShareOrderDuxo_Factory(accountProvider, analytics, backupWithholdingStore, collateralStore, equityOrderContextStore, equityOrderCheckValidator, equityTradingSessionChangedStore, eventLogger, experimentsStore, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, marketHoursManager, nbboSummaryStore, orderManager, positionStore, quoteStore, instrumentBuyingPowerStore, suitabilityStore, buySellOrderOnboardingSeenPref, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, hasShownAdtOnboardingBottomSheetPref, orderStore, taxLotsCachedService, shortingInfoStore, accountAccessStore, microgramComponentFactory, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final EquityShareOrderDuxo newInstance(AccountProvider accountProvider, AnalyticsLogger analytics, BackupWithholdingStore backupWithholdingStore, CollateralStore collateralStore, EquityOrderContextStore equityOrderContextStore, EquityOrderCheckValidator equityOrderCheckValidator, EquityTradingSessionChangedStore equityTradingSessionChangedStore, TraderEventLogger eventLogger, ExperimentsStore experimentsStore, RegionGateProvider regionGateProvider, InstrumentStore instrumentStore, InstrumentAccountSwitcherStore instrumentAccountSwitcherStore, TraderMarketHoursManager marketHoursManager, NbboSummaryStore nbboSummaryStore, EquityOrderManager orderManager, PositionStore positionStore, QuoteStore quoteStore, InstrumentBuyingPowerStore instrumentBuyingPowerStore, SuitabilityStore suitabilityStore, BooleanPreference buySellOrderOnboardingSeenPref, BuySellOrderOnboardingStore buySellOrderOnboardingStore, EquityTradingSeenStatusStore equityTradingSeenStatusStore, TwentyFourHourMarketOnboardingBottomSheetManager twentyFourHourMarketOnboardingBottomSheetManager, BooleanPreference hasShownAdtOnboardingBottomSheetPref, OrderStore orderStore, TaxLotsCachedService taxLotsCachedService, ShortingInfoStore shortingInfoStore, AccountAccessStore accountAccessStore, MicrogramComponent.Factory microgramComponentFactory, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(backupWithholdingStore, "backupWithholdingStore");
            Intrinsics.checkNotNullParameter(collateralStore, "collateralStore");
            Intrinsics.checkNotNullParameter(equityOrderContextStore, "equityOrderContextStore");
            Intrinsics.checkNotNullParameter(equityOrderCheckValidator, "equityOrderCheckValidator");
            Intrinsics.checkNotNullParameter(equityTradingSessionChangedStore, "equityTradingSessionChangedStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(instrumentStore, "instrumentStore");
            Intrinsics.checkNotNullParameter(instrumentAccountSwitcherStore, "instrumentAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
            Intrinsics.checkNotNullParameter(nbboSummaryStore, "nbboSummaryStore");
            Intrinsics.checkNotNullParameter(orderManager, "orderManager");
            Intrinsics.checkNotNullParameter(positionStore, "positionStore");
            Intrinsics.checkNotNullParameter(quoteStore, "quoteStore");
            Intrinsics.checkNotNullParameter(instrumentBuyingPowerStore, "instrumentBuyingPowerStore");
            Intrinsics.checkNotNullParameter(suitabilityStore, "suitabilityStore");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingSeenPref, "buySellOrderOnboardingSeenPref");
            Intrinsics.checkNotNullParameter(buySellOrderOnboardingStore, "buySellOrderOnboardingStore");
            Intrinsics.checkNotNullParameter(equityTradingSeenStatusStore, "equityTradingSeenStatusStore");
            Intrinsics.checkNotNullParameter(twentyFourHourMarketOnboardingBottomSheetManager, "twentyFourHourMarketOnboardingBottomSheetManager");
            Intrinsics.checkNotNullParameter(hasShownAdtOnboardingBottomSheetPref, "hasShownAdtOnboardingBottomSheetPref");
            Intrinsics.checkNotNullParameter(orderStore, "orderStore");
            Intrinsics.checkNotNullParameter(taxLotsCachedService, "taxLotsCachedService");
            Intrinsics.checkNotNullParameter(shortingInfoStore, "shortingInfoStore");
            Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
            Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new EquityShareOrderDuxo(accountProvider, analytics, backupWithholdingStore, collateralStore, equityOrderContextStore, equityOrderCheckValidator, equityTradingSessionChangedStore, eventLogger, experimentsStore, regionGateProvider, instrumentStore, instrumentAccountSwitcherStore, marketHoursManager, nbboSummaryStore, orderManager, positionStore, quoteStore, instrumentBuyingPowerStore, suitabilityStore, buySellOrderOnboardingSeenPref, buySellOrderOnboardingStore, equityTradingSeenStatusStore, twentyFourHourMarketOnboardingBottomSheetManager, hasShownAdtOnboardingBottomSheetPref, orderStore, taxLotsCachedService, shortingInfoStore, accountAccessStore, microgramComponentFactory, duxoBundle, savedStateHandle);
        }
    }
}

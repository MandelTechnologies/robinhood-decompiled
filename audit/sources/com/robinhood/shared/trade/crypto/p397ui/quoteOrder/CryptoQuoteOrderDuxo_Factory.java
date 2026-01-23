package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.CryptoTradeBonusEligibilityProvider;
import com.robinhood.store.base.InvestmentScheduleStore;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoQuoteOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB¾\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0011\u0010\n\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0003\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0003\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0003\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0003\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0003\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0003\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0003\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0003\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u0003\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u0003\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u0003\u0012\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u0003\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u0003\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u0003\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u0003\u0012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u0003\u0012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u0003¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0002H\u0016¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u001f\u0010\n\u001a\r\u0012\t\u0012\u00070\b¢\u0006\u0002\b\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010ER\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010ER\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010ER\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ER\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010ER\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010ER\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010ER\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010ER\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010ER\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010ER\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010ER\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010ER\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010ER\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010ER\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010ER\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010ER\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010ER\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010ER\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010ER\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010ER\u001a\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010ER\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010ER\u001a\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010ER\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010ER\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010ER\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010ER\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010E¨\u0006G"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "Lkotlin/jvm/JvmSuppressWildcards;", "bottomSheetServiceLazy", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "hasSeenTaxLotOrderTooltipPref", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoQuoteOrderDuxo_Factory implements Factory<CryptoQuoteOrderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<CryptoTradingBottomSheetService> bottomSheetServiceLazy;
    private final Provider<Clock> clock;
    private final Provider<Context> context;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider;
    private final Provider<CryptoOrderContextFactory> cryptoOrderContextFactory;
    private final Provider<CryptoOrderManager> cryptoOrderManager;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider;
    private final Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider;
    private final Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoEventLogger> eventLogger;
    private final Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref;
    private final Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref;
    private final Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref;
    private final Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref;
    private final Provider<InvestmentScheduleStore> investmentScheduleStore;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator;
    private final Provider<TaxlotabilityStore> taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoQuoteOrderDuxo_Factory create(Provider<AppType> provider, Provider<AccountProvider> provider2, Provider<CryptoTradingBottomSheetService> provider3, Provider<Clock> provider4, Provider<CryptoAccountProvider> provider5, Provider<CryptoExperimentsStore> provider6, Provider<CryptoFeeUiEventProvider> provider7, Provider<CryptoOrderContextFactory> provider8, Provider<CryptoOrderManager> provider9, Provider<CryptoOrderMonetizationModelProvider> provider10, Provider<CryptoPowerInfoAlertProvider> provider11, Provider<CryptoTradeBonusEligibilityProvider> provider12, Provider<CryptoEventLogger> provider13, Provider<InvestmentScheduleStore> provider14, Provider<PerformanceLogger> provider15, Provider<LazyMoshi> provider16, Provider<MicrogramManager> provider17, Provider<RegionGateProvider> provider18, Provider<ServerDrivenCryptoOrderValidator> provider19, Provider<StringToLongMapPreference> provider20, Provider<BooleanPreference> provider21, Provider<BooleanPreference> provider22, Provider<BooleanPreference> provider23, Provider<CryptoTradeDisclosuresProvider> provider24, Provider<RealCryptoTradeUserInputsService> provider25, Provider<Resources> provider26, Provider<TaxlotabilityStore> provider27, Provider<SavedStateHandle> provider28, Provider<Context> provider29, Provider<DuxoBundle> provider30, Provider<Navigator> provider31) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31);
    }

    @JvmStatic
    public static final CryptoQuoteOrderDuxo newInstance(AppType appType, AccountProvider accountProvider, Lazy<CryptoTradingBottomSheetService> lazy, Clock clock, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CryptoEventLogger cryptoEventLogger, InvestmentScheduleStore investmentScheduleStore, PerformanceLogger performanceLogger, LazyMoshi lazyMoshi, MicrogramManager microgramManager, RegionGateProvider regionGateProvider, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, StringToLongMapPreference stringToLongMapPreference, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, BooleanPreference booleanPreference3, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, Resources resources, TaxlotabilityStore taxlotabilityStore, SavedStateHandle savedStateHandle, Context context, DuxoBundle duxoBundle, Navigator navigator) {
        return INSTANCE.newInstance(appType, accountProvider, lazy, clock, cryptoAccountProvider, cryptoExperimentsStore, cryptoFeeUiEventProvider, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, cryptoEventLogger, investmentScheduleStore, performanceLogger, lazyMoshi, microgramManager, regionGateProvider, serverDrivenCryptoOrderValidator, stringToLongMapPreference, booleanPreference, booleanPreference2, booleanPreference3, cryptoTradeDisclosuresProvider, realCryptoTradeUserInputsService, resources, taxlotabilityStore, savedStateHandle, context, duxoBundle, navigator);
    }

    public CryptoQuoteOrderDuxo_Factory(Provider<AppType> appType, Provider<AccountProvider> accountProvider, Provider<CryptoTradingBottomSheetService> bottomSheetServiceLazy, Provider<Clock> clock, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider, Provider<CryptoEventLogger> eventLogger, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<PerformanceLogger> performanceLogger, Provider<LazyMoshi> moshi, Provider<MicrogramManager> microgramManager, Provider<RegionGateProvider> regionGateProvider, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref, Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref, Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<Resources> resources, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<SavedStateHandle> savedStateHandle, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<Navigator> navigator) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(bottomSheetServiceLazy, "bottomSheetServiceLazy");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
        Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
        Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.appType = appType;
        this.accountProvider = accountProvider;
        this.bottomSheetServiceLazy = bottomSheetServiceLazy;
        this.clock = clock;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoFeeUiEventProvider = cryptoFeeUiEventProvider;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoTradeBonusEligibilityProvider = cryptoTradeBonusEligibilityProvider;
        this.eventLogger = eventLogger;
        this.investmentScheduleStore = investmentScheduleStore;
        this.performanceLogger = performanceLogger;
        this.moshi = moshi;
        this.microgramManager = microgramManager;
        this.regionGateProvider = regionGateProvider;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.feeUnsupportedBannerDismissMillisPref = feeUnsupportedBannerDismissMillisPref;
        this.hasSeenEuAdvancedOrdersTooltipPref = hasSeenEuAdvancedOrdersTooltipPref;
        this.hasSeenTaxLotOrderTooltipPref = hasSeenTaxLotOrderTooltipPref;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.resources = resources;
        this.taxlotabilityStore = taxlotabilityStore;
        this.savedStateHandle = savedStateHandle;
        this.context = context;
        this.duxoBundle = duxoBundle;
        this.navigator = navigator;
    }

    @Override // javax.inject.Provider
    public CryptoQuoteOrderDuxo get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        Lazy<CryptoTradingBottomSheetService> lazy = DoubleCheck.lazy(this.bottomSheetServiceLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoFeeUiEventProvider cryptoFeeUiEventProvider = this.cryptoFeeUiEventProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeUiEventProvider, "get(...)");
        CryptoOrderContextFactory cryptoOrderContextFactory = this.cryptoOrderContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderContextFactory, "get(...)");
        CryptoOrderManager cryptoOrderManager = this.cryptoOrderManager.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderManager, "get(...)");
        CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider = this.cryptoOrderMonetizationModelProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMonetizationModelProvider, "get(...)");
        CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider = this.cryptoPowerInfoAlertProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPowerInfoAlertProvider, "get(...)");
        CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider = this.cryptoTradeBonusEligibilityProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeBonusEligibilityProvider, "get(...)");
        CryptoEventLogger cryptoEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEventLogger, "get(...)");
        InvestmentScheduleStore investmentScheduleStore = this.investmentScheduleStore.get();
        Intrinsics.checkNotNullExpressionValue(investmentScheduleStore, "get(...)");
        InvestmentScheduleStore investmentScheduleStore2 = investmentScheduleStore;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        LazyMoshi lazyMoshi2 = lazyMoshi;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        RegionGateProvider regionGateProvider2 = regionGateProvider;
        ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = this.serverDrivenCryptoOrderValidator.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenCryptoOrderValidator, "get(...)");
        ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator2 = serverDrivenCryptoOrderValidator;
        StringToLongMapPreference stringToLongMapPreference = this.feeUnsupportedBannerDismissMillisPref.get();
        Intrinsics.checkNotNullExpressionValue(stringToLongMapPreference, "get(...)");
        StringToLongMapPreference stringToLongMapPreference2 = stringToLongMapPreference;
        BooleanPreference booleanPreference = this.hasSeenEuAdvancedOrdersTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        BooleanPreference booleanPreference3 = this.hasSeenTaxLotOrderTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        BooleanPreference booleanPreference5 = this.hasSeenFeeUpsellBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = this.cryptoTradeDisclosuresProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeDisclosuresProvider, "get(...)");
        CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider2 = cryptoTradeDisclosuresProvider;
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService2 = realCryptoTradeUserInputsService;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Resources resources2 = resources;
        TaxlotabilityStore taxlotabilityStore = this.taxlotabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(taxlotabilityStore, "get(...)");
        TaxlotabilityStore taxlotabilityStore2 = taxlotabilityStore;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        SavedStateHandle savedStateHandle2 = savedStateHandle;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        Context context2 = context;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        return companion.newInstance(appType, accountProvider, lazy, clock, cryptoAccountProvider, cryptoExperimentsStore, cryptoFeeUiEventProvider, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, cryptoEventLogger, investmentScheduleStore2, performanceLogger2, lazyMoshi2, microgramManager2, regionGateProvider2, serverDrivenCryptoOrderValidator2, stringToLongMapPreference2, booleanPreference2, booleanPreference4, booleanPreference6, cryptoTradeDisclosuresProvider2, realCryptoTradeUserInputsService2, resources2, taxlotabilityStore2, savedStateHandle2, context2, duxoBundle2, navigator);
    }

    /* compiled from: CryptoQuoteOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÆ\u0003\u0010C\u001a\u00020B2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020.0\u00042\f\u00101\u001a\b\u0012\u0004\u0012\u00020.0\u00042\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00042\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00042\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00042\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0004H\u0007¢\u0006\u0004\bC\u0010DJ\u0092\u0002\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0E2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0007¢\u0006\u0004\bG\u0010H¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "Lkotlin/jvm/JvmSuppressWildcards;", "bottomSheetServiceLazy", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/store/base/InvestmentScheduleStore;", "investmentScheduleStore", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/prefs/StringToLongMapPreference;", "feeUnsupportedBannerDismissMillisPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "hasSeenTaxLotOrderTooltipPref", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "Landroid/content/res/Resources;", "resources", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo_Factory;", "Ldagger/Lazy;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "newInstance", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/lib/account/AccountProvider;Ldagger/Lazy;Lj$/time/Clock;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/store/base/InvestmentScheduleStore;Lcom/robinhood/android/performancelogger/PerformanceLogger;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Landroid/content/res/Resources;Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;Landroidx/lifecycle/SavedStateHandle;Landroid/content/Context;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/navigation/Navigator;)Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoQuoteOrderDuxo_Factory create(Provider<AppType> appType, Provider<AccountProvider> accountProvider, Provider<CryptoTradingBottomSheetService> bottomSheetServiceLazy, Provider<Clock> clock, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider, Provider<CryptoEventLogger> eventLogger, Provider<InvestmentScheduleStore> investmentScheduleStore, Provider<PerformanceLogger> performanceLogger, Provider<LazyMoshi> moshi, Provider<MicrogramManager> microgramManager, Provider<RegionGateProvider> regionGateProvider, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<StringToLongMapPreference> feeUnsupportedBannerDismissMillisPref, Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref, Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<Resources> resources, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<SavedStateHandle> savedStateHandle, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<Navigator> navigator) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(bottomSheetServiceLazy, "bottomSheetServiceLazy");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
            Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
            Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new CryptoQuoteOrderDuxo_Factory(appType, accountProvider, bottomSheetServiceLazy, clock, cryptoAccountProvider, cryptoExperimentsStore, cryptoFeeUiEventProvider, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, eventLogger, investmentScheduleStore, performanceLogger, moshi, microgramManager, regionGateProvider, serverDrivenCryptoOrderValidator, feeUnsupportedBannerDismissMillisPref, hasSeenEuAdvancedOrdersTooltipPref, hasSeenTaxLotOrderTooltipPref, hasSeenFeeUpsellBottomSheetPref, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, resources, taxlotabilityStore, savedStateHandle, context, duxoBundle, navigator);
        }

        @JvmStatic
        public final CryptoQuoteOrderDuxo newInstance(AppType appType, AccountProvider accountProvider, Lazy<CryptoTradingBottomSheetService> bottomSheetServiceLazy, Clock clock, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CryptoEventLogger eventLogger, InvestmentScheduleStore investmentScheduleStore, PerformanceLogger performanceLogger, LazyMoshi moshi, MicrogramManager microgramManager, RegionGateProvider regionGateProvider, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, StringToLongMapPreference feeUnsupportedBannerDismissMillisPref, BooleanPreference hasSeenEuAdvancedOrdersTooltipPref, BooleanPreference hasSeenTaxLotOrderTooltipPref, BooleanPreference hasSeenFeeUpsellBottomSheetPref, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, Resources resources, TaxlotabilityStore taxlotabilityStore, SavedStateHandle savedStateHandle, Context context, DuxoBundle duxoBundle, Navigator navigator) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(bottomSheetServiceLazy, "bottomSheetServiceLazy");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(investmentScheduleStore, "investmentScheduleStore");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(feeUnsupportedBannerDismissMillisPref, "feeUnsupportedBannerDismissMillisPref");
            Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
            Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            return new CryptoQuoteOrderDuxo(appType, accountProvider, bottomSheetServiceLazy, clock, cryptoAccountProvider, cryptoExperimentsStore, cryptoFeeUiEventProvider, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, eventLogger, investmentScheduleStore, performanceLogger, moshi, microgramManager, regionGateProvider, serverDrivenCryptoOrderValidator, feeUnsupportedBannerDismissMillisPref, hasSeenEuAdvancedOrdersTooltipPref, hasSeenTaxLotOrderTooltipPref, hasSeenFeeUpsellBottomSheetPref, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, resources, taxlotabilityStore, savedStateHandle, context, duxoBundle, navigator);
        }
    }
}

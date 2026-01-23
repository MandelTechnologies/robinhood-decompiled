package com.robinhood.shared.trade.crypto.p397ui.order;

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
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.TaxlotabilityStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.CryptoTradeBonusEligibilityProvider;
import com.robinhood.shared.trade.crypto.util.CryptoOrderMinuteFlowProvider;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;

/* compiled from: CryptoOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 G2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001GBÄ\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0003\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0003\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0003\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0003\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0003\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0\u0003\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003\u0012\f\u00103\u001a\b\u0012\u0004\u0012\u0002020\u0003\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u0003\u0012\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0003\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u0002080\u0003\u0012\f\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u0003\u0012\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u0003\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u0003\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u0003¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0002H\u0016¢\u0006\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010FR%\u0010\u000f\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010FR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010FR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010FR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010FR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010FR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010FR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010FR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010FR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010FR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010FR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010FR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010FR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010FR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010FR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\"0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010FR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010FR\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010FR\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010FR\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010FR\u001a\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010FR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010FR\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010FR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010FR\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010F¨\u0006H"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetService", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoInputModePref", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "hasSeenTaxLotOrderTooltipPref", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "Ljavax/inject/Provider;", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderDuxo_Factory implements Factory<CryptoOrderDuxo> {
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<CryptoTradingBottomSheetService> bottomSheetService;
    private final Provider<Clock> clock;
    private final Provider<Context> context;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider;
    private final Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref;
    private final Provider<CryptoOrderContextFactory> cryptoOrderContextFactory;
    private final Provider<CryptoOrderManager> cryptoOrderManager;
    private final Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider;
    private final Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider;
    private final Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoEventLogger> eventLogger;
    private final Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref;
    private final Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref;
    private final Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<LazyMoshi> moshi;
    private final Provider<Navigator> navigator;
    private final Provider<PerformanceLogger> performanceLogger;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator;
    private final Provider<TaxlotabilityStore> taxlotabilityStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderDuxo_Factory create(Provider<AccountProvider> provider, Provider<AppType> provider2, Provider<CryptoTradingBottomSheetService> provider3, Provider<CryptoAccountProvider> provider4, Provider<EnumPreference<CryptoInputMode>> provider5, Provider<CryptoOrderContextFactory> provider6, Provider<CryptoOrderManager> provider7, Provider<CryptoOrderMonetizationModelProvider> provider8, Provider<CryptoPowerInfoAlertProvider> provider9, Provider<CryptoTradeBonusEligibilityProvider> provider10, Provider<CurrencyPairV2Store> provider11, Provider<CryptoEventLogger> provider12, Provider<ServerDrivenCryptoOrderValidator> provider13, Provider<CryptoExperimentsStore> provider14, Provider<BooleanPreference> provider15, Provider<CryptoFeeUiEventProvider> provider16, Provider<CryptoOrderMinuteFlowProvider> provider17, Provider<BooleanPreference> provider18, Provider<TaxlotabilityStore> provider19, Provider<CryptoTradeDisclosuresProvider> provider20, Provider<RealCryptoTradeUserInputsService> provider21, Provider<BooleanPreference> provider22, Provider<LazyMoshi> provider23, Provider<MicrogramManager> provider24, Provider<PerformanceLogger> provider25, Provider<Resources> provider26, Provider<Clock> provider27, Provider<Context> provider28, Provider<DuxoBundle> provider29, Provider<Navigator> provider30, Provider<SavedStateHandle> provider31) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31);
    }

    @JvmStatic
    public static final CryptoOrderDuxo newInstance(AccountProvider accountProvider, AppType appType, CryptoTradingBottomSheetService cryptoTradingBottomSheetService, CryptoAccountProvider cryptoAccountProvider, EnumPreference<CryptoInputMode> enumPreference, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CurrencyPairV2Store currencyPairV2Store, CryptoEventLogger cryptoEventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference booleanPreference, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, BooleanPreference booleanPreference2, TaxlotabilityStore taxlotabilityStore, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, BooleanPreference booleanPreference3, LazyMoshi lazyMoshi, MicrogramManager microgramManager, PerformanceLogger performanceLogger, Resources resources, Clock clock, Context context, DuxoBundle duxoBundle, Navigator navigator, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(accountProvider, appType, cryptoTradingBottomSheetService, cryptoAccountProvider, enumPreference, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, currencyPairV2Store, cryptoEventLogger, serverDrivenCryptoOrderValidator, cryptoExperimentsStore, booleanPreference, cryptoFeeUiEventProvider, cryptoOrderMinuteFlowProvider, booleanPreference2, taxlotabilityStore, cryptoTradeDisclosuresProvider, realCryptoTradeUserInputsService, booleanPreference3, lazyMoshi, microgramManager, performanceLogger, resources, clock, context, duxoBundle, navigator, savedStateHandle);
    }

    public CryptoOrderDuxo_Factory(Provider<AccountProvider> accountProvider, Provider<AppType> appType, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoEventLogger> eventLogger, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref, Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider, Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider, Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref, Provider<LazyMoshi> moshi, Provider<MicrogramManager> microgramManager, Provider<PerformanceLogger> performanceLogger, Provider<Resources> resources, Provider<Clock> clock, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
        Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
        Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
        Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.appType = appType;
        this.bottomSheetService = bottomSheetService;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoInputModePref = cryptoInputModePref;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.cryptoTradeBonusEligibilityProvider = cryptoTradeBonusEligibilityProvider;
        this.currencyPairStore = currencyPairStore;
        this.eventLogger = eventLogger;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.hasSeenEuAdvancedOrdersTooltipPref = hasSeenEuAdvancedOrdersTooltipPref;
        this.cryptoFeeUiEventProvider = cryptoFeeUiEventProvider;
        this.cryptoOrderMinuteFlowProvider = cryptoOrderMinuteFlowProvider;
        this.hasSeenTaxLotOrderTooltipPref = hasSeenTaxLotOrderTooltipPref;
        this.taxlotabilityStore = taxlotabilityStore;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.hasSeenFeeUpsellBottomSheetPref = hasSeenFeeUpsellBottomSheetPref;
        this.moshi = moshi;
        this.microgramManager = microgramManager;
        this.performanceLogger = performanceLogger;
        this.resources = resources;
        this.clock = clock;
        this.context = context;
        this.duxoBundle = duxoBundle;
        this.navigator = navigator;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoOrderDuxo get() {
        Companion companion = INSTANCE;
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.bottomSheetService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingBottomSheetService, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        EnumPreference<CryptoInputMode> enumPreference = this.cryptoInputModePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
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
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        CryptoEventLogger cryptoEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEventLogger, "get(...)");
        ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = this.serverDrivenCryptoOrderValidator.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenCryptoOrderValidator, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore2 = cryptoExperimentsStore;
        BooleanPreference booleanPreference = this.hasSeenEuAdvancedOrdersTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = booleanPreference;
        CryptoFeeUiEventProvider cryptoFeeUiEventProvider = this.cryptoFeeUiEventProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeUiEventProvider, "get(...)");
        CryptoFeeUiEventProvider cryptoFeeUiEventProvider2 = cryptoFeeUiEventProvider;
        CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider = this.cryptoOrderMinuteFlowProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderMinuteFlowProvider, "get(...)");
        CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider2 = cryptoOrderMinuteFlowProvider;
        BooleanPreference booleanPreference3 = this.hasSeenTaxLotOrderTooltipPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference3, "get(...)");
        BooleanPreference booleanPreference4 = booleanPreference3;
        TaxlotabilityStore taxlotabilityStore = this.taxlotabilityStore.get();
        Intrinsics.checkNotNullExpressionValue(taxlotabilityStore, "get(...)");
        TaxlotabilityStore taxlotabilityStore2 = taxlotabilityStore;
        CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = this.cryptoTradeDisclosuresProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeDisclosuresProvider, "get(...)");
        CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider2 = cryptoTradeDisclosuresProvider;
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService2 = realCryptoTradeUserInputsService;
        BooleanPreference booleanPreference5 = this.hasSeenFeeUpsellBottomSheetPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference5, "get(...)");
        BooleanPreference booleanPreference6 = booleanPreference5;
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        LazyMoshi lazyMoshi2 = lazyMoshi;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        PerformanceLogger performanceLogger = this.performanceLogger.get();
        Intrinsics.checkNotNullExpressionValue(performanceLogger, "get(...)");
        PerformanceLogger performanceLogger2 = performanceLogger;
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        Resources resources2 = resources;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        Clock clock2 = clock;
        Context context = this.context.get();
        Intrinsics.checkNotNullExpressionValue(context, "get(...)");
        Context context2 = context;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        Navigator navigator = this.navigator.get();
        Intrinsics.checkNotNullExpressionValue(navigator, "get(...)");
        Navigator navigator2 = navigator;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(accountProvider, appType, cryptoTradingBottomSheetService, cryptoAccountProvider, enumPreference, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, currencyPairV2Store, cryptoEventLogger, serverDrivenCryptoOrderValidator, cryptoExperimentsStore2, booleanPreference2, cryptoFeeUiEventProvider2, cryptoOrderMinuteFlowProvider2, booleanPreference4, taxlotabilityStore2, cryptoTradeDisclosuresProvider2, realCryptoTradeUserInputsService2, booleanPreference6, lazyMoshi2, microgramManager2, performanceLogger2, resources2, clock2, context2, duxoBundle2, navigator2, savedStateHandle);
    }

    /* compiled from: CryptoOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0003\u0010D\u001a\u00020C2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0017\u0010\u0010\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f0\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00042\f\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00042\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00042\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u0002070\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u0004H\u0007¢\u0006\u0004\bD\u0010EJ\u0092\u0002\u0010G\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020#2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020#2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0007¢\u0006\u0004\bG\u0010H¨\u0006I"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo_Factory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "bottomSheetService", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoInputModePref", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderManager", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;", "cryptoTradeBonusEligibilityProvider", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/analytics/CryptoEventLogger;", "eventLogger", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenEuAdvancedOrdersTooltipPref", "Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;", "cryptoFeeUiEventProvider", "Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;", "cryptoOrderMinuteFlowProvider", "hasSeenTaxLotOrderTooltipPref", "Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;", "taxlotabilityStore", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "cryptoTradeUserInputsService", "hasSeenFeeUpsellBottomSheetPref", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramManager", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "performanceLogger", "Landroid/content/res/Resources;", "resources", "j$/time/Clock", Card.Icon.CLOCK, "Landroid/content/Context;", "context", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo_Factory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo_Factory;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "newInstance", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;Lcom/robinhood/prefs/EnumPreference;Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;Lcom/robinhood/shared/trade/crypto/ui/tradeBonus/CryptoTradeBonusEligibilityProvider;Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;Lcom/robinhood/analytics/CryptoEventLogger;Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/shared/trade/crypto/ui/fee/event/CryptoFeeUiEventProvider;Lcom/robinhood/shared/trade/crypto/util/CryptoOrderMinuteFlowProvider;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/TaxlotabilityStore;Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/android/performancelogger/PerformanceLogger;Landroid/content/res/Resources;Lj$/time/Clock;Landroid/content/Context;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/navigation/Navigator;Landroidx/lifecycle/SavedStateHandle;)Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderDuxo_Factory create(Provider<AccountProvider> accountProvider, Provider<AppType> appType, Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<CryptoTradeBonusEligibilityProvider> cryptoTradeBonusEligibilityProvider, Provider<CurrencyPairV2Store> currencyPairStore, Provider<CryptoEventLogger> eventLogger, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> hasSeenEuAdvancedOrdersTooltipPref, Provider<CryptoFeeUiEventProvider> cryptoFeeUiEventProvider, Provider<CryptoOrderMinuteFlowProvider> cryptoOrderMinuteFlowProvider, Provider<BooleanPreference> hasSeenTaxLotOrderTooltipPref, Provider<TaxlotabilityStore> taxlotabilityStore, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<BooleanPreference> hasSeenFeeUpsellBottomSheetPref, Provider<LazyMoshi> moshi, Provider<MicrogramManager> microgramManager, Provider<PerformanceLogger> performanceLogger, Provider<Resources> resources, Provider<Clock> clock, Provider<Context> context, Provider<DuxoBundle> duxoBundle, Provider<Navigator> navigator, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
            Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
            Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderDuxo_Factory(accountProvider, appType, bottomSheetService, cryptoAccountProvider, cryptoInputModePref, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, currencyPairStore, eventLogger, serverDrivenCryptoOrderValidator, cryptoExperimentsStore, hasSeenEuAdvancedOrdersTooltipPref, cryptoFeeUiEventProvider, cryptoOrderMinuteFlowProvider, hasSeenTaxLotOrderTooltipPref, taxlotabilityStore, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, hasSeenFeeUpsellBottomSheetPref, moshi, microgramManager, performanceLogger, resources, clock, context, duxoBundle, navigator, savedStateHandle);
        }

        @JvmStatic
        public final CryptoOrderDuxo newInstance(AccountProvider accountProvider, AppType appType, CryptoTradingBottomSheetService bottomSheetService, CryptoAccountProvider cryptoAccountProvider, EnumPreference<CryptoInputMode> cryptoInputModePref, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, CryptoTradeBonusEligibilityProvider cryptoTradeBonusEligibilityProvider, CurrencyPairV2Store currencyPairStore, CryptoEventLogger eventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference hasSeenEuAdvancedOrdersTooltipPref, CryptoFeeUiEventProvider cryptoFeeUiEventProvider, CryptoOrderMinuteFlowProvider cryptoOrderMinuteFlowProvider, BooleanPreference hasSeenTaxLotOrderTooltipPref, TaxlotabilityStore taxlotabilityStore, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, BooleanPreference hasSeenFeeUpsellBottomSheetPref, LazyMoshi moshi, MicrogramManager microgramManager, PerformanceLogger performanceLogger, Resources resources, Clock clock, Context context, DuxoBundle duxoBundle, Navigator navigator, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeBonusEligibilityProvider, "cryptoTradeBonusEligibilityProvider");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenEuAdvancedOrdersTooltipPref, "hasSeenEuAdvancedOrdersTooltipPref");
            Intrinsics.checkNotNullParameter(cryptoFeeUiEventProvider, "cryptoFeeUiEventProvider");
            Intrinsics.checkNotNullParameter(cryptoOrderMinuteFlowProvider, "cryptoOrderMinuteFlowProvider");
            Intrinsics.checkNotNullParameter(hasSeenTaxLotOrderTooltipPref, "hasSeenTaxLotOrderTooltipPref");
            Intrinsics.checkNotNullParameter(taxlotabilityStore, "taxlotabilityStore");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(hasSeenFeeUpsellBottomSheetPref, "hasSeenFeeUpsellBottomSheetPref");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(performanceLogger, "performanceLogger");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoOrderDuxo(accountProvider, appType, bottomSheetService, cryptoAccountProvider, cryptoInputModePref, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, cryptoTradeBonusEligibilityProvider, currencyPairStore, eventLogger, serverDrivenCryptoOrderValidator, cryptoExperimentsStore, hasSeenEuAdvancedOrdersTooltipPref, cryptoFeeUiEventProvider, cryptoOrderMinuteFlowProvider, hasSeenTaxLotOrderTooltipPref, taxlotabilityStore, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, hasSeenFeeUpsellBottomSheetPref, moshi, microgramManager, performanceLogger, resources, clock, context, duxoBundle, navigator, savedStateHandle);
        }
    }
}

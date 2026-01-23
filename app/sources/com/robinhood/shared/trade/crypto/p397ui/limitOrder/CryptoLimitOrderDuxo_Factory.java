package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.content.res.Resources;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.monetizationModel.CryptoOrderMonetizationModelProvider;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.disclosures.CryptoTradeDisclosuresProvider;
import com.robinhood.shared.trade.crypto.p397ui.powerInfoAlert.CryptoPowerInfoAlertProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitOrderDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)Bò\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004¢\u0006\u0004\b&\u0010'J\b\u0010(\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "bottomSheetService", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoEventLogger", "Lcom/robinhood/analytics/CryptoEventLogger;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "resources", "Landroid/content/res/Resources;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoLimitOrderDuxo_Factory implements Factory<CryptoLimitOrderDuxo> {
    private final Provider<CryptoTradingBottomSheetService> bottomSheetService;
    private final Provider<CryptoEventLogger> cryptoEventLogger;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref;
    private final Provider<CryptoOrderContextFactory> cryptoOrderContextFactory;
    private final Provider<CryptoOrderManager> cryptoOrderManager;
    private final Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider;
    private final Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider;
    private final Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<Resources> resources;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoLimitOrderStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoLimitOrderDuxo_Factory create(Provider<CryptoTradingBottomSheetService> provider, Provider<CryptoEventLogger> provider2, Provider<CryptoExperimentsStore> provider3, Provider<EnumPreference<CryptoInputMode>> provider4, Provider<CryptoOrderContextFactory> provider5, Provider<CryptoOrderManager> provider6, Provider<CryptoOrderMonetizationModelProvider> provider7, Provider<CryptoPowerInfoAlertProvider> provider8, Provider<EventLogger> provider9, Provider<Resources> provider10, Provider<CryptoTradeDisclosuresProvider> provider11, Provider<RealCryptoTradeUserInputsService> provider12, Provider<SavedStateHandle> provider13, Provider<DuxoBundle> provider14, Provider<MicrogramManager> provider15, Provider<CryptoLimitOrderStateProvider> provider16) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }

    @JvmStatic
    public static final CryptoLimitOrderDuxo newInstance(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, CryptoEventLogger cryptoEventLogger, CryptoExperimentsStore cryptoExperimentsStore, EnumPreference<CryptoInputMode> enumPreference, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, EventLogger eventLogger, Resources resources, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, MicrogramManager microgramManager, CryptoLimitOrderStateProvider cryptoLimitOrderStateProvider) {
        return INSTANCE.newInstance(cryptoTradingBottomSheetService, cryptoEventLogger, cryptoExperimentsStore, enumPreference, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, eventLogger, resources, cryptoTradeDisclosuresProvider, realCryptoTradeUserInputsService, savedStateHandle, duxoBundle, microgramManager, cryptoLimitOrderStateProvider);
    }

    public CryptoLimitOrderDuxo_Factory(Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoEventLogger> cryptoEventLogger, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<EventLogger> eventLogger, Provider<Resources> resources, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<MicrogramManager> microgramManager, Provider<CryptoLimitOrderStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoEventLogger, "cryptoEventLogger");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
        Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
        Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.bottomSheetService = bottomSheetService;
        this.cryptoEventLogger = cryptoEventLogger;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoInputModePref = cryptoInputModePref;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderManager = cryptoOrderManager;
        this.cryptoOrderMonetizationModelProvider = cryptoOrderMonetizationModelProvider;
        this.cryptoPowerInfoAlertProvider = cryptoPowerInfoAlertProvider;
        this.eventLogger = eventLogger;
        this.resources = resources;
        this.cryptoTradeDisclosuresProvider = cryptoTradeDisclosuresProvider;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.microgramManager = microgramManager;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoLimitOrderDuxo get() {
        Companion companion = INSTANCE;
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.bottomSheetService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingBottomSheetService, "get(...)");
        CryptoEventLogger cryptoEventLogger = this.cryptoEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEventLogger, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
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
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        Resources resources = this.resources.get();
        Intrinsics.checkNotNullExpressionValue(resources, "get(...)");
        CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider = this.cryptoTradeDisclosuresProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeDisclosuresProvider, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        DuxoBundle duxoBundle2 = duxoBundle;
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        MicrogramManager microgramManager2 = microgramManager;
        CryptoLimitOrderStateProvider cryptoLimitOrderStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoLimitOrderStateProvider, "get(...)");
        return companion.newInstance(cryptoTradingBottomSheetService, cryptoEventLogger, cryptoExperimentsStore, enumPreference, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, eventLogger, resources, cryptoTradeDisclosuresProvider, realCryptoTradeUserInputsService, savedStateHandle, duxoBundle2, microgramManager2, cryptoLimitOrderStateProvider);
    }

    /* compiled from: CryptoLimitOrderDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jó\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0017\u0010\r\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0007H\u0007J\u0093\u0001\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0007¨\u0006+"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo_Factory;", "bottomSheetService", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoEventLogger", "Lcom/robinhood/analytics/CryptoEventLogger;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "cryptoOrderMonetizationModelProvider", "Lcom/robinhood/librobinhood/data/store/fee/monetizationModel/CryptoOrderMonetizationModelProvider;", "cryptoPowerInfoAlertProvider", "Lcom/robinhood/shared/trade/crypto/ui/powerInfoAlert/CryptoPowerInfoAlertProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "resources", "Landroid/content/res/Resources;", "cryptoTradeDisclosuresProvider", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderStateProvider;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoLimitOrderDuxo_Factory create(Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoEventLogger> cryptoEventLogger, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderManager> cryptoOrderManager, Provider<CryptoOrderMonetizationModelProvider> cryptoOrderMonetizationModelProvider, Provider<CryptoPowerInfoAlertProvider> cryptoPowerInfoAlertProvider, Provider<EventLogger> eventLogger, Provider<Resources> resources, Provider<CryptoTradeDisclosuresProvider> cryptoTradeDisclosuresProvider, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<MicrogramManager> microgramManager, Provider<CryptoLimitOrderStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoEventLogger, "cryptoEventLogger");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoLimitOrderDuxo_Factory(bottomSheetService, cryptoEventLogger, cryptoExperimentsStore, cryptoInputModePref, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, eventLogger, resources, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, savedStateHandle, duxoBundle, microgramManager, stateProvider);
        }

        @JvmStatic
        public final CryptoLimitOrderDuxo newInstance(CryptoTradingBottomSheetService bottomSheetService, CryptoEventLogger cryptoEventLogger, CryptoExperimentsStore cryptoExperimentsStore, EnumPreference<CryptoInputMode> cryptoInputModePref, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderManager cryptoOrderManager, CryptoOrderMonetizationModelProvider cryptoOrderMonetizationModelProvider, CryptoPowerInfoAlertProvider cryptoPowerInfoAlertProvider, EventLogger eventLogger, Resources resources, CryptoTradeDisclosuresProvider cryptoTradeDisclosuresProvider, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, MicrogramManager microgramManager, CryptoLimitOrderStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoEventLogger, "cryptoEventLogger");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderManager, "cryptoOrderManager");
            Intrinsics.checkNotNullParameter(cryptoOrderMonetizationModelProvider, "cryptoOrderMonetizationModelProvider");
            Intrinsics.checkNotNullParameter(cryptoPowerInfoAlertProvider, "cryptoPowerInfoAlertProvider");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(cryptoTradeDisclosuresProvider, "cryptoTradeDisclosuresProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoLimitOrderDuxo(bottomSheetService, cryptoEventLogger, cryptoExperimentsStore, cryptoInputModePref, cryptoOrderContextFactory, cryptoOrderManager, cryptoOrderMonetizationModelProvider, cryptoPowerInfoAlertProvider, eventLogger, resources, cryptoTradeDisclosuresProvider, cryptoTradeUserInputsService, savedStateHandle, duxoBundle, microgramManager, stateProvider);
        }
    }
}

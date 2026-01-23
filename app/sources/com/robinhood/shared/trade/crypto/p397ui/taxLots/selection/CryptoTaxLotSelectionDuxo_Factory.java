package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.shared.crypto.p375ui.trade.validator.ServerDrivenCryptoOrderValidator;
import com.robinhood.shared.crypto.trading.bottomsheet.CryptoTradingBottomSheetService;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContextFactory;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.validation.CryptoTaxLotSelectionValidatorProvider;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidatorManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTaxLotSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#BË\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004¢\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "bottomSheetService", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderValidatorManager", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "cryptoTaxLotSelectionValidatorProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionValidatorProvider;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoTaxLotSelectionDuxo_Factory implements Factory<CryptoTaxLotSelectionDuxo> {
    private final Provider<CryptoTradingBottomSheetService> bottomSheetService;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoOrderContextFactory> cryptoOrderContextFactory;
    private final Provider<CryptoOrderValidatorManager> cryptoOrderValidatorManager;
    private final Provider<CryptoTaxLotSelectionValidatorProvider> cryptoTaxLotSelectionValidatorProvider;
    private final Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<EventLogger> eventLogger;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator;
    private final Provider<CryptoTaxLotSelectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTaxLotSelectionDuxo_Factory create(Provider<CryptoTradingBottomSheetService> provider, Provider<CryptoAccountProvider> provider2, Provider<CryptoExperimentsStore> provider3, Provider<CryptoOrderContextFactory> provider4, Provider<CryptoOrderValidatorManager> provider5, Provider<CryptoTaxLotSelectionValidatorProvider> provider6, Provider<RealCryptoTradeFeeEstimationService> provider7, Provider<RealCryptoTradeUserInputsService> provider8, Provider<EventLogger> provider9, Provider<ServerDrivenCryptoOrderValidator> provider10, Provider<MicrogramManager> provider11, Provider<CryptoTaxLotSelectionStateProvider> provider12, Provider<DuxoBundle> provider13, Provider<SavedStateHandle> provider14) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14);
    }

    @JvmStatic
    public static final CryptoTaxLotSelectionDuxo newInstance(CryptoTradingBottomSheetService cryptoTradingBottomSheetService, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderValidatorManager cryptoOrderValidatorManager, CryptoTaxLotSelectionValidatorProvider cryptoTaxLotSelectionValidatorProvider, RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, EventLogger eventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, MicrogramManager microgramManager, CryptoTaxLotSelectionStateProvider cryptoTaxLotSelectionStateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(cryptoTradingBottomSheetService, cryptoAccountProvider, cryptoExperimentsStore, cryptoOrderContextFactory, cryptoOrderValidatorManager, cryptoTaxLotSelectionValidatorProvider, realCryptoTradeFeeEstimationService, realCryptoTradeUserInputsService, eventLogger, serverDrivenCryptoOrderValidator, microgramManager, cryptoTaxLotSelectionStateProvider, duxoBundle, savedStateHandle);
    }

    public CryptoTaxLotSelectionDuxo_Factory(Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderValidatorManager> cryptoOrderValidatorManager, Provider<CryptoTaxLotSelectionValidatorProvider> cryptoTaxLotSelectionValidatorProvider, Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<EventLogger> eventLogger, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<MicrogramManager> microgramManager, Provider<CryptoTaxLotSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
        Intrinsics.checkNotNullParameter(cryptoOrderValidatorManager, "cryptoOrderValidatorManager");
        Intrinsics.checkNotNullParameter(cryptoTaxLotSelectionValidatorProvider, "cryptoTaxLotSelectionValidatorProvider");
        Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bottomSheetService = bottomSheetService;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOrderContextFactory = cryptoOrderContextFactory;
        this.cryptoOrderValidatorManager = cryptoOrderValidatorManager;
        this.cryptoTaxLotSelectionValidatorProvider = cryptoTaxLotSelectionValidatorProvider;
        this.cryptoTradeFeeEstimationService = cryptoTradeFeeEstimationService;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.eventLogger = eventLogger;
        this.serverDrivenCryptoOrderValidator = serverDrivenCryptoOrderValidator;
        this.microgramManager = microgramManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoTaxLotSelectionDuxo get() {
        Companion companion = INSTANCE;
        CryptoTradingBottomSheetService cryptoTradingBottomSheetService = this.bottomSheetService.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingBottomSheetService, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoOrderContextFactory cryptoOrderContextFactory = this.cryptoOrderContextFactory.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderContextFactory, "get(...)");
        CryptoOrderValidatorManager cryptoOrderValidatorManager = this.cryptoOrderValidatorManager.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderValidatorManager, "get(...)");
        CryptoTaxLotSelectionValidatorProvider cryptoTaxLotSelectionValidatorProvider = this.cryptoTaxLotSelectionValidatorProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTaxLotSelectionValidatorProvider, "get(...)");
        RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService = this.cryptoTradeFeeEstimationService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeFeeEstimationService, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator = this.serverDrivenCryptoOrderValidator.get();
        Intrinsics.checkNotNullExpressionValue(serverDrivenCryptoOrderValidator, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        CryptoTaxLotSelectionStateProvider cryptoTaxLotSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTaxLotSelectionStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(cryptoTradingBottomSheetService, cryptoAccountProvider, cryptoExperimentsStore, cryptoOrderContextFactory, cryptoOrderValidatorManager, cryptoTaxLotSelectionValidatorProvider, realCryptoTradeFeeEstimationService, realCryptoTradeUserInputsService, eventLogger, serverDrivenCryptoOrderValidator, microgramManager, cryptoTaxLotSelectionStateProvider, duxoBundle, savedStateHandle);
    }

    /* compiled from: CryptoTaxLotSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÌ\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007H\u0007Jx\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo_Factory;", "bottomSheetService", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/crypto/trading/bottomsheet/CryptoTradingBottomSheetService;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOrderContextFactory", "Lcom/robinhood/shared/trade/crypto/context/CryptoOrderContextFactory;", "cryptoOrderValidatorManager", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "cryptoTaxLotSelectionValidatorProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/validation/CryptoTaxLotSelectionValidatorProvider;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "serverDrivenCryptoOrderValidator", "Lcom/robinhood/shared/crypto/ui/trade/validator/ServerDrivenCryptoOrderValidator;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTaxLotSelectionDuxo_Factory create(Provider<CryptoTradingBottomSheetService> bottomSheetService, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOrderContextFactory> cryptoOrderContextFactory, Provider<CryptoOrderValidatorManager> cryptoOrderValidatorManager, Provider<CryptoTaxLotSelectionValidatorProvider> cryptoTaxLotSelectionValidatorProvider, Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<EventLogger> eventLogger, Provider<ServerDrivenCryptoOrderValidator> serverDrivenCryptoOrderValidator, Provider<MicrogramManager> microgramManager, Provider<CryptoTaxLotSelectionStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderValidatorManager, "cryptoOrderValidatorManager");
            Intrinsics.checkNotNullParameter(cryptoTaxLotSelectionValidatorProvider, "cryptoTaxLotSelectionValidatorProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoTaxLotSelectionDuxo_Factory(bottomSheetService, cryptoAccountProvider, cryptoExperimentsStore, cryptoOrderContextFactory, cryptoOrderValidatorManager, cryptoTaxLotSelectionValidatorProvider, cryptoTradeFeeEstimationService, cryptoTradeUserInputsService, eventLogger, serverDrivenCryptoOrderValidator, microgramManager, stateProvider, duxoBundle, savedStateHandle);
        }

        @JvmStatic
        public final CryptoTaxLotSelectionDuxo newInstance(CryptoTradingBottomSheetService bottomSheetService, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoOrderContextFactory cryptoOrderContextFactory, CryptoOrderValidatorManager cryptoOrderValidatorManager, CryptoTaxLotSelectionValidatorProvider cryptoTaxLotSelectionValidatorProvider, RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, EventLogger eventLogger, ServerDrivenCryptoOrderValidator serverDrivenCryptoOrderValidator, MicrogramManager microgramManager, CryptoTaxLotSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(bottomSheetService, "bottomSheetService");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOrderContextFactory, "cryptoOrderContextFactory");
            Intrinsics.checkNotNullParameter(cryptoOrderValidatorManager, "cryptoOrderValidatorManager");
            Intrinsics.checkNotNullParameter(cryptoTaxLotSelectionValidatorProvider, "cryptoTaxLotSelectionValidatorProvider");
            Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(serverDrivenCryptoOrderValidator, "serverDrivenCryptoOrderValidator");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoTaxLotSelectionDuxo(bottomSheetService, cryptoAccountProvider, cryptoExperimentsStore, cryptoOrderContextFactory, cryptoOrderValidatorManager, cryptoTaxLotSelectionValidatorProvider, cryptoTradeFeeEstimationService, cryptoTradeUserInputsService, eventLogger, serverDrivenCryptoOrderValidator, microgramManager, stateProvider, duxoBundle, savedStateHandle);
        }
    }
}

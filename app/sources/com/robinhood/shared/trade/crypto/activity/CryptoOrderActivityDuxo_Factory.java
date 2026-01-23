package com.robinhood.shared.trade.crypto.activity;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoAccountPreferencesStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoMessagingStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeFeeEstimationService;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderActivityDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoMessagingStore", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderActivityDuxo_Factory implements Factory<CryptoOrderActivityDuxo> {
    private final Provider<AppType> appType;
    private final Provider<Application> application;
    private final Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoMessagingStore> cryptoMessagingStore;
    private final Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<SavedStateHandle> savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderActivityDuxo_Factory create(Provider<Application> provider, Provider<AppType> provider2, Provider<DuxoBundle> provider3, Provider<SavedStateHandle> provider4, Provider<CryptoMessagingStore> provider5, Provider<CryptoExperimentsStore> provider6, Provider<CryptoAccountPreferencesStore> provider7, Provider<RealCryptoTradeFeeEstimationService> provider8, Provider<RealCryptoTradeUserInputsService> provider9, Provider<MicrogramManager> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CryptoOrderActivityDuxo newInstance(Application application, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoMessagingStore cryptoMessagingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService, MicrogramManager microgramManager) {
        return INSTANCE.newInstance(application, appType, duxoBundle, savedStateHandle, cryptoMessagingStore, cryptoExperimentsStore, cryptoAccountPreferencesStore, realCryptoTradeFeeEstimationService, realCryptoTradeUserInputsService, microgramManager);
    }

    public CryptoOrderActivityDuxo_Factory(Provider<Application> application, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoMessagingStore> cryptoMessagingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<MicrogramManager> microgramManager) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoMessagingStore, "cryptoMessagingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
        Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        this.application = application;
        this.appType = appType;
        this.duxoBundle = duxoBundle;
        this.savedStateHandle = savedStateHandle;
        this.cryptoMessagingStore = cryptoMessagingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoAccountPreferencesStore = cryptoAccountPreferencesStore;
        this.cryptoTradeFeeEstimationService = cryptoTradeFeeEstimationService;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
        this.microgramManager = microgramManager;
    }

    @Override // javax.inject.Provider
    public CryptoOrderActivityDuxo get() {
        Companion companion = INSTANCE;
        Application application = this.application.get();
        Intrinsics.checkNotNullExpressionValue(application, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoMessagingStore cryptoMessagingStore = this.cryptoMessagingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoMessagingStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoAccountPreferencesStore cryptoAccountPreferencesStore = this.cryptoAccountPreferencesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountPreferencesStore, "get(...)");
        RealCryptoTradeFeeEstimationService realCryptoTradeFeeEstimationService = this.cryptoTradeFeeEstimationService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeFeeEstimationService, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        return companion.newInstance(application, appType, duxoBundle, savedStateHandle, cryptoMessagingStore, cryptoExperimentsStore, cryptoAccountPreferencesStore, realCryptoTradeFeeEstimationService, realCryptoTradeUserInputsService, microgramManager);
    }

    /* compiled from: CryptoOrderActivityDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo_Factory;", "application", "Ljavax/inject/Provider;", "Landroid/app/Application;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoMessagingStore", "Lcom/robinhood/librobinhood/data/store/CryptoMessagingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoAccountPreferencesStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountPreferencesStore;", "cryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "newInstance", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderActivityDuxo_Factory create(Provider<Application> application, Provider<AppType> appType, Provider<DuxoBundle> duxoBundle, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoMessagingStore> cryptoMessagingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoAccountPreferencesStore> cryptoAccountPreferencesStore, Provider<RealCryptoTradeFeeEstimationService> cryptoTradeFeeEstimationService, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService, Provider<MicrogramManager> microgramManager) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoMessagingStore, "cryptoMessagingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            return new CryptoOrderActivityDuxo_Factory(application, appType, duxoBundle, savedStateHandle, cryptoMessagingStore, cryptoExperimentsStore, cryptoAccountPreferencesStore, cryptoTradeFeeEstimationService, cryptoTradeUserInputsService, microgramManager);
        }

        @JvmStatic
        public final CryptoOrderActivityDuxo newInstance(Application application, AppType appType, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, CryptoMessagingStore cryptoMessagingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoAccountPreferencesStore cryptoAccountPreferencesStore, RealCryptoTradeFeeEstimationService cryptoTradeFeeEstimationService, RealCryptoTradeUserInputsService cryptoTradeUserInputsService, MicrogramManager microgramManager) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoMessagingStore, "cryptoMessagingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountPreferencesStore, "cryptoAccountPreferencesStore");
            Intrinsics.checkNotNullParameter(cryptoTradeFeeEstimationService, "cryptoTradeFeeEstimationService");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            return new CryptoOrderActivityDuxo(application, appType, duxoBundle, savedStateHandle, cryptoMessagingStore, cryptoExperimentsStore, cryptoAccountPreferencesStore, cryptoTradeFeeEstimationService, cryptoTradeUserInputsService, microgramManager);
        }
    }
}

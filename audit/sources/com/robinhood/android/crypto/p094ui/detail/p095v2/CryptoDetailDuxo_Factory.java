package com.robinhood.android.crypto.p094ui.detail.p095v2;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoOnboardingM1Store;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.utils.moshi.LazyMoshi;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailStateProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoDetailDuxo_Factory implements Factory<CryptoDetailDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<BffCryptoTradingStore> bffCryptoTradingStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<LazyMoshi> moshi;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoDetailDuxo4> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDetailDuxo_Factory create(Provider<AuthManager> provider, Provider<DuxoBundle> provider2, Provider<CryptoDetailDuxo4> provider3, Provider<LazyMoshi> provider4, Provider<SavedStateHandle> provider5, Provider<BffCryptoTradingStore> provider6, Provider<CryptoExperimentsStore> provider7, Provider<CryptoOnboardingM1Store> provider8, Provider<RegionGateProvider> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final CryptoDetailDuxo newInstance(AuthManager authManager, DuxoBundle duxoBundle, CryptoDetailDuxo4 cryptoDetailDuxo4, LazyMoshi lazyMoshi, SavedStateHandle savedStateHandle, BffCryptoTradingStore bffCryptoTradingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, RegionGateProvider regionGateProvider) {
        return INSTANCE.newInstance(authManager, duxoBundle, cryptoDetailDuxo4, lazyMoshi, savedStateHandle, bffCryptoTradingStore, cryptoExperimentsStore, cryptoOnboardingM1Store, regionGateProvider);
    }

    public CryptoDetailDuxo_Factory(Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<CryptoDetailDuxo4> stateProvider, Provider<LazyMoshi> moshi, Provider<SavedStateHandle> savedStateHandle, Provider<BffCryptoTradingStore> bffCryptoTradingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store, Provider<RegionGateProvider> regionGateProvider) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        this.authManager = authManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.moshi = moshi;
        this.savedStateHandle = savedStateHandle;
        this.bffCryptoTradingStore = bffCryptoTradingStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoOnboardingM1Store = cryptoOnboardingM1Store;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoDetailDuxo get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoDetailDuxo4 cryptoDetailDuxo4 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailDuxo4, "get(...)");
        LazyMoshi lazyMoshi = this.moshi.get();
        Intrinsics.checkNotNullExpressionValue(lazyMoshi, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        BffCryptoTradingStore bffCryptoTradingStore = this.bffCryptoTradingStore.get();
        Intrinsics.checkNotNullExpressionValue(bffCryptoTradingStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoOnboardingM1Store cryptoOnboardingM1Store = this.cryptoOnboardingM1Store.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOnboardingM1Store, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        return companion.newInstance(authManager, duxoBundle, cryptoDetailDuxo4, lazyMoshi, savedStateHandle, bffCryptoTradingStore, cryptoExperimentsStore, cryptoOnboardingM1Store, regionGateProvider);
    }

    /* compiled from: CryptoDetailDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailStateProvider;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoOnboardingM1Store", "Lcom/robinhood/librobinhood/data/store/CryptoOnboardingM1Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDetailDuxo_Factory create(Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<CryptoDetailDuxo4> stateProvider, Provider<LazyMoshi> moshi, Provider<SavedStateHandle> savedStateHandle, Provider<BffCryptoTradingStore> bffCryptoTradingStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoOnboardingM1Store> cryptoOnboardingM1Store, Provider<RegionGateProvider> regionGateProvider) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoDetailDuxo_Factory(authManager, duxoBundle, stateProvider, moshi, savedStateHandle, bffCryptoTradingStore, cryptoExperimentsStore, cryptoOnboardingM1Store, regionGateProvider);
        }

        @JvmStatic
        public final CryptoDetailDuxo newInstance(AuthManager authManager, DuxoBundle duxoBundle, CryptoDetailDuxo4 stateProvider, LazyMoshi moshi, SavedStateHandle savedStateHandle, BffCryptoTradingStore bffCryptoTradingStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoOnboardingM1Store cryptoOnboardingM1Store, RegionGateProvider regionGateProvider) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(moshi, "moshi");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoOnboardingM1Store, "cryptoOnboardingM1Store");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            return new CryptoDetailDuxo(authManager, duxoBundle, stateProvider, moshi, savedStateHandle, bffCryptoTradingStore, cryptoExperimentsStore, cryptoOnboardingM1Store, regionGateProvider);
        }
    }
}

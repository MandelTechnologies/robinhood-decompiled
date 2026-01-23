package com.robinhood.shared.crypto.buttonBar;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.crypto.perpetuals.store.PerpetualsButtonsStore;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHomeStore;
import com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.PackagePreloader;

/* compiled from: CryptoButtonBarDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB¯\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/buttonBar/CryptoTradeBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "perpetualsButtonsStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsButtonsStore;", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoButtonBarDuxo_Factory implements Factory<CryptoButtonBarDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHomeStore> cryptoHomeStore;
    private final Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore;
    private final Provider<CryptobilityStore> cryptobilityStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PackagePreloader> packagePreloader;
    private final Provider<PerpetualsButtonsStore> perpetualsButtonsStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoTradeBarStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoButtonBarDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoTradeBarStateProvider> provider2, Provider<SavedStateHandle> provider3, Provider<AuthManager> provider4, Provider<CryptobilityStore> provider5, Provider<CryptoHomeStore> provider6, Provider<CryptoCurrencyPairAccountSwitcherStore> provider7, Provider<CryptoNonCurrencyPairAccountSwitcherStore> provider8, Provider<CryptoAccountProvider> provider9, Provider<PerpetualsButtonsStore> provider10, Provider<PackagePreloader> provider11, Provider<CryptoExperimentsStore> provider12) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    @JvmStatic
    public static final CryptoButtonBarDuxo newInstance(DuxoBundle duxoBundle, CryptoTradeBarStateProvider cryptoTradeBarStateProvider, SavedStateHandle savedStateHandle, AuthManager authManager, CryptobilityStore cryptobilityStore, CryptoHomeStore cryptoHomeStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, PerpetualsButtonsStore perpetualsButtonsStore, PackagePreloader packagePreloader, CryptoExperimentsStore cryptoExperimentsStore) {
        return INSTANCE.newInstance(duxoBundle, cryptoTradeBarStateProvider, savedStateHandle, authManager, cryptobilityStore, cryptoHomeStore, cryptoCurrencyPairAccountSwitcherStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoAccountProvider, perpetualsButtonsStore, packagePreloader, cryptoExperimentsStore);
    }

    public CryptoButtonBarDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoTradeBarStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<AuthManager> authManager, Provider<CryptobilityStore> cryptobilityStore, Provider<CryptoHomeStore> cryptoHomeStore, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<PerpetualsButtonsStore> perpetualsButtonsStore, Provider<PackagePreloader> packagePreloader, Provider<CryptoExperimentsStore> cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(perpetualsButtonsStore, "perpetualsButtonsStore");
        Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.authManager = authManager;
        this.cryptobilityStore = cryptobilityStore;
        this.cryptoHomeStore = cryptoHomeStore;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoNonCurrencyPairAccountSwitcherStore = cryptoNonCurrencyPairAccountSwitcherStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.perpetualsButtonsStore = perpetualsButtonsStore;
        this.packagePreloader = packagePreloader;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    @Override // javax.inject.Provider
    public CryptoButtonBarDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoTradeBarStateProvider cryptoTradeBarStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeBarStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        CryptobilityStore cryptobilityStore = this.cryptobilityStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptobilityStore, "get(...)");
        CryptoHomeStore cryptoHomeStore = this.cryptoHomeStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeStore, "get(...)");
        CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore = this.cryptoCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCurrencyPairAccountSwitcherStore, "get(...)");
        CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore = this.cryptoNonCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoNonCurrencyPairAccountSwitcherStore, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        PerpetualsButtonsStore perpetualsButtonsStore = this.perpetualsButtonsStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualsButtonsStore, "get(...)");
        PackagePreloader packagePreloader = this.packagePreloader.get();
        Intrinsics.checkNotNullExpressionValue(packagePreloader, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        return companion.newInstance(duxoBundle, cryptoTradeBarStateProvider, savedStateHandle, authManager, cryptobilityStore, cryptoHomeStore, cryptoCurrencyPairAccountSwitcherStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoAccountProvider, perpetualsButtonsStore, packagePreloader, cryptoExperimentsStore);
    }

    /* compiled from: CryptoButtonBarDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J°\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007H\u0007Jh\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/buttonBar/CryptoTradeBarStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoHomeStore", "Lcom/robinhood/librobinhood/data/store/CryptoHomeStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "perpetualsButtonsStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsButtonsStore;", "packagePreloader", "Lmicrogram/android/PackagePreloader;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "newInstance", "Lcom/robinhood/shared/crypto/buttonBar/CryptoButtonBarDuxo;", "lib-crypto-button-bar_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoButtonBarDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoTradeBarStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<AuthManager> authManager, Provider<CryptobilityStore> cryptobilityStore, Provider<CryptoHomeStore> cryptoHomeStore, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<PerpetualsButtonsStore> perpetualsButtonsStore, Provider<PackagePreloader> packagePreloader, Provider<CryptoExperimentsStore> cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(perpetualsButtonsStore, "perpetualsButtonsStore");
            Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            return new CryptoButtonBarDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, authManager, cryptobilityStore, cryptoHomeStore, cryptoCurrencyPairAccountSwitcherStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoAccountProvider, perpetualsButtonsStore, packagePreloader, cryptoExperimentsStore);
        }

        @JvmStatic
        public final CryptoButtonBarDuxo newInstance(DuxoBundle duxoBundle, CryptoTradeBarStateProvider stateProvider, SavedStateHandle savedStateHandle, AuthManager authManager, CryptobilityStore cryptobilityStore, CryptoHomeStore cryptoHomeStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, PerpetualsButtonsStore perpetualsButtonsStore, PackagePreloader packagePreloader, CryptoExperimentsStore cryptoExperimentsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(cryptoHomeStore, "cryptoHomeStore");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(perpetualsButtonsStore, "perpetualsButtonsStore");
            Intrinsics.checkNotNullParameter(packagePreloader, "packagePreloader");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            return new CryptoButtonBarDuxo(duxoBundle, stateProvider, savedStateHandle, authManager, cryptobilityStore, cryptoHomeStore, cryptoCurrencyPairAccountSwitcherStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoAccountProvider, perpetualsButtonsStore, packagePreloader, cryptoExperimentsStore);
        }
    }
}

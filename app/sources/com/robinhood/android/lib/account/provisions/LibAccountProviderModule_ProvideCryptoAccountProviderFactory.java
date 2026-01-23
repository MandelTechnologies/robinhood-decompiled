package com.robinhood.android.lib.account.provisions;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibAccountProviderModule_ProvideCryptoAccountProviderFactory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/account/provisions/LibAccountProviderModule_ProvideCryptoAccountProviderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-account-provider-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LibAccountProviderModule_ProvideCryptoAccountProviderFactory implements Factory<CryptoAccountProvider> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<AccountProvider> accountProvider;
    private final Provider<AppType> appType;
    private final Provider<AuthManager> authManager;
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore;
    private final Provider<StoreBundle> storeBundle;

    @JvmStatic
    public static final LibAccountProviderModule_ProvideCryptoAccountProviderFactory create(Provider<AuthManager> provider, Provider<AccountProvider> provider2, Provider<CryptoAccountStore> provider3, Provider<CryptoExperimentsStore> provider4, Provider<CryptoNonCurrencyPairAccountSwitcherStore> provider5, Provider<CryptoCurrencyPairAccountSwitcherStore> provider6, Provider<AppType> provider7, Provider<StoreBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoAccountProvider provideCryptoAccountProvider(AuthManager authManager, AccountProvider accountProvider, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, AppType appType, StoreBundle storeBundle) {
        return INSTANCE.provideCryptoAccountProvider(authManager, accountProvider, cryptoAccountStore, cryptoExperimentsStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoCurrencyPairAccountSwitcherStore, appType, storeBundle);
    }

    public LibAccountProviderModule_ProvideCryptoAccountProviderFactory(Provider<AuthManager> authManager, Provider<AccountProvider> accountProvider, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.authManager = authManager;
        this.accountProvider = accountProvider;
        this.cryptoAccountStore = cryptoAccountStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoNonCurrencyPairAccountSwitcherStore = cryptoNonCurrencyPairAccountSwitcherStore;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.appType = appType;
        this.storeBundle = storeBundle;
    }

    @Override // javax.inject.Provider
    public CryptoAccountProvider get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        AccountProvider accountProvider = this.accountProvider.get();
        Intrinsics.checkNotNullExpressionValue(accountProvider, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore = this.cryptoNonCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoNonCurrencyPairAccountSwitcherStore, "get(...)");
        CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore = this.cryptoCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCurrencyPairAccountSwitcherStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        StoreBundle storeBundle = this.storeBundle.get();
        Intrinsics.checkNotNullExpressionValue(storeBundle, "get(...)");
        return companion.provideCryptoAccountProvider(authManager, accountProvider, cryptoAccountStore, cryptoExperimentsStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoCurrencyPairAccountSwitcherStore, appType, storeBundle);
    }

    /* compiled from: LibAccountProviderModule_ProvideCryptoAccountProviderFactory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/account/provisions/LibAccountProviderModule_ProvideCryptoAccountProviderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/lib/account/provisions/LibAccountProviderModule_ProvideCryptoAccountProviderFactory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "provideCryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "lib-account-provider-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LibAccountProviderModule_ProvideCryptoAccountProviderFactory create(Provider<AuthManager> authManager, Provider<AccountProvider> accountProvider, Provider<CryptoAccountStore> cryptoAccountStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoNonCurrencyPairAccountSwitcherStore> cryptoNonCurrencyPairAccountSwitcherStore, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<AppType> appType, Provider<StoreBundle> storeBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            return new LibAccountProviderModule_ProvideCryptoAccountProviderFactory(authManager, accountProvider, cryptoAccountStore, cryptoExperimentsStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoCurrencyPairAccountSwitcherStore, appType, storeBundle);
        }

        @JvmStatic
        public final CryptoAccountProvider provideCryptoAccountProvider(AuthManager authManager, AccountProvider accountProvider, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, AppType appType, StoreBundle storeBundle) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
            Object objCheckNotNull = Preconditions.checkNotNull(LibAccountProviderModule.INSTANCE.provideCryptoAccountProvider(authManager, accountProvider, cryptoAccountStore, cryptoExperimentsStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoCurrencyPairAccountSwitcherStore, appType, storeBundle), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (CryptoAccountProvider) objCheckNotNull;
        }
    }
}

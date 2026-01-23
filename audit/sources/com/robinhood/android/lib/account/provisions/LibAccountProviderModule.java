package com.robinhood.android.lib.account.provisions;

import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.librobinhood.data.store.AccountStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.CryptoAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoNonCurrencyPairAccountSwitcherStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibAccountProviderModule.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007JH\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/account/provisions/LibAccountProviderModule;", "", "<init>", "()V", "provideAccountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountStore", "Lcom/robinhood/librobinhood/data/store/AccountStore;", "provideCryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "accountProvider", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoNonCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoNonCurrencyPairAccountSwitcherStore;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "lib-account-provider-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibAccountProviderModule {
    public static final LibAccountProviderModule INSTANCE = new LibAccountProviderModule();

    public final AccountProvider provideAccountProvider(AccountStore accountStore) {
        Intrinsics.checkNotNullParameter(accountStore, "accountStore");
        return accountStore;
    }

    private LibAccountProviderModule() {
    }

    public final CryptoAccountProvider provideCryptoAccountProvider(AuthManager authManager, AccountProvider accountProvider, CryptoAccountStore cryptoAccountStore, CryptoExperimentsStore cryptoExperimentsStore, CryptoNonCurrencyPairAccountSwitcherStore cryptoNonCurrencyPairAccountSwitcherStore, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, AppType appType, StoreBundle storeBundle) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoNonCurrencyPairAccountSwitcherStore, "cryptoNonCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        return new CryptoAccountSwitcherStore(authManager, accountProvider, cryptoAccountStore, cryptoExperimentsStore, cryptoNonCurrencyPairAccountSwitcherStore, cryptoCurrencyPairAccountSwitcherStore, appType, storeBundle);
    }
}

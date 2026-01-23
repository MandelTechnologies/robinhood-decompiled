package com.robinhood.shared.trade.crypto.p397ui.account;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeAccountSwitcherDropdownDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bf\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0017\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeAccountSwitcherDropdownDuxo_Factory implements Factory<CryptoTradeAccountSwitcherDropdownDuxo> {
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore;
    private final Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoTradeAccountSwitcherDropdownStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTradeAccountSwitcherDropdownDuxo_Factory create(Provider<CryptoAccountProvider> provider, Provider<CryptoCurrencyPairAccountSwitcherStore> provider2, Provider<EnumPreference<CryptoInputMode>> provider3, Provider<SavedStateHandle> provider4, Provider<DuxoBundle> provider5, Provider<CryptoTradeAccountSwitcherDropdownStateProvider> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoTradeAccountSwitcherDropdownDuxo newInstance(CryptoAccountProvider cryptoAccountProvider, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, EnumPreference<CryptoInputMode> enumPreference, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTradeAccountSwitcherDropdownStateProvider cryptoTradeAccountSwitcherDropdownStateProvider) {
        return INSTANCE.newInstance(cryptoAccountProvider, cryptoCurrencyPairAccountSwitcherStore, enumPreference, savedStateHandle, duxoBundle, cryptoTradeAccountSwitcherDropdownStateProvider);
    }

    public CryptoTradeAccountSwitcherDropdownDuxo_Factory(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoTradeAccountSwitcherDropdownStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoInputModePref = cryptoInputModePref;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoTradeAccountSwitcherDropdownDuxo get() {
        Companion companion = INSTANCE;
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore = this.cryptoCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCurrencyPairAccountSwitcherStore, "get(...)");
        EnumPreference<CryptoInputMode> enumPreference = this.cryptoInputModePref.get();
        Intrinsics.checkNotNullExpressionValue(enumPreference, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoTradeAccountSwitcherDropdownStateProvider cryptoTradeAccountSwitcherDropdownStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradeAccountSwitcherDropdownStateProvider, "get(...)");
        return companion.newInstance(cryptoAccountProvider, cryptoCurrencyPairAccountSwitcherStore, enumPreference, savedStateHandle, duxoBundle, cryptoTradeAccountSwitcherDropdownStateProvider);
    }

    /* compiled from: CryptoTradeAccountSwitcherDropdownDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007JC\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo_Factory;", "cryptoAccountProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoCurrencyPairAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "Lkotlin/jvm/JvmSuppressWildcards;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownStateProvider;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/account/CryptoTradeAccountSwitcherDropdownDuxo;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTradeAccountSwitcherDropdownDuxo_Factory create(Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<EnumPreference<CryptoInputMode>> cryptoInputModePref, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoTradeAccountSwitcherDropdownStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoTradeAccountSwitcherDropdownDuxo_Factory(cryptoAccountProvider, cryptoCurrencyPairAccountSwitcherStore, cryptoInputModePref, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoTradeAccountSwitcherDropdownDuxo newInstance(CryptoAccountProvider cryptoAccountProvider, CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, EnumPreference<CryptoInputMode> cryptoInputModePref, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTradeAccountSwitcherDropdownStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoInputModePref, "cryptoInputModePref");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoTradeAccountSwitcherDropdownDuxo(cryptoAccountProvider, cryptoCurrencyPairAccountSwitcherStore, cryptoInputModePref, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}

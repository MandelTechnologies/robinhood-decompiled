package com.robinhood.android.transfers.cryptocheckout;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoCurrencyPairAccountSwitcherStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodSelectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo;", "cryptoCurrencyPairAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PaymentMethodSelectionDuxo_Factory implements Factory<PaymentMethodSelectionDuxo> {
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MicrogramManager> microgramManager;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<PaymentMethodSelectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PaymentMethodSelectionDuxo_Factory create(Provider<CryptoCurrencyPairAccountSwitcherStore> provider, Provider<CryptoAccountProvider> provider2, Provider<CryptoExperimentsStore> provider3, Provider<MicrogramManager> provider4, Provider<SavedStateHandle> provider5, Provider<DuxoBundle> provider6, Provider<PaymentMethodSelectionStateProvider> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final PaymentMethodSelectionDuxo newInstance(CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, PaymentMethodSelectionStateProvider paymentMethodSelectionStateProvider) {
        return INSTANCE.newInstance(cryptoCurrencyPairAccountSwitcherStore, cryptoAccountProvider, cryptoExperimentsStore, microgramManager, savedStateHandle, duxoBundle, paymentMethodSelectionStateProvider);
    }

    public PaymentMethodSelectionDuxo_Factory(Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<PaymentMethodSelectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoCurrencyPairAccountSwitcherStore = cryptoCurrencyPairAccountSwitcherStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.microgramManager = microgramManager;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public PaymentMethodSelectionDuxo get() {
        Companion companion = INSTANCE;
        CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore = this.cryptoCurrencyPairAccountSwitcherStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCurrencyPairAccountSwitcherStore, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        PaymentMethodSelectionStateProvider paymentMethodSelectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(paymentMethodSelectionStateProvider, "get(...)");
        return companion.newInstance(cryptoCurrencyPairAccountSwitcherStore, cryptoAccountProvider, cryptoExperimentsStore, microgramManager, savedStateHandle, duxoBundle, paymentMethodSelectionStateProvider);
    }

    /* compiled from: PaymentMethodSelectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo_Factory;", "cryptoCurrencyPairAccountSwitcherStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoCurrencyPairAccountSwitcherStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionStateProvider;", "newInstance", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDuxo;", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PaymentMethodSelectionDuxo_Factory create(Provider<CryptoCurrencyPairAccountSwitcherStore> cryptoCurrencyPairAccountSwitcherStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<MicrogramManager> microgramManager, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<PaymentMethodSelectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PaymentMethodSelectionDuxo_Factory(cryptoCurrencyPairAccountSwitcherStore, cryptoAccountProvider, cryptoExperimentsStore, microgramManager, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final PaymentMethodSelectionDuxo newInstance(CryptoCurrencyPairAccountSwitcherStore cryptoCurrencyPairAccountSwitcherStore, CryptoAccountProvider cryptoAccountProvider, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, PaymentMethodSelectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoCurrencyPairAccountSwitcherStore, "cryptoCurrencyPairAccountSwitcherStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new PaymentMethodSelectionDuxo(cryptoCurrencyPairAccountSwitcherStore, cryptoAccountProvider, cryptoExperimentsStore, microgramManager, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}

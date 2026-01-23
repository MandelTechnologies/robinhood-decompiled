package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSavedAddressesListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoSavedAddressesListDuxo_Factory implements Factory<CryptoSavedAddressesListDuxo> {
    private final Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore;
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoSavedAddressesListStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoSavedAddressesListDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoSavedAddressesListStateProvider> provider2, Provider<SavedStateHandle> provider3, Provider<CryptoSavedAddressesStore> provider4, Provider<CurrencyPairV2Store> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoSavedAddressesListDuxo newInstance(DuxoBundle duxoBundle, CryptoSavedAddressesListStateProvider cryptoSavedAddressesListStateProvider, SavedStateHandle savedStateHandle, CryptoSavedAddressesStore cryptoSavedAddressesStore, CurrencyPairV2Store currencyPairV2Store) {
        return INSTANCE.newInstance(duxoBundle, cryptoSavedAddressesListStateProvider, savedStateHandle, cryptoSavedAddressesStore, currencyPairV2Store);
    }

    public CryptoSavedAddressesListDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoSavedAddressesListStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<CurrencyPairV2Store> currencyPairV2Store) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.currencyPairV2Store = currencyPairV2Store;
    }

    @Override // javax.inject.Provider
    public CryptoSavedAddressesListDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoSavedAddressesListStateProvider cryptoSavedAddressesListStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSavedAddressesListStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoSavedAddressesStore cryptoSavedAddressesStore = this.cryptoSavedAddressesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSavedAddressesStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        return companion.newInstance(duxoBundle, cryptoSavedAddressesListStateProvider, savedStateHandle, cryptoSavedAddressesStore, currencyPairV2Store);
    }

    /* compiled from: CryptoSavedAddressesListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "newInstance", "Lcom/robinhood/shared/crypto/transfer/send/address/allowlisting/CryptoSavedAddressesListDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoSavedAddressesListDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoSavedAddressesListStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<CurrencyPairV2Store> currencyPairV2Store) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            return new CryptoSavedAddressesListDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, cryptoSavedAddressesStore, currencyPairV2Store);
        }

        @JvmStatic
        public final CryptoSavedAddressesListDuxo newInstance(DuxoBundle duxoBundle, CryptoSavedAddressesListStateProvider stateProvider, SavedStateHandle savedStateHandle, CryptoSavedAddressesStore cryptoSavedAddressesStore, CurrencyPairV2Store currencyPairV2Store) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            return new CryptoSavedAddressesListDuxo(duxoBundle, stateProvider, savedStateHandle, cryptoSavedAddressesStore, currencyPairV2Store);
        }
    }
}

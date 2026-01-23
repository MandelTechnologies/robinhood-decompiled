package com.robinhood.shared.crypto.transfer.send.address.saved;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendSavedAddressDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "scanTooltipSavedAddressesShownBeforePref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendSavedAddressDuxo_Factory implements Factory<CryptoTransferSendSavedAddressDuxo> {
    private final Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore;
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<BooleanPreference> scanTooltipSavedAddressesShownBeforePref;
    private final Provider<CryptoTransferSendSavedAddressStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTransferSendSavedAddressDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<DuxoBundle> provider2, Provider<CryptoTransferSendSavedAddressStateProvider> provider3, Provider<CryptoTransfersStore> provider4, Provider<CryptoSavedAddressesStore> provider5, Provider<BooleanPreference> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoTransferSendSavedAddressDuxo newInstance(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTransferSendSavedAddressStateProvider cryptoTransferSendSavedAddressStateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(savedStateHandle, duxoBundle, cryptoTransferSendSavedAddressStateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, booleanPreference);
    }

    public CryptoTransferSendSavedAddressDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoTransferSendSavedAddressStateProvider> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<BooleanPreference> scanTooltipSavedAddressesShownBeforePref) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(scanTooltipSavedAddressesShownBeforePref, "scanTooltipSavedAddressesShownBeforePref");
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.scanTooltipSavedAddressesShownBeforePref = scanTooltipSavedAddressesShownBeforePref;
    }

    @Override // javax.inject.Provider
    public CryptoTransferSendSavedAddressDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoTransferSendSavedAddressStateProvider cryptoTransferSendSavedAddressStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferSendSavedAddressStateProvider, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        CryptoSavedAddressesStore cryptoSavedAddressesStore = this.cryptoSavedAddressesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSavedAddressesStore, "get(...)");
        BooleanPreference booleanPreference = this.scanTooltipSavedAddressesShownBeforePref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(savedStateHandle, duxoBundle, cryptoTransferSendSavedAddressStateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, booleanPreference);
    }

    /* compiled from: CryptoTransferSendSavedAddressDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "scanTooltipSavedAddressesShownBeforePref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/shared/crypto/transfer/send/address/saved/CryptoTransferSendSavedAddressDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTransferSendSavedAddressDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoTransferSendSavedAddressStateProvider> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<BooleanPreference> scanTooltipSavedAddressesShownBeforePref) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(scanTooltipSavedAddressesShownBeforePref, "scanTooltipSavedAddressesShownBeforePref");
            return new CryptoTransferSendSavedAddressDuxo_Factory(savedStateHandle, duxoBundle, stateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, scanTooltipSavedAddressesShownBeforePref);
        }

        @JvmStatic
        public final CryptoTransferSendSavedAddressDuxo newInstance(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoTransferSendSavedAddressStateProvider stateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, BooleanPreference scanTooltipSavedAddressesShownBeforePref) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(scanTooltipSavedAddressesShownBeforePref, "scanTooltipSavedAddressesShownBeforePref");
            return new CryptoTransferSendSavedAddressDuxo(savedStateHandle, duxoBundle, stateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, scanTooltipSavedAddressesShownBeforePref);
        }
    }
}

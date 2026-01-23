package com.robinhood.shared.crypto.transfer.send.address.host;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransferSendAddressHostDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "hasSeenAllowlistPrimerPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoTransferSendAddressHostDuxo_Factory implements Factory<CryptoTransferSendAddressHostDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore;
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<BooleanPreference> hasSeenAllowlistPrimerPref;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoTransferSendAddressHostStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTransferSendAddressHostDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<DuxoBundle> provider2, Provider<AppType> provider3, Provider<CryptoTransferSendAddressHostStateProvider> provider4, Provider<CryptoTransfersStore> provider5, Provider<CryptoSavedAddressesStore> provider6, Provider<CryptoExperimentsStore> provider7, Provider<BooleanPreference> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final CryptoTransferSendAddressHostDuxo newInstance(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, AppType appType, CryptoTransferSendAddressHostStateProvider cryptoTransferSendAddressHostStateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(savedStateHandle, duxoBundle, appType, cryptoTransferSendAddressHostStateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, cryptoExperimentsStore, booleanPreference);
    }

    public CryptoTransferSendAddressHostDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<AppType> appType, Provider<CryptoTransferSendAddressHostStateProvider> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> hasSeenAllowlistPrimerPref) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(hasSeenAllowlistPrimerPref, "hasSeenAllowlistPrimerPref");
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.appType = appType;
        this.stateProvider = stateProvider;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.hasSeenAllowlistPrimerPref = hasSeenAllowlistPrimerPref;
    }

    @Override // javax.inject.Provider
    public CryptoTransferSendAddressHostDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoTransferSendAddressHostStateProvider cryptoTransferSendAddressHostStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransferSendAddressHostStateProvider, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        CryptoSavedAddressesStore cryptoSavedAddressesStore = this.cryptoSavedAddressesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSavedAddressesStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        BooleanPreference booleanPreference = this.hasSeenAllowlistPrimerPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(savedStateHandle, duxoBundle, appType, cryptoTransferSendAddressHostStateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, cryptoExperimentsStore, booleanPreference);
    }

    /* compiled from: CryptoTransferSendAddressHostDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0007JH\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "stateProvider", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostStateProvider;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "hasSeenAllowlistPrimerPref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/shared/crypto/transfer/send/address/host/CryptoTransferSendAddressHostDuxo;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTransferSendAddressHostDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<AppType> appType, Provider<CryptoTransferSendAddressHostStateProvider> stateProvider, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<BooleanPreference> hasSeenAllowlistPrimerPref) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenAllowlistPrimerPref, "hasSeenAllowlistPrimerPref");
            return new CryptoTransferSendAddressHostDuxo_Factory(savedStateHandle, duxoBundle, appType, stateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, cryptoExperimentsStore, hasSeenAllowlistPrimerPref);
        }

        @JvmStatic
        public final CryptoTransferSendAddressHostDuxo newInstance(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, AppType appType, CryptoTransferSendAddressHostStateProvider stateProvider, CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, CryptoExperimentsStore cryptoExperimentsStore, BooleanPreference hasSeenAllowlistPrimerPref) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(hasSeenAllowlistPrimerPref, "hasSeenAllowlistPrimerPref");
            return new CryptoTransferSendAddressHostDuxo(savedStateHandle, duxoBundle, appType, stateProvider, cryptoTransfersStore, cryptoSavedAddressesStore, cryptoExperimentsStore, hasSeenAllowlistPrimerPref);
        }
    }
}

package com.robinhood.android.crypto.settings;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoSavedAddressesStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.shared.store.history.HistoryStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoSettingsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo;", "cryptoTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/crypto/settings/CryptoSettingsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoSettingsDuxo_Factory implements Factory<CryptoSettingsDuxo> {
    private final Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore;
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoExperimentsStore> experimentsStore;
    private final Provider<HistoryStore> historyStore;
    private final Provider<CryptoSettingsStateProvider> stateProvider;
    private final Provider<SuvWorkflowManager> suvWorkflowManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoSettingsDuxo_Factory create(Provider<CryptoTransfersStore> provider, Provider<CryptoSavedAddressesStore> provider2, Provider<HistoryStore> provider3, Provider<CryptoExperimentsStore> provider4, Provider<SuvWorkflowManager> provider5, Provider<CryptoSettingsStateProvider> provider6, Provider<DuxoBundle> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoSettingsDuxo newInstance(CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, HistoryStore historyStore, CryptoExperimentsStore cryptoExperimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoSettingsStateProvider cryptoSettingsStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoTransfersStore, cryptoSavedAddressesStore, historyStore, cryptoExperimentsStore, suvWorkflowManager, cryptoSettingsStateProvider, duxoBundle);
    }

    public CryptoSettingsDuxo_Factory(Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<HistoryStore> historyStore, Provider<CryptoExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<CryptoSettingsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
        Intrinsics.checkNotNullParameter(historyStore, "historyStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoSavedAddressesStore = cryptoSavedAddressesStore;
        this.historyStore = historyStore;
        this.experimentsStore = experimentsStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoSettingsDuxo get() {
        Companion companion = INSTANCE;
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        CryptoSavedAddressesStore cryptoSavedAddressesStore = this.cryptoSavedAddressesStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSavedAddressesStore, "get(...)");
        HistoryStore historyStore = this.historyStore.get();
        Intrinsics.checkNotNullExpressionValue(historyStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        SuvWorkflowManager suvWorkflowManager = this.suvWorkflowManager.get();
        Intrinsics.checkNotNullExpressionValue(suvWorkflowManager, "get(...)");
        CryptoSettingsStateProvider cryptoSettingsStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoSettingsStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoTransfersStore, cryptoSavedAddressesStore, historyStore, cryptoExperimentsStore, suvWorkflowManager, cryptoSettingsStateProvider, duxoBundle);
    }

    /* compiled from: CryptoSettingsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo_Factory;", "cryptoTransfersStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoSavedAddressesStore", "Lcom/robinhood/librobinhood/data/store/CryptoSavedAddressesStore;", "historyStore", "Lcom/robinhood/shared/store/history/HistoryStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "stateProvider", "Lcom/robinhood/android/crypto/settings/CryptoSettingsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/settings/CryptoSettingsDuxo;", "feature-crypto-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoSettingsDuxo_Factory create(Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoSavedAddressesStore> cryptoSavedAddressesStore, Provider<HistoryStore> historyStore, Provider<CryptoExperimentsStore> experimentsStore, Provider<SuvWorkflowManager> suvWorkflowManager, Provider<CryptoSettingsStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoSettingsDuxo_Factory(cryptoTransfersStore, cryptoSavedAddressesStore, historyStore, experimentsStore, suvWorkflowManager, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoSettingsDuxo newInstance(CryptoTransfersStore cryptoTransfersStore, CryptoSavedAddressesStore cryptoSavedAddressesStore, HistoryStore historyStore, CryptoExperimentsStore experimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoSettingsStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoSavedAddressesStore, "cryptoSavedAddressesStore");
            Intrinsics.checkNotNullParameter(historyStore, "historyStore");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoSettingsDuxo(cryptoTransfersStore, cryptoSavedAddressesStore, historyStore, experimentsStore, suvWorkflowManager, stateProvider, duxoBundle);
        }
    }
}

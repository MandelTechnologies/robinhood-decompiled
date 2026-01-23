package com.robinhood.shared.crypto.pending.section;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.crypto.perpetuals.store.PerpetualHistoryStore;
import com.robinhood.crypto.perpetuals.store.PerpetualMarginEditHistoryStore;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.librobinhood.data.store.CryptoStakingStore;
import com.robinhood.librobinhood.data.store.CryptoTransfersStore;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPendingSectionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;", "cryptoOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "perpetualsHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore;", "perpetualsMarginEditHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionStateProvider;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoPendingSectionDuxo_Factory implements Factory<CryptoPendingSectionDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoOrderStore> cryptoOrderStore;
    private final Provider<CryptoStakingStore> cryptoStakingStore;
    private final Provider<CryptoTransfersStore> cryptoTransfersStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<PerpetualHistoryStore> perpetualsHistoryStore;
    private final Provider<PerpetualMarginEditHistoryStore> perpetualsMarginEditHistoryStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoPendingSectionStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoPendingSectionDuxo_Factory create(Provider<CryptoOrderStore> provider, Provider<CryptoTransfersStore> provider2, Provider<CryptoStakingStore> provider3, Provider<PerpetualHistoryStore> provider4, Provider<PerpetualMarginEditHistoryStore> provider5, Provider<RegionGateProvider> provider6, Provider<AppType> provider7, Provider<SavedStateHandle> provider8, Provider<DuxoBundle> provider9, Provider<CryptoPendingSectionStateProvider> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CryptoPendingSectionDuxo newInstance(CryptoOrderStore cryptoOrderStore, CryptoTransfersStore cryptoTransfersStore, CryptoStakingStore cryptoStakingStore, PerpetualHistoryStore perpetualHistoryStore, PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore, RegionGateProvider regionGateProvider, AppType appType, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoPendingSectionStateProvider cryptoPendingSectionStateProvider) {
        return INSTANCE.newInstance(cryptoOrderStore, cryptoTransfersStore, cryptoStakingStore, perpetualHistoryStore, perpetualMarginEditHistoryStore, regionGateProvider, appType, savedStateHandle, duxoBundle, cryptoPendingSectionStateProvider);
    }

    public CryptoPendingSectionDuxo_Factory(Provider<CryptoOrderStore> cryptoOrderStore, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoStakingStore> cryptoStakingStore, Provider<PerpetualHistoryStore> perpetualsHistoryStore, Provider<PerpetualMarginEditHistoryStore> perpetualsMarginEditHistoryStore, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoPendingSectionStateProvider> stateProvider) {
        Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
        Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
        Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
        Intrinsics.checkNotNullParameter(perpetualsHistoryStore, "perpetualsHistoryStore");
        Intrinsics.checkNotNullParameter(perpetualsMarginEditHistoryStore, "perpetualsMarginEditHistoryStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.cryptoOrderStore = cryptoOrderStore;
        this.cryptoTransfersStore = cryptoTransfersStore;
        this.cryptoStakingStore = cryptoStakingStore;
        this.perpetualsHistoryStore = perpetualsHistoryStore;
        this.perpetualsMarginEditHistoryStore = perpetualsMarginEditHistoryStore;
        this.regionGateProvider = regionGateProvider;
        this.appType = appType;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
    }

    @Override // javax.inject.Provider
    public CryptoPendingSectionDuxo get() {
        Companion companion = INSTANCE;
        CryptoOrderStore cryptoOrderStore = this.cryptoOrderStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoOrderStore, "get(...)");
        CryptoTransfersStore cryptoTransfersStore = this.cryptoTransfersStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTransfersStore, "get(...)");
        CryptoStakingStore cryptoStakingStore = this.cryptoStakingStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStakingStore, "get(...)");
        PerpetualHistoryStore perpetualHistoryStore = this.perpetualsHistoryStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualHistoryStore, "get(...)");
        PerpetualMarginEditHistoryStore perpetualMarginEditHistoryStore = this.perpetualsMarginEditHistoryStore.get();
        Intrinsics.checkNotNullExpressionValue(perpetualMarginEditHistoryStore, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoPendingSectionStateProvider cryptoPendingSectionStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoPendingSectionStateProvider, "get(...)");
        return companion.newInstance(cryptoOrderStore, cryptoTransfersStore, cryptoStakingStore, perpetualHistoryStore, perpetualMarginEditHistoryStore, regionGateProvider, appType, savedStateHandle, duxoBundle, cryptoPendingSectionStateProvider);
    }

    /* compiled from: CryptoPendingSectionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo_Factory;", "cryptoOrderStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore;", "cryptoTransfersStore", "Lcom/robinhood/librobinhood/data/store/CryptoTransfersStore;", "cryptoStakingStore", "Lcom/robinhood/librobinhood/data/store/CryptoStakingStore;", "perpetualsHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore;", "perpetualsMarginEditHistoryStore", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsMarginEditHistoryStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionStateProvider;", "newInstance", "Lcom/robinhood/shared/crypto/pending/section/CryptoPendingSectionDuxo;", "lib-pending-section_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoPendingSectionDuxo_Factory create(Provider<CryptoOrderStore> cryptoOrderStore, Provider<CryptoTransfersStore> cryptoTransfersStore, Provider<CryptoStakingStore> cryptoStakingStore, Provider<PerpetualHistoryStore> perpetualsHistoryStore, Provider<PerpetualMarginEditHistoryStore> perpetualsMarginEditHistoryStore, Provider<RegionGateProvider> regionGateProvider, Provider<AppType> appType, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoPendingSectionStateProvider> stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(perpetualsHistoryStore, "perpetualsHistoryStore");
            Intrinsics.checkNotNullParameter(perpetualsMarginEditHistoryStore, "perpetualsMarginEditHistoryStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoPendingSectionDuxo_Factory(cryptoOrderStore, cryptoTransfersStore, cryptoStakingStore, perpetualsHistoryStore, perpetualsMarginEditHistoryStore, regionGateProvider, appType, savedStateHandle, duxoBundle, stateProvider);
        }

        @JvmStatic
        public final CryptoPendingSectionDuxo newInstance(CryptoOrderStore cryptoOrderStore, CryptoTransfersStore cryptoTransfersStore, CryptoStakingStore cryptoStakingStore, PerpetualHistoryStore perpetualsHistoryStore, PerpetualMarginEditHistoryStore perpetualsMarginEditHistoryStore, RegionGateProvider regionGateProvider, AppType appType, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoPendingSectionStateProvider stateProvider) {
            Intrinsics.checkNotNullParameter(cryptoOrderStore, "cryptoOrderStore");
            Intrinsics.checkNotNullParameter(cryptoTransfersStore, "cryptoTransfersStore");
            Intrinsics.checkNotNullParameter(cryptoStakingStore, "cryptoStakingStore");
            Intrinsics.checkNotNullParameter(perpetualsHistoryStore, "perpetualsHistoryStore");
            Intrinsics.checkNotNullParameter(perpetualsMarginEditHistoryStore, "perpetualsMarginEditHistoryStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            return new CryptoPendingSectionDuxo(cryptoOrderStore, cryptoTransfersStore, cryptoStakingStore, perpetualsHistoryStore, perpetualsMarginEditHistoryStore, regionGateProvider, appType, savedStateHandle, duxoBundle, stateProvider);
        }
    }
}

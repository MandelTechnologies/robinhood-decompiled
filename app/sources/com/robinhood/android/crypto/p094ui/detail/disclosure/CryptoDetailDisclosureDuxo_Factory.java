package com.robinhood.android.crypto.p094ui.detail.disclosure;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailDisclosureDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0093\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoDetailDisclosureDuxo_Factory implements Factory<CryptoDetailDisclosureDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptobilityStore> cryptobilityStore;
    private final Provider<CurrencyPairV2Store> currencyPairV2Store;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoDetailDisclosureDuxo2> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDetailDisclosureDuxo_Factory create(Provider<SavedStateHandle> provider, Provider<ExperimentsStore> provider2, Provider<CurrencyPairV2Store> provider3, Provider<CryptoExperimentsStore> provider4, Provider<CryptobilityStore> provider5, Provider<StaticContentStore> provider6, Provider<AppType> provider7, Provider<RegionGateProvider> provider8, Provider<CryptoDetailDisclosureDuxo2> provider9, Provider<DuxoBundle> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final CryptoDetailDisclosureDuxo newInstance(SavedStateHandle savedStateHandle, ExperimentsStore experimentsStore, CurrencyPairV2Store currencyPairV2Store, CryptoExperimentsStore cryptoExperimentsStore, CryptobilityStore cryptobilityStore, StaticContentStore staticContentStore, AppType appType, RegionGateProvider regionGateProvider, CryptoDetailDisclosureDuxo2 cryptoDetailDisclosureDuxo2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(savedStateHandle, experimentsStore, currencyPairV2Store, cryptoExperimentsStore, cryptobilityStore, staticContentStore, appType, regionGateProvider, cryptoDetailDisclosureDuxo2, duxoBundle);
    }

    public CryptoDetailDisclosureDuxo_Factory(Provider<SavedStateHandle> savedStateHandle, Provider<ExperimentsStore> experimentsStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptobilityStore> cryptobilityStore, Provider<StaticContentStore> staticContentStore, Provider<AppType> appType, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoDetailDisclosureDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.experimentsStore = experimentsStore;
        this.currencyPairV2Store = currencyPairV2Store;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptobilityStore = cryptobilityStore;
        this.staticContentStore = staticContentStore;
        this.appType = appType;
        this.regionGateProvider = regionGateProvider;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoDetailDisclosureDuxo get() {
        Companion companion = INSTANCE;
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairV2Store.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptobilityStore cryptobilityStore = this.cryptobilityStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptobilityStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        CryptoDetailDisclosureDuxo2 cryptoDetailDisclosureDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDetailDisclosureDuxo2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(savedStateHandle, experimentsStore, currencyPairV2Store, cryptoExperimentsStore, cryptobilityStore, staticContentStore, appType, regionGateProvider, cryptoDetailDisclosureDuxo2, duxoBundle);
    }

    /* compiled from: CryptoDetailDisclosureDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0094\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0007JX\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo_Factory;", "savedStateHandle", "Ljavax/inject/Provider;", "Landroidx/lifecycle/SavedStateHandle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "currencyPairV2Store", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDetailDisclosureDuxo_Factory create(Provider<SavedStateHandle> savedStateHandle, Provider<ExperimentsStore> experimentsStore, Provider<CurrencyPairV2Store> currencyPairV2Store, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptobilityStore> cryptobilityStore, Provider<StaticContentStore> staticContentStore, Provider<AppType> appType, Provider<RegionGateProvider> regionGateProvider, Provider<CryptoDetailDisclosureDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoDetailDisclosureDuxo_Factory(savedStateHandle, experimentsStore, currencyPairV2Store, cryptoExperimentsStore, cryptobilityStore, staticContentStore, appType, regionGateProvider, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoDetailDisclosureDuxo newInstance(SavedStateHandle savedStateHandle, ExperimentsStore experimentsStore, CurrencyPairV2Store currencyPairV2Store, CryptoExperimentsStore cryptoExperimentsStore, CryptobilityStore cryptobilityStore, StaticContentStore staticContentStore, AppType appType, RegionGateProvider regionGateProvider, CryptoDetailDisclosureDuxo2 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(currencyPairV2Store, "currencyPairV2Store");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoDetailDisclosureDuxo(savedStateHandle, experimentsStore, currencyPairV2Store, cryptoExperimentsStore, cryptobilityStore, staticContentStore, appType, regionGateProvider, stateProvider, duxoBundle);
        }
    }
}

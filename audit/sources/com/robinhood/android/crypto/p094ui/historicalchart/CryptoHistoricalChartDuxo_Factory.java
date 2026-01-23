package com.robinhood.android.crypto.p094ui.historicalchart;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptoHistoricalChartStore;
import com.robinhood.librobinhood.data.store.CryptoRewardsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHistoricalChartDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0085\u0001\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoRewardsStore", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoHistoricalChartDuxo_Factory implements Factory<CryptoHistoricalChartDuxo> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore;
    private final Provider<CryptoRewardsStore> cryptoRewardsStore;
    private final Provider<CurrencyPairV2Store> currencyPairStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<RegionGateProvider> regionGateProvider;
    private final Provider<BooleanPreference> showCandlestickChartPref;
    private final Provider<CryptoHistoricalChartStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHistoricalChartDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoHistoricalChartStateProvider> provider2, Provider<AppType> provider3, Provider<CryptoExperimentsStore> provider4, Provider<CryptoHistoricalChartStore> provider5, Provider<CryptoRewardsStore> provider6, Provider<CurrencyPairV2Store> provider7, Provider<RegionGateProvider> provider8, Provider<BooleanPreference> provider9) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9);
    }

    @JvmStatic
    public static final CryptoHistoricalChartDuxo newInstance(DuxoBundle duxoBundle, CryptoHistoricalChartStateProvider cryptoHistoricalChartStateProvider, AppType appType, CryptoExperimentsStore cryptoExperimentsStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoRewardsStore cryptoRewardsStore, CurrencyPairV2Store currencyPairV2Store, RegionGateProvider regionGateProvider, BooleanPreference booleanPreference) {
        return INSTANCE.newInstance(duxoBundle, cryptoHistoricalChartStateProvider, appType, cryptoExperimentsStore, cryptoHistoricalChartStore, cryptoRewardsStore, currencyPairV2Store, regionGateProvider, booleanPreference);
    }

    public CryptoHistoricalChartDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoHistoricalChartStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore, Provider<CryptoRewardsStore> cryptoRewardsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showCandlestickChartPref) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
        Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
        Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.cryptoHistoricalChartStore = cryptoHistoricalChartStore;
        this.cryptoRewardsStore = cryptoRewardsStore;
        this.currencyPairStore = currencyPairStore;
        this.regionGateProvider = regionGateProvider;
        this.showCandlestickChartPref = showCandlestickChartPref;
    }

    @Override // javax.inject.Provider
    public CryptoHistoricalChartDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoHistoricalChartStateProvider cryptoHistoricalChartStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalChartStateProvider, "get(...)");
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoHistoricalChartStore cryptoHistoricalChartStore = this.cryptoHistoricalChartStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHistoricalChartStore, "get(...)");
        CryptoRewardsStore cryptoRewardsStore = this.cryptoRewardsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoRewardsStore, "get(...)");
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore.get();
        Intrinsics.checkNotNullExpressionValue(currencyPairV2Store, "get(...)");
        RegionGateProvider regionGateProvider = this.regionGateProvider.get();
        Intrinsics.checkNotNullExpressionValue(regionGateProvider, "get(...)");
        BooleanPreference booleanPreference = this.showCandlestickChartPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        return companion.newInstance(duxoBundle, cryptoHistoricalChartStateProvider, appType, cryptoExperimentsStore, cryptoHistoricalChartStore, cryptoRewardsStore, currencyPairV2Store, regionGateProvider, booleanPreference);
    }

    /* compiled from: CryptoHistoricalChartDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0086\u0001\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007H\u0007JP\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartStateProvider;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoHistoricalChartStore", "Lcom/robinhood/librobinhood/data/store/CryptoHistoricalChartStore;", "cryptoRewardsStore", "Lcom/robinhood/librobinhood/data/store/CryptoRewardsStore;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "showCandlestickChartPref", "Lcom/robinhood/prefs/BooleanPreference;", "newInstance", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHistoricalChartDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoHistoricalChartStateProvider> stateProvider, Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHistoricalChartStore> cryptoHistoricalChartStore, Provider<CryptoRewardsStore> cryptoRewardsStore, Provider<CurrencyPairV2Store> currencyPairStore, Provider<RegionGateProvider> regionGateProvider, Provider<BooleanPreference> showCandlestickChartPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
            Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            return new CryptoHistoricalChartDuxo_Factory(duxoBundle, stateProvider, appType, cryptoExperimentsStore, cryptoHistoricalChartStore, cryptoRewardsStore, currencyPairStore, regionGateProvider, showCandlestickChartPref);
        }

        @JvmStatic
        public final CryptoHistoricalChartDuxo newInstance(DuxoBundle duxoBundle, CryptoHistoricalChartStateProvider stateProvider, AppType appType, CryptoExperimentsStore cryptoExperimentsStore, CryptoHistoricalChartStore cryptoHistoricalChartStore, CryptoRewardsStore cryptoRewardsStore, CurrencyPairV2Store currencyPairStore, RegionGateProvider regionGateProvider, BooleanPreference showCandlestickChartPref) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(cryptoHistoricalChartStore, "cryptoHistoricalChartStore");
            Intrinsics.checkNotNullParameter(cryptoRewardsStore, "cryptoRewardsStore");
            Intrinsics.checkNotNullParameter(currencyPairStore, "currencyPairStore");
            Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
            Intrinsics.checkNotNullParameter(showCandlestickChartPref, "showCandlestickChartPref");
            return new CryptoHistoricalChartDuxo(duxoBundle, stateProvider, appType, cryptoExperimentsStore, cryptoHistoricalChartStore, cryptoRewardsStore, currencyPairStore, regionGateProvider, showCandlestickChartPref);
        }
    }
}

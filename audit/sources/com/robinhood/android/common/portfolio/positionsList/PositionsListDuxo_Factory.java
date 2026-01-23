package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsDisplayOptionsStore;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.prefs.BooleanPreference;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsListDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016Bw\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;", "positionsDisplayOptionsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "futuresAssetHomeOpenedPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasOpenedEcHubPref", "stateProvider", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class PositionsListDuxo_Factory implements Factory<PositionsListDuxo> {
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<ExperimentsStore> experimentsStore;
    private final Provider<BooleanPreference> futuresAssetHomeOpenedPref;
    private final Provider<BooleanPreference> hasOpenedEcHubPref;
    private final Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore;
    private final Provider<PositionsV2Store> positionsV2Store;
    private final Provider<PositionsListStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final PositionsListDuxo_Factory create(Provider<PositionsDisplayOptionsStore> provider, Provider<PositionsV2Store> provider2, Provider<ExperimentsStore> provider3, Provider<CryptoAccountProvider> provider4, Provider<BooleanPreference> provider5, Provider<BooleanPreference> provider6, Provider<PositionsListStateProvider> provider7, Provider<DuxoBundle> provider8) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    @JvmStatic
    public static final PositionsListDuxo newInstance(PositionsDisplayOptionsStore positionsDisplayOptionsStore, PositionsV2Store positionsV2Store, ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, BooleanPreference booleanPreference, BooleanPreference booleanPreference2, PositionsListStateProvider positionsListStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(positionsDisplayOptionsStore, positionsV2Store, experimentsStore, cryptoAccountProvider, booleanPreference, booleanPreference2, positionsListStateProvider, duxoBundle);
    }

    public PositionsListDuxo_Factory(Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore, Provider<PositionsV2Store> positionsV2Store, Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<BooleanPreference> futuresAssetHomeOpenedPref, Provider<BooleanPreference> hasOpenedEcHubPref, Provider<PositionsListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
        Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(futuresAssetHomeOpenedPref, "futuresAssetHomeOpenedPref");
        Intrinsics.checkNotNullParameter(hasOpenedEcHubPref, "hasOpenedEcHubPref");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.positionsDisplayOptionsStore = positionsDisplayOptionsStore;
        this.positionsV2Store = positionsV2Store;
        this.experimentsStore = experimentsStore;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.futuresAssetHomeOpenedPref = futuresAssetHomeOpenedPref;
        this.hasOpenedEcHubPref = hasOpenedEcHubPref;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public PositionsListDuxo get() {
        Companion companion = INSTANCE;
        PositionsDisplayOptionsStore positionsDisplayOptionsStore = this.positionsDisplayOptionsStore.get();
        Intrinsics.checkNotNullExpressionValue(positionsDisplayOptionsStore, "get(...)");
        PositionsV2Store positionsV2Store = this.positionsV2Store.get();
        Intrinsics.checkNotNullExpressionValue(positionsV2Store, "get(...)");
        ExperimentsStore experimentsStore = this.experimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(experimentsStore, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        BooleanPreference booleanPreference = this.futuresAssetHomeOpenedPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference, "get(...)");
        BooleanPreference booleanPreference2 = this.hasOpenedEcHubPref.get();
        Intrinsics.checkNotNullExpressionValue(booleanPreference2, "get(...)");
        PositionsListStateProvider positionsListStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(positionsListStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(positionsDisplayOptionsStore, positionsV2Store, experimentsStore, cryptoAccountProvider, booleanPreference, booleanPreference2, positionsListStateProvider, duxoBundle);
    }

    /* compiled from: PositionsListDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jx\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007H\u0007JH\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo_Factory;", "positionsDisplayOptionsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsDisplayOptionsStore;", "positionsV2Store", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "futuresAssetHomeOpenedPref", "Lcom/robinhood/prefs/BooleanPreference;", "hasOpenedEcHubPref", "stateProvider", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListDuxo;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionsListDuxo_Factory create(Provider<PositionsDisplayOptionsStore> positionsDisplayOptionsStore, Provider<PositionsV2Store> positionsV2Store, Provider<ExperimentsStore> experimentsStore, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<BooleanPreference> futuresAssetHomeOpenedPref, Provider<BooleanPreference> hasOpenedEcHubPref, Provider<PositionsListStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(futuresAssetHomeOpenedPref, "futuresAssetHomeOpenedPref");
            Intrinsics.checkNotNullParameter(hasOpenedEcHubPref, "hasOpenedEcHubPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PositionsListDuxo_Factory(positionsDisplayOptionsStore, positionsV2Store, experimentsStore, cryptoAccountProvider, futuresAssetHomeOpenedPref, hasOpenedEcHubPref, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final PositionsListDuxo newInstance(PositionsDisplayOptionsStore positionsDisplayOptionsStore, PositionsV2Store positionsV2Store, ExperimentsStore experimentsStore, CryptoAccountProvider cryptoAccountProvider, BooleanPreference futuresAssetHomeOpenedPref, BooleanPreference hasOpenedEcHubPref, PositionsListStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(positionsDisplayOptionsStore, "positionsDisplayOptionsStore");
            Intrinsics.checkNotNullParameter(positionsV2Store, "positionsV2Store");
            Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(futuresAssetHomeOpenedPref, "futuresAssetHomeOpenedPref");
            Intrinsics.checkNotNullParameter(hasOpenedEcHubPref, "hasOpenedEcHubPref");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new PositionsListDuxo(positionsDisplayOptionsStore, positionsV2Store, experimentsStore, cryptoAccountProvider, futuresAssetHomeOpenedPref, hasOpenedEcHubPref, stateProvider, duxoBundle);
        }
    }
}

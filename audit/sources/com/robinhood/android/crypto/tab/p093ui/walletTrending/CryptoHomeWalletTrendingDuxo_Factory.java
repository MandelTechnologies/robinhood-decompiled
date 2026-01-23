package com.robinhood.android.crypto.tab.p093ui.walletTrending;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExploreCategoryStore;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeWalletTrendingDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo;", "cryptoTradingOptionsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "cryptoExploreCategoryStore", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeWalletTrendingDuxo_Factory implements Factory<CryptoHomeWalletTrendingDuxo> {
    private final Provider<CryptoExploreCategoryStore> cryptoExploreCategoryStore;
    private final Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoHomeWalletTrendingStateProvider> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeWalletTrendingDuxo_Factory create(Provider<CryptoTradingOptionsStore> provider, Provider<CryptoExploreCategoryStore> provider2, Provider<CryptoHomeWalletTrendingStateProvider> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoHomeWalletTrendingDuxo newInstance(CryptoTradingOptionsStore cryptoTradingOptionsStore, CryptoExploreCategoryStore cryptoExploreCategoryStore, CryptoHomeWalletTrendingStateProvider cryptoHomeWalletTrendingStateProvider, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoTradingOptionsStore, cryptoExploreCategoryStore, cryptoHomeWalletTrendingStateProvider, duxoBundle);
    }

    public CryptoHomeWalletTrendingDuxo_Factory(Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore, Provider<CryptoExploreCategoryStore> cryptoExploreCategoryStore, Provider<CryptoHomeWalletTrendingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        Intrinsics.checkNotNullParameter(cryptoExploreCategoryStore, "cryptoExploreCategoryStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
        this.cryptoExploreCategoryStore = cryptoExploreCategoryStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoHomeWalletTrendingDuxo get() {
        Companion companion = INSTANCE;
        CryptoTradingOptionsStore cryptoTradingOptionsStore = this.cryptoTradingOptionsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingOptionsStore, "get(...)");
        CryptoExploreCategoryStore cryptoExploreCategoryStore = this.cryptoExploreCategoryStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExploreCategoryStore, "get(...)");
        CryptoHomeWalletTrendingStateProvider cryptoHomeWalletTrendingStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeWalletTrendingStateProvider, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoTradingOptionsStore, cryptoExploreCategoryStore, cryptoHomeWalletTrendingStateProvider, duxoBundle);
    }

    /* compiled from: CryptoHomeWalletTrendingDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo_Factory;", "cryptoTradingOptionsStore", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "cryptoExploreCategoryStore", "Lcom/robinhood/librobinhood/data/store/CryptoExploreCategoryStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/walletTrending/CryptoHomeWalletTrendingDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeWalletTrendingDuxo_Factory create(Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore, Provider<CryptoExploreCategoryStore> cryptoExploreCategoryStore, Provider<CryptoHomeWalletTrendingStateProvider> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
            Intrinsics.checkNotNullParameter(cryptoExploreCategoryStore, "cryptoExploreCategoryStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeWalletTrendingDuxo_Factory(cryptoTradingOptionsStore, cryptoExploreCategoryStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoHomeWalletTrendingDuxo newInstance(CryptoTradingOptionsStore cryptoTradingOptionsStore, CryptoExploreCategoryStore cryptoExploreCategoryStore, CryptoHomeWalletTrendingStateProvider stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
            Intrinsics.checkNotNullParameter(cryptoExploreCategoryStore, "cryptoExploreCategoryStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeWalletTrendingDuxo(cryptoTradingOptionsStore, cryptoExploreCategoryStore, stateProvider, duxoBundle);
        }
    }
}

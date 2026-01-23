package com.robinhood.android.crypto.tab.p093ui.lists;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.BffCryptoTradingStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeWatchlistTitleDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleStateProvider;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeWatchlistTitleDuxo_Factory implements Factory<CryptoHomeWatchlistTitleDuxo> {
    private final Provider<BffCryptoTradingStore> bffCryptoTradingStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoHomeWatchlistTitleDuxo3> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeWatchlistTitleDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoHomeWatchlistTitleDuxo3> provider2, Provider<BffCryptoTradingStore> provider3, Provider<StaticContentStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoHomeWatchlistTitleDuxo newInstance(DuxoBundle duxoBundle, CryptoHomeWatchlistTitleDuxo3 cryptoHomeWatchlistTitleDuxo3, BffCryptoTradingStore bffCryptoTradingStore, StaticContentStore staticContentStore) {
        return INSTANCE.newInstance(duxoBundle, cryptoHomeWatchlistTitleDuxo3, bffCryptoTradingStore, staticContentStore);
    }

    public CryptoHomeWatchlistTitleDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeWatchlistTitleDuxo3> stateProvider, Provider<BffCryptoTradingStore> bffCryptoTradingStore, Provider<StaticContentStore> staticContentStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.bffCryptoTradingStore = bffCryptoTradingStore;
        this.staticContentStore = staticContentStore;
    }

    @Override // javax.inject.Provider
    public CryptoHomeWatchlistTitleDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoHomeWatchlistTitleDuxo3 cryptoHomeWatchlistTitleDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeWatchlistTitleDuxo3, "get(...)");
        BffCryptoTradingStore bffCryptoTradingStore = this.bffCryptoTradingStore.get();
        Intrinsics.checkNotNullExpressionValue(bffCryptoTradingStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        return companion.newInstance(duxoBundle, cryptoHomeWatchlistTitleDuxo3, bffCryptoTradingStore, staticContentStore);
    }

    /* compiled from: CryptoHomeWatchlistTitleDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleStateProvider;", "bffCryptoTradingStore", "Lcom/robinhood/librobinhood/data/store/BffCryptoTradingStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/lists/CryptoHomeWatchlistTitleDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeWatchlistTitleDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoHomeWatchlistTitleDuxo3> stateProvider, Provider<BffCryptoTradingStore> bffCryptoTradingStore, Provider<StaticContentStore> staticContentStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            return new CryptoHomeWatchlistTitleDuxo_Factory(duxoBundle, stateProvider, bffCryptoTradingStore, staticContentStore);
        }

        @JvmStatic
        public final CryptoHomeWatchlistTitleDuxo newInstance(DuxoBundle duxoBundle, CryptoHomeWatchlistTitleDuxo3 stateProvider, BffCryptoTradingStore bffCryptoTradingStore, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(bffCryptoTradingStore, "bffCryptoTradingStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            return new CryptoHomeWatchlistTitleDuxo(duxoBundle, stateProvider, bffCryptoTradingStore, staticContentStore);
        }
    }
}

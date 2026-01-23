package com.robinhood.android.crypto.p094ui.detail.description;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoDescriptionStore;
import com.robinhood.librobinhood.data.store.MarketDataProxyStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDescriptionDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoDescriptionDuxo_Factory implements Factory<CryptoDescriptionDuxo> {
    private final Provider<CryptoDescriptionStore> cryptoDescriptionStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<MarketDataProxyStore> marketDataProxyStore;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoDescriptionDataState2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDescriptionDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoDescriptionDataState2> provider2, Provider<SavedStateHandle> provider3, Provider<CryptoDescriptionStore> provider4, Provider<MarketDataProxyStore> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoDescriptionDuxo newInstance(DuxoBundle duxoBundle, CryptoDescriptionDataState2 cryptoDescriptionDataState2, SavedStateHandle savedStateHandle, CryptoDescriptionStore cryptoDescriptionStore, MarketDataProxyStore marketDataProxyStore) {
        return INSTANCE.newInstance(duxoBundle, cryptoDescriptionDataState2, savedStateHandle, cryptoDescriptionStore, marketDataProxyStore);
    }

    public CryptoDescriptionDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoDescriptionDataState2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoDescriptionStore> cryptoDescriptionStore, Provider<MarketDataProxyStore> marketDataProxyStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
        Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.cryptoDescriptionStore = cryptoDescriptionStore;
        this.marketDataProxyStore = marketDataProxyStore;
    }

    @Override // javax.inject.Provider
    public CryptoDescriptionDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoDescriptionDataState2 cryptoDescriptionDataState2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDescriptionDataState2, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        CryptoDescriptionStore cryptoDescriptionStore = this.cryptoDescriptionStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDescriptionStore, "get(...)");
        MarketDataProxyStore marketDataProxyStore = this.marketDataProxyStore.get();
        Intrinsics.checkNotNullExpressionValue(marketDataProxyStore, "get(...)");
        return companion.newInstance(duxoBundle, cryptoDescriptionDataState2, savedStateHandle, cryptoDescriptionStore, marketDataProxyStore);
    }

    /* compiled from: CryptoDescriptionDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "cryptoDescriptionStore", "Lcom/robinhood/librobinhood/data/store/CryptoDescriptionStore;", "marketDataProxyStore", "Lcom/robinhood/librobinhood/data/store/MarketDataProxyStore;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/description/CryptoDescriptionDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDescriptionDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoDescriptionDataState2> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<CryptoDescriptionStore> cryptoDescriptionStore, Provider<MarketDataProxyStore> marketDataProxyStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            return new CryptoDescriptionDuxo_Factory(duxoBundle, stateProvider, savedStateHandle, cryptoDescriptionStore, marketDataProxyStore);
        }

        @JvmStatic
        public final CryptoDescriptionDuxo newInstance(DuxoBundle duxoBundle, CryptoDescriptionDataState2 stateProvider, SavedStateHandle savedStateHandle, CryptoDescriptionStore cryptoDescriptionStore, MarketDataProxyStore marketDataProxyStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(cryptoDescriptionStore, "cryptoDescriptionStore");
            Intrinsics.checkNotNullParameter(marketDataProxyStore, "marketDataProxyStore");
            return new CryptoDescriptionDuxo(duxoBundle, stateProvider, savedStateHandle, cryptoDescriptionStore, marketDataProxyStore);
        }
    }
}

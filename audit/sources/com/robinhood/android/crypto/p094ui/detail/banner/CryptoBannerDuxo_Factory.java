package com.robinhood.android.crypto.p094ui.detail.banner;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CryptobilityStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBannerDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B[\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerStateProvider;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoBannerDuxo_Factory implements Factory<CryptoBannerDuxo> {
    private final Provider<CryptoAccountProvider> cryptoAccountProvider;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptobilityStore> cryptobilityStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoBannerDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoBannerDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoBannerDuxo3> provider2, Provider<CryptoAccountProvider> provider3, Provider<CryptobilityStore> provider4, Provider<CryptoExperimentsStore> provider5, Provider<SavedStateHandle> provider6) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6);
    }

    @JvmStatic
    public static final CryptoBannerDuxo newInstance(DuxoBundle duxoBundle, CryptoBannerDuxo3 cryptoBannerDuxo3, CryptoAccountProvider cryptoAccountProvider, CryptobilityStore cryptobilityStore, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
        return INSTANCE.newInstance(duxoBundle, cryptoBannerDuxo3, cryptoAccountProvider, cryptobilityStore, cryptoExperimentsStore, savedStateHandle);
    }

    public CryptoBannerDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoBannerDuxo3> stateProvider, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptobilityStore> cryptobilityStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<SavedStateHandle> savedStateHandle) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
        Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.cryptoAccountProvider = cryptoAccountProvider;
        this.cryptobilityStore = cryptobilityStore;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // javax.inject.Provider
    public CryptoBannerDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoBannerDuxo3 cryptoBannerDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoBannerDuxo3, "get(...)");
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountProvider, "get(...)");
        CryptobilityStore cryptobilityStore = this.cryptobilityStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptobilityStore, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        return companion.newInstance(duxoBundle, cryptoBannerDuxo3, cryptoAccountProvider, cryptobilityStore, cryptoExperimentsStore, savedStateHandle);
    }

    /* compiled from: CryptoBannerDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007H\u0007J8\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerStateProvider;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptobilityStore", "Lcom/robinhood/librobinhood/data/store/CryptobilityStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoBannerDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoBannerDuxo3> stateProvider, Provider<CryptoAccountProvider> cryptoAccountProvider, Provider<CryptobilityStore> cryptobilityStore, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<SavedStateHandle> savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoBannerDuxo_Factory(duxoBundle, stateProvider, cryptoAccountProvider, cryptobilityStore, cryptoExperimentsStore, savedStateHandle);
        }

        @JvmStatic
        public final CryptoBannerDuxo newInstance(DuxoBundle duxoBundle, CryptoBannerDuxo3 stateProvider, CryptoAccountProvider cryptoAccountProvider, CryptobilityStore cryptobilityStore, CryptoExperimentsStore cryptoExperimentsStore, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoAccountProvider, "cryptoAccountProvider");
            Intrinsics.checkNotNullParameter(cryptobilityStore, "cryptobilityStore");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new CryptoBannerDuxo(duxoBundle, stateProvider, cryptoAccountProvider, cryptobilityStore, cryptoExperimentsStore, savedStateHandle);
        }
    }
}

package com.robinhood.android.crypto.costbasis.hub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisHubDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015Bi\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;", "localizedDateTimeFormatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoCostBasisStore", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubDuxo_Factory implements Factory<CryptoCostBasisHubDuxo> {
    private final Provider<CryptoAccountStore> cryptoAccountStore;
    private final Provider<CryptoCostBasisStore> cryptoCostBasisStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter;
    private final Provider<SavedStateHandle> savedStateHandle;
    private final Provider<CryptoCostBasisHubStateProvider> stateProvider;
    private final Provider<StaticContentStore> staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoCostBasisHubDuxo_Factory create(Provider<LocalizedDateTimeFormatter> provider, Provider<CryptoCostBasisHubStateProvider> provider2, Provider<SavedStateHandle> provider3, Provider<DuxoBundle> provider4, Provider<CryptoCostBasisStore> provider5, Provider<CryptoAccountStore> provider6, Provider<StaticContentStore> provider7) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    @JvmStatic
    public static final CryptoCostBasisHubDuxo newInstance(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubStateProvider cryptoCostBasisHubStateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisStore cryptoCostBasisStore, CryptoAccountStore cryptoAccountStore, StaticContentStore staticContentStore) {
        return INSTANCE.newInstance(localizedDateTimeFormatter, cryptoCostBasisHubStateProvider, savedStateHandle, duxoBundle, cryptoCostBasisStore, cryptoAccountStore, staticContentStore);
    }

    public CryptoCostBasisHubDuxo_Factory(Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<CryptoCostBasisHubStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoCostBasisStore> cryptoCostBasisStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<StaticContentStore> staticContentStore) {
        Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.stateProvider = stateProvider;
        this.savedStateHandle = savedStateHandle;
        this.duxoBundle = duxoBundle;
        this.cryptoCostBasisStore = cryptoCostBasisStore;
        this.cryptoAccountStore = cryptoAccountStore;
        this.staticContentStore = staticContentStore;
    }

    @Override // javax.inject.Provider
    public CryptoCostBasisHubDuxo get() {
        Companion companion = INSTANCE;
        LocalizedDateTimeFormatter localizedDateTimeFormatter = this.localizedDateTimeFormatter.get();
        Intrinsics.checkNotNullExpressionValue(localizedDateTimeFormatter, "get(...)");
        CryptoCostBasisHubStateProvider cryptoCostBasisHubStateProvider = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCostBasisHubStateProvider, "get(...)");
        SavedStateHandle savedStateHandle = this.savedStateHandle.get();
        Intrinsics.checkNotNullExpressionValue(savedStateHandle, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoCostBasisStore cryptoCostBasisStore = this.cryptoCostBasisStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoCostBasisStore, "get(...)");
        CryptoAccountStore cryptoAccountStore = this.cryptoAccountStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoAccountStore, "get(...)");
        StaticContentStore staticContentStore = this.staticContentStore.get();
        Intrinsics.checkNotNullExpressionValue(staticContentStore, "get(...)");
        return companion.newInstance(localizedDateTimeFormatter, cryptoCostBasisHubStateProvider, savedStateHandle, duxoBundle, cryptoCostBasisStore, cryptoAccountStore, staticContentStore);
    }

    /* compiled from: CryptoCostBasisHubDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jj\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J@\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo_Factory;", "localizedDateTimeFormatter", "Ljavax/inject/Provider;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "stateProvider", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "cryptoCostBasisStore", "Lcom/robinhood/librobinhood/data/store/costbasis/CryptoCostBasisStore;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "newInstance", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDuxo;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoCostBasisHubDuxo_Factory create(Provider<LocalizedDateTimeFormatter> localizedDateTimeFormatter, Provider<CryptoCostBasisHubStateProvider> stateProvider, Provider<SavedStateHandle> savedStateHandle, Provider<DuxoBundle> duxoBundle, Provider<CryptoCostBasisStore> cryptoCostBasisStore, Provider<CryptoAccountStore> cryptoAccountStore, Provider<StaticContentStore> staticContentStore) {
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            return new CryptoCostBasisHubDuxo_Factory(localizedDateTimeFormatter, stateProvider, savedStateHandle, duxoBundle, cryptoCostBasisStore, cryptoAccountStore, staticContentStore);
        }

        @JvmStatic
        public final CryptoCostBasisHubDuxo newInstance(LocalizedDateTimeFormatter localizedDateTimeFormatter, CryptoCostBasisHubStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, CryptoCostBasisStore cryptoCostBasisStore, CryptoAccountStore cryptoAccountStore, StaticContentStore staticContentStore) {
            Intrinsics.checkNotNullParameter(localizedDateTimeFormatter, "localizedDateTimeFormatter");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(cryptoCostBasisStore, "cryptoCostBasisStore");
            Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
            Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
            return new CryptoCostBasisHubDuxo(localizedDateTimeFormatter, stateProvider, savedStateHandle, duxoBundle, cryptoCostBasisStore, cryptoAccountStore, staticContentStore);
        }
    }
}

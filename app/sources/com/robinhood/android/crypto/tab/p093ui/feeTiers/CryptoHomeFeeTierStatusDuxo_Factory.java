package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.fee.CryptoFeeTierPreferencesProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeFeeTierStatusDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo;", "cryptoFeeTierPreferencesProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeFeeTierStatusDuxo_Factory implements Factory<CryptoHomeFeeTierStatusDuxo> {
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<CryptoFeeTierPreferencesProvider> cryptoFeeTierPreferencesProvider;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoHomeFeeTierStatusDuxo2> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoHomeFeeTierStatusDuxo_Factory create(Provider<CryptoFeeTierPreferencesProvider> provider, Provider<CryptoExperimentsStore> provider2, Provider<CryptoHomeFeeTierStatusDuxo2> provider3, Provider<DuxoBundle> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoHomeFeeTierStatusDuxo newInstance(CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHomeFeeTierStatusDuxo2 cryptoHomeFeeTierStatusDuxo2, DuxoBundle duxoBundle) {
        return INSTANCE.newInstance(cryptoFeeTierPreferencesProvider, cryptoExperimentsStore, cryptoHomeFeeTierStatusDuxo2, duxoBundle);
    }

    public CryptoHomeFeeTierStatusDuxo_Factory(Provider<CryptoFeeTierPreferencesProvider> cryptoFeeTierPreferencesProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHomeFeeTierStatusDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle) {
        Intrinsics.checkNotNullParameter(cryptoFeeTierPreferencesProvider, "cryptoFeeTierPreferencesProvider");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.cryptoFeeTierPreferencesProvider = cryptoFeeTierPreferencesProvider;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.stateProvider = stateProvider;
        this.duxoBundle = duxoBundle;
    }

    @Override // javax.inject.Provider
    public CryptoHomeFeeTierStatusDuxo get() {
        Companion companion = INSTANCE;
        CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider = this.cryptoFeeTierPreferencesProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoFeeTierPreferencesProvider, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        CryptoHomeFeeTierStatusDuxo2 cryptoHomeFeeTierStatusDuxo2 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoHomeFeeTierStatusDuxo2, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        return companion.newInstance(cryptoFeeTierPreferencesProvider, cryptoExperimentsStore, cryptoHomeFeeTierStatusDuxo2, duxoBundle);
    }

    /* compiled from: CryptoHomeFeeTierStatusDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo_Factory;", "cryptoFeeTierPreferencesProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/librobinhood/data/store/fee/CryptoFeeTierPreferencesProvider;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "newInstance", "Lcom/robinhood/android/crypto/tab/ui/feeTiers/CryptoHomeFeeTierStatusDuxo;", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoHomeFeeTierStatusDuxo_Factory create(Provider<CryptoFeeTierPreferencesProvider> cryptoFeeTierPreferencesProvider, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<CryptoHomeFeeTierStatusDuxo2> stateProvider, Provider<DuxoBundle> duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoFeeTierPreferencesProvider, "cryptoFeeTierPreferencesProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeFeeTierStatusDuxo_Factory(cryptoFeeTierPreferencesProvider, cryptoExperimentsStore, stateProvider, duxoBundle);
        }

        @JvmStatic
        public final CryptoHomeFeeTierStatusDuxo newInstance(CryptoFeeTierPreferencesProvider cryptoFeeTierPreferencesProvider, CryptoExperimentsStore cryptoExperimentsStore, CryptoHomeFeeTierStatusDuxo2 stateProvider, DuxoBundle duxoBundle) {
            Intrinsics.checkNotNullParameter(cryptoFeeTierPreferencesProvider, "cryptoFeeTierPreferencesProvider");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            return new CryptoHomeFeeTierStatusDuxo(cryptoFeeTierPreferencesProvider, cryptoExperimentsStore, stateProvider, duxoBundle);
        }
    }
}

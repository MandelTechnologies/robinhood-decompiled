package com.robinhood.android.crypto.p094ui.detail.stats;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoStatsStore;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStatsDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsStateProvider;", "cryptoStatsStore", "Lcom/robinhood/librobinhood/data/store/CryptoStatsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CryptoStatsDuxo_Factory implements Factory<CryptoStatsDuxo> {
    private final Provider<CryptoStatsStore> cryptoStatsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoStatsDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoStatsDuxo_Factory create(Provider<DuxoBundle> provider, Provider<CryptoStatsDuxo3> provider2, Provider<CryptoStatsStore> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoStatsDuxo newInstance(DuxoBundle duxoBundle, CryptoStatsDuxo3 cryptoStatsDuxo3, CryptoStatsStore cryptoStatsStore) {
        return INSTANCE.newInstance(duxoBundle, cryptoStatsDuxo3, cryptoStatsStore);
    }

    public CryptoStatsDuxo_Factory(Provider<DuxoBundle> duxoBundle, Provider<CryptoStatsDuxo3> stateProvider, Provider<CryptoStatsStore> cryptoStatsStore) {
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoStatsStore, "cryptoStatsStore");
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.cryptoStatsStore = cryptoStatsStore;
    }

    @Override // javax.inject.Provider
    public CryptoStatsDuxo get() {
        Companion companion = INSTANCE;
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoStatsDuxo3 cryptoStatsDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStatsDuxo3, "get(...)");
        CryptoStatsStore cryptoStatsStore = this.cryptoStatsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoStatsStore, "get(...)");
        return companion.newInstance(duxoBundle, cryptoStatsDuxo3, cryptoStatsStore);
    }

    /* compiled from: CryptoStatsDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0007J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo_Factory;", "duxoBundle", "Ljavax/inject/Provider;", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsStateProvider;", "cryptoStatsStore", "Lcom/robinhood/librobinhood/data/store/CryptoStatsStore;", "newInstance", "Lcom/robinhood/android/crypto/ui/detail/stats/CryptoStatsDuxo;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoStatsDuxo_Factory create(Provider<DuxoBundle> duxoBundle, Provider<CryptoStatsDuxo3> stateProvider, Provider<CryptoStatsStore> cryptoStatsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoStatsStore, "cryptoStatsStore");
            return new CryptoStatsDuxo_Factory(duxoBundle, stateProvider, cryptoStatsStore);
        }

        @JvmStatic
        public final CryptoStatsDuxo newInstance(DuxoBundle duxoBundle, CryptoStatsDuxo3 stateProvider, CryptoStatsStore cryptoStatsStore) {
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoStatsStore, "cryptoStatsStore");
            return new CryptoStatsDuxo(duxoBundle, stateProvider, cryptoStatsStore);
        }
    }
}

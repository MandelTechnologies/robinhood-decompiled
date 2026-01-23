package com.robinhood.shared.crypto.movers;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.CryptoTradingOptionsStore;
import com.robinhood.shared.security.auth.AuthManager;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDailyMoversDuxo_Factory.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversStateProvider;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoDailyMoversDuxo_Factory implements Factory<CryptoDailyMoversDuxo> {
    private final Provider<AuthManager> authManager;
    private final Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore;
    private final Provider<DuxoBundle> duxoBundle;
    private final Provider<CryptoDailyMoversDuxo3> stateProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoDailyMoversDuxo_Factory create(Provider<AuthManager> provider, Provider<DuxoBundle> provider2, Provider<CryptoDailyMoversDuxo3> provider3, Provider<CryptoTradingOptionsStore> provider4) {
        return INSTANCE.create(provider, provider2, provider3, provider4);
    }

    @JvmStatic
    public static final CryptoDailyMoversDuxo newInstance(AuthManager authManager, DuxoBundle duxoBundle, CryptoDailyMoversDuxo3 cryptoDailyMoversDuxo3, CryptoTradingOptionsStore cryptoTradingOptionsStore) {
        return INSTANCE.newInstance(authManager, duxoBundle, cryptoDailyMoversDuxo3, cryptoTradingOptionsStore);
    }

    public CryptoDailyMoversDuxo_Factory(Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<CryptoDailyMoversDuxo3> stateProvider, Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
        this.authManager = authManager;
        this.duxoBundle = duxoBundle;
        this.stateProvider = stateProvider;
        this.cryptoTradingOptionsStore = cryptoTradingOptionsStore;
    }

    @Override // javax.inject.Provider
    public CryptoDailyMoversDuxo get() {
        Companion companion = INSTANCE;
        AuthManager authManager = this.authManager.get();
        Intrinsics.checkNotNullExpressionValue(authManager, "get(...)");
        DuxoBundle duxoBundle = this.duxoBundle.get();
        Intrinsics.checkNotNullExpressionValue(duxoBundle, "get(...)");
        CryptoDailyMoversDuxo3 cryptoDailyMoversDuxo3 = this.stateProvider.get();
        Intrinsics.checkNotNullExpressionValue(cryptoDailyMoversDuxo3, "get(...)");
        CryptoTradingOptionsStore cryptoTradingOptionsStore = this.cryptoTradingOptionsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoTradingOptionsStore, "get(...)");
        return companion.newInstance(authManager, duxoBundle, cryptoDailyMoversDuxo3, cryptoTradingOptionsStore);
    }

    /* compiled from: CryptoDailyMoversDuxo_Factory.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0007J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo_Factory;", "authManager", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/security/auth/AuthManager;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversStateProvider;", "cryptoTradingOptionsStore", "Lcom/robinhood/librobinhood/data/store/CryptoTradingOptionsStore;", "newInstance", "Lcom/robinhood/shared/crypto/movers/CryptoDailyMoversDuxo;", "lib-crypto-movers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoDailyMoversDuxo_Factory create(Provider<AuthManager> authManager, Provider<DuxoBundle> duxoBundle, Provider<CryptoDailyMoversDuxo3> stateProvider, Provider<CryptoTradingOptionsStore> cryptoTradingOptionsStore) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
            return new CryptoDailyMoversDuxo_Factory(authManager, duxoBundle, stateProvider, cryptoTradingOptionsStore);
        }

        @JvmStatic
        public final CryptoDailyMoversDuxo newInstance(AuthManager authManager, DuxoBundle duxoBundle, CryptoDailyMoversDuxo3 stateProvider, CryptoTradingOptionsStore cryptoTradingOptionsStore) {
            Intrinsics.checkNotNullParameter(authManager, "authManager");
            Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
            Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
            Intrinsics.checkNotNullParameter(cryptoTradingOptionsStore, "cryptoTradingOptionsStore");
            return new CryptoDailyMoversDuxo(authManager, duxoBundle, stateProvider, cryptoTradingOptionsStore);
        }
    }
}

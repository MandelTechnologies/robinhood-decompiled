package com.robinhood.shared.trade.crypto.p397ui.disclosures;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.trade.crypto.microgram.RealCryptoTradeUserInputsService;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTradeDisclosuresProvider_Factory.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BM\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeDisclosuresProvider_Factory implements Factory<CryptoTradeDisclosuresProvider> {
    private final Provider<AppType> appType;
    private final Provider<CryptoExperimentsStore> cryptoExperimentsStore;
    private final Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService;
    private final Provider<CoroutineScope> microgramCoroutineScope;
    private final Provider<MicrogramManager> microgramManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoTradeDisclosuresProvider_Factory create(Provider<AppType> provider, Provider<CryptoExperimentsStore> provider2, Provider<MicrogramManager> provider3, Provider<CoroutineScope> provider4, Provider<RealCryptoTradeUserInputsService> provider5) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5);
    }

    @JvmStatic
    public static final CryptoTradeDisclosuresProvider newInstance(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, CoroutineScope coroutineScope, RealCryptoTradeUserInputsService realCryptoTradeUserInputsService) {
        return INSTANCE.newInstance(appType, cryptoExperimentsStore, microgramManager, coroutineScope, realCryptoTradeUserInputsService);
    }

    public CryptoTradeDisclosuresProvider_Factory(Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<MicrogramManager> microgramManager, Provider<CoroutineScope> microgramCoroutineScope, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
        Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
        this.appType = appType;
        this.cryptoExperimentsStore = cryptoExperimentsStore;
        this.microgramManager = microgramManager;
        this.microgramCoroutineScope = microgramCoroutineScope;
        this.cryptoTradeUserInputsService = cryptoTradeUserInputsService;
    }

    @Override // javax.inject.Provider
    public CryptoTradeDisclosuresProvider get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore.get();
        Intrinsics.checkNotNullExpressionValue(cryptoExperimentsStore, "get(...)");
        MicrogramManager microgramManager = this.microgramManager.get();
        Intrinsics.checkNotNullExpressionValue(microgramManager, "get(...)");
        CoroutineScope coroutineScope = this.microgramCoroutineScope.get();
        Intrinsics.checkNotNullExpressionValue(coroutineScope, "get(...)");
        RealCryptoTradeUserInputsService realCryptoTradeUserInputsService = this.cryptoTradeUserInputsService.get();
        Intrinsics.checkNotNullExpressionValue(realCryptoTradeUserInputsService, "get(...)");
        return companion.newInstance(appType, cryptoExperimentsStore, microgramManager, coroutineScope, realCryptoTradeUserInputsService);
    }

    /* compiled from: CryptoTradeDisclosuresProvider_Factory.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0007J0\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "microgramCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "newInstance", "Lcom/robinhood/shared/trade/crypto/ui/disclosures/CryptoTradeDisclosuresProvider;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoTradeDisclosuresProvider_Factory create(Provider<AppType> appType, Provider<CryptoExperimentsStore> cryptoExperimentsStore, Provider<MicrogramManager> microgramManager, Provider<CoroutineScope> microgramCoroutineScope, Provider<RealCryptoTradeUserInputsService> cryptoTradeUserInputsService) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            return new CryptoTradeDisclosuresProvider_Factory(appType, cryptoExperimentsStore, microgramManager, microgramCoroutineScope, cryptoTradeUserInputsService);
        }

        @JvmStatic
        public final CryptoTradeDisclosuresProvider newInstance(AppType appType, CryptoExperimentsStore cryptoExperimentsStore, MicrogramManager microgramManager, CoroutineScope microgramCoroutineScope, RealCryptoTradeUserInputsService cryptoTradeUserInputsService) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "cryptoExperimentsStore");
            Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
            Intrinsics.checkNotNullParameter(microgramCoroutineScope, "microgramCoroutineScope");
            Intrinsics.checkNotNullParameter(cryptoTradeUserInputsService, "cryptoTradeUserInputsService");
            return new CryptoTradeDisclosuresProvider(appType, cryptoExperimentsStore, microgramManager, microgramCoroutineScope, cryptoTradeUserInputsService);
        }
    }
}

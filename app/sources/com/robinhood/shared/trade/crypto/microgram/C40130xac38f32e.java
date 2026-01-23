package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "module", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;", "<init>", "(Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory */
/* loaded from: classes12.dex */
public final class C40130xac38f32e implements Factory<RealCryptoTradeFeeEstimationService> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CryptoTradeMicrogramServiceModule module;

    @JvmStatic
    public static final C40130xac38f32e create(CryptoTradeMicrogramServiceModule cryptoTradeMicrogramServiceModule) {
        return INSTANCE.create(cryptoTradeMicrogramServiceModule);
    }

    @JvmStatic
    public static final RealCryptoTradeFeeEstimationService provideCryptoTradeFeeEstimationService(CryptoTradeMicrogramServiceModule cryptoTradeMicrogramServiceModule) {
        return INSTANCE.provideCryptoTradeFeeEstimationService(cryptoTradeMicrogramServiceModule);
    }

    public C40130xac38f32e(CryptoTradeMicrogramServiceModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RealCryptoTradeFeeEstimationService get() {
        return INSTANCE.provideCryptoTradeFeeEstimationService(this.module);
    }

    /* compiled from: CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory;", "module", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;", "provideCryptoTradeFeeEstimationService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeFeeEstimationService;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoTradeMicrogramServiceModule_ProvideCryptoTradeFeeEstimationServiceFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C40130xac38f32e create(CryptoTradeMicrogramServiceModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return new C40130xac38f32e(module);
        }

        @JvmStatic
        public final RealCryptoTradeFeeEstimationService provideCryptoTradeFeeEstimationService(CryptoTradeMicrogramServiceModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideCryptoTradeFeeEstimationService(), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RealCryptoTradeFeeEstimationService) objCheckNotNull;
        }
    }
}

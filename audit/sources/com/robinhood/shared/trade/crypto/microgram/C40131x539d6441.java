package com.robinhood.shared.trade.crypto.microgram;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "module", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;", "<init>", "(Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory */
/* loaded from: classes12.dex */
public final class C40131x539d6441 implements Factory<RealCryptoTradeUserInputsService> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CryptoTradeMicrogramServiceModule module;

    @JvmStatic
    public static final C40131x539d6441 create(CryptoTradeMicrogramServiceModule cryptoTradeMicrogramServiceModule) {
        return INSTANCE.create(cryptoTradeMicrogramServiceModule);
    }

    @JvmStatic
    public static final RealCryptoTradeUserInputsService provideCryptoTradeUserInputsService(CryptoTradeMicrogramServiceModule cryptoTradeMicrogramServiceModule) {
        return INSTANCE.provideCryptoTradeUserInputsService(cryptoTradeMicrogramServiceModule);
    }

    public C40131x539d6441(CryptoTradeMicrogramServiceModule module) {
        Intrinsics.checkNotNullParameter(module, "module");
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RealCryptoTradeUserInputsService get() {
        return INSTANCE.provideCryptoTradeUserInputsService(this.module);
    }

    /* compiled from: CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory;", "module", "Lcom/robinhood/shared/trade/crypto/microgram/CryptoTradeMicrogramServiceModule;", "provideCryptoTradeUserInputsService", "Lcom/robinhood/shared/trade/crypto/microgram/RealCryptoTradeUserInputsService;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.microgram.CryptoTradeMicrogramServiceModule_ProvideCryptoTradeUserInputsServiceFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C40131x539d6441 create(CryptoTradeMicrogramServiceModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return new C40131x539d6441(module);
        }

        @JvmStatic
        public final RealCryptoTradeUserInputsService provideCryptoTradeUserInputsService(CryptoTradeMicrogramServiceModule module) {
            Intrinsics.checkNotNullParameter(module, "module");
            Object objCheckNotNull = Preconditions.checkNotNull(module.provideCryptoTradeUserInputsService(), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (RealCryptoTradeUserInputsService) objCheckNotNull;
        }
    }
}

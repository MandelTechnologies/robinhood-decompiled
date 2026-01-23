package com.robinhood.shared.trade.crypto.validation;

import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.CryptoEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderValidatorManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0011\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/CryptoEventLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "defaultCryptoOrderValidatorLazy", "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class CryptoOrderValidatorManager_Factory implements Factory<CryptoOrderValidatorManager> {
    private final Provider<AnalyticsLogger> analytics;
    private final Provider<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy;
    private final Provider<CryptoEventLogger> eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final CryptoOrderValidatorManager_Factory create(Provider<CryptoEventLogger> provider, Provider<AnalyticsLogger> provider2, Provider<CryptoOrderValidator5> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final CryptoOrderValidatorManager newInstance(CryptoEventLogger cryptoEventLogger, AnalyticsLogger analyticsLogger, Lazy<CryptoOrderValidator5> lazy) {
        return INSTANCE.newInstance(cryptoEventLogger, analyticsLogger, lazy);
    }

    public CryptoOrderValidatorManager_Factory(Provider<CryptoEventLogger> eventLogger, Provider<AnalyticsLogger> analytics, Provider<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(defaultCryptoOrderValidatorLazy, "defaultCryptoOrderValidatorLazy");
        this.eventLogger = eventLogger;
        this.analytics = analytics;
        this.defaultCryptoOrderValidatorLazy = defaultCryptoOrderValidatorLazy;
    }

    @Override // javax.inject.Provider
    public CryptoOrderValidatorManager get() {
        Companion companion = INSTANCE;
        CryptoEventLogger cryptoEventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(cryptoEventLogger, "get(...)");
        AnalyticsLogger analyticsLogger = this.analytics.get();
        Intrinsics.checkNotNullExpressionValue(analyticsLogger, "get(...)");
        Lazy<CryptoOrderValidator5> lazy = DoubleCheck.lazy(this.defaultCryptoOrderValidatorLazy);
        Intrinsics.checkNotNullExpressionValue(lazy, "lazy(...)");
        return companion.newInstance(cryptoEventLogger, analyticsLogger, lazy);
    }

    /* compiled from: CryptoOrderValidatorManager_Factory.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u0007H\u0007J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0011\u0010\u000b\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u0010H\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager_Factory;", "eventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/CryptoEventLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "defaultCryptoOrderValidatorLazy", "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "Lkotlin/jvm/JvmSuppressWildcards;", "newInstance", "Lcom/robinhood/shared/trade/crypto/validation/CryptoOrderValidatorManager;", "Ldagger/Lazy;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoOrderValidatorManager_Factory create(Provider<CryptoEventLogger> eventLogger, Provider<AnalyticsLogger> analytics, Provider<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(defaultCryptoOrderValidatorLazy, "defaultCryptoOrderValidatorLazy");
            return new CryptoOrderValidatorManager_Factory(eventLogger, analytics, defaultCryptoOrderValidatorLazy);
        }

        @JvmStatic
        public final CryptoOrderValidatorManager newInstance(CryptoEventLogger eventLogger, AnalyticsLogger analytics, Lazy<CryptoOrderValidator5> defaultCryptoOrderValidatorLazy) {
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            Intrinsics.checkNotNullParameter(analytics, "analytics");
            Intrinsics.checkNotNullParameter(defaultCryptoOrderValidatorLazy, "defaultCryptoOrderValidatorLazy");
            return new CryptoOrderValidatorManager(eventLogger, analytics, defaultCryptoOrderValidatorLazy);
        }
    }
}

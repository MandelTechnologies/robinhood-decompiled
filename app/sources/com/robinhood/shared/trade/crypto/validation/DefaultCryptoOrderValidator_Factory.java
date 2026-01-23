package com.robinhood.shared.trade.crypto.validation;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.app.type.AppType;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultCryptoOrderValidator_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class DefaultCryptoOrderValidator_Factory implements Factory<CryptoOrderValidator5> {
    private final Provider<AppType> appType;
    private final Provider<EventLogger> eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmStatic
    public static final DefaultCryptoOrderValidator_Factory create(Provider<AppType> provider, Provider<EventLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final CryptoOrderValidator5 newInstance(AppType appType, EventLogger eventLogger) {
        return INSTANCE.newInstance(appType, eventLogger);
    }

    public DefaultCryptoOrderValidator_Factory(Provider<AppType> appType, Provider<EventLogger> eventLogger) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.appType = appType;
        this.eventLogger = eventLogger;
    }

    @Override // javax.inject.Provider
    public CryptoOrderValidator5 get() {
        Companion companion = INSTANCE;
        AppType appType = this.appType.get();
        Intrinsics.checkNotNullExpressionValue(appType, "get(...)");
        EventLogger eventLogger = this.eventLogger.get();
        Intrinsics.checkNotNullExpressionValue(eventLogger, "get(...)");
        return companion.newInstance(appType, eventLogger);
    }

    /* compiled from: DefaultCryptoOrderValidator_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator_Factory;", "appType", "Ljavax/inject/Provider;", "Lcom/robinhood/shared/app/type/AppType;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "newInstance", "Lcom/robinhood/shared/trade/crypto/validation/DefaultCryptoOrderValidator;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DefaultCryptoOrderValidator_Factory create(Provider<AppType> appType, Provider<EventLogger> eventLogger) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new DefaultCryptoOrderValidator_Factory(appType, eventLogger);
        }

        @JvmStatic
        public final CryptoOrderValidator5 newInstance(AppType appType, EventLogger eventLogger) {
            Intrinsics.checkNotNullParameter(appType, "appType");
            Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
            return new CryptoOrderValidator5(appType, eventLogger);
        }
    }
}

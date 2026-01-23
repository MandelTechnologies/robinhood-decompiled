package com.robinhood.trader.history.equities;

import com.robinhood.analytics.TraderEventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.shared.history.equities.EquityHistoryLogger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/trader/history/equities/EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "traderEventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/TraderEventLogger;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.trader.history.equities.EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory */
/* loaded from: classes21.dex */
public final class C41673x2e0c2460 implements Factory<EquityHistoryLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<TraderEventLogger> traderEventLogger;

    @JvmStatic
    public static final C41673x2e0c2460 create(Provider<TraderEventLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final EquityHistoryLogger providesEquityHistoryLogger(TraderEventLogger traderEventLogger) {
        return INSTANCE.providesEquityHistoryLogger(traderEventLogger);
    }

    public C41673x2e0c2460(Provider<TraderEventLogger> traderEventLogger) {
        Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
        this.traderEventLogger = traderEventLogger;
    }

    @Override // javax.inject.Provider
    public EquityHistoryLogger get() {
        Companion companion = INSTANCE;
        TraderEventLogger traderEventLogger = this.traderEventLogger.get();
        Intrinsics.checkNotNullExpressionValue(traderEventLogger, "get(...)");
        return companion.providesEquityHistoryLogger(traderEventLogger);
    }

    /* compiled from: EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/trader/history/equities/EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/trader/history/equities/EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory;", "traderEventLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/TraderEventLogger;", "providesEquityHistoryLogger", "Lcom/robinhood/shared/history/equities/EquityHistoryLogger;", "lib-equity-history-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.trader.history.equities.EquityHistoryLoggerProviderModule_ProvidesEquityHistoryLoggerFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C41673x2e0c2460 create(Provider<TraderEventLogger> traderEventLogger) {
            Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
            return new C41673x2e0c2460(traderEventLogger);
        }

        @JvmStatic
        public final EquityHistoryLogger providesEquityHistoryLogger(TraderEventLogger traderEventLogger) {
            Intrinsics.checkNotNullParameter(traderEventLogger, "traderEventLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(EquityHistoryLoggerProviderModule.INSTANCE.providesEquityHistoryLogger(traderEventLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (EquityHistoryLogger) objCheckNotNull;
        }
    }
}

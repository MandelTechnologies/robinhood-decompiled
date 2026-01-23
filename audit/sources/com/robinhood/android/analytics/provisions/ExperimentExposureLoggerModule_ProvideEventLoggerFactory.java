package com.robinhood.android.analytics.provisions;

import com.robinhood.analytics.RealExperimentExposureLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentExposureLoggerModule_ProvideEventLoggerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/ExperimentExposureLoggerModule_ProvideEventLoggerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "realExperimentExposureLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealExperimentExposureLogger;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ExperimentExposureLoggerModule_ProvideEventLoggerFactory implements Factory<ExperimentExposureLogger> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<RealExperimentExposureLogger> realExperimentExposureLogger;

    @JvmStatic
    public static final ExperimentExposureLoggerModule_ProvideEventLoggerFactory create(Provider<RealExperimentExposureLogger> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final ExperimentExposureLogger provideEventLogger(RealExperimentExposureLogger realExperimentExposureLogger) {
        return INSTANCE.provideEventLogger(realExperimentExposureLogger);
    }

    public ExperimentExposureLoggerModule_ProvideEventLoggerFactory(Provider<RealExperimentExposureLogger> realExperimentExposureLogger) {
        Intrinsics.checkNotNullParameter(realExperimentExposureLogger, "realExperimentExposureLogger");
        this.realExperimentExposureLogger = realExperimentExposureLogger;
    }

    @Override // javax.inject.Provider
    public ExperimentExposureLogger get() {
        Companion companion = INSTANCE;
        RealExperimentExposureLogger realExperimentExposureLogger = this.realExperimentExposureLogger.get();
        Intrinsics.checkNotNullExpressionValue(realExperimentExposureLogger, "get(...)");
        return companion.provideEventLogger(realExperimentExposureLogger);
    }

    /* compiled from: ExperimentExposureLoggerModule_ProvideEventLoggerFactory.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\bH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/analytics/provisions/ExperimentExposureLoggerModule_ProvideEventLoggerFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/analytics/provisions/ExperimentExposureLoggerModule_ProvideEventLoggerFactory;", "realExperimentExposureLogger", "Ljavax/inject/Provider;", "Lcom/robinhood/analytics/RealExperimentExposureLogger;", "provideEventLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "lib-analytics-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ExperimentExposureLoggerModule_ProvideEventLoggerFactory create(Provider<RealExperimentExposureLogger> realExperimentExposureLogger) {
            Intrinsics.checkNotNullParameter(realExperimentExposureLogger, "realExperimentExposureLogger");
            return new ExperimentExposureLoggerModule_ProvideEventLoggerFactory(realExperimentExposureLogger);
        }

        @JvmStatic
        public final ExperimentExposureLogger provideEventLogger(RealExperimentExposureLogger realExperimentExposureLogger) {
            Intrinsics.checkNotNullParameter(realExperimentExposureLogger, "realExperimentExposureLogger");
            Object objCheckNotNull = Preconditions.checkNotNull(ExperimentExposureLoggerModule.INSTANCE.provideEventLogger(realExperimentExposureLogger), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ExperimentExposureLogger) objCheckNotNull;
        }
    }
}

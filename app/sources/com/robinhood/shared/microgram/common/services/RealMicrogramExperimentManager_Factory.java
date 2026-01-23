package com.robinhood.shared.microgram.common.services;

import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.experiments.ExperimentsProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealMicrogramExperimentManager_Factory.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager_Factory;", "Ldagger/internal/Factory;", "Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager;", "experimentProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/experiments/ExperimentsProvider;", "exposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class RealMicrogramExperimentManager_Factory implements Factory<RealMicrogramExperimentManager> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ExperimentsProvider> experimentProvider;
    private final Provider<ExperimentExposureLogger> exposureLogger;

    @JvmStatic
    public static final RealMicrogramExperimentManager_Factory create(Provider<ExperimentsProvider> provider, Provider<ExperimentExposureLogger> provider2) {
        return INSTANCE.create(provider, provider2);
    }

    @JvmStatic
    public static final RealMicrogramExperimentManager newInstance(ExperimentsProvider experimentsProvider, ExperimentExposureLogger experimentExposureLogger) {
        return INSTANCE.newInstance(experimentsProvider, experimentExposureLogger);
    }

    public RealMicrogramExperimentManager_Factory(Provider<ExperimentsProvider> experimentProvider, Provider<ExperimentExposureLogger> exposureLogger) {
        Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
        Intrinsics.checkNotNullParameter(exposureLogger, "exposureLogger");
        this.experimentProvider = experimentProvider;
        this.exposureLogger = exposureLogger;
    }

    @Override // javax.inject.Provider
    public RealMicrogramExperimentManager get() {
        Companion companion = INSTANCE;
        ExperimentsProvider experimentsProvider = this.experimentProvider.get();
        Intrinsics.checkNotNullExpressionValue(experimentsProvider, "get(...)");
        ExperimentExposureLogger experimentExposureLogger = this.exposureLogger.get();
        Intrinsics.checkNotNullExpressionValue(experimentExposureLogger, "get(...)");
        return companion.newInstance(experimentsProvider, experimentExposureLogger);
    }

    /* compiled from: RealMicrogramExperimentManager_Factory.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager_Factory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager_Factory;", "experimentProvider", "Ljavax/inject/Provider;", "Lcom/robinhood/experiments/ExperimentsProvider;", "exposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "newInstance", "Lcom/robinhood/shared/microgram/common/services/RealMicrogramExperimentManager;", "lib-common-services_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RealMicrogramExperimentManager_Factory create(Provider<ExperimentsProvider> experimentProvider, Provider<ExperimentExposureLogger> exposureLogger) {
            Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
            Intrinsics.checkNotNullParameter(exposureLogger, "exposureLogger");
            return new RealMicrogramExperimentManager_Factory(experimentProvider, exposureLogger);
        }

        @JvmStatic
        public final RealMicrogramExperimentManager newInstance(ExperimentsProvider experimentProvider, ExperimentExposureLogger exposureLogger) {
            Intrinsics.checkNotNullParameter(experimentProvider, "experimentProvider");
            Intrinsics.checkNotNullParameter(exposureLogger, "exposureLogger");
            return new RealMicrogramExperimentManager(experimentProvider, exposureLogger);
        }
    }
}

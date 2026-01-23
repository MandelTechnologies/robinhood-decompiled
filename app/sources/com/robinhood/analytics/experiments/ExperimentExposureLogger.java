package com.robinhood.analytics.experiments;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentExposureLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "", "logExposure", "", "experimentName", "", "variant", "Noop", "lib-experiments-exposure-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface ExperimentExposureLogger {
    @Deprecated
    void logExposure(String experimentName, String variant);

    /* compiled from: ExperimentExposureLogger.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0017¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/analytics/experiments/ExperimentExposureLogger$Noop;", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "<init>", "()V", "logExposure", "", "experimentName", "", "variant", "lib-experiments-exposure-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class Noop implements ExperimentExposureLogger {
        public static final Noop INSTANCE = new Noop();

        @Override // com.robinhood.analytics.experiments.ExperimentExposureLogger
        @Deprecated
        public void logExposure(String experimentName, String variant) {
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(variant, "variant");
        }

        private Noop() {
        }
    }
}

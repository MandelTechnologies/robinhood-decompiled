package com.robinhood.analytics.experiments;

import com.robinhood.experiments.ExperimentDeclaration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentExposureLogger.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"logExposure", "", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "experiment", "Lcom/robinhood/experiments/ExperimentDeclaration;", "variant", "", "lib-experiments-exposure-logger_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.analytics.experiments.ExperimentExposureLoggerKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ExperimentExposureLogger2 {
    public static final void logExposure(ExperimentExposureLogger experimentExposureLogger, ExperimentDeclaration<?> experiment, String variant) {
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "<this>");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        Intrinsics.checkNotNullParameter(variant, "variant");
        experimentExposureLogger.logExposure(experiment.getServerName(), variant);
    }
}

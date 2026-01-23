package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.experiments.ExperimentDeclaration;
import com.robinhood.hammer.core.internal.RhGenerated;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PerformanceChartExperiments;
import kotlin.Metadata;

/* compiled from: PerformanceChartExperiments_Benchmarking_HammerModule.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments_Benchmarking_HammerModule;", "", "<init>", "()V", "provide", "Lcom/robinhood/experiments/ExperimentDeclaration;", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class PerformanceChartExperiments_Benchmarking_HammerModule {
    public static final PerformanceChartExperiments_Benchmarking_HammerModule INSTANCE = new PerformanceChartExperiments_Benchmarking_HammerModule();

    private PerformanceChartExperiments_Benchmarking_HammerModule() {
    }

    public final ExperimentDeclaration<?> provide() {
        return PerformanceChartExperiments.Benchmarking.INSTANCE;
    }
}

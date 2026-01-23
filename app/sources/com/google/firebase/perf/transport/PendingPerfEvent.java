package com.google.firebase.perf.transport;

import com.google.firebase.perf.p052v1.ApplicationProcessState;
import com.google.firebase.perf.p052v1.PerfMetric;

/* loaded from: classes27.dex */
final class PendingPerfEvent {
    protected final ApplicationProcessState appState;
    protected final PerfMetric.Builder perfMetricBuilder;

    public PendingPerfEvent(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        this.perfMetricBuilder = builder;
        this.appState = applicationProcessState;
    }
}

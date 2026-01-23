package com.google.firebase.perf.p052v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes.dex */
public interface PerfMetricOrBuilder extends MessageLiteOrBuilder {
    GaugeMetric getGaugeMetric();

    NetworkRequestMetric getNetworkRequestMetric();

    TraceMetric getTraceMetric();

    boolean hasGaugeMetric();

    boolean hasNetworkRequestMetric();

    boolean hasTraceMetric();
}

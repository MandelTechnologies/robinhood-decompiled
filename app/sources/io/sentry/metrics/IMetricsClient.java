package io.sentry.metrics;

import io.sentry.protocol.SentryId;

/* loaded from: classes21.dex */
public interface IMetricsClient {
    SentryId captureMetrics(EncodedMetrics encodedMetrics);
}

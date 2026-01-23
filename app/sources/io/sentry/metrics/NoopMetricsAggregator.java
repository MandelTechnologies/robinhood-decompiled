package io.sentry.metrics;

import io.sentry.IMetricsAggregator;
import io.sentry.metrics.MetricsApi;
import java.io.IOException;

/* loaded from: classes21.dex */
public final class NoopMetricsAggregator implements IMetricsAggregator, MetricsApi.IMetricsInterface {
    private static final NoopMetricsAggregator instance = new NoopMetricsAggregator();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public static NoopMetricsAggregator getInstance() {
        return instance;
    }
}

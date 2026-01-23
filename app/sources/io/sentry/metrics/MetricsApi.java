package io.sentry.metrics;

/* loaded from: classes21.dex */
public final class MetricsApi {
    private final IMetricsInterface aggregator;

    public interface IMetricsInterface {
    }

    public MetricsApi(IMetricsInterface iMetricsInterface) {
        this.aggregator = iMetricsInterface;
    }
}

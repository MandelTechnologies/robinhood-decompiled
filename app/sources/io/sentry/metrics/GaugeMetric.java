package io.sentry.metrics;

import java.util.Arrays;

/* loaded from: classes14.dex */
public final class GaugeMetric extends Metric {
    private int count;
    private double last;
    private double max;
    private double min;
    private double sum;

    @Override // io.sentry.metrics.Metric
    public int getWeight() {
        return 5;
    }

    public double getMin() {
        return this.min;
    }

    public double getMax() {
        return this.max;
    }

    public double getSum() {
        return this.sum;
    }

    public int getCount() {
        return this.count;
    }

    @Override // io.sentry.metrics.Metric
    public Iterable<?> serialize() {
        return Arrays.asList(Double.valueOf(this.last), Double.valueOf(this.min), Double.valueOf(this.max), Double.valueOf(this.sum), Integer.valueOf(this.count));
    }
}

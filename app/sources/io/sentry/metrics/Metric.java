package io.sentry.metrics;

import io.sentry.MeasurementUnit;
import java.util.Map;

/* loaded from: classes14.dex */
public abstract class Metric {
    private final String key;
    private final Map<String, String> tags;

    /* renamed from: type, reason: collision with root package name */
    private final MetricType f10717type;
    private final MeasurementUnit unit;

    public abstract int getWeight();

    public abstract Iterable<?> serialize();

    public MetricType getType() {
        return this.f10717type;
    }

    public String getKey() {
        return this.key;
    }

    public MeasurementUnit getUnit() {
        return this.unit;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }
}

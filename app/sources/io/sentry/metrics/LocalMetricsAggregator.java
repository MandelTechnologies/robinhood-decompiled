package io.sentry.metrics;

import io.sentry.protocol.MetricSummary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class LocalMetricsAggregator {
    private final Map<String, Map<String, GaugeMetric>> buckets = new HashMap();

    public Map<String, List<MetricSummary>> getSummaries() {
        HashMap map = new HashMap();
        synchronized (this.buckets) {
            try {
                for (Map.Entry<String, Map<String, GaugeMetric>> entry : this.buckets.entrySet()) {
                    String key = entry.getKey();
                    Objects.requireNonNull(key);
                    ArrayList arrayList = new ArrayList();
                    for (GaugeMetric gaugeMetric : entry.getValue().values()) {
                        arrayList.add(new MetricSummary(gaugeMetric.getMin(), gaugeMetric.getMax(), gaugeMetric.getSum(), gaugeMetric.getCount(), gaugeMetric.getTags()));
                    }
                    map.put(key, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}

package io.sentry.protocol;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class MetricSummary implements JsonSerializable {
    private int count;
    private double max;
    private double min;
    private double sum;
    private Map<String, String> tags;
    private Map<String, Object> unknown;

    public MetricSummary() {
    }

    public MetricSummary(double d, double d2, double d3, int i, Map<String, String> map) {
        this.tags = map;
        this.min = d;
        this.max = d2;
        this.count = i;
        this.sum = d3;
        this.unknown = null;
    }

    public void setMin(double d) {
        this.min = d;
    }

    public void setMax(double d) {
        this.max = d;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setSum(double d) {
        this.sum = d;
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("min").value(this.min);
        objectWriter.name(AnalyticsStrings.MAX_WELCOME_TAG).value(this.max);
        objectWriter.name("sum").value(this.sum);
        objectWriter.name("count").value(this.count);
        if (this.tags != null) {
            objectWriter.name("tags");
            objectWriter.value(iLogger, this.tags);
        }
        objectWriter.endObject();
    }

    public static final class Deserializer implements JsonDeserializer<MetricSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        public MetricSummary deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            MetricSummary metricSummary = new MetricSummary();
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "max":
                        metricSummary.setMax(objectReader.nextDouble());
                        break;
                    case "min":
                        metricSummary.setMin(objectReader.nextDouble());
                        break;
                    case "sum":
                        metricSummary.setSum(objectReader.nextDouble());
                        break;
                    case "tags":
                        metricSummary.tags = CollectionUtils.newConcurrentHashMap((Map) objectReader.nextObjectOrNull());
                        break;
                    case "count":
                        metricSummary.setCount(objectReader.nextInt());
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            metricSummary.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return metricSummary;
        }
    }
}

package io.sentry.protocol;

import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.SentryLevel;
import io.sentry.Span;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.MetricSummary;
import io.sentry.protocol.SentryId;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class SentrySpan implements JsonSerializable {
    private Map<String, Object> data;
    private final String description;
    private final Map<String, MeasurementValue> measurements;
    private final Map<String, List<MetricSummary>> metricsSummaries;

    /* renamed from: op */
    private final String f6644op;
    private final String origin;
    private final SpanId parentSpanId;
    private final SpanId spanId;
    private final Double startTimestamp;
    private final SpanStatus status;
    private final Map<String, String> tags;
    private final Double timestamp;
    private final SentryId traceId;
    private Map<String, Object> unknown;

    public SentrySpan(Span span) {
        this(span, span.getData());
    }

    public SentrySpan(Span span, Map<String, Object> map) {
        Objects.requireNonNull(span, "span is required");
        this.description = span.getDescription();
        this.f6644op = span.getOperation();
        this.spanId = span.getSpanId();
        this.parentSpanId = span.getParentSpanId();
        this.traceId = span.getTraceId();
        this.status = span.getStatus();
        this.origin = span.getSpanContext().getOrigin();
        Map<String, String> mapNewConcurrentHashMap = CollectionUtils.newConcurrentHashMap(span.getTags());
        this.tags = mapNewConcurrentHashMap == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap;
        Map<String, MeasurementValue> mapNewConcurrentHashMap2 = CollectionUtils.newConcurrentHashMap(span.getMeasurements());
        this.measurements = mapNewConcurrentHashMap2 == null ? new ConcurrentHashMap<>() : mapNewConcurrentHashMap2;
        this.timestamp = span.getFinishDate() == null ? null : Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().laterDateNanosTimestampByDiff(span.getFinishDate())));
        this.startTimestamp = Double.valueOf(DateUtils.nanosToSeconds(span.getStartDate().nanoTimestamp()));
        this.data = map;
        LocalMetricsAggregator localMetricsAggregator = span.getLocalMetricsAggregator();
        if (localMetricsAggregator != null) {
            this.metricsSummaries = localMetricsAggregator.getSummaries();
        } else {
            this.metricsSummaries = null;
        }
    }

    public SentrySpan(Double d, Double d2, SentryId sentryId, SpanId spanId, SpanId spanId2, String str, String str2, SpanStatus spanStatus, String str3, Map<String, String> map, Map<String, MeasurementValue> map2, Map<String, List<MetricSummary>> map3, Map<String, Object> map4) {
        this.startTimestamp = d;
        this.timestamp = d2;
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.f6644op = str;
        this.description = str2;
        this.status = spanStatus;
        this.origin = str3;
        this.tags = map;
        this.measurements = map2;
        this.metricsSummaries = map3;
        this.data = map4;
    }

    public Double getStartTimestamp() {
        return this.startTimestamp;
    }

    public Double getTimestamp() {
        return this.timestamp;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public String getOp() {
        return this.f6644op;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public void setData(Map<String, Object> map) {
        this.data = map;
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(ObjectWriter objectWriter, ILogger iLogger) throws IOException {
        objectWriter.beginObject();
        objectWriter.name("start_timestamp").value(iLogger, doubleToBigDecimal(this.startTimestamp));
        if (this.timestamp != null) {
            objectWriter.name("timestamp").value(iLogger, doubleToBigDecimal(this.timestamp));
        }
        objectWriter.name("trace_id").value(iLogger, this.traceId);
        objectWriter.name("span_id").value(iLogger, this.spanId);
        if (this.parentSpanId != null) {
            objectWriter.name("parent_span_id").value(iLogger, this.parentSpanId);
        }
        objectWriter.name("op").value(this.f6644op);
        if (this.description != null) {
            objectWriter.name("description").value(this.description);
        }
        if (this.status != null) {
            objectWriter.name("status").value(iLogger, this.status);
        }
        if (this.origin != null) {
            objectWriter.name("origin").value(iLogger, this.origin);
        }
        if (!this.tags.isEmpty()) {
            objectWriter.name("tags").value(iLogger, this.tags);
        }
        if (this.data != null) {
            objectWriter.name(WebsocketGatewayConstants.DATA_KEY).value(iLogger, this.data);
        }
        if (!this.measurements.isEmpty()) {
            objectWriter.name("measurements").value(iLogger, this.measurements);
        }
        Map<String, List<MetricSummary>> map = this.metricsSummaries;
        if (map != null && !map.isEmpty()) {
            objectWriter.name("_metrics_summary").value(iLogger, this.metricsSummaries);
        }
        Map<String, Object> map2 = this.unknown;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.unknown.get(str);
                objectWriter.name(str);
                objectWriter.value(iLogger, obj);
            }
        }
        objectWriter.endObject();
    }

    private BigDecimal doubleToBigDecimal(Double d) {
        return BigDecimal.valueOf(d.doubleValue()).setScale(6, RoundingMode.DOWN);
    }

    public void setUnknown(Map<String, Object> map) {
        this.unknown = map;
    }

    public static final class Deserializer implements JsonDeserializer<SentrySpan> {
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map] */
        @Override // io.sentry.JsonDeserializer
        public SentrySpan deserialize(ObjectReader objectReader, ILogger iLogger) throws Exception {
            String strNextName;
            HashMap map;
            objectReader.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            Double dValueOf = null;
            HashMap map2 = null;
            SentryId sentryIdDeserialize = null;
            SpanId spanIdDeserialize = null;
            Map map3 = null;
            String strNextStringOrNull = null;
            Double dValueOf2 = null;
            SpanId spanId = null;
            String strNextStringOrNull2 = null;
            SpanStatus spanStatus = null;
            String strNextStringOrNull3 = null;
            Map mapNextMapOfListOrNull = null;
            Map map4 = null;
            while (true) {
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                Double d = dValueOf;
                HashMap map5 = map2;
                SentryId sentryId = sentryIdDeserialize;
                SpanId spanId2 = spanIdDeserialize;
                if (objectReader.peek() != JsonToken.NAME) {
                    if (d == null) {
                        throw missingRequiredFieldException("start_timestamp", iLogger);
                    }
                    if (sentryId == null) {
                        throw missingRequiredFieldException("trace_id", iLogger);
                    }
                    if (spanId2 == null) {
                        throw missingRequiredFieldException("span_id", iLogger);
                    }
                    if (strNextStringOrNull == null) {
                        throw missingRequiredFieldException("op", iLogger);
                    }
                    HashMap map6 = map5 == null ? new HashMap() : map5;
                    if (map3 == null) {
                        map3 = new HashMap();
                    }
                    SentrySpan sentrySpan = new SentrySpan(d, dValueOf2, sentryId, spanId2, spanId, strNextStringOrNull, strNextStringOrNull2, spanStatus, strNextStringOrNull3, map6, map3, mapNextMapOfListOrNull, map4);
                    sentrySpan.setUnknown(concurrentHashMap2);
                    objectReader.endObject();
                    return sentrySpan;
                }
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "span_id":
                        spanIdDeserialize = new SpanId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map2 = map5;
                        sentryIdDeserialize = sentryId;
                        break;
                    case "parent_span_id":
                        spanId = (SpanId) objectReader.nextOrNull(iLogger, new SpanId.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "description":
                        strNextStringOrNull2 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "start_timestamp":
                        try {
                            dValueOf = objectReader.nextDoubleOrNull();
                        } catch (NumberFormatException unused) {
                            Date dateNextDateOrNull = objectReader.nextDateOrNull(iLogger);
                            dValueOf = dateNextDateOrNull != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "origin":
                        strNextStringOrNull3 = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "status":
                        spanStatus = (SpanStatus) objectReader.nextOrNull(iLogger, new SpanStatus.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "_metrics_summary":
                        mapNextMapOfListOrNull = objectReader.nextMapOfListOrNull(iLogger, new MetricSummary.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "measurements":
                        map3 = objectReader.nextMapOrNull(iLogger, new MeasurementValue.Deserializer());
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "op":
                        strNextStringOrNull = objectReader.nextStringOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "data":
                        map4 = (Map) objectReader.nextObjectOrNull();
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "tags":
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = (Map) objectReader.nextObjectOrNull();
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "timestamp":
                        try {
                            dValueOf2 = objectReader.nextDoubleOrNull();
                        } catch (NumberFormatException unused2) {
                            Date dateNextDateOrNull2 = objectReader.nextDateOrNull(iLogger);
                            dValueOf2 = dateNextDateOrNull2 != null ? Double.valueOf(DateUtils.dateToSeconds(dateNextDateOrNull2)) : null;
                        }
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                    case "trace_id":
                        sentryIdDeserialize = new SentryId.Deserializer().deserialize(objectReader, iLogger);
                        concurrentHashMap = concurrentHashMap2;
                        dValueOf = d;
                        map2 = map5;
                        spanIdDeserialize = spanId2;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        dValueOf = d;
                        map = map5;
                        sentryIdDeserialize = sentryId;
                        map2 = map;
                        spanIdDeserialize = spanId2;
                        break;
                }
            }
        }

        private Exception missingRequiredFieldException(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.log(SentryLevel.ERROR, str2, illegalStateException);
            return illegalStateException;
        }
    }
}

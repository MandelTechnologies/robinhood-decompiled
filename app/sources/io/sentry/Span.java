package io.sentry;

import io.sentry.metrics.LocalMetricsAggregator;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
public final class Span implements ISpan {
    private final SpanContext context;
    private final Map<String, Object> data;
    private boolean finished;
    private final IHub hub;
    private final AtomicBoolean isFinishing;
    private final Map<String, MeasurementValue> measurements;
    private final LazyEvaluator<LocalMetricsAggregator> metricsAggregator;
    private final SpanOptions options;
    private SpanFinishedCallback spanFinishedCallback;
    private SentryDate startTimestamp;
    private Throwable throwable;
    private SentryDate timestamp;
    private final SentryTracer transaction;

    /* renamed from: $r8$lambda$y7Vx_5ALl7ijEz9c_jAoix-ZESo, reason: not valid java name */
    public static /* synthetic */ LocalMetricsAggregator m28516$r8$lambda$y7Vx_5ALl7ijEz9c_jAoixZESo() {
        return new LocalMetricsAggregator();
    }

    Span(SentryId sentryId, SpanId spanId, SentryTracer sentryTracer, String str, IHub iHub, SentryDate sentryDate, SpanOptions spanOptions, SpanFinishedCallback spanFinishedCallback) {
        this.finished = false;
        this.isFinishing = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.measurements = new ConcurrentHashMap();
        this.metricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.Span$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return Span.m28516$r8$lambda$y7Vx_5ALl7ijEz9c_jAoixZESo();
            }
        });
        this.context = new SpanContext(sentryId, new SpanId(), str, spanId, sentryTracer.getSamplingDecision());
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "transaction is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.options = spanOptions;
        this.spanFinishedCallback = spanFinishedCallback;
        if (sentryDate != null) {
            this.startTimestamp = sentryDate;
        } else {
            this.startTimestamp = iHub.getOptions().getDateProvider().now();
        }
    }

    public Span(TransactionContext transactionContext, SentryTracer sentryTracer, IHub iHub, SentryDate sentryDate, SpanOptions spanOptions) {
        this.finished = false;
        this.isFinishing = new AtomicBoolean(false);
        this.data = new ConcurrentHashMap();
        this.measurements = new ConcurrentHashMap();
        this.metricsAggregator = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.Span$$ExternalSyntheticLambda0
            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final Object evaluate() {
                return Span.m28516$r8$lambda$y7Vx_5ALl7ijEz9c_jAoixZESo();
            }
        });
        this.context = (SpanContext) Objects.requireNonNull(transactionContext, "context is required");
        this.transaction = (SentryTracer) Objects.requireNonNull(sentryTracer, "sentryTracer is required");
        this.hub = (IHub) Objects.requireNonNull(iHub, "hub is required");
        this.spanFinishedCallback = null;
        if (sentryDate != null) {
            this.startTimestamp = sentryDate;
        } else {
            this.startTimestamp = iHub.getOptions().getDateProvider().now();
        }
        this.options = spanOptions;
    }

    @Override // io.sentry.ISpan
    public SentryDate getStartDate() {
        return this.startTimestamp;
    }

    @Override // io.sentry.ISpan
    public SentryDate getFinishDate() {
        return this.timestamp;
    }

    public ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter, SpanOptions spanOptions) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2, sentryDate, instrumenter, spanOptions);
    }

    @Override // io.sentry.ISpan
    public ISpan startChild(String str, String str2) {
        if (this.finished) {
            return NoOpSpan.getInstance();
        }
        return this.transaction.startChild(this.context.getSpanId(), str, str2);
    }

    @Override // io.sentry.ISpan
    public void finish() {
        finish(this.context.getStatus());
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus) {
        finish(spanStatus, this.hub.getOptions().getDateProvider().now());
    }

    @Override // io.sentry.ISpan
    public void finish(SpanStatus spanStatus, SentryDate sentryDate) {
        List<Span> directChildren;
        SentryDate sentryDate2;
        if (this.finished || !this.isFinishing.compareAndSet(false, true)) {
            return;
        }
        this.context.setStatus(spanStatus);
        if (sentryDate == null) {
            sentryDate = this.hub.getOptions().getDateProvider().now();
        }
        this.timestamp = sentryDate;
        if (this.options.isTrimStart() || this.options.isTrimEnd()) {
            if (this.transaction.getRoot().getSpanId().equals(getSpanId())) {
                directChildren = this.transaction.getChildren();
            } else {
                directChildren = getDirectChildren();
            }
            SentryDate startDate = null;
            SentryDate finishDate = null;
            for (Span span : directChildren) {
                if (startDate == null || span.getStartDate().isBefore(startDate)) {
                    startDate = span.getStartDate();
                }
                if (finishDate == null || (span.getFinishDate() != null && span.getFinishDate().isAfter(finishDate))) {
                    finishDate = span.getFinishDate();
                }
            }
            if (this.options.isTrimStart() && startDate != null && this.startTimestamp.isBefore(startDate)) {
                updateStartDate(startDate);
            }
            if (this.options.isTrimEnd() && finishDate != null && ((sentryDate2 = this.timestamp) == null || sentryDate2.isAfter(finishDate))) {
                updateEndDate(finishDate);
            }
        }
        Throwable th = this.throwable;
        if (th != null) {
            this.hub.setSpanContext(th, this, this.transaction.getName());
        }
        SpanFinishedCallback spanFinishedCallback = this.spanFinishedCallback;
        if (spanFinishedCallback != null) {
            spanFinishedCallback.execute(this);
        }
        this.finished = true;
    }

    public String getOperation() {
        return this.context.getOperation();
    }

    @Override // io.sentry.ISpan
    public void setDescription(String str) {
        this.context.setDescription(str);
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return this.context.getDescription();
    }

    @Override // io.sentry.ISpan
    public SpanStatus getStatus() {
        return this.context.getStatus();
    }

    @Override // io.sentry.ISpan
    public SpanContext getSpanContext() {
        return this.context;
    }

    @Override // io.sentry.ISpan
    public boolean isFinished() {
        return this.finished;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Boolean isSampled() {
        return this.context.getSampled();
    }

    public Boolean isProfileSampled() {
        return this.context.getProfileSampled();
    }

    public TracesSamplingDecision getSamplingDecision() {
        return this.context.getSamplingDecision();
    }

    public SentryId getTraceId() {
        return this.context.getTraceId();
    }

    public SpanId getSpanId() {
        return this.context.getSpanId();
    }

    public SpanId getParentSpanId() {
        return this.context.getParentSpanId();
    }

    public Map<String, String> getTags() {
        return this.context.getTags();
    }

    @Override // io.sentry.ISpan
    public void setData(String str, Object obj) {
        this.data.put(str, obj);
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number) {
        if (isFinished()) {
            this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, null));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number);
        }
    }

    @Override // io.sentry.ISpan
    public void setMeasurement(String str, Number number, MeasurementUnit measurementUnit) {
        if (isFinished()) {
            this.hub.getOptions().getLogger().log(SentryLevel.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.measurements.put(str, new MeasurementValue(number, measurementUnit.apiName()));
        if (this.transaction.getRoot() != this) {
            this.transaction.setMeasurementFromChild(str, number, measurementUnit);
        }
    }

    public Map<String, MeasurementValue> getMeasurements() {
        return this.measurements;
    }

    @Override // io.sentry.ISpan
    public boolean updateEndDate(SentryDate sentryDate) {
        if (this.timestamp == null) {
            return false;
        }
        this.timestamp = sentryDate;
        return true;
    }

    public LocalMetricsAggregator getLocalMetricsAggregator() {
        return this.metricsAggregator.getValue();
    }

    void setSpanFinishedCallback(SpanFinishedCallback spanFinishedCallback) {
        this.spanFinishedCallback = spanFinishedCallback;
    }

    SpanFinishedCallback getSpanFinishedCallback() {
        return this.spanFinishedCallback;
    }

    private void updateStartDate(SentryDate sentryDate) {
        this.startTimestamp = sentryDate;
    }

    SpanOptions getOptions() {
        return this.options;
    }

    private List<Span> getDirectChildren() {
        ArrayList arrayList = new ArrayList();
        for (Span span : this.transaction.getSpans()) {
            if (span.getParentSpanId() != null && span.getParentSpanId().equals(getSpanId())) {
                arrayList.add(span);
            }
        }
        return arrayList;
    }
}

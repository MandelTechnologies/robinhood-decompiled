package io.sentry;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.sentry.protocol.SentryId;

/* loaded from: classes21.dex */
public final class PropagationContext {
    private Baggage baggage;
    private SpanId parentSpanId;
    private Boolean sampled;
    private SpanId spanId;
    private SentryId traceId;

    public PropagationContext() {
        this(new SentryId(), new SpanId(), null, null, null);
    }

    public PropagationContext(PropagationContext propagationContext) {
        this(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), cloneBaggage(propagationContext.getBaggage()), propagationContext.isSampled());
    }

    private static Baggage cloneBaggage(Baggage baggage) {
        if (baggage != null) {
            return new Baggage(baggage);
        }
        return null;
    }

    public PropagationContext(SentryId sentryId, SpanId spanId, SpanId spanId2, Baggage baggage, Boolean bool) {
        this.traceId = sentryId;
        this.spanId = spanId;
        this.parentSpanId = spanId2;
        this.baggage = baggage;
        this.sampled = bool;
    }

    public SentryId getTraceId() {
        return this.traceId;
    }

    public SpanId getSpanId() {
        return this.spanId;
    }

    public SpanId getParentSpanId() {
        return this.parentSpanId;
    }

    public Baggage getBaggage() {
        return this.baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Boolean isSampled() {
        return this.sampled;
    }

    public TraceContext traceContext() {
        Baggage baggage = this.baggage;
        if (baggage != null) {
            return baggage.toTraceContext();
        }
        return null;
    }

    public SpanContext toSpanContext() {
        SpanContext spanContext = new SpanContext(this.traceId, this.spanId, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, null, null);
        spanContext.setOrigin("auto");
        return spanContext;
    }
}

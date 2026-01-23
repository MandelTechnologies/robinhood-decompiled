package io.sentry;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.Objects;

/* loaded from: classes14.dex */
public final class TransactionContext extends SpanContext {
    private static final TransactionNameSource DEFAULT_NAME_SOURCE = TransactionNameSource.CUSTOM;
    private Baggage baggage;
    private Instrumenter instrumenter;
    private boolean isForNextAppStart;
    private String name;
    private TracesSamplingDecision parentSamplingDecision;
    private TransactionNameSource transactionNameSource;

    public static TransactionContext fromPropagationContext(PropagationContext propagationContext) throws NumberFormatException {
        TracesSamplingDecision tracesSamplingDecision;
        Boolean boolIsSampled = propagationContext.isSampled();
        TracesSamplingDecision tracesSamplingDecision2 = boolIsSampled == null ? null : new TracesSamplingDecision(boolIsSampled);
        Baggage baggage = propagationContext.getBaggage();
        if (baggage != null) {
            baggage.freeze();
            Double sampleRateDouble = baggage.getSampleRateDouble();
            Boolean boolValueOf = Boolean.valueOf(boolIsSampled != null ? boolIsSampled.booleanValue() : false);
            if (sampleRateDouble != null) {
                tracesSamplingDecision = new TracesSamplingDecision(boolValueOf, sampleRateDouble);
            } else {
                tracesSamplingDecision2 = new TracesSamplingDecision(boolValueOf);
                tracesSamplingDecision = tracesSamplingDecision2;
            }
        } else {
            tracesSamplingDecision = tracesSamplingDecision2;
        }
        return new TransactionContext(propagationContext.getTraceId(), propagationContext.getSpanId(), propagationContext.getParentSpanId(), tracesSamplingDecision, baggage);
    }

    public TransactionContext(String str, String str2) {
        this(str, str2, (TracesSamplingDecision) null);
    }

    public TransactionContext(String str, TransactionNameSource transactionNameSource, String str2) {
        this(str, transactionNameSource, str2, null);
    }

    public TransactionContext(String str, String str2, TracesSamplingDecision tracesSamplingDecision) {
        this(str, TransactionNameSource.CUSTOM, str2, tracesSamplingDecision);
    }

    public TransactionContext(String str, TransactionNameSource transactionNameSource, String str2, TracesSamplingDecision tracesSamplingDecision) {
        super(str2);
        this.instrumenter = Instrumenter.SENTRY;
        this.isForNextAppStart = false;
        this.name = (String) Objects.requireNonNull(str, "name is required");
        this.transactionNameSource = transactionNameSource;
        setSamplingDecision(tracesSamplingDecision);
    }

    public TransactionContext(SentryId sentryId, SpanId spanId, SpanId spanId2, TracesSamplingDecision tracesSamplingDecision, Baggage baggage) {
        super(sentryId, spanId, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, spanId2, null);
        this.instrumenter = Instrumenter.SENTRY;
        this.isForNextAppStart = false;
        this.name = "<unlabeled transaction>";
        this.parentSamplingDecision = tracesSamplingDecision;
        this.transactionNameSource = DEFAULT_NAME_SOURCE;
        this.baggage = baggage;
    }

    public String getName() {
        return this.name;
    }

    public TracesSamplingDecision getParentSamplingDecision() {
        return this.parentSamplingDecision;
    }

    public Baggage getBaggage() {
        return this.baggage;
    }

    public TransactionNameSource getTransactionNameSource() {
        return this.transactionNameSource;
    }

    public Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    public void setForNextAppStart(boolean z) {
        this.isForNextAppStart = z;
    }
}

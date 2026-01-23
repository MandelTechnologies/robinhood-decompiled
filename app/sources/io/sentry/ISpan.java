package io.sentry;

/* loaded from: classes21.dex */
public interface ISpan {
    void finish();

    void finish(SpanStatus spanStatus);

    void finish(SpanStatus spanStatus, SentryDate sentryDate);

    String getDescription();

    SentryDate getFinishDate();

    SpanContext getSpanContext();

    SentryDate getStartDate();

    SpanStatus getStatus();

    boolean isFinished();

    void setData(String str, Object obj);

    void setDescription(String str);

    void setMeasurement(String str, Number number);

    void setMeasurement(String str, Number number, MeasurementUnit measurementUnit);

    ISpan startChild(String str, String str2);

    ISpan startChild(String str, String str2, SentryDate sentryDate, Instrumenter instrumenter);

    TraceContext traceContext();

    boolean updateEndDate(SentryDate sentryDate);
}

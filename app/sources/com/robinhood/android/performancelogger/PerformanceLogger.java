package com.robinhood.android.performancelogger;

import com.robinhood.rosetta.eventlogging.ContextActionEvent;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.PerformanceMetricSpanEventData;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: PerformanceLogger.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001.J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0014\u0010\u0017J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0019\u0010\u0017J5\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\t\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\t\u001a\u00020\u001eH&¢\u0006\u0004\b!\u0010 J+\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b$\u0010#J+\u0010%\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b%\u0010#J?\u0010,\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H&¢\u0006\u0004\b,\u0010-¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/PerformanceLogger;", "", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "name", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "source", "Ljava/util/UUID;", "contextualId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "", "beginMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;)V", "Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "trigger", "triggerMetric", "(Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)V", "pauseMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;)V", "resumeMetric", "completeMetric", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "event", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;)V", "failMetric", "abortMetric", "metricName", "metricContextualId", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "skipSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)V", "beginSpan", "completeSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;)V", "failSpan", "abortSpan", "j$/time/Instant", "startTimestamp", "endTimestamp", "", "isFromColdStart", "requiredLocalAuth", "reportStartup", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lj$/time/Instant;Lj$/time/Instant;ZZ)V", "Noop", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface PerformanceLogger {
    void abortMetric(ContextActionEvent event);

    void abortMetric(PerformanceMetricEventData.Name name, UUID contextualId);

    void abortSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName);

    void beginMetric(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, UUID contextualId, PerformanceMetricEventData.Context context);

    void beginSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context);

    void completeMetric(ContextActionEvent event);

    void completeMetric(PerformanceMetricEventData.Name name, UUID contextualId);

    void completeSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName);

    void failMetric(ContextActionEvent event);

    void failMetric(PerformanceMetricEventData.Name name, UUID contextualId);

    void failSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName);

    void pauseMetric(PerformanceMetricEventData.Name name, UUID contextualId);

    void reportStartup(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, Instant startTimestamp, Instant endTimestamp, boolean isFromColdStart, boolean requiredLocalAuth);

    void resumeMetric(PerformanceMetricEventData.Name name, UUID contextualId);

    void skipSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context);

    void triggerMetric(PerformanceMetricTrigger trigger, PerformanceMetricEventData.Source source);

    /* compiled from: PerformanceLogger.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void beginMetric$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, UUID uuid, PerformanceMetricEventData.Context context, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginMetric");
            }
            performanceLogger.beginMetric(name, (i & 2) != 0 ? PerformanceMetricEventData.Source.SOURCE_UNSPECIFIED : source, (i & 4) != 0 ? null : uuid, (i & 8) != 0 ? new PerformanceMetricEventData.Context(false, false, false, null, null, null, null, null, null, null, null, null, 4095, null) : context);
        }

        public static /* synthetic */ void pauseMetric$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pauseMetric");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.pauseMetric(name, uuid);
        }

        public static /* synthetic */ void resumeMetric$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeMetric");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.resumeMetric(name, uuid);
        }

        public static /* synthetic */ void completeMetric$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeMetric");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.completeMetric(name, uuid);
        }

        public static /* synthetic */ void failMetric$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: failMetric");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.failMetric(name, uuid);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void skipSpan$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str, PerformanceMetricSpanEventData.Context context, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: skipSpan");
            }
            ByteString byteString = null;
            Object[] objArr = 0;
            if ((i & 2) != 0) {
                uuid = null;
            }
            if ((i & 8) != 0) {
                context = new PerformanceMetricSpanEventData.Context(false, byteString, 3, objArr == true ? 1 : 0);
            }
            performanceLogger.skipSpan(name, uuid, str, context);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void beginSpan$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str, PerformanceMetricSpanEventData.Context context, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: beginSpan");
            }
            ByteString byteString = null;
            Object[] objArr = 0;
            if ((i & 2) != 0) {
                uuid = null;
            }
            if ((i & 8) != 0) {
                context = new PerformanceMetricSpanEventData.Context(false, byteString, 3, objArr == true ? 1 : 0);
            }
            performanceLogger.beginSpan(name, uuid, str, context);
        }

        public static /* synthetic */ void completeSpan$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: completeSpan");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.completeSpan(name, uuid, str);
        }

        public static /* synthetic */ void failSpan$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: failSpan");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.failSpan(name, uuid, str);
        }

        public static /* synthetic */ void abortSpan$default(PerformanceLogger performanceLogger, PerformanceMetricEventData.Name name, UUID uuid, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: abortSpan");
            }
            if ((i & 2) != 0) {
                uuid = null;
            }
            performanceLogger.abortSpan(name, uuid, str);
        }
    }

    /* compiled from: PerformanceLogger.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J!\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0016\u0010\u0019J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J!\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J1\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010%J)\u0010'\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010%J?\u0010.\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/performancelogger/PerformanceLogger$Noop;", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "<init>", "()V", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;", "name", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;", "source", "Ljava/util/UUID;", "contextualId", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;", "context", "", "beginMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Ljava/util/UUID;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Context;)V", "Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;", "trigger", "triggerMetric", "(Lcom/robinhood/android/performancelogger/PerformanceMetricTrigger;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;)V", "pauseMetric", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;)V", "resumeMetric", "completeMetric", "Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;", "event", "(Lcom/robinhood/rosetta/eventlogging/ContextActionEvent;)V", "failMetric", "abortMetric", "metricName", "metricContextualId", "", "spanName", "Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;", "skipSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricSpanEventData$Context;)V", "beginSpan", "completeSpan", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Ljava/util/UUID;Ljava/lang/String;)V", "failSpan", "abortSpan", "j$/time/Instant", "startTimestamp", "endTimestamp", "", "isFromColdStart", "requiredLocalAuth", "reportStartup", "(Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Name;Lcom/robinhood/rosetta/eventlogging/PerformanceMetricEventData$Source;Lj$/time/Instant;Lj$/time/Instant;ZZ)V", "lib-performance-logger_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Noop implements PerformanceLogger {
        public static final Noop INSTANCE = new Noop();

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void abortMetric(ContextActionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void abortMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void abortSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void beginMetric(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, UUID contextualId, PerformanceMetricEventData.Context context) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void beginSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context) {
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void completeMetric(ContextActionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void completeMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void completeSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void failMetric(ContextActionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void failMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void failSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName) {
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void pauseMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void reportStartup(PerformanceMetricEventData.Name name, PerformanceMetricEventData.Source source, Instant startTimestamp, Instant endTimestamp, boolean isFromColdStart, boolean requiredLocalAuth) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(startTimestamp, "startTimestamp");
            Intrinsics.checkNotNullParameter(endTimestamp, "endTimestamp");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void resumeMetric(PerformanceMetricEventData.Name name, UUID contextualId) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void skipSpan(PerformanceMetricEventData.Name metricName, UUID metricContextualId, String spanName, PerformanceMetricSpanEventData.Context context) {
            Intrinsics.checkNotNullParameter(metricName, "metricName");
            Intrinsics.checkNotNullParameter(spanName, "spanName");
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.robinhood.android.performancelogger.PerformanceLogger
        public void triggerMetric(PerformanceMetricTrigger trigger, PerformanceMetricEventData.Source source) {
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            Intrinsics.checkNotNullParameter(source, "source");
        }

        private Noop() {
        }
    }
}

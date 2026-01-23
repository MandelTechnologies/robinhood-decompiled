package io.sentry.android.core;

import android.os.Looper;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.MeasurementUnit;
import io.sentry.SentryEvent;
import io.sentry.SpanContext;
import io.sentry.SpanId;
import io.sentry.SpanStatus;
import io.sentry.android.core.performance.ActivityLifecycleTimeSpan;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.App;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentrySpan;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
final class PerformanceAndroidEventProcessor implements EventProcessor {
    private final ActivityFramesTracker activityFramesTracker;
    private final SentryAndroidOptions options;
    private boolean sentStartMeasurement = false;

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        return sentryEvent;
    }

    PerformanceAndroidEventProcessor(SentryAndroidOptions sentryAndroidOptions, ActivityFramesTracker activityFramesTracker) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
    }

    @Override // io.sentry.EventProcessor
    public synchronized SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        Map<String, MeasurementValue> mapTakeMetrics;
        String str;
        String str2;
        try {
            if (!this.options.isTracingEnabled()) {
                return sentryTransaction;
            }
            if (hasAppStartSpan(sentryTransaction)) {
                if (!this.sentStartMeasurement) {
                    long durationMs = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options).getDurationMs();
                    if (durationMs != 0) {
                        MeasurementValue measurementValue = new MeasurementValue(Float.valueOf(durationMs), MeasurementUnit.Duration.MILLISECOND.apiName());
                        if (AppStartMetrics.getInstance().getAppStartType() == AppStartMetrics.AppStartType.COLD) {
                            str2 = "app_start_cold";
                        } else {
                            str2 = "app_start_warm";
                        }
                        sentryTransaction.getMeasurements().put(str2, measurementValue);
                        attachColdAppStartSpans(AppStartMetrics.getInstance(), sentryTransaction);
                        this.sentStartMeasurement = true;
                    }
                }
                App app = sentryTransaction.getContexts().getApp();
                if (app == null) {
                    app = new App();
                    sentryTransaction.getContexts().setApp(app);
                }
                if (AppStartMetrics.getInstance().getAppStartType() == AppStartMetrics.AppStartType.COLD) {
                    str = "cold";
                } else {
                    str = "warm";
                }
                app.setStartType(str);
            }
            setContributingFlags(sentryTransaction);
            SentryId eventId = sentryTransaction.getEventId();
            SpanContext trace = sentryTransaction.getContexts().getTrace();
            if (eventId != null && trace != null && trace.getOperation().contentEquals("ui.load") && (mapTakeMetrics = this.activityFramesTracker.takeMetrics(eventId)) != null) {
                sentryTransaction.getMeasurements().putAll(mapTakeMetrics);
            }
            return sentryTransaction;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void setContributingFlags(SentryTransaction sentryTransaction) {
        Object obj;
        SentrySpan sentrySpan = null;
        SentrySpan sentrySpan2 = null;
        for (SentrySpan sentrySpan3 : sentryTransaction.getSpans()) {
            if ("ui.load.initial_display".equals(sentrySpan3.getOp())) {
                sentrySpan = sentrySpan3;
            } else if ("ui.load.full_display".equals(sentrySpan3.getOp())) {
                sentrySpan2 = sentrySpan3;
            }
            if (sentrySpan != null && sentrySpan2 != null) {
                break;
            }
        }
        if (sentrySpan == null && sentrySpan2 == null) {
            return;
        }
        for (SentrySpan sentrySpan4 : sentryTransaction.getSpans()) {
            if (sentrySpan4 != sentrySpan && sentrySpan4 != sentrySpan2) {
                Map<String, Object> data = sentrySpan4.getData();
                boolean z = false;
                boolean z2 = sentrySpan != null && isTimestampWithinSpan(sentrySpan4.getStartTimestamp().doubleValue(), sentrySpan) && (data == null || (obj = data.get("thread.name")) == null || "main".equals(obj));
                if (sentrySpan2 != null && isTimestampWithinSpan(sentrySpan4.getStartTimestamp().doubleValue(), sentrySpan2)) {
                    z = true;
                }
                if (z2 || z) {
                    Map<String, Object> data2 = sentrySpan4.getData();
                    if (data2 == null) {
                        data2 = new ConcurrentHashMap<>();
                        sentrySpan4.setData(data2);
                    }
                    if (z2) {
                        data2.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z) {
                        data2.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    private static boolean isTimestampWithinSpan(double d, SentrySpan sentrySpan) {
        if (d >= sentrySpan.getStartTimestamp().doubleValue()) {
            return sentrySpan.getTimestamp() == null || d <= sentrySpan.getTimestamp().doubleValue();
        }
        return false;
    }

    private boolean hasAppStartSpan(SentryTransaction sentryTransaction) {
        for (SentrySpan sentrySpan : sentryTransaction.getSpans()) {
            if (sentrySpan.getOp().contentEquals("app.start.cold") || sentrySpan.getOp().contentEquals("app.start.warm")) {
                return true;
            }
        }
        SpanContext trace = sentryTransaction.getContexts().getTrace();
        if (trace != null) {
            return trace.getOperation().equals("app.start.cold") || trace.getOperation().equals("app.start.warm");
        }
        return false;
    }

    private void attachColdAppStartSpans(AppStartMetrics appStartMetrics, SentryTransaction sentryTransaction) {
        SpanContext trace;
        SpanId spanId;
        if (appStartMetrics.getAppStartType() == AppStartMetrics.AppStartType.COLD && (trace = sentryTransaction.getContexts().getTrace()) != null) {
            SentryId traceId = trace.getTraceId();
            Iterator<SentrySpan> it = sentryTransaction.getSpans().iterator();
            while (true) {
                if (!it.hasNext()) {
                    spanId = null;
                    break;
                }
                SentrySpan next = it.next();
                if (next.getOp().contentEquals("app.start.cold")) {
                    spanId = next.getSpanId();
                    break;
                }
            }
            long classLoadedUptimeMs = appStartMetrics.getClassLoadedUptimeMs();
            TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
            if (appStartTimeSpan.hasStarted() && Math.abs(classLoadedUptimeMs - appStartTimeSpan.getStartUptimeMs()) <= 10000) {
                TimeSpan timeSpan = new TimeSpan();
                timeSpan.setStartedAt(appStartTimeSpan.getStartUptimeMs());
                timeSpan.setStartUnixTimeMs(appStartTimeSpan.getStartTimestampMs());
                timeSpan.setStoppedAt(classLoadedUptimeMs);
                timeSpan.setDescription("Process Initialization");
                sentryTransaction.getSpans().add(timeSpanToSentrySpan(timeSpan, spanId, traceId, "process.load"));
            }
            List<TimeSpan> contentProviderOnCreateTimeSpans = appStartMetrics.getContentProviderOnCreateTimeSpans();
            if (!contentProviderOnCreateTimeSpans.isEmpty()) {
                Iterator<TimeSpan> it2 = contentProviderOnCreateTimeSpans.iterator();
                while (it2.hasNext()) {
                    sentryTransaction.getSpans().add(timeSpanToSentrySpan(it2.next(), spanId, traceId, "contentprovider.load"));
                }
            }
            TimeSpan applicationOnCreateTimeSpan = appStartMetrics.getApplicationOnCreateTimeSpan();
            if (applicationOnCreateTimeSpan.hasStopped()) {
                sentryTransaction.getSpans().add(timeSpanToSentrySpan(applicationOnCreateTimeSpan, spanId, traceId, "application.load"));
            }
            List<ActivityLifecycleTimeSpan> activityLifecycleTimeSpans = appStartMetrics.getActivityLifecycleTimeSpans();
            if (activityLifecycleTimeSpans.isEmpty()) {
                return;
            }
            for (ActivityLifecycleTimeSpan activityLifecycleTimeSpan : activityLifecycleTimeSpans) {
                if (activityLifecycleTimeSpan.getOnCreate().hasStarted() && activityLifecycleTimeSpan.getOnCreate().hasStopped()) {
                    sentryTransaction.getSpans().add(timeSpanToSentrySpan(activityLifecycleTimeSpan.getOnCreate(), spanId, traceId, "activity.load"));
                }
                if (activityLifecycleTimeSpan.getOnStart().hasStarted() && activityLifecycleTimeSpan.getOnStart().hasStopped()) {
                    sentryTransaction.getSpans().add(timeSpanToSentrySpan(activityLifecycleTimeSpan.getOnStart(), spanId, traceId, "activity.load"));
                }
            }
        }
    }

    private static SentrySpan timeSpanToSentrySpan(TimeSpan timeSpan, SpanId spanId, SentryId sentryId, String str) {
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        return new SentrySpan(Double.valueOf(timeSpan.getStartTimestampSecs()), Double.valueOf(timeSpan.getProjectedStopTimestampSecs()), sentryId, new SpanId(), spanId, str, timeSpan.getDescription(), SpanStatus.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), null, map);
    }
}

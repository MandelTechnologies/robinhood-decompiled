package io.sentry.android.core;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.AndroidMainThreadChecker;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.SentryId;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes21.dex */
public final class ActivityFramesTracker {
    private final Map<SentryId, Map<String, MeasurementValue>> activityMeasurements;
    private final Map<Activity, FrameCounts> frameCountAtStartSnapshots;
    private FrameMetricsAggregator frameMetricsAggregator;
    private final MainLooperHandler handler;
    private final SentryAndroidOptions options;

    public ActivityFramesTracker(LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions, MainLooperHandler mainLooperHandler) {
        this.frameMetricsAggregator = null;
        this.activityMeasurements = new ConcurrentHashMap();
        this.frameCountAtStartSnapshots = new WeakHashMap();
        if (loadClass.isClassAvailable("androidx.core.app.FrameMetricsAggregator", sentryAndroidOptions.getLogger())) {
            this.frameMetricsAggregator = new FrameMetricsAggregator();
        }
        this.options = sentryAndroidOptions;
        this.handler = mainLooperHandler;
    }

    public ActivityFramesTracker(LoadClass loadClass, SentryAndroidOptions sentryAndroidOptions) {
        this(loadClass, sentryAndroidOptions, new MainLooperHandler());
    }

    public boolean isFrameMetricsAggregatorAvailable() {
        return (this.frameMetricsAggregator == null || !this.options.isEnableFramesTracking() || this.options.isEnablePerformanceV2()) ? false : true;
    }

    public synchronized void addActivity(final Activity activity) {
        if (isFrameMetricsAggregatorAvailable()) {
            runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.frameMetricsAggregator.add(activity);
                }
            }, "FrameMetricsAggregator.add");
            snapshotFrameCountsAtStart(activity);
        }
    }

    private void snapshotFrameCountsAtStart(Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts();
        if (frameCountsCalculateCurrentFrameCounts != null) {
            this.frameCountAtStartSnapshots.put(activity, frameCountsCalculateCurrentFrameCounts);
        }
    }

    private FrameCounts calculateCurrentFrameCounts() {
        FrameMetricsAggregator frameMetricsAggregator;
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!isFrameMetricsAggregatorAvailable() || (frameMetricsAggregator = this.frameMetricsAggregator) == null) {
            return null;
        }
        SparseIntArray[] metrics = frameMetricsAggregator.getMetrics();
        int i3 = 0;
        if (metrics == null || metrics.length <= 0 || (sparseIntArray = metrics[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new FrameCounts(i3, i, i2);
    }

    public synchronized void setMetrics(final Activity activity, SentryId sentryId) {
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.frameMetricsAggregator.remove(activity);
                    }
                }, null);
                FrameCounts frameCountsDiffFrameCountsAtEnd = diffFrameCountsAtEnd(activity);
                if (frameCountsDiffFrameCountsAtEnd != null && (frameCountsDiffFrameCountsAtEnd.totalFrames != 0 || frameCountsDiffFrameCountsAtEnd.slowFrames != 0 || frameCountsDiffFrameCountsAtEnd.frozenFrames != 0)) {
                    MeasurementValue measurementValue = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.totalFrames), ApiRenderablePlatforms.VERSIONS_NONE);
                    MeasurementValue measurementValue2 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.slowFrames), ApiRenderablePlatforms.VERSIONS_NONE);
                    MeasurementValue measurementValue3 = new MeasurementValue(Integer.valueOf(frameCountsDiffFrameCountsAtEnd.frozenFrames), ApiRenderablePlatforms.VERSIONS_NONE);
                    HashMap map = new HashMap();
                    map.put("frames_total", measurementValue);
                    map.put("frames_slow", measurementValue2);
                    map.put("frames_frozen", measurementValue3);
                    this.activityMeasurements.put(sentryId, map);
                }
            }
        } finally {
        }
    }

    private FrameCounts diffFrameCountsAtEnd(Activity activity) {
        FrameCounts frameCountsCalculateCurrentFrameCounts;
        FrameCounts frameCountsRemove = this.frameCountAtStartSnapshots.remove(activity);
        if (frameCountsRemove == null || (frameCountsCalculateCurrentFrameCounts = calculateCurrentFrameCounts()) == null) {
            return null;
        }
        return new FrameCounts(frameCountsCalculateCurrentFrameCounts.totalFrames - frameCountsRemove.totalFrames, frameCountsCalculateCurrentFrameCounts.slowFrames - frameCountsRemove.slowFrames, frameCountsCalculateCurrentFrameCounts.frozenFrames - frameCountsRemove.frozenFrames);
    }

    public synchronized Map<String, MeasurementValue> takeMetrics(SentryId sentryId) {
        if (!isFrameMetricsAggregatorAvailable()) {
            return null;
        }
        Map<String, MeasurementValue> map = this.activityMeasurements.get(sentryId);
        this.activityMeasurements.remove(sentryId);
        return map;
    }

    public synchronized void stop() {
        try {
            if (isFrameMetricsAggregatorAvailable()) {
                runSafelyOnUiThread(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.frameMetricsAggregator.stop();
                    }
                }, "FrameMetricsAggregator.stop");
                this.frameMetricsAggregator.reset();
            }
            this.activityMeasurements.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void runSafelyOnUiThread(final Runnable runnable, final String str) {
        try {
            if (AndroidMainThreadChecker.getInstance().isMainThread()) {
                runnable.run();
            } else {
                this.handler.post(new Runnable() { // from class: io.sentry.android.core.ActivityFramesTracker$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityFramesTracker.$r8$lambda$a9u14xH_AaFx5ZbaJ7ErEZzmYZs(this.f$0, runnable, str);
                    }
                });
            }
        } catch (Throwable unused) {
            if (str != null) {
                this.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    public static /* synthetic */ void $r8$lambda$a9u14xH_AaFx5ZbaJ7ErEZzmYZs(ActivityFramesTracker activityFramesTracker, Runnable runnable, String str) {
        activityFramesTracker.getClass();
        try {
            runnable.run();
        } catch (Throwable unused) {
            if (str != null) {
                activityFramesTracker.options.getLogger().log(SentryLevel.WARNING, "Failed to execute " + str, new Object[0]);
            }
        }
    }

    /* loaded from: classes14.dex */
    private static final class FrameCounts {
        private final int frozenFrames;
        private final int slowFrames;
        private final int totalFrames;

        private FrameCounts(int i, int i2, int i3) {
            this.totalFrames = i;
            this.slowFrames = i2;
            this.frozenFrames = i3;
        }
    }
}

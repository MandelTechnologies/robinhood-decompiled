package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p052v1.AndroidMemoryReading;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes27.dex */
public class MemoryGaugeCollector {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    @SuppressLint({"ThreadPoolCreation"})
    MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime;
    }

    public void startCollecting(long j, Timer timer) {
        if (isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.memoryMetricCollectorJob == null) {
            scheduleMemoryMetricCollectionWithRate(j, timer);
        } else if (this.memoryMetricCollectionRateMs != j) {
            stopCollecting();
            scheduleMemoryMetricCollectionWithRate(j, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1L;
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    private synchronized void scheduleMemoryMetricCollectionWithRate(long j, final Timer timer) {
        this.memoryMetricCollectionRateMs = j;
        try {
            this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.MemoryGaugeCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.$r8$lambda$dl0pjO6zIS8HMxUGnV2m17RcX4g(this.f$0, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.warn("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public static /* synthetic */ void $r8$lambda$dl0pjO6zIS8HMxUGnV2m17RcX4g(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = memoryGaugeCollector.syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            memoryGaugeCollector.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    private synchronized void scheduleMemoryMetricCollectionOnce(final Timer timer) {
        try {
            this.memoryMetricCollectorExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.MemoryGaugeCollector$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MemoryGaugeCollector.$r8$lambda$f0_p5RgN1QfRBbhNu32lt9x2DAI(this.f$0, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.warn("Unable to collect Memory Metric: " + e.getMessage());
        }
    }

    public static /* synthetic */ void $r8$lambda$f0_p5RgN1QfRBbhNu32lt9x2DAI(MemoryGaugeCollector memoryGaugeCollector, Timer timer) {
        AndroidMemoryReading androidMemoryReadingSyncCollectMemoryMetric = memoryGaugeCollector.syncCollectMemoryMetric(timer);
        if (androidMemoryReadingSyncCollectMemoryMetric != null) {
            memoryGaugeCollector.memoryMetricReadings.add(androidMemoryReadingSyncCollectMemoryMetric);
        }
    }

    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }
}

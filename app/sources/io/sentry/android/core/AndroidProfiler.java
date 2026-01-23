package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.CpuCollectionData;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.MemoryCollectionData;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes21.dex */
public class AndroidProfiler {
    private final BuildInfoProvider buildInfoProvider;
    private final ISentryExecutorService executorService;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private String frameMetricsCollectorId;
    private final int intervalUs;
    private final ILogger logger;
    private final File traceFilesDir;
    private long profileStartNanos = 0;
    private Future<?> scheduledFinish = null;
    private File traceFile = null;
    private final ArrayDeque<ProfileMeasurementValue> screenFrameRateMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> slowFrameRenderMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> frozenFrameRenderMeasurements = new ArrayDeque<>();
    private final Map<String, ProfileMeasurement> measurementsMap = new HashMap();
    private boolean isRunning = false;

    /* loaded from: classes14.dex */
    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;
        public final Date startTimestamp;

        public ProfileStartData(long j, long j2, Date date) {
            this.startNanos = j;
            this.startCpuMillis = j2;
            this.startTimestamp = date;
        }
    }

    /* loaded from: classes14.dex */
    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;
        public final Map<String, ProfileMeasurement> measurementsMap;
        public final File traceFile;

        public ProfileEndData(long j, long j2, boolean z, File file, Map<String, ProfileMeasurement> map) {
            this.endNanos = j;
            this.traceFile = file;
            this.endCpuMillis = j2;
            this.measurementsMap = map;
            this.didTimeout = z;
        }
    }

    public AndroidProfiler(String str, int i, SentryFrameMetricsCollector sentryFrameMetricsCollector, ISentryExecutorService iSentryExecutorService, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this.traceFilesDir = new File((String) Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.executorService = (ISentryExecutorService) Objects.requireNonNull(iSentryExecutorService, "ExecutorService is required.");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
    }

    @SuppressLint({"NewApi"})
    public synchronized ProfileStartData start() {
        int i = this.intervalUs;
        if (i == 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
            return null;
        }
        if (this.isRunning) {
            this.logger.log(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return null;
        }
        this.traceFile = new File(this.traceFilesDir, UUID.randomUUID() + ".trace");
        this.measurementsMap.clear();
        this.screenFrameRateMeasurements.clear();
        this.slowFrameRenderMeasurements.clear();
        this.frozenFrameRenderMeasurements.clear();
        this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
            float lastRefreshRate = 0.0f;

            @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
            public void onFrameMetricCollected(long j, long j2, long j3, long j4, boolean z, boolean z2, float f) {
                long jNanoTime = ((j2 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - AndroidProfiler.this.profileStartNanos;
                if (jNanoTime < 0) {
                    return;
                }
                if (z2) {
                    AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Long.valueOf(j3)));
                } else if (z) {
                    AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Long.valueOf(j3)));
                }
                if (f != this.lastRefreshRate) {
                    this.lastRefreshRate = f;
                    AndroidProfiler.this.screenFrameRateMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Float.valueOf(f)));
                }
            }
        });
        try {
            this.scheduledFinish = this.executorService.schedule(new Runnable() { // from class: io.sentry.android.core.AndroidProfiler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.endAndCollect(true, null);
                }
            }, 30000L);
        } catch (RejectedExecutionException e) {
            this.logger.log(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
        }
        this.profileStartNanos = SystemClock.elapsedRealtimeNanos();
        Date currentDateTime = DateUtils.getCurrentDateTime();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.traceFile.getPath(), 3000000, this.intervalUs);
            this.isRunning = true;
            return new ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
        } catch (Throwable th) {
            endAndCollect(false, null);
            this.logger.log(SentryLevel.ERROR, "Unable to start a profile: ", th);
            this.isRunning = false;
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0018, B:16:0x0027, B:21:0x0035, B:23:0x0048, B:26:0x0055, B:28:0x005d, B:29:0x006d, B:31:0x0075, B:32:0x0085, B:34:0x008d, B:35:0x009d, B:37:0x00a4, B:38:0x00aa, B:43:0x00b8, B:44:0x00ba, B:19:0x002b, B:15:0x0024), top: B:47:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[Catch: all -> 0x0014, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:10:0x0018, B:16:0x0027, B:21:0x0035, B:23:0x0048, B:26:0x0055, B:28:0x005d, B:29:0x006d, B:31:0x0075, B:32:0x0085, B:34:0x008d, B:35:0x009d, B:37:0x00a4, B:38:0x00aa, B:43:0x00b8, B:44:0x00ba, B:19:0x002b, B:15:0x0024), top: B:47:0x0001, inners: #1, #2 }] */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized ProfileEndData endAndCollect(boolean z, List<PerformanceCollectionData> list) {
        if (!this.isRunning) {
            this.logger.log(SentryLevel.WARNING, "Profiler not running", new Object[0]);
            return null;
        }
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return null;
        }
        try {
            Debug.stopMethodTracing();
        } finally {
            try {
                this.isRunning = false;
                this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long elapsedCpuTime = Process.getElapsedCpuTime();
                if (this.traceFile != null) {
                }
            } catch (Throwable th) {
            }
        }
        this.isRunning = false;
        this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime2 = Process.getElapsedCpuTime();
        if (this.traceFile != null) {
            this.logger.log(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
            return null;
        }
        if (!this.slowFrameRenderMeasurements.isEmpty()) {
            this.measurementsMap.put("slow_frame_renders", new ProfileMeasurement("nanosecond", this.slowFrameRenderMeasurements));
        }
        if (!this.frozenFrameRenderMeasurements.isEmpty()) {
            this.measurementsMap.put("frozen_frame_renders", new ProfileMeasurement("nanosecond", this.frozenFrameRenderMeasurements));
        }
        if (!this.screenFrameRateMeasurements.isEmpty()) {
            this.measurementsMap.put("screen_frame_rates", new ProfileMeasurement("hz", this.screenFrameRateMeasurements));
        }
        putPerformanceCollectionDataInMeasurements(list);
        Future<?> future = this.scheduledFinish;
        if (future != null) {
            future.cancel(true);
            this.scheduledFinish = null;
        }
        return new ProfileEndData(jElapsedRealtimeNanos2, elapsedCpuTime2, z, this.traceFile, this.measurementsMap);
    }

    public synchronized void close() {
        try {
            Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            if (this.isRunning) {
                endAndCollect(true, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"NewApi"})
    private void putPerformanceCollectionDataInMeasurements(List<PerformanceCollectionData> list) {
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return;
        }
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (PerformanceCollectionData performanceCollectionData : list) {
                        CpuCollectionData cpuData = performanceCollectionData.getCpuData();
                        MemoryCollectionData memoryData = performanceCollectionData.getMemoryData();
                        if (cpuData != null) {
                            arrayDeque3.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(cpuData.getTimestampMillis()) + jElapsedRealtimeNanos), Double.valueOf(cpuData.getCpuUsagePercentage())));
                        }
                        if (memoryData != null && memoryData.getUsedHeapMemory() > -1) {
                            arrayDeque.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), Long.valueOf(memoryData.getUsedHeapMemory())));
                        }
                        if (memoryData != null && memoryData.getUsedNativeMemory() > -1) {
                            arrayDeque2.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), Long.valueOf(memoryData.getUsedNativeMemory())));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put("cpu_usage", new ProfileMeasurement("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put("memory_footprint", new ProfileMeasurement("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put("memory_native_footprint", new ProfileMeasurement("byte", arrayDeque2));
        }
    }
}

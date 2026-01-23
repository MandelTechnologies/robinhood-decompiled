package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.p052v1.CpuMetricReading;
import com.google.firebase.perf.util.Timer;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes27.dex */
public class CpuGaugeCollector {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private static final long MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1);
    private ScheduledFuture cpuMetricCollectorJob = null;
    private long cpuMetricCollectionRateMs = -1;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings = new ConcurrentLinkedQueue<>();
    private final ScheduledExecutorService cpuMetricCollectorExecutor = Executors.newSingleThreadScheduledExecutor();
    private final String procFileName = "/proc/" + Integer.toString(Process.myPid()) + "/stat";
    private final long clockTicksPerSecond = getClockTicksPerSecond();

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    @SuppressLint({"ThreadPoolCreation"})
    CpuGaugeCollector() {
    }

    public void startCollecting(long j, Timer timer) {
        long j2 = this.clockTicksPerSecond;
        if (j2 == -1 || j2 == 0 || isInvalidCollectionFrequency(j)) {
            return;
        }
        if (this.cpuMetricCollectorJob == null) {
            scheduleCpuMetricCollectionWithRate(j, timer);
        } else if (this.cpuMetricCollectionRateMs != j) {
            stopCollecting();
            scheduleCpuMetricCollectionWithRate(j, timer);
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.cpuMetricCollectorJob = null;
        this.cpuMetricCollectionRateMs = -1L;
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    private synchronized void scheduleCpuMetricCollectionWithRate(long j, final Timer timer) {
        this.cpuMetricCollectionRateMs = j;
        try {
            this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.CpuGaugeCollector$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    CpuGaugeCollector.$r8$lambda$QQFFHS8Kdxr3noN8IopW3Dwb7e8(this.f$0, timer);
                }
            }, 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.warn("Unable to start collecting Cpu Metrics: " + e.getMessage());
        }
    }

    public static /* synthetic */ void $r8$lambda$QQFFHS8Kdxr3noN8IopW3Dwb7e8(CpuGaugeCollector cpuGaugeCollector, Timer timer) throws IOException {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = cpuGaugeCollector.syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            cpuGaugeCollector.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    private synchronized void scheduleCpuMetricCollectionOnce(final Timer timer) {
        try {
            this.cpuMetricCollectorExecutor.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.CpuGaugeCollector$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    CpuGaugeCollector.m9289$r8$lambda$wTNg2DvwfCSql5_iOKTjDQUDM(this.f$0, timer);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.warn("Unable to collect Cpu Metric: " + e.getMessage());
        }
    }

    /* renamed from: $r8$lambda$wTNg2Dv-wfCSql5_iOKTjD-QUDM, reason: not valid java name */
    public static /* synthetic */ void m9289$r8$lambda$wTNg2DvwfCSql5_iOKTjDQUDM(CpuGaugeCollector cpuGaugeCollector, Timer timer) throws IOException {
        CpuMetricReading cpuMetricReadingSyncCollectCpuMetric = cpuGaugeCollector.syncCollectCpuMetric(timer);
        if (cpuMetricReadingSyncCollectCpuMetric != null) {
            cpuGaugeCollector.cpuMetricReadings.add(cpuMetricReadingSyncCollectCpuMetric);
        }
    }

    private CpuMetricReading syncCollectCpuMetric(Timer timer) throws IOException {
        if (timer == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            try {
                long currentTimestampMicros = timer.getCurrentTimestampMicros();
                String[] strArrSplit = bufferedReader.readLine().split(PlaceholderUtils.XXShortPlaceholderText);
                CpuMetricReading cpuMetricReadingBuild = CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[16]))).setUserTimeUs(convertClockTicksToMicroseconds(Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[15]))).build();
                bufferedReader.close();
                return cpuMetricReadingBuild;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            logger.warn("Unable to read 'proc/[pid]/stat' file: " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e2) {
            e = e2;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e4) {
            e = e4;
            logger.warn("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    private long convertClockTicksToMicroseconds(long j) {
        return Math.round((j / this.clockTicksPerSecond) * MICROSECONDS_PER_SECOND);
    }
}

package io.bitdrift.capture.events.performance;

import com.robinhood.models.card.p311db.Card;
import io.bitdrift.capture.ErrorHandler;
import io.bitdrift.capture.IResourceUtilizationTarget;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.common.DefaultClock;
import io.bitdrift.capture.common.IClock;
import io.bitdrift.capture.events.common.PowerMonitor;
import io.bitdrift.capture.providers.FieldProvider3;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;

/* compiled from: ResourceUtilizationTarget.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/ResourceUtilizationTarget;", "Lio/bitdrift/capture/IResourceUtilizationTarget;", "memoryMetricsProvider", "Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;", "batteryMonitor", "Lio/bitdrift/capture/events/performance/BatteryMonitor;", "powerMonitor", "Lio/bitdrift/capture/events/common/PowerMonitor;", "diskUsageMonitor", "Lio/bitdrift/capture/events/performance/DiskUsageMonitor;", "errorHandler", "Lio/bitdrift/capture/ErrorHandler;", "logger", "Lio/bitdrift/capture/LoggerImpl;", "executor", "Ljava/util/concurrent/ExecutorService;", Card.Icon.CLOCK, "Lio/bitdrift/capture/common/IClock;", "(Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;Lio/bitdrift/capture/events/performance/BatteryMonitor;Lio/bitdrift/capture/events/common/PowerMonitor;Lio/bitdrift/capture/events/performance/DiskUsageMonitor;Lio/bitdrift/capture/ErrorHandler;Lio/bitdrift/capture/LoggerImpl;Ljava/util/concurrent/ExecutorService;Lio/bitdrift/capture/common/IClock;)V", "logMemoryPressure", "", "memAttributes", "", "", "tick", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ResourceUtilizationTarget implements IResourceUtilizationTarget {
    private final BatteryMonitor batteryMonitor;
    private final IClock clock;
    private final DiskUsageMonitor diskUsageMonitor;
    private final ErrorHandler errorHandler;
    private final ExecutorService executor;
    private final LoggerImpl logger;
    private final IMemoryMetricsProvider memoryMetricsProvider;
    private final PowerMonitor powerMonitor;

    public ResourceUtilizationTarget(IMemoryMetricsProvider memoryMetricsProvider, BatteryMonitor batteryMonitor, PowerMonitor powerMonitor, DiskUsageMonitor diskUsageMonitor, ErrorHandler errorHandler, LoggerImpl logger, ExecutorService executor, IClock clock) {
        Intrinsics.checkNotNullParameter(memoryMetricsProvider, "memoryMetricsProvider");
        Intrinsics.checkNotNullParameter(batteryMonitor, "batteryMonitor");
        Intrinsics.checkNotNullParameter(powerMonitor, "powerMonitor");
        Intrinsics.checkNotNullParameter(diskUsageMonitor, "diskUsageMonitor");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.memoryMetricsProvider = memoryMetricsProvider;
        this.batteryMonitor = batteryMonitor;
        this.powerMonitor = powerMonitor;
        this.diskUsageMonitor = diskUsageMonitor;
        this.errorHandler = errorHandler;
        this.logger = logger;
        this.executor = executor;
        this.clock = clock;
    }

    public /* synthetic */ ResourceUtilizationTarget(IMemoryMetricsProvider iMemoryMetricsProvider, BatteryMonitor batteryMonitor, PowerMonitor powerMonitor, DiskUsageMonitor diskUsageMonitor, ErrorHandler errorHandler, LoggerImpl loggerImpl, ExecutorService executorService, IClock iClock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iMemoryMetricsProvider, batteryMonitor, powerMonitor, diskUsageMonitor, errorHandler, loggerImpl, executorService, (i & 128) != 0 ? DefaultClock.INSTANCE.getInstance() : iClock);
    }

    @Override // io.bitdrift.capture.IResourceUtilizationTarget
    public void tick() {
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.events.performance.ResourceUtilizationTarget.tick.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    long jElapsedRealtime = ResourceUtilizationTarget.this.clock.elapsedRealtime();
                    Map<String, String> memoryAttributes = ResourceUtilizationTarget.this.memoryMetricsProvider.getMemoryAttributes();
                    ResourceUtilizationTarget resourceUtilizationTarget = ResourceUtilizationTarget.this;
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.putAll(memoryAttributes);
                    mapCreateMapBuilder.putAll(resourceUtilizationTarget.diskUsageMonitor.getDiskUsage());
                    ResourceUtilizationTarget2.putPair(mapCreateMapBuilder, resourceUtilizationTarget.batteryMonitor.batteryPercentageAttribute());
                    ResourceUtilizationTarget2.putPair(mapCreateMapBuilder, resourceUtilizationTarget.batteryMonitor.isBatteryChargingAttribute());
                    ResourceUtilizationTarget2.putPair(mapCreateMapBuilder, resourceUtilizationTarget.powerMonitor.isPowerSaveModeEnabledAttribute());
                    ResourceUtilizationTarget.this.logger.m3294x27ecc707(MapsKt.build(mapCreateMapBuilder), Duration3.toDuration(ResourceUtilizationTarget.this.clock.elapsedRealtime() - jElapsedRealtime, DurationUnitJvm.MILLISECONDS));
                    if (ResourceUtilizationTarget.this.memoryMetricsProvider.isMemoryLow()) {
                        ResourceUtilizationTarget.this.logMemoryPressure(memoryAttributes);
                    }
                } catch (Throwable th) {
                    ResourceUtilizationTarget.this.errorHandler.handleError("resource utilization tick", th);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logMemoryPressure(Map<String, String> memAttributes) {
        LoggerImpl.logFields$default(this.logger, LogType.LIFECYCLE, LogLevel.WARNING, FieldProvider3.toFields(memAttributes), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.performance.ResourceUtilizationTarget.logMemoryPressure.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "AppMemPressure";
            }
        }, 56, null);
    }
}

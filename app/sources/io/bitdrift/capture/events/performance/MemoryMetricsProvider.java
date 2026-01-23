package io.bitdrift.capture.events.performance;

import android.app.ActivityManager;
import android.os.Debug;
import com.singular.sdk.internal.Constants;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MemoryMetricsProvider.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0014\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\f\u0010\u001e\u001a\u00020\u0014*\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/MemoryMetricsProvider;", "Lio/bitdrift/capture/events/performance/IMemoryMetricsProvider;", "activityManager", "Landroid/app/ActivityManager;", "(Landroid/app/ActivityManager;)V", "memoryThresholdBytes", "", "getMemoryThresholdBytes", "()J", "memoryThresholdBytes$delegate", "Lkotlin/Lazy;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "getRuntime", "()Lio/bitdrift/capture/common/Runtime;", "setRuntime", "(Lio/bitdrift/capture/common/Runtime;)V", "allocatedNativeHeapSizeBytes", "getMemoryAttributes", "", "", "getMemoryClass", "isMemoryLow", "", "maxJvmMemoryBytes", "memoryClassMB", "", "totalJvmMemoryBytes", "totalNativeHeapSizeBytes", "usedJvmMemoryBytes", "bToKb", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MemoryMetricsProvider implements IMemoryMetricsProvider {
    private final ActivityManager activityManager;

    /* renamed from: memoryThresholdBytes$delegate, reason: from kotlin metadata */
    private final Lazy memoryThresholdBytes;
    private Runtime runtime;

    public MemoryMetricsProvider(ActivityManager activityManager) {
        Intrinsics.checkNotNullParameter(activityManager, "activityManager");
        this.activityManager = activityManager;
        this.memoryThresholdBytes = LazyKt.lazy(new Function0<Long>() { // from class: io.bitdrift.capture.events.performance.MemoryMetricsProvider$memoryThresholdBytes$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                long j;
                Runtime runtime = this.this$0.getRuntime();
                if (runtime == null || runtime.isEnabled(Runtime3.APP_MEMORY_PRESSURE.INSTANCE)) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    this.this$0.activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.threshold;
                } else {
                    j = Long.MAX_VALUE;
                }
                return Long.valueOf(j);
            }
        });
    }

    public final Runtime getRuntime() {
        return this.runtime;
    }

    public final void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    private final long getMemoryThresholdBytes() {
        return ((Number) this.memoryThresholdBytes.getValue()).longValue();
    }

    @Override // io.bitdrift.capture.events.performance.IMemoryMetricsProvider
    public Map<String, String> getMemoryAttributes() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_jvm_used_kb", bToKb(usedJvmMemoryBytes()));
        mapCreateMapBuilder.put("_jvm_total_kb", bToKb(totalJvmMemoryBytes()));
        mapCreateMapBuilder.put("_jvm_max_kb", bToKb(maxJvmMemoryBytes()));
        mapCreateMapBuilder.put("_native_used_kb", bToKb(allocatedNativeHeapSizeBytes()));
        mapCreateMapBuilder.put("_native_total_kb", bToKb(totalNativeHeapSizeBytes()));
        mapCreateMapBuilder.put("_memory_class", String.valueOf(memoryClassMB()));
        Long lValueOf = Long.valueOf(getMemoryThresholdBytes());
        if (lValueOf.longValue() == Long.MAX_VALUE) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            mapCreateMapBuilder.put("_threshold_mem_kb", bToKb(getMemoryThresholdBytes()));
            mapCreateMapBuilder.put("_is_memory_low", isMemoryLow() ? Constants.SdidMigrationStatusCodes.ALREADY_SDID : "0");
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // io.bitdrift.capture.events.performance.IMemoryMetricsProvider
    public Map<String, String> getMemoryClass() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_memory_class", String.valueOf(memoryClassMB()));
        return MapsKt.build(mapCreateMapBuilder);
    }

    @Override // io.bitdrift.capture.events.performance.IMemoryMetricsProvider
    public boolean isMemoryLow() {
        return usedJvmMemoryBytes() + allocatedNativeHeapSizeBytes() > getMemoryThresholdBytes();
    }

    private final String bToKb(long j) {
        return String.valueOf(j / 1024);
    }

    private final long totalJvmMemoryBytes() {
        return Runtime.getRuntime().totalMemory();
    }

    private final long usedJvmMemoryBytes() {
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    private final long maxJvmMemoryBytes() {
        return Runtime.getRuntime().maxMemory();
    }

    private final long allocatedNativeHeapSizeBytes() {
        return Debug.getNativeHeapAllocatedSize();
    }

    private final long totalNativeHeapSizeBytes() {
        return Debug.getNativeHeapSize();
    }

    private final int memoryClassMB() {
        return this.activityManager.getMemoryClass();
    }
}

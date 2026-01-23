package io.bitdrift.capture.events.performance;

import android.content.Context;
import com.robinhood.models.card.p311db.Card;
import io.bitdrift.capture.IPreferences;
import io.bitdrift.capture.common.DefaultClock;
import io.bitdrift.capture.common.IClock;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DiskUsageMonitor.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/DiskUsageMonitor;", "", "Lio/bitdrift/capture/IPreferences;", "preferences", "Landroid/content/Context;", "context", "Lio/bitdrift/capture/common/IClock;", Card.Icon.CLOCK, "<init>", "(Lio/bitdrift/capture/IPreferences;Landroid/content/Context;Lio/bitdrift/capture/common/IClock;)V", "Ljava/io/File;", "file", "", "calculateCumulativeSize", "(Ljava/io/File;)J", "", "", "getDiskUsage", "()Ljava/util/Map;", "Lio/bitdrift/capture/IPreferences;", "Landroid/content/Context;", "Lio/bitdrift/capture/common/IClock;", "Lio/bitdrift/capture/common/Runtime;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "getRuntime", "()Lio/bitdrift/capture/common/Runtime;", "setRuntime", "(Lio/bitdrift/capture/common/Runtime;)V", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DiskUsageMonitor {
    private final IClock clock;
    private final Context context;
    private final IPreferences preferences;
    private Runtime runtime;

    public DiskUsageMonitor(IPreferences preferences, Context context, IClock clock) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.preferences = preferences;
        this.context = context;
        this.clock = clock;
    }

    public /* synthetic */ DiskUsageMonitor(IPreferences iPreferences, Context context, IClock iClock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iPreferences, context, (i & 4) != 0 ? DefaultClock.INSTANCE.getInstance() : iClock);
    }

    public final void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    public final Map<String, String> getDiskUsage() {
        Runtime runtime = this.runtime;
        if (runtime != null && !runtime.isEnabled(Runtime3.DISK_USAGE_FIELDS.INSTANCE)) {
            return MapsKt.emptyMap();
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        Long l = this.preferences.getLong("lastAppDiskUsageEventEmissionTime");
        if (l != null && jElapsedRealtime - l.longValue() < 86400000) {
            return MapsKt.emptyMap();
        }
        File cacheDir = this.context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
        long jCalculateCumulativeSize = calculateCumulativeSize(cacheDir);
        File filesDir = this.context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        long jCalculateCumulativeSize2 = calculateCumulativeSize(filesDir);
        File externalCacheDir = this.context.getExternalCacheDir();
        Long lValueOf = externalCacheDir != null ? Long.valueOf(calculateCumulativeSize(externalCacheDir)) : null;
        File externalFilesDir = this.context.getExternalFilesDir(null);
        Long lValueOf2 = externalFilesDir != null ? Long.valueOf(calculateCumulativeSize(externalFilesDir)) : null;
        this.preferences.setLong("lastAppDiskUsageEventEmissionTime", jElapsedRealtime);
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("_cache_dir_size_bytes", String.valueOf(jCalculateCumulativeSize));
        mapCreateMapBuilder.put("_files_dir_size_bytes", String.valueOf(jCalculateCumulativeSize2));
        if (lValueOf != null) {
        }
        if (lValueOf2 != null) {
            mapCreateMapBuilder.put("_external_files_dir_size_bytes", String.valueOf(lValueOf2.longValue()));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private final long calculateCumulativeSize(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            long jCalculateCumulativeSize = 0;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    Intrinsics.checkNotNull(file2);
                    jCalculateCumulativeSize += calculateCumulativeSize(file2);
                }
            }
            return jCalculateCumulativeSize;
        }
        return file.length();
    }
}

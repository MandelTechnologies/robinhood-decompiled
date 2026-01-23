package io.bitdrift.capture.events.common;

import android.content.Context;
import android.os.PowerManager;
import com.singular.sdk.internal.Constants;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PowerMonitor.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lio/bitdrift/capture/events/common/PowerMonitor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "powerManager", "Landroid/os/PowerManager;", "getPowerManager", "()Landroid/os/PowerManager;", "thermalStatusMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "isPowerSaveModeEnabledAttribute", "Lkotlin/Pair;", "toThermalStatusString", "thermalStatus", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PowerMonitor {
    private final PowerManager powerManager;
    private final HashMap<Integer, String> thermalStatusMap;

    public PowerMonitor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("power");
        this.powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        this.thermalStatusMap = MapsKt.hashMapOf(Tuples4.m3642to(0, "NONE"), Tuples4.m3642to(1, "LIGHT"), Tuples4.m3642to(2, "MODERATE"), Tuples4.m3642to(3, "SEVERE"), Tuples4.m3642to(4, "CRITICAL"), Tuples4.m3642to(5, "EMERGENCY"), Tuples4.m3642to(6, "SHUTDOWN"));
    }

    public final PowerManager getPowerManager() {
        return this.powerManager;
    }

    public final String toThermalStatusString(int thermalStatus) {
        String str = this.thermalStatusMap.get(Integer.valueOf(thermalStatus));
        return str == null ? "UNKNOWN" : str;
    }

    public final Tuples2<String, String> isPowerSaveModeEnabledAttribute() {
        PowerManager powerManager = this.powerManager;
        return new Tuples2<>("_low_power_enabled", (powerManager == null || !powerManager.isPowerSaveMode()) ? "0" : Constants.SdidMigrationStatusCodes.ALREADY_SDID);
    }
}

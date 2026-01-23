package io.bitdrift.capture.events.performance;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BatteryMonitor.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nJ\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lio/bitdrift/capture/events/performance/BatteryMonitor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "batteryManager", "Landroid/os/BatteryManager;", "batteryPercentage", "", "batteryPercentageAttribute", "Lkotlin/Pair;", "", "isBatteryCharging", "", "isBatteryChargingAttribute", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class BatteryMonitor {
    private final BatteryManager batteryManager;
    private final Context context;

    public BatteryMonitor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        Object systemService = context.getSystemService("batterymanager");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.batteryManager = (BatteryManager) systemService;
    }

    public final Tuples2<String, String> batteryPercentageAttribute() {
        return Tuples4.m3642to("_battery_val", String.valueOf(batteryPercentage()));
    }

    public final Tuples2<String, String> isBatteryChargingAttribute() {
        return new Tuples2<>("_state", isBatteryCharging() ? "charging" : "unplugged");
    }

    private final boolean isBatteryCharging() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1;
        return intExtra == 2 || intExtra == 5;
    }

    private final float batteryPercentage() {
        return this.batteryManager.getIntProperty(4) / 100.0f;
    }
}

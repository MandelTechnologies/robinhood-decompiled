package io.bitdrift.capture.events.device;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.PowerManager;
import io.bitdrift.capture.LogLevel;
import io.bitdrift.capture.LogType;
import io.bitdrift.capture.LoggerImpl;
import io.bitdrift.capture.common.Runtime;
import io.bitdrift.capture.common.Runtime3;
import io.bitdrift.capture.events.IEventListenerLogger;
import io.bitdrift.capture.events.common.PowerMonitor;
import io.bitdrift.capture.events.performance.BatteryMonitor;
import io.bitdrift.capture.providers.FieldProvider3;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: DeviceStateListenerLogger.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 +2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001+B5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J$\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0016H\u0003J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\u001aH\u0017J\u001c\u0010$\u001a\u00020\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u0016H\u0016J\b\u0010)\u001a\u00020\u001aH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a0\u00158\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lio/bitdrift/capture/events/device/DeviceStateListenerLogger;", "Landroid/content/BroadcastReceiver;", "Lio/bitdrift/capture/events/IEventListenerLogger;", "Landroid/content/ComponentCallbacks2;", "logger", "Lio/bitdrift/capture/LoggerImpl;", "context", "Landroid/content/Context;", "batteryMonitor", "Lio/bitdrift/capture/events/performance/BatteryMonitor;", "powerMonitor", "Lio/bitdrift/capture/events/common/PowerMonitor;", "runtime", "Lio/bitdrift/capture/common/Runtime;", "executor", "Ljava/util/concurrent/ExecutorService;", "(Lio/bitdrift/capture/LoggerImpl;Landroid/content/Context;Lio/bitdrift/capture/events/performance/BatteryMonitor;Lio/bitdrift/capture/events/common/PowerMonitor;Lio/bitdrift/capture/common/Runtime;Ljava/util/concurrent/ExecutorService;)V", "prevConfig", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/content/res/Configuration;", "thermalCallback", "Lkotlin/reflect/KFunction1;", "", "Lkotlin/ParameterName;", "name", "status", "", "log", "fields", "", "", "message", "logThermalStatusChanged", "onConfigurationChanged", "newConfig", "onLowMemory", "onReceive", "intent", "Landroid/content/Intent;", "onTrimMemory", "level", "start", "stop", "Companion", "platform_jvm_capture-capture_logger_lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DeviceStateListenerLogger extends BroadcastReceiver implements IEventListenerLogger, ComponentCallbacks2 {
    private final BatteryMonitor batteryMonitor;
    private final Context context;
    private final ExecutorService executor;
    private final LoggerImpl logger;
    private final PowerMonitor powerMonitor;
    private AtomicReference<Configuration> prevConfig;
    private final Runtime runtime;
    private final KFunction<Unit> thermalCallback;

    @Override // android.content.ComponentCallbacks
    @Deprecated
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
    }

    public DeviceStateListenerLogger(LoggerImpl logger, Context context, BatteryMonitor batteryMonitor, PowerMonitor powerMonitor, Runtime runtime, ExecutorService executor) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(batteryMonitor, "batteryMonitor");
        Intrinsics.checkNotNullParameter(powerMonitor, "powerMonitor");
        Intrinsics.checkNotNullParameter(runtime, "runtime");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.logger = logger;
        this.context = context;
        this.batteryMonitor = batteryMonitor;
        this.powerMonitor = powerMonitor;
        this.runtime = runtime;
        this.executor = executor;
        this.thermalCallback = new DeviceStateListenerLogger3(this);
        this.prevConfig = new AtomicReference<>(new Configuration(context.getResources().getConfiguration()));
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void start() {
        PowerManager powerManager;
        if (this.runtime.isEnabled(Runtime3.DEVICE_STATE_EVENTS.INSTANCE)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            this.context.registerReceiver(this, intentFilter);
            this.context.registerComponentCallbacks(this);
            if (Build.VERSION.SDK_INT < 29 || (powerManager = this.powerMonitor.getPowerManager()) == null) {
                return;
            }
            powerManager.addThermalStatusListener(this.executor, DeviceStateListenerLogger$$ExternalSyntheticApiModelOutline0.m3298m(new DeviceStateListenerLogger2((Function1) this.thermalCallback)));
        }
    }

    @Override // io.bitdrift.capture.events.IEventListenerLogger
    public void stop() {
        PowerManager powerManager;
        this.context.unregisterReceiver(this);
        this.context.unregisterComponentCallbacks(this);
        if (Build.VERSION.SDK_INT < 29 || (powerManager = this.powerMonitor.getPowerManager()) == null) {
            return;
        }
        powerManager.removeThermalStatusListener(DeviceStateListenerLogger$$ExternalSyntheticApiModelOutline0.m3298m(new DeviceStateListenerLogger2((Function1) this.thermalCallback)));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.events.device.DeviceStateListenerLogger.onReceive.1
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                String action = intent2 != null ? intent2.getAction() : null;
                if (action != null) {
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                this.log(MapsKt.mapOf(Tuples4.m3642to("_state", "unplugged"), this.batteryMonitor.batteryPercentageAttribute()), "BatteryStateChange");
                                break;
                            }
                            break;
                        case 502473491:
                            if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                                DeviceStateListenerLogger deviceStateListenerLogger = this;
                                String stringExtra = intent.getStringExtra("time-zone");
                                if (stringExtra == null) {
                                    stringExtra = "";
                                }
                                deviceStateListenerLogger.log(MapsKt.mapOf(Tuples4.m3642to("_time_zone", stringExtra)), "TimeZoneChange");
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                this.log(MapsKt.mapOf(Tuples4.m3642to("_state", "charging"), this.batteryMonitor.batteryPercentageAttribute()), "BatteryStateChange");
                                break;
                            }
                            break;
                        case 1779291251:
                            if (action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                                DeviceStateListenerLogger deviceStateListenerLogger2 = this;
                                deviceStateListenerLogger2.log(MapsKt.mapOf(deviceStateListenerLogger2.powerMonitor.isPowerSaveModeEnabledAttribute(), this.batteryMonitor.batteryPercentageAttribute(), this.batteryMonitor.isBatteryChargingAttribute()), "BatteryLowPowerMode");
                                break;
                            }
                            break;
                    }
                }
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.executor.execute(new Runnable() { // from class: io.bitdrift.capture.events.device.DeviceStateListenerLogger.onConfigurationChanged.1
            @Override // java.lang.Runnable
            public final void run() {
                int iDiff = newConfig.diff((Configuration) this.prevConfig.get());
                this.prevConfig.set(new Configuration(newConfig));
                if ((iDiff & 128) == 128) {
                    int i = newConfig.orientation;
                    if (i == 2) {
                        this.log(MapsKt.mapOf(Tuples4.m3642to("_orientation", "landscape")), "OrientationChange");
                    } else if (i == 1) {
                        this.log(MapsKt.mapOf(Tuples4.m3642to("_orientation", "portrait")), "OrientationChange");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logThermalStatusChanged(int status) {
        log(MapsKt.mapOf(Tuples4.m3642to("_thermal_state", this.powerMonitor.toThermalStatusString(status))), "ThermalStateChange");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void log(Map<String, String> fields, final String message) {
        LoggerImpl.logFields$default(this.logger, LogType.DEVICE, LogLevel.INFO, FieldProvider3.toFields(fields), null, null, false, new Function0<String>() { // from class: io.bitdrift.capture.events.device.DeviceStateListenerLogger.log.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return message;
            }
        }, 56, null);
    }
}

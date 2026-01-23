package io.bitdrift.capture.events.device;

import android.p010os.PowerManager$OnThermalStatusChangedListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceStateListenerLogger.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.events.device.DeviceStateListenerLogger$sam$android_os_PowerManager_OnThermalStatusChangedListener$0, reason: use source file name */
/* loaded from: classes14.dex */
final class DeviceStateListenerLogger2 implements PowerManager$OnThermalStatusChangedListener {
    private final /* synthetic */ Function1 function;

    DeviceStateListenerLogger2(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final /* synthetic */ void onThermalStatusChanged(int i) {
        this.function.invoke(Integer.valueOf(i));
    }
}

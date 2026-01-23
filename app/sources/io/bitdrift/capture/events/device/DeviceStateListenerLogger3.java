package io.bitdrift.capture.events.device;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DeviceStateListenerLogger.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: io.bitdrift.capture.events.device.DeviceStateListenerLogger$thermalCallback$1, reason: use source file name */
/* loaded from: classes14.dex */
/* synthetic */ class DeviceStateListenerLogger3 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    DeviceStateListenerLogger3(Object obj) {
        super(1, obj, DeviceStateListenerLogger.class, "logThermalStatusChanged", "logThermalStatusChanged(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((DeviceStateListenerLogger) this.receiver).logThermalStatusChanged(i);
    }
}

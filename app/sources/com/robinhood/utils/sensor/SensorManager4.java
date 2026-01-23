package com.robinhood.utils.sensor;

import android.hardware.Sensor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SensorManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/sensor/TestSensorManager;", "Lcom/robinhood/utils/sensor/SensorManager;", "sensorMap", "", "", "Landroid/hardware/Sensor;", "eventsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "<init>", "(Ljava/util/Map;Lkotlinx/coroutines/flow/Flow;)V", "events", "sensor", "samplingPeriodUs", "getDefaultSensor", "type", "getQuaternionFromVector", "", "quaternion", "rotationVector", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.sensor.TestSensorManager, reason: use source file name */
/* loaded from: classes12.dex */
public final class SensorManager4 implements SensorManager {
    private final Flow<float[]> eventsFlow;
    private final Map<Integer, Sensor> sensorMap;

    @Override // com.robinhood.utils.sensor.SensorManager
    public void getQuaternionFromVector(float[] quaternion, float[] rotationVector) {
        Intrinsics.checkNotNullParameter(quaternion, "quaternion");
        Intrinsics.checkNotNullParameter(rotationVector, "rotationVector");
    }

    public SensorManager4(Map<Integer, Sensor> sensorMap, Flow<float[]> eventsFlow) {
        Intrinsics.checkNotNullParameter(sensorMap, "sensorMap");
        Intrinsics.checkNotNullParameter(eventsFlow, "eventsFlow");
        this.sensorMap = sensorMap;
        this.eventsFlow = eventsFlow;
    }

    @Override // com.robinhood.utils.sensor.SensorManager
    public Flow<float[]> events(Sensor sensor, int samplingPeriodUs) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
        return this.eventsFlow;
    }

    @Override // com.robinhood.utils.sensor.SensorManager
    public Sensor getDefaultSensor(int type2) {
        return this.sensorMap.get(Integer.valueOf(type2));
    }
}

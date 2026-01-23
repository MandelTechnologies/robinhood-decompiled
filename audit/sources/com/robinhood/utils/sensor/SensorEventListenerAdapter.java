package com.robinhood.utils.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SensorEventListenerAdapter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/utils/sensor/SensorEventListenerAdapter;", "Landroid/hardware/SensorEventListener2;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onFlushCompleted", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface SensorEventListenerAdapter extends SensorEventListener2 {

    /* compiled from: SensorEventListenerAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static void onAccuracyChanged(SensorEventListenerAdapter sensorEventListenerAdapter, Sensor sensor, int i) {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        }

        public static void onFlushCompleted(SensorEventListenerAdapter sensorEventListenerAdapter, Sensor sensor) {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        }

        public static void onSensorChanged(SensorEventListenerAdapter sensorEventListenerAdapter, SensorEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }
    }

    @Override // android.hardware.SensorEventListener
    void onAccuracyChanged(Sensor sensor, int accuracy);

    @Override // android.hardware.SensorEventListener2
    void onFlushCompleted(Sensor sensor);

    @Override // android.hardware.SensorEventListener
    void onSensorChanged(SensorEvent event);
}

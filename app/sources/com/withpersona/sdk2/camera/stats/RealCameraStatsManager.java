package com.withpersona.sdk2.camera.stats;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealCameraStatsManager.kt */
@Metadata(m3635d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/stats/RealCameraStatsManager;", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "startRecordingState", "()V", "stopRecordingState", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager$CameraStats;", "getCameraStats", "()Lcom/withpersona/sdk2/camera/stats/CameraStatsManager$CameraStats;", "Landroid/hardware/SensorManager;", "sensorManager", "Landroid/hardware/SensorManager;", "Landroid/hardware/Sensor;", "sensor", "Landroid/hardware/Sensor;", "", "measurementsTaken", "J", "", "averageRotationPerMeasurement", "D", "", "isEventListenerRegistered", "Z", "com/withpersona/sdk2/camera/stats/RealCameraStatsManager$sensorEventListener$1", "sensorEventListener", "Lcom/withpersona/sdk2/camera/stats/RealCameraStatsManager$sensorEventListener$1;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class RealCameraStatsManager implements CameraStatsManager {
    private double averageRotationPerMeasurement;
    private boolean isEventListenerRegistered;
    private long measurementsTaken;
    private final Sensor sensor;
    private final RealCameraStatsManager2 sensorEventListener;
    private final SensorManager sensorManager;

    /* JADX WARN: Type inference failed for: r2v4, types: [com.withpersona.sdk2.camera.stats.RealCameraStatsManager$sensorEventListener$1] */
    public RealCameraStatsManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        this.sensor = sensorManager.getDefaultSensor(4);
        this.sensorEventListener = new SensorEventListener() { // from class: com.withpersona.sdk2.camera.stats.RealCameraStatsManager$sensorEventListener$1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent event) {
                float[] fArr;
                if (event == null || (fArr = event.values) == null || fArr.length < 3) {
                    return;
                }
                double dAbs = ((Math.abs(fArr[0]) + Math.abs(fArr[1])) + Math.abs(fArr[2])) / 3.0d;
                RealCameraStatsManager realCameraStatsManager = this.this$0;
                realCameraStatsManager.averageRotationPerMeasurement = ((realCameraStatsManager.averageRotationPerMeasurement * this.this$0.measurementsTaken) + dAbs) / (this.this$0.measurementsTaken + 1);
                this.this$0.measurementsTaken++;
            }
        };
    }

    @Override // com.withpersona.sdk2.camera.stats.CameraStatsManager
    public void startRecordingState() {
        if (this.isEventListenerRegistered) {
            return;
        }
        this.isEventListenerRegistered = true;
        Sensor sensor = this.sensor;
        if (sensor != null) {
            this.sensorManager.registerListener(this.sensorEventListener, sensor, 100000);
        }
    }

    @Override // com.withpersona.sdk2.camera.stats.CameraStatsManager
    public void stopRecordingState() {
        this.sensorManager.unregisterListener(this.sensorEventListener);
    }

    @Override // com.withpersona.sdk2.camera.stats.CameraStatsManager
    public CameraStatsManager.CameraStats getCameraStats() {
        long j = this.measurementsTaken;
        return new CameraStatsManager.CameraStats(j == 0 ? 0.0d : this.averageRotationPerMeasurement / j);
    }
}

package com.robinhood.utils.sensor;

import android.hardware.Sensor;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SensorManager.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\bH&J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/utils/sensor/SensorManager;", "", "events", "Lkotlinx/coroutines/flow/Flow;", "", "sensor", "Landroid/hardware/Sensor;", "samplingPeriodUs", "", "getDefaultSensor", "type", "getQuaternionFromVector", "", "quaternion", "rotationVector", "Companion", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface SensorManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final float GRAVITY_EARTH = 9.80665f;

    Flow<float[]> events(Sensor sensor, int samplingPeriodUs);

    Sensor getDefaultSensor(int type2);

    void getQuaternionFromVector(float[] quaternion, float[] rotationVector);

    /* compiled from: SensorManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/utils/sensor/SensorManager$Companion;", "", "<init>", "()V", "GRAVITY_EARTH", "", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float GRAVITY_EARTH = 9.80665f;

        private Companion() {
        }
    }
}

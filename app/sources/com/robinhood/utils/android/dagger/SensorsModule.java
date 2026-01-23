package com.robinhood.utils.android.dagger;

import android.app.Application;
import com.robinhood.utils.camera.CameraDataManager;
import com.robinhood.utils.camera.CameraDataManager2;
import com.robinhood.utils.sensor.SensorManager;
import com.robinhood.utils.sensor.SensorManager2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SensorsModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/SensorsModule;", "", "<init>", "()V", "provideSensorManager", "Lcom/robinhood/utils/sensor/SensorManager;", "app", "Landroid/app/Application;", "provideCameraDataManager", "Lcom/robinhood/utils/camera/CameraDataManager;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SensorsModule {
    public static final SensorsModule INSTANCE = new SensorsModule();

    private SensorsModule() {
    }

    public final SensorManager provideSensorManager(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        return new SensorManager2(app);
    }

    public final CameraDataManager provideCameraDataManager() {
        return new CameraDataManager2();
    }
}

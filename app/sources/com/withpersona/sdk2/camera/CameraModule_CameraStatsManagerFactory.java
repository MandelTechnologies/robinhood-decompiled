package com.withpersona.sdk2.camera;

import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes26.dex */
public final class CameraModule_CameraStatsManagerFactory implements Factory<CameraStatsManager> {
    private final CameraModule module;
    private final Provider<RealCameraStatsManager> realCameraStatsManagerProvider;

    public CameraModule_CameraStatsManagerFactory(CameraModule cameraModule, Provider<RealCameraStatsManager> provider) {
        this.module = cameraModule;
        this.realCameraStatsManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public CameraStatsManager get() {
        return cameraStatsManager(this.module, DoubleCheck.lazy((Provider) this.realCameraStatsManagerProvider));
    }

    public static CameraModule_CameraStatsManagerFactory create(CameraModule cameraModule, Provider<RealCameraStatsManager> provider) {
        return new CameraModule_CameraStatsManagerFactory(cameraModule, provider);
    }

    public static CameraStatsManager cameraStatsManager(CameraModule cameraModule, Lazy<RealCameraStatsManager> lazy) {
        return (CameraStatsManager) Preconditions.checkNotNullFromProvides(cameraModule.cameraStatsManager(lazy));
    }
}

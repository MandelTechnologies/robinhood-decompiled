package com.withpersona.sdk2.camera.stats;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* loaded from: classes26.dex */
public final class RealCameraStatsManager_Factory implements Factory<RealCameraStatsManager> {
    private final Provider<Context> contextProvider;

    public RealCameraStatsManager_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public RealCameraStatsManager get() {
        return newInstance(this.contextProvider.get());
    }

    public static RealCameraStatsManager_Factory create(Provider<Context> provider) {
        return new RealCameraStatsManager_Factory(provider);
    }

    public static RealCameraStatsManager newInstance(Context context) {
        return new RealCameraStatsManager(context);
    }
}

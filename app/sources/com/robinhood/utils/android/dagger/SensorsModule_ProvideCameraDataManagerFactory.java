package com.robinhood.utils.android.dagger;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.utils.camera.CameraDataManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SensorsModule_ProvideCameraDataManagerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/utils/android/dagger/SensorsModule_ProvideCameraDataManagerFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/camera/CameraDataManager;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideCameraDataManager", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class SensorsModule_ProvideCameraDataManagerFactory implements Factory<CameraDataManager> {
    public static final SensorsModule_ProvideCameraDataManagerFactory INSTANCE = new SensorsModule_ProvideCameraDataManagerFactory();

    private SensorsModule_ProvideCameraDataManagerFactory() {
    }

    @Override // javax.inject.Provider
    public CameraDataManager get() {
        return provideCameraDataManager();
    }

    @JvmStatic
    public static final SensorsModule_ProvideCameraDataManagerFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final CameraDataManager provideCameraDataManager() {
        Object objCheckNotNull = Preconditions.checkNotNull(SensorsModule.INSTANCE.provideCameraDataManager(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (CameraDataManager) objCheckNotNull;
    }
}

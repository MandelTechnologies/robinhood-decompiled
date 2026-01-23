package com.robinhood.android.camera;

import com.robinhood.android.camera.process.DefaultPhotoProcessor;
import com.robinhood.android.camera.process.PhotoProcessor;
import kotlin.Metadata;

/* compiled from: LibCameraModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/camera/LibCameraModule;", "", "<init>", "()V", "bindPhotoProcessor", "Lcom/robinhood/android/camera/process/PhotoProcessor;", "processor", "Lcom/robinhood/android/camera/process/DefaultPhotoProcessor;", "lib-camera_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class LibCameraModule {
    public static final int $stable = 0;

    public abstract PhotoProcessor bindPhotoProcessor(DefaultPhotoProcessor processor);
}

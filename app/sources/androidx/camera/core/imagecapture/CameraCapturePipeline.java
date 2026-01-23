package androidx.camera.core.imagecapture;

import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;

/* compiled from: CameraCapturePipeline.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Landroidx/camera/core/imagecapture/CameraCapturePipeline;", "", "invokePostCapture", "Lcom/google/common/util/concurrent/ListenableFuture;", "Ljava/lang/Void;", "invokePreCapture", "camera-core_release"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
public interface CameraCapturePipeline {
    ListenableFuture<Void> invokePostCapture();

    ListenableFuture<Void> invokePreCapture();
}

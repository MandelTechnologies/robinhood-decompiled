package com.withpersona.sdk2.camera;

import android.view.View;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CameraController.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0010H&J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H¦@¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H¦@¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0013H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraController;", "", "cameraState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/withpersona/sdk2/camera/CameraState;", "getCameraState", "()Lkotlinx/coroutines/flow/StateFlow;", "previewView", "Landroid/view/View;", "getPreviewView", "()Landroid/view/View;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "prepare", "", "enableTorch", "enable", "", "focus", "takePicture", "Lkotlin/Result;", "Ljava/io/File;", "takePicture-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideo", "startVideo-IoAF18A", "stopVideo", "stopVideo-IoAF18A", "setAnalyzerEnabled", "enableAnalyzer", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public interface CameraController {
    void enableTorch(boolean enable);

    void focus();

    CameraProperties getCameraProperties();

    StateFlow<CameraController4> getCameraState();

    View getPreviewView();

    void prepare();

    void setAnalyzerEnabled(boolean enableAnalyzer);

    /* renamed from: startVideo-IoAF18A, reason: not valid java name */
    Object mo27256startVideoIoAF18A(Continuation<? super Result<Boolean>> continuation);

    /* renamed from: stopVideo-IoAF18A, reason: not valid java name */
    Object mo27257stopVideoIoAF18A(Continuation<? super Result<? extends File>> continuation);

    /* renamed from: takePicture-IoAF18A, reason: not valid java name */
    Object mo27258takePictureIoAF18A(Continuation<? super Result<? extends File>> continuation);
}

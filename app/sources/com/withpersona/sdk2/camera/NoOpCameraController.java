package com.withpersona.sdk2.camera;

import android.view.View;
import com.withpersona.sdk2.camera.CameraController4;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: NoOpCameraController.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0012H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0096@¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u0015H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/camera/NoOpCameraController;", "Lcom/withpersona/sdk2/camera/CameraController;", "previewView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getPreviewView", "()Landroid/view/View;", "cameraState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/withpersona/sdk2/camera/CameraState;", "getCameraState", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "prepare", "", "enableTorch", "enable", "", "focus", "takePicture", "Lkotlin/Result;", "Ljava/io/File;", "takePicture-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideo", "startVideo-IoAF18A", "stopVideo", "stopVideo-IoAF18A", "setAnalyzerEnabled", "enableAnalyzer", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class NoOpCameraController implements CameraController {
    private final View previewView;

    @Override // com.withpersona.sdk2.camera.CameraController
    public void enableTorch(boolean enable) {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void focus() {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void prepare() {
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void setAnalyzerEnabled(boolean enableAnalyzer) {
    }

    public NoOpCameraController(View previewView) {
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        this.previewView = previewView;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public View getPreviewView() {
        return this.previewView;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public StateFlow<CameraController4> getCameraState() {
        return StateFlow4.MutableStateFlow(CameraController4.NotReady.INSTANCE);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public CameraProperties getCameraProperties() {
        return new CameraProperties(null, null, null, 0, 15, null);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: takePicture-IoAF18A */
    public Object mo27258takePictureIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m28550constructorimpl(ResultKt.createFailure(new CameraController6()));
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: startVideo-IoAF18A */
    public Object mo27256startVideoIoAF18A(Continuation<? super Result<Boolean>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m28550constructorimpl(boxing.boxBoolean(false));
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: stopVideo-IoAF18A */
    public Object mo27257stopVideoIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        return Result.m28550constructorimpl(ResultKt.createFailure(new CameraController6()));
    }
}

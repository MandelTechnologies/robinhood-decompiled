package com.withpersona.sdk2.camera;

import android.view.View;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.Observer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CameraXController.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001-B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096@¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110#H\u0096@¢\u0006\u0004\b(\u0010&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096@¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraXController;", "Lcom/withpersona/sdk2/camera/CameraController;", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "previewView", "Landroidx/camera/view/PreviewView;", "cameraXBinder", "Lcom/withpersona/sdk2/camera/CameraXBinder;", "<init>", "(Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;Lcom/withpersona/sdk2/camera/CameraPreview;Landroidx/camera/view/PreviewView;Lcom/withpersona/sdk2/camera/CameraXBinder;)V", "getPreviewView", "()Landroidx/camera/view/PreviewView;", "isBound", "", "_previewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/camera/CameraState;", "cameraState", "Lkotlinx/coroutines/flow/StateFlow;", "getCameraState", "()Lkotlinx/coroutines/flow/StateFlow;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "prepare", "", "enableTorch", "enable", "focus", "takePicture", "Lkotlin/Result;", "Ljava/io/File;", "takePicture-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideo", "startVideo-IoAF18A", "stopVideo", "stopVideo-IoAF18A", "setAnalyzerEnabled", "enableAnalyzer", "Factory", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class CameraXController implements CameraController {
    private StateFlow2<CameraController4> _previewState;
    private final CameraPreview cameraPreview;
    private final CameraStatsManager cameraStatsManager;
    private final CameraXBinder cameraXBinder;
    private boolean isBound;
    private final PreviewView previewView;
    private final SdkFilesManager sdkFilesManager;

    /* compiled from: CameraXController.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/camera/CameraXController;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "previewView", "Landroidx/camera/view/PreviewView;", "cameraXBinder", "Lcom/withpersona/sdk2/camera/CameraXBinder;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        CameraXController create(CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void setAnalyzerEnabled(boolean enableAnalyzer) {
    }

    public CameraXController(CameraStatsManager cameraStatsManager, SdkFilesManager sdkFilesManager, CameraPreview cameraPreview, PreviewView previewView, CameraXBinder cameraXBinder) {
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(cameraXBinder, "cameraXBinder");
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraPreview = cameraPreview;
        this.previewView = previewView;
        this.cameraXBinder = cameraXBinder;
        this._previewState = StateFlow4.MutableStateFlow(CameraController4.NotReady.INSTANCE);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public PreviewView getPreviewView() {
        return this.previewView;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public StateFlow<CameraController4> getCameraState() {
        return this._previewState;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public CameraProperties getCameraProperties() {
        return this.cameraPreview.getCameraProperties();
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void prepare() {
        if (this.isBound) {
            return;
        }
        this._previewState.setValue(CameraController4.Preparing.INSTANCE);
        this.isBound = true;
        this.cameraXBinder.bind();
        getPreviewView().getPreviewStreamState().observeForever(new Observer<PreviewView.StreamState>() { // from class: com.withpersona.sdk2.camera.CameraXController.prepare.1
            @Override // androidx.lifecycle.Observer
            public void onChanged(PreviewView.StreamState value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (value == PreviewView.StreamState.STREAMING) {
                    CameraXController.this._previewState.setValue(CameraController4.Ready.INSTANCE);
                    CameraXController.this.getPreviewView().getPreviewStreamState().removeObserver(this);
                }
            }
        });
        getPreviewView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.withpersona.sdk2.camera.CameraXController.prepare.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                CameraXController.this.cameraStatsManager.startRecordingState();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                CameraXController.this.cameraStatsManager.stopRecordingState();
            }
        });
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void enableTorch(boolean enable) {
        this.cameraPreview.enableTorch(enable);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void focus() {
        this.cameraPreview.focus(getPreviewView());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: takePicture-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27258takePictureIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        CameraXController2 cameraXController2;
        if (continuation instanceof CameraXController2) {
            cameraXController2 = (CameraXController2) continuation;
            int i = cameraXController2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cameraXController2.label = i - Integer.MIN_VALUE;
            } else {
                cameraXController2 = new CameraXController2(this, continuation);
            }
        }
        Object obj = cameraXController2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = cameraXController2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        CameraPreview cameraPreview = this.cameraPreview;
        SdkFilesManager sdkFilesManager = this.sdkFilesManager;
        cameraXController2.label = 1;
        Object objM27260takePicturegIAlus = cameraPreview.m27260takePicturegIAlus(sdkFilesManager, cameraXController2);
        return objM27260takePicturegIAlus == coroutine_suspended ? coroutine_suspended : objM27260takePicturegIAlus;
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

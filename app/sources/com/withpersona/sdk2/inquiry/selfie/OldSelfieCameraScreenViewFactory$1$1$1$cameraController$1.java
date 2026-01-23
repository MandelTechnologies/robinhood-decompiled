package com.withpersona.sdk2.inquiry.selfie;

import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.CameraController3;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/withpersona/sdk2/inquiry/selfie/OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1", "Lcom/withpersona/sdk2/camera/CameraXBinder;", "bind", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1 implements CameraXBinder {
    final /* synthetic */ CameraPreview $cameraPreview;
    final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen $initialRendering;
    final /* synthetic */ SelfieDirectionFeed $selfieDirectionFeed;
    final /* synthetic */ Pi2OldSelfieCameraBinding $this_apply;

    OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1(Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding, CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed, SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen) {
        this.$this_apply = pi2OldSelfieCameraBinding;
        this.$cameraPreview = cameraPreview;
        this.$selfieDirectionFeed = selfieDirectionFeed;
        this.$initialRendering = oldCameraScreen;
    }

    @Override // com.withpersona.sdk2.camera.CameraXBinder
    public void bind() {
        PreviewView previewviewSelfieCamera = this.$this_apply.previewviewSelfieCamera;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        CameraPreview.CameraDirection cameraDirection = CameraPreview.CameraDirection.FRONT;
        CameraPreview cameraPreview = this.$cameraPreview;
        SelfieDirectionFeed selfieDirectionFeed = this.$selfieDirectionFeed;
        final SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen = this.$initialRendering;
        cameraPreview.rebind(previewviewSelfieCamera, cameraDirection, selfieDirectionFeed, true, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1.bind$lambda$0(oldCameraScreen, (CameraController3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen, CameraController3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        oldCameraScreen.getOnCameraError().invoke(it);
        return Unit.INSTANCE;
    }
}

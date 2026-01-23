package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController6;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.NoOpCameraController;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2Utils;
import com.withpersona.sdk2.camera.camera2.Camera2Utils4;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/OldSelfieCameraScreenViewFactory;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "<init>", "(Lcom/withpersona/sdk2/camera/CameraPreview;Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;)V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OldSelfieCameraScreenViewFactory implements ViewFactory<SelfieWorkflow.Screen.OldCameraScreen> {
    private final /* synthetic */ BuilderViewFactory<SelfieWorkflow.Screen.OldCameraScreen> $$delegate_0;
    private final CameraPreview cameraPreview;
    private final SelfieDirectionFeed selfieDirectionFeed;

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(SelfieWorkflow.Screen.OldCameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<? super SelfieWorkflow.Screen.OldCameraScreen> getType() {
        return this.$$delegate_0.getType();
    }

    public OldSelfieCameraScreenViewFactory(final CameraPreview cameraPreview, final SelfieDirectionFeed selfieDirectionFeed) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.OldCameraScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.selfie.OldSelfieCameraScreenViewFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return OldSelfieCameraScreenViewFactory.__delegate_0$lambda$2(selfieDirectionFeed, cameraPreview, (SelfieWorkflow.Screen.OldCameraScreen) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View __delegate_0$lambda$2(SelfieDirectionFeed selfieDirectionFeed, CameraPreview cameraPreview, SelfieWorkflow.Screen.OldCameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        SelfieDirectionFeed selfieDirectionFeed2;
        CameraController cameraControllerCreate;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        Pi2OldSelfieCameraBinding pi2OldSelfieCameraBindingInflate = Pi2OldSelfieCameraBinding.inflate(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() != VideoCaptureMethod.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices bestCameraChoices = Camera2Utils.getBestCameraChoices(applicationContext, Camera2Utils4.FRONT);
            if (bestCameraChoices == null) {
                initialRendering.getOnCameraError().invoke(new CameraController6());
                Camera2PreviewView camera2Preview = pi2OldSelfieCameraBindingInflate.camera2Preview;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                cameraControllerCreate = new NoOpCameraController(camera2Preview);
                selfieDirectionFeed2 = selfieDirectionFeed;
            } else {
                Camera2ManagerFactory.Factory camera2ManagerFactoryFactory = initialRendering.getCamera2ManagerFactoryFactory();
                Camera2PreviewView camera2Preview2 = pi2OldSelfieCameraBindingInflate.camera2Preview;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                selfieDirectionFeed2 = selfieDirectionFeed;
                cameraControllerCreate = new Camera2Controller(camera2ManagerFactoryFactory.create(bestCameraChoices, camera2Preview2, selfieDirectionFeed2, VideoCaptureMethod.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired()));
            }
        } else {
            selfieDirectionFeed2 = selfieDirectionFeed;
            CameraXController.Factory cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            PreviewView previewviewSelfieCamera = pi2OldSelfieCameraBindingInflate.previewviewSelfieCamera;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            cameraControllerCreate = cameraXControllerFactory.create(cameraPreview, previewviewSelfieCamera, new OldSelfieCameraScreenViewFactory$1$1$1$cameraController$1(pi2OldSelfieCameraBindingInflate, cameraPreview, selfieDirectionFeed2, initialRendering));
        }
        ConstraintLayout root = pi2OldSelfieCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Intrinsics.checkNotNull(pi2OldSelfieCameraBindingInflate);
        ViewShowRendering.bindShowRendering(root, initialRendering, initialViewEnvironment, new OldSelfieCameraScreenViewFactory$1$1$1$1(new OldCameraScreenRunner(pi2OldSelfieCameraBindingInflate, cameraControllerCreate, selfieDirectionFeed2)));
        ConstraintLayout root2 = pi2OldSelfieCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
        return root2;
    }
}

package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController6;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.NoOpCameraController;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2Utils;
import com.withpersona.sdk2.camera.camera2.Camera2Utils4;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdCameraScreenViewFactory;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;", "governmentIdFeed", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "<init>", "(Lcom/withpersona/sdk2/camera/GovernmentIdFeed;Lcom/withpersona/sdk2/camera/CameraPreview;)V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GovernmentIdCameraScreenViewFactory implements ViewFactory<GovernmentIdScreen2.CameraScreen> {
    private final /* synthetic */ BuilderViewFactory<GovernmentIdScreen2.CameraScreen> $$delegate_0;
    private final CameraPreview cameraPreview;
    private final GovernmentIdFeed governmentIdFeed;

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(GovernmentIdScreen2.CameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<? super GovernmentIdScreen2.CameraScreen> getType() {
        return this.$$delegate_0.getType();
    }

    public GovernmentIdCameraScreenViewFactory(final GovernmentIdFeed governmentIdFeed, final CameraPreview cameraPreview) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(GovernmentIdScreen2.CameraScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdCameraScreenViewFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return GovernmentIdCameraScreenViewFactory.__delegate_0$lambda$2(governmentIdFeed, cameraPreview, (GovernmentIdScreen2.CameraScreen) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.governmentIdFeed = governmentIdFeed;
        this.cameraPreview = cameraPreview;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View __delegate_0$lambda$2(final GovernmentIdFeed governmentIdFeed, final CameraPreview cameraPreview, final GovernmentIdScreen2.CameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        GovernmentIdFeed governmentIdFeed2;
        CameraController camera2Controller;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        final Pi2GovernmentidCameraBinding pi2GovernmentidCameraBindingInflate = Pi2GovernmentidCameraBinding.inflate(LayoutInflater.from(context2).cloneInContext(context));
        if (initialRendering.getVideoCaptureMethod() == VideoCaptureMethod.Upload || initialRendering.getVideoCaptureMethod() == VideoCaptureMethod.Stream) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices bestCameraChoices = Camera2Utils.getBestCameraChoices(applicationContext, Camera2Utils4.BACK);
            if (bestCameraChoices == null) {
                initialRendering.getOnCameraError().invoke(new CameraController6());
                Camera2PreviewView camera2Preview = pi2GovernmentidCameraBindingInflate.camera2Preview;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                governmentIdFeed2 = governmentIdFeed;
                camera2Controller = new NoOpCameraController(camera2Preview);
            } else {
                Camera2ManagerFactory.Factory camera2ManagerFactoryFactory = initialRendering.getCamera2ManagerFactoryFactory();
                Camera2PreviewView camera2Preview2 = pi2GovernmentidCameraBindingInflate.camera2Preview;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                governmentIdFeed2 = governmentIdFeed;
                camera2Controller = new Camera2Controller(camera2ManagerFactoryFactory.create(bestCameraChoices, camera2Preview2, governmentIdFeed2, initialRendering.getVideoCaptureMethod(), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired()));
            }
        } else {
            CameraXController.Factory cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            PreviewView previewView = pi2GovernmentidCameraBindingInflate.previewView;
            Intrinsics.checkNotNullExpressionValue(previewView, "previewView");
            camera2Controller = cameraXControllerFactory.create(cameraPreview, previewView, new CameraXBinder() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdCameraScreenViewFactory$1$1$1$cameraController$1
                @Override // com.withpersona.sdk2.camera.CameraXBinder
                public void bind() {
                    PreviewView previewView2 = pi2GovernmentidCameraBindingInflate.previewView;
                    Intrinsics.checkNotNullExpressionValue(previewView2, "previewView");
                    cameraPreview.rebind(previewView2, CameraPreview.CameraDirection.BACK, governmentIdFeed, true, initialRendering.getOnCameraError());
                }
            });
            governmentIdFeed2 = governmentIdFeed;
        }
        FrameLayout root = pi2GovernmentidCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Intrinsics.checkNotNull(pi2GovernmentidCameraBindingInflate);
        ViewShowRendering.bindShowRendering(root, initialRendering, initialViewEnvironment, new GovernmentIdCameraScreenViewFactory$1$1$1$1(new CameraScreenRunner(pi2GovernmentidCameraBindingInflate, camera2Controller, governmentIdFeed2)));
        FrameLayout root2 = pi2GovernmentidCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
        return root2;
    }
}

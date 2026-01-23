package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.squareup.workflow1.p415ui.BuilderViewFactory;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.squareup.workflow1.p415ui.ViewFactory;
import com.squareup.workflow1.p415ui.ViewShowRendering;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/SelfieCameraScreenViewFactory;", "Lcom/squareup/workflow1/ui/ViewFactory;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "<init>", "(Lcom/withpersona/sdk2/camera/CameraPreview;Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;)V", "buildView", "Landroid/view/View;", "initialRendering", "initialViewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "contextForNewView", "Landroid/content/Context;", "container", "Landroid/view/ViewGroup;", "type", "Lkotlin/reflect/KClass;", "getType", "()Lkotlin/reflect/KClass;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SelfieCameraScreenViewFactory implements ViewFactory<SelfieWorkflow.Screen.CameraScreen> {
    private final /* synthetic */ BuilderViewFactory<SelfieWorkflow.Screen.CameraScreen> $$delegate_0;
    private final CameraPreview cameraPreview;
    private final SelfieDirectionFeed selfieDirectionFeed;

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public View buildView(SelfieWorkflow.Screen.CameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return this.$$delegate_0.buildView(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override // com.squareup.workflow1.p415ui.ViewFactory
    public KClass<? super SelfieWorkflow.Screen.CameraScreen> getType() {
        return this.$$delegate_0.getType();
    }

    public SelfieCameraScreenViewFactory(final CameraPreview cameraPreview, final SelfieDirectionFeed selfieDirectionFeed) {
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        this.$$delegate_0 = new BuilderViewFactory<>(Reflection.getOrCreateKotlinClass(SelfieWorkflow.Screen.CameraScreen.class), new Function4() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieCameraScreenViewFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return SelfieCameraScreenViewFactory.__delegate_0$lambda$2(cameraPreview, selfieDirectionFeed, (SelfieWorkflow.Screen.CameraScreen) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
            }
        });
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View __delegate_0$lambda$2(CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed, SelfieWorkflow.Screen.CameraScreen initialRendering, ViewEnvironment initialViewEnvironment, Context context, ViewGroup viewGroup) {
        Context context2;
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        if (viewGroup == null || (context2 = viewGroup.getContext()) == null) {
            context2 = context;
        }
        Pi2SelfieCameraBinding pi2SelfieCameraBindingInflate = Pi2SelfieCameraBinding.inflate(LayoutInflater.from(context2).cloneInContext(context));
        SystemUiControllerUtils.updateSystemUiColor(initialViewEnvironment, ContextCompat.getColor(pi2SelfieCameraBindingInflate.getRoot().getContext(), R$color.pi2_camera_preview_mask_color));
        ConstraintLayout root = pi2SelfieCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        Intrinsics.checkNotNull(pi2SelfieCameraBindingInflate);
        ViewShowRendering.bindShowRendering(root, initialRendering, initialViewEnvironment, new SelfieCameraScreenViewFactory$1$1$1$1(new CameraScreenRunner(pi2SelfieCameraBindingInflate, cameraPreview, selfieDirectionFeed)));
        ConstraintLayout root2 = pi2SelfieCameraBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "let(...)");
        return root2;
    }
}

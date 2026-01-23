package com.withpersona.sdk2.inquiry.selfie;

import androidx.camera.view.PreviewView;
import com.withpersona.sdk2.camera.CameraController3;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXBinder;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/withpersona/sdk2/inquiry/selfie/CameraScreenRunner$getOrCreateCameraController$cameraController$1", "Lcom/withpersona/sdk2/camera/CameraXBinder;", "bind", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$getOrCreateCameraController$cameraController$1 */
/* loaded from: classes18.dex */
public final class C43715x9f9b63bf implements CameraXBinder {
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
    final /* synthetic */ CameraScreenRunner this$0;

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$getOrCreateCameraController$cameraController$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr[CameraProperties.FacingMode.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraProperties.FacingMode.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraProperties.FacingMode.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    C43715x9f9b63bf(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen) {
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
    }

    @Override // com.withpersona.sdk2.camera.CameraXBinder
    public void bind() {
        CameraPreview.CameraDirection cameraDirection;
        CameraPreview cameraPreview = this.this$0.cameraPreview;
        PreviewView previewviewSelfieCamera = this.this$0.binding.previewviewSelfieCamera;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        int i = WhenMappings.$EnumSwitchMapping$0[this.$rendering.getFacingMode().ordinal()];
        if (i == 1) {
            cameraDirection = CameraPreview.CameraDirection.FRONT;
        } else if (i == 2) {
            cameraDirection = CameraPreview.CameraDirection.BACK;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cameraDirection = CameraPreview.CameraDirection.EXTERNAL;
        }
        CameraPreview.CameraDirection cameraDirection2 = cameraDirection;
        SelfieDirectionFeed selfieDirectionFeed = this.this$0.selfieDirectionFeed;
        final SelfieWorkflow.Screen.CameraScreen cameraScreen = this.$rendering;
        cameraPreview.rebind(previewviewSelfieCamera, cameraDirection2, selfieDirectionFeed, true, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$getOrCreateCameraController$cameraController$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C43715x9f9b63bf.bind$lambda$0(cameraScreen, (CameraController3) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(SelfieWorkflow.Screen.CameraScreen cameraScreen, CameraController3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cameraScreen.getOnCameraError().invoke(it);
        return Unit.INSTANCE;
    }
}

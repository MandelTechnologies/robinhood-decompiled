package com.withpersona.sdk2.inquiry.selfie.video_capture;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.selfie.SelfieV1Utils;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtils;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalVideoCaptureRenderer.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJE\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010\u0011\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u0016H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/video_capture/LocalVideoCaptureRenderer;", "", "applicationContext", "Landroid/content/Context;", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;)V", "renderFinalizeVideoCapture", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "renderFinalizeVideoCapture$selfie_release", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class LocalVideoCaptureRenderer {
    private final Context applicationContext;
    private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
    private final CameraXController.Factory cameraXControllerFactory;
    private final NavigationStateManager navigationStateManager;

    public LocalVideoCaptureRenderer(Context applicationContext, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, NavigationStateManager navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.navigationStateManager = navigationStateManager;
    }

    public final Object renderFinalizeVideoCapture$selfie_release(final SelfieWorkflow.Input renderProps, final SelfieState.FinalizeLocalVideoCapture renderState, final StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext context) {
        SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        context.runningSideEffect("finalize_delay", new LocalVideoCaptureRenderer2(renderState, context, null));
        String capturePageTitle = renderProps.getStrings().getCapturePageTitle();
        boolean isDelayComplete = renderState.getIsDelayComplete();
        if (renderState.getIsFinalizeComplete()) {
            overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE;
        } else {
            overlay = SelfieWorkflow.Screen.OldCameraScreen.Overlay.FINALIZING;
        }
        return SelfieV1Utils.createCameraScreen$default(renderProps, context, null, capturePageTitle, null, null, false, new SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture(new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$1(context, (File) obj);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$3(context, renderState);
            }
        }, isDelayComplete, overlay, !Intrinsics.areEqual(renderProps.getSelfieType(), SelfieType.ConfigurablePoses.INSTANCE)), SelfieWorkflowUtils.makeCameraScreenAssetOverrides(renderProps), renderProps.getRequireStrictSelfieCapture(), this.navigationStateManager.getNavigationState(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$4(context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$6(context);
            }
        }, SelfieWorkflowUtils.getCameraErrorHandler(context), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$7(this.f$0, context, renderProps);
            }
        }, VideoCaptureMethod.Upload, null, renderProps.getVideoCaptureConfig().getRecordAudio(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, 0.0f, null, renderState.getCameraFacingMode(), false, false, false, 50331648, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$1(StatefulWorkflow.RenderContext renderContext, File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final ArrayList arrayList = new ArrayList();
        String absolutePath = it.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        arrayList.add(new Selfie.SelfieVideo(absolutePath, Selfie.CaptureMethod.MANUAL));
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$1$lambda$0(arrayList, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$1$lambda$0(List list, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state : null;
        if (finalizeLocalVideoCapture == null) {
            return Unit.INSTANCE;
        }
        action.setState(SelfieState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, CollectionsKt.plus((Collection) ((SelfieState) action.getState()).getSelfies$selfie_release(), (Iterable) list), 0L, false, true, null, 0L, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$3(StatefulWorkflow.RenderContext renderContext, final SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$3$lambda$2(finalizeLocalVideoCapture, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$3$lambda$2(SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        SelfieState.FinalizeLocalVideoCapture finalizeLocalVideoCapture2 = state instanceof SelfieState.FinalizeLocalVideoCapture ? (SelfieState.FinalizeLocalVideoCapture) state : null;
        if (finalizeLocalVideoCapture2 != null && finalizeLocalVideoCapture2.getIsFinalizeComplete()) {
            action.setState(SelfieWorkflowUtils.reviewStateIfNeeded(action, ((SelfieState) action.getState()).getSelfies$selfie_release(), null, finalizeLocalVideoCapture.getCameraProperties(), finalizeLocalVideoCapture.getStartSelfieTimestamp(), SelfieWorkflowUtils.createBackState(action, false)));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$4(StatefulWorkflow.RenderContext renderContext) {
        SelfieWorkflowUtils.goBack(renderContext, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$6(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$6$lambda$5((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$6$lambda$5(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(SelfieWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$7(LocalVideoCaptureRenderer localVideoCaptureRenderer, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow.Input input) {
        SelfieWorkflowUtils.handlePermissionChanged(localVideoCaptureRenderer.applicationContext, renderContext, input, true);
        return Unit.INSTANCE;
    }
}

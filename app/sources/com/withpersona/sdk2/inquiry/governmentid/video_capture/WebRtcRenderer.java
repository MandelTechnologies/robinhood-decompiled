package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import android.content.Context;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.squareup.workflow1.p415ui.modal.AlertContainerScreen;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtils;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebRtcRenderer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010\u0011\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/WebRtcRenderer;", "", "applicationContext", "Landroid/content/Context;", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;)V", "renderFinalizeWebRtc", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class WebRtcRenderer {
    private final Context applicationContext;
    private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
    private final CameraXController.Factory cameraXControllerFactory;
    private final NavigationStateManager navigationStateManager;

    public WebRtcRenderer(Context applicationContext, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, NavigationStateManager navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.navigationStateManager = navigationStateManager;
    }

    public final Object renderFinalizeWebRtc(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.FinalizeWebRtc renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper) {
        final WebRtcManagerBridge webRtcManagerBridge;
        IdConfig.Side side;
        final GovernmentIdWorkflow.Input renderProps2 = renderProps;
        Intrinsics.checkNotNullParameter(renderProps2, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        WebRtcManagerBridge webRtcManager = videoCaptureHelper.getWebRtcManager();
        if (webRtcManager != null) {
            webRtcManagerBridge = webRtcManager;
            renderProps2 = renderProps;
            webRtcManagerBridge.stopRecording(new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WebRtcRenderer.renderFinalizeWebRtc$lambda$1(context, webRtcManagerBridge, renderState, renderProps, videoCaptureHelper, (String) obj);
                }
            });
        } else {
            webRtcManagerBridge = webRtcManager;
        }
        IdConfig2 currentPart = renderState.getCurrentPart();
        IdConfig2.SideIdPart sideIdPart = currentPart instanceof IdConfig2.SideIdPart ? (IdConfig2.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.Side.Front;
        }
        IdConfig.IdSideConfig sideConfig = renderState.getId().getSideConfig(side);
        IdConfig.Side side2 = side;
        return new AlertContainerScreen(PermissionsUtils.toModalContainerScreen(GovernmentIdScreen.newCameraScreen$default(renderProps2, GovernmentIdWorkflowUtils.getCaptureScreenTitle(renderProps2.getStrings(), side, renderState.getId().getIdClassKey(), renderState.getCountryCode()), renderProps2.getStrings().getCapturing(), GovernmentIdScreen2.CameraScreen.ManualCapture.Disabled, sideConfig.getOverlay(), renderState.getId().getType(), side2, this.navigationStateManager.getNavigationState(), new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$2((List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$4(context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$5(context, videoCaptureHelper);
            }
        }, false, CollectionsKt.emptyList(), renderState, renderState.getPartIndex(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$6((Throwable) obj);
            }
        }, GovernmentIdWorkflowUtils.getCameraErrorHandler(context), VideoCaptureMethod.Stream, false, true, false, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$8(this.f$0, context, renderProps2);
            }
        }, 0, null, null, webRtcManagerBridge, 830603264, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$1(final StatefulWorkflow.RenderContext renderContext, final WebRtcManagerBridge webRtcManagerBridge, final GovernmentIdState.FinalizeWebRtc finalizeWebRtc, final GovernmentIdWorkflow.Input input, final VideoCaptureHelper videoCaptureHelper, final String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$1$lambda$0(webRtcManagerBridge, finalizeWebRtc, renderContext, input, videoCaptureHelper, it, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$1$lambda$0(WebRtcManagerBridge webRtcManagerBridge, GovernmentIdState.FinalizeWebRtc finalizeWebRtc, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, VideoCaptureHelper videoCaptureHelper, String str, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (webRtcManagerBridge.isConnected()) {
            webRtcManagerBridge.closeWebRtcConnection();
            GovernmentIdWorkflowUtils.moveToNextStep(finalizeWebRtc, renderContext, input, null, finalizeWebRtc.getId(), videoCaptureHelper, finalizeWebRtc.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? finalizeWebRtc.getParts$government_id_release() : finalizeWebRtc.getParts$government_id_release(), (3584 & 512) != 0 ? finalizeWebRtc.getPartIndex() : 0, (3584 & 1024) != 0 ? null : str, (3584 & 2048) != 0 ? finalizeWebRtc.getCountryCode() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$2(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$6(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$4(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebRtcRenderer.renderFinalizeWebRtc$lambda$4$lambda$3((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$4$lambda$3(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$5(StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.goBack(renderContext, videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeWebRtc$lambda$8(WebRtcRenderer webRtcRenderer, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input) {
        GovernmentIdWorkflowUtils.handlePermissionChanged(webRtcRenderer.applicationContext, renderContext, input, true);
        return Unit.INSTANCE;
    }
}

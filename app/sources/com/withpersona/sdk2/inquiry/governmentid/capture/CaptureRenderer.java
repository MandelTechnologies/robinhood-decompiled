package com.withpersona.sdk2.inquiry.governmentid.capture;

import android.R;
import android.content.Context;
import android.util.Size;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Worker;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.squareup.workflow1.Workflows;
import com.squareup.workflow1.p415ui.modal.AlertContainerScreen;
import com.squareup.workflow1.p415ui.modal.AlertScreen;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.camera2.Camera2Utils;
import com.withpersona.sdk2.camera.camera2.Camera2Utils4;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig2;
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtils;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureHelper;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;

/* compiled from: CaptureRenderer.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013JT\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182&\u0010\u0019\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001bj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"JT\u0010#\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020$2&\u0010\u0019\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001bj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\"JJ\u0010%\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182&\u0010\u0019\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001bj\u0002`\u001e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002J`\u0010)\u001a\u00020&2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u001c2&\u0010\u0019\u001a\"0\u001aR\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001bj\u0002`\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/capture/CaptureRenderer;", "", "applicationContext", "Landroid/content/Context;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "governmentIdAnalyzeWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker$Factory;", "governmentIdHintWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$Factory;", "webRtcWorkerFactory", "Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdAnalyzeWorker$Factory;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/GovernmentIdHintWorker$Factory;Lcom/withpersona/sdk2/inquiry/webrtc/networking/WebRtcWorker$Factory;Lcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;)V", "renderWaitForAutoCapture", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "sink", "Lcom/squareup/workflow1/Sink;", "renderCountdownToCapture", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "waitForWebRtcSetup", "", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "onCaptureComplete", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "capturedId", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CaptureRenderer {
    private final Context applicationContext;
    private final Camera2ManagerFactory.Factory camera2ManagerFactoryFactory;
    private final CameraXController.Factory cameraXControllerFactory;
    private final GovernmentIdAnalyzeWorker.Factory governmentIdAnalyzeWorkerFactory;
    private final GovernmentIdHintWorker.Factory governmentIdHintWorkerFactory;
    private final NavigationStateManager navigationStateManager;
    private final PermissionRequestWorkflow permissionRequestWorkflow;
    private final WebRtcWorker.Factory webRtcWorkerFactory;

    public CaptureRenderer(Context applicationContext, PermissionRequestWorkflow permissionRequestWorkflow, GovernmentIdAnalyzeWorker.Factory governmentIdAnalyzeWorkerFactory, GovernmentIdHintWorker.Factory governmentIdHintWorkerFactory, WebRtcWorker.Factory webRtcWorkerFactory, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, NavigationStateManager navigationStateManager) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        Intrinsics.checkNotNullParameter(governmentIdAnalyzeWorkerFactory, "governmentIdAnalyzeWorkerFactory");
        Intrinsics.checkNotNullParameter(governmentIdHintWorkerFactory, "governmentIdHintWorkerFactory");
        Intrinsics.checkNotNullParameter(webRtcWorkerFactory, "webRtcWorkerFactory");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.governmentIdAnalyzeWorkerFactory = governmentIdAnalyzeWorkerFactory;
        this.governmentIdHintWorkerFactory = governmentIdHintWorkerFactory;
        this.webRtcWorkerFactory = webRtcWorkerFactory;
        this.cameraXControllerFactory = cameraXControllerFactory;
        this.camera2ManagerFactoryFactory = camera2ManagerFactoryFactory;
        this.navigationStateManager = navigationStateManager;
    }

    public final Object renderWaitForAutoCapture(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper, final Sink<? super GovernmentIdWorkflow.Output> sink) {
        VideoCaptureMethod videoCaptureMethod;
        StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext;
        VideoCaptureHelper videoCaptureHelper2;
        ModalContainerScreen<Object, Object> modalContainerScreen;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        final CaptureConfig captureConfig = renderState.getCaptureConfig();
        IdConfig.IdSideConfig sideConfig = CaptureConfig2.getSideConfig(captureConfig, renderState.getCurrentPart().getSide());
        String idClassKey = CaptureConfig2.getIdClassKey(captureConfig);
        boolean z = captureConfig instanceof CaptureConfig.AutoClassifyConfig;
        Workflows.runningWorker(context, this.governmentIdAnalyzeWorkerFactory.create(renderState.getCurrentPart().getSide(), idClassKey), Reflection.typeOf(GovernmentIdAnalyzeWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$5(renderState, captureConfig, (Result) obj);
            }
        });
        Workflows.runningWorker(context, this.governmentIdHintWorkerFactory.create(renderState.getCurrentPart().getSide()), Reflection.typeOf(GovernmentIdHintWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$7((Hint) obj);
            }
        });
        VideoCaptureMethod videoCaptureMethod2 = videoCaptureHelper.videoCaptureMethod(renderProps);
        VideoCaptureMethod videoCaptureMethod3 = VideoCaptureMethod.Stream;
        boolean z2 = videoCaptureMethod2 == videoCaptureMethod3 && !videoCaptureHelper.isWebRtcConnected();
        if (!sideConfig.getManualCaptureConfig().getIsEnabled() || z2) {
            videoCaptureMethod = videoCaptureMethod3;
        } else {
            videoCaptureMethod = videoCaptureMethod3;
            Workflows.runningWorker(context, Worker.Companion.timer$default(Worker.INSTANCE, RangesKt.coerceAtLeast(sideConfig.getManualCaptureConfig().getDelayMs(), 0L), null, 2, null), Reflection.typeOf(Worker.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(Unit.class))), sideConfig.getSideKey(), new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CaptureRenderer.renderWaitForAutoCapture$lambda$9(renderState, (Unit) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        if (renderState.getError() != null) {
            Map mapMapOf = MapsKt.mapOf(Tuples4.m3642to(AlertScreen.Button.POSITIVE, this.applicationContext.getString(R.string.ok)));
            String string2 = this.applicationContext.getString(R$string.pi2_error_image_capture_failed);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new AlertScreen(mapMapOf, string2, null, false, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CaptureRenderer.renderWaitForAutoCapture$lambda$11(context, (AlertScreen.Event) obj);
                }
            }, 12, null));
        }
        String captureScreenTitle = GovernmentIdWorkflowUtils.getCaptureScreenTitle(renderProps.getStrings(), renderState.getCurrentPart().getSide(), idClassKey, renderState.getCountryCode());
        String scanInstructions = GovernmentIdWorkflowUtils.getScanInstructions(renderProps.getStrings(), renderState.getCurrentPart().getSide(), idClassKey, renderState.getCountryCode(), z);
        IdConfig.Side side = renderState.getCurrentPart().getSide();
        VideoCaptureMethod videoCaptureMethod4 = videoCaptureMethod;
        GovernmentIdScreen2.CameraScreen cameraScreenNewCameraScreen$default = GovernmentIdScreen.newCameraScreen$default(renderProps, captureScreenTitle, scanInstructions, renderState.getManualCapture(), sideConfig.getOverlay(), CaptureConfig2.getIdClass(captureConfig), side, this.navigationStateManager.getNavigationState(), new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$13(renderState, captureConfig, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$14(sink);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$15(context, videoCaptureHelper);
            }
        }, false, sideConfig.getAutoCaptureConfig().getRuleSet().getRules(), renderState, renderState.getPartIndex(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$17(context, (Throwable) obj);
            }
        }, GovernmentIdWorkflowUtils.getCameraErrorHandler(context), videoCaptureHelper.videoCaptureMethod(renderProps), false, false, false, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$19(context, renderState);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$20(this.f$0, context, renderProps, videoCaptureHelper);
            }
        }, 0, GovernmentIdWorkflowUtils.getTextForHint(renderProps.getStrings(), renderState.getHint()), GovernmentIdWorkflowUtils.getCaptureTips(renderProps, renderState.getCurrentPart().getSide()), videoCaptureHelper.getWebRtcManager(), 165806080, null);
        if (renderState.getCheckCameraPermissions()) {
            modalContainerScreen = GovernmentIdWorkflowUtils.withRequestCameraPermissionsIfNeeded(cameraScreenNewCameraScreen$default, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
        } else {
            if (renderState.getCheckAudioPermissions()) {
                videoCaptureHelper2 = videoCaptureHelper;
                if (videoCaptureHelper2.isVideoCapture(renderProps) && ContextUtils3.isMicPresent(this.applicationContext) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
                    modalContainerScreen = GovernmentIdWorkflowUtils.withRequestAudioPermissionsIfNeeded(cameraScreenNewCameraScreen$default, this.applicationContext, context, renderProps, true, this.permissionRequestWorkflow);
                } else {
                    renderContext = context;
                }
            } else {
                renderContext = context;
                videoCaptureHelper2 = videoCaptureHelper;
            }
            if (videoCaptureHelper2.videoCaptureMethod(renderProps) == videoCaptureMethod4 && renderState.getWebRtcState() == WebRtcState.Disconnected) {
                waitForWebRtcSetup(renderProps, renderState, renderContext, videoCaptureHelper2.getWebRtcManager());
                modalContainerScreen = PermissionsUtils.toModalContainerScreen(cameraScreenNewCameraScreen$default);
            } else {
                modalContainerScreen = PermissionsUtils.toModalContainerScreen(cameraScreenNewCameraScreen$default);
            }
        }
        return new AlertContainerScreen(modalContainerScreen, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForAutoCapture$lambda$5(final GovernmentIdState.WaitForAutocapture waitForAutocapture, final CaptureConfig captureConfig, Result result) {
        Object value = result.getValue();
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(value);
        if (thM28553exceptionOrNullimpl == null) {
            final GovernmentId.GovernmentIdImage governmentIdImage = (GovernmentId.GovernmentIdImage) value;
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CaptureRenderer.renderWaitForAutoCapture$lambda$5$lambda$1$lambda$0(waitForAutocapture, captureConfig, governmentIdImage, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        String message = thM28553exceptionOrNullimpl.getMessage();
        return (message == null || !StringsKt.contains$default((CharSequence) message, (CharSequence) "ENOSPC", false, 2, (Object) null)) ? WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$5$lambda$4$lambda$3(waitForAutocapture, (WorkflowAction.Updater) obj);
            }
        }, 1, null) : WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$5$lambda$4$lambda$2((WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$5$lambda$1$lambda$0(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture2 == null) {
            return Unit.INSTANCE;
        }
        action.setState(new GovernmentIdState.CountdownToCapture(waitForAutocapture.getCurrentPart(), ((GovernmentIdState) action.getState()).getUploadingIds$government_id_release(), captureConfig, governmentIdImage, waitForAutocapture2.getParts$government_id_release(), waitForAutocapture2.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, false), waitForAutocapture2.getCountryCode(), waitForAutocapture2.getHint()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$5$lambda$4$lambda$2(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.NoDiskSpaceErrorInfo(null, 1, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$5$lambda$4$lambda$3(GovernmentIdState.WaitForAutocapture waitForAutocapture, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == GovernmentIdScreen2.CameraScreen.ManualCapture.Hidden) {
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForAutoCapture$lambda$7(final Hint hint) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$7$lambda$6(hint, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$7$lambda$6(Hint hint, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture == null) {
            return Unit.INSTANCE;
        }
        action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, null, null, 0, null, null, null, null, false, false, null, hint, null, 24575, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderWaitForAutoCapture$lambda$9(final GovernmentIdState.WaitForAutocapture waitForAutocapture, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$9$lambda$8(waitForAutocapture, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$9$lambda$8(GovernmentIdState.WaitForAutocapture waitForAutocapture, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (waitForAutocapture.getManualCapture() == GovernmentIdScreen2.CameraScreen.ManualCapture.Hidden) {
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$11(StatefulWorkflow.RenderContext renderContext, AlertScreen.Event it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$11$lambda$10((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$11$lambda$10(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.getState();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, false, false, null, null, null, 32255, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$13(GovernmentIdState.WaitForAutocapture waitForAutocapture, CaptureConfig captureConfig, CaptureRenderer captureRenderer, GovernmentIdWorkflow.Input input, StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List list = absolutePaths;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Frame((String) it.next(), null, 2, null));
        }
        captureRenderer.onCaptureComplete(input, waitForAutocapture, renderContext, waitForAutocapture.getCaptureConfig(), videoCaptureHelper, cameraProperties, new GovernmentId.GovernmentIdImage(arrayList, GovernmentIdWorkflowUtils.toGovIdSide(waitForAutocapture.getCurrentPart().getSide()), CaptureConfig2.getIdClassKey(captureConfig), GovernmentId.CaptureMethod.MANUAL, null, null, 32, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$17(StatefulWorkflow.RenderContext renderContext, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$17$lambda$16(error, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$17$lambda$16(Throwable th, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture == null) {
            return Unit.INSTANCE;
        }
        action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled, null, 0, null, null, null, th, false, false, null, null, null, 32247, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$14(Sink sink) {
        sink.send(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$15(StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.goBack(renderContext, videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$19(StatefulWorkflow.RenderContext renderContext, final GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderWaitForAutoCapture$lambda$19$lambda$18(waitForAutocapture, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$19$lambda$18(GovernmentIdState.WaitForAutocapture waitForAutocapture, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, GovernmentIdScreen2.CameraScreen.ManualCapture.Disabled, null, 0, null, null, null, null, false, false, null, null, null, 32759, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderWaitForAutoCapture$lambda$20(CaptureRenderer captureRenderer, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.handlePermissionChanged(captureRenderer.applicationContext, renderContext, input, videoCaptureHelper.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    public final Object renderCountdownToCapture(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.CountdownToCapture renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper, final Sink<? super GovernmentIdWorkflow.Output> sink) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(sink, "sink");
        IdConfig.IdSideConfig sideConfig = CaptureConfig2.getSideConfig(renderState.getCaptureConfig(), renderState.getCurrentPart().getSide());
        Workflows.runningWorker(context, this.governmentIdHintWorkerFactory.create(renderState.getCurrentPart().getSide()), Reflection.typeOf(GovernmentIdHintWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderCountdownToCapture$lambda$22((Hint) obj);
            }
        });
        String captureScreenTitle = GovernmentIdWorkflowUtils.getCaptureScreenTitle(renderProps.getStrings(), renderState.getCurrentPart().getSide(), CaptureConfig2.getIdClassKey(renderState.getCaptureConfig()), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        IdConfig.Side side = renderState.getCurrentPart().getSide();
        GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture = GovernmentIdScreen2.CameraScreen.ManualCapture.Disabled;
        GovernmentIdScreen2.Overlay overlay = sideConfig.getOverlay();
        IdClass idClass = CaptureConfig2.getIdClass(renderState.getCaptureConfig());
        NavigationState navigationState = this.navigationStateManager.getNavigationState();
        List<AutoCaptureRule> rules = sideConfig.getAutoCaptureConfig().getRuleSet().getRules();
        int partIndex = renderState.getPartIndex();
        int imageCaptureCount = renderProps.getImageCaptureCount() - 1;
        return new AlertContainerScreen(PermissionsUtils.toModalContainerScreen(GovernmentIdScreen.newCameraScreen$default(renderProps, captureScreenTitle, capturing, manualCapture, overlay, idClass, side, navigationState, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderCountdownToCapture$lambda$23(sink);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderCountdownToCapture$lambda$24(context, videoCaptureHelper);
            }
        }, true, rules, renderState, partIndex, this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CaptureRenderer.renderCountdownToCapture$lambda$27(renderState, this, renderProps, context, videoCaptureHelper, (List) obj, (CameraProperties) obj2);
            }
        }, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderCountdownToCapture$lambda$31(context, renderState, renderProps, videoCaptureHelper, (Throwable) obj);
            }
        }, GovernmentIdWorkflowUtils.getCameraErrorHandler(context), videoCaptureHelper.videoCaptureMethod(renderProps), false, false, false, null, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderCountdownToCapture$lambda$32(this.f$0, context, renderProps, videoCaptureHelper);
            }
        }, imageCaptureCount, GovernmentIdWorkflowUtils.getTextForHint(renderProps.getStrings(), renderState.getHint()), null, videoCaptureHelper.getWebRtcManager(), 601882880, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction renderCountdownToCapture$lambda$22(final Hint hint) {
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderCountdownToCapture$lambda$22$lambda$21(hint, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$22$lambda$21(Hint hint, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.CountdownToCapture countdownToCapture = state instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) state : null;
        if (countdownToCapture == null) {
            return Unit.INSTANCE;
        }
        action.setState(GovernmentIdState.CountdownToCapture.copy$default(countdownToCapture, null, null, null, null, null, 0, null, null, hint, 255, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$23(Sink sink) {
        sink.send(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$24(StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.goBack(renderContext, videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$27(GovernmentIdState.CountdownToCapture countdownToCapture, CaptureRenderer captureRenderer, GovernmentIdWorkflow.Input input, StatefulWorkflow.RenderContext renderContext, VideoCaptureHelper videoCaptureHelper, List absolutePaths, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(absolutePaths, "absolutePaths");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<Frame> frames = countdownToCapture.getIdForReview().getFrames();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(frames, 10));
        Iterator<T> it = frames.iterator();
        while (it.hasNext()) {
            arrayList.add(((Frame) it.next()).getAbsoluteFilePath());
        }
        List listPlus = CollectionsKt.plus((Collection) arrayList, (Iterable) absolutePaths);
        CaptureConfig captureConfig = countdownToCapture.getCaptureConfig();
        GovernmentId.GovernmentIdImage idForReview = countdownToCapture.getIdForReview();
        List list = listPlus;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Frame((String) it2.next(), null, 2, null));
        }
        captureRenderer.onCaptureComplete(input, countdownToCapture, renderContext, captureConfig, videoCaptureHelper, cameraProperties, GovernmentId.GovernmentIdImage.copy$default(idForReview, arrayList2, null, null, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$31(final StatefulWorkflow.RenderContext renderContext, final GovernmentIdState.CountdownToCapture countdownToCapture, final GovernmentIdWorkflow.Input input, final VideoCaptureHelper videoCaptureHelper, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderCountdownToCapture$lambda$31$lambda$30(countdownToCapture, input, error, renderContext, videoCaptureHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$31$lambda$30(GovernmentIdState.CountdownToCapture countdownToCapture, GovernmentIdWorkflow.Input input, Throwable th, final StatefulWorkflow.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.CountdownToCapture countdownToCapture2 = state instanceof GovernmentIdState.CountdownToCapture ? (GovernmentIdState.CountdownToCapture) state : null;
        if (countdownToCapture2 == null) {
            return Unit.INSTANCE;
        }
        action.setState(new GovernmentIdState.WaitForAutocapture(countdownToCapture.getCurrentPart(), countdownToCapture.getUploadingIds$government_id_release(), countdownToCapture.getCaptureConfig(), GovernmentIdWorkflowUtils.getManualCaptureDefaultState((GovernmentIdWorkflow.Input) action.getProps(), countdownToCapture.getCurrentPart().getSide()), countdownToCapture2.getParts$government_id_release(), countdownToCapture2.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, false), WebRtcState.Disconnected, input.getVideoCaptureConfig().getWebRtcJwt(), th, false, false, countdownToCapture2.getCountryCode(), null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.renderCountdownToCapture$lambda$31$lambda$30$lambda$29(renderContext, videoCaptureHelper);
            }
        }, 11264, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$31$lambda$30$lambda$29(StatefulWorkflow.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.renderCountdownToCapture$lambda$31$lambda$30$lambda$29$lambda$28(videoCaptureHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$31$lambda$30$lambda$29$lambda$28(VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        WebRtcState webRtcState;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture != null) {
            if (videoCaptureHelper.isWebRtcConnected()) {
                webRtcState = WebRtcState.Connected;
            } else {
                webRtcState = WebRtcState.Disconnected;
            }
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, null, null, 0, null, webRtcState, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderCountdownToCapture$lambda$32(CaptureRenderer captureRenderer, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, VideoCaptureHelper videoCaptureHelper) {
        GovernmentIdWorkflowUtils.handlePermissionChanged(captureRenderer.applicationContext, renderContext, input, videoCaptureHelper.isVideoCapture(input));
        return Unit.INSTANCE;
    }

    private final void waitForWebRtcSetup(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.WaitForAutocapture renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final WebRtcManagerBridge webRtcManager) {
        Workflows.runningWorker(context, this.webRtcWorkerFactory.create(renderProps.getVideoCaptureConfig().getWebRtcJwt()), Reflection.typeOf(WebRtcWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.waitForWebRtcSetup$lambda$39(this.f$0, webRtcManager, renderState, renderProps, context, (WebRtcWorker.Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction waitForWebRtcSetup$lambda$39(final CaptureRenderer captureRenderer, final WebRtcManagerBridge webRtcManagerBridge, final GovernmentIdState.WaitForAutocapture waitForAutocapture, final GovernmentIdWorkflow.Input input, final StatefulWorkflow.RenderContext renderContext, final WebRtcWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final CameraChoices bestCameraChoices = Camera2Utils.getBestCameraChoices(captureRenderer.applicationContext, Camera2Utils4.FRONT);
        if (it instanceof WebRtcWorker.Response.Success) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$36(webRtcManagerBridge, captureRenderer, bestCameraChoices, it, waitForAutocapture, input, renderContext, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (it instanceof WebRtcWorker.Response.Error) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$38(renderContext, webRtcManagerBridge, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$36(final WebRtcManagerBridge webRtcManagerBridge, CaptureRenderer captureRenderer, CameraChoices cameraChoices, WebRtcWorker.Response response, final GovernmentIdState.WaitForAutocapture waitForAutocapture, GovernmentIdWorkflow.Input input, final StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        int i;
        int i2;
        CameraChoice primaryChoice;
        CameraChoice primaryChoice2;
        CameraChoice primaryChoice3;
        Size size;
        CameraChoice primaryChoice4;
        Size size2;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture2 = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture2 != null && waitForAutocapture2.getWebRtcState() == WebRtcState.Connecting) {
            return Unit.INSTANCE;
        }
        if (waitForAutocapture2 != null) {
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture2, null, null, null, null, null, 0, null, WebRtcState.Connecting, null, null, false, false, null, null, null, 32639, null));
        }
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.setService(captureRenderer.webRtcWorkerFactory.getService());
        }
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.setContext(captureRenderer.applicationContext);
        }
        int height = 0;
        int width = (cameraChoices == null || (primaryChoice4 = cameraChoices.getPrimaryChoice()) == null || (size2 = primaryChoice4.getSize()) == null) ? 0 : size2.getWidth();
        if (cameraChoices != null && (primaryChoice3 = cameraChoices.getPrimaryChoice()) != null && (size = primaryChoice3.getSize()) != null) {
            height = size.getHeight();
        }
        if ((cameraChoices == null || (primaryChoice2 = cameraChoices.getPrimaryChoice()) == null || primaryChoice2.getRotation() != 90) && (cameraChoices == null || (primaryChoice = cameraChoices.getPrimaryChoice()) == null || primaryChoice.getRotation() != 270)) {
            i = height;
            i2 = width;
        } else {
            i2 = height;
            i = width;
        }
        if (webRtcManagerBridge != null) {
            WebRtcWorker.Response.Success success = (WebRtcWorker.Response.Success) response;
            webRtcManagerBridge.setupConnection(success.getResult().getUsername(), success.getResult().getCredential(), success.getResult().getServerUrl(), waitForAutocapture.getWebRtcJwt(), i2, i, input.getVideoCaptureConfig().getRecordAudio(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$36$lambda$33(waitForAutocapture);
                }
            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$36$lambda$35(renderContext, webRtcManagerBridge);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$36$lambda$33(GovernmentIdState.WaitForAutocapture waitForAutocapture) {
        waitForAutocapture.getWebRtcConnectionEstablished().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$36$lambda$35(StatefulWorkflow.RenderContext renderContext, final WebRtcManagerBridge webRtcManagerBridge) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$36$lambda$35$lambda$34(webRtcManagerBridge, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$36$lambda$35$lambda$34(WebRtcManagerBridge webRtcManagerBridge, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        webRtcManagerBridge.webRtcConnectionFailed();
        action.setState(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, ((GovernmentIdState) action.getState()).getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$38(StatefulWorkflow.RenderContext renderContext, final WebRtcManagerBridge webRtcManagerBridge, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture == null || waitForAutocapture.getWebRtcState() == WebRtcState.Connecting) {
            return Unit.INSTANCE;
        }
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.waitForWebRtcSetup$lambda$39$lambda$38$lambda$37(webRtcManagerBridge, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit waitForWebRtcSetup$lambda$39$lambda$38$lambda$37(WebRtcManagerBridge webRtcManagerBridge, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.webRtcConnectionFailed();
        }
        action.setState(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, ((GovernmentIdState) action.getState()).getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return Unit.INSTANCE;
    }

    private final void onCaptureComplete(GovernmentIdWorkflow.Input renderProps, final GovernmentIdState renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final CaptureConfig captureConfig, final VideoCaptureHelper videoCaptureHelper, final CameraProperties cameraProperties, final GovernmentId.GovernmentIdImage capturedId) {
        IdConfig idConfigOrNull = CaptureConfig2.getIdConfigOrNull(captureConfig);
        if (videoCaptureHelper.isVideoCapture(renderProps) && idConfigOrNull != null) {
            GovernmentIdWorkflowUtils.moveToNextStep(renderState, context, renderProps, capturedId, idConfigOrNull, videoCaptureHelper, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.getParts$government_id_release() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
            return;
        }
        if (renderProps.getShouldSkipReviewScreen() && idConfigOrNull != null) {
            GovernmentIdWorkflowUtils.moveToNextStep(renderState, context, renderProps, capturedId, idConfigOrNull, videoCaptureHelper, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.getParts$government_id_release() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
            return;
        }
        IdConfig2 currentPart = renderState.getCurrentPart();
        IdConfig2.SideIdPart sideIdPart = currentPart instanceof IdConfig2.SideIdPart ? (IdConfig2.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return;
        }
        final GovernmentIdState.WaitForAutocapture waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, renderState.getUploadingIds$government_id_release(), captureConfig, GovernmentIdWorkflowUtils.getManualCaptureDefaultState(renderProps, sideIdPart.getSide()), renderState.getParts$government_id_release(), renderState.getPartIndex(), renderState.getBackState(), WebRtcState.Disconnected, renderProps.getVideoCaptureConfig().getWebRtcJwt(), null, false, false, renderState.getCountryCode(), null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CaptureRenderer.onCaptureComplete$lambda$41(context, videoCaptureHelper);
            }
        }, 11776, null);
        context.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.onCaptureComplete$lambda$42(renderState, captureConfig, capturedId, waitForAutocapture, cameraProperties, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCaptureComplete$lambda$41(StatefulWorkflow.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CaptureRenderer.onCaptureComplete$lambda$41$lambda$40(videoCaptureHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCaptureComplete$lambda$41$lambda$40(VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        WebRtcState webRtcState;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.WaitForAutocapture waitForAutocapture = state instanceof GovernmentIdState.WaitForAutocapture ? (GovernmentIdState.WaitForAutocapture) state : null;
        if (waitForAutocapture != null) {
            if (videoCaptureHelper.isWebRtcConnected()) {
                webRtcState = WebRtcState.Connected;
            } else {
                webRtcState = WebRtcState.Disconnected;
            }
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default(waitForAutocapture, null, null, null, null, null, 0, null, webRtcState, null, null, false, false, null, null, null, 32639, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCaptureComplete$lambda$42(GovernmentIdState governmentIdState, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, GovernmentIdState.WaitForAutocapture waitForAutocapture, CameraProperties cameraProperties, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        IdConfig2 currentPart = governmentIdState.getCurrentPart();
        IdConfig2.SideIdPart sideIdPart = currentPart instanceof IdConfig2.SideIdPart ? (IdConfig2.SideIdPart) currentPart : null;
        if (sideIdPart == null) {
            return Unit.INSTANCE;
        }
        action.setState(new GovernmentIdState.ReviewCapturedImage(sideIdPart, ((GovernmentIdState) action.getState()).getUploadingIds$government_id_release(), captureConfig, governmentIdImage, ((GovernmentIdState) action.getState()).getParts$government_id_release(), ((GovernmentIdState) action.getState()).getPartIndex(), waitForAutocapture, cameraProperties, null, false, ((GovernmentIdState) action.getState()).getCountryCode(), 768, null));
        return Unit.INSTANCE;
    }
}

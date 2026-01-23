package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.selfie.SelfieBrightnessInfo;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelfieV1Utils.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a¬\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032&\u0010\u0004\u001a\"0\u0005R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001c0\u001fj\u0002`!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u0012H\u0000\u001a\u0018\u00105\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u001a\u0018\u00106\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002\u001a\f\u00107\u001a\u000208*\u00020\u0014H\u0002¨\u00069"}, m3636d2 = {"createCameraScreen", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen;", "renderProps", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "pose", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$Pose;", "title", "", "message", "realTimeHint", "isAutoCaptureOn", "", "mode", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Mode;", "assetOverrides", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;", "requireStrictSelfieCapture", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "onBack", "Lkotlin/Function0;", "", "onCancel", "onCameraError", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "onPermissionChanged", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "poseScore", "", "brightnessInfo", "Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;", "facingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "isFlashEnabled", "isFlashOn", "requestingPermissions", "getPoseTitle", "getPoseDescription", "to", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Mode;", "selfie_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SelfieV1Utils {

    /* compiled from: SelfieV1Utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DesignVersion.values().length];
            try {
                iArr[DesignVersion.f6512V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesignVersion.f6513V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Selfie.Pose.values().length];
            try {
                iArr2[Selfie.Pose.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Selfie.Pose.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Selfie.Pose.Center.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ SelfieWorkflow.Screen createCameraScreen$default(SelfieWorkflow.Input input, StatefulWorkflow.RenderContext renderContext, Selfie.Pose pose, String str, String str2, String str3, boolean z, SelfieWorkflow.Screen.OldCameraScreen.Mode mode, SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides, boolean z2, NavigationState navigationState, Function0 function0, Function0 function02, Function1 function1, Function0 function03, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z3, CameraXController.Factory factory, Camera2ManagerFactory.Factory factory2, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        boolean z7;
        SelfieWorkflow.Input input2;
        StatefulWorkflow.RenderContext renderContext2;
        Selfie.Pose pose2;
        String str4;
        String str5;
        boolean z8;
        SelfieWorkflow.Screen.OldCameraScreen.Mode mode2;
        SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides2;
        boolean z9;
        NavigationState navigationState2;
        Function0 function04;
        Function0 function05;
        Function1 function12;
        Function0 function06;
        VideoCaptureMethod videoCaptureMethod2;
        WebRtcManagerBridge webRtcManagerBridge2;
        boolean z10;
        CameraXController.Factory factory3;
        Camera2ManagerFactory.Factory factory4;
        float f2;
        SelfieBrightnessInfo selfieBrightnessInfo2;
        CameraProperties.FacingMode facingMode2;
        boolean z11;
        String str6 = (i & 16) != 0 ? null : str2;
        boolean z12 = (i & 16777216) != 0 ? false : z5;
        if ((i & 33554432) != 0) {
            z7 = false;
            renderContext2 = renderContext;
            pose2 = pose;
            str4 = str;
            str5 = str3;
            z8 = z;
            mode2 = mode;
            assetOverrides2 = assetOverrides;
            z9 = z2;
            navigationState2 = navigationState;
            function04 = function0;
            function05 = function02;
            function12 = function1;
            function06 = function03;
            videoCaptureMethod2 = videoCaptureMethod;
            webRtcManagerBridge2 = webRtcManagerBridge;
            z10 = z3;
            factory3 = factory;
            factory4 = factory2;
            f2 = f;
            selfieBrightnessInfo2 = selfieBrightnessInfo;
            facingMode2 = facingMode;
            z11 = z4;
            input2 = input;
        } else {
            z7 = z6;
            input2 = input;
            renderContext2 = renderContext;
            pose2 = pose;
            str4 = str;
            str5 = str3;
            z8 = z;
            mode2 = mode;
            assetOverrides2 = assetOverrides;
            z9 = z2;
            navigationState2 = navigationState;
            function04 = function0;
            function05 = function02;
            function12 = function1;
            function06 = function03;
            videoCaptureMethod2 = videoCaptureMethod;
            webRtcManagerBridge2 = webRtcManagerBridge;
            z10 = z3;
            factory3 = factory;
            factory4 = factory2;
            f2 = f;
            selfieBrightnessInfo2 = selfieBrightnessInfo;
            facingMode2 = facingMode;
            z11 = z4;
        }
        return createCameraScreen(input2, renderContext2, pose2, str4, str6, str5, z8, mode2, assetOverrides2, z9, navigationState2, function04, function05, function12, function06, videoCaptureMethod2, webRtcManagerBridge2, z10, factory3, factory4, f2, selfieBrightnessInfo2, facingMode2, z11, z12, z7);
    }

    public static final SelfieWorkflow.Screen createCameraScreen(SelfieWorkflow.Input renderProps, final StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext context, Selfie.Pose pose, String str, String str2, String str3, boolean z, SelfieWorkflow.Screen.OldCameraScreen.Mode mode, SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides assetOverrides, boolean z2, NavigationState navigationState, Function0<Unit> onBack, Function0<Unit> onCancel, Function1<? super Throwable, Unit> onCameraError, Function0<Unit> onPermissionChanged, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z3, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, float f, SelfieBrightnessInfo selfieBrightnessInfo, CameraProperties.FacingMode facingMode, boolean z4, boolean z5, boolean z6) {
        String cameraLoadingTitle;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(assetOverrides, "assetOverrides");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(onPermissionChanged, "onPermissionChanged");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        int i = WhenMappings.$EnumSwitchMapping$0[renderProps.getDesignVersion().ordinal()];
        if (i == 1) {
            return new SelfieWorkflow.Screen.OldCameraScreen(str, str2, mode, renderProps.getStyles(), assetOverrides, z2, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, webRtcManagerBridge, z3, cameraXControllerFactory, camera2ManagerFactoryFactory);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if ((mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) || (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup)) {
            cameraLoadingTitle = renderProps.getStrings().getCameraLoadingTitle();
        } else {
            cameraLoadingTitle = getPoseTitle(renderProps, pose);
        }
        return new SelfieWorkflow.Screen.CameraScreen(str, cameraLoadingTitle, getPoseDescription(renderProps, pose), z ? renderProps.getStrings().getAutoCaptureOn() : null, renderProps.getStrings().getCaptureSuccess(), str3, z, m3254to(mode), renderProps.getStyles(), z2, navigationState, onBack, onCancel, onCameraError, onPermissionChanged, videoCaptureMethod, webRtcManagerBridge, z3, cameraXControllerFactory, camera2ManagerFactoryFactory, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieV1Utils.createCameraScreen$lambda$1(context, (CameraProperties.FacingMode) obj);
            }
        }, f, selfieBrightnessInfo, facingMode, z4, z5, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieV1Utils.createCameraScreen$lambda$3(context, ((Boolean) obj).booleanValue());
            }
        }, pose, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCameraScreen$lambda$1(StatefulWorkflow.RenderContext renderContext, final CameraProperties.FacingMode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieV1Utils.createCameraScreen$lambda$1$lambda$0(it, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCameraScreen$lambda$1$lambda$0(CameraProperties.FacingMode facingMode, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setState(new SelfieState.RestartCamera(false, false, SelfieWorkflowUtils.createBackState(action, false), facingMode, 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCameraScreen$lambda$3(StatefulWorkflow.RenderContext renderContext, final boolean z) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieV1UtilsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieV1Utils.createCameraScreen$lambda$3$lambda$2(z, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createCameraScreen$lambda$3$lambda$2(boolean z, WorkflowAction.Updater action) {
        SelfieState selfieStateCopy$default;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.getState();
        if (selfieState instanceof SelfieState2) {
            if (selfieState instanceof SelfieState.Capture) {
                SelfieState.Capture capture = (SelfieState.Capture) selfieState;
                selfieStateCopy$default = capture.copy((8191 & 1) != 0 ? capture.selfieError : null, (8191 & 2) != 0 ? capture.poseScore : 0.0f, (8191 & 4) != 0 ? capture.brightnessInfo : null, (8191 & 8) != 0 ? capture.selfies : null, (8191 & 16) != 0 ? capture.posesNeeded : null, (8191 & 32) != 0 ? capture.startCaptureTimestamp : 0L, (8191 & 64) != 0 ? capture.autoCaptureSupported : false, (8191 & 128) != 0 ? capture.startSelfieTimestamp : 0L, (8191 & 256) != 0 ? capture.cameraProperties : null, (8191 & 512) != 0 ? capture.backState : null, (8191 & 1024) != 0 ? capture.poseConfigs : null, (8191 & 2048) != 0 ? capture.cameraFacingMode : null, (8191 & 4096) != 0 ? capture.isFlashEnabled : z, (8191 & 8192) != 0 ? capture.flashState : null);
            } else if (selfieState instanceof SelfieState.CountdownToManualCapture) {
                selfieStateCopy$default = SelfieState.CountdownToManualCapture.copy$default((SelfieState.CountdownToManualCapture) selfieState, 0, null, null, null, 0L, false, 0L, null, null, null, z, 1023, null);
            } else if (selfieState instanceof SelfieState.StartCapture) {
                SelfieState.StartCapture startCapture = (SelfieState.StartCapture) selfieState;
                selfieStateCopy$default = startCapture.copy((4095 & 1) != 0 ? startCapture.centered : false, (4095 & 2) != 0 ? startCapture.selfieError : null, (4095 & 4) != 0 ? startCapture.poseScore : 0.0f, (4095 & 8) != 0 ? startCapture.brightnessInfo : null, (4095 & 16) != 0 ? startCapture.posesNeeded : null, (4095 & 32) != 0 ? startCapture.startCaptureTimestamp : 0L, (4095 & 64) != 0 ? startCapture.autoCaptureSupported : false, (4095 & 128) != 0 ? startCapture.startSelfieTimestamp : 0L, (4095 & 256) != 0 ? startCapture.cameraProperties : null, (4095 & 512) != 0 ? startCapture.backState : null, (4095 & 1024) != 0 ? startCapture.poseConfigs : null, (4095 & 2048) != 0 ? startCapture.cameraFacingMode : null, (4095 & 4096) != 0 ? startCapture.isFlashEnabled : z);
            } else if (selfieState instanceof SelfieState.CountdownToCapture) {
                SelfieState.CountdownToCapture countdownToCapture = (SelfieState.CountdownToCapture) selfieState;
                selfieStateCopy$default = countdownToCapture.copy((8188 & 1) != 0 ? countdownToCapture.countDown : 0, (8188 & 2) != 0 ? countdownToCapture.selfieError : null, (8188 & 4) != 0 ? countdownToCapture.startCaptureTimestamp : 0L, (8188 & 8) != 0 ? countdownToCapture.cameraProperties : null, (8188 & 16) != 0 ? countdownToCapture.startSelfieTimestamp : 0L, (8188 & 32) != 0 ? countdownToCapture.poseScore : 0.0f, (8188 & 64) != 0 ? countdownToCapture.brightnessInfo : null, (8188 & 128) != 0 ? countdownToCapture.posesNeeded : null, (8188 & 256) != 0 ? countdownToCapture.backState : null, (8188 & 512) != 0 ? countdownToCapture.poseConfigs : null, (8188 & 1024) != 0 ? countdownToCapture.autoCaptureSupported : false, (8188 & 2048) != 0 ? countdownToCapture.cameraFacingMode : null, (8188 & 4096) != 0 ? countdownToCapture.isFlashEnabled : z);
            } else if (selfieState instanceof SelfieState.ShowPoseHint) {
                selfieStateCopy$default = SelfieState.ShowPoseHint.copy$default((SelfieState.ShowPoseHint) selfieState, null, null, false, null, 0L, null, null, null, z, 255, null);
            } else if (selfieState instanceof SelfieState.StartCaptureFaceDetected) {
                SelfieState.StartCaptureFaceDetected startCaptureFaceDetected = (SelfieState.StartCaptureFaceDetected) selfieState;
                selfieStateCopy$default = startCaptureFaceDetected.copy((1023 & 1) != 0 ? startCaptureFaceDetected.startCaptureTimestamp : 0L, (1023 & 2) != 0 ? startCaptureFaceDetected.cameraProperties : null, (1023 & 4) != 0 ? startCaptureFaceDetected.startSelfieTimestamp : 0L, (1023 & 8) != 0 ? startCaptureFaceDetected.poseScore : 0.0f, (1023 & 16) != 0 ? startCaptureFaceDetected.brightnessInfo : null, (1023 & 32) != 0 ? startCaptureFaceDetected.posesNeeded : null, (1023 & 64) != 0 ? startCaptureFaceDetected.backState : null, (1023 & 128) != 0 ? startCaptureFaceDetected.poseConfigs : null, (1023 & 256) != 0 ? startCaptureFaceDetected.autoCaptureSupported : false, (1023 & 512) != 0 ? startCaptureFaceDetected.cameraFacingMode : null, (1023 & 1024) != 0 ? startCaptureFaceDetected.isFlashEnabled : z);
            } else if (selfieState instanceof SelfieState.WaitForCameraFeed) {
                selfieStateCopy$default = SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, false, false, null, null, null, false, null, z, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
            } else {
                if (!(selfieState instanceof SelfieState.WaitForWebRtcSetup)) {
                    throw new NoWhenBranchMatchedException();
                }
                selfieStateCopy$default = SelfieState.WaitForWebRtcSetup.copy$default((SelfieState.WaitForWebRtcSetup) selfieState, null, null, 0L, null, null, null, false, null, z, 255, null);
            }
            action.setState(selfieStateCopy$default);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private static final String getPoseTitle(SelfieWorkflow.Input input, Selfie.Pose pose) {
        int i = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$1[pose.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return input.getStrings().getSelfieHintLookLeft();
        }
        if (i == 2) {
            return input.getStrings().getSelfieHintLookRight();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return input.getStrings().getSelfieHintPoseNotCentered();
    }

    private static final String getPoseDescription(SelfieWorkflow.Input input, Selfie.Pose pose) {
        int i = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$1[pose.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return input.getStrings().getSelfieHintLookLeftDescription();
        }
        if (i == 2) {
            return input.getStrings().getSelfieHintLookRightDescription();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return input.getStrings().getSelfieHintCenterFace();
    }

    /* renamed from: to */
    private static final SelfieWorkflow.Screen.CameraScreen.Mode m3254to(SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.AutoCapture) {
            return new SelfieWorkflow.Screen.CameraScreen.Mode.AutoCapture(SelfieWorkflowUtils.m3255to(((SelfieWorkflow.Screen.OldCameraScreen.Mode.AutoCapture) mode).getOverlay()));
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded countDownAndStartLocalRecordingIfNeeded = (SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded(SelfieWorkflowUtils.m3255to(countDownAndStartLocalRecordingIfNeeded.getOverlay()), countDownAndStartLocalRecordingIfNeeded.getCountDown(), countDownAndStartLocalRecordingIfNeeded.getRecordLocalVideo(), countDownAndStartLocalRecordingIfNeeded.getMaxRecordingLengthMs(), countDownAndStartLocalRecordingIfNeeded.getOnError());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.FinalizeLocalVideoCapture(SelfieWorkflowUtils.m3255to(finalizeLocalVideoCapture.getOverlay()), finalizeLocalVideoCapture.getFinalizeVideo(), finalizeLocalVideoCapture.getOnAnimationComplete(), finalizeLocalVideoCapture.getStartFinalize());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture manualCapture = (SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.ManualCapture(SelfieWorkflowUtils.m3255to(manualCapture.getOverlay()), manualCapture.getProcessImage(), manualCapture.getOnError(), manualCapture.getForceCapture());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown manualCaptureWithCountDown = (SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.ManualCaptureWithCountDown(SelfieWorkflowUtils.m3255to(manualCaptureWithCountDown.getOverlay()), manualCaptureWithCountDown.getOnCaptureClicked());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint playPoseHint = (SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.PlayPoseHint(SelfieWorkflowUtils.m3255to(playPoseHint.getOverlay()), playPoseHint.getPoseHintComplete());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable previewUnavailable = (SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.PreviewUnavailable(SelfieWorkflowUtils.m3255to(previewUnavailable.getOverlay()), previewUnavailable.getPreviewReady());
        }
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition transition = (SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition) mode;
            return new SelfieWorkflow.Screen.CameraScreen.Mode.Transition(SelfieWorkflowUtils.m3255to(transition.getOverlay()), transition.getOnComplete(), transition.getImageCaptured());
        }
        if (!(mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup)) {
            throw new NoWhenBranchMatchedException();
        }
        SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup waitingOnWebRtcSetup = (SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup) mode;
        return new SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup(SelfieWorkflowUtils.m3255to(waitingOnWebRtcSetup.getOverlay()), waitingOnWebRtcSetup.getMaxRecordingLengthMs());
    }
}

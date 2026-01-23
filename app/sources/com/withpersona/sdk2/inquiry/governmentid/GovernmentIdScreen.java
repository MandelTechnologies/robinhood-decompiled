package com.withpersona.sdk2.inquiry.governmentid;

import com.truelayer.payments.p419ui.utils.TestTags;
import com.withpersona.sdk2.camera.AutoCaptureRule;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GovernmentIdScreen.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u009a\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102 \b\u0002\u0010\u0011\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2 \b\u0002\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00150'2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00150'j\u0002`*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u00020\u001a2\u001a\b\u0002\u00100\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00122\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150\u00172\b\b\u0002\u00104\u001a\u00020 2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\n\b\u0002\u00108\u001a\u0004\u0018\u000109¨\u0006:"}, m3636d2 = {"newCameraScreen", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "title", "", "message", "captureButtonState", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "overlay", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "captureSide", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "navigationState", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;", "manuallyCapture", "Lkotlin/Function2;", "", "Lcom/withpersona/sdk2/camera/CameraProperties;", "", "close", "Lkotlin/Function0;", TestTags.BACK, "autoCapturing", "", "autoCaptureRules", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "state", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "autoCaptureRulesId", "", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "autoCapture", "onCaptureError", "Lkotlin/Function1;", "", "onCameraError", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "enableAnalyzer", "showFinalizeUi", "finalizeLocalVideo", "onLocalVideoFinalized", "Ljava/io/File;", "manualCaptureClicked", "checkPermissions", "remainingCaptureCount", "hintText", "captureTips", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentIdScreen {
    public static /* synthetic */ GovernmentIdScreen2.CameraScreen newCameraScreen$default(GovernmentIdWorkflow.Input input, String str, String str2, GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture, GovernmentIdScreen2.Overlay overlay, IdClass idClass, IdConfig.Side side, NavigationState navigationState, Function2 function2, Function0 function0, Function0 function02, boolean z, List list, GovernmentIdState governmentIdState, int i, CameraXController.Factory factory, Camera2ManagerFactory.Factory factory2, Function2 function22, Function1 function1, Function1 function12, VideoCaptureMethod videoCaptureMethod, boolean z2, boolean z3, boolean z4, Function2 function23, Function0 function03, Function0 function04, int i2, String str3, CaptureTipsViewModel captureTipsViewModel, WebRtcManagerBridge webRtcManagerBridge, int i3, Object obj) {
        WebRtcManagerBridge webRtcManagerBridge2;
        GovernmentIdWorkflow.Input input2;
        String str4;
        String str5;
        GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture2;
        GovernmentIdScreen2.Overlay overlay2;
        IdClass idClass2;
        IdConfig.Side side2;
        NavigationState navigationState2;
        Function0 function05;
        Function0 function06;
        boolean z5;
        List list2;
        GovernmentIdState governmentIdState2;
        int i4;
        CameraXController.Factory factory3;
        Camera2ManagerFactory.Factory factory4;
        Function1 function13;
        Function0 function07;
        Function2 function24 = (i3 & 256) != 0 ? new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return GovernmentIdScreen.newCameraScreen$lambda$0((List) obj2, (CameraProperties) obj3);
            }
        } : function2;
        Function2 function25 = (131072 & i3) != 0 ? new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return GovernmentIdScreen.newCameraScreen$lambda$1((List) obj2, (CameraProperties) obj3);
            }
        } : function22;
        Function1 function14 = (262144 & i3) != 0 ? new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GovernmentIdScreen.newCameraScreen$lambda$2((Throwable) obj2);
            }
        } : function1;
        VideoCaptureMethod videoCaptureMethod2 = (1048576 & i3) != 0 ? VideoCaptureMethod.None : videoCaptureMethod;
        boolean z6 = (2097152 & i3) != 0 ? true : z2;
        boolean z7 = (4194304 & i3) != 0 ? false : z3;
        boolean z8 = (8388608 & i3) != 0 ? false : z4;
        Function2 function26 = (16777216 & i3) != 0 ? new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                return GovernmentIdScreen.newCameraScreen$lambda$3((File) obj2, (CameraProperties) obj3);
            }
        } : function23;
        Function0 function08 = (33554432 & i3) != 0 ? new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreenKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function03;
        int imageCaptureCount = (134217728 & i3) != 0 ? input.getImageCaptureCount() : i2;
        String str6 = (268435456 & i3) != 0 ? null : str3;
        CaptureTipsViewModel captureTipsViewModel2 = (536870912 & i3) != 0 ? null : captureTipsViewModel;
        if ((i3 & 1073741824) != 0) {
            webRtcManagerBridge2 = null;
            str4 = str;
            str5 = str2;
            manualCapture2 = manualCapture;
            overlay2 = overlay;
            idClass2 = idClass;
            side2 = side;
            navigationState2 = navigationState;
            function05 = function0;
            function06 = function02;
            z5 = z;
            list2 = list;
            governmentIdState2 = governmentIdState;
            i4 = i;
            factory3 = factory;
            factory4 = factory2;
            function13 = function12;
            function07 = function04;
            input2 = input;
        } else {
            webRtcManagerBridge2 = webRtcManagerBridge;
            input2 = input;
            str4 = str;
            str5 = str2;
            manualCapture2 = manualCapture;
            overlay2 = overlay;
            idClass2 = idClass;
            side2 = side;
            navigationState2 = navigationState;
            function05 = function0;
            function06 = function02;
            z5 = z;
            list2 = list;
            governmentIdState2 = governmentIdState;
            i4 = i;
            factory3 = factory;
            factory4 = factory2;
            function13 = function12;
            function07 = function04;
        }
        return newCameraScreen(input2, str4, str5, manualCapture2, overlay2, idClass2, side2, navigationState2, function24, function05, function06, z5, list2, governmentIdState2, i4, factory3, factory4, function25, function14, function13, videoCaptureMethod2, z6, z7, z8, function26, function08, function07, imageCaptureCount, str6, captureTipsViewModel2, webRtcManagerBridge2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newCameraScreen$lambda$0(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newCameraScreen$lambda$1(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newCameraScreen$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit newCameraScreen$lambda$3(File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.INSTANCE;
    }

    public static final GovernmentIdScreen2.CameraScreen newCameraScreen(GovernmentIdWorkflow.Input renderProps, String title, String message, GovernmentIdScreen2.CameraScreen.ManualCapture captureButtonState, GovernmentIdScreen2.Overlay overlay, IdClass idClass, IdConfig.Side captureSide, NavigationState navigationState, Function2<? super List<String>, ? super CameraProperties, Unit> manuallyCapture, Function0<Unit> close, Function0<Unit> back, boolean z, List<? extends AutoCaptureRule> autoCaptureRules, GovernmentIdState state, int i, CameraXController.Factory cameraXControllerFactory, Camera2ManagerFactory.Factory camera2ManagerFactoryFactory, Function2<? super List<String>, ? super CameraProperties, Unit> autoCapture, Function1<? super Throwable, Unit> onCaptureError, Function1<? super Throwable, Unit> onCameraError, VideoCaptureMethod videoCaptureMethod, boolean z2, boolean z3, boolean z4, Function2<? super File, ? super CameraProperties, Unit> onLocalVideoFinalized, Function0<Unit> manualCaptureClicked, Function0<Unit> checkPermissions, int i2, String str, CaptureTipsViewModel captureTipsViewModel, WebRtcManagerBridge webRtcManagerBridge) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(captureButtonState, "captureButtonState");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(captureSide, "captureSide");
        Intrinsics.checkNotNullParameter(navigationState, "navigationState");
        Intrinsics.checkNotNullParameter(manuallyCapture, "manuallyCapture");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(back, "back");
        Intrinsics.checkNotNullParameter(autoCaptureRules, "autoCaptureRules");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cameraXControllerFactory, "cameraXControllerFactory");
        Intrinsics.checkNotNullParameter(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        Intrinsics.checkNotNullParameter(autoCapture, "autoCapture");
        Intrinsics.checkNotNullParameter(onCaptureError, "onCaptureError");
        Intrinsics.checkNotNullParameter(onCameraError, "onCameraError");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(onLocalVideoFinalized, "onLocalVideoFinalized");
        Intrinsics.checkNotNullParameter(manualCaptureClicked, "manualCaptureClicked");
        Intrinsics.checkNotNullParameter(checkPermissions, "checkPermissions");
        return new GovernmentIdScreen2.CameraScreen(title, message, renderProps.getStrings().getCaptureDisclaimer(), captureButtonState, overlay, idClass, captureSide, navigationState, manuallyCapture, close, back, z, autoCaptureRules, state, i, renderProps.getStyles(), autoCapture, onCaptureError, onCameraError, i2, manualCaptureClicked, checkPermissions, videoCaptureMethod, z4, onLocalVideoFinalized, z2, renderProps.getVideoCaptureConfig().getMaxRecordingLengthMs(), z3, str, captureTipsViewModel, webRtcManagerBridge, renderProps.getAssetConfig().getCapturePage(), renderProps.getIsEnabled(), renderProps.getVideoCaptureConfig().getRecordAudio(), cameraXControllerFactory, camera2ManagerFactoryFactory);
    }
}

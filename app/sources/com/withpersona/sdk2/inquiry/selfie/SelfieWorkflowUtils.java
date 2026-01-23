package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import com.plaid.internal.EnumC7081g;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.withpersona.sdk2.camera.CameraController3;
import com.withpersona.sdk2.camera.CameraController5;
import com.withpersona.sdk2.camera.CameraController6;
import com.withpersona.sdk2.camera.CameraController7;
import com.withpersona.sdk2.camera.CameraController8;
import com.withpersona.sdk2.camera.CameraController9;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieState;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelfieWorkflowUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00140\u0002R\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000\u001aR\u0010\u0006\u001a\u00020\u0001*\u00160\u0002R\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0000\u001a6\u0010\u0012\u001a\u00020\u0013*\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u0002`\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0000\u001a<\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00130\u001cj\u0002`\u001e*\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u0002`\u0018H\u0000\u001aH\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!2&\u0010\"\u001a\"0\u0014R\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015j\u0002`\u00182\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0005H\u0000\u001a\f\u0010%\u001a\u00020&*\u00020\u0007H\u0000\u001a\f\u0010'\u001a\u00020(*\u00020)H\u0000¨\u0006*"}, m3636d2 = {"createBackState", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "addCurrentState", "", "reviewStateIfNeeded", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "selfies", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "webRtcObjectId", "", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "startSelfieTimestamp", "", "backState", "goBack", "", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;", "webRtcManagerBridge", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "getCameraErrorHandler", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "handlePermissionChanged", "context", "Landroid/content/Context;", "renderContext", "renderProps", "useVideoCapture", "makeCameraScreenAssetOverrides", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$AssetOverrides;", "to", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "selfie_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class SelfieWorkflowUtils {

    /* compiled from: SelfieWorkflowUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieWorkflow.Screen.OldCameraScreen.Overlay.values().length];
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_HINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_COMPLETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_HINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.FINALIZING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE_WITH_CAPTURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ SelfieState createBackState$default(WorkflowAction.Updater updater, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return createBackState(updater, z);
    }

    public static final SelfieState createBackState(WorkflowAction<?, SelfieState, ?>.Updater updater, boolean z) {
        Intrinsics.checkNotNullParameter(updater, "<this>");
        if (z) {
            return updater.getState();
        }
        return updater.getState().getBackState();
    }

    public static final SelfieState reviewStateIfNeeded(WorkflowAction<? super SelfieWorkflow.Input, SelfieState, ?>.Updater updater, List<? extends Selfie> selfies, String str, CameraProperties cameraProperties, long j, SelfieState selfieState) {
        Intrinsics.checkNotNullParameter(updater, "<this>");
        Intrinsics.checkNotNullParameter(selfies, "selfies");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        ArrayList arrayList = new ArrayList();
        for (Object obj : selfies) {
            Selfie selfie = (Selfie) obj;
            if (selfie instanceof Selfie.SelfieImage ? updater.getProps().getPoseConfigs().getPoseConfig(((Selfie.SelfieImage) selfie).getPose()).getAllowReview() : false) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return new SelfieState.ReviewCaptures(selfies, arrayList, str, cameraProperties, j, selfieState, updater.getState().getCameraFacingMode());
        }
        return new SelfieState.Submit(selfies, str, cameraProperties, j, selfieState, updater.getState().getCameraFacingMode());
    }

    public static final void goBack(StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext renderContext, final WebRtcManagerBridge webRtcManagerBridge) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflowUtils.goBack$lambda$1(webRtcManagerBridge, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBack$lambda$1(WebRtcManagerBridge webRtcManagerBridge, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState backState = ((SelfieState) action.getState()).getBackState();
        if (webRtcManagerBridge != null) {
            webRtcManagerBridge.closeWebRtcConnection();
        }
        if (backState == null) {
            if (((SelfieWorkflow.Input) action.getProps()).getBackStepEnabled()) {
                action.setOutput(SelfieWorkflow.Output.Back.INSTANCE);
            } else {
                action.setOutput(SelfieWorkflow.Output.Canceled.INSTANCE);
            }
        } else {
            backState.setDidGoBack$selfie_release(true);
            action.setState(backState);
        }
        return Unit.INSTANCE;
    }

    public static final Function1<Throwable, Unit> getCameraErrorHandler(final StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8(renderContext, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8(StatefulWorkflow.RenderContext renderContext, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof CameraController3)) {
            renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8$lambda$2(cameraError, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }
        CameraController3 cameraController3 = (CameraController3) cameraError;
        if (!(cameraController3 instanceof CameraController5)) {
            if (cameraController3 instanceof CameraController6) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8$lambda$3((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else if (cameraController3 instanceof CameraController8) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8$lambda$4((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else if (cameraController3 instanceof CameraController9) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8$lambda$6((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else {
                if (!(cameraController3 instanceof CameraController7)) {
                    throw new NoWhenBranchMatchedException();
                }
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SelfieWorkflowUtils.getCameraErrorHandler$lambda$8$lambda$7((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8$lambda$2(Throwable th, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th.getClass().getCanonicalName())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8$lambda$3(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8$lambda$4(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState4.deleteAllSelfies((SelfieState) action.getState());
        action.setState(new SelfieState.RestartCamera(false, false, createBackState(action, false), ((SelfieState) action.getState()).getCameraFacingMode(), 3, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8$lambda$6(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new SelfieWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$8$lambda$7(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState4.deleteAllSelfies((SelfieState) action.getState());
        action.setState(new SelfieState.RestartCamera(false, false, createBackState(action, false), ((SelfieState) action.getState()).getCameraFacingMode(), 3, null));
        return Unit.INSTANCE;
    }

    public static final void handlePermissionChanged(Context context, StatefulWorkflow<? super SelfieWorkflow.Input, SelfieState, ? extends SelfieWorkflow.Output, ? extends Object>.RenderContext renderContext, SelfieWorkflow.Input renderProps, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listMutableListOf = CollectionsKt.mutableListOf(PermissionsState.Camera);
        if (z && ContextUtils3.isMicPresent(context) && renderProps.getVideoCaptureConfig().getRecordAudio()) {
            listMutableListOf.add(PermissionsState.RecordAudio);
        }
        final List<PermissionsState> missingPermissions = PermissionsUtils.getMissingPermissions(context, listMutableListOf);
        if (missingPermissions.isEmpty()) {
            return;
        }
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieWorkflowUtilsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieWorkflowUtils.handlePermissionChanged$lambda$9(missingPermissions, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePermissionChanged$lambda$9(List list, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        SelfieState selfieState = (SelfieState) action.getState();
        if (selfieState instanceof SelfieState.WaitForCameraFeed) {
            action.setState(SelfieState.WaitForCameraFeed.copy$default((SelfieState.WaitForCameraFeed) selfieState, !list.contains(PermissionsState.Camera), !list.contains(PermissionsState.RecordAudio), null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null));
        } else {
            SelfieState4.deleteAllSelfies((SelfieState) action.getState());
            action.setState(new SelfieState.RestartCamera(false, false, createBackState(action, false), ((SelfieState) action.getState()).getCameraFacingMode(), 3, null));
        }
        return Unit.INSTANCE;
    }

    public static final SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides makeCameraScreenAssetOverrides(SelfieWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        NextStep.Selfie.AssetConfig.RecordPage recordPage = input.getAssetConfig().getRecordPage();
        RemoteImage selfieLeftPictograph = recordPage != null ? recordPage.getSelfieLeftPictograph() : null;
        NextStep.Selfie.AssetConfig.RecordPage recordPage2 = input.getAssetConfig().getRecordPage();
        return new SelfieWorkflow.Screen.OldCameraScreen.AssetOverrides(selfieLeftPictograph, recordPage2 != null ? recordPage2.getSelfieRightPictograph() : null);
    }

    /* renamed from: to */
    public static final SelfieWorkflow.Screen.CameraScreen.Overlay m3255to(SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[overlay.ordinal()]) {
            case 1:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            case 2:
            case 3:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CENTER;
            case 4:
            case 5:
            case 6:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_LEFT;
            case 7:
            case 8:
            case 9:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_RIGHT;
            case 10:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.FINALIZING;
            case 11:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            case 12:
                return SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

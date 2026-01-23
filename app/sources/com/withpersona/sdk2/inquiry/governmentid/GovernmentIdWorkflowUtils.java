package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.iso.countrycode.CountryCode;
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
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint2;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint3;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureHelper;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreen;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState;
import com.withpersona.sdk2.inquiry.permissions.PermissionsState2;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GovernmentIdWorkflowUtils.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a3\u0010\f\u001a\u00020\t*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018\u001aC\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aj\u0002`\u001c*\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a1\u0010\"\u001a\u0004\u0018\u00010\u0004*\u00140\u001fR\u0010\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030 2\b\b\u0002\u0010!\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010'\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(\u001a¥\u0001\u00108\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00042&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u000201002\b\b\u0002\u00104\u001a\u0002032\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\b8\u00109\u001aO\u0010;\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0010\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0012H\u0000¢\u0006\u0004\b;\u0010<\u001a\u0013\u0010>\u001a\u00020=*\u00020$H\u0000¢\u0006\u0004\b>\u0010?\u001a5\u0010D\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001052\u0006\u0010C\u001a\u00020\u0012H\u0000¢\u0006\u0004\bD\u0010E\u001a-\u0010F\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bF\u0010G\u001a-\u0010H\u001a\u000205*\u00020@2\u0006\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u0002052\b\u00107\u001a\u0004\u0018\u000105H\u0000¢\u0006\u0004\bH\u0010G\u001a\u001f\u0010K\u001a\u0004\u0018\u000105*\u00020@2\b\u0010J\u001a\u0004\u0018\u00010IH\u0000¢\u0006\u0004\bK\u0010L\u001a\u001d\u0010N\u001a\u0004\u0018\u00010M*\u00020\u00032\u0006\u0010A\u001a\u00020$H\u0000¢\u0006\u0004\bN\u0010O\u001a\u0019\u0010Q\u001a\b\u0012\u0004\u0012\u00020P00*\u00020\u0003H\u0000¢\u0006\u0004\bQ\u0010R\u001aG\u0010T\u001a\u00020\t2&\u0010\u000f\u001a\"0\u0000R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0002j\u0002`\u00012\u0006\u0010S\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\bT\u0010U¨\u0006V"}, m3636d2 = {"Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "videoCaptureHelper", "", "goBack", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;)V", "cancel", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)V", "Landroid/content/Context;", "context", "renderContext", "renderProps", "", "checkPermissions", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "permissionRequestWorkflow", "Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "withRequestCameraPermissionsIfNeeded", "(Ljava/lang/Object;Landroid/content/Context;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;ZLcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;)Lcom/withpersona/sdk2/inquiry/modal/ModalContainerScreen;", "withRequestAudioPermissionsIfNeeded", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "getCameraErrorHandler", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;)Lkotlin/jvm/functions/Function1;", "Lcom/squareup/workflow1/WorkflowAction$Updater;", "Lcom/squareup/workflow1/WorkflowAction;", "addCurrentState", "createBackState", "(Lcom/squareup/workflow1/WorkflowAction$Updater;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "currentSide", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "getManualCaptureDefaultState", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen$ManualCapture;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "acceptedId", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "currentPartIndex", "", "webRtcObjectId", "countryCode", "moveToNextStep", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "useVideoCapture", "handlePermissionChanged", "(Landroid/content/Context;Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "toGovIdSide", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$Side;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;", "side", "selectedId", "isAutoClassification", "getScanInstructions", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;", "getCaptureScreenTitle", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getConfirmCaptureText", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "getTextForHint", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "getCaptureTips", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsViewModel;", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "getEnabledIdClasses", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;", "output", "setOutputForWorkflow", "(Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;)V", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class GovernmentIdWorkflowUtils {

    /* compiled from: GovernmentIdWorkflowUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PermissionsState2.values().length];
            try {
                iArr[PermissionsState2.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionsState2.SettingsLaunched.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionsState2.PermissionRejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IdConfig.Side.values().length];
            try {
                iArr2[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.Side.Back.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.Side.FrontOrBack.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.Side.BarcodePdf417.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.Side.PassportSignature.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void goBack(StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.goBack$lambda$0(videoCaptureHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit goBack$lambda$0(VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState backState = ((GovernmentIdState) action.getState()).getBackState();
        if (videoCaptureHelper != null) {
            videoCaptureHelper.closeWebRtcConnection();
        }
        if (backState == null) {
            if (((GovernmentIdWorkflow.Input) action.getProps()).getBackStepEnabled()) {
                action.setOutput(GovernmentIdWorkflow.Output.Back.INSTANCE);
            } else {
                action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
            }
        } else {
            backState.setDidGoBack$government_id_release(true);
            action.setState(backState);
        }
        return Unit.INSTANCE;
    }

    public static final void cancel(StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.cancel$lambda$1((WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancel$lambda$1(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final ModalContainerScreen<Object, Object> withRequestCameraPermissionsIfNeeded(Object obj, Context context, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, GovernmentIdWorkflow.Input renderProps, boolean z, PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        PermissionsState permissionsState = PermissionsState.Camera;
        String cameraPermissionsTitle = renderProps.getStrings().getCameraPermissionsTitle();
        if (cameraPermissionsTitle == null) {
            cameraPermissionsTitle = "";
        }
        String str = cameraPermissionsTitle;
        String cameraPermissionsPrompt = renderProps.getStrings().getCameraPermissionsPrompt();
        if (cameraPermissionsPrompt == null) {
            cameraPermissionsPrompt = context.getString(R$string.pi2_governmentid_camera_permission_rationale);
            Intrinsics.checkNotNullExpressionValue(cameraPermissionsPrompt, "getString(...)");
        }
        String str2 = cameraPermissionsPrompt;
        String string2 = context.getString(R$string.pi2_governmentid_camera_permission_denied_rationale, ContextUtils3.getApplicationName(context));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return PermissionsUtils.withRequestPermissionsIfNeeded(obj, renderContext, z, permissionsState, (19976 & 8) != 0 ? false : false, str, str2, string2, renderProps.getStrings().getCameraPermissionsAllowButtonText(), renderProps.getStrings().getCameraPermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GovernmentIdWorkflowUtils.withRequestCameraPermissionsIfNeeded$lambda$4(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction withRequestCameraPermissionsIfNeeded$lambda$4(final StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.withRequestCameraPermissionsIfNeeded$lambda$4$lambda$3(it, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withRequestCameraPermissionsIfNeeded$lambda$4$lambda$3(PermissionRequestWorkflow.Output output, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1 || i == 2) {
            renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflowUtils.withRequestCameraPermissionsIfNeeded$lambda$4$lambda$3$lambda$2((WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            goBack(renderContext, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withRequestCameraPermissionsIfNeeded$lambda$4$lambda$3$lambda$2(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Parcelable parcelable = (GovernmentIdState) action.getState();
        if (parcelable instanceof GovernmentIdState4) {
            action.setState(((GovernmentIdState4) parcelable).updateCheckCameraPermissions(false));
        }
        return Unit.INSTANCE;
    }

    public static final ModalContainerScreen<Object, Object> withRequestAudioPermissionsIfNeeded(Object obj, Context context, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, GovernmentIdWorkflow.Input renderProps, boolean z, PermissionRequestWorkflow permissionRequestWorkflow) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(permissionRequestWorkflow, "permissionRequestWorkflow");
        PermissionsState permissionsState = PermissionsState.RecordAudio;
        String microphonePermissionsTitle = renderProps.getStrings().getMicrophonePermissionsTitle();
        if (microphonePermissionsTitle == null) {
            microphonePermissionsTitle = "";
        }
        String str = microphonePermissionsTitle;
        String microphonePermissionsPrompt = renderProps.getStrings().getMicrophonePermissionsPrompt();
        if (microphonePermissionsPrompt == null) {
            microphonePermissionsPrompt = context.getString(R$string.pi2_selfie_mic_permission_rationale);
            Intrinsics.checkNotNullExpressionValue(microphonePermissionsPrompt, "getString(...)");
        }
        String str2 = microphonePermissionsPrompt;
        String string2 = context.getString(R$string.pi2_selfie_mic_permission_denied_rationale, ContextUtils3.getApplicationName(context));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return PermissionsUtils.withRequestPermissionsIfNeeded(obj, renderContext, z, permissionsState, (19976 & 8) != 0 ? false : false, str, str2, string2, renderProps.getStrings().getMicrophonePermissionsAllowButtonText(), renderProps.getStrings().getMicrophonePermissionsCancelButtonText(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : "video_capture_mic_permission_request", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GovernmentIdWorkflowUtils.withRequestAudioPermissionsIfNeeded$lambda$7(renderContext, (PermissionRequestWorkflow.Output) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction withRequestAudioPermissionsIfNeeded$lambda$7(final StatefulWorkflow.RenderContext renderContext, final PermissionRequestWorkflow.Output it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.withRequestAudioPermissionsIfNeeded$lambda$7$lambda$6(it, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withRequestAudioPermissionsIfNeeded$lambda$7$lambda$6(PermissionRequestWorkflow.Output output, StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        int i = WhenMappings.$EnumSwitchMapping$0[output.getPermissionState().getResult().ordinal()];
        if (i == 1 || i == 2) {
            renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflowUtils.withRequestAudioPermissionsIfNeeded$lambda$7$lambda$6$lambda$5((WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            goBack(renderContext, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit withRequestAudioPermissionsIfNeeded$lambda$7$lambda$6$lambda$5(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Parcelable parcelable = (GovernmentIdState) action.getState();
        if (parcelable instanceof GovernmentIdState2) {
            action.setState(((GovernmentIdState2) parcelable).updateCheckAudioPermissions(false));
        }
        return Unit.INSTANCE;
    }

    public static final Function1<Throwable, Unit> getCameraErrorHandler(final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext) {
        Intrinsics.checkNotNullParameter(renderContext, "<this>");
        return new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14(renderContext, (Throwable) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14(StatefulWorkflow.RenderContext renderContext, final Throwable cameraError) {
        Intrinsics.checkNotNullParameter(cameraError, "cameraError");
        if (!(cameraError instanceof CameraController3)) {
            renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14$lambda$8(cameraError, (WorkflowAction.Updater) obj);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }
        CameraController3 cameraController3 = (CameraController3) cameraError;
        if (!(cameraController3 instanceof CameraController5)) {
            if (cameraController3 instanceof CameraController6) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14$lambda$9((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else if (cameraController3 instanceof CameraController8) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14$lambda$10((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else if (cameraController3 instanceof CameraController9) {
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14$lambda$12((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            } else {
                if (!(cameraController3 instanceof CameraController7)) {
                    throw new NoWhenBranchMatchedException();
                }
                renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GovernmentIdWorkflowUtils.getCameraErrorHandler$lambda$14$lambda$13((WorkflowAction.Updater) obj);
                    }
                }, 1, null));
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14$lambda$8(Throwable th, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unexpected camera error with type " + th.getClass().getCanonicalName())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14$lambda$9(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unable to find a camera that satisfies the requirements for the selfie flow.")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14$lambda$10(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        ((GovernmentIdState) action.getState()).deleteAllIds();
        action.setState(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, ((GovernmentIdState) action.getState()).getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14$lambda$12(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(new GovernmentIdWorkflow.Output.Error(new InternalErrorInfo.CameraErrorInfo("Unsupported device.")));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getCameraErrorHandler$lambda$14$lambda$13(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        ((GovernmentIdState) action.getState()).deleteAllIds();
        action.setState(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, ((GovernmentIdState) action.getState()).getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ GovernmentIdState createBackState$default(WorkflowAction.Updater updater, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return createBackState(updater, z);
    }

    public static final GovernmentIdState createBackState(WorkflowAction<?, GovernmentIdState, ?>.Updater updater, boolean z) {
        Intrinsics.checkNotNullParameter(updater, "<this>");
        if (z) {
            return updater.getState();
        }
        return updater.getState().getBackState();
    }

    public static final GovernmentIdScreen2.CameraScreen.ManualCapture getManualCaptureDefaultState(GovernmentIdWorkflow.Input renderProps, IdConfig.Side currentSide) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(currentSide, "currentSide");
        if (currentSide == IdConfig.Side.PassportSignature) {
            return GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled;
        }
        if (!Intrinsics.areEqual(renderProps.getCountryCode(), CountryCode.COUNTRY_CODE_US) && currentSide == IdConfig.Side.Back) {
            return GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled;
        }
        return GovernmentIdScreen2.CameraScreen.ManualCapture.Hidden;
    }

    public static final void moveToNextStep(final GovernmentIdState renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, final GovernmentIdWorkflow.Input renderProps, final GovernmentId governmentId, final IdConfig id, final VideoCaptureHelper videoCaptureHelper, final CameraProperties cameraProperties, final boolean z, final List<? extends IdConfig2> parts, final int i, final String str, final String str2) {
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        Intrinsics.checkNotNullParameter(parts, "parts");
        final VideoCaptureMethod videoCaptureMethod = videoCaptureHelper.videoCaptureMethod(renderProps);
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.moveToNextStep$lambda$17(renderState, governmentId, i, parts, renderProps, videoCaptureHelper, id, z, str2, videoCaptureMethod, cameraProperties, str, renderContext, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit moveToNextStep$lambda$17(GovernmentIdState governmentIdState, GovernmentId governmentId, int i, List list, GovernmentIdWorkflow.Input input, final VideoCaptureHelper videoCaptureHelper, IdConfig idConfig, boolean z, String str, VideoCaptureMethod videoCaptureMethod, CameraProperties cameraProperties, String str2, final StatefulWorkflow.RenderContext renderContext, WorkflowAction.Updater action) {
        List<GovernmentId> uploadingIds$government_id_release;
        Parcelable submit;
        Parcelable waitForAutocapture;
        WebRtcState webRtcState;
        Intrinsics.checkNotNullParameter(action, "$this$action");
        if (action.getState().getClass() != governmentIdState.getClass()) {
            return Unit.INSTANCE;
        }
        if (governmentId != null) {
            uploadingIds$government_id_release = CollectionsKt.plus((Collection<? extends GovernmentId>) ((GovernmentIdState) action.getState()).getUploadingIds$government_id_release(), governmentId);
        } else {
            uploadingIds$government_id_release = ((GovernmentIdState) action.getState()).getUploadingIds$government_id_release();
        }
        List<GovernmentId> list2 = uploadingIds$government_id_release;
        int i2 = i == list.size() ? i : i + 1;
        IdConfig2 idConfig2 = (IdConfig2) CollectionsKt.getOrNull(list, i2);
        if (idConfig2 instanceof IdConfig2.SideIdPart) {
            if (input.getHasMultipleCaptureOptions() && !videoCaptureHelper.isWebRtcConnected()) {
                waitForAutocapture = new GovernmentIdState.ChooseCaptureMethod((IdConfig2.SideIdPart) idConfig2, list2, list, i2, str, new CaptureConfig.IdCaptureConfig(idConfig), false, createBackState(action, z), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, null);
            } else {
                IdConfig2.SideIdPart sideIdPart = (IdConfig2.SideIdPart) idConfig2;
                CaptureConfig.IdCaptureConfig idCaptureConfig = new CaptureConfig.IdCaptureConfig(idConfig);
                GovernmentIdScreen2.CameraScreen.ManualCapture manualCaptureDefaultState = getManualCaptureDefaultState((GovernmentIdWorkflow.Input) action.getProps(), sideIdPart.getSide());
                GovernmentIdState governmentIdStateCreateBackState = createBackState(action, z);
                String webRtcJwt = input.getVideoCaptureConfig().getWebRtcJwt();
                if (videoCaptureHelper.isWebRtcConnected()) {
                    webRtcState = WebRtcState.Connected;
                } else {
                    webRtcState = WebRtcState.Disconnected;
                }
                waitForAutocapture = new GovernmentIdState.WaitForAutocapture(sideIdPart, list2, idCaptureConfig, manualCaptureDefaultState, list, i2, governmentIdStateCreateBackState, webRtcState, webRtcJwt, null, false, false, str, null, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdWorkflowUtils.moveToNextStep$lambda$17$lambda$16(renderContext, videoCaptureHelper);
                    }
                }, 11776, null);
            }
        } else {
            if (idConfig2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (videoCaptureMethod == VideoCaptureMethod.Stream && !(action.getState() instanceof GovernmentIdState.FinalizeWebRtc) && !(action.getState() instanceof GovernmentIdState.ReviewSelectedImage)) {
                submit = new GovernmentIdState.FinalizeWebRtc((IdConfig2) CollectionsKt.last(list), list2, list, i2, createBackState(action, z), str, idConfig, cameraProperties);
            } else if (videoCaptureMethod == VideoCaptureMethod.Upload && !(action.getState() instanceof GovernmentIdState.FinalizeLocalVideoCapture) && !(action.getState() instanceof GovernmentIdState.ReviewSelectedImage)) {
                submit = new GovernmentIdState.FinalizeLocalVideoCapture(idConfig, list2, (IdConfig2) CollectionsKt.last(list), list, i2, createBackState(action, z), str, new GovernmentIdRequestArguments(list2, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), 0L, false, 768, null);
            } else {
                submit = new GovernmentIdState.Submit(idConfig, list2, null, list, i2, createBackState(action, z), str, new GovernmentIdRequestArguments(list2, input.getFieldKeyDocument(), input.getFieldKeyIdClass()), str2, cameraProperties, 4, null);
            }
            waitForAutocapture = submit;
        }
        action.setState(waitForAutocapture);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit moveToNextStep$lambda$17$lambda$16(StatefulWorkflow.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.moveToNextStep$lambda$17$lambda$16$lambda$15(videoCaptureHelper, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit moveToNextStep$lambda$17$lambda$16$lambda$15(VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
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

    public static final void handlePermissionChanged(Context context, StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, GovernmentIdWorkflow.Input renderProps, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(renderContext, "renderContext");
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        List listMutableListOf = CollectionsKt.mutableListOf(PermissionsState.Camera);
        if (z && ContextUtils3.isMicPresent(context)) {
            listMutableListOf.add(PermissionsState.RecordAudio);
        }
        final List<PermissionsState> missingPermissions = PermissionsUtils.getMissingPermissions(context, listMutableListOf);
        if (missingPermissions.isEmpty()) {
            return;
        }
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.handlePermissionChanged$lambda$18(missingPermissions, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handlePermissionChanged$lambda$18(List list, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdState governmentIdState = (GovernmentIdState) action.getState();
        if (governmentIdState instanceof GovernmentIdState.WaitForAutocapture) {
            action.setState(GovernmentIdState.WaitForAutocapture.copy$default((GovernmentIdState.WaitForAutocapture) governmentIdState, null, null, null, null, null, 0, null, null, null, null, list.contains(PermissionsState.Camera), list.contains(PermissionsState.RecordAudio), null, null, null, 29695, null));
        } else {
            ((GovernmentIdState) action.getState()).deleteAllIds();
            action.setState(new GovernmentIdState.ShowInstructions(null, null, null, null, 0, governmentIdState.getCountryCode(), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null));
        }
        return Unit.INSTANCE;
    }

    public static final GovernmentId.Side toGovIdSide(IdConfig.Side side) {
        Intrinsics.checkNotNullParameter(side, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i == 1) {
            return GovernmentId.Side.FRONT;
        }
        if (i == 2) {
            return GovernmentId.Side.BACK;
        }
        if (i == 3) {
            return GovernmentId.Side.FRONT;
        }
        if (i == 4) {
            return GovernmentId.Side.BACK;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return GovernmentId.Side.BACK;
    }

    public static final String getScanInstructions(GovernmentIdWorkflow.Input.Strings strings, IdConfig.Side side, String selectedId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        if (z && strings.getAutoClassificationCaptureTipText() != null) {
            return strings.getAutoClassificationCaptureTipText();
        }
        String text = strings.getScanInstructions().getText(str, selectedId, side);
        return text == null ? "" : text;
    }

    public static final String getCaptureScreenTitle(GovernmentIdWorkflow.Input.Strings strings, IdConfig.Side side, String selectedId, String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String text = strings.getCaptureScreenTitle().getText(str, selectedId, side);
        return text == null ? "" : text;
    }

    public static final String getConfirmCaptureText(GovernmentIdWorkflow.Input.Strings strings, IdConfig.Side side, String selectedId, String str) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(selectedId, "selectedId");
        String text = strings.getConfirmCapture().getText(str, selectedId, side);
        return text == null ? "" : text;
    }

    public static final String getTextForHint(GovernmentIdWorkflow.Input.Strings strings, Hint hint) {
        Intrinsics.checkNotNullParameter(strings, "<this>");
        if (Intrinsics.areEqual(hint, Hint2.INSTANCE)) {
            return strings.getHintHoldStill();
        }
        if (Intrinsics.areEqual(hint, Hint3.INSTANCE)) {
            return strings.getHintLowLight();
        }
        if (hint == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CaptureTipsViewModel getCaptureTips(GovernmentIdWorkflow.Input input, IdConfig.Side side) {
        String idFrontHelpModalTitle;
        String idFrontHelpModalPrompt;
        String idFrontHelpModalHints;
        String idFrontHelpModalContinueButtonText;
        String idBackHelpModalTitle;
        String idBackHelpModalPrompt;
        String idBackHelpModalHints;
        String idBackHelpModalContinueButtonText;
        String barcodeHelpModalTitle;
        String barcodeHelpModalPrompt;
        String barcodeHelpModalHints;
        String barcodeHelpModalContinueButtonText;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        int i = WhenMappings.$EnumSwitchMapping$1[side.ordinal()];
        if (i == 1) {
            String helpButtonText = input.getStrings().getHelpButtonText();
            if (helpButtonText == null || (idFrontHelpModalTitle = input.getStrings().getIdFrontHelpModalTitle()) == null || (idFrontHelpModalPrompt = input.getStrings().getIdFrontHelpModalPrompt()) == null || (idFrontHelpModalHints = input.getStrings().getIdFrontHelpModalHints()) == null || (idFrontHelpModalContinueButtonText = input.getStrings().getIdFrontHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new CaptureTipsViewModel(helpButtonText, idFrontHelpModalTitle, idFrontHelpModalPrompt, idFrontHelpModalHints, idFrontHelpModalContinueButtonText, side);
        }
        if (i == 2) {
            String helpButtonText2 = input.getStrings().getHelpButtonText();
            if (helpButtonText2 == null || (idBackHelpModalTitle = input.getStrings().getIdBackHelpModalTitle()) == null || (idBackHelpModalPrompt = input.getStrings().getIdBackHelpModalPrompt()) == null || (idBackHelpModalHints = input.getStrings().getIdBackHelpModalHints()) == null || (idBackHelpModalContinueButtonText = input.getStrings().getIdBackHelpModalContinueButtonText()) == null) {
                return null;
            }
            return new CaptureTipsViewModel(helpButtonText2, idBackHelpModalTitle, idBackHelpModalPrompt, idBackHelpModalHints, idBackHelpModalContinueButtonText, side);
        }
        if (i == 3) {
            return null;
        }
        if (i != 4) {
            if (i == 5) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String helpButtonText3 = input.getStrings().getHelpButtonText();
        if (helpButtonText3 == null || (barcodeHelpModalTitle = input.getStrings().getBarcodeHelpModalTitle()) == null || (barcodeHelpModalPrompt = input.getStrings().getBarcodeHelpModalPrompt()) == null || (barcodeHelpModalHints = input.getStrings().getBarcodeHelpModalHints()) == null || (barcodeHelpModalContinueButtonText = input.getStrings().getBarcodeHelpModalContinueButtonText()) == null) {
            return null;
        }
        return new CaptureTipsViewModel(helpButtonText3, barcodeHelpModalTitle, barcodeHelpModalPrompt, barcodeHelpModalHints, barcodeHelpModalContinueButtonText, side);
    }

    public static final List<EnabledIdClass> getEnabledIdClasses(GovernmentIdWorkflow.Input input) {
        Intrinsics.checkNotNullParameter(input, "<this>");
        List<IdConfig> enabledIdClasses = input.getEnabledIdClasses();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(enabledIdClasses, 10));
        for (IdConfig idConfig : enabledIdClasses) {
            IdIcon icon = idConfig.getIcon();
            String idClassKey = input.getStrings().getIdClassToName().get(idConfig.getIdClassKey());
            if (idClassKey == null) {
                idClassKey = idConfig.getIdClassKey();
            }
            arrayList.add(new EnabledIdClass(icon, idConfig, idClassKey));
        }
        return arrayList;
    }

    public static final void setOutputForWorkflow(StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final GovernmentIdWorkflow.Output output, VideoCaptureHelper videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        if ((output instanceof GovernmentIdWorkflow.Output.Finished) || (output instanceof GovernmentIdWorkflow.Output.Back) || (output instanceof GovernmentIdWorkflow.Output.Error)) {
            videoCaptureHelper.closeWebRtcConnection();
        }
        context.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdWorkflowUtils.setOutputForWorkflow$lambda$20(output, (WorkflowAction.Updater) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOutputForWorkflow$lambda$20(GovernmentIdWorkflow.Output output, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(output);
        return Unit.INSTANCE;
    }
}

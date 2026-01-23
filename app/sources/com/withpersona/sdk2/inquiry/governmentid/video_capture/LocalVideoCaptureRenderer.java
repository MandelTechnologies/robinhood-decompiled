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
import com.withpersona.sdk2.inquiry.governmentid.Frame;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentId;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtils;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig2;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer;
import com.withpersona.sdk2.inquiry.permissions.PermissionsUtils;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LocalVideoCaptureRenderer.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJF\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102&\u0010\u0011\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0013j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/LocalVideoCaptureRenderer;", "", "applicationContext", "Landroid/content/Context;", "cameraXControllerFactory", "Lcom/withpersona/sdk2/camera/CameraXController$Factory;", "camera2ManagerFactoryFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;", "navigationStateManager", "Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/CameraXController$Factory;Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory$Factory;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationStateManager;)V", "renderFinalizeVideoCapture", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
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

    /* compiled from: LocalVideoCaptureRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1", m3645f = "LocalVideoCaptureRenderer.kt", m3646l = {44}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1 */
    static final class C436041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ StatefulWorkflow<GovernmentIdWorkflow.Input, GovernmentIdState, GovernmentIdWorkflow.Output, Object>.RenderContext $context;
        final /* synthetic */ GovernmentIdState.FinalizeLocalVideoCapture $renderState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C436041(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext renderContext, Continuation<? super C436041> continuation) {
            super(2, continuation);
            this.$renderState = finalizeLocalVideoCapture;
            this.$context = renderContext;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C436041(this.$renderState, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C436041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long minDurationMs = this.$renderState.getMinDurationMs();
                this.label = 1;
                if (DelayKt.delay(minDurationMs, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$context.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LocalVideoCaptureRenderer.C436041.invokeSuspend$lambda$0((WorkflowAction.Updater) obj2);
                }
            }, 1, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(WorkflowAction.Updater updater) {
            Object state = updater.getState();
            GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture = state instanceof GovernmentIdState.FinalizeLocalVideoCapture ? (GovernmentIdState.FinalizeLocalVideoCapture) state : null;
            if (finalizeLocalVideoCapture == null) {
                return Unit.INSTANCE;
            }
            updater.setState(GovernmentIdState.FinalizeLocalVideoCapture.copy$default(finalizeLocalVideoCapture, null, null, null, null, 0, null, null, null, 0L, true, 511, null));
            return Unit.INSTANCE;
        }
    }

    public final Object renderFinalizeVideoCapture(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.FinalizeLocalVideoCapture renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper) {
        IdConfig.Side side;
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        context.runningSideEffect("finalize_delay", new C436041(renderState, context, null));
        IdConfig2 currentPart = renderState.getCurrentPart();
        IdConfig2.SideIdPart sideIdPart = currentPart instanceof IdConfig2.SideIdPart ? (IdConfig2.SideIdPart) currentPart : null;
        if (sideIdPart == null || (side = sideIdPart.getSide()) == null) {
            side = IdConfig.Side.Front;
        }
        IdConfig.Side side2 = side;
        IdConfig.IdSideConfig sideConfig = renderState.getId().getSideConfig(side2);
        String captureScreenTitle = GovernmentIdWorkflowUtils.getCaptureScreenTitle(renderProps.getStrings(), side2, renderState.getId().getIdClassKey(), renderState.getCountryCode());
        String capturing = renderProps.getStrings().getCapturing();
        GovernmentIdScreen2.CameraScreen.ManualCapture manualCapture = GovernmentIdScreen2.CameraScreen.ManualCapture.Disabled;
        IdClass type2 = renderState.getId().getType();
        return new AlertContainerScreen(PermissionsUtils.toModalContainerScreen(GovernmentIdScreen.newCameraScreen$default(renderProps, captureScreenTitle, capturing, manualCapture, sideConfig.getOverlay(), type2, side2, this.navigationStateManager.getNavigationState(), new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$0((List) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$2(context);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$3(context);
            }
        }, false, CollectionsKt.emptyList(), renderState, renderState.getPartIndex(), this.cameraXControllerFactory, this.camera2ManagerFactoryFactory, null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$4((Throwable) obj);
            }
        }, GovernmentIdWorkflowUtils.getCameraErrorHandler(context), VideoCaptureMethod.Upload, false, true, renderState.getIsDelayComplete(), new Function2() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$6(renderState, context, renderProps, videoCaptureHelper, (File) obj, (CameraProperties) obj2);
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        }, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$8(this.f$0, context, renderProps);
            }
        }, 0, null, null, null, 805437440, null)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$0(List list, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(cameraProperties, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$4(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$2(StatefulWorkflow.RenderContext renderContext) {
        renderContext.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocalVideoCaptureRenderer.renderFinalizeVideoCapture$lambda$2$lambda$1((WorkflowAction.Updater) obj);
            }
        }, 1, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$2$lambda$1(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        action.setOutput(GovernmentIdWorkflow.Output.Canceled.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$3(StatefulWorkflow.RenderContext renderContext) {
        GovernmentIdWorkflowUtils.goBack(renderContext, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$8(LocalVideoCaptureRenderer localVideoCaptureRenderer, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input) {
        GovernmentIdWorkflowUtils.handlePermissionChanged(localVideoCaptureRenderer.applicationContext, renderContext, input, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderFinalizeVideoCapture$lambda$6(GovernmentIdState.FinalizeLocalVideoCapture finalizeLocalVideoCapture, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, VideoCaptureHelper videoCaptureHelper, File file, CameraProperties cameraProperties) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
        List<GovernmentId> uploadingIds$government_id_release = finalizeLocalVideoCapture.getUploadingIds$government_id_release();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(uploadingIds$government_id_release, 10));
        Iterator<T> it = uploadingIds$government_id_release.iterator();
        while (it.hasNext()) {
            arrayList.add(((GovernmentId) it.next()).getSide());
        }
        GovernmentId.Side side = GovernmentId.Side.FRONT;
        boolean zContains = arrayList.contains(side);
        GovernmentId.Side side2 = GovernmentId.Side.BACK;
        boolean zContains2 = arrayList.contains(side2);
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        List listListOf = CollectionsKt.listOf(new Frame(absolutePath, "video/*"));
        if (zContains && zContains2) {
            side = GovernmentId.Side.FRONT_AND_BACK;
        } else if (!zContains && zContains2) {
            side = side2;
        }
        GovernmentIdWorkflowUtils.moveToNextStep(finalizeLocalVideoCapture, renderContext, input, new GovernmentId.GovernmentIdVideo(listListOf, side, finalizeLocalVideoCapture.getId().getIdClassKey(), GovernmentId.CaptureMethod.MANUAL), finalizeLocalVideoCapture.getId(), videoCaptureHelper, cameraProperties, (3584 & 128) != 0, (3584 & 256) != 0 ? finalizeLocalVideoCapture.getParts$government_id_release() : null, (3584 & 512) != 0 ? finalizeLocalVideoCapture.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? finalizeLocalVideoCapture.getCountryCode() : null);
        return Unit.INSTANCE;
    }
}

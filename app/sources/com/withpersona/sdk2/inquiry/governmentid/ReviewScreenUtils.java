package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.WorkflowAction4;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureHelper;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReviewScreenUtils.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\"0\u0007R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e\u001aN\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052&\u0010\u0006\u001a\"0\u0007R\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, m3636d2 = {"onAcceptImageClick", "", "renderProps", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "renderState", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "context", "Lcom/squareup/workflow1/StatefulWorkflow$RenderContext;", "Lcom/squareup/workflow1/StatefulWorkflow;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Output;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;", "videoCaptureHelper", "Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureHelper;", "runAutoClassificationWorker", "autoClassifyWorkerFactory", "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$Factory;", "government-id_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class ReviewScreenUtils {
    public static final void onAcceptImageClick(GovernmentIdWorkflow.Input renderProps, GovernmentIdState.ReviewImageState renderState, StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, VideoCaptureHelper videoCaptureHelper) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        CaptureConfig captureConfig = renderState.getCaptureConfig();
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            context.getActionSink().send(WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReviewScreenUtils.onAcceptImageClick$lambda$0((WorkflowAction.Updater) obj);
                }
            }, 1, null));
        } else {
            if (!(captureConfig instanceof CaptureConfig.IdCaptureConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            GovernmentIdWorkflowUtils.moveToNextStep(renderState, context, renderProps, renderState.getIdForReview(), ((CaptureConfig.IdCaptureConfig) captureConfig).getId(), videoCaptureHelper, renderState.getCameraProperties(), (3584 & 128) != 0, (3584 & 256) != 0 ? renderState.getParts$government_id_release() : null, (3584 & 512) != 0 ? renderState.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? renderState.getCountryCode() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAcceptImageClick$lambda$0(WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ReviewImageState reviewImageState = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
        if (reviewImageState == null) {
            return Unit.INSTANCE;
        }
        action.setState(reviewImageState.updateSubmittingForAutoClassification(true));
        return Unit.INSTANCE;
    }

    public static final void runAutoClassificationWorker(final GovernmentIdWorkflow.Input renderProps, final GovernmentIdState.ReviewImageState renderState, final StatefulWorkflow<? super GovernmentIdWorkflow.Input, GovernmentIdState, ? extends GovernmentIdWorkflow.Output, ? extends Object>.RenderContext context, final VideoCaptureHelper videoCaptureHelper, AutoClassifyWorker.Factory autoClassifyWorkerFactory) {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoCaptureHelper, "videoCaptureHelper");
        Intrinsics.checkNotNullParameter(autoClassifyWorkerFactory, "autoClassifyWorkerFactory");
        Workflows.runningWorker(context, autoClassifyWorkerFactory.create(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), renderState.getIdForReview(), new AutoClassifyWorker.SupplementaryData(), renderProps.getManualCaptureButtonDelayMs(), renderProps.getAutoClassificationConfig().getExtractTextFromImage()), Reflection.typeOf(AutoClassifyWorker.class), "", new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReviewScreenUtils.runAutoClassificationWorker$lambda$5(context, videoCaptureHelper, renderProps, renderState, (AutoClassifyWorker.Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WorkflowAction runAutoClassificationWorker$lambda$5(final StatefulWorkflow.RenderContext renderContext, final VideoCaptureHelper videoCaptureHelper, final GovernmentIdWorkflow.Input input, final GovernmentIdState.ReviewImageState reviewImageState, final AutoClassifyWorker.Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AutoClassifyWorker.Response.Error) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReviewScreenUtils.runAutoClassificationWorker$lambda$5$lambda$1(renderContext, it, videoCaptureHelper, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (!(it instanceof AutoClassifyWorker.Response.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        final AutoClassifyWorker.AutoClassificationResult autoClassificationResult = ((AutoClassifyWorker.Response.Success) it).getAutoClassificationResult();
        if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReviewScreenUtils.runAutoClassificationWorker$lambda$5$lambda$2(renderContext, input, reviewImageState, autoClassificationResult, videoCaptureHelper, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReviewScreenUtils.runAutoClassificationWorker$lambda$5$lambda$3(reviewImageState, autoClassificationResult, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        if (autoClassificationResult instanceof AutoClassifyWorker.AutoClassificationResult.UnableToClassify) {
            return WorkflowAction4.action$default(null, new Function1() { // from class: com.withpersona.sdk2.inquiry.governmentid.ReviewScreenUtilsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReviewScreenUtils.runAutoClassificationWorker$lambda$5$lambda$4(reviewImageState, autoClassificationResult, (WorkflowAction.Updater) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runAutoClassificationWorker$lambda$5$lambda$1(StatefulWorkflow.RenderContext renderContext, AutoClassifyWorker.Response response, VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        GovernmentIdWorkflowUtils.setOutputForWorkflow(renderContext, new GovernmentIdWorkflow.Output.Error(((AutoClassifyWorker.Response.Error) response).getCause()), videoCaptureHelper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runAutoClassificationWorker$lambda$5$lambda$2(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow.Input input, GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.AutoClassificationResult autoClassificationResult, VideoCaptureHelper videoCaptureHelper, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ReviewImageState reviewImageState2 = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
        if (reviewImageState2 == null) {
            return Unit.INSTANCE;
        }
        action.setState(reviewImageState2.updateSubmittingForAutoClassification(false));
        AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess idClassifySuccess = (AutoClassifyWorker.AutoClassificationResult.IdClassifySuccess) autoClassificationResult;
        GovernmentIdWorkflowUtils.moveToNextStep(reviewImageState2, renderContext, input, reviewImageState.getIdForReview(), idClassifySuccess.getIdConfig(), videoCaptureHelper, new CameraProperties(null, null, null, 0, 15, null), (3584 & 128) != 0, (3584 & 256) != 0 ? reviewImageState2.getParts$government_id_release() : idClassifySuccess.getIdConfig().getParts(), (3584 & 512) != 0 ? reviewImageState2.getPartIndex() : 0, (3584 & 1024) != 0 ? null : null, (3584 & 2048) != 0 ? reviewImageState2.getCountryCode() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runAutoClassificationWorker$lambda$5$lambda$3(GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.AutoClassificationResult autoClassificationResult, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ReviewImageState reviewImageState2 = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
        if (reviewImageState2 == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdState.ReviewImageState reviewImageState3 = reviewImageState2;
        action.setState(new GovernmentIdState.AutoClassificationError(reviewImageState3.getCurrentPart(), reviewImageState3.getUploadingIds$government_id_release(), reviewImageState3.getParts$government_id_release(), reviewImageState3.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, false), reviewImageState3.getCountryCode(), reviewImageState.getIdForReview().getFrames(), new CameraProperties(null, null, null, 0, 15, null), ((AutoClassifyWorker.AutoClassificationResult.IdTypeRejected) autoClassificationResult).getIdClassesPerCountry(), null, null, GovernmentIdState3.IdTypeRejected, 1536, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runAutoClassificationWorker$lambda$5$lambda$4(GovernmentIdState.ReviewImageState reviewImageState, AutoClassifyWorker.AutoClassificationResult autoClassificationResult, WorkflowAction.Updater action) {
        Intrinsics.checkNotNullParameter(action, "$this$action");
        Object state = action.getState();
        GovernmentIdState.ReviewImageState reviewImageState2 = state instanceof GovernmentIdState.ReviewImageState ? (GovernmentIdState.ReviewImageState) state : null;
        if (reviewImageState2 == null) {
            return Unit.INSTANCE;
        }
        GovernmentIdState.ReviewImageState reviewImageState3 = reviewImageState2;
        action.setState(new GovernmentIdState.AutoClassificationError(reviewImageState3.getCurrentPart(), reviewImageState3.getUploadingIds$government_id_release(), reviewImageState3.getParts$government_id_release(), reviewImageState3.getPartIndex(), GovernmentIdWorkflowUtils.createBackState(action, false), reviewImageState3.getCountryCode(), reviewImageState.getIdForReview().getFrames(), new CameraProperties(null, null, null, 0, 15, null), ((AutoClassifyWorker.AutoClassificationResult.UnableToClassify) autoClassificationResult).getIdClassesPerCountry(), null, null, GovernmentIdState3.UnableToClassify, 1536, null));
        return Unit.INSTANCE;
    }
}

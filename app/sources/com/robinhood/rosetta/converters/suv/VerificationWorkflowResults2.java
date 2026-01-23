package com.robinhood.rosetta.converters.suv;

import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import com.robinhood.rosetta.eventlogging.SUVInfo;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VerificationWorkflowResults.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/StepUpVerificationContext$WorkflowStatus;", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "toSuvInfoProtobuf", "Lcom/robinhood/rosetta/eventlogging/SUVInfo$SUVStatus;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.suv.VerificationWorkflowResultsKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class VerificationWorkflowResults2 {

    /* compiled from: VerificationWorkflowResults.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.suv.VerificationWorkflowResultsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationWorkflowResult.values().length];
            try {
                iArr[VerificationWorkflowResult.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationWorkflowResult.USER_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationWorkflowResult.INTERNAL_PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationWorkflowResult.DENIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationWorkflowResult.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StepUpVerificationContext.WorkflowStatus toProtobuf(VerificationWorkflowResult verificationWorkflowResult) {
        Intrinsics.checkNotNullParameter(verificationWorkflowResult, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[verificationWorkflowResult.ordinal()];
        if (i == 1) {
            return StepUpVerificationContext.WorkflowStatus.APPROVED;
        }
        if (i == 2) {
            return StepUpVerificationContext.WorkflowStatus.USER_PENDING;
        }
        if (i == 3) {
            return StepUpVerificationContext.WorkflowStatus.INTERNAL_PENDING;
        }
        if (i == 4) {
            return StepUpVerificationContext.WorkflowStatus.DENIED;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StepUpVerificationContext.WorkflowStatus.CANCELLED;
    }

    public static final SUVInfo.SUVStatus toSuvInfoProtobuf(VerificationWorkflowResult verificationWorkflowResult) {
        Intrinsics.checkNotNullParameter(verificationWorkflowResult, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[verificationWorkflowResult.ordinal()];
        if (i == 1) {
            return SUVInfo.SUVStatus.APPROVED;
        }
        if (i == 2) {
            return SUVInfo.SUVStatus.USER_PENDING;
        }
        if (i == 3) {
            return SUVInfo.SUVStatus.INTERNAL_PENDING;
        }
        if (i == 4) {
            return SUVInfo.SUVStatus.DENIED;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return SUVInfo.SUVStatus.CANCELED;
    }
}

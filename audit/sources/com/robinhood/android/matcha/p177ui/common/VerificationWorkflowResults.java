package com.robinhood.android.matcha.p177ui.common;

import com.robinhood.android.models.stepupverification.VerificationWorkflowResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationWorkflowResults.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"shouldContinueTransferPostVerification", "", "Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;", "getShouldContinueTransferPostVerification", "(Lcom/robinhood/android/models/stepupverification/VerificationWorkflowResult;)Z", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.common.VerificationWorkflowResultsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class VerificationWorkflowResults {

    /* compiled from: VerificationWorkflowResults.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.matcha.ui.common.VerificationWorkflowResultsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationWorkflowResult.values().length];
            try {
                iArr[VerificationWorkflowResult.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationWorkflowResult.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationWorkflowResult.CANCELED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationWorkflowResult.USER_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VerificationWorkflowResult.INTERNAL_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean getShouldContinueTransferPostVerification(VerificationWorkflowResult verificationWorkflowResult) {
        int i = verificationWorkflowResult == null ? -1 : WhenMappings.$EnumSwitchMapping$0[verificationWorkflowResult.ordinal()];
        if (i == -1) {
            return false;
        }
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3 || i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}

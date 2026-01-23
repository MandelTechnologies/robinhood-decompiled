package com.robinhood.shared.crypto.transfer.enrollment.checklist;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EnrollmentChecklistV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2DataState;", "Lcom/robinhood/shared/crypto/transfer/enrollment/checklist/EnrollmentChecklistV2ViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class EnrollmentChecklistV2StateProvider implements StateProvider<EnrollmentChecklistV2DataState, EnrollmentChecklistV2ViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public EnrollmentChecklistV2ViewState reduce(EnrollmentChecklistV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new EnrollmentChecklistV2ViewState(dataState.getAppType(), new ChecklistItem(dataState.isVerifyYourIdentityEnabled(), dataState.getVerifyYourIdentityIcon(), dataState.getVerifyYourIdentityPrimaryText(), dataState.getVerifyYourIdentitySecondaryText()), new ChecklistItem(dataState.isTwoFactorEnabled(), dataState.getTwoFactorIcon(), dataState.getTwoFactorPrimaryText(), null), dataState.getKycSuvWorkflowId(), dataState.getKycSuvIsMigrated(), dataState.getKycDeeplink(), dataState.getKycRowLoggingIdentifier(), dataState.getTwoFactorRowLoggingIdentifier());
    }
}

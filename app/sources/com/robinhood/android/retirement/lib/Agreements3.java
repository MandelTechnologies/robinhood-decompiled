package com.robinhood.android.retirement.lib;

import com.robinhood.android.models.retirement.api.ApiRetirementOnboardingAgreement;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Agreements.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toAgreement", "Lcom/robinhood/android/models/retirement/api/ApiRetirementOnboardingAgreement;", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementAgreementViewModel;", "lib-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.lib.AgreementsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Agreements3 {
    public static final ApiRetirementOnboardingAgreement toAgreement(ApiRetirementSignUpFlow.RetirementAgreementViewModel retirementAgreementViewModel) {
        Intrinsics.checkNotNullParameter(retirementAgreementViewModel, "<this>");
        return new ApiRetirementOnboardingAgreement(retirementAgreementViewModel.getContentful_id(), retirementAgreementViewModel.getAgreement_context(), retirementAgreementViewModel.getAgreement_type(), retirementAgreementViewModel.getVersion());
    }
}

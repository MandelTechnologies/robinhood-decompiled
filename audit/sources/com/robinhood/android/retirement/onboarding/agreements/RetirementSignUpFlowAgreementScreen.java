package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSignedAgreements;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: RetirementSignUpFlowAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/agreements/RetirementAgreementInteractions;", "", "onAgreeClicked", "", "signedAgreements", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignUpFlowSignedAgreements;", "onSlipToggled", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "enabled", "", "onDeepestScrollIncremented", "scrollProgress", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementAgreementInteractions, reason: use source file name */
/* loaded from: classes5.dex */
public interface RetirementSignUpFlowAgreementScreen {
    void onAgreeClicked(RetirementSignUpFlowSignedAgreements signedAgreements);

    void onDeepestScrollIncremented(float scrollProgress);

    void onSlipToggled(BrokerageAccountType accountType, boolean enabled);
}

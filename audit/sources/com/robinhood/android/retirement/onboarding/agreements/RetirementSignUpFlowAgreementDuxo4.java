package com.robinhood.android.retirement.onboarding.agreements;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementSignUpFlowAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"makeInitialSlipCheckboxStates", "", "Lcom/robinhood/android/retirement/onboarding/agreements/SlipCheckboxState;", "slipAgreements", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpFlow$RetirementSlipAgreementsViewModel;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.agreements.RetirementSignUpFlowAgreementDuxoKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAgreementDuxo4 {
    public static final List<SlipCheckboxState> makeInitialSlipCheckboxStates(ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel retirementSlipAgreementsViewModel, BrokerageAccountType accountType) {
        List<SlipCheckboxState> listListOf;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        if (retirementSlipAgreementsViewModel != null) {
            List<ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel.SlipCheckbox> checkbox_items = retirementSlipAgreementsViewModel.getCheckbox_items();
            if (checkbox_items == null) {
                listListOf = CollectionsKt.listOf(new SlipCheckboxState(accountType, retirementSlipAgreementsViewModel.getTitle(), true));
            } else {
                List<ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel.SlipCheckbox> list = checkbox_items;
                listListOf = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ApiRetirementSignUpFlow.RetirementSlipAgreementsViewModel.SlipCheckbox slipCheckbox : list) {
                    listListOf.add(new SlipCheckboxState(slipCheckbox.getBrokerage_account_type(), slipCheckbox.getLabel(), slipCheckbox.is_checked()));
                }
            }
            if (listListOf != null) {
                return listListOf;
            }
        }
        return CollectionsKt.emptyList();
    }
}

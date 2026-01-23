package com.robinhood.android.beneficiaries.p067ui;

import com.robinhood.android.beneficiaries.p067ui.BeneficiaryParentViewState3;
import com.squareup.wire.Message;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: BeneficiaryDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"countSteps", "", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryDuxoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int countSteps(BeneficiaryParentViewState3.TrustFlow trustFlow) {
        return CollectionsKt.listOfNotNull((Object[]) new Message[]{trustFlow.getNameViewModel(), trustFlow.getDateViewModel(), trustFlow.getTaxIdentifierViewModel(), trustFlow.getEmailViewModel(), trustFlow.getAccountViewModel()}).size();
    }
}

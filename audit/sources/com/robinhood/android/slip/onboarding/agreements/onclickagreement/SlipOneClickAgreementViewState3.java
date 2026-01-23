package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import com.robinhood.models.p355ui.UiSlipAgreements;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipOneClickAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementDataState;", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "<init>", "()V", "reduce", "dataState", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementStateProvider, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipOneClickAgreementViewState3 implements StateProvider<SlipOneClickAgreementDataState, SlipOneClickAgreementViewState> {
    public static final int $stable = 0;
    public static final SlipOneClickAgreementViewState3 INSTANCE = new SlipOneClickAgreementViewState3();

    private SlipOneClickAgreementViewState3() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public SlipOneClickAgreementViewState reduce(SlipOneClickAgreementDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getException() != null) {
            return new SlipOneClickAgreementViewState.Error(dataState.getException());
        }
        if (dataState.getSlipAgreements() != null) {
            List<UiSlipAgreements.Agreement> agreements = dataState.getSlipAgreements().getAgreements();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(agreements, 10));
            for (UiSlipAgreements.Agreement agreement : agreements) {
                arrayList.add(new ApiPreviouslySignedAgreements.AgreementRow(agreement.getTitle(), agreement.getBodyMarkdown()));
            }
            return new SlipOneClickAgreementViewState.Success(arrayList, dataState.getSlipAgreements().getSummaryTitle(), dataState.getSlipAgreements().getSummaryItems());
        }
        return SlipOneClickAgreementViewState.Loading.INSTANCE;
    }
}

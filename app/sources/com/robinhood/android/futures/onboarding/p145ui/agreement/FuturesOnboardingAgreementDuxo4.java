package com.robinhood.android.futures.onboarding.p145ui.agreement;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.futures.onboarding.p145ui.agreement.FuturesOnboardingAgreementDuxo5;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementDataState;", "Lcom/robinhood/android/futures/onboarding/ui/agreement/FuturesOnboardingAgreementViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.FuturesOnboardingAgreementStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingAgreementDuxo4 implements StateProvider<FuturesOnboardingAgreementDataState, FuturesOnboardingAgreementDuxo5> {
    public static final int $stable = 0;
    public static final FuturesOnboardingAgreementDuxo4 INSTANCE = new FuturesOnboardingAgreementDuxo4();

    private FuturesOnboardingAgreementDuxo4() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesOnboardingAgreementDuxo5 reduce(FuturesOnboardingAgreementDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getSubmissionNetworkError() != null) {
            return new FuturesOnboardingAgreementDuxo5.SubmissionNetworkError(dataState.getSubmissionNetworkError());
        }
        if (dataState.m14674getAgreementResultxLWZpok() == null) {
            return FuturesOnboardingAgreementDuxo5.Loading.INSTANCE;
        }
        if (Result.m28556isSuccessimpl(dataState.m14674getAgreementResultxLWZpok().getValue())) {
            Object value = dataState.m14674getAgreementResultxLWZpok().getValue();
            ResultKt.throwOnFailure(value);
            return new FuturesOnboardingAgreementDuxo5.Success((UiAgreementWithContent) value, dataState.getSubmittingAgreement());
        }
        if (Result.m28555isFailureimpl(dataState.m14674getAgreementResultxLWZpok().getValue())) {
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(dataState.m14674getAgreementResultxLWZpok().getValue());
            Intrinsics.checkNotNull(thM28553exceptionOrNullimpl);
            return new FuturesOnboardingAgreementDuxo5.LoadingNetworkError(thM28553exceptionOrNullimpl);
        }
        throw new IllegalStateException(("Unknown state " + dataState).toString());
    }
}

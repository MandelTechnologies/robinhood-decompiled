package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.futures.onboarding.p145ui.arbitration.FuturesOnboardingArbitrationAgreementDuxo5;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingArbitrationAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationDataState;", "Lcom/robinhood/android/futures/onboarding/ui/arbitration/FuturesOnboardingArbitrationViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.FuturesOnboardingArbitrationStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingArbitrationAgreementDuxo4 implements StateProvider<FuturesOnboardingArbitrationDataState, FuturesOnboardingArbitrationAgreementDuxo5> {
    public static final int $stable = 0;
    public static final FuturesOnboardingArbitrationAgreementDuxo4 INSTANCE = new FuturesOnboardingArbitrationAgreementDuxo4();

    private FuturesOnboardingArbitrationAgreementDuxo4() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesOnboardingArbitrationAgreementDuxo5 reduce(FuturesOnboardingArbitrationDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getSubmissionNetworkError() != null) {
            return new FuturesOnboardingArbitrationAgreementDuxo5.SubmissionNetworkError(dataState.getSubmissionNetworkError());
        }
        if (dataState.m14697getAgreementResultxLWZpok() == null) {
            return FuturesOnboardingArbitrationAgreementDuxo5.Loading.INSTANCE;
        }
        if (Result.m28556isSuccessimpl(dataState.m14697getAgreementResultxLWZpok().getValue())) {
            Object value = dataState.m14697getAgreementResultxLWZpok().getValue();
            ResultKt.throwOnFailure(value);
            return new FuturesOnboardingArbitrationAgreementDuxo5.Success((UiAgreementWithContent) value, dataState.getSubmittingAgreement());
        }
        if (Result.m28555isFailureimpl(dataState.m14697getAgreementResultxLWZpok().getValue())) {
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(dataState.m14697getAgreementResultxLWZpok().getValue());
            Intrinsics.checkNotNull(thM28553exceptionOrNullimpl);
            return new FuturesOnboardingArbitrationAgreementDuxo5.LoadingNetworkError(thM28553exceptionOrNullimpl);
        }
        throw new IllegalStateException(("Unknown state " + dataState).toString());
    }
}

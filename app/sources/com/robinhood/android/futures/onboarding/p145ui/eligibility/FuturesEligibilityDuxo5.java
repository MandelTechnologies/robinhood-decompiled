package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDataState;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesEligibilityDuxo5 implements StateProvider<FuturesEligibilityDataState, FuturesEligibilityViewState> {
    public static final int $stable = 0;
    public static final FuturesEligibilityDuxo5 INSTANCE = new FuturesEligibilityDuxo5();

    private FuturesEligibilityDuxo5() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public FuturesEligibilityViewState reduce(FuturesEligibilityDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Result<CheckAccountFuturesEligibilityResponseDto> resultM14699getEligibilityResponsexLWZpok = dataState.m14699getEligibilityResponsexLWZpok();
        AccountFuturesEligibilityStatusDto status = null;
        if (resultM14699getEligibilityResponsexLWZpok != null) {
            Object value = resultM14699getEligibilityResponsexLWZpok.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) value;
            if (checkAccountFuturesEligibilityResponseDto != null) {
                status = checkAccountFuturesEligibilityResponseDto.getStatus();
            }
        }
        return new FuturesEligibilityViewState(status, dataState.getFuturesEligibleRhsAccountNumber());
    }
}

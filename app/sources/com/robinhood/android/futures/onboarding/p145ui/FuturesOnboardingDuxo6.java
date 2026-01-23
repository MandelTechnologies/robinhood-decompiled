package com.robinhood.android.futures.onboarding.p145ui;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import com.robinhood.models.p320db.Account;
import com.robinhood.store.futures.mib.MiBFuturesState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesOnboardingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingDataState;", "Lcom/robinhood/android/futures/onboarding/ui/FuturesOnboardingViewState;", "<init>", "()V", "reduce", "dataState", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.FuturesOnboardingStateProvider, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingDuxo6 implements StateProvider<FuturesOnboardingDataState, FuturesOnboardingViewState> {
    public static final int $stable = 0;
    public static final FuturesOnboardingDuxo6 INSTANCE = new FuturesOnboardingDuxo6();

    private FuturesOnboardingDuxo6() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FuturesOnboardingViewState reduce(FuturesOnboardingDataState dataState) {
        AccountFuturesEligibilityStatusDto status;
        Account futuresAllowedRhsAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        Result<CheckAccountFuturesEligibilityResponseDto> resultM14671getEligibilityResponsexLWZpok = dataState.m14671getEligibilityResponsexLWZpok();
        String accountNumber = null;
        if (resultM14671getEligibilityResponsexLWZpok != null) {
            Object value = resultM14671getEligibilityResponsexLWZpok.getValue();
            if (Result.m28555isFailureimpl(value)) {
                value = null;
            }
            CheckAccountFuturesEligibilityResponseDto checkAccountFuturesEligibilityResponseDto = (CheckAccountFuturesEligibilityResponseDto) value;
            status = checkAccountFuturesEligibilityResponseDto != null ? checkAccountFuturesEligibilityResponseDto.getStatus() : null;
        }
        MiBFuturesState miBFuturesState = dataState.getMiBFuturesState();
        if (miBFuturesState != null && (futuresAllowedRhsAccount = miBFuturesState.getFuturesAllowedRhsAccount()) != null) {
            accountNumber = futuresAllowedRhsAccount.getAccountNumber();
        }
        return new FuturesOnboardingViewState(accountNumber, dataState.getUserHasNoBrokerageAccount(), status, dataState.shouldShowArbitrationAgreement(), dataState.getLocale(), dataState.getPostOnboardingNavigation());
    }
}

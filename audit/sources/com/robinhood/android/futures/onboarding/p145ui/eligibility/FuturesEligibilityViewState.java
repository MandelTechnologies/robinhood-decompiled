package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityViewState;", "", "eligibilityStatus", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "futuresEligibleRhsAccountNumber", "", "<init>", "(Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;Ljava/lang/String;)V", "getEligibilityStatus", "()Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "getFuturesEligibleRhsAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesEligibilityViewState {
    public static final int $stable = 0;
    private final AccountFuturesEligibilityStatusDto eligibilityStatus;
    private final String futuresEligibleRhsAccountNumber;

    public static /* synthetic */ FuturesEligibilityViewState copy$default(FuturesEligibilityViewState futuresEligibilityViewState, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            accountFuturesEligibilityStatusDto = futuresEligibilityViewState.eligibilityStatus;
        }
        if ((i & 2) != 0) {
            str = futuresEligibilityViewState.futuresEligibleRhsAccountNumber;
        }
        return futuresEligibilityViewState.copy(accountFuturesEligibilityStatusDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountFuturesEligibilityStatusDto getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFuturesEligibleRhsAccountNumber() {
        return this.futuresEligibleRhsAccountNumber;
    }

    public final FuturesEligibilityViewState copy(AccountFuturesEligibilityStatusDto eligibilityStatus, String futuresEligibleRhsAccountNumber) {
        return new FuturesEligibilityViewState(eligibilityStatus, futuresEligibleRhsAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesEligibilityViewState)) {
            return false;
        }
        FuturesEligibilityViewState futuresEligibilityViewState = (FuturesEligibilityViewState) other;
        return this.eligibilityStatus == futuresEligibilityViewState.eligibilityStatus && Intrinsics.areEqual(this.futuresEligibleRhsAccountNumber, futuresEligibilityViewState.futuresEligibleRhsAccountNumber);
    }

    public int hashCode() {
        AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto = this.eligibilityStatus;
        int iHashCode = (accountFuturesEligibilityStatusDto == null ? 0 : accountFuturesEligibilityStatusDto.hashCode()) * 31;
        String str = this.futuresEligibleRhsAccountNumber;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FuturesEligibilityViewState(eligibilityStatus=" + this.eligibilityStatus + ", futuresEligibleRhsAccountNumber=" + this.futuresEligibleRhsAccountNumber + ")";
    }

    public FuturesEligibilityViewState(AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, String str) {
        this.eligibilityStatus = accountFuturesEligibilityStatusDto;
        this.futuresEligibleRhsAccountNumber = str;
    }

    public final AccountFuturesEligibilityStatusDto getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public final String getFuturesEligibleRhsAccountNumber() {
        return this.futuresEligibleRhsAccountNumber;
    }
}

package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import com.robinhood.ceres.p284v1.CheckAccountFuturesEligibilityResponseDto;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesEligibilityDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\b\u000eJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDataState;", "", "eligibilityResponse", "Lkotlin/Result;", "Lcom/robinhood/ceres/v1/CheckAccountFuturesEligibilityResponseDto;", "futuresEligibleRhsAccountNumber", "", "<init>", "(Lkotlin/Result;Ljava/lang/String;)V", "getEligibilityResponse-xLWZpok", "()Lkotlin/Result;", "getFuturesEligibleRhsAccountNumber", "()Ljava/lang/String;", "component1", "component1-xLWZpok", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesEligibilityDataState {
    public static final int $stable = 8;
    private final Result<CheckAccountFuturesEligibilityResponseDto> eligibilityResponse;
    private final String futuresEligibleRhsAccountNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesEligibilityDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesEligibilityDataState copy$default(FuturesEligibilityDataState futuresEligibilityDataState, Result result, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            result = futuresEligibilityDataState.eligibilityResponse;
        }
        if ((i & 2) != 0) {
            str = futuresEligibilityDataState.futuresEligibleRhsAccountNumber;
        }
        return futuresEligibilityDataState.copy(result, str);
    }

    /* renamed from: component1-xLWZpok, reason: not valid java name */
    public final Result<CheckAccountFuturesEligibilityResponseDto> m14698component1xLWZpok() {
        return this.eligibilityResponse;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFuturesEligibleRhsAccountNumber() {
        return this.futuresEligibleRhsAccountNumber;
    }

    public final FuturesEligibilityDataState copy(Result<CheckAccountFuturesEligibilityResponseDto> eligibilityResponse, String futuresEligibleRhsAccountNumber) {
        return new FuturesEligibilityDataState(eligibilityResponse, futuresEligibleRhsAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesEligibilityDataState)) {
            return false;
        }
        FuturesEligibilityDataState futuresEligibilityDataState = (FuturesEligibilityDataState) other;
        return Intrinsics.areEqual(this.eligibilityResponse, futuresEligibilityDataState.eligibilityResponse) && Intrinsics.areEqual(this.futuresEligibleRhsAccountNumber, futuresEligibilityDataState.futuresEligibleRhsAccountNumber);
    }

    public int hashCode() {
        Result<CheckAccountFuturesEligibilityResponseDto> result = this.eligibilityResponse;
        int iM28554hashCodeimpl = (result == null ? 0 : Result.m28554hashCodeimpl(result.getValue())) * 31;
        String str = this.futuresEligibleRhsAccountNumber;
        return iM28554hashCodeimpl + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "FuturesEligibilityDataState(eligibilityResponse=" + this.eligibilityResponse + ", futuresEligibleRhsAccountNumber=" + this.futuresEligibleRhsAccountNumber + ")";
    }

    public FuturesEligibilityDataState(Result<CheckAccountFuturesEligibilityResponseDto> result, String str) {
        this.eligibilityResponse = result;
        this.futuresEligibleRhsAccountNumber = str;
    }

    public /* synthetic */ FuturesEligibilityDataState(Result result, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : result, (i & 2) != 0 ? null : str);
    }

    /* renamed from: getEligibilityResponse-xLWZpok, reason: not valid java name */
    public final Result<CheckAccountFuturesEligibilityResponseDto> m14699getEligibilityResponsexLWZpok() {
        return this.eligibilityResponse;
    }

    public final String getFuturesEligibleRhsAccountNumber() {
        return this.futuresEligibleRhsAccountNumber;
    }
}

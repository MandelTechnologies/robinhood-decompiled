package com.robinhood.android.retirement.onboarding.accountcomparison;

import com.robinhood.android.models.retirement.api.ApiRetirementAccountComparisonResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementAccountComparisonDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonDataState;", "", "comparison", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;)V", "getComparison", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementAccountComparisonDataState {
    public static final int $stable = 8;
    private final ApiRetirementAccountComparisonResponse comparison;

    /* JADX WARN: Multi-variable type inference failed */
    public RetirementAccountComparisonDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RetirementAccountComparisonDataState copy$default(RetirementAccountComparisonDataState retirementAccountComparisonDataState, ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirementAccountComparisonResponse = retirementAccountComparisonDataState.comparison;
        }
        return retirementAccountComparisonDataState.copy(apiRetirementAccountComparisonResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirementAccountComparisonResponse getComparison() {
        return this.comparison;
    }

    public final RetirementAccountComparisonDataState copy(ApiRetirementAccountComparisonResponse comparison) {
        return new RetirementAccountComparisonDataState(comparison);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RetirementAccountComparisonDataState) && Intrinsics.areEqual(this.comparison, ((RetirementAccountComparisonDataState) other).comparison);
    }

    public int hashCode() {
        ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse = this.comparison;
        if (apiRetirementAccountComparisonResponse == null) {
            return 0;
        }
        return apiRetirementAccountComparisonResponse.hashCode();
    }

    public String toString() {
        return "RetirementAccountComparisonDataState(comparison=" + this.comparison + ")";
    }

    public RetirementAccountComparisonDataState(ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse) {
        this.comparison = apiRetirementAccountComparisonResponse;
    }

    public /* synthetic */ RetirementAccountComparisonDataState(ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRetirementAccountComparisonResponse);
    }

    public final ApiRetirementAccountComparisonResponse getComparison() {
        return this.comparison;
    }
}

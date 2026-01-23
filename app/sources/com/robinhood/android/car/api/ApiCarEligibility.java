package com.robinhood.android.car.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiCarEligibility.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/car/api/ApiCarEligibility;", "", "accountNumber", "", "eligible", "", "<init>", "(Ljava/lang/String;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getEligible", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-car_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApiCarEligibility {
    public static final int $stable = 0;
    private final String accountNumber;
    private final boolean eligible;

    public static /* synthetic */ ApiCarEligibility copy$default(ApiCarEligibility apiCarEligibility, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiCarEligibility.accountNumber;
        }
        if ((i & 2) != 0) {
            z = apiCarEligibility.eligible;
        }
        return apiCarEligibility.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    public final ApiCarEligibility copy(@Json(name = "account_number") String accountNumber, boolean eligible) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new ApiCarEligibility(accountNumber, eligible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiCarEligibility)) {
            return false;
        }
        ApiCarEligibility apiCarEligibility = (ApiCarEligibility) other;
        return Intrinsics.areEqual(this.accountNumber, apiCarEligibility.accountNumber) && this.eligible == apiCarEligibility.eligible;
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + Boolean.hashCode(this.eligible);
    }

    public String toString() {
        return "ApiCarEligibility(accountNumber=" + this.accountNumber + ", eligible=" + this.eligible + ")";
    }

    public ApiCarEligibility(@Json(name = "account_number") String accountNumber, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        this.eligible = z;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final boolean getEligible() {
        return this.eligible;
    }
}

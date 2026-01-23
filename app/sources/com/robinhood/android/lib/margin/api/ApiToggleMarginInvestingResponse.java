package com.robinhood.android.lib.margin.api;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiToggleMarginInvestingResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResponse;", "", "accountNumber", "", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "getResult", "()Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "getErrorReason", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiToggleMarginInvestingResponse {
    private final String accountNumber;
    private final String errorReason;
    private final ApiToggleMarginInvestingResponse2 result;

    public static /* synthetic */ ApiToggleMarginInvestingResponse copy$default(ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse, String str, ApiToggleMarginInvestingResponse2 apiToggleMarginInvestingResponse2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiToggleMarginInvestingResponse.accountNumber;
        }
        if ((i & 2) != 0) {
            apiToggleMarginInvestingResponse2 = apiToggleMarginInvestingResponse.result;
        }
        if ((i & 4) != 0) {
            str2 = apiToggleMarginInvestingResponse.errorReason;
        }
        return apiToggleMarginInvestingResponse.copy(str, apiToggleMarginInvestingResponse2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiToggleMarginInvestingResponse2 getResult() {
        return this.result;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorReason() {
        return this.errorReason;
    }

    public final ApiToggleMarginInvestingResponse copy(@Json(name = "account_number") String accountNumber, @Json(name = "result") ApiToggleMarginInvestingResponse2 result, @Json(name = "error_reason") String errorReason) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(result, "result");
        return new ApiToggleMarginInvestingResponse(accountNumber, result, errorReason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiToggleMarginInvestingResponse)) {
            return false;
        }
        ApiToggleMarginInvestingResponse apiToggleMarginInvestingResponse = (ApiToggleMarginInvestingResponse) other;
        return Intrinsics.areEqual(this.accountNumber, apiToggleMarginInvestingResponse.accountNumber) && this.result == apiToggleMarginInvestingResponse.result && Intrinsics.areEqual(this.errorReason, apiToggleMarginInvestingResponse.errorReason);
    }

    public int hashCode() {
        int iHashCode = ((this.accountNumber.hashCode() * 31) + this.result.hashCode()) * 31;
        String str = this.errorReason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ApiToggleMarginInvestingResponse(accountNumber=" + this.accountNumber + ", result=" + this.result + ", errorReason=" + this.errorReason + ")";
    }

    public ApiToggleMarginInvestingResponse(@Json(name = "account_number") String accountNumber, @Json(name = "result") ApiToggleMarginInvestingResponse2 result, @Json(name = "error_reason") String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(result, "result");
        this.accountNumber = accountNumber;
        this.result = result;
        this.errorReason = str;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ApiToggleMarginInvestingResponse2 getResult() {
        return this.result;
    }

    public final String getErrorReason() {
        return this.errorReason;
    }
}

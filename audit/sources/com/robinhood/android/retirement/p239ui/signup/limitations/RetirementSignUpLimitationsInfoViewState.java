package com.robinhood.android.retirement.p239ui.signup.limitations;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpLimitationsInfoResponse;
import com.robinhood.compose.duxo.ComposeUiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpLimitationsInfoViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/limitations/RetirementSignUpLimitationsInfoViewState;", "", "limitationsInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpLimitationsInfoResponse;", "error", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpLimitationsInfoResponse;Lcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getLimitationsInfo", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpLimitationsInfoResponse;", "getError", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementSignUpLimitationsInfoViewState {
    public static final int $stable = 8;
    private final ComposeUiEvent<Throwable> error;
    private final ApiRetirementSignUpLimitationsInfoResponse limitationsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public RetirementSignUpLimitationsInfoViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementSignUpLimitationsInfoViewState copy$default(RetirementSignUpLimitationsInfoViewState retirementSignUpLimitationsInfoViewState, ApiRetirementSignUpLimitationsInfoResponse apiRetirementSignUpLimitationsInfoResponse, ComposeUiEvent composeUiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirementSignUpLimitationsInfoResponse = retirementSignUpLimitationsInfoViewState.limitationsInfo;
        }
        if ((i & 2) != 0) {
            composeUiEvent = retirementSignUpLimitationsInfoViewState.error;
        }
        return retirementSignUpLimitationsInfoViewState.copy(apiRetirementSignUpLimitationsInfoResponse, composeUiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirementSignUpLimitationsInfoResponse getLimitationsInfo() {
        return this.limitationsInfo;
    }

    public final ComposeUiEvent<Throwable> component2() {
        return this.error;
    }

    public final RetirementSignUpLimitationsInfoViewState copy(ApiRetirementSignUpLimitationsInfoResponse limitationsInfo, ComposeUiEvent<Throwable> error) {
        return new RetirementSignUpLimitationsInfoViewState(limitationsInfo, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignUpLimitationsInfoViewState)) {
            return false;
        }
        RetirementSignUpLimitationsInfoViewState retirementSignUpLimitationsInfoViewState = (RetirementSignUpLimitationsInfoViewState) other;
        return Intrinsics.areEqual(this.limitationsInfo, retirementSignUpLimitationsInfoViewState.limitationsInfo) && Intrinsics.areEqual(this.error, retirementSignUpLimitationsInfoViewState.error);
    }

    public int hashCode() {
        ApiRetirementSignUpLimitationsInfoResponse apiRetirementSignUpLimitationsInfoResponse = this.limitationsInfo;
        int iHashCode = (apiRetirementSignUpLimitationsInfoResponse == null ? 0 : apiRetirementSignUpLimitationsInfoResponse.hashCode()) * 31;
        ComposeUiEvent<Throwable> composeUiEvent = this.error;
        return iHashCode + (composeUiEvent != null ? composeUiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RetirementSignUpLimitationsInfoViewState(limitationsInfo=" + this.limitationsInfo + ", error=" + this.error + ")";
    }

    public RetirementSignUpLimitationsInfoViewState(ApiRetirementSignUpLimitationsInfoResponse apiRetirementSignUpLimitationsInfoResponse, ComposeUiEvent<Throwable> composeUiEvent) {
        this.limitationsInfo = apiRetirementSignUpLimitationsInfoResponse;
        this.error = composeUiEvent;
    }

    public /* synthetic */ RetirementSignUpLimitationsInfoViewState(ApiRetirementSignUpLimitationsInfoResponse apiRetirementSignUpLimitationsInfoResponse, ComposeUiEvent composeUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRetirementSignUpLimitationsInfoResponse, (i & 2) != 0 ? null : composeUiEvent);
    }

    public final ApiRetirementSignUpLimitationsInfoResponse getLimitationsInfo() {
        return this.limitationsInfo;
    }

    public final ComposeUiEvent<Throwable> getError() {
        return this.error;
    }
}

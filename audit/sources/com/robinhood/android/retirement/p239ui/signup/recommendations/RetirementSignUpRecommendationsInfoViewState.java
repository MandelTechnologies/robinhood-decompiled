package com.robinhood.android.retirement.p239ui.signup.recommendations;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpRecommendationsInfoResponse;
import com.robinhood.compose.duxo.ComposeUiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpRecommendationsInfoViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/recommendations/RetirementSignUpRecommendationsInfoViewState;", "", "recommendationsInfo", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpRecommendationsInfoResponse;", "error", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpRecommendationsInfoResponse;Lcom/robinhood/compose/duxo/ComposeUiEvent;)V", "getRecommendationsInfo", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignUpRecommendationsInfoResponse;", "getError", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementSignUpRecommendationsInfoViewState {
    public static final int $stable = 8;
    private final ComposeUiEvent<Throwable> error;
    private final ApiRetirementSignUpRecommendationsInfoResponse recommendationsInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public RetirementSignUpRecommendationsInfoViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RetirementSignUpRecommendationsInfoViewState copy$default(RetirementSignUpRecommendationsInfoViewState retirementSignUpRecommendationsInfoViewState, ApiRetirementSignUpRecommendationsInfoResponse apiRetirementSignUpRecommendationsInfoResponse, ComposeUiEvent composeUiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRetirementSignUpRecommendationsInfoResponse = retirementSignUpRecommendationsInfoViewState.recommendationsInfo;
        }
        if ((i & 2) != 0) {
            composeUiEvent = retirementSignUpRecommendationsInfoViewState.error;
        }
        return retirementSignUpRecommendationsInfoViewState.copy(apiRetirementSignUpRecommendationsInfoResponse, composeUiEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRetirementSignUpRecommendationsInfoResponse getRecommendationsInfo() {
        return this.recommendationsInfo;
    }

    public final ComposeUiEvent<Throwable> component2() {
        return this.error;
    }

    public final RetirementSignUpRecommendationsInfoViewState copy(ApiRetirementSignUpRecommendationsInfoResponse recommendationsInfo, ComposeUiEvent<Throwable> error) {
        return new RetirementSignUpRecommendationsInfoViewState(recommendationsInfo, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignUpRecommendationsInfoViewState)) {
            return false;
        }
        RetirementSignUpRecommendationsInfoViewState retirementSignUpRecommendationsInfoViewState = (RetirementSignUpRecommendationsInfoViewState) other;
        return Intrinsics.areEqual(this.recommendationsInfo, retirementSignUpRecommendationsInfoViewState.recommendationsInfo) && Intrinsics.areEqual(this.error, retirementSignUpRecommendationsInfoViewState.error);
    }

    public int hashCode() {
        ApiRetirementSignUpRecommendationsInfoResponse apiRetirementSignUpRecommendationsInfoResponse = this.recommendationsInfo;
        int iHashCode = (apiRetirementSignUpRecommendationsInfoResponse == null ? 0 : apiRetirementSignUpRecommendationsInfoResponse.hashCode()) * 31;
        ComposeUiEvent<Throwable> composeUiEvent = this.error;
        return iHashCode + (composeUiEvent != null ? composeUiEvent.hashCode() : 0);
    }

    public String toString() {
        return "RetirementSignUpRecommendationsInfoViewState(recommendationsInfo=" + this.recommendationsInfo + ", error=" + this.error + ")";
    }

    public RetirementSignUpRecommendationsInfoViewState(ApiRetirementSignUpRecommendationsInfoResponse apiRetirementSignUpRecommendationsInfoResponse, ComposeUiEvent<Throwable> composeUiEvent) {
        this.recommendationsInfo = apiRetirementSignUpRecommendationsInfoResponse;
        this.error = composeUiEvent;
    }

    public /* synthetic */ RetirementSignUpRecommendationsInfoViewState(ApiRetirementSignUpRecommendationsInfoResponse apiRetirementSignUpRecommendationsInfoResponse, ComposeUiEvent composeUiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiRetirementSignUpRecommendationsInfoResponse, (i & 2) != 0 ? null : composeUiEvent);
    }

    public final ApiRetirementSignUpRecommendationsInfoResponse getRecommendationsInfo() {
        return this.recommendationsInfo;
    }

    public final ComposeUiEvent<Throwable> getError() {
        return this.error;
    }
}

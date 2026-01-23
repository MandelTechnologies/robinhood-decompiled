package com.robinhood.android.retirement.onboarding.submit;

import com.robinhood.android.models.retirement.api.ApiRetirementAccountCreatedResponse;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignupSubmitDataState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0000J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;", "", "ignoreExitDeepLink", "", "showLoadingText", "hitTimeoutError", "refreshCount", "", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "<init>", "(ZZZILcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;)V", "getIgnoreExitDeepLink", "()Z", "getShowLoadingText", "getHitTimeoutError", "getRefreshCount", "()I", "getResponse", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "reset", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Provider", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementSignupSubmitDataState {
    private final boolean hitTimeoutError;
    private final boolean ignoreExitDeepLink;
    private final int refreshCount;
    private final ApiRetirementAccountCreatedResponse response;
    private final boolean showLoadingText;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RetirementSignupSubmitDataState copy$default(RetirementSignupSubmitDataState retirementSignupSubmitDataState, boolean z, boolean z2, boolean z3, int i, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = retirementSignupSubmitDataState.ignoreExitDeepLink;
        }
        if ((i2 & 2) != 0) {
            z2 = retirementSignupSubmitDataState.showLoadingText;
        }
        if ((i2 & 4) != 0) {
            z3 = retirementSignupSubmitDataState.hitTimeoutError;
        }
        if ((i2 & 8) != 0) {
            i = retirementSignupSubmitDataState.refreshCount;
        }
        if ((i2 & 16) != 0) {
            apiRetirementAccountCreatedResponse = retirementSignupSubmitDataState.response;
        }
        ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse2 = apiRetirementAccountCreatedResponse;
        boolean z4 = z3;
        return retirementSignupSubmitDataState.copy(z, z2, z4, i, apiRetirementAccountCreatedResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIgnoreExitDeepLink() {
        return this.ignoreExitDeepLink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowLoadingText() {
        return this.showLoadingText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHitTimeoutError() {
        return this.hitTimeoutError;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRefreshCount() {
        return this.refreshCount;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiRetirementAccountCreatedResponse getResponse() {
        return this.response;
    }

    public final RetirementSignupSubmitDataState copy(boolean ignoreExitDeepLink, boolean showLoadingText, boolean hitTimeoutError, int refreshCount, ApiRetirementAccountCreatedResponse response) {
        return new RetirementSignupSubmitDataState(ignoreExitDeepLink, showLoadingText, hitTimeoutError, refreshCount, response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignupSubmitDataState)) {
            return false;
        }
        RetirementSignupSubmitDataState retirementSignupSubmitDataState = (RetirementSignupSubmitDataState) other;
        return this.ignoreExitDeepLink == retirementSignupSubmitDataState.ignoreExitDeepLink && this.showLoadingText == retirementSignupSubmitDataState.showLoadingText && this.hitTimeoutError == retirementSignupSubmitDataState.hitTimeoutError && this.refreshCount == retirementSignupSubmitDataState.refreshCount && Intrinsics.areEqual(this.response, retirementSignupSubmitDataState.response);
    }

    public int hashCode() {
        int iHashCode = ((((((Boolean.hashCode(this.ignoreExitDeepLink) * 31) + Boolean.hashCode(this.showLoadingText)) * 31) + Boolean.hashCode(this.hitTimeoutError)) * 31) + Integer.hashCode(this.refreshCount)) * 31;
        ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse = this.response;
        return iHashCode + (apiRetirementAccountCreatedResponse == null ? 0 : apiRetirementAccountCreatedResponse.hashCode());
    }

    public String toString() {
        return "RetirementSignupSubmitDataState(ignoreExitDeepLink=" + this.ignoreExitDeepLink + ", showLoadingText=" + this.showLoadingText + ", hitTimeoutError=" + this.hitTimeoutError + ", refreshCount=" + this.refreshCount + ", response=" + this.response + ")";
    }

    public RetirementSignupSubmitDataState(boolean z, boolean z2, boolean z3, int i, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse) {
        this.ignoreExitDeepLink = z;
        this.showLoadingText = z2;
        this.hitTimeoutError = z3;
        this.refreshCount = i;
        this.response = apiRetirementAccountCreatedResponse;
    }

    public /* synthetic */ RetirementSignupSubmitDataState(boolean z, boolean z2, boolean z3, int i, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : apiRetirementAccountCreatedResponse);
    }

    public final boolean getIgnoreExitDeepLink() {
        return this.ignoreExitDeepLink;
    }

    public final boolean getShowLoadingText() {
        return this.showLoadingText;
    }

    public final boolean getHitTimeoutError() {
        return this.hitTimeoutError;
    }

    public final int getRefreshCount() {
        return this.refreshCount;
    }

    public final ApiRetirementAccountCreatedResponse getResponse() {
        return this.response;
    }

    public final RetirementSignupSubmitDataState reset() {
        return copy$default(this, false, false, false, this.refreshCount + 1, null, 17, null);
    }

    /* compiled from: RetirementSignupSubmitDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitDataState;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementSignupSubmitDataState, RetirementSignupSubmitViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementSignupSubmitViewState reduce(RetirementSignupSubmitDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getResponse() != null) {
                return new RetirementSignupSubmitViewState.Success(dataState.getResponse(), dataState.getIgnoreExitDeepLink());
            }
            if (!dataState.getHitTimeoutError()) {
                return dataState.getShowLoadingText() ? RetirementSignupSubmitViewState.LoadingWithText.INSTANCE : RetirementSignupSubmitViewState.LoadingWithoutText.INSTANCE;
            }
            if (dataState.getRefreshCount() >= 2) {
                return RetirementSignupSubmitViewState.ErrorCanContactSupport.INSTANCE;
            }
            return RetirementSignupSubmitViewState.ErrorRefresh.INSTANCE;
        }
    }
}

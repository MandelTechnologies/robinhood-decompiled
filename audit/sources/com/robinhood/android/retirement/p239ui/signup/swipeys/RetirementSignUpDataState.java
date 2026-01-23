package com.robinhood.android.retirement.p239ui.signup.swipeys;

import com.robinhood.android.models.retirement.api.ApiRetirementDashboardSignupResponse;
import com.robinhood.android.retirement.p239ui.signup.swipeys.RetirementSignUpViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000e¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;", "", "checkEligibilityLoading", "", "signupSwipeys", "Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "swipeysError", "", "currentSwipeyStep", "", "isSwipeyRebrandMember", "<init>", "(ZLcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;Ljava/lang/Throwable;IZ)V", "getCheckEligibilityLoading", "()Z", "getSignupSwipeys", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "getSwipeysError", "()Ljava/lang/Throwable;", "getCurrentSwipeyStep", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Provider", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementSignUpDataState {
    private final boolean checkEligibilityLoading;
    private final int currentSwipeyStep;
    private final boolean isSwipeyRebrandMember;
    private final ApiRetirementDashboardSignupResponse signupSwipeys;
    private final Throwable swipeysError;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RetirementSignUpDataState() {
        this(false, null, null, 0, false, 31, null);
    }

    public static /* synthetic */ RetirementSignUpDataState copy$default(RetirementSignUpDataState retirementSignUpDataState, boolean z, ApiRetirementDashboardSignupResponse apiRetirementDashboardSignupResponse, Throwable th, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = retirementSignUpDataState.checkEligibilityLoading;
        }
        if ((i2 & 2) != 0) {
            apiRetirementDashboardSignupResponse = retirementSignUpDataState.signupSwipeys;
        }
        if ((i2 & 4) != 0) {
            th = retirementSignUpDataState.swipeysError;
        }
        if ((i2 & 8) != 0) {
            i = retirementSignUpDataState.currentSwipeyStep;
        }
        if ((i2 & 16) != 0) {
            z2 = retirementSignUpDataState.isSwipeyRebrandMember;
        }
        boolean z3 = z2;
        Throwable th2 = th;
        return retirementSignUpDataState.copy(z, apiRetirementDashboardSignupResponse, th2, i, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCheckEligibilityLoading() {
        return this.checkEligibilityLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiRetirementDashboardSignupResponse getSignupSwipeys() {
        return this.signupSwipeys;
    }

    /* renamed from: component3, reason: from getter */
    public final Throwable getSwipeysError() {
        return this.swipeysError;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentSwipeyStep() {
        return this.currentSwipeyStep;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSwipeyRebrandMember() {
        return this.isSwipeyRebrandMember;
    }

    public final RetirementSignUpDataState copy(boolean checkEligibilityLoading, ApiRetirementDashboardSignupResponse signupSwipeys, Throwable swipeysError, int currentSwipeyStep, boolean isSwipeyRebrandMember) {
        return new RetirementSignUpDataState(checkEligibilityLoading, signupSwipeys, swipeysError, currentSwipeyStep, isSwipeyRebrandMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementSignUpDataState)) {
            return false;
        }
        RetirementSignUpDataState retirementSignUpDataState = (RetirementSignUpDataState) other;
        return this.checkEligibilityLoading == retirementSignUpDataState.checkEligibilityLoading && Intrinsics.areEqual(this.signupSwipeys, retirementSignUpDataState.signupSwipeys) && Intrinsics.areEqual(this.swipeysError, retirementSignUpDataState.swipeysError) && this.currentSwipeyStep == retirementSignUpDataState.currentSwipeyStep && this.isSwipeyRebrandMember == retirementSignUpDataState.isSwipeyRebrandMember;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.checkEligibilityLoading) * 31;
        ApiRetirementDashboardSignupResponse apiRetirementDashboardSignupResponse = this.signupSwipeys;
        int iHashCode2 = (iHashCode + (apiRetirementDashboardSignupResponse == null ? 0 : apiRetirementDashboardSignupResponse.hashCode())) * 31;
        Throwable th = this.swipeysError;
        return ((((iHashCode2 + (th != null ? th.hashCode() : 0)) * 31) + Integer.hashCode(this.currentSwipeyStep)) * 31) + Boolean.hashCode(this.isSwipeyRebrandMember);
    }

    public String toString() {
        return "RetirementSignUpDataState(checkEligibilityLoading=" + this.checkEligibilityLoading + ", signupSwipeys=" + this.signupSwipeys + ", swipeysError=" + this.swipeysError + ", currentSwipeyStep=" + this.currentSwipeyStep + ", isSwipeyRebrandMember=" + this.isSwipeyRebrandMember + ")";
    }

    public RetirementSignUpDataState(boolean z, ApiRetirementDashboardSignupResponse apiRetirementDashboardSignupResponse, Throwable th, int i, boolean z2) {
        this.checkEligibilityLoading = z;
        this.signupSwipeys = apiRetirementDashboardSignupResponse;
        this.swipeysError = th;
        this.currentSwipeyStep = i;
        this.isSwipeyRebrandMember = z2;
    }

    public /* synthetic */ RetirementSignUpDataState(boolean z, ApiRetirementDashboardSignupResponse apiRetirementDashboardSignupResponse, Throwable th, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : apiRetirementDashboardSignupResponse, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z2);
    }

    public final boolean getCheckEligibilityLoading() {
        return this.checkEligibilityLoading;
    }

    public final ApiRetirementDashboardSignupResponse getSignupSwipeys() {
        return this.signupSwipeys;
    }

    public final Throwable getSwipeysError() {
        return this.swipeysError;
    }

    public final int getCurrentSwipeyStep() {
        return this.currentSwipeyStep;
    }

    public final boolean isSwipeyRebrandMember() {
        return this.isSwipeyRebrandMember;
    }

    /* compiled from: RetirementSignUpDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpDataState;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.signup.swipeys.RetirementSignUpDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementSignUpDataState, RetirementSignUpViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementSignUpViewState reduce(RetirementSignUpDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getSignupSwipeys() != null) {
                return new RetirementSignUpViewState.Loaded(dataState.getSignupSwipeys(), dataState.getCheckEligibilityLoading(), dataState.getCurrentSwipeyStep(), dataState.isSwipeyRebrandMember());
            }
            if (dataState.getSwipeysError() != null) {
                return new RetirementSignUpViewState.Failure(dataState.getSwipeysError());
            }
            return RetirementSignUpViewState.Loading.INSTANCE;
        }
    }
}

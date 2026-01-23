package com.robinhood.android.retirement.p239ui.signup.swipeys;

import com.robinhood.android.models.retirement.api.ApiRetirementDashboardSignupResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "", "Loading", "Loaded", "Failure", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Failure;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loaded;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loading;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementSignUpViewState {

    /* compiled from: RetirementSignUpViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loading;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "<init>", "()V", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RetirementSignUpViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RetirementSignUpViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Loaded;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "ctaLoading", "", "currentIndex", "", "isSwipeyRebrandMember", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;ZIZ)V", "getResponse", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementDashboardSignupResponse;", "getCtaLoading", "()Z", "getCurrentIndex", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RetirementSignUpViewState {
        public static final int $stable = 8;
        private final boolean ctaLoading;
        private final int currentIndex;
        private final boolean isSwipeyRebrandMember;
        private final ApiRetirementDashboardSignupResponse response;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ApiRetirementDashboardSignupResponse apiRetirementDashboardSignupResponse, boolean z, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                apiRetirementDashboardSignupResponse = loaded.response;
            }
            if ((i2 & 2) != 0) {
                z = loaded.ctaLoading;
            }
            if ((i2 & 4) != 0) {
                i = loaded.currentIndex;
            }
            if ((i2 & 8) != 0) {
                z2 = loaded.isSwipeyRebrandMember;
            }
            return loaded.copy(apiRetirementDashboardSignupResponse, z, i, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementDashboardSignupResponse getResponse() {
            return this.response;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCtaLoading() {
            return this.ctaLoading;
        }

        /* renamed from: component3, reason: from getter */
        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSwipeyRebrandMember() {
            return this.isSwipeyRebrandMember;
        }

        public final Loaded copy(ApiRetirementDashboardSignupResponse response, boolean ctaLoading, int currentIndex, boolean isSwipeyRebrandMember) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Loaded(response, ctaLoading, currentIndex, isSwipeyRebrandMember);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.response, loaded.response) && this.ctaLoading == loaded.ctaLoading && this.currentIndex == loaded.currentIndex && this.isSwipeyRebrandMember == loaded.isSwipeyRebrandMember;
        }

        public int hashCode() {
            return (((((this.response.hashCode() * 31) + Boolean.hashCode(this.ctaLoading)) * 31) + Integer.hashCode(this.currentIndex)) * 31) + Boolean.hashCode(this.isSwipeyRebrandMember);
        }

        public String toString() {
            return "Loaded(response=" + this.response + ", ctaLoading=" + this.ctaLoading + ", currentIndex=" + this.currentIndex + ", isSwipeyRebrandMember=" + this.isSwipeyRebrandMember + ")";
        }

        public Loaded(ApiRetirementDashboardSignupResponse response, boolean z, int i, boolean z2) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
            this.ctaLoading = z;
            this.currentIndex = i;
            this.isSwipeyRebrandMember = z2;
        }

        public final ApiRetirementDashboardSignupResponse getResponse() {
            return this.response;
        }

        public final boolean getCtaLoading() {
            return this.ctaLoading;
        }

        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        public final boolean isSwipeyRebrandMember() {
            return this.isSwipeyRebrandMember;
        }
    }

    /* compiled from: RetirementSignUpViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState$Failure;", "Lcom/robinhood/android/retirement/ui/signup/swipeys/RetirementSignUpViewState;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements RetirementSignUpViewState {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.cause;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Failure copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Failure(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.cause, ((Failure) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Failure(cause=" + this.cause + ")";
        }

        public Failure(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}

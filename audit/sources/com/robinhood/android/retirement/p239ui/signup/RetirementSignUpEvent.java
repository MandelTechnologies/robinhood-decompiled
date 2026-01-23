package com.robinhood.android.retirement.p239ui.signup;

import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "", "Ineligible", "Eligible", "Error", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Eligible;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Error;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Ineligible;", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface RetirementSignUpEvent {

    /* compiled from: RetirementSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Ineligible;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "bottomSheet", "Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;)V", "getBottomSheet", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementSignupIneligibleBottomSheet;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements RetirementSignUpEvent {
        public static final int $stable = 8;
        private final ApiRetirementSignUpEligibility2 bottomSheet;

        public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ApiRetirementSignUpEligibility2 apiRetirementSignUpEligibility2, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementSignUpEligibility2 = ineligible.bottomSheet;
            }
            return ineligible.copy(apiRetirementSignUpEligibility2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementSignUpEligibility2 getBottomSheet() {
            return this.bottomSheet;
        }

        public final Ineligible copy(ApiRetirementSignUpEligibility2 bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            return new Ineligible(bottomSheet);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ineligible) && Intrinsics.areEqual(this.bottomSheet, ((Ineligible) other).bottomSheet);
        }

        public int hashCode() {
            return this.bottomSheet.hashCode();
        }

        public String toString() {
            return "Ineligible(bottomSheet=" + this.bottomSheet + ")";
        }

        public Ineligible(ApiRetirementSignUpEligibility2 bottomSheet) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.bottomSheet = bottomSheet;
        }

        public final ApiRetirementSignUpEligibility2 getBottomSheet() {
            return this.bottomSheet;
        }
    }

    /* compiled from: RetirementSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Eligible;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "entryPoint", "", "managementTypeSelection", "Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "<init>", "(Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;Ljava/lang/String;Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;)V", "getIntro", "()Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "getEntryPoint", "()Ljava/lang/String;", "getManagementTypeSelection", "()Lcom/robinhood/android/retirement/contracts/RetirementOnboardingManagementTypeSelection;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Eligible implements RetirementSignUpEvent {
        public static final int $stable = 8;
        private final String entryPoint;
        private final RetirementOnboardingIntro intro;
        private final RetirementIntentKeys5 managementTypeSelection;

        public static /* synthetic */ Eligible copy$default(Eligible eligible, RetirementOnboardingIntro retirementOnboardingIntro, String str, RetirementIntentKeys5 retirementIntentKeys5, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementOnboardingIntro = eligible.intro;
            }
            if ((i & 2) != 0) {
                str = eligible.entryPoint;
            }
            if ((i & 4) != 0) {
                retirementIntentKeys5 = eligible.managementTypeSelection;
            }
            return eligible.copy(retirementOnboardingIntro, str, retirementIntentKeys5);
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementOnboardingIntro getIntro() {
            return this.intro;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component3, reason: from getter */
        public final RetirementIntentKeys5 getManagementTypeSelection() {
            return this.managementTypeSelection;
        }

        public final Eligible copy(RetirementOnboardingIntro intro, String entryPoint, RetirementIntentKeys5 managementTypeSelection) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
            return new Eligible(intro, entryPoint, managementTypeSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) other;
            return Intrinsics.areEqual(this.intro, eligible.intro) && Intrinsics.areEqual(this.entryPoint, eligible.entryPoint) && this.managementTypeSelection == eligible.managementTypeSelection;
        }

        public int hashCode() {
            int iHashCode = this.intro.hashCode() * 31;
            String str = this.entryPoint;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.managementTypeSelection.hashCode();
        }

        public String toString() {
            return "Eligible(intro=" + this.intro + ", entryPoint=" + this.entryPoint + ", managementTypeSelection=" + this.managementTypeSelection + ")";
        }

        public Eligible(RetirementOnboardingIntro intro, String str, RetirementIntentKeys5 managementTypeSelection) {
            Intrinsics.checkNotNullParameter(intro, "intro");
            Intrinsics.checkNotNullParameter(managementTypeSelection, "managementTypeSelection");
            this.intro = intro;
            this.entryPoint = str;
            this.managementTypeSelection = managementTypeSelection;
        }

        public final RetirementOnboardingIntro getIntro() {
            return this.intro;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }

        public final RetirementIntentKeys5 getManagementTypeSelection() {
            return this.managementTypeSelection;
        }

        public /* synthetic */ Eligible(RetirementOnboardingIntro retirementOnboardingIntro, String str, RetirementIntentKeys5 retirementIntentKeys5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(retirementOnboardingIntro, (i & 2) != 0 ? null : str, (i & 4) != 0 ? RetirementIntentKeys5.SELF_DIRECTED : retirementIntentKeys5);
        }
    }

    /* compiled from: RetirementSignUpEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent$Error;", "Lcom/robinhood/android/retirement/ui/signup/RetirementSignUpEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements RetirementSignUpEvent {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.cause;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Error copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Error(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.cause + ")";
        }

        public Error(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}

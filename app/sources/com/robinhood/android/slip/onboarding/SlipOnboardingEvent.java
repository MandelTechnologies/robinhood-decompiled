package com.robinhood.android.slip.onboarding;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.models.p320db.SlipOnboarding;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipOnboardingEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "", "<init>", "()V", "ShowSplash", "ShowValueProps", "ShowInvestorProfile", "ShowChecklist", "ShowEligibilityResult", "ShowAgreements", "ShowSuccess", "ShowError", "ShowUkFlow", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowAgreements;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowChecklist;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowEligibilityResult;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowError;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowInvestorProfile;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSplash;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSuccess;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowUkFlow;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowValueProps;", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class SlipOnboardingEvent {
    public static final int $stable = 0;

    public /* synthetic */ SlipOnboardingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SlipOnboardingEvent() {
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSplash;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "splash", "Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "showRecommendedFlow", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "<init>", "(Lcom/robinhood/models/db/SlipOnboarding$SplashView;ZLcom/robinhood/rosetta/eventlogging/SLIPContext;)V", "getSplash", "()Lcom/robinhood/models/db/SlipOnboarding$SplashView;", "getShowRecommendedFlow", "()Z", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/SLIPContext;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSplash extends SlipOnboardingEvent {
        public static final int $stable = 8;
        private final SLIPContext loggingContext;
        private final boolean showRecommendedFlow;
        private final SlipOnboarding.SplashView splash;

        public static /* synthetic */ ShowSplash copy$default(ShowSplash showSplash, SlipOnboarding.SplashView splashView, boolean z, SLIPContext sLIPContext, int i, Object obj) {
            if ((i & 1) != 0) {
                splashView = showSplash.splash;
            }
            if ((i & 2) != 0) {
                z = showSplash.showRecommendedFlow;
            }
            if ((i & 4) != 0) {
                sLIPContext = showSplash.loggingContext;
            }
            return showSplash.copy(splashView, z, sLIPContext);
        }

        /* renamed from: component1, reason: from getter */
        public final SlipOnboarding.SplashView getSplash() {
            return this.splash;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        /* renamed from: component3, reason: from getter */
        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }

        public final ShowSplash copy(SlipOnboarding.SplashView splash, boolean showRecommendedFlow, SLIPContext loggingContext) {
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            return new ShowSplash(splash, showRecommendedFlow, loggingContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowSplash)) {
                return false;
            }
            ShowSplash showSplash = (ShowSplash) other;
            return Intrinsics.areEqual(this.splash, showSplash.splash) && this.showRecommendedFlow == showSplash.showRecommendedFlow && Intrinsics.areEqual(this.loggingContext, showSplash.loggingContext);
        }

        public int hashCode() {
            return (((this.splash.hashCode() * 31) + Boolean.hashCode(this.showRecommendedFlow)) * 31) + this.loggingContext.hashCode();
        }

        public String toString() {
            return "ShowSplash(splash=" + this.splash + ", showRecommendedFlow=" + this.showRecommendedFlow + ", loggingContext=" + this.loggingContext + ")";
        }

        public final SlipOnboarding.SplashView getSplash() {
            return this.splash;
        }

        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        public final SLIPContext getLoggingContext() {
            return this.loggingContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSplash(SlipOnboarding.SplashView splash, boolean z, SLIPContext loggingContext) {
            super(null);
            Intrinsics.checkNotNullParameter(splash, "splash");
            Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
            this.splash = splash;
            this.showRecommendedFlow = z;
            this.loggingContext = loggingContext;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowValueProps;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "valueProps", "Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;", "<init>", "(Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;)V", "getValueProps", "()Lcom/robinhood/models/db/SlipOnboarding$ValuePropsView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowValueProps extends SlipOnboardingEvent {
        public static final int $stable = 8;
        private final SlipOnboarding.ValuePropsView valueProps;

        public static /* synthetic */ ShowValueProps copy$default(ShowValueProps showValueProps, SlipOnboarding.ValuePropsView valuePropsView, int i, Object obj) {
            if ((i & 1) != 0) {
                valuePropsView = showValueProps.valueProps;
            }
            return showValueProps.copy(valuePropsView);
        }

        /* renamed from: component1, reason: from getter */
        public final SlipOnboarding.ValuePropsView getValueProps() {
            return this.valueProps;
        }

        public final ShowValueProps copy(SlipOnboarding.ValuePropsView valueProps) {
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            return new ShowValueProps(valueProps);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowValueProps) && Intrinsics.areEqual(this.valueProps, ((ShowValueProps) other).valueProps);
        }

        public int hashCode() {
            return this.valueProps.hashCode();
        }

        public String toString() {
            return "ShowValueProps(valueProps=" + this.valueProps + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowValueProps(SlipOnboarding.ValuePropsView valueProps) {
            super(null);
            Intrinsics.checkNotNullParameter(valueProps, "valueProps");
            this.valueProps = valueProps;
        }

        public final SlipOnboarding.ValuePropsView getValueProps() {
            return this.valueProps;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowInvestorProfile;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowInvestorProfile extends SlipOnboardingEvent {
        public static final int $stable = 0;
        public static final ShowInvestorProfile INSTANCE = new ShowInvestorProfile();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowInvestorProfile);
        }

        public int hashCode() {
            return -739709908;
        }

        public String toString() {
            return "ShowInvestorProfile";
        }

        private ShowInvestorProfile() {
            super(null);
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowChecklist;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowChecklist extends SlipOnboardingEvent {
        public static final int $stable = 0;
        public static final ShowChecklist INSTANCE = new ShowChecklist();

        public boolean equals(Object other) {
            return this == other || (other instanceof ShowChecklist);
        }

        public int hashCode() {
            return -664697823;
        }

        public String toString() {
            return "ShowChecklist";
        }

        private ShowChecklist() {
            super(null);
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowEligibilityResult;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "isRecommended", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowEligibilityResult extends SlipOnboardingEvent {
        public static final int $stable = 0;
        private final boolean isRecommended;

        public static /* synthetic */ ShowEligibilityResult copy$default(ShowEligibilityResult showEligibilityResult, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showEligibilityResult.isRecommended;
            }
            return showEligibilityResult.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRecommended() {
            return this.isRecommended;
        }

        public final ShowEligibilityResult copy(boolean isRecommended) {
            return new ShowEligibilityResult(isRecommended);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowEligibilityResult) && this.isRecommended == ((ShowEligibilityResult) other).isRecommended;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRecommended);
        }

        public String toString() {
            return "ShowEligibilityResult(isRecommended=" + this.isRecommended + ")";
        }

        public final boolean isRecommended() {
            return this.isRecommended;
        }

        public ShowEligibilityResult(boolean z) {
            super(null);
            this.isRecommended = z;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowAgreements;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "showRecommendedFlow", "", "isQuickEnrollment", "<init>", "(ZZ)V", "getShowRecommendedFlow", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAgreements extends SlipOnboardingEvent {
        public static final int $stable = 0;
        private final boolean isQuickEnrollment;
        private final boolean showRecommendedFlow;

        public static /* synthetic */ ShowAgreements copy$default(ShowAgreements showAgreements, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = showAgreements.showRecommendedFlow;
            }
            if ((i & 2) != 0) {
                z2 = showAgreements.isQuickEnrollment;
            }
            return showAgreements.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsQuickEnrollment() {
            return this.isQuickEnrollment;
        }

        public final ShowAgreements copy(boolean showRecommendedFlow, boolean isQuickEnrollment) {
            return new ShowAgreements(showRecommendedFlow, isQuickEnrollment);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAgreements)) {
                return false;
            }
            ShowAgreements showAgreements = (ShowAgreements) other;
            return this.showRecommendedFlow == showAgreements.showRecommendedFlow && this.isQuickEnrollment == showAgreements.isQuickEnrollment;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.showRecommendedFlow) * 31) + Boolean.hashCode(this.isQuickEnrollment);
        }

        public String toString() {
            return "ShowAgreements(showRecommendedFlow=" + this.showRecommendedFlow + ", isQuickEnrollment=" + this.isQuickEnrollment + ")";
        }

        public ShowAgreements(boolean z, boolean z2) {
            super(null);
            this.showRecommendedFlow = z;
            this.isQuickEnrollment = z2;
        }

        public final boolean getShowRecommendedFlow() {
            return this.showRecommendedFlow;
        }

        public final boolean isQuickEnrollment() {
            return this.isQuickEnrollment;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowSuccess;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "success", "Lcom/robinhood/models/db/SlipOnboarding$SuccessView;", "<init>", "(Lcom/robinhood/models/db/SlipOnboarding$SuccessView;)V", "getSuccess", "()Lcom/robinhood/models/db/SlipOnboarding$SuccessView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowSuccess extends SlipOnboardingEvent {
        public static final int $stable = 8;
        private final SlipOnboarding.SuccessView success;

        public static /* synthetic */ ShowSuccess copy$default(ShowSuccess showSuccess, SlipOnboarding.SuccessView successView, int i, Object obj) {
            if ((i & 1) != 0) {
                successView = showSuccess.success;
            }
            return showSuccess.copy(successView);
        }

        /* renamed from: component1, reason: from getter */
        public final SlipOnboarding.SuccessView getSuccess() {
            return this.success;
        }

        public final ShowSuccess copy(SlipOnboarding.SuccessView success) {
            Intrinsics.checkNotNullParameter(success, "success");
            return new ShowSuccess(success);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSuccess) && Intrinsics.areEqual(this.success, ((ShowSuccess) other).success);
        }

        public int hashCode() {
            return this.success.hashCode();
        }

        public String toString() {
            return "ShowSuccess(success=" + this.success + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSuccess(SlipOnboarding.SuccessView success) {
            super(null);
            Intrinsics.checkNotNullParameter(success, "success");
            this.success = success;
        }

        public final SlipOnboarding.SuccessView getSuccess() {
            return this.success;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowError;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowError extends SlipOnboardingEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ ShowError copy$default(ShowError showError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = showError.throwable;
            }
            return showError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final ShowError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new ShowError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.areEqual(this.throwable, ((ShowError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "ShowError(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: SlipOnboardingEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent$ShowUkFlow;", "Lcom/robinhood/android/slip/onboarding/SlipOnboardingEvent;", "entryPoint", "", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEntryPoint", "()Ljava/lang/String;", "getAccountNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-slip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowUkFlow extends SlipOnboardingEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final String entryPoint;

        public static /* synthetic */ ShowUkFlow copy$default(ShowUkFlow showUkFlow, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = showUkFlow.entryPoint;
            }
            if ((i & 2) != 0) {
                str2 = showUkFlow.accountNumber;
            }
            return showUkFlow.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEntryPoint() {
            return this.entryPoint;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ShowUkFlow copy(String entryPoint, String accountNumber) {
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new ShowUkFlow(entryPoint, accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowUkFlow)) {
                return false;
            }
            ShowUkFlow showUkFlow = (ShowUkFlow) other;
            return Intrinsics.areEqual(this.entryPoint, showUkFlow.entryPoint) && Intrinsics.areEqual(this.accountNumber, showUkFlow.accountNumber);
        }

        public int hashCode() {
            return (this.entryPoint.hashCode() * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "ShowUkFlow(entryPoint=" + this.entryPoint + ", accountNumber=" + this.accountNumber + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowUkFlow(String entryPoint, String accountNumber) {
            super(null);
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.entryPoint = entryPoint;
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getEntryPoint() {
            return this.entryPoint;
        }
    }
}

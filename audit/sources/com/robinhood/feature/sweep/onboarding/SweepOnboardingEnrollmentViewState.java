package com.robinhood.feature.sweep.onboarding;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingEnrollmentViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "", "<init>", "()V", "Loading", "Success", "Incomplete", "Error", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Error;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Incomplete;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Loading;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Success;", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class SweepOnboardingEnrollmentViewState {
    public static final int $stable = 0;

    public /* synthetic */ SweepOnboardingEnrollmentViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SweepOnboardingEnrollmentViewState() {
    }

    /* compiled from: SweepOnboardingEnrollmentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Loading;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends SweepOnboardingEnrollmentViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SweepOnboardingEnrollmentViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Success;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Success extends SweepOnboardingEnrollmentViewState {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    /* compiled from: SweepOnboardingEnrollmentViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Incomplete;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "displayStatusMessage", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getDisplayStatusMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Incomplete extends SweepOnboardingEnrollmentViewState {
        public static final int $stable = StringResource.$stable;
        private final StringResource displayStatusMessage;

        public static /* synthetic */ Incomplete copy$default(Incomplete incomplete, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = incomplete.displayStatusMessage;
            }
            return incomplete.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisplayStatusMessage() {
            return this.displayStatusMessage;
        }

        public final Incomplete copy(StringResource displayStatusMessage) {
            Intrinsics.checkNotNullParameter(displayStatusMessage, "displayStatusMessage");
            return new Incomplete(displayStatusMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Incomplete) && Intrinsics.areEqual(this.displayStatusMessage, ((Incomplete) other).displayStatusMessage);
        }

        public int hashCode() {
            return this.displayStatusMessage.hashCode();
        }

        public String toString() {
            return "Incomplete(displayStatusMessage=" + this.displayStatusMessage + ")";
        }

        public final StringResource getDisplayStatusMessage() {
            return this.displayStatusMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Incomplete(StringResource displayStatusMessage) {
            super(null);
            Intrinsics.checkNotNullParameter(displayStatusMessage, "displayStatusMessage");
            this.displayStatusMessage = displayStatusMessage;
        }
    }

    /* compiled from: SweepOnboardingEnrollmentViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState$Error;", "Lcom/robinhood/feature/sweep/onboarding/SweepOnboardingEnrollmentViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends SweepOnboardingEnrollmentViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }
    }
}

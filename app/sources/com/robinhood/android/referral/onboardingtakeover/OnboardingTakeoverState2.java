package com.robinhood.android.referral.onboardingtakeover;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnboardingTakeoverState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "", "<init>", "()V", "SuggestedEmail", "DuplicateEmailError", "InvalidEmailError", "GenericError", "Success", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$DuplicateEmailError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$GenericError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$InvalidEmailError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$Success;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$SuggestedEmail;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent, reason: use source file name */
/* loaded from: classes5.dex */
public abstract class OnboardingTakeoverState2 {
    public static final int $stable = 0;

    public /* synthetic */ OnboardingTakeoverState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OnboardingTakeoverState2() {
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$SuggestedEmail;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "currentEmail", "", "suggestedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrentEmail", "()Ljava/lang/String;", "getSuggestedEmail", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent$SuggestedEmail, reason: from toString */
    public static final /* data */ class SuggestedEmail extends OnboardingTakeoverState2 {
        public static final int $stable = 0;
        private final String currentEmail;
        private final String suggestedEmail;

        public static /* synthetic */ SuggestedEmail copy$default(SuggestedEmail suggestedEmail, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = suggestedEmail.currentEmail;
            }
            if ((i & 2) != 0) {
                str2 = suggestedEmail.suggestedEmail;
            }
            return suggestedEmail.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCurrentEmail() {
            return this.currentEmail;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        public final SuggestedEmail copy(String currentEmail, String suggestedEmail) {
            Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
            return new SuggestedEmail(currentEmail, suggestedEmail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuggestedEmail)) {
                return false;
            }
            SuggestedEmail suggestedEmail = (SuggestedEmail) other;
            return Intrinsics.areEqual(this.currentEmail, suggestedEmail.currentEmail) && Intrinsics.areEqual(this.suggestedEmail, suggestedEmail.suggestedEmail);
        }

        public int hashCode() {
            int iHashCode = this.currentEmail.hashCode() * 31;
            String str = this.suggestedEmail;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SuggestedEmail(currentEmail=" + this.currentEmail + ", suggestedEmail=" + this.suggestedEmail + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedEmail(String currentEmail, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(currentEmail, "currentEmail");
            this.currentEmail = currentEmail;
            this.suggestedEmail = str;
        }

        public final String getCurrentEmail() {
            return this.currentEmail;
        }

        public final String getSuggestedEmail() {
            return this.suggestedEmail;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$DuplicateEmailError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent$DuplicateEmailError, reason: from toString */
    public static final /* data */ class DuplicateEmailError extends OnboardingTakeoverState2 {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ DuplicateEmailError copy$default(DuplicateEmailError duplicateEmailError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = duplicateEmailError.email;
            }
            return duplicateEmailError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final DuplicateEmailError copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new DuplicateEmailError(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DuplicateEmailError) && Intrinsics.areEqual(this.email, ((DuplicateEmailError) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "DuplicateEmailError(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateEmailError(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$InvalidEmailError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent$InvalidEmailError, reason: from toString */
    public static final /* data */ class InvalidEmailError extends OnboardingTakeoverState2 {
        public static final int $stable = 0;
        private final String email;

        public static /* synthetic */ InvalidEmailError copy$default(InvalidEmailError invalidEmailError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidEmailError.email;
            }
            return invalidEmailError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final InvalidEmailError copy(String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new InvalidEmailError(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidEmailError) && Intrinsics.areEqual(this.email, ((InvalidEmailError) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "InvalidEmailError(email=" + this.email + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidEmailError(String email) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$GenericError;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent$GenericError, reason: from toString */
    public static final /* data */ class GenericError extends OnboardingTakeoverState2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ GenericError copy$default(GenericError genericError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = genericError.throwable;
            }
            return genericError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final GenericError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new GenericError(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GenericError) && Intrinsics.areEqual(this.throwable, ((GenericError) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "GenericError(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: OnboardingTakeoverState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent$Success;", "Lcom/robinhood/android/referral/onboardingtakeover/OnboardingTakeoverEvent;", "email", "", "forceDarkTheme", "", "<init>", "(Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "getForceDarkTheme", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverEvent$Success, reason: from toString */
    public static final /* data */ class Success extends OnboardingTakeoverState2 {
        public static final int $stable = 0;
        private final String email;
        private final boolean forceDarkTheme;

        public static /* synthetic */ Success copy$default(Success success, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.email;
            }
            if ((i & 2) != 0) {
                z = success.forceDarkTheme;
            }
            return success.copy(str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getForceDarkTheme() {
            return this.forceDarkTheme;
        }

        public final Success copy(String email, boolean forceDarkTheme) {
            Intrinsics.checkNotNullParameter(email, "email");
            return new Success(email, forceDarkTheme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.email, success.email) && this.forceDarkTheme == success.forceDarkTheme;
        }

        public int hashCode() {
            return (this.email.hashCode() * 31) + Boolean.hashCode(this.forceDarkTheme);
        }

        public String toString() {
            return "Success(email=" + this.email + ", forceDarkTheme=" + this.forceDarkTheme + ")";
        }

        public final String getEmail() {
            return this.email;
        }

        public final boolean getForceDarkTheme() {
            return this.forceDarkTheme;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String email, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
            this.forceDarkTheme = z;
        }
    }
}

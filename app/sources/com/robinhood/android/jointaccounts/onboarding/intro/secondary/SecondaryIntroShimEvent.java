package com.robinhood.android.jointaccounts.onboarding.intro.secondary;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecondaryIntroShimEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent;", "", "Ineligible", "Signup", "LoggedIn", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$Ineligible;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$LoggedIn;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$Signup;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface SecondaryIntroShimEvent {

    /* compiled from: SecondaryIntroShimEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$Ineligible;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ineligible implements SecondaryIntroShimEvent {
        public static final int $stable = 0;
        public static final Ineligible INSTANCE = new Ineligible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Ineligible);
        }

        public int hashCode() {
            return -2117096002;
        }

        public String toString() {
            return "Ineligible";
        }

        private Ineligible() {
        }
    }

    /* compiled from: SecondaryIntroShimEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$Signup;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent;", "invitationId", "", "<init>", "(Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Signup implements SecondaryIntroShimEvent {
        public static final int $stable = 0;
        private final String invitationId;

        public static /* synthetic */ Signup copy$default(Signup signup, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signup.invitationId;
            }
            return signup.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvitationId() {
            return this.invitationId;
        }

        public final Signup copy(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            return new Signup(invitationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Signup) && Intrinsics.areEqual(this.invitationId, ((Signup) other).invitationId);
        }

        public int hashCode() {
            return this.invitationId.hashCode();
        }

        public String toString() {
            return "Signup(invitationId=" + this.invitationId + ")";
        }

        public Signup(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.invitationId = invitationId;
        }

        public final String getInvitationId() {
            return this.invitationId;
        }
    }

    /* compiled from: SecondaryIntroShimEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent$LoggedIn;", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryIntroShimEvent;", "invitationId", "", "<init>", "(Ljava/lang/String;)V", "getInvitationId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoggedIn implements SecondaryIntroShimEvent {
        public static final int $stable = 0;
        private final String invitationId;

        public static /* synthetic */ LoggedIn copy$default(LoggedIn loggedIn, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loggedIn.invitationId;
            }
            return loggedIn.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInvitationId() {
            return this.invitationId;
        }

        public final LoggedIn copy(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            return new LoggedIn(invitationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoggedIn) && Intrinsics.areEqual(this.invitationId, ((LoggedIn) other).invitationId);
        }

        public int hashCode() {
            return this.invitationId.hashCode();
        }

        public String toString() {
            return "LoggedIn(invitationId=" + this.invitationId + ")";
        }

        public LoggedIn(String invitationId) {
            Intrinsics.checkNotNullParameter(invitationId, "invitationId");
            this.invitationId = invitationId;
        }

        public final String getInvitationId() {
            return this.invitationId;
        }
    }
}

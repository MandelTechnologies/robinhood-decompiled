package com.robinhood.android.securitycenter.p251ui;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SecurityCenterDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", "", "ErrorEvent", "PasskeyChallengeReceived", "PasskeyChallenge", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$ErrorEvent;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallengeReceived;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent, reason: use source file name */
/* loaded from: classes5.dex */
public interface SecurityCenterDuxo7 {

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$ErrorEvent;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent$ErrorEvent, reason: from toString */
    public static final /* data */ class ErrorEvent implements SecurityCenterDuxo7 {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = errorEvent.error;
            }
            return errorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final ErrorEvent copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ErrorEvent(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorEvent) && Intrinsics.areEqual(this.error, ((ErrorEvent) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ErrorEvent(error=" + this.error + ")";
        }

        public ErrorEvent(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallengeReceived;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent$PasskeyChallengeReceived, reason: from toString */
    public static final /* data */ class PasskeyChallengeReceived implements SecurityCenterDuxo7 {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ PasskeyChallengeReceived copy$default(PasskeyChallengeReceived passkeyChallengeReceived, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = passkeyChallengeReceived.challenge;
            }
            return passkeyChallengeReceived.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final PasskeyChallengeReceived copy(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new PasskeyChallengeReceived(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PasskeyChallengeReceived) && Intrinsics.areEqual(this.challenge, ((PasskeyChallengeReceived) other).challenge);
        }

        public int hashCode() {
            return this.challenge.hashCode();
        }

        public String toString() {
            return "PasskeyChallengeReceived(challenge=" + this.challenge + ")";
        }

        public PasskeyChallengeReceived(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    /* compiled from: SecurityCenterDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent;", "Verification", "Error", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge$Error;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge$Verification;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent$PasskeyChallenge */
    public interface PasskeyChallenge extends SecurityCenterDuxo7 {

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge$Verification;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent$PasskeyChallenge$Verification, reason: from toString */
        public static final /* data */ class Verification implements PasskeyChallenge {
            public static final int $stable = 8;
            private final Challenge challenge;

            public static /* synthetic */ Verification copy$default(Verification verification, Challenge challenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    challenge = verification.challenge;
                }
                return verification.copy(challenge);
            }

            /* renamed from: component1, reason: from getter */
            public final Challenge getChallenge() {
                return this.challenge;
            }

            public final Verification copy(Challenge challenge) {
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                return new Verification(challenge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Verification) && Intrinsics.areEqual(this.challenge, ((Verification) other).challenge);
            }

            public int hashCode() {
                return this.challenge.hashCode();
            }

            public String toString() {
                return "Verification(challenge=" + this.challenge + ")";
            }

            public Verification(Challenge challenge) {
                Intrinsics.checkNotNullParameter(challenge, "challenge");
                this.challenge = challenge;
            }

            public final Challenge getChallenge() {
                return this.challenge;
            }
        }

        /* compiled from: SecurityCenterDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge$Error;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterEvent$PasskeyChallenge;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterEvent$PasskeyChallenge$Error, reason: from toString */
        public static final /* data */ class Error implements PasskeyChallenge {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }
}

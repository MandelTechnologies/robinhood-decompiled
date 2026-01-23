package com.robinhood.shared.stepupverification.loggedinchallenge;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoggedInChallengeEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent;", "", "ChallengeLoaded", "Error", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent$ChallengeLoaded;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent$Error;", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface LoggedInChallengeEvent {

    /* compiled from: LoggedInChallengeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent$ChallengeLoaded;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeLoaded implements LoggedInChallengeEvent {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ ChallengeLoaded copy$default(ChallengeLoaded challengeLoaded, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = challengeLoaded.challenge;
            }
            return challengeLoaded.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final ChallengeLoaded copy(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new ChallengeLoaded(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChallengeLoaded) && Intrinsics.areEqual(this.challenge, ((ChallengeLoaded) other).challenge);
        }

        public int hashCode() {
            return this.challenge.hashCode();
        }

        public String toString() {
            return "ChallengeLoaded(challenge=" + this.challenge + ")";
        }

        public ChallengeLoaded(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    /* compiled from: LoggedInChallengeEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent$Error;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-step-up-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements LoggedInChallengeEvent {
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

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}

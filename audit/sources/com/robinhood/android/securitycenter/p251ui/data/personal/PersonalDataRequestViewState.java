package com.robinhood.android.securitycenter.p251ui.data.personal;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PersonalDataRequestViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "", "<init>", "()V", "Default", "Loading", "ChallengeReceived", "Success", "Failure", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$ChallengeReceived;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Default;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Failure;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Success;", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class PersonalDataRequestViewState {
    public static final int $stable = 0;

    public /* synthetic */ PersonalDataRequestViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PersonalDataRequestViewState() {
    }

    /* compiled from: PersonalDataRequestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Default;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Default extends PersonalDataRequestViewState {
        public static final int $stable = 0;
        public static final Default INSTANCE = new Default();

        private Default() {
            super(null);
        }
    }

    /* compiled from: PersonalDataRequestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Loading;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends PersonalDataRequestViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PersonalDataRequestViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$ChallengeReceived;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "<init>", "(Lcom/robinhood/models/api/Challenge;)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeReceived extends PersonalDataRequestViewState {
        public static final int $stable = 8;
        private final Challenge challenge;

        public static /* synthetic */ ChallengeReceived copy$default(ChallengeReceived challengeReceived, Challenge challenge, int i, Object obj) {
            if ((i & 1) != 0) {
                challenge = challengeReceived.challenge;
            }
            return challengeReceived.copy(challenge);
        }

        /* renamed from: component1, reason: from getter */
        public final Challenge getChallenge() {
            return this.challenge;
        }

        public final ChallengeReceived copy(Challenge challenge) {
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            return new ChallengeReceived(challenge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChallengeReceived) && Intrinsics.areEqual(this.challenge, ((ChallengeReceived) other).challenge);
        }

        public int hashCode() {
            return this.challenge.hashCode();
        }

        public String toString() {
            return "ChallengeReceived(challenge=" + this.challenge + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeReceived(Challenge challenge) {
            super(null);
            Intrinsics.checkNotNullParameter(challenge, "challenge");
            this.challenge = challenge;
        }

        public final Challenge getChallenge() {
            return this.challenge;
        }
    }

    /* compiled from: PersonalDataRequestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Success;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Success extends PersonalDataRequestViewState {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    /* compiled from: PersonalDataRequestViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState$Failure;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataRequestViewState;", "<init>", "()V", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failure extends PersonalDataRequestViewState {
        public static final int $stable = 0;
        public static final Failure INSTANCE = new Failure();

        private Failure() {
            super(null);
        }
    }
}

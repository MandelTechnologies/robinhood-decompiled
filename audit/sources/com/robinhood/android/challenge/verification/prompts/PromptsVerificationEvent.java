package com.robinhood.android.challenge.verification.prompts;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsVerificationEvent.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", "", "ChallengeCompleted", "RecreateLoginChallenge", "ResendChallenge", "Success", "Timeout", "UseFallback", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$ChallengeCompleted;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$RecreateLoginChallenge;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$ResendChallenge;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$Success;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$Timeout;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$UseFallback;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface PromptsVerificationEvent {

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$ChallengeCompleted;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ChallengeCompleted implements PromptsVerificationEvent {
        public static final int $stable = 0;
        public static final ChallengeCompleted INSTANCE = new ChallengeCompleted();

        public boolean equals(Object other) {
            return this == other || (other instanceof ChallengeCompleted);
        }

        public int hashCode() {
            return -910643789;
        }

        public String toString() {
            return "ChallengeCompleted";
        }

        private ChallengeCompleted() {
        }
    }

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$RecreateLoginChallenge;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RecreateLoginChallenge implements PromptsVerificationEvent {
        public static final int $stable = 0;
        public static final RecreateLoginChallenge INSTANCE = new RecreateLoginChallenge();

        public boolean equals(Object other) {
            return this == other || (other instanceof RecreateLoginChallenge);
        }

        public int hashCode() {
            return 472155348;
        }

        public String toString() {
            return "RecreateLoginChallenge";
        }

        private RecreateLoginChallenge() {
        }
    }

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$ResendChallenge;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ResendChallenge implements PromptsVerificationEvent {
        public static final int $stable = 0;
        public static final ResendChallenge INSTANCE = new ResendChallenge();

        public boolean equals(Object other) {
            return this == other || (other instanceof ResendChallenge);
        }

        public int hashCode() {
            return 385356221;
        }

        public String toString() {
            return "ResendChallenge";
        }

        private ResendChallenge() {
        }
    }

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$Success;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements PromptsVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;

        public static /* synthetic */ Success copy$default(Success success, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = success.challengeId;
            }
            return success.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final Success copy(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            return new Success(challengeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.challengeId, ((Success) other).challengeId);
        }

        public int hashCode() {
            return this.challengeId.hashCode();
        }

        public String toString() {
            return "Success(challengeId=" + this.challengeId + ")";
        }

        public Success(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.challengeId = challengeId;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }
    }

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$Timeout;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Timeout implements PromptsVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;

        public static /* synthetic */ Timeout copy$default(Timeout timeout, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = timeout.challengeId;
            }
            return timeout.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final Timeout copy(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            return new Timeout(challengeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Timeout) && Intrinsics.areEqual(this.challengeId, ((Timeout) other).challengeId);
        }

        public int hashCode() {
            return this.challengeId.hashCode();
        }

        public String toString() {
            return "Timeout(challengeId=" + this.challengeId + ")";
        }

        public Timeout(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.challengeId = challengeId;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }
    }

    /* compiled from: PromptsVerificationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent$UseFallback;", "Lcom/robinhood/android/challenge/verification/prompts/PromptsVerificationEvent;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UseFallback implements PromptsVerificationEvent {
        public static final int $stable = 8;
        private final UUID challengeId;

        public static /* synthetic */ UseFallback copy$default(UseFallback useFallback, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = useFallback.challengeId;
            }
            return useFallback.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getChallengeId() {
            return this.challengeId;
        }

        public final UseFallback copy(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            return new UseFallback(challengeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UseFallback) && Intrinsics.areEqual(this.challengeId, ((UseFallback) other).challengeId);
        }

        public int hashCode() {
            return this.challengeId.hashCode();
        }

        public String toString() {
            return "UseFallback(challengeId=" + this.challengeId + ")";
        }

        public UseFallback(UUID challengeId) {
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
            this.challengeId = challengeId;
        }

        public final UUID getChallengeId() {
            return this.challengeId;
        }
    }
}

package com.robinhood.android.challenge;

import java.util.UUID;
import kotlin.Metadata;

/* compiled from: ChallengeVerificationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/challenge/ChallengeVerificationCallbacks;", "", "onChallengeCompleted", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "onChallengeFailed", "onResendChallenge", "onUseFallbackMfa", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface ChallengeVerificationCallbacks {
    void onChallengeCompleted(UUID challengeId);

    void onChallengeFailed();

    void onResendChallenge();

    void onUseFallbackMfa(UUID challengeId);
}

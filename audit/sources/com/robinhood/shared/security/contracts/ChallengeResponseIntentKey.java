package com.robinhood.shared.security.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeResponseIntentKey.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/ChallengeResponseIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "source", "Lcom/robinhood/shared/security/contracts/ChallengeSource;", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "username", "", "<init>", "(Lcom/robinhood/shared/security/contracts/ChallengeSource;Lcom/robinhood/models/api/Challenge;Ljava/lang/String;)V", "getSource", "()Lcom/robinhood/shared/security/contracts/ChallengeSource;", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "getUsername", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ChallengeResponseIntentKey implements IntentKey {
    private final Challenge challenge;
    private final ChallengeSource source;
    private final String username;

    public static /* synthetic */ ChallengeResponseIntentKey copy$default(ChallengeResponseIntentKey challengeResponseIntentKey, ChallengeSource challengeSource, Challenge challenge, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            challengeSource = challengeResponseIntentKey.source;
        }
        if ((i & 2) != 0) {
            challenge = challengeResponseIntentKey.challenge;
        }
        if ((i & 4) != 0) {
            str = challengeResponseIntentKey.username;
        }
        return challengeResponseIntentKey.copy(challengeSource, challenge, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ChallengeSource getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    public final ChallengeResponseIntentKey copy(ChallengeSource source, Challenge challenge, String username) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        return new ChallengeResponseIntentKey(source, challenge, username);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeResponseIntentKey)) {
            return false;
        }
        ChallengeResponseIntentKey challengeResponseIntentKey = (ChallengeResponseIntentKey) other;
        return this.source == challengeResponseIntentKey.source && Intrinsics.areEqual(this.challenge, challengeResponseIntentKey.challenge) && Intrinsics.areEqual(this.username, challengeResponseIntentKey.username);
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + this.challenge.hashCode()) * 31;
        String str = this.username;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ChallengeResponseIntentKey(source=" + this.source + ", challenge=" + this.challenge + ", username=" + this.username + ")";
    }

    public ChallengeResponseIntentKey(ChallengeSource source, Challenge challenge, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        this.source = source;
        this.challenge = challenge;
        this.username = str;
    }

    public /* synthetic */ ChallengeResponseIntentKey(ChallengeSource challengeSource, Challenge challenge, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(challengeSource, challenge, (i & 4) != 0 ? null : str);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public final ChallengeSource getSource() {
        return this.source;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getUsername() {
        return this.username;
    }
}

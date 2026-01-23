package com.robinhood.android.challenge.verification;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChallengeVerificationViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J]\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/ChallengeVerificationViewState;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "isLoading", "", "isLoggedIn", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "username", "", "helpButtonVisible", "hideSmsUarFallback", "<init>", "(Lcom/robinhood/models/api/Challenge;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;ZZ)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "()Z", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getUsername", "()Ljava/lang/String;", "getHelpButtonVisible", "getHideSmsUarFallback", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ChallengeVerificationViewState {
    public static final int $stable = 8;
    private final Challenge challenge;
    private final boolean helpButtonVisible;
    private final boolean hideSmsUarFallback;
    private final boolean isLoading;
    private final boolean isLoggedIn;
    private final StringResource subtitle;
    private final StringResource title;
    private final String username;

    public static /* synthetic */ ChallengeVerificationViewState copy$default(ChallengeVerificationViewState challengeVerificationViewState, Challenge challenge, boolean z, boolean z2, StringResource stringResource, StringResource stringResource2, String str, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge = challengeVerificationViewState.challenge;
        }
        if ((i & 2) != 0) {
            z = challengeVerificationViewState.isLoading;
        }
        if ((i & 4) != 0) {
            z2 = challengeVerificationViewState.isLoggedIn;
        }
        if ((i & 8) != 0) {
            stringResource = challengeVerificationViewState.title;
        }
        if ((i & 16) != 0) {
            stringResource2 = challengeVerificationViewState.subtitle;
        }
        if ((i & 32) != 0) {
            str = challengeVerificationViewState.username;
        }
        if ((i & 64) != 0) {
            z3 = challengeVerificationViewState.helpButtonVisible;
        }
        if ((i & 128) != 0) {
            z4 = challengeVerificationViewState.hideSmsUarFallback;
        }
        boolean z5 = z3;
        boolean z6 = z4;
        StringResource stringResource3 = stringResource2;
        String str2 = str;
        return challengeVerificationViewState.copy(challenge, z, z2, stringResource, stringResource3, str2, z5, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getHelpButtonVisible() {
        return this.helpButtonVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHideSmsUarFallback() {
        return this.hideSmsUarFallback;
    }

    public final ChallengeVerificationViewState copy(Challenge challenge, boolean isLoading, boolean isLoggedIn, StringResource title, StringResource subtitle, String username, boolean helpButtonVisible, boolean hideSmsUarFallback) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new ChallengeVerificationViewState(challenge, isLoading, isLoggedIn, title, subtitle, username, helpButtonVisible, hideSmsUarFallback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeVerificationViewState)) {
            return false;
        }
        ChallengeVerificationViewState challengeVerificationViewState = (ChallengeVerificationViewState) other;
        return Intrinsics.areEqual(this.challenge, challengeVerificationViewState.challenge) && this.isLoading == challengeVerificationViewState.isLoading && this.isLoggedIn == challengeVerificationViewState.isLoggedIn && Intrinsics.areEqual(this.title, challengeVerificationViewState.title) && Intrinsics.areEqual(this.subtitle, challengeVerificationViewState.subtitle) && Intrinsics.areEqual(this.username, challengeVerificationViewState.username) && this.helpButtonVisible == challengeVerificationViewState.helpButtonVisible && this.hideSmsUarFallback == challengeVerificationViewState.hideSmsUarFallback;
    }

    public int hashCode() {
        Challenge challenge = this.challenge;
        int iHashCode = (((((((((challenge == null ? 0 : challenge.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31;
        String str = this.username;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.helpButtonVisible)) * 31) + Boolean.hashCode(this.hideSmsUarFallback);
    }

    public String toString() {
        return "ChallengeVerificationViewState(challenge=" + this.challenge + ", isLoading=" + this.isLoading + ", isLoggedIn=" + this.isLoggedIn + ", title=" + this.title + ", subtitle=" + this.subtitle + ", username=" + this.username + ", helpButtonVisible=" + this.helpButtonVisible + ", hideSmsUarFallback=" + this.hideSmsUarFallback + ")";
    }

    public ChallengeVerificationViewState(Challenge challenge, boolean z, boolean z2, StringResource title, StringResource subtitle, String str, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.challenge = challenge;
        this.isLoading = z;
        this.isLoggedIn = z2;
        this.title = title;
        this.subtitle = subtitle;
        this.username = str;
        this.helpButtonVisible = z3;
        this.hideSmsUarFallback = z4;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final String getUsername() {
        return this.username;
    }

    public final boolean getHelpButtonVisible() {
        return this.helpButtonVisible;
    }

    public final boolean getHideSmsUarFallback() {
        return this.hideSmsUarFallback;
    }
}

package com.robinhood.android.challenge.verification.backup;

import com.robinhood.models.api.Challenge;
import com.robinhood.models.api.ErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationViewState;", "", ErrorResponse.CHALLENGE, "Lcom/robinhood/models/api/Challenge;", "isLoading", "", "<init>", "(Lcom/robinhood/models/api/Challenge;Z)V", "getChallenge", "()Lcom/robinhood/models/api/Challenge;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BackupCodeVerificationViewState {
    public static final int $stable = 8;
    private final Challenge challenge;
    private final boolean isLoading;

    public static /* synthetic */ BackupCodeVerificationViewState copy$default(BackupCodeVerificationViewState backupCodeVerificationViewState, Challenge challenge, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            challenge = backupCodeVerificationViewState.challenge;
        }
        if ((i & 2) != 0) {
            z = backupCodeVerificationViewState.isLoading;
        }
        return backupCodeVerificationViewState.copy(challenge, z);
    }

    /* renamed from: component1, reason: from getter */
    public final Challenge getChallenge() {
        return this.challenge;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final BackupCodeVerificationViewState copy(Challenge challenge, boolean isLoading) {
        return new BackupCodeVerificationViewState(challenge, isLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupCodeVerificationViewState)) {
            return false;
        }
        BackupCodeVerificationViewState backupCodeVerificationViewState = (BackupCodeVerificationViewState) other;
        return Intrinsics.areEqual(this.challenge, backupCodeVerificationViewState.challenge) && this.isLoading == backupCodeVerificationViewState.isLoading;
    }

    public int hashCode() {
        Challenge challenge = this.challenge;
        return ((challenge == null ? 0 : challenge.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "BackupCodeVerificationViewState(challenge=" + this.challenge + ", isLoading=" + this.isLoading + ")";
    }

    public BackupCodeVerificationViewState(Challenge challenge, boolean z) {
        this.challenge = challenge;
        this.isLoading = z;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }
}

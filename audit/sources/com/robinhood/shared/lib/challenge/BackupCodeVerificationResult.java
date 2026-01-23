package com.robinhood.shared.lib.challenge;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupCodeVerificationResult.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/lib/challenge/BackupCodeVerificationResult;", "Landroid/os/Parcelable;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class BackupCodeVerificationResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BackupCodeVerificationResult> CREATOR = new Creator();
    private final UUID challengeId;

    /* compiled from: BackupCodeVerificationResult.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BackupCodeVerificationResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCodeVerificationResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BackupCodeVerificationResult((UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BackupCodeVerificationResult[] newArray(int i) {
            return new BackupCodeVerificationResult[i];
        }
    }

    public static /* synthetic */ BackupCodeVerificationResult copy$default(BackupCodeVerificationResult backupCodeVerificationResult, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = backupCodeVerificationResult.challengeId;
        }
        return backupCodeVerificationResult.copy(uuid);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getChallengeId() {
        return this.challengeId;
    }

    public final BackupCodeVerificationResult copy(UUID challengeId) {
        return new BackupCodeVerificationResult(challengeId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BackupCodeVerificationResult) && Intrinsics.areEqual(this.challengeId, ((BackupCodeVerificationResult) other).challengeId);
    }

    public int hashCode() {
        UUID uuid = this.challengeId;
        if (uuid == null) {
            return 0;
        }
        return uuid.hashCode();
    }

    public String toString() {
        return "BackupCodeVerificationResult(challengeId=" + this.challengeId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.challengeId);
    }

    public BackupCodeVerificationResult(UUID uuid) {
        this.challengeId = uuid;
    }

    public final UUID getChallengeId() {
        return this.challengeId;
    }
}

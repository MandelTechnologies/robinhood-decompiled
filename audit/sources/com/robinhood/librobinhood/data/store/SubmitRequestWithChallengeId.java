package com.robinhood.librobinhood.data.store;

import com.robinhood.android.challenge.ChallengeResponseActivity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SubmitRequestWithChallengeId;", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "withdrawalId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getChallengeId", "()Ljava/util/UUID;", "getWithdrawalId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class SubmitRequestWithChallengeId {
    private final UUID challengeId;
    private final UUID withdrawalId;

    public static /* synthetic */ SubmitRequestWithChallengeId copy$default(SubmitRequestWithChallengeId submitRequestWithChallengeId, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = submitRequestWithChallengeId.challengeId;
        }
        if ((i & 2) != 0) {
            uuid2 = submitRequestWithChallengeId.withdrawalId;
        }
        return submitRequestWithChallengeId.copy(uuid, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }

    public final SubmitRequestWithChallengeId copy(UUID challengeId, UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        return new SubmitRequestWithChallengeId(challengeId, withdrawalId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitRequestWithChallengeId)) {
            return false;
        }
        SubmitRequestWithChallengeId submitRequestWithChallengeId = (SubmitRequestWithChallengeId) other;
        return Intrinsics.areEqual(this.challengeId, submitRequestWithChallengeId.challengeId) && Intrinsics.areEqual(this.withdrawalId, submitRequestWithChallengeId.withdrawalId);
    }

    public int hashCode() {
        UUID uuid = this.challengeId;
        return ((uuid == null ? 0 : uuid.hashCode()) * 31) + this.withdrawalId.hashCode();
    }

    public String toString() {
        return "SubmitRequestWithChallengeId(challengeId=" + this.challengeId + ", withdrawalId=" + this.withdrawalId + ")";
    }

    public SubmitRequestWithChallengeId(UUID uuid, UUID withdrawalId) {
        Intrinsics.checkNotNullParameter(withdrawalId, "withdrawalId");
        this.challengeId = uuid;
        this.withdrawalId = withdrawalId;
    }

    public /* synthetic */ SubmitRequestWithChallengeId(UUID uuid, UUID uuid2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uuid, uuid2);
    }

    public final UUID getChallengeId() {
        return this.challengeId;
    }

    public final UUID getWithdrawalId() {
        return this.withdrawalId;
    }
}

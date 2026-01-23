package com.robinhood.android.transfers.ach.util;

import com.robinhood.models.p320db.TransferDirection;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferData.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/util/TransferData;", "Ljava/io/Serializable;", "achRelationshipId", "Ljava/util/UUID;", "amount", "Ljava/math/BigDecimal;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "<init>", "(Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/TransferDirection;)V", "getAchRelationshipId", "()Ljava/util/UUID;", "getAmount", "()Ljava/math/BigDecimal;", "getDirection", "()Lcom/robinhood/models/db/TransferDirection;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TransferData implements Serializable {
    public static final int $stable = 8;
    private final UUID achRelationshipId;
    private final BigDecimal amount;
    private final TransferDirection direction;

    public static /* synthetic */ TransferData copy$default(TransferData transferData, UUID uuid, BigDecimal bigDecimal, TransferDirection transferDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = transferData.achRelationshipId;
        }
        if ((i & 2) != 0) {
            bigDecimal = transferData.amount;
        }
        if ((i & 4) != 0) {
            transferDirection = transferData.direction;
        }
        return transferData.copy(uuid, bigDecimal, transferDirection);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferDirection getDirection() {
        return this.direction;
    }

    public final TransferData copy(UUID achRelationshipId, BigDecimal amount, TransferDirection direction) {
        Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new TransferData(achRelationshipId, amount, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) other;
        return Intrinsics.areEqual(this.achRelationshipId, transferData.achRelationshipId) && Intrinsics.areEqual(this.amount, transferData.amount) && this.direction == transferData.direction;
    }

    public int hashCode() {
        return (((this.achRelationshipId.hashCode() * 31) + this.amount.hashCode()) * 31) + this.direction.hashCode();
    }

    public String toString() {
        return "TransferData(achRelationshipId=" + this.achRelationshipId + ", amount=" + this.amount + ", direction=" + this.direction + ")";
    }

    public TransferData(UUID achRelationshipId, BigDecimal amount, TransferDirection direction) {
        Intrinsics.checkNotNullParameter(achRelationshipId, "achRelationshipId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.achRelationshipId = achRelationshipId;
        this.amount = amount;
        this.direction = direction;
    }

    public final UUID getAchRelationshipId() {
        return this.achRelationshipId;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final TransferDirection getDirection() {
        return this.direction;
    }
}

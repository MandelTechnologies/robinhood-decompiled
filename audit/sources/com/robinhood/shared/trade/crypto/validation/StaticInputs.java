package com.robinhood.shared.trade.crypto.validation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StaticInputs.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/validation/StaticInputs;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "clientRefId", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getClientRefId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StaticInputs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StaticInputs> CREATOR = new Creator();
    private final UUID clientRefId;
    private final UUID currencyPairId;

    /* compiled from: StaticInputs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<StaticInputs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticInputs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StaticInputs((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StaticInputs[] newArray(int i) {
            return new StaticInputs[i];
        }
    }

    public static /* synthetic */ StaticInputs copy$default(StaticInputs staticInputs, UUID uuid, UUID uuid2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = staticInputs.currencyPairId;
        }
        if ((i & 2) != 0) {
            uuid2 = staticInputs.clientRefId;
        }
        return staticInputs.copy(uuid, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getClientRefId() {
        return this.clientRefId;
    }

    public final StaticInputs copy(UUID currencyPairId, UUID clientRefId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(clientRefId, "clientRefId");
        return new StaticInputs(currencyPairId, clientRefId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticInputs)) {
            return false;
        }
        StaticInputs staticInputs = (StaticInputs) other;
        return Intrinsics.areEqual(this.currencyPairId, staticInputs.currencyPairId) && Intrinsics.areEqual(this.clientRefId, staticInputs.clientRefId);
    }

    public int hashCode() {
        return (this.currencyPairId.hashCode() * 31) + this.clientRefId.hashCode();
    }

    public String toString() {
        return "StaticInputs(currencyPairId=" + this.currencyPairId + ", clientRefId=" + this.clientRefId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.currencyPairId);
        dest.writeSerializable(this.clientRefId);
    }

    public StaticInputs(UUID currencyPairId, UUID clientRefId) {
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(clientRefId, "clientRefId");
        this.currencyPairId = currencyPairId;
        this.clientRefId = clientRefId;
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final UUID getClientRefId() {
        return this.clientRefId;
    }
}

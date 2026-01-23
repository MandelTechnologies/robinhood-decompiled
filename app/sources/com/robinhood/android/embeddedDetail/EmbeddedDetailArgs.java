package com.robinhood.android.embeddedDetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.recurring.models.api.ApiAssetType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedDetailArgs.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/embeddedDetail/EmbeddedDetailArgs;", "Landroid/os/Parcelable;", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "assetId", "Ljava/util/UUID;", "inBasket", "", "basketFull", "<init>", "(Lcom/robinhood/recurring/models/api/ApiAssetType;Ljava/util/UUID;ZZ)V", "getAssetType", "()Lcom/robinhood/recurring/models/api/ApiAssetType;", "getAssetId", "()Ljava/util/UUID;", "getInBasket", "()Z", "getBasketFull", "isCrypto", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-embedded-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EmbeddedDetailArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EmbeddedDetailArgs> CREATOR = new Creator();
    private final UUID assetId;
    private final ApiAssetType assetType;
    private final boolean basketFull;
    private final boolean inBasket;
    private final boolean isCrypto;

    /* compiled from: EmbeddedDetailArgs.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedDetailArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedDetailArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmbeddedDetailArgs(ApiAssetType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmbeddedDetailArgs[] newArray(int i) {
            return new EmbeddedDetailArgs[i];
        }
    }

    public static /* synthetic */ EmbeddedDetailArgs copy$default(EmbeddedDetailArgs embeddedDetailArgs, ApiAssetType apiAssetType, UUID uuid, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAssetType = embeddedDetailArgs.assetType;
        }
        if ((i & 2) != 0) {
            uuid = embeddedDetailArgs.assetId;
        }
        if ((i & 4) != 0) {
            z = embeddedDetailArgs.inBasket;
        }
        if ((i & 8) != 0) {
            z2 = embeddedDetailArgs.basketFull;
        }
        return embeddedDetailArgs.copy(apiAssetType, uuid, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    /* renamed from: component2, reason: from getter */
    public final UUID getAssetId() {
        return this.assetId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInBasket() {
        return this.inBasket;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBasketFull() {
        return this.basketFull;
    }

    public final EmbeddedDetailArgs copy(ApiAssetType assetType, UUID assetId, boolean inBasket, boolean basketFull) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        return new EmbeddedDetailArgs(assetType, assetId, inBasket, basketFull);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedDetailArgs)) {
            return false;
        }
        EmbeddedDetailArgs embeddedDetailArgs = (EmbeddedDetailArgs) other;
        return this.assetType == embeddedDetailArgs.assetType && Intrinsics.areEqual(this.assetId, embeddedDetailArgs.assetId) && this.inBasket == embeddedDetailArgs.inBasket && this.basketFull == embeddedDetailArgs.basketFull;
    }

    public int hashCode() {
        return (((((this.assetType.hashCode() * 31) + this.assetId.hashCode()) * 31) + Boolean.hashCode(this.inBasket)) * 31) + Boolean.hashCode(this.basketFull);
    }

    public String toString() {
        return "EmbeddedDetailArgs(assetType=" + this.assetType + ", assetId=" + this.assetId + ", inBasket=" + this.inBasket + ", basketFull=" + this.basketFull + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetType.name());
        dest.writeSerializable(this.assetId);
        dest.writeInt(this.inBasket ? 1 : 0);
        dest.writeInt(this.basketFull ? 1 : 0);
    }

    public EmbeddedDetailArgs(ApiAssetType assetType, UUID assetId, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        this.assetType = assetType;
        this.assetId = assetId;
        this.inBasket = z;
        this.basketFull = z2;
        this.isCrypto = assetType == ApiAssetType.CRYPTO;
    }

    public final ApiAssetType getAssetType() {
        return this.assetType;
    }

    public final UUID getAssetId() {
        return this.assetId;
    }

    public final boolean getInBasket() {
        return this.inBasket;
    }

    public final boolean getBasketFull() {
        return this.basketFull;
    }

    /* renamed from: isCrypto, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }
}

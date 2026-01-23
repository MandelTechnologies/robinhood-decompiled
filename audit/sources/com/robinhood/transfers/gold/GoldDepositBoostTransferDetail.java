package com.robinhood.transfers.gold;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldDepositBoostTransferDetail.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, m3636d2 = {"Lcom/robinhood/transfers/gold/GoldDepositBoostTransferDetail;", "Landroid/os/Parcelable;", "badgeText", "", "amountTitle", "amountText", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "detailText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getBadgeText", "()Ljava/lang/String;", "getAmountTitle", "getAmountText", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getDetailText", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class GoldDepositBoostTransferDetail implements Parcelable {
    public static final Parcelable.Creator<GoldDepositBoostTransferDetail> CREATOR = new Creator();
    private final String amountText;
    private final String amountTitle;
    private final String badgeText;
    private final String detailText;
    private final ServerToBentoAssetMapper2 iconAsset;

    /* compiled from: GoldDepositBoostTransferDetail.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldDepositBoostTransferDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostTransferDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldDepositBoostTransferDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ServerToBentoAssetMapper2.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostTransferDetail[] newArray(int i) {
            return new GoldDepositBoostTransferDetail[i];
        }
    }

    public static /* synthetic */ GoldDepositBoostTransferDetail copy$default(GoldDepositBoostTransferDetail goldDepositBoostTransferDetail, String str, String str2, String str3, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldDepositBoostTransferDetail.badgeText;
        }
        if ((i & 2) != 0) {
            str2 = goldDepositBoostTransferDetail.amountTitle;
        }
        if ((i & 4) != 0) {
            str3 = goldDepositBoostTransferDetail.amountText;
        }
        if ((i & 8) != 0) {
            serverToBentoAssetMapper2 = goldDepositBoostTransferDetail.iconAsset;
        }
        if ((i & 16) != 0) {
            str4 = goldDepositBoostTransferDetail.detailText;
        }
        String str5 = str4;
        String str6 = str3;
        return goldDepositBoostTransferDetail.copy(str, str2, str6, serverToBentoAssetMapper2, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBadgeText() {
        return this.badgeText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountTitle() {
        return this.amountTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmountText() {
        return this.amountText;
    }

    /* renamed from: component4, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDetailText() {
        return this.detailText;
    }

    public final GoldDepositBoostTransferDetail copy(String badgeText, String amountTitle, String amountText, ServerToBentoAssetMapper2 iconAsset, String detailText) {
        return new GoldDepositBoostTransferDetail(badgeText, amountTitle, amountText, iconAsset, detailText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDepositBoostTransferDetail)) {
            return false;
        }
        GoldDepositBoostTransferDetail goldDepositBoostTransferDetail = (GoldDepositBoostTransferDetail) other;
        return Intrinsics.areEqual(this.badgeText, goldDepositBoostTransferDetail.badgeText) && Intrinsics.areEqual(this.amountTitle, goldDepositBoostTransferDetail.amountTitle) && Intrinsics.areEqual(this.amountText, goldDepositBoostTransferDetail.amountText) && this.iconAsset == goldDepositBoostTransferDetail.iconAsset && Intrinsics.areEqual(this.detailText, goldDepositBoostTransferDetail.detailText);
    }

    public int hashCode() {
        String str = this.badgeText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amountTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amountText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconAsset;
        int iHashCode4 = (iHashCode3 + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        String str4 = this.detailText;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "GoldDepositBoostTransferDetail(badgeText=" + this.badgeText + ", amountTitle=" + this.amountTitle + ", amountText=" + this.amountText + ", iconAsset=" + this.iconAsset + ", detailText=" + this.detailText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.badgeText);
        dest.writeString(this.amountTitle);
        dest.writeString(this.amountText);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconAsset;
        if (serverToBentoAssetMapper2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverToBentoAssetMapper2.name());
        }
        dest.writeString(this.detailText);
    }

    public GoldDepositBoostTransferDetail(String str, String str2, String str3, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str4) {
        this.badgeText = str;
        this.amountTitle = str2;
        this.amountText = str3;
        this.iconAsset = serverToBentoAssetMapper2;
        this.detailText = str4;
    }

    public final String getBadgeText() {
        return this.badgeText;
    }

    public final String getAmountTitle() {
        return this.amountTitle;
    }

    public final String getAmountText() {
        return this.amountText;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    public final String getDetailText() {
        return this.detailText;
    }
}

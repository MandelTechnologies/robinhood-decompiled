package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDepositBoostHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutInfo;", "Landroid/os/Parcelable;", InquiryField.DateField.TYPE, "", "amount", "assetPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "getAmount", "getAssetPath", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldDepositBoostHubPayoutInfo implements Parcelable {
    public static final Parcelable.Creator<GoldDepositBoostHubPayoutInfo> CREATOR = new Creator();
    private final String amount;
    private final String assetPath;
    private final String date;

    /* compiled from: ApiDepositBoostHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldDepositBoostHubPayoutInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostHubPayoutInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldDepositBoostHubPayoutInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostHubPayoutInfo[] newArray(int i) {
            return new GoldDepositBoostHubPayoutInfo[i];
        }
    }

    public static /* synthetic */ GoldDepositBoostHubPayoutInfo copy$default(GoldDepositBoostHubPayoutInfo goldDepositBoostHubPayoutInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldDepositBoostHubPayoutInfo.date;
        }
        if ((i & 2) != 0) {
            str2 = goldDepositBoostHubPayoutInfo.amount;
        }
        if ((i & 4) != 0) {
            str3 = goldDepositBoostHubPayoutInfo.assetPath;
        }
        return goldDepositBoostHubPayoutInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAssetPath() {
        return this.assetPath;
    }

    public final GoldDepositBoostHubPayoutInfo copy(String date, String amount, @Json(name = "asset_path") String assetPath) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        return new GoldDepositBoostHubPayoutInfo(date, amount, assetPath);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDepositBoostHubPayoutInfo)) {
            return false;
        }
        GoldDepositBoostHubPayoutInfo goldDepositBoostHubPayoutInfo = (GoldDepositBoostHubPayoutInfo) other;
        return Intrinsics.areEqual(this.date, goldDepositBoostHubPayoutInfo.date) && Intrinsics.areEqual(this.amount, goldDepositBoostHubPayoutInfo.amount) && Intrinsics.areEqual(this.assetPath, goldDepositBoostHubPayoutInfo.assetPath);
    }

    public int hashCode() {
        return (((this.date.hashCode() * 31) + this.amount.hashCode()) * 31) + this.assetPath.hashCode();
    }

    public String toString() {
        return "GoldDepositBoostHubPayoutInfo(date=" + this.date + ", amount=" + this.amount + ", assetPath=" + this.assetPath + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.date);
        dest.writeString(this.amount);
        dest.writeString(this.assetPath);
    }

    public GoldDepositBoostHubPayoutInfo(String date, String amount, @Json(name = "asset_path") String assetPath) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        this.date = date;
        this.amount = amount;
        this.assetPath = assetPath;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getAssetPath() {
        return this.assetPath;
    }
}

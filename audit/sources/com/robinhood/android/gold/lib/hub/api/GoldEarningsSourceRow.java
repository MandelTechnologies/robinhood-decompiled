package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDepositBoostHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003JU\u0010\u001f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldEarningsSourceRow;", "Landroid/os/Parcelable;", "assetPath", "", "description", "amount", "pendingEarningsText", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "type", "trailingIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAssetPath", "()Ljava/lang/String;", "getDescription", "getAmount", "getPendingEarningsText", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getType", "getTrailingIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldEarningsSourceRow implements Parcelable {
    public static final Parcelable.Creator<GoldEarningsSourceRow> CREATOR = new Creator();
    private final GenericAction action;
    private final String amount;
    private final String assetPath;
    private final String description;
    private final String pendingEarningsText;
    private final ServerToBentoAssetMapper2 trailingIcon;
    private final String type;

    /* compiled from: ApiDepositBoostHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldEarningsSourceRow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsSourceRow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldEarningsSourceRow(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (GenericAction) parcel.readParcelable(GoldEarningsSourceRow.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ServerToBentoAssetMapper2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldEarningsSourceRow[] newArray(int i) {
            return new GoldEarningsSourceRow[i];
        }
    }

    public static /* synthetic */ GoldEarningsSourceRow copy$default(GoldEarningsSourceRow goldEarningsSourceRow, String str, String str2, String str3, String str4, GenericAction genericAction, String str5, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldEarningsSourceRow.assetPath;
        }
        if ((i & 2) != 0) {
            str2 = goldEarningsSourceRow.description;
        }
        if ((i & 4) != 0) {
            str3 = goldEarningsSourceRow.amount;
        }
        if ((i & 8) != 0) {
            str4 = goldEarningsSourceRow.pendingEarningsText;
        }
        if ((i & 16) != 0) {
            genericAction = goldEarningsSourceRow.action;
        }
        if ((i & 32) != 0) {
            str5 = goldEarningsSourceRow.type;
        }
        if ((i & 64) != 0) {
            serverToBentoAssetMapper2 = goldEarningsSourceRow.trailingIcon;
        }
        String str6 = str5;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        GenericAction genericAction2 = genericAction;
        String str7 = str3;
        return goldEarningsSourceRow.copy(str, str2, str7, str4, genericAction2, str6, serverToBentoAssetMapper22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAssetPath() {
        return this.assetPath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPendingEarningsText() {
        return this.pendingEarningsText;
    }

    /* renamed from: component5, reason: from getter */
    public final GenericAction getAction() {
        return this.action;
    }

    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component7, reason: from getter */
    public final ServerToBentoAssetMapper2 getTrailingIcon() {
        return this.trailingIcon;
    }

    public final GoldEarningsSourceRow copy(@Json(name = "asset_path") String assetPath, String description, String amount, @Json(name = "pending_earnings_text") String pendingEarningsText, GenericAction action, String type2, @Json(name = "trailing_icon") ServerToBentoAssetMapper2 trailingIcon) {
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new GoldEarningsSourceRow(assetPath, description, amount, pendingEarningsText, action, type2, trailingIcon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldEarningsSourceRow)) {
            return false;
        }
        GoldEarningsSourceRow goldEarningsSourceRow = (GoldEarningsSourceRow) other;
        return Intrinsics.areEqual(this.assetPath, goldEarningsSourceRow.assetPath) && Intrinsics.areEqual(this.description, goldEarningsSourceRow.description) && Intrinsics.areEqual(this.amount, goldEarningsSourceRow.amount) && Intrinsics.areEqual(this.pendingEarningsText, goldEarningsSourceRow.pendingEarningsText) && Intrinsics.areEqual(this.action, goldEarningsSourceRow.action) && Intrinsics.areEqual(this.type, goldEarningsSourceRow.type) && this.trailingIcon == goldEarningsSourceRow.trailingIcon;
    }

    public int hashCode() {
        int iHashCode = ((((this.assetPath.hashCode() * 31) + this.description.hashCode()) * 31) + this.amount.hashCode()) * 31;
        String str = this.pendingEarningsText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GenericAction genericAction = this.action;
        int iHashCode3 = (((iHashCode2 + (genericAction == null ? 0 : genericAction.hashCode())) * 31) + this.type.hashCode()) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.trailingIcon;
        return iHashCode3 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
    }

    public String toString() {
        return "GoldEarningsSourceRow(assetPath=" + this.assetPath + ", description=" + this.description + ", amount=" + this.amount + ", pendingEarningsText=" + this.pendingEarningsText + ", action=" + this.action + ", type=" + this.type + ", trailingIcon=" + this.trailingIcon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetPath);
        dest.writeString(this.description);
        dest.writeString(this.amount);
        dest.writeString(this.pendingEarningsText);
        dest.writeParcelable(this.action, flags);
        dest.writeString(this.type);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.trailingIcon;
        if (serverToBentoAssetMapper2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverToBentoAssetMapper2.name());
        }
    }

    public GoldEarningsSourceRow(@Json(name = "asset_path") String assetPath, String description, String amount, @Json(name = "pending_earnings_text") String str, GenericAction genericAction, String type2, @Json(name = "trailing_icon") ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        Intrinsics.checkNotNullParameter(assetPath, "assetPath");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.assetPath = assetPath;
        this.description = description;
        this.amount = amount;
        this.pendingEarningsText = str;
        this.action = genericAction;
        this.type = type2;
        this.trailingIcon = serverToBentoAssetMapper2;
    }

    public final String getAssetPath() {
        return this.assetPath;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getPendingEarningsText() {
        return this.pendingEarningsText;
    }

    public final GenericAction getAction() {
        return this.action;
    }

    public final String getType() {
        return this.type;
    }

    public final ServerToBentoAssetMapper2 getTrailingIcon() {
        return this.trailingIcon;
    }
}

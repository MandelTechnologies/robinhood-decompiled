package com.robinhood.transfers.gold;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiGoldDepositBoostTransferDetail.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006)"}, m3636d2 = {"Lcom/robinhood/transfers/gold/ApiGoldDepositBoostTransferDetail;", "Landroid/os/Parcelable;", "badge_text", "", "amount_title", "amount_text", "icon", "detail_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBadge_text", "()Ljava/lang/String;", "getAmount_title", "getAmount_text", "getIcon", "getDetail_text", "icon_asset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getIcon_asset$annotations", "()V", "getIcon_asset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-gold_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final /* data */ class ApiGoldDepositBoostTransferDetail implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDepositBoostTransferDetail> CREATOR = new Creator();
    private final String amount_text;
    private final String amount_title;
    private final String badge_text;
    private final String detail_text;
    private final String icon;

    /* compiled from: ApiGoldDepositBoostTransferDetail.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDepositBoostTransferDetail> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostTransferDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldDepositBoostTransferDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostTransferDetail[] newArray(int i) {
            return new ApiGoldDepositBoostTransferDetail[i];
        }
    }

    public static /* synthetic */ ApiGoldDepositBoostTransferDetail copy$default(ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldDepositBoostTransferDetail.badge_text;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldDepositBoostTransferDetail.amount_title;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldDepositBoostTransferDetail.amount_text;
        }
        if ((i & 8) != 0) {
            str4 = apiGoldDepositBoostTransferDetail.icon;
        }
        if ((i & 16) != 0) {
            str5 = apiGoldDepositBoostTransferDetail.detail_text;
        }
        String str6 = str5;
        String str7 = str3;
        return apiGoldDepositBoostTransferDetail.copy(str, str2, str7, str4, str6);
    }

    public static /* synthetic */ void getIcon_asset$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getBadge_text() {
        return this.badge_text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount_title() {
        return this.amount_title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAmount_text() {
        return this.amount_text;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDetail_text() {
        return this.detail_text;
    }

    public final ApiGoldDepositBoostTransferDetail copy(String badge_text, String amount_title, String amount_text, String icon, String detail_text) {
        return new ApiGoldDepositBoostTransferDetail(badge_text, amount_title, amount_text, icon, detail_text);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDepositBoostTransferDetail)) {
            return false;
        }
        ApiGoldDepositBoostTransferDetail apiGoldDepositBoostTransferDetail = (ApiGoldDepositBoostTransferDetail) other;
        return Intrinsics.areEqual(this.badge_text, apiGoldDepositBoostTransferDetail.badge_text) && Intrinsics.areEqual(this.amount_title, apiGoldDepositBoostTransferDetail.amount_title) && Intrinsics.areEqual(this.amount_text, apiGoldDepositBoostTransferDetail.amount_text) && Intrinsics.areEqual(this.icon, apiGoldDepositBoostTransferDetail.icon) && Intrinsics.areEqual(this.detail_text, apiGoldDepositBoostTransferDetail.detail_text);
    }

    public int hashCode() {
        String str = this.badge_text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.amount_title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount_text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.detail_text;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldDepositBoostTransferDetail(badge_text=" + this.badge_text + ", amount_title=" + this.amount_title + ", amount_text=" + this.amount_text + ", icon=" + this.icon + ", detail_text=" + this.detail_text + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.badge_text);
        dest.writeString(this.amount_title);
        dest.writeString(this.amount_text);
        dest.writeString(this.icon);
        dest.writeString(this.detail_text);
    }

    public ApiGoldDepositBoostTransferDetail(String str, String str2, String str3, String str4, String str5) {
        this.badge_text = str;
        this.amount_title = str2;
        this.amount_text = str3;
        this.icon = str4;
        this.detail_text = str5;
    }

    public final String getBadge_text() {
        return this.badge_text;
    }

    public final String getAmount_title() {
        return this.amount_title;
    }

    public final String getAmount_text() {
        return this.amount_text;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getDetail_text() {
        return this.detail_text;
    }

    public final ServerToBentoAssetMapper2 getIcon_asset() {
        String str = this.icon;
        if (str != null) {
            return ServerToBentoAssetMapper2.INSTANCE.fromServerValue(str);
        }
        return null;
    }
}

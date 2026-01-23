package com.robinhood.android.api.gold.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldDepositBoostHistoryDetailItem.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/api/gold/hub/ApiGoldDepositBoostHistoryDetailItem;", "Landroid/os/Parcelable;", "title", "", "value", "value_icon", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getValue_icon", "getDescription", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-api-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ApiGoldDepositBoostHistoryDetailItem implements Parcelable {
    public static final Parcelable.Creator<ApiGoldDepositBoostHistoryDetailItem> CREATOR = new Creator();
    private final String description;
    private final String title;
    private final String value;
    private final String value_icon;

    /* compiled from: ApiGoldDepositBoostHistoryDetailItem.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldDepositBoostHistoryDetailItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostHistoryDetailItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldDepositBoostHistoryDetailItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldDepositBoostHistoryDetailItem[] newArray(int i) {
            return new ApiGoldDepositBoostHistoryDetailItem[i];
        }
    }

    public static /* synthetic */ ApiGoldDepositBoostHistoryDetailItem copy$default(ApiGoldDepositBoostHistoryDetailItem apiGoldDepositBoostHistoryDetailItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldDepositBoostHistoryDetailItem.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldDepositBoostHistoryDetailItem.value;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldDepositBoostHistoryDetailItem.value_icon;
        }
        if ((i & 8) != 0) {
            str4 = apiGoldDepositBoostHistoryDetailItem.description;
        }
        return apiGoldDepositBoostHistoryDetailItem.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue_icon() {
        return this.value_icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final ApiGoldDepositBoostHistoryDetailItem copy(String title, String value, String value_icon, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ApiGoldDepositBoostHistoryDetailItem(title, value, value_icon, description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldDepositBoostHistoryDetailItem)) {
            return false;
        }
        ApiGoldDepositBoostHistoryDetailItem apiGoldDepositBoostHistoryDetailItem = (ApiGoldDepositBoostHistoryDetailItem) other;
        return Intrinsics.areEqual(this.title, apiGoldDepositBoostHistoryDetailItem.title) && Intrinsics.areEqual(this.value, apiGoldDepositBoostHistoryDetailItem.value) && Intrinsics.areEqual(this.value_icon, apiGoldDepositBoostHistoryDetailItem.value_icon) && Intrinsics.areEqual(this.description, apiGoldDepositBoostHistoryDetailItem.description);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.value.hashCode()) * 31;
        String str = this.value_icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldDepositBoostHistoryDetailItem(title=" + this.title + ", value=" + this.value + ", value_icon=" + this.value_icon + ", description=" + this.description + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.value);
        dest.writeString(this.value_icon);
        dest.writeString(this.description);
    }

    public ApiGoldDepositBoostHistoryDetailItem(String title, String value, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.value = value;
        this.value_icon = str;
        this.description = str2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getValue_icon() {
        return this.value_icon;
    }

    public final String getDescription() {
        return this.description;
    }
}

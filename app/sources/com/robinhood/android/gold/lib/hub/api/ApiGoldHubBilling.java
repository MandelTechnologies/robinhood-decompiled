package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBilling;", "Landroid/os/Parcelable;", "title", "", "value", "subtitle", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getSubtitle", "getAction", "()Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubBilling implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubBilling> CREATOR = new Creator();
    private final GoldHubAction action;
    private final String subtitle;
    private final String title;
    private final String value;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubBilling> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBilling createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldHubBilling(parcel.readString(), parcel.readString(), parcel.readString(), (GoldHubAction) parcel.readParcelable(ApiGoldHubBilling.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBilling[] newArray(int i) {
            return new ApiGoldHubBilling[i];
        }
    }

    public static /* synthetic */ ApiGoldHubBilling copy$default(ApiGoldHubBilling apiGoldHubBilling, String str, String str2, String str3, GoldHubAction goldHubAction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubBilling.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubBilling.value;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldHubBilling.subtitle;
        }
        if ((i & 8) != 0) {
            goldHubAction = apiGoldHubBilling.action;
        }
        return apiGoldHubBilling.copy(str, str2, str3, goldHubAction);
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
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final GoldHubAction getAction() {
        return this.action;
    }

    public final ApiGoldHubBilling copy(String title, String value, String subtitle, GoldHubAction action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        return new ApiGoldHubBilling(title, value, subtitle, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubBilling)) {
            return false;
        }
        ApiGoldHubBilling apiGoldHubBilling = (ApiGoldHubBilling) other;
        return Intrinsics.areEqual(this.title, apiGoldHubBilling.title) && Intrinsics.areEqual(this.value, apiGoldHubBilling.value) && Intrinsics.areEqual(this.subtitle, apiGoldHubBilling.subtitle) && Intrinsics.areEqual(this.action, apiGoldHubBilling.action);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + this.value.hashCode()) * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GoldHubAction goldHubAction = this.action;
        return iHashCode2 + (goldHubAction != null ? goldHubAction.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHubBilling(title=" + this.title + ", value=" + this.value + ", subtitle=" + this.subtitle + ", action=" + this.action + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.value);
        dest.writeString(this.subtitle);
        dest.writeParcelable(this.action, flags);
    }

    public ApiGoldHubBilling(String title, String value, String str, GoldHubAction goldHubAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = title;
        this.value = value;
        this.subtitle = str;
        this.action = goldHubAction;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final GoldHubAction getAction() {
        return this.action;
    }
}

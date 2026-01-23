package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingSection;", "Landroid/os/Parcelable;", "title", "", "subtitleMarkdown", "membershipLeft", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBilling;", "membershipRight", "billings", "", "goldHubBillingMethod", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingMethod;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBilling;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBilling;Ljava/util/List;Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingMethod;)V", "getTitle", "()Ljava/lang/String;", "getSubtitleMarkdown", "getMembershipLeft", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBilling;", "getMembershipRight", "getBillings", "()Ljava/util/List;", "getGoldHubBillingMethod", "()Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBillingMethod;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubBillingSection implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubBillingSection> CREATOR = new Creator();
    private final List<ApiGoldHubBilling> billings;
    private final ApiGoldHubBillingMethod goldHubBillingMethod;
    private final ApiGoldHubBilling membershipLeft;
    private final ApiGoldHubBilling membershipRight;
    private final String subtitleMarkdown;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubBillingSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBillingSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ApiGoldHubBilling apiGoldHubBillingCreateFromParcel = parcel.readInt() == 0 ? null : ApiGoldHubBilling.CREATOR.createFromParcel(parcel);
            ApiGoldHubBilling apiGoldHubBillingCreateFromParcel2 = parcel.readInt() == 0 ? null : ApiGoldHubBilling.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ApiGoldHubBilling.CREATOR.createFromParcel(parcel));
            }
            return new ApiGoldHubBillingSection(string2, string3, apiGoldHubBillingCreateFromParcel, apiGoldHubBillingCreateFromParcel2, arrayList, parcel.readInt() != 0 ? ApiGoldHubBillingMethod.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBillingSection[] newArray(int i) {
            return new ApiGoldHubBillingSection[i];
        }
    }

    public static /* synthetic */ ApiGoldHubBillingSection copy$default(ApiGoldHubBillingSection apiGoldHubBillingSection, String str, String str2, ApiGoldHubBilling apiGoldHubBilling, ApiGoldHubBilling apiGoldHubBilling2, List list, ApiGoldHubBillingMethod apiGoldHubBillingMethod, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubBillingSection.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubBillingSection.subtitleMarkdown;
        }
        if ((i & 4) != 0) {
            apiGoldHubBilling = apiGoldHubBillingSection.membershipLeft;
        }
        if ((i & 8) != 0) {
            apiGoldHubBilling2 = apiGoldHubBillingSection.membershipRight;
        }
        if ((i & 16) != 0) {
            list = apiGoldHubBillingSection.billings;
        }
        if ((i & 32) != 0) {
            apiGoldHubBillingMethod = apiGoldHubBillingSection.goldHubBillingMethod;
        }
        List list2 = list;
        ApiGoldHubBillingMethod apiGoldHubBillingMethod2 = apiGoldHubBillingMethod;
        return apiGoldHubBillingSection.copy(str, str2, apiGoldHubBilling, apiGoldHubBilling2, list2, apiGoldHubBillingMethod2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    /* renamed from: component3, reason: from getter */
    public final ApiGoldHubBilling getMembershipLeft() {
        return this.membershipLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final ApiGoldHubBilling getMembershipRight() {
        return this.membershipRight;
    }

    public final List<ApiGoldHubBilling> component5() {
        return this.billings;
    }

    /* renamed from: component6, reason: from getter */
    public final ApiGoldHubBillingMethod getGoldHubBillingMethod() {
        return this.goldHubBillingMethod;
    }

    public final ApiGoldHubBillingSection copy(String title, @Json(name = "subtitle_markdown") String subtitleMarkdown, @Json(name = "membership_left") ApiGoldHubBilling membershipLeft, @Json(name = "membership_right") ApiGoldHubBilling membershipRight, List<ApiGoldHubBilling> billings, @Json(name = "gold_hub_billing_method") ApiGoldHubBillingMethod goldHubBillingMethod) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(billings, "billings");
        return new ApiGoldHubBillingSection(title, subtitleMarkdown, membershipLeft, membershipRight, billings, goldHubBillingMethod);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubBillingSection)) {
            return false;
        }
        ApiGoldHubBillingSection apiGoldHubBillingSection = (ApiGoldHubBillingSection) other;
        return Intrinsics.areEqual(this.title, apiGoldHubBillingSection.title) && Intrinsics.areEqual(this.subtitleMarkdown, apiGoldHubBillingSection.subtitleMarkdown) && Intrinsics.areEqual(this.membershipLeft, apiGoldHubBillingSection.membershipLeft) && Intrinsics.areEqual(this.membershipRight, apiGoldHubBillingSection.membershipRight) && Intrinsics.areEqual(this.billings, apiGoldHubBillingSection.billings) && Intrinsics.areEqual(this.goldHubBillingMethod, apiGoldHubBillingSection.goldHubBillingMethod);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitleMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ApiGoldHubBilling apiGoldHubBilling = this.membershipLeft;
        int iHashCode3 = (iHashCode2 + (apiGoldHubBilling == null ? 0 : apiGoldHubBilling.hashCode())) * 31;
        ApiGoldHubBilling apiGoldHubBilling2 = this.membershipRight;
        int iHashCode4 = (((iHashCode3 + (apiGoldHubBilling2 == null ? 0 : apiGoldHubBilling2.hashCode())) * 31) + this.billings.hashCode()) * 31;
        ApiGoldHubBillingMethod apiGoldHubBillingMethod = this.goldHubBillingMethod;
        return iHashCode4 + (apiGoldHubBillingMethod != null ? apiGoldHubBillingMethod.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHubBillingSection(title=" + this.title + ", subtitleMarkdown=" + this.subtitleMarkdown + ", membershipLeft=" + this.membershipLeft + ", membershipRight=" + this.membershipRight + ", billings=" + this.billings + ", goldHubBillingMethod=" + this.goldHubBillingMethod + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitleMarkdown);
        ApiGoldHubBilling apiGoldHubBilling = this.membershipLeft;
        if (apiGoldHubBilling == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBilling.writeToParcel(dest, flags);
        }
        ApiGoldHubBilling apiGoldHubBilling2 = this.membershipRight;
        if (apiGoldHubBilling2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBilling2.writeToParcel(dest, flags);
        }
        List<ApiGoldHubBilling> list = this.billings;
        dest.writeInt(list.size());
        Iterator<ApiGoldHubBilling> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        ApiGoldHubBillingMethod apiGoldHubBillingMethod = this.goldHubBillingMethod;
        if (apiGoldHubBillingMethod == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apiGoldHubBillingMethod.writeToParcel(dest, flags);
        }
    }

    public ApiGoldHubBillingSection(String title, @Json(name = "subtitle_markdown") String str, @Json(name = "membership_left") ApiGoldHubBilling apiGoldHubBilling, @Json(name = "membership_right") ApiGoldHubBilling apiGoldHubBilling2, List<ApiGoldHubBilling> billings, @Json(name = "gold_hub_billing_method") ApiGoldHubBillingMethod apiGoldHubBillingMethod) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(billings, "billings");
        this.title = title;
        this.subtitleMarkdown = str;
        this.membershipLeft = apiGoldHubBilling;
        this.membershipRight = apiGoldHubBilling2;
        this.billings = billings;
        this.goldHubBillingMethod = apiGoldHubBillingMethod;
    }

    public /* synthetic */ ApiGoldHubBillingSection(String str, String str2, ApiGoldHubBilling apiGoldHubBilling, ApiGoldHubBilling apiGoldHubBilling2, List list, ApiGoldHubBillingMethod apiGoldHubBillingMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, apiGoldHubBilling, apiGoldHubBilling2, list, (i & 32) != 0 ? null : apiGoldHubBillingMethod);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitleMarkdown() {
        return this.subtitleMarkdown;
    }

    public final ApiGoldHubBilling getMembershipLeft() {
        return this.membershipLeft;
    }

    public final ApiGoldHubBilling getMembershipRight() {
        return this.membershipRight;
    }

    public final List<ApiGoldHubBilling> getBillings() {
        return this.billings;
    }

    public final ApiGoldHubBillingMethod getGoldHubBillingMethod() {
        return this.goldHubBillingMethod;
    }
}

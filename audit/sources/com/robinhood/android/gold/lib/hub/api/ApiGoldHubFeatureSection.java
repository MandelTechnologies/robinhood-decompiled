package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeatureSection;", "Landroid/os/Parcelable;", "title", "", "subtitle", "inactiveFeatures", "", "Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeature;", "activeFeatures", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getInactiveFeatures", "()Ljava/util/List;", "getActiveFeatures", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubFeatureSection implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubFeatureSection> CREATOR = new Creator();
    private final List<ApiGoldHubFeature> activeFeatures;
    private final List<ApiGoldHubFeature> inactiveFeatures;
    private final String subtitle;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubFeatureSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubFeatureSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ApiGoldHubFeature.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(ApiGoldHubFeature.CREATOR.createFromParcel(parcel));
            }
            return new ApiGoldHubFeatureSection(string2, string3, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubFeatureSection[] newArray(int i) {
            return new ApiGoldHubFeatureSection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiGoldHubFeatureSection copy$default(ApiGoldHubFeatureSection apiGoldHubFeatureSection, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubFeatureSection.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubFeatureSection.subtitle;
        }
        if ((i & 4) != 0) {
            list = apiGoldHubFeatureSection.inactiveFeatures;
        }
        if ((i & 8) != 0) {
            list2 = apiGoldHubFeatureSection.activeFeatures;
        }
        return apiGoldHubFeatureSection.copy(str, str2, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ApiGoldHubFeature> component3() {
        return this.inactiveFeatures;
    }

    public final List<ApiGoldHubFeature> component4() {
        return this.activeFeatures;
    }

    public final ApiGoldHubFeatureSection copy(String title, String subtitle, @Json(name = "inactive_features") List<ApiGoldHubFeature> inactiveFeatures, @Json(name = "active_features") List<ApiGoldHubFeature> activeFeatures) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inactiveFeatures, "inactiveFeatures");
        Intrinsics.checkNotNullParameter(activeFeatures, "activeFeatures");
        return new ApiGoldHubFeatureSection(title, subtitle, inactiveFeatures, activeFeatures);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubFeatureSection)) {
            return false;
        }
        ApiGoldHubFeatureSection apiGoldHubFeatureSection = (ApiGoldHubFeatureSection) other;
        return Intrinsics.areEqual(this.title, apiGoldHubFeatureSection.title) && Intrinsics.areEqual(this.subtitle, apiGoldHubFeatureSection.subtitle) && Intrinsics.areEqual(this.inactiveFeatures, apiGoldHubFeatureSection.inactiveFeatures) && Intrinsics.areEqual(this.activeFeatures, apiGoldHubFeatureSection.activeFeatures);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.inactiveFeatures.hashCode()) * 31) + this.activeFeatures.hashCode();
    }

    public String toString() {
        return "ApiGoldHubFeatureSection(title=" + this.title + ", subtitle=" + this.subtitle + ", inactiveFeatures=" + this.inactiveFeatures + ", activeFeatures=" + this.activeFeatures + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        List<ApiGoldHubFeature> list = this.inactiveFeatures;
        dest.writeInt(list.size());
        Iterator<ApiGoldHubFeature> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<ApiGoldHubFeature> list2 = this.activeFeatures;
        dest.writeInt(list2.size());
        Iterator<ApiGoldHubFeature> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }

    public ApiGoldHubFeatureSection(String title, String str, @Json(name = "inactive_features") List<ApiGoldHubFeature> inactiveFeatures, @Json(name = "active_features") List<ApiGoldHubFeature> activeFeatures) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(inactiveFeatures, "inactiveFeatures");
        Intrinsics.checkNotNullParameter(activeFeatures, "activeFeatures");
        this.title = title;
        this.subtitle = str;
        this.inactiveFeatures = inactiveFeatures;
        this.activeFeatures = activeFeatures;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<ApiGoldHubFeature> getInactiveFeatures() {
        return this.inactiveFeatures;
    }

    public final List<ApiGoldHubFeature> getActiveFeatures() {
        return this.activeFeatures;
    }
}

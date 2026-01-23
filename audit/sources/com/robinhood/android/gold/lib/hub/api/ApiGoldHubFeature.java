package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.serverdriven.experimental.api.GoldHubAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubFeature;", "Landroid/os/Parcelable;", "imagePath", "", "id", "title", "contentMarkdown", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldHubAction;", "deeplink", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "getId", "getTitle", "getContentMarkdown", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "getDeeplink", "getSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubFeature implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubFeature> CREATOR = new Creator();
    private final String contentMarkdown;
    private final TextButton<GoldHubAction> cta;
    private final String deeplink;
    private final String id;
    private final String imagePath;
    private final String subtitle;
    private final String title;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubFeature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubFeature createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldHubFeature(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TextButton) parcel.readParcelable(ApiGoldHubFeature.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubFeature[] newArray(int i) {
            return new ApiGoldHubFeature[i];
        }
    }

    public static /* synthetic */ ApiGoldHubFeature copy$default(ApiGoldHubFeature apiGoldHubFeature, String str, String str2, String str3, String str4, TextButton textButton, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubFeature.imagePath;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubFeature.id;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldHubFeature.title;
        }
        if ((i & 8) != 0) {
            str4 = apiGoldHubFeature.contentMarkdown;
        }
        if ((i & 16) != 0) {
            textButton = apiGoldHubFeature.cta;
        }
        if ((i & 32) != 0) {
            str5 = apiGoldHubFeature.deeplink;
        }
        if ((i & 64) != 0) {
            str6 = apiGoldHubFeature.subtitle;
        }
        String str7 = str5;
        String str8 = str6;
        TextButton textButton2 = textButton;
        String str9 = str3;
        return apiGoldHubFeature.copy(str, str2, str9, str4, textButton2, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }

    public final TextButton<GoldHubAction> component5() {
        return this.cta;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ApiGoldHubFeature copy(@Json(name = "image_path") String imagePath, String id, String title, @Json(name = "content_markdown") String contentMarkdown, TextButton<? extends GoldHubAction> cta, String deeplink, String subtitle) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
        return new ApiGoldHubFeature(imagePath, id, title, contentMarkdown, cta, deeplink, subtitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubFeature)) {
            return false;
        }
        ApiGoldHubFeature apiGoldHubFeature = (ApiGoldHubFeature) other;
        return Intrinsics.areEqual(this.imagePath, apiGoldHubFeature.imagePath) && Intrinsics.areEqual(this.id, apiGoldHubFeature.id) && Intrinsics.areEqual(this.title, apiGoldHubFeature.title) && Intrinsics.areEqual(this.contentMarkdown, apiGoldHubFeature.contentMarkdown) && Intrinsics.areEqual(this.cta, apiGoldHubFeature.cta) && Intrinsics.areEqual(this.deeplink, apiGoldHubFeature.deeplink) && Intrinsics.areEqual(this.subtitle, apiGoldHubFeature.subtitle);
    }

    public int hashCode() {
        int iHashCode = ((((((this.imagePath.hashCode() * 31) + this.id.hashCode()) * 31) + this.title.hashCode()) * 31) + this.contentMarkdown.hashCode()) * 31;
        TextButton<GoldHubAction> textButton = this.cta;
        int iHashCode2 = (iHashCode + (textButton == null ? 0 : textButton.hashCode())) * 31;
        String str = this.deeplink;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHubFeature(imagePath=" + this.imagePath + ", id=" + this.id + ", title=" + this.title + ", contentMarkdown=" + this.contentMarkdown + ", cta=" + this.cta + ", deeplink=" + this.deeplink + ", subtitle=" + this.subtitle + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.imagePath);
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.contentMarkdown);
        dest.writeParcelable(this.cta, flags);
        dest.writeString(this.deeplink);
        dest.writeString(this.subtitle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldHubFeature(@Json(name = "image_path") String imagePath, String id, String title, @Json(name = "content_markdown") String contentMarkdown, TextButton<? extends GoldHubAction> textButton, String str, String str2) {
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(contentMarkdown, "contentMarkdown");
        this.imagePath = imagePath;
        this.id = id;
        this.title = title;
        this.contentMarkdown = contentMarkdown;
        this.cta = textButton;
        this.deeplink = str;
        this.subtitle = str2;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContentMarkdown() {
        return this.contentMarkdown;
    }

    public final TextButton<GoldHubAction> getCta() {
        return this.cta;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}

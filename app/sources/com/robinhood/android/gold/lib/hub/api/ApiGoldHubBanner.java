package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldHubBanner;", "Landroid/os/Parcelable;", "id", "", "content", "ctaText", "ctaLink", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getId", "()Ljava/lang/String;", "getContent", "getCtaText", "getCtaLink", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldHubBanner implements Parcelable {
    public static final Parcelable.Creator<ApiGoldHubBanner> CREATOR = new Creator();
    private final String content;
    private final String ctaLink;
    private final String ctaText;
    private final ServerToBentoAssetMapper2 icon;
    private final String id;

    /* compiled from: ApiGoldHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldHubBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBanner createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGoldHubBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ServerToBentoAssetMapper2.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldHubBanner[] newArray(int i) {
            return new ApiGoldHubBanner[i];
        }
    }

    public static /* synthetic */ ApiGoldHubBanner copy$default(ApiGoldHubBanner apiGoldHubBanner, String str, String str2, String str3, String str4, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldHubBanner.id;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldHubBanner.content;
        }
        if ((i & 4) != 0) {
            str3 = apiGoldHubBanner.ctaText;
        }
        if ((i & 8) != 0) {
            str4 = apiGoldHubBanner.ctaLink;
        }
        if ((i & 16) != 0) {
            serverToBentoAssetMapper2 = apiGoldHubBanner.icon;
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        String str5 = str3;
        return apiGoldHubBanner.copy(str, str2, str5, str4, serverToBentoAssetMapper22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCtaLink() {
        return this.ctaLink;
    }

    /* renamed from: component5, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final ApiGoldHubBanner copy(String id, String content, @Json(name = "cta_text") String ctaText, @Json(name = "cta_link") String ctaLink, ServerToBentoAssetMapper2 icon) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ApiGoldHubBanner(id, content, ctaText, ctaLink, icon);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldHubBanner)) {
            return false;
        }
        ApiGoldHubBanner apiGoldHubBanner = (ApiGoldHubBanner) other;
        return Intrinsics.areEqual(this.id, apiGoldHubBanner.id) && Intrinsics.areEqual(this.content, apiGoldHubBanner.content) && Intrinsics.areEqual(this.ctaText, apiGoldHubBanner.ctaText) && Intrinsics.areEqual(this.ctaLink, apiGoldHubBanner.ctaLink) && this.icon == apiGoldHubBanner.icon;
    }

    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.content.hashCode()) * 31;
        String str = this.ctaText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaLink;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        return iHashCode3 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldHubBanner(id=" + this.id + ", content=" + this.content + ", ctaText=" + this.ctaText + ", ctaLink=" + this.ctaLink + ", icon=" + this.icon + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.content);
        dest.writeString(this.ctaText);
        dest.writeString(this.ctaLink);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        if (serverToBentoAssetMapper2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverToBentoAssetMapper2.name());
        }
    }

    public ApiGoldHubBanner(String id, String content, @Json(name = "cta_text") String str, @Json(name = "cta_link") String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = id;
        this.content = content;
        this.ctaText = str;
        this.ctaLink = str2;
        this.icon = serverToBentoAssetMapper2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCtaLink() {
        return this.ctaLink;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }
}

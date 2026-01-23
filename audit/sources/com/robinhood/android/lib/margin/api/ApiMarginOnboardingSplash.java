package com.robinhood.android.lib.margin.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiMarginOnboardingSplash.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0014\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/lib/margin/api/ApiMarginOnboardingSplash;", "Landroid/os/Parcelable;", "isGold", "", "headerAnimationUrl", "", "headerImageUrl", "headerAnimationTextMapping", "", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "()Z", "getHeaderAnimationUrl", "()Ljava/lang/String;", "getHeaderImageUrl", "getHeaderAnimationTextMapping", "()Ljava/util/Map;", "getContent", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ApiMarginOnboardingSplash implements Parcelable {
    public static final Parcelable.Creator<ApiMarginOnboardingSplash> CREATOR = new Creator();
    private final List<UIComponent<GenericAction>> content;
    private final Map<String, String> headerAnimationTextMapping;
    private final String headerAnimationUrl;
    private final String headerImageUrl;
    private final boolean isGold;

    /* compiled from: ApiMarginOnboardingSplash.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiMarginOnboardingSplash> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginOnboardingSplash createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList.add(parcel.readParcelable(ApiMarginOnboardingSplash.class.getClassLoader()));
            }
            return new ApiMarginOnboardingSplash(z, string2, string3, linkedHashMap, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiMarginOnboardingSplash[] newArray(int i) {
            return new ApiMarginOnboardingSplash[i];
        }
    }

    public static /* synthetic */ ApiMarginOnboardingSplash copy$default(ApiMarginOnboardingSplash apiMarginOnboardingSplash, boolean z, String str, String str2, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = apiMarginOnboardingSplash.isGold;
        }
        if ((i & 2) != 0) {
            str = apiMarginOnboardingSplash.headerAnimationUrl;
        }
        if ((i & 4) != 0) {
            str2 = apiMarginOnboardingSplash.headerImageUrl;
        }
        if ((i & 8) != 0) {
            map = apiMarginOnboardingSplash.headerAnimationTextMapping;
        }
        if ((i & 16) != 0) {
            list = apiMarginOnboardingSplash.content;
        }
        List list2 = list;
        String str3 = str2;
        return apiMarginOnboardingSplash.copy(z, str, str3, map, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsGold() {
        return this.isGold;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeaderAnimationUrl() {
        return this.headerAnimationUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final Map<String, String> component4() {
        return this.headerAnimationTextMapping;
    }

    public final List<UIComponent<GenericAction>> component5() {
        return this.content;
    }

    public final ApiMarginOnboardingSplash copy(@Json(name = "is_gold") boolean isGold, @Json(name = "header_animation_url") String headerAnimationUrl, @Json(name = "header_image_url") String headerImageUrl, @Json(name = "header_animation_text_mapping") Map<String, String> headerAnimationTextMapping, List<? extends UIComponent<? extends GenericAction>> content) {
        Intrinsics.checkNotNullParameter(headerAnimationUrl, "headerAnimationUrl");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(headerAnimationTextMapping, "headerAnimationTextMapping");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ApiMarginOnboardingSplash(isGold, headerAnimationUrl, headerImageUrl, headerAnimationTextMapping, content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiMarginOnboardingSplash)) {
            return false;
        }
        ApiMarginOnboardingSplash apiMarginOnboardingSplash = (ApiMarginOnboardingSplash) other;
        return this.isGold == apiMarginOnboardingSplash.isGold && Intrinsics.areEqual(this.headerAnimationUrl, apiMarginOnboardingSplash.headerAnimationUrl) && Intrinsics.areEqual(this.headerImageUrl, apiMarginOnboardingSplash.headerImageUrl) && Intrinsics.areEqual(this.headerAnimationTextMapping, apiMarginOnboardingSplash.headerAnimationTextMapping) && Intrinsics.areEqual(this.content, apiMarginOnboardingSplash.content);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isGold) * 31) + this.headerAnimationUrl.hashCode()) * 31) + this.headerImageUrl.hashCode()) * 31) + this.headerAnimationTextMapping.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "ApiMarginOnboardingSplash(isGold=" + this.isGold + ", headerAnimationUrl=" + this.headerAnimationUrl + ", headerImageUrl=" + this.headerImageUrl + ", headerAnimationTextMapping=" + this.headerAnimationTextMapping + ", content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isGold ? 1 : 0);
        dest.writeString(this.headerAnimationUrl);
        dest.writeString(this.headerImageUrl);
        Map<String, String> map = this.headerAnimationTextMapping;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
        List<UIComponent<GenericAction>> list = this.content;
        dest.writeInt(list.size());
        Iterator<UIComponent<GenericAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiMarginOnboardingSplash(@Json(name = "is_gold") boolean z, @Json(name = "header_animation_url") String headerAnimationUrl, @Json(name = "header_image_url") String headerImageUrl, @Json(name = "header_animation_text_mapping") Map<String, String> headerAnimationTextMapping, List<? extends UIComponent<? extends GenericAction>> content) {
        Intrinsics.checkNotNullParameter(headerAnimationUrl, "headerAnimationUrl");
        Intrinsics.checkNotNullParameter(headerImageUrl, "headerImageUrl");
        Intrinsics.checkNotNullParameter(headerAnimationTextMapping, "headerAnimationTextMapping");
        Intrinsics.checkNotNullParameter(content, "content");
        this.isGold = z;
        this.headerAnimationUrl = headerAnimationUrl;
        this.headerImageUrl = headerImageUrl;
        this.headerAnimationTextMapping = headerAnimationTextMapping;
        this.content = content;
    }

    public final boolean isGold() {
        return this.isGold;
    }

    public final String getHeaderAnimationUrl() {
        return this.headerAnimationUrl;
    }

    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    public final Map<String, String> getHeaderAnimationTextMapping() {
        return this.headerAnimationTextMapping;
    }

    public final List<UIComponent<GenericAction>> getContent() {
        return this.content;
    }
}

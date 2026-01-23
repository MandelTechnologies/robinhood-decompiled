package com.robinhood.staticcontent.model.safetylabelslesson;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiSafetyLabelsLessonSlide.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007HÆ\u0003J\u0015\u0010 \u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\t\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u000b\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSlide;", "", "title", "", "type", "Lcom/robinhood/staticcontent/model/safetylabelslesson/SlideType;", "dayFirstAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "nightFirstAsset", "daySecondAsset", "nightSecondAsset", "firstToggleLabel", "secondToggleLabel", "<init>", "(Ljava/lang/String;Lcom/robinhood/staticcontent/model/safetylabelslesson/SlideType;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/staticcontent/model/safetylabelslesson/SlideType;", "getDayFirstAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getNightFirstAsset", "getDaySecondAsset", "getNightSecondAsset", "getFirstToggleLabel", "getSecondToggleLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ApiSafetyLabelsLessonSlide {
    private final ResourceLink<AssetResource<?>> dayFirstAsset;
    private final ResourceLink<AssetResource<?>> daySecondAsset;
    private final String firstToggleLabel;
    private final ResourceLink<AssetResource<?>> nightFirstAsset;
    private final ResourceLink<AssetResource<?>> nightSecondAsset;
    private final String secondToggleLabel;
    private final String title;
    private final ApiSafetyLabelsLessonSlide2 type;

    public static /* synthetic */ ApiSafetyLabelsLessonSlide copy$default(ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide, String str, ApiSafetyLabelsLessonSlide2 apiSafetyLabelsLessonSlide2, ResourceLink resourceLink, ResourceLink resourceLink2, ResourceLink resourceLink3, ResourceLink resourceLink4, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiSafetyLabelsLessonSlide.title;
        }
        if ((i & 2) != 0) {
            apiSafetyLabelsLessonSlide2 = apiSafetyLabelsLessonSlide.type;
        }
        if ((i & 4) != 0) {
            resourceLink = apiSafetyLabelsLessonSlide.dayFirstAsset;
        }
        if ((i & 8) != 0) {
            resourceLink2 = apiSafetyLabelsLessonSlide.nightFirstAsset;
        }
        if ((i & 16) != 0) {
            resourceLink3 = apiSafetyLabelsLessonSlide.daySecondAsset;
        }
        if ((i & 32) != 0) {
            resourceLink4 = apiSafetyLabelsLessonSlide.nightSecondAsset;
        }
        if ((i & 64) != 0) {
            str2 = apiSafetyLabelsLessonSlide.firstToggleLabel;
        }
        if ((i & 128) != 0) {
            str3 = apiSafetyLabelsLessonSlide.secondToggleLabel;
        }
        String str4 = str2;
        String str5 = str3;
        ResourceLink resourceLink5 = resourceLink3;
        ResourceLink resourceLink6 = resourceLink4;
        return apiSafetyLabelsLessonSlide.copy(str, apiSafetyLabelsLessonSlide2, resourceLink, resourceLink2, resourceLink5, resourceLink6, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiSafetyLabelsLessonSlide2 getType() {
        return this.type;
    }

    public final ResourceLink<AssetResource<?>> component3() {
        return this.dayFirstAsset;
    }

    public final ResourceLink<AssetResource<?>> component4() {
        return this.nightFirstAsset;
    }

    public final ResourceLink<AssetResource<?>> component5() {
        return this.daySecondAsset;
    }

    public final ResourceLink<AssetResource<?>> component6() {
        return this.nightSecondAsset;
    }

    /* renamed from: component7, reason: from getter */
    public final String getFirstToggleLabel() {
        return this.firstToggleLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSecondToggleLabel() {
        return this.secondToggleLabel;
    }

    public final ApiSafetyLabelsLessonSlide copy(String title, ApiSafetyLabelsLessonSlide2 type2, ResourceLink<AssetResource<?>> dayFirstAsset, ResourceLink<AssetResource<?>> nightFirstAsset, ResourceLink<AssetResource<?>> daySecondAsset, ResourceLink<AssetResource<?>> nightSecondAsset, String firstToggleLabel, String secondToggleLabel) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(dayFirstAsset, "dayFirstAsset");
        return new ApiSafetyLabelsLessonSlide(title, type2, dayFirstAsset, nightFirstAsset, daySecondAsset, nightSecondAsset, firstToggleLabel, secondToggleLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiSafetyLabelsLessonSlide)) {
            return false;
        }
        ApiSafetyLabelsLessonSlide apiSafetyLabelsLessonSlide = (ApiSafetyLabelsLessonSlide) other;
        return Intrinsics.areEqual(this.title, apiSafetyLabelsLessonSlide.title) && this.type == apiSafetyLabelsLessonSlide.type && Intrinsics.areEqual(this.dayFirstAsset, apiSafetyLabelsLessonSlide.dayFirstAsset) && Intrinsics.areEqual(this.nightFirstAsset, apiSafetyLabelsLessonSlide.nightFirstAsset) && Intrinsics.areEqual(this.daySecondAsset, apiSafetyLabelsLessonSlide.daySecondAsset) && Intrinsics.areEqual(this.nightSecondAsset, apiSafetyLabelsLessonSlide.nightSecondAsset) && Intrinsics.areEqual(this.firstToggleLabel, apiSafetyLabelsLessonSlide.firstToggleLabel) && Intrinsics.areEqual(this.secondToggleLabel, apiSafetyLabelsLessonSlide.secondToggleLabel);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.type.hashCode()) * 31) + this.dayFirstAsset.hashCode()) * 31;
        ResourceLink<AssetResource<?>> resourceLink = this.nightFirstAsset;
        int iHashCode2 = (iHashCode + (resourceLink == null ? 0 : resourceLink.hashCode())) * 31;
        ResourceLink<AssetResource<?>> resourceLink2 = this.daySecondAsset;
        int iHashCode3 = (iHashCode2 + (resourceLink2 == null ? 0 : resourceLink2.hashCode())) * 31;
        ResourceLink<AssetResource<?>> resourceLink3 = this.nightSecondAsset;
        int iHashCode4 = (iHashCode3 + (resourceLink3 == null ? 0 : resourceLink3.hashCode())) * 31;
        String str2 = this.firstToggleLabel;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondToggleLabel;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ApiSafetyLabelsLessonSlide(title=" + this.title + ", type=" + this.type + ", dayFirstAsset=" + this.dayFirstAsset + ", nightFirstAsset=" + this.nightFirstAsset + ", daySecondAsset=" + this.daySecondAsset + ", nightSecondAsset=" + this.nightSecondAsset + ", firstToggleLabel=" + this.firstToggleLabel + ", secondToggleLabel=" + this.secondToggleLabel + ")";
    }

    public ApiSafetyLabelsLessonSlide(String str, ApiSafetyLabelsLessonSlide2 type2, ResourceLink<AssetResource<?>> dayFirstAsset, ResourceLink<AssetResource<?>> resourceLink, ResourceLink<AssetResource<?>> resourceLink2, ResourceLink<AssetResource<?>> resourceLink3, String str2, String str3) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(dayFirstAsset, "dayFirstAsset");
        this.title = str;
        this.type = type2;
        this.dayFirstAsset = dayFirstAsset;
        this.nightFirstAsset = resourceLink;
        this.daySecondAsset = resourceLink2;
        this.nightSecondAsset = resourceLink3;
        this.firstToggleLabel = str2;
        this.secondToggleLabel = str3;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ApiSafetyLabelsLessonSlide2 getType() {
        return this.type;
    }

    public final ResourceLink<AssetResource<?>> getDayFirstAsset() {
        return this.dayFirstAsset;
    }

    public final ResourceLink<AssetResource<?>> getNightFirstAsset() {
        return this.nightFirstAsset;
    }

    public final ResourceLink<AssetResource<?>> getDaySecondAsset() {
        return this.daySecondAsset;
    }

    public final ResourceLink<AssetResource<?>> getNightSecondAsset() {
        return this.nightSecondAsset;
    }

    public final String getFirstToggleLabel() {
        return this.firstToggleLabel;
    }

    public final String getSecondToggleLabel() {
        return this.secondToggleLabel;
    }
}

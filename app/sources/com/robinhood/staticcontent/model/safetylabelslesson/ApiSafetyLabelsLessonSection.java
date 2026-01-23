package com.robinhood.staticcontent.model.safetylabelslesson;

import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiSafetyLabelsLessonSection.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSection;", "", "identifier", "", "type", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ContentType;", "content", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "slides", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/safetylabelslesson/ApiSafetyLabelsLessonSlide;", "<init>", "(Ljava/lang/String;Lcom/robinhood/staticcontent/model/safetylabelslesson/ContentType;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;)V", "getIdentifier", "()Ljava/lang/String;", "getType", "()Lcom/robinhood/staticcontent/model/safetylabelslesson/ContentType;", "getContent", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getSlides", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ApiSafetyLabelsLessonSection {
    private final MarkdownContent content;
    private final String identifier;
    private final ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> slides;
    private final ApiSafetyLabelsLessonSection2 type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiSafetyLabelsLessonSection copy$default(ApiSafetyLabelsLessonSection apiSafetyLabelsLessonSection, String str, ApiSafetyLabelsLessonSection2 apiSafetyLabelsLessonSection2, MarkdownContent markdownContent, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiSafetyLabelsLessonSection.identifier;
        }
        if ((i & 2) != 0) {
            apiSafetyLabelsLessonSection2 = apiSafetyLabelsLessonSection.type;
        }
        if ((i & 4) != 0) {
            markdownContent = apiSafetyLabelsLessonSection.content;
        }
        if ((i & 8) != 0) {
            resourceLink = apiSafetyLabelsLessonSection.slides;
        }
        return apiSafetyLabelsLessonSection.copy(str, apiSafetyLabelsLessonSection2, markdownContent, resourceLink);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final ApiSafetyLabelsLessonSection2 getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getContent() {
        return this.content;
    }

    public final ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> component4() {
        return this.slides;
    }

    public final ApiSafetyLabelsLessonSection copy(String identifier, ApiSafetyLabelsLessonSection2 type2, MarkdownContent content, ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> slides) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new ApiSafetyLabelsLessonSection(identifier, type2, content, slides);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiSafetyLabelsLessonSection)) {
            return false;
        }
        ApiSafetyLabelsLessonSection apiSafetyLabelsLessonSection = (ApiSafetyLabelsLessonSection) other;
        return Intrinsics.areEqual(this.identifier, apiSafetyLabelsLessonSection.identifier) && this.type == apiSafetyLabelsLessonSection.type && Intrinsics.areEqual(this.content, apiSafetyLabelsLessonSection.content) && Intrinsics.areEqual(this.slides, apiSafetyLabelsLessonSection.slides);
    }

    public int hashCode() {
        int iHashCode = ((this.identifier.hashCode() * 31) + this.type.hashCode()) * 31;
        MarkdownContent markdownContent = this.content;
        int iHashCode2 = (iHashCode + (markdownContent == null ? 0 : markdownContent.hashCode())) * 31;
        ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> resourceLink = this.slides;
        return iHashCode2 + (resourceLink != null ? resourceLink.hashCode() : 0);
    }

    public String toString() {
        return "ApiSafetyLabelsLessonSection(identifier=" + this.identifier + ", type=" + this.type + ", content=" + this.content + ", slides=" + this.slides + ")";
    }

    public ApiSafetyLabelsLessonSection(String identifier, ApiSafetyLabelsLessonSection2 type2, MarkdownContent markdownContent, ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> resourceLink) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(type2, "type");
        this.identifier = identifier;
        this.type = type2;
        this.content = markdownContent;
        this.slides = resourceLink;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final ApiSafetyLabelsLessonSection2 getType() {
        return this.type;
    }

    public final MarkdownContent getContent() {
        return this.content;
    }

    public final ResourceLink<EntryResource<ApiSafetyLabelsLessonSlide>> getSlides() {
        return this.slides;
    }
}

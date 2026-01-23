package com.robinhood.staticcontent.model.productmarketing;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductMarketing.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u0012\u0014\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001b\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n\u0018\u00010\tHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing;", "", "productIdentifier", "", "pageTitle", "productDescription", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "features", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;)V", "getProductIdentifier", "()Ljava/lang/String;", "getPageTitle", "getProductDescription", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getFeatures", "()Ljava/util/List;", "getDisclosure", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Feature", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class ProductMarketing {
    private final ResourceLink<EntryResource<Disclosure>> disclosure;
    private final List<ResourceLink<EntryResource<Feature>>> features;
    private final String pageTitle;
    private final MarkdownContent productDescription;
    private final String productIdentifier;

    public static /* synthetic */ ProductMarketing copy$default(ProductMarketing productMarketing, String str, String str2, MarkdownContent markdownContent, List list, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = productMarketing.productIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = productMarketing.pageTitle;
        }
        if ((i & 4) != 0) {
            markdownContent = productMarketing.productDescription;
        }
        if ((i & 8) != 0) {
            list = productMarketing.features;
        }
        if ((i & 16) != 0) {
            resourceLink = productMarketing.disclosure;
        }
        ResourceLink resourceLink2 = resourceLink;
        MarkdownContent markdownContent2 = markdownContent;
        return productMarketing.copy(str, str2, markdownContent2, list, resourceLink2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPageTitle() {
        return this.pageTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final MarkdownContent getProductDescription() {
        return this.productDescription;
    }

    public final List<ResourceLink<EntryResource<Feature>>> component4() {
        return this.features;
    }

    public final ResourceLink<EntryResource<Disclosure>> component5() {
        return this.disclosure;
    }

    public final ProductMarketing copy(String productIdentifier, String pageTitle, MarkdownContent productDescription, List<ResourceLink<EntryResource<Feature>>> features, ResourceLink<EntryResource<Disclosure>> disclosure) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(features, "features");
        return new ProductMarketing(productIdentifier, pageTitle, productDescription, features, disclosure);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductMarketing)) {
            return false;
        }
        ProductMarketing productMarketing = (ProductMarketing) other;
        return Intrinsics.areEqual(this.productIdentifier, productMarketing.productIdentifier) && Intrinsics.areEqual(this.pageTitle, productMarketing.pageTitle) && Intrinsics.areEqual(this.productDescription, productMarketing.productDescription) && Intrinsics.areEqual(this.features, productMarketing.features) && Intrinsics.areEqual(this.disclosure, productMarketing.disclosure);
    }

    public int hashCode() {
        int iHashCode = this.productIdentifier.hashCode() * 31;
        String str = this.pageTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        MarkdownContent markdownContent = this.productDescription;
        int iHashCode3 = (((iHashCode2 + (markdownContent == null ? 0 : markdownContent.hashCode())) * 31) + this.features.hashCode()) * 31;
        ResourceLink<EntryResource<Disclosure>> resourceLink = this.disclosure;
        return iHashCode3 + (resourceLink != null ? resourceLink.hashCode() : 0);
    }

    public String toString() {
        return "ProductMarketing(productIdentifier=" + this.productIdentifier + ", pageTitle=" + this.pageTitle + ", productDescription=" + this.productDescription + ", features=" + this.features + ", disclosure=" + this.disclosure + ")";
    }

    public ProductMarketing(String productIdentifier, String str, MarkdownContent markdownContent, List<ResourceLink<EntryResource<Feature>>> features, ResourceLink<EntryResource<Disclosure>> resourceLink) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(features, "features");
        this.productIdentifier = productIdentifier;
        this.pageTitle = str;
        this.productDescription = markdownContent;
        this.features = features;
        this.disclosure = resourceLink;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final MarkdownContent getProductDescription() {
        return this.productDescription;
    }

    public final List<ResourceLink<EntryResource<Feature>>> getFeatures() {
        return this.features;
    }

    public final ResourceLink<EntryResource<Disclosure>> getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: ProductMarketing.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketing$Feature;", "", "title", "", "identifier", "content", "Lcom/robinhood/contentful/markdown/MarkdownContent;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "iconKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getIdentifier", "getContent", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getDisclosure", "()Lcom/robinhood/contentful/model/ResourceLink;", "getIconKey", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Feature {
        private final MarkdownContent content;
        private final ResourceLink<EntryResource<Disclosure>> disclosure;
        private final String iconKey;
        private final String identifier;
        private final String title;

        public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, MarkdownContent markdownContent, ResourceLink resourceLink, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = feature.title;
            }
            if ((i & 2) != 0) {
                str2 = feature.identifier;
            }
            if ((i & 4) != 0) {
                markdownContent = feature.content;
            }
            if ((i & 8) != 0) {
                resourceLink = feature.disclosure;
            }
            if ((i & 16) != 0) {
                str3 = feature.iconKey;
            }
            String str4 = str3;
            MarkdownContent markdownContent2 = markdownContent;
            return feature.copy(str, str2, markdownContent2, resourceLink, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        /* renamed from: component3, reason: from getter */
        public final MarkdownContent getContent() {
            return this.content;
        }

        public final ResourceLink<EntryResource<Disclosure>> component4() {
            return this.disclosure;
        }

        /* renamed from: component5, reason: from getter */
        public final String getIconKey() {
            return this.iconKey;
        }

        public final Feature copy(String title, String identifier, MarkdownContent content, ResourceLink<EntryResource<Disclosure>> disclosure, String iconKey) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(content, "content");
            return new Feature(title, identifier, content, disclosure, iconKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Feature)) {
                return false;
            }
            Feature feature = (Feature) other;
            return Intrinsics.areEqual(this.title, feature.title) && Intrinsics.areEqual(this.identifier, feature.identifier) && Intrinsics.areEqual(this.content, feature.content) && Intrinsics.areEqual(this.disclosure, feature.disclosure) && Intrinsics.areEqual(this.iconKey, feature.iconKey);
        }

        public int hashCode() {
            int iHashCode = ((((this.title.hashCode() * 31) + this.identifier.hashCode()) * 31) + this.content.hashCode()) * 31;
            ResourceLink<EntryResource<Disclosure>> resourceLink = this.disclosure;
            int iHashCode2 = (iHashCode + (resourceLink == null ? 0 : resourceLink.hashCode())) * 31;
            String str = this.iconKey;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Feature(title=" + this.title + ", identifier=" + this.identifier + ", content=" + this.content + ", disclosure=" + this.disclosure + ", iconKey=" + this.iconKey + ")";
        }

        public Feature(String title, String identifier, MarkdownContent content, ResourceLink<EntryResource<Disclosure>> resourceLink, String str) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(content, "content");
            this.title = title;
            this.identifier = identifier;
            this.content = content;
            this.disclosure = resourceLink;
            this.iconKey = str;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final MarkdownContent getContent() {
            return this.content;
        }

        public final ResourceLink<EntryResource<Disclosure>> getDisclosure() {
            return this.disclosure;
        }

        public final String getIconKey() {
            return this.iconKey;
        }
    }
}

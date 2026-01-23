package com.robinhood.staticcontent.model.rhymigration;

import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.TitleAndBody;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigrationReviewPage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t\u0012\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t\u0012\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u001b\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tHÆ\u0003J\u001b\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tHÆ\u0003J\u0013\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\nHÆ\u0003J\u0087\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R#\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R#\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001b\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationReviewPage;", "", "ctaTitle", "", "faqTitle", "showAllLink", "showAllTitle", "title", "dropdowns", "", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "valueProps", "animationAsset", "Lcom/robinhood/contentful/model/AssetResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/robinhood/contentful/model/ResourceLink;)V", "getCtaTitle", "()Ljava/lang/String;", "getFaqTitle", "getShowAllLink", "getShowAllTitle", "getTitle", "getDropdowns", "()Ljava/util/List;", "getValueProps", "getAnimationAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigrationReviewPage {
    private final ResourceLink<AssetResource<?>> animationAsset;
    private final String ctaTitle;
    private final List<ResourceLink<EntryResource<TitleAndBody>>> dropdowns;
    private final String faqTitle;
    private final String showAllLink;
    private final String showAllTitle;
    private final String title;
    private final List<ResourceLink<EntryResource<TitleAndBody>>> valueProps;

    public static /* synthetic */ RhyMigrationReviewPage copy$default(RhyMigrationReviewPage rhyMigrationReviewPage, String str, String str2, String str3, String str4, String str5, List list, List list2, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhyMigrationReviewPage.ctaTitle;
        }
        if ((i & 2) != 0) {
            str2 = rhyMigrationReviewPage.faqTitle;
        }
        if ((i & 4) != 0) {
            str3 = rhyMigrationReviewPage.showAllLink;
        }
        if ((i & 8) != 0) {
            str4 = rhyMigrationReviewPage.showAllTitle;
        }
        if ((i & 16) != 0) {
            str5 = rhyMigrationReviewPage.title;
        }
        if ((i & 32) != 0) {
            list = rhyMigrationReviewPage.dropdowns;
        }
        if ((i & 64) != 0) {
            list2 = rhyMigrationReviewPage.valueProps;
        }
        if ((i & 128) != 0) {
            resourceLink = rhyMigrationReviewPage.animationAsset;
        }
        List list3 = list2;
        ResourceLink resourceLink2 = resourceLink;
        String str6 = str5;
        List list4 = list;
        return rhyMigrationReviewPage.copy(str, str2, str3, str4, str6, list4, list3, resourceLink2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFaqTitle() {
        return this.faqTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getShowAllLink() {
        return this.showAllLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> component6() {
        return this.dropdowns;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> component7() {
        return this.valueProps;
    }

    public final ResourceLink<AssetResource<?>> component8() {
        return this.animationAsset;
    }

    public final RhyMigrationReviewPage copy(String ctaTitle, String faqTitle, String showAllLink, String showAllTitle, String title, List<ResourceLink<EntryResource<TitleAndBody>>> dropdowns, List<ResourceLink<EntryResource<TitleAndBody>>> valueProps, ResourceLink<AssetResource<?>> animationAsset) {
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(showAllLink, "showAllLink");
        Intrinsics.checkNotNullParameter(showAllTitle, "showAllTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dropdowns, "dropdowns");
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new RhyMigrationReviewPage(ctaTitle, faqTitle, showAllLink, showAllTitle, title, dropdowns, valueProps, animationAsset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigrationReviewPage)) {
            return false;
        }
        RhyMigrationReviewPage rhyMigrationReviewPage = (RhyMigrationReviewPage) other;
        return Intrinsics.areEqual(this.ctaTitle, rhyMigrationReviewPage.ctaTitle) && Intrinsics.areEqual(this.faqTitle, rhyMigrationReviewPage.faqTitle) && Intrinsics.areEqual(this.showAllLink, rhyMigrationReviewPage.showAllLink) && Intrinsics.areEqual(this.showAllTitle, rhyMigrationReviewPage.showAllTitle) && Intrinsics.areEqual(this.title, rhyMigrationReviewPage.title) && Intrinsics.areEqual(this.dropdowns, rhyMigrationReviewPage.dropdowns) && Intrinsics.areEqual(this.valueProps, rhyMigrationReviewPage.valueProps) && Intrinsics.areEqual(this.animationAsset, rhyMigrationReviewPage.animationAsset);
    }

    public int hashCode() {
        return (((((((((((((this.ctaTitle.hashCode() * 31) + this.faqTitle.hashCode()) * 31) + this.showAllLink.hashCode()) * 31) + this.showAllTitle.hashCode()) * 31) + this.title.hashCode()) * 31) + this.dropdowns.hashCode()) * 31) + this.valueProps.hashCode()) * 31) + this.animationAsset.hashCode();
    }

    public String toString() {
        return "RhyMigrationReviewPage(ctaTitle=" + this.ctaTitle + ", faqTitle=" + this.faqTitle + ", showAllLink=" + this.showAllLink + ", showAllTitle=" + this.showAllTitle + ", title=" + this.title + ", dropdowns=" + this.dropdowns + ", valueProps=" + this.valueProps + ", animationAsset=" + this.animationAsset + ")";
    }

    public RhyMigrationReviewPage(String ctaTitle, String faqTitle, String showAllLink, String showAllTitle, String title, List<ResourceLink<EntryResource<TitleAndBody>>> dropdowns, List<ResourceLink<EntryResource<TitleAndBody>>> valueProps, ResourceLink<AssetResource<?>> animationAsset) {
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(showAllLink, "showAllLink");
        Intrinsics.checkNotNullParameter(showAllTitle, "showAllTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dropdowns, "dropdowns");
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        this.ctaTitle = ctaTitle;
        this.faqTitle = faqTitle;
        this.showAllLink = showAllLink;
        this.showAllTitle = showAllTitle;
        this.title = title;
        this.dropdowns = dropdowns;
        this.valueProps = valueProps;
        this.animationAsset = animationAsset;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getFaqTitle() {
        return this.faqTitle;
    }

    public final String getShowAllLink() {
        return this.showAllLink;
    }

    public final String getShowAllTitle() {
        return this.showAllTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> getDropdowns() {
        return this.dropdowns;
    }

    public final List<ResourceLink<EntryResource<TitleAndBody>>> getValueProps() {
        return this.valueProps;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAsset() {
        return this.animationAsset;
    }
}

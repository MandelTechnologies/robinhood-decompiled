package com.robinhood.staticcontent.model.rhymigration;

import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigrationFeaturePage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0013\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0012\b\u0002\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010'\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationFeaturePage;", "", "title", "", "subtitle", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animationAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "disclosureDialog", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "animationPortionUnderSubtitle", "", "loopAnimation", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Lcom/robinhood/contentful/model/ResourceLink;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;FZ)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimationAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "getDisclosure", "getDisclosureDialog", "getAnimationPortionUnderSubtitle", "()F", "getLoopAnimation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigrationFeaturePage {
    private final ResourceLink<AssetResource<?>> animationAsset;
    private final float animationPortionUnderSubtitle;
    private final String disclosure;
    private final ResourceLink<EntryResource<Disclosure>> disclosureDialog;
    private final boolean loopAnimation;
    private final MarkdownContent subtitle;
    private final String title;

    public static /* synthetic */ RhyMigrationFeaturePage copy$default(RhyMigrationFeaturePage rhyMigrationFeaturePage, String str, MarkdownContent markdownContent, ResourceLink resourceLink, String str2, ResourceLink resourceLink2, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhyMigrationFeaturePage.title;
        }
        if ((i & 2) != 0) {
            markdownContent = rhyMigrationFeaturePage.subtitle;
        }
        if ((i & 4) != 0) {
            resourceLink = rhyMigrationFeaturePage.animationAsset;
        }
        if ((i & 8) != 0) {
            str2 = rhyMigrationFeaturePage.disclosure;
        }
        if ((i & 16) != 0) {
            resourceLink2 = rhyMigrationFeaturePage.disclosureDialog;
        }
        if ((i & 32) != 0) {
            f = rhyMigrationFeaturePage.animationPortionUnderSubtitle;
        }
        if ((i & 64) != 0) {
            z = rhyMigrationFeaturePage.loopAnimation;
        }
        float f2 = f;
        boolean z2 = z;
        ResourceLink resourceLink3 = resourceLink2;
        ResourceLink resourceLink4 = resourceLink;
        return rhyMigrationFeaturePage.copy(str, markdownContent, resourceLink4, str2, resourceLink3, f2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    public final ResourceLink<AssetResource<?>> component3() {
        return this.animationAsset;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    public final ResourceLink<EntryResource<Disclosure>> component5() {
        return this.disclosureDialog;
    }

    /* renamed from: component6, reason: from getter */
    public final float getAnimationPortionUnderSubtitle() {
        return this.animationPortionUnderSubtitle;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getLoopAnimation() {
        return this.loopAnimation;
    }

    public final RhyMigrationFeaturePage copy(String title, MarkdownContent subtitle, ResourceLink<AssetResource<?>> animationAsset, String disclosure, ResourceLink<EntryResource<Disclosure>> disclosureDialog, float animationPortionUnderSubtitle, boolean loopAnimation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new RhyMigrationFeaturePage(title, subtitle, animationAsset, disclosure, disclosureDialog, animationPortionUnderSubtitle, loopAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigrationFeaturePage)) {
            return false;
        }
        RhyMigrationFeaturePage rhyMigrationFeaturePage = (RhyMigrationFeaturePage) other;
        return Intrinsics.areEqual(this.title, rhyMigrationFeaturePage.title) && Intrinsics.areEqual(this.subtitle, rhyMigrationFeaturePage.subtitle) && Intrinsics.areEqual(this.animationAsset, rhyMigrationFeaturePage.animationAsset) && Intrinsics.areEqual(this.disclosure, rhyMigrationFeaturePage.disclosure) && Intrinsics.areEqual(this.disclosureDialog, rhyMigrationFeaturePage.disclosureDialog) && Float.compare(this.animationPortionUnderSubtitle, rhyMigrationFeaturePage.animationPortionUnderSubtitle) == 0 && this.loopAnimation == rhyMigrationFeaturePage.loopAnimation;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.animationAsset.hashCode()) * 31;
        String str = this.disclosure;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ResourceLink<EntryResource<Disclosure>> resourceLink = this.disclosureDialog;
        return ((((iHashCode2 + (resourceLink != null ? resourceLink.hashCode() : 0)) * 31) + Float.hashCode(this.animationPortionUnderSubtitle)) * 31) + Boolean.hashCode(this.loopAnimation);
    }

    public String toString() {
        return "RhyMigrationFeaturePage(title=" + this.title + ", subtitle=" + this.subtitle + ", animationAsset=" + this.animationAsset + ", disclosure=" + this.disclosure + ", disclosureDialog=" + this.disclosureDialog + ", animationPortionUnderSubtitle=" + this.animationPortionUnderSubtitle + ", loopAnimation=" + this.loopAnimation + ")";
    }

    public RhyMigrationFeaturePage(String title, MarkdownContent subtitle, ResourceLink<AssetResource<?>> animationAsset, String str, ResourceLink<EntryResource<Disclosure>> resourceLink, float f, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        this.title = title;
        this.subtitle = subtitle;
        this.animationAsset = animationAsset;
        this.disclosure = str;
        this.disclosureDialog = resourceLink;
        this.animationPortionUnderSubtitle = f;
        this.loopAnimation = z;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAsset() {
        return this.animationAsset;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final ResourceLink<EntryResource<Disclosure>> getDisclosureDialog() {
        return this.disclosureDialog;
    }

    public final float getAnimationPortionUnderSubtitle() {
        return this.animationPortionUnderSubtitle;
    }

    public final boolean getLoopAnimation() {
        return this.loopAnimation;
    }
}

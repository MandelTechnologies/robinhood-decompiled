package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.staticcontent.model.disclosure.Disclosure;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationFeaturePage.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\u000fHÆ\u0003J_\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\u000f2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationFeaturePage;", "Landroid/os/Parcelable;", "title", "", "subtitle", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animationAsset", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "disclosureDialog", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/EntryResource;", "Lcom/robinhood/staticcontent/model/disclosure/Disclosure;", "animationPortionUnderSubtitle", "", "loopAnimation", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;FZ)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimationAsset", "getDisclosure", "getDisclosureDialog", "()Lcom/robinhood/contentful/model/ResourceLink;", "getAnimationPortionUnderSubtitle", "()F", "getLoopAnimation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationFeaturePage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationFeaturePage> CREATOR = new Creator();
    private final String animationAsset;
    private final float animationPortionUnderSubtitle;
    private final String disclosure;
    private final ResourceLink<EntryResource<Disclosure>> disclosureDialog;
    private final boolean loopAnimation;
    private final MarkdownContent subtitle;
    private final String title;

    /* compiled from: UiRhyMigrationFeaturePage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationFeaturePage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationFeaturePage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiRhyMigrationFeaturePage(parcel.readString(), (MarkdownContent) parcel.readParcelable(UiRhyMigrationFeaturePage.class.getClassLoader()), parcel.readString(), parcel.readString(), (ResourceLink) parcel.readParcelable(UiRhyMigrationFeaturePage.class.getClassLoader()), parcel.readFloat(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationFeaturePage[] newArray(int i) {
            return new UiRhyMigrationFeaturePage[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationFeaturePage copy$default(UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage, String str, MarkdownContent markdownContent, String str2, String str3, ResourceLink resourceLink, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationFeaturePage.title;
        }
        if ((i & 2) != 0) {
            markdownContent = uiRhyMigrationFeaturePage.subtitle;
        }
        if ((i & 4) != 0) {
            str2 = uiRhyMigrationFeaturePage.animationAsset;
        }
        if ((i & 8) != 0) {
            str3 = uiRhyMigrationFeaturePage.disclosure;
        }
        if ((i & 16) != 0) {
            resourceLink = uiRhyMigrationFeaturePage.disclosureDialog;
        }
        if ((i & 32) != 0) {
            f = uiRhyMigrationFeaturePage.animationPortionUnderSubtitle;
        }
        if ((i & 64) != 0) {
            z = uiRhyMigrationFeaturePage.loopAnimation;
        }
        float f2 = f;
        boolean z2 = z;
        ResourceLink resourceLink2 = resourceLink;
        String str4 = str2;
        return uiRhyMigrationFeaturePage.copy(str, markdownContent, str4, str3, resourceLink2, f2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MarkdownContent getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAnimationAsset() {
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

    public final UiRhyMigrationFeaturePage copy(String title, MarkdownContent subtitle, String animationAsset, String disclosure, ResourceLink<EntryResource<Disclosure>> disclosureDialog, float animationPortionUnderSubtitle, boolean loopAnimation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new UiRhyMigrationFeaturePage(title, subtitle, animationAsset, disclosure, disclosureDialog, animationPortionUnderSubtitle, loopAnimation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationFeaturePage)) {
            return false;
        }
        UiRhyMigrationFeaturePage uiRhyMigrationFeaturePage = (UiRhyMigrationFeaturePage) other;
        return Intrinsics.areEqual(this.title, uiRhyMigrationFeaturePage.title) && Intrinsics.areEqual(this.subtitle, uiRhyMigrationFeaturePage.subtitle) && Intrinsics.areEqual(this.animationAsset, uiRhyMigrationFeaturePage.animationAsset) && Intrinsics.areEqual(this.disclosure, uiRhyMigrationFeaturePage.disclosure) && Intrinsics.areEqual(this.disclosureDialog, uiRhyMigrationFeaturePage.disclosureDialog) && Float.compare(this.animationPortionUnderSubtitle, uiRhyMigrationFeaturePage.animationPortionUnderSubtitle) == 0 && this.loopAnimation == uiRhyMigrationFeaturePage.loopAnimation;
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.animationAsset.hashCode()) * 31;
        String str = this.disclosure;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ResourceLink<EntryResource<Disclosure>> resourceLink = this.disclosureDialog;
        return ((((iHashCode2 + (resourceLink != null ? resourceLink.hashCode() : 0)) * 31) + Float.hashCode(this.animationPortionUnderSubtitle)) * 31) + Boolean.hashCode(this.loopAnimation);
    }

    public String toString() {
        return "UiRhyMigrationFeaturePage(title=" + this.title + ", subtitle=" + this.subtitle + ", animationAsset=" + this.animationAsset + ", disclosure=" + this.disclosure + ", disclosureDialog=" + this.disclosureDialog + ", animationPortionUnderSubtitle=" + this.animationPortionUnderSubtitle + ", loopAnimation=" + this.loopAnimation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeString(this.animationAsset);
        dest.writeString(this.disclosure);
        dest.writeParcelable(this.disclosureDialog, flags);
        dest.writeFloat(this.animationPortionUnderSubtitle);
        dest.writeInt(this.loopAnimation ? 1 : 0);
    }

    public UiRhyMigrationFeaturePage(String title, MarkdownContent subtitle, String animationAsset, String str, ResourceLink<EntryResource<Disclosure>> resourceLink, float f, boolean z) {
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

    public final String getAnimationAsset() {
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

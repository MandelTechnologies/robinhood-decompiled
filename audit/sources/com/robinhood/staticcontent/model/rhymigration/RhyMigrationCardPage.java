package com.robinhood.staticcontent.model.rhymigration;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ResourceLink;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyMigrationCardPage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001b\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/rhymigration/RhyMigrationCardPage;", "Landroid/os/Parcelable;", "title", "", "subtitle", "primaryCtaTitle", "secondaryCtaTitle", "animationAsset", "Lcom/robinhood/contentful/model/ResourceLink;", "Lcom/robinhood/contentful/model/AssetResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/contentful/model/ResourceLink;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCtaTitle", "getSecondaryCtaTitle", "getAnimationAsset", "()Lcom/robinhood/contentful/model/ResourceLink;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class RhyMigrationCardPage implements Parcelable {
    public static final Parcelable.Creator<RhyMigrationCardPage> CREATOR = new Creator();
    private final ResourceLink<AssetResource<?>> animationAsset;
    private final String primaryCtaTitle;
    private final String secondaryCtaTitle;
    private final String subtitle;
    private final String title;

    /* compiled from: RhyMigrationCardPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Creator implements Parcelable.Creator<RhyMigrationCardPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyMigrationCardPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RhyMigrationCardPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ResourceLink) parcel.readParcelable(RhyMigrationCardPage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RhyMigrationCardPage[] newArray(int i) {
            return new RhyMigrationCardPage[i];
        }
    }

    public static /* synthetic */ RhyMigrationCardPage copy$default(RhyMigrationCardPage rhyMigrationCardPage, String str, String str2, String str3, String str4, ResourceLink resourceLink, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rhyMigrationCardPage.title;
        }
        if ((i & 2) != 0) {
            str2 = rhyMigrationCardPage.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = rhyMigrationCardPage.primaryCtaTitle;
        }
        if ((i & 8) != 0) {
            str4 = rhyMigrationCardPage.secondaryCtaTitle;
        }
        if ((i & 16) != 0) {
            resourceLink = rhyMigrationCardPage.animationAsset;
        }
        ResourceLink resourceLink2 = resourceLink;
        String str5 = str3;
        return rhyMigrationCardPage.copy(str, str2, str5, str4, resourceLink2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPrimaryCtaTitle() {
        return this.primaryCtaTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    public final ResourceLink<AssetResource<?>> component5() {
        return this.animationAsset;
    }

    public final RhyMigrationCardPage copy(String title, String subtitle, String primaryCtaTitle, String secondaryCtaTitle, ResourceLink<AssetResource<?>> animationAsset) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        Intrinsics.checkNotNullParameter(secondaryCtaTitle, "secondaryCtaTitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new RhyMigrationCardPage(title, subtitle, primaryCtaTitle, secondaryCtaTitle, animationAsset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyMigrationCardPage)) {
            return false;
        }
        RhyMigrationCardPage rhyMigrationCardPage = (RhyMigrationCardPage) other;
        return Intrinsics.areEqual(this.title, rhyMigrationCardPage.title) && Intrinsics.areEqual(this.subtitle, rhyMigrationCardPage.subtitle) && Intrinsics.areEqual(this.primaryCtaTitle, rhyMigrationCardPage.primaryCtaTitle) && Intrinsics.areEqual(this.secondaryCtaTitle, rhyMigrationCardPage.secondaryCtaTitle) && Intrinsics.areEqual(this.animationAsset, rhyMigrationCardPage.animationAsset);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryCtaTitle.hashCode()) * 31) + this.secondaryCtaTitle.hashCode()) * 31) + this.animationAsset.hashCode();
    }

    public String toString() {
        return "RhyMigrationCardPage(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCtaTitle=" + this.primaryCtaTitle + ", secondaryCtaTitle=" + this.secondaryCtaTitle + ", animationAsset=" + this.animationAsset + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.primaryCtaTitle);
        dest.writeString(this.secondaryCtaTitle);
        dest.writeParcelable(this.animationAsset, flags);
    }

    public RhyMigrationCardPage(String title, String subtitle, String primaryCtaTitle, String secondaryCtaTitle, ResourceLink<AssetResource<?>> animationAsset) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        Intrinsics.checkNotNullParameter(secondaryCtaTitle, "secondaryCtaTitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        this.title = title;
        this.subtitle = subtitle;
        this.primaryCtaTitle = primaryCtaTitle;
        this.secondaryCtaTitle = secondaryCtaTitle;
        this.animationAsset = animationAsset;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPrimaryCtaTitle() {
        return this.primaryCtaTitle;
    }

    public final String getSecondaryCtaTitle() {
        return this.secondaryCtaTitle;
    }

    public final ResourceLink<AssetResource<?>> getAnimationAsset() {
        return this.animationAsset;
    }
}

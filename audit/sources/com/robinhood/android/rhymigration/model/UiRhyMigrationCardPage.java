package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationCardPage.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCardPage;", "Landroid/os/Parcelable;", "title", "", "subtitle", "primaryCtaTitle", "secondaryCtaTitle", "animationAsset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCtaTitle", "getSecondaryCtaTitle", "getAnimationAsset", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationCardPage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UiRhyMigrationCardPage> CREATOR = new Creator();
    private final String animationAsset;
    private final String primaryCtaTitle;
    private final String secondaryCtaTitle;
    private final String subtitle;
    private final String title;

    /* compiled from: UiRhyMigrationCardPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationCardPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCardPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiRhyMigrationCardPage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCardPage[] newArray(int i) {
            return new UiRhyMigrationCardPage[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationCardPage copy$default(UiRhyMigrationCardPage uiRhyMigrationCardPage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationCardPage.title;
        }
        if ((i & 2) != 0) {
            str2 = uiRhyMigrationCardPage.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = uiRhyMigrationCardPage.primaryCtaTitle;
        }
        if ((i & 8) != 0) {
            str4 = uiRhyMigrationCardPage.secondaryCtaTitle;
        }
        if ((i & 16) != 0) {
            str5 = uiRhyMigrationCardPage.animationAsset;
        }
        String str6 = str5;
        String str7 = str3;
        return uiRhyMigrationCardPage.copy(str, str2, str7, str4, str6);
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

    /* renamed from: component5, reason: from getter */
    public final String getAnimationAsset() {
        return this.animationAsset;
    }

    public final UiRhyMigrationCardPage copy(String title, String subtitle, String primaryCtaTitle, String secondaryCtaTitle, String animationAsset) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        Intrinsics.checkNotNullParameter(secondaryCtaTitle, "secondaryCtaTitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new UiRhyMigrationCardPage(title, subtitle, primaryCtaTitle, secondaryCtaTitle, animationAsset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationCardPage)) {
            return false;
        }
        UiRhyMigrationCardPage uiRhyMigrationCardPage = (UiRhyMigrationCardPage) other;
        return Intrinsics.areEqual(this.title, uiRhyMigrationCardPage.title) && Intrinsics.areEqual(this.subtitle, uiRhyMigrationCardPage.subtitle) && Intrinsics.areEqual(this.primaryCtaTitle, uiRhyMigrationCardPage.primaryCtaTitle) && Intrinsics.areEqual(this.secondaryCtaTitle, uiRhyMigrationCardPage.secondaryCtaTitle) && Intrinsics.areEqual(this.animationAsset, uiRhyMigrationCardPage.animationAsset);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryCtaTitle.hashCode()) * 31) + this.secondaryCtaTitle.hashCode()) * 31) + this.animationAsset.hashCode();
    }

    public String toString() {
        return "UiRhyMigrationCardPage(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCtaTitle=" + this.primaryCtaTitle + ", secondaryCtaTitle=" + this.secondaryCtaTitle + ", animationAsset=" + this.animationAsset + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.primaryCtaTitle);
        dest.writeString(this.secondaryCtaTitle);
        dest.writeString(this.animationAsset);
    }

    public UiRhyMigrationCardPage(String title, String subtitle, String primaryCtaTitle, String secondaryCtaTitle, String animationAsset) {
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

    public final String getAnimationAsset() {
        return this.animationAsset;
    }
}

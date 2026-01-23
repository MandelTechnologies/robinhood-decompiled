package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationContrastPage.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0006\u00102\u001a\u000203J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u000203HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000203R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006?"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationContrastPage;", "Landroid/os/Parcelable;", "title", "", "subtitle", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "animationAsset", "animationAssetDark", "animationAssetSmallDevice", "animationAssetSmallDeviceDark", "combinedToSeparateTransition", "Lcom/robinhood/android/rhymigration/model/Bound;", "separateToCombinedTransition", "combinedLoop", "separateLoop", "primaryCtaText", "secondaryCtaText", "secondaryCtaDeeplink", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/rhymigration/model/Bound;Lcom/robinhood/android/rhymigration/model/Bound;Lcom/robinhood/android/rhymigration/model/Bound;Lcom/robinhood/android/rhymigration/model/Bound;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "getAnimationAsset", "getAnimationAssetDark", "getAnimationAssetSmallDevice", "getAnimationAssetSmallDeviceDark", "getCombinedToSeparateTransition", "()Lcom/robinhood/android/rhymigration/model/Bound;", "getSeparateToCombinedTransition", "getCombinedLoop", "getSeparateLoop", "getPrimaryCtaText", "getSecondaryCtaText", "getSecondaryCtaDeeplink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationContrastPage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationContrastPage> CREATOR = new Creator();
    private final String animationAsset;
    private final String animationAssetDark;
    private final String animationAssetSmallDevice;
    private final String animationAssetSmallDeviceDark;
    private final Bound combinedLoop;
    private final Bound combinedToSeparateTransition;
    private final String primaryCtaText;
    private final String secondaryCtaDeeplink;
    private final String secondaryCtaText;
    private final Bound separateLoop;
    private final Bound separateToCombinedTransition;
    private final MarkdownContent subtitle;
    private final String title;

    /* compiled from: UiRhyMigrationContrastPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationContrastPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationContrastPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            MarkdownContent markdownContent = (MarkdownContent) parcel.readParcelable(UiRhyMigrationContrastPage.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Parcelable.Creator<Bound> creator = Bound.CREATOR;
            return new UiRhyMigrationContrastPage(string2, markdownContent, string3, string4, string5, string6, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationContrastPage[] newArray(int i) {
            return new UiRhyMigrationContrastPage[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationContrastPage copy$default(UiRhyMigrationContrastPage uiRhyMigrationContrastPage, String str, MarkdownContent markdownContent, String str2, String str3, String str4, String str5, Bound bound, Bound bound2, Bound bound3, Bound bound4, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationContrastPage.title;
        }
        return uiRhyMigrationContrastPage.copy(str, (i & 2) != 0 ? uiRhyMigrationContrastPage.subtitle : markdownContent, (i & 4) != 0 ? uiRhyMigrationContrastPage.animationAsset : str2, (i & 8) != 0 ? uiRhyMigrationContrastPage.animationAssetDark : str3, (i & 16) != 0 ? uiRhyMigrationContrastPage.animationAssetSmallDevice : str4, (i & 32) != 0 ? uiRhyMigrationContrastPage.animationAssetSmallDeviceDark : str5, (i & 64) != 0 ? uiRhyMigrationContrastPage.combinedToSeparateTransition : bound, (i & 128) != 0 ? uiRhyMigrationContrastPage.separateToCombinedTransition : bound2, (i & 256) != 0 ? uiRhyMigrationContrastPage.combinedLoop : bound3, (i & 512) != 0 ? uiRhyMigrationContrastPage.separateLoop : bound4, (i & 1024) != 0 ? uiRhyMigrationContrastPage.primaryCtaText : str6, (i & 2048) != 0 ? uiRhyMigrationContrastPage.secondaryCtaText : str7, (i & 4096) != 0 ? uiRhyMigrationContrastPage.secondaryCtaDeeplink : str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Bound getSeparateLoop() {
        return this.separateLoop;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
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
    public final String getAnimationAssetDark() {
        return this.animationAssetDark;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAnimationAssetSmallDevice() {
        return this.animationAssetSmallDevice;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAnimationAssetSmallDeviceDark() {
        return this.animationAssetSmallDeviceDark;
    }

    /* renamed from: component7, reason: from getter */
    public final Bound getCombinedToSeparateTransition() {
        return this.combinedToSeparateTransition;
    }

    /* renamed from: component8, reason: from getter */
    public final Bound getSeparateToCombinedTransition() {
        return this.separateToCombinedTransition;
    }

    /* renamed from: component9, reason: from getter */
    public final Bound getCombinedLoop() {
        return this.combinedLoop;
    }

    public final UiRhyMigrationContrastPage copy(String title, MarkdownContent subtitle, String animationAsset, String animationAssetDark, String animationAssetSmallDevice, String animationAssetSmallDeviceDark, Bound combinedToSeparateTransition, Bound separateToCombinedTransition, Bound combinedLoop, Bound separateLoop, String primaryCtaText, String secondaryCtaText, String secondaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(animationAssetDark, "animationAssetDark");
        Intrinsics.checkNotNullParameter(animationAssetSmallDevice, "animationAssetSmallDevice");
        Intrinsics.checkNotNullParameter(animationAssetSmallDeviceDark, "animationAssetSmallDeviceDark");
        Intrinsics.checkNotNullParameter(combinedToSeparateTransition, "combinedToSeparateTransition");
        Intrinsics.checkNotNullParameter(separateToCombinedTransition, "separateToCombinedTransition");
        Intrinsics.checkNotNullParameter(combinedLoop, "combinedLoop");
        Intrinsics.checkNotNullParameter(separateLoop, "separateLoop");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaDeeplink, "secondaryCtaDeeplink");
        return new UiRhyMigrationContrastPage(title, subtitle, animationAsset, animationAssetDark, animationAssetSmallDevice, animationAssetSmallDeviceDark, combinedToSeparateTransition, separateToCombinedTransition, combinedLoop, separateLoop, primaryCtaText, secondaryCtaText, secondaryCtaDeeplink);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationContrastPage)) {
            return false;
        }
        UiRhyMigrationContrastPage uiRhyMigrationContrastPage = (UiRhyMigrationContrastPage) other;
        return Intrinsics.areEqual(this.title, uiRhyMigrationContrastPage.title) && Intrinsics.areEqual(this.subtitle, uiRhyMigrationContrastPage.subtitle) && Intrinsics.areEqual(this.animationAsset, uiRhyMigrationContrastPage.animationAsset) && Intrinsics.areEqual(this.animationAssetDark, uiRhyMigrationContrastPage.animationAssetDark) && Intrinsics.areEqual(this.animationAssetSmallDevice, uiRhyMigrationContrastPage.animationAssetSmallDevice) && Intrinsics.areEqual(this.animationAssetSmallDeviceDark, uiRhyMigrationContrastPage.animationAssetSmallDeviceDark) && Intrinsics.areEqual(this.combinedToSeparateTransition, uiRhyMigrationContrastPage.combinedToSeparateTransition) && Intrinsics.areEqual(this.separateToCombinedTransition, uiRhyMigrationContrastPage.separateToCombinedTransition) && Intrinsics.areEqual(this.combinedLoop, uiRhyMigrationContrastPage.combinedLoop) && Intrinsics.areEqual(this.separateLoop, uiRhyMigrationContrastPage.separateLoop) && Intrinsics.areEqual(this.primaryCtaText, uiRhyMigrationContrastPage.primaryCtaText) && Intrinsics.areEqual(this.secondaryCtaText, uiRhyMigrationContrastPage.secondaryCtaText) && Intrinsics.areEqual(this.secondaryCtaDeeplink, uiRhyMigrationContrastPage.secondaryCtaDeeplink);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.animationAsset.hashCode()) * 31) + this.animationAssetDark.hashCode()) * 31) + this.animationAssetSmallDevice.hashCode()) * 31) + this.animationAssetSmallDeviceDark.hashCode()) * 31) + this.combinedToSeparateTransition.hashCode()) * 31) + this.separateToCombinedTransition.hashCode()) * 31) + this.combinedLoop.hashCode()) * 31) + this.separateLoop.hashCode()) * 31) + this.primaryCtaText.hashCode()) * 31) + this.secondaryCtaText.hashCode()) * 31) + this.secondaryCtaDeeplink.hashCode();
    }

    public String toString() {
        return "UiRhyMigrationContrastPage(title=" + this.title + ", subtitle=" + this.subtitle + ", animationAsset=" + this.animationAsset + ", animationAssetDark=" + this.animationAssetDark + ", animationAssetSmallDevice=" + this.animationAssetSmallDevice + ", animationAssetSmallDeviceDark=" + this.animationAssetSmallDeviceDark + ", combinedToSeparateTransition=" + this.combinedToSeparateTransition + ", separateToCombinedTransition=" + this.separateToCombinedTransition + ", combinedLoop=" + this.combinedLoop + ", separateLoop=" + this.separateLoop + ", primaryCtaText=" + this.primaryCtaText + ", secondaryCtaText=" + this.secondaryCtaText + ", secondaryCtaDeeplink=" + this.secondaryCtaDeeplink + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeParcelable(this.subtitle, flags);
        dest.writeString(this.animationAsset);
        dest.writeString(this.animationAssetDark);
        dest.writeString(this.animationAssetSmallDevice);
        dest.writeString(this.animationAssetSmallDeviceDark);
        this.combinedToSeparateTransition.writeToParcel(dest, flags);
        this.separateToCombinedTransition.writeToParcel(dest, flags);
        this.combinedLoop.writeToParcel(dest, flags);
        this.separateLoop.writeToParcel(dest, flags);
        dest.writeString(this.primaryCtaText);
        dest.writeString(this.secondaryCtaText);
        dest.writeString(this.secondaryCtaDeeplink);
    }

    public UiRhyMigrationContrastPage(String title, MarkdownContent subtitle, String animationAsset, String animationAssetDark, String animationAssetSmallDevice, String animationAssetSmallDeviceDark, Bound combinedToSeparateTransition, Bound separateToCombinedTransition, Bound combinedLoop, Bound separateLoop, String primaryCtaText, String secondaryCtaText, String secondaryCtaDeeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(animationAssetDark, "animationAssetDark");
        Intrinsics.checkNotNullParameter(animationAssetSmallDevice, "animationAssetSmallDevice");
        Intrinsics.checkNotNullParameter(animationAssetSmallDeviceDark, "animationAssetSmallDeviceDark");
        Intrinsics.checkNotNullParameter(combinedToSeparateTransition, "combinedToSeparateTransition");
        Intrinsics.checkNotNullParameter(separateToCombinedTransition, "separateToCombinedTransition");
        Intrinsics.checkNotNullParameter(combinedLoop, "combinedLoop");
        Intrinsics.checkNotNullParameter(separateLoop, "separateLoop");
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaText, "secondaryCtaText");
        Intrinsics.checkNotNullParameter(secondaryCtaDeeplink, "secondaryCtaDeeplink");
        this.title = title;
        this.subtitle = subtitle;
        this.animationAsset = animationAsset;
        this.animationAssetDark = animationAssetDark;
        this.animationAssetSmallDevice = animationAssetSmallDevice;
        this.animationAssetSmallDeviceDark = animationAssetSmallDeviceDark;
        this.combinedToSeparateTransition = combinedToSeparateTransition;
        this.separateToCombinedTransition = separateToCombinedTransition;
        this.combinedLoop = combinedLoop;
        this.separateLoop = separateLoop;
        this.primaryCtaText = primaryCtaText;
        this.secondaryCtaText = secondaryCtaText;
        this.secondaryCtaDeeplink = secondaryCtaDeeplink;
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

    public final String getAnimationAssetDark() {
        return this.animationAssetDark;
    }

    public final String getAnimationAssetSmallDevice() {
        return this.animationAssetSmallDevice;
    }

    public final String getAnimationAssetSmallDeviceDark() {
        return this.animationAssetSmallDeviceDark;
    }

    public final Bound getCombinedToSeparateTransition() {
        return this.combinedToSeparateTransition;
    }

    public final Bound getSeparateToCombinedTransition() {
        return this.separateToCombinedTransition;
    }

    public final Bound getCombinedLoop() {
        return this.combinedLoop;
    }

    public final Bound getSeparateLoop() {
        return this.separateLoop;
    }

    public final String getPrimaryCtaText() {
        return this.primaryCtaText;
    }

    public final String getSecondaryCtaText() {
        return this.secondaryCtaText;
    }

    public final String getSecondaryCtaDeeplink() {
        return this.secondaryCtaDeeplink;
    }
}

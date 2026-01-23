package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.staticcontent.model.TitleAndBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationReviewPage.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Je\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\"\u001a\u00020#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020#HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationReviewPage;", "Landroid/os/Parcelable;", "ctaTitle", "", "faqTitle", "showAllLink", "showAllTitle", "title", "dropdowns", "", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "valueProps", "animationAsset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCtaTitle", "()Ljava/lang/String;", "getFaqTitle", "getShowAllLink", "getShowAllTitle", "getTitle", "getDropdowns", "()Ljava/util/List;", "getValueProps", "getAnimationAsset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationReviewPage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationReviewPage> CREATOR = new Creator();
    private final String animationAsset;
    private final String ctaTitle;
    private final List<TitleAndBody> dropdowns;
    private final String faqTitle;
    private final String showAllLink;
    private final String showAllTitle;
    private final String title;
    private final List<TitleAndBody> valueProps;

    /* compiled from: UiRhyMigrationReviewPage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationReviewPage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationReviewPage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(UiRhyMigrationReviewPage.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(UiRhyMigrationReviewPage.class.getClassLoader()));
            }
            return new UiRhyMigrationReviewPage(string2, string3, string4, string5, string6, arrayList, arrayList2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationReviewPage[] newArray(int i) {
            return new UiRhyMigrationReviewPage[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationReviewPage copy$default(UiRhyMigrationReviewPage uiRhyMigrationReviewPage, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationReviewPage.ctaTitle;
        }
        if ((i & 2) != 0) {
            str2 = uiRhyMigrationReviewPage.faqTitle;
        }
        if ((i & 4) != 0) {
            str3 = uiRhyMigrationReviewPage.showAllLink;
        }
        if ((i & 8) != 0) {
            str4 = uiRhyMigrationReviewPage.showAllTitle;
        }
        if ((i & 16) != 0) {
            str5 = uiRhyMigrationReviewPage.title;
        }
        if ((i & 32) != 0) {
            list = uiRhyMigrationReviewPage.dropdowns;
        }
        if ((i & 64) != 0) {
            list2 = uiRhyMigrationReviewPage.valueProps;
        }
        if ((i & 128) != 0) {
            str6 = uiRhyMigrationReviewPage.animationAsset;
        }
        List list3 = list2;
        String str7 = str6;
        String str8 = str5;
        List list4 = list;
        return uiRhyMigrationReviewPage.copy(str, str2, str3, str4, str8, list4, list3, str7);
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

    public final List<TitleAndBody> component6() {
        return this.dropdowns;
    }

    public final List<TitleAndBody> component7() {
        return this.valueProps;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAnimationAsset() {
        return this.animationAsset;
    }

    public final UiRhyMigrationReviewPage copy(String ctaTitle, String faqTitle, String showAllLink, String showAllTitle, String title, List<TitleAndBody> dropdowns, List<TitleAndBody> valueProps, String animationAsset) {
        Intrinsics.checkNotNullParameter(ctaTitle, "ctaTitle");
        Intrinsics.checkNotNullParameter(faqTitle, "faqTitle");
        Intrinsics.checkNotNullParameter(showAllLink, "showAllLink");
        Intrinsics.checkNotNullParameter(showAllTitle, "showAllTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dropdowns, "dropdowns");
        Intrinsics.checkNotNullParameter(valueProps, "valueProps");
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        return new UiRhyMigrationReviewPage(ctaTitle, faqTitle, showAllLink, showAllTitle, title, dropdowns, valueProps, animationAsset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationReviewPage)) {
            return false;
        }
        UiRhyMigrationReviewPage uiRhyMigrationReviewPage = (UiRhyMigrationReviewPage) other;
        return Intrinsics.areEqual(this.ctaTitle, uiRhyMigrationReviewPage.ctaTitle) && Intrinsics.areEqual(this.faqTitle, uiRhyMigrationReviewPage.faqTitle) && Intrinsics.areEqual(this.showAllLink, uiRhyMigrationReviewPage.showAllLink) && Intrinsics.areEqual(this.showAllTitle, uiRhyMigrationReviewPage.showAllTitle) && Intrinsics.areEqual(this.title, uiRhyMigrationReviewPage.title) && Intrinsics.areEqual(this.dropdowns, uiRhyMigrationReviewPage.dropdowns) && Intrinsics.areEqual(this.valueProps, uiRhyMigrationReviewPage.valueProps) && Intrinsics.areEqual(this.animationAsset, uiRhyMigrationReviewPage.animationAsset);
    }

    public int hashCode() {
        return (((((((((((((this.ctaTitle.hashCode() * 31) + this.faqTitle.hashCode()) * 31) + this.showAllLink.hashCode()) * 31) + this.showAllTitle.hashCode()) * 31) + this.title.hashCode()) * 31) + this.dropdowns.hashCode()) * 31) + this.valueProps.hashCode()) * 31) + this.animationAsset.hashCode();
    }

    public String toString() {
        return "UiRhyMigrationReviewPage(ctaTitle=" + this.ctaTitle + ", faqTitle=" + this.faqTitle + ", showAllLink=" + this.showAllLink + ", showAllTitle=" + this.showAllTitle + ", title=" + this.title + ", dropdowns=" + this.dropdowns + ", valueProps=" + this.valueProps + ", animationAsset=" + this.animationAsset + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.ctaTitle);
        dest.writeString(this.faqTitle);
        dest.writeString(this.showAllLink);
        dest.writeString(this.showAllTitle);
        dest.writeString(this.title);
        List<TitleAndBody> list = this.dropdowns;
        dest.writeInt(list.size());
        Iterator<TitleAndBody> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<TitleAndBody> list2 = this.valueProps;
        dest.writeInt(list2.size());
        Iterator<TitleAndBody> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.animationAsset);
    }

    public UiRhyMigrationReviewPage(String ctaTitle, String faqTitle, String showAllLink, String showAllTitle, String title, List<TitleAndBody> dropdowns, List<TitleAndBody> valueProps, String animationAsset) {
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

    public final List<TitleAndBody> getDropdowns() {
        return this.dropdowns;
    }

    public final List<TitleAndBody> getValueProps() {
        return this.valueProps;
    }

    public final String getAnimationAsset() {
        return this.animationAsset;
    }
}

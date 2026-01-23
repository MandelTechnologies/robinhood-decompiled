package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.staticcontent.model.TitleAndBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationCmShutdown.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdown;", "Landroid/os/Parcelable;", "title", "", "subtitle", "primaryCtaTitle", "secondaryCtaTitle", "pageFeatures", "", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCtaTitle", "getSecondaryCtaTitle", "getPageFeatures", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationCmShutdown implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiRhyMigrationCmShutdown> CREATOR = new Creator();
    private final List<TitleAndBody> pageFeatures;
    private final String primaryCtaTitle;
    private final String secondaryCtaTitle;
    private final String subtitle;
    private final String title;

    /* compiled from: UiRhyMigrationCmShutdown.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationCmShutdown> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCmShutdown createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(UiRhyMigrationCmShutdown.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new UiRhyMigrationCmShutdown(string2, string3, string4, string5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationCmShutdown[] newArray(int i) {
            return new UiRhyMigrationCmShutdown[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationCmShutdown copy$default(UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationCmShutdown.title;
        }
        if ((i & 2) != 0) {
            str2 = uiRhyMigrationCmShutdown.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = uiRhyMigrationCmShutdown.primaryCtaTitle;
        }
        if ((i & 8) != 0) {
            str4 = uiRhyMigrationCmShutdown.secondaryCtaTitle;
        }
        if ((i & 16) != 0) {
            list = uiRhyMigrationCmShutdown.pageFeatures;
        }
        List list2 = list;
        String str5 = str3;
        return uiRhyMigrationCmShutdown.copy(str, str2, str5, str4, list2);
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

    public final List<TitleAndBody> component5() {
        return this.pageFeatures;
    }

    public final UiRhyMigrationCmShutdown copy(String title, String subtitle, String primaryCtaTitle, String secondaryCtaTitle, List<TitleAndBody> pageFeatures) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        return new UiRhyMigrationCmShutdown(title, subtitle, primaryCtaTitle, secondaryCtaTitle, pageFeatures);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationCmShutdown)) {
            return false;
        }
        UiRhyMigrationCmShutdown uiRhyMigrationCmShutdown = (UiRhyMigrationCmShutdown) other;
        return Intrinsics.areEqual(this.title, uiRhyMigrationCmShutdown.title) && Intrinsics.areEqual(this.subtitle, uiRhyMigrationCmShutdown.subtitle) && Intrinsics.areEqual(this.primaryCtaTitle, uiRhyMigrationCmShutdown.primaryCtaTitle) && Intrinsics.areEqual(this.secondaryCtaTitle, uiRhyMigrationCmShutdown.secondaryCtaTitle) && Intrinsics.areEqual(this.pageFeatures, uiRhyMigrationCmShutdown.pageFeatures);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primaryCtaTitle.hashCode()) * 31;
        String str2 = this.secondaryCtaTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<TitleAndBody> list = this.pageFeatures;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UiRhyMigrationCmShutdown(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCtaTitle=" + this.primaryCtaTitle + ", secondaryCtaTitle=" + this.secondaryCtaTitle + ", pageFeatures=" + this.pageFeatures + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.primaryCtaTitle);
        dest.writeString(this.secondaryCtaTitle);
        List<TitleAndBody> list = this.pageFeatures;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<TitleAndBody> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public UiRhyMigrationCmShutdown(String title, String str, String primaryCtaTitle, String str2, List<TitleAndBody> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryCtaTitle, "primaryCtaTitle");
        this.title = title;
        this.subtitle = str;
        this.primaryCtaTitle = primaryCtaTitle;
        this.secondaryCtaTitle = str2;
        this.pageFeatures = list;
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

    public final List<TitleAndBody> getPageFeatures() {
        return this.pageFeatures;
    }
}

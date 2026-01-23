package com.robinhood.staticcontent.model.productmarketing;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: ProductMarketingPictogram.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "Landroid/os/Parcelable;", "<init>", "()V", "Legacy", "Pog", "Remote", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Legacy;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Pog;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Remote;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ProductMarketingPictogram implements Parcelable {
    public /* synthetic */ ProductMarketingPictogram(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductMarketingPictogram() {
    }

    /* compiled from: ProductMarketingPictogram.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u0003J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Legacy;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "dayResId", "", "nightResId", "<init>", "(II)V", "getDayResId", "()I", "getNightResId", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Legacy extends ProductMarketingPictogram {
        public static final Parcelable.Creator<Legacy> CREATOR = new Creator();
        private final int dayResId;
        private final int nightResId;

        /* compiled from: ProductMarketingPictogram.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Legacy> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legacy createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Legacy(parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Legacy[] newArray(int i) {
                return new Legacy[i];
            }
        }

        public static /* synthetic */ Legacy copy$default(Legacy legacy, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = legacy.dayResId;
            }
            if ((i3 & 2) != 0) {
                i2 = legacy.nightResId;
            }
            return legacy.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDayResId() {
            return this.dayResId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNightResId() {
            return this.nightResId;
        }

        public final Legacy copy(int dayResId, int nightResId) {
            return new Legacy(dayResId, nightResId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Legacy)) {
                return false;
            }
            Legacy legacy = (Legacy) other;
            return this.dayResId == legacy.dayResId && this.nightResId == legacy.nightResId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.dayResId) * 31) + Integer.hashCode(this.nightResId);
        }

        public String toString() {
            return "Legacy(dayResId=" + this.dayResId + ", nightResId=" + this.nightResId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.dayResId);
            dest.writeInt(this.nightResId);
        }

        public final int getDayResId() {
            return this.dayResId;
        }

        public final int getNightResId() {
            return this.nightResId;
        }

        public Legacy(int i, int i2) {
            super(null);
            this.dayResId = i;
            this.nightResId = i2;
        }
    }

    /* compiled from: ProductMarketingPictogram.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Pog;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "resId", "", "<init>", "(I)V", "getResId", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Pog extends ProductMarketingPictogram {
        public static final Parcelable.Creator<Pog> CREATOR = new Creator();
        private final int resId;

        /* compiled from: ProductMarketingPictogram.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Pog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pog createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pog(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pog[] newArray(int i) {
                return new Pog[i];
            }
        }

        public static /* synthetic */ Pog copy$default(Pog pog, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pog.resId;
            }
            return pog.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public final Pog copy(int resId) {
            return new Pog(resId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pog) && this.resId == ((Pog) other).resId;
        }

        public int hashCode() {
            return Integer.hashCode(this.resId);
        }

        public String toString() {
            return "Pog(resId=" + this.resId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.resId);
        }

        public final int getResId() {
            return this.resId;
        }

        public Pog(int i) {
            super(null);
            this.resId = i;
        }
    }

    /* compiled from: ProductMarketingPictogram.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Remote;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram;", "name", "", "width", "", "height", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getWidth", "()I", "getHeight", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Remote extends ProductMarketingPictogram {
        private final int height;
        private final String name;
        private final int width;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Remote> CREATOR = new Creator();
        private static final Regex iconKeyRegex = new Regex("(.+?)@([0-9]+)x([0-9]+)");

        /* compiled from: ProductMarketingPictogram.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Remote> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remote createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Remote(parcel.readString(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Remote[] newArray(int i) {
                return new Remote[i];
            }
        }

        public static /* synthetic */ Remote copy$default(Remote remote, String str, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = remote.name;
            }
            if ((i3 & 2) != 0) {
                i = remote.width;
            }
            if ((i3 & 4) != 0) {
                i2 = remote.height;
            }
            return remote.copy(str, i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component3, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        public final Remote copy(String name, int width, int height) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Remote(name, width, height);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remote)) {
                return false;
            }
            Remote remote = (Remote) other;
            return Intrinsics.areEqual(this.name, remote.name) && this.width == remote.width && this.height == remote.height;
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height);
        }

        public String toString() {
            return "Remote(name=" + this.name + ", width=" + this.width + ", height=" + this.height + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name);
            dest.writeInt(this.width);
            dest.writeInt(this.height);
        }

        public final String getName() {
            return this.name;
        }

        public final int getWidth() {
            return this.width;
        }

        public final int getHeight() {
            return this.height;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remote(String name, int i, int i2) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.width = i;
            this.height = i2;
        }

        /* compiled from: ProductMarketingPictogram.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Remote$Companion;", "", "<init>", "()V", "iconKeyRegex", "Lkotlin/text/Regex;", "fromIconKey", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingPictogram$Remote;", "iconKey", "", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Remote fromIconKey(String iconKey) {
                MatchResult matchResultMatchEntire;
                if (iconKey == null || (matchResultMatchEntire = Remote.iconKeyRegex.matchEntire(iconKey)) == null) {
                    return null;
                }
                MatchResult.Destructured destructured = matchResultMatchEntire.getDestructured();
                return new Remote(destructured.getMatch().getGroupValues().get(1), Integer.parseInt(destructured.getMatch().getGroupValues().get(2)), Integer.parseInt(destructured.getMatch().getGroupValues().get(3)));
            }
        }
    }
}

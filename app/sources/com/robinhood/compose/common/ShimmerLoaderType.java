package com.robinhood.compose.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShimmerLoaderType.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType;", "Landroid/os/Parcelable;", "<init>", "()V", "Generic", "List", "Boxes", "Hero", "Text", "Promo", "Empty", "Defaults", "Lcom/robinhood/compose/common/ShimmerLoaderType$Boxes;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Empty;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Generic;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero;", "Lcom/robinhood/compose/common/ShimmerLoaderType$List;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Promo;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Text;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public abstract class ShimmerLoaderType implements Parcelable {
    public static final int $stable = 0;
    public static final float HERO_FIXED_SIZE = 250.0f;
    public static final float HERO_RELATIVE_SIZE = 0.5f;
    public static final int LIST_NUM_ROWS = 5;
    public static final int PROMO_NUM_BUTTONS = 2;

    public /* synthetic */ ShimmerLoaderType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ShimmerLoaderType() {
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Generic;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "includeBottomButton", "", "<init>", "(Z)V", "getIncludeBottomButton", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Generic extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Generic> CREATOR = new Creator();
        private final boolean includeBottomButton;

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Generic> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Generic createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Generic(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Generic[] newArray(int i) {
                return new Generic[i];
            }
        }

        public Generic() {
            this(false, 1, null);
        }

        public static /* synthetic */ Generic copy$default(Generic generic, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = generic.includeBottomButton;
            }
            return generic.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        public final Generic copy(boolean includeBottomButton) {
            return new Generic(includeBottomButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Generic) && this.includeBottomButton == ((Generic) other).includeBottomButton;
        }

        public int hashCode() {
            return Boolean.hashCode(this.includeBottomButton);
        }

        public String toString() {
            return "Generic(includeBottomButton=" + this.includeBottomButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.includeBottomButton ? 1 : 0);
        }

        public Generic(boolean z) {
            super(null);
            this.includeBottomButton = z;
        }

        public /* synthetic */ Generic(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0006J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$List;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "includeHeader", "", "includeBottomButton", "numberOfRows", "", "<init>", "(ZZI)V", "getIncludeHeader", "()Z", "getIncludeBottomButton", "getNumberOfRows", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class List extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<List> CREATOR = new Creator();
        private final boolean includeBottomButton;
        private final boolean includeHeader;
        private final int numberOfRows;

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<List> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final List createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new List(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final List[] newArray(int i) {
                return new List[i];
            }
        }

        public List() {
            this(false, false, 0, 7, null);
        }

        public static /* synthetic */ List copy$default(List list, boolean z, boolean z2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = list.includeHeader;
            }
            if ((i2 & 2) != 0) {
                z2 = list.includeBottomButton;
            }
            if ((i2 & 4) != 0) {
                i = list.numberOfRows;
            }
            return list.copy(z, z2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIncludeHeader() {
            return this.includeHeader;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNumberOfRows() {
            return this.numberOfRows;
        }

        public final List copy(boolean includeHeader, boolean includeBottomButton, int numberOfRows) {
            return new List(includeHeader, includeBottomButton, numberOfRows);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof List)) {
                return false;
            }
            List list = (List) other;
            return this.includeHeader == list.includeHeader && this.includeBottomButton == list.includeBottomButton && this.numberOfRows == list.numberOfRows;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.includeHeader) * 31) + Boolean.hashCode(this.includeBottomButton)) * 31) + Integer.hashCode(this.numberOfRows);
        }

        public String toString() {
            return "List(includeHeader=" + this.includeHeader + ", includeBottomButton=" + this.includeBottomButton + ", numberOfRows=" + this.numberOfRows + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.includeHeader ? 1 : 0);
            dest.writeInt(this.includeBottomButton ? 1 : 0);
            dest.writeInt(this.numberOfRows);
        }

        public /* synthetic */ List(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 5 : i);
        }

        public final boolean getIncludeHeader() {
            return this.includeHeader;
        }

        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        public final int getNumberOfRows() {
            return this.numberOfRows;
        }

        public List(boolean z, boolean z2, int i) {
            super(null);
            this.includeHeader = z;
            this.includeBottomButton = z2;
            this.numberOfRows = i;
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Boxes;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Boxes extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Boxes INSTANCE = new Boxes();
        public static final Parcelable.Creator<Boxes> CREATOR = new Creator();

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Boxes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Boxes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Boxes.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Boxes[] newArray(int i) {
                return new Boxes[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Boxes);
        }

        public int hashCode() {
            return -1106822617;
        }

        public String toString() {
            return "Boxes";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Boxes() {
            super(null);
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006 "}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Hero;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "includeRows", "", "includeBottomButton", "size", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "<init>", "(ZZLcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;)V", "getIncludeRows", "()Z", "getIncludeBottomButton", "getSize", "()Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Size", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Hero extends ShimmerLoaderType {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Hero> CREATOR = new Creator();
        private final boolean includeBottomButton;
        private final boolean includeRows;
        private final Size size;

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Hero> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hero createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Hero(parcel.readInt() != 0, parcel.readInt() != 0, (Size) parcel.readParcelable(Hero.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hero[] newArray(int i) {
                return new Hero[i];
            }
        }

        public Hero() {
            this(false, false, null, 7, null);
        }

        public static /* synthetic */ Hero copy$default(Hero hero, boolean z, boolean z2, Size size, int i, Object obj) {
            if ((i & 1) != 0) {
                z = hero.includeRows;
            }
            if ((i & 2) != 0) {
                z2 = hero.includeBottomButton;
            }
            if ((i & 4) != 0) {
                size = hero.size;
            }
            return hero.copy(z, z2, size);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIncludeRows() {
            return this.includeRows;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        public final Hero copy(boolean includeRows, boolean includeBottomButton, Size size) {
            Intrinsics.checkNotNullParameter(size, "size");
            return new Hero(includeRows, includeBottomButton, size);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hero)) {
                return false;
            }
            Hero hero = (Hero) other;
            return this.includeRows == hero.includeRows && this.includeBottomButton == hero.includeBottomButton && Intrinsics.areEqual(this.size, hero.size);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.includeRows) * 31) + Boolean.hashCode(this.includeBottomButton)) * 31) + this.size.hashCode();
        }

        public String toString() {
            return "Hero(includeRows=" + this.includeRows + ", includeBottomButton=" + this.includeBottomButton + ", size=" + this.size + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.includeRows ? 1 : 0);
            dest.writeInt(this.includeBottomButton ? 1 : 0);
            dest.writeParcelable(this.size, flags);
        }

        public final boolean getIncludeRows() {
            return this.includeRows;
        }

        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        public /* synthetic */ Hero(boolean z, boolean z2, Size size, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? new Size.Fixed(0.0f, 1, null) : size);
        }

        public final Size getSize() {
            return this.size;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Hero(boolean z, boolean z2, Size size) {
            super(null);
            Intrinsics.checkNotNullParameter(size, "size");
            this.includeRows = z;
            this.includeBottomButton = z2;
            this.size = size;
        }

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "Landroid/os/Parcelable;", "Fixed", "Relative", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size$Fixed;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size$Relative;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Size extends Parcelable {

            /* compiled from: ShimmerLoaderType.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size$Fixed;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "heightDp", "", "<init>", "(F)V", "getHeightDp", "()F", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Fixed implements Size {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Fixed> CREATOR = new Creator();
                private final float heightDp;

                /* compiled from: ShimmerLoaderType.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Fixed> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Fixed createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Fixed(parcel.readFloat());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Fixed[] newArray(int i) {
                        return new Fixed[i];
                    }
                }

                public Fixed() {
                    this(0.0f, 1, null);
                }

                public static /* synthetic */ Fixed copy$default(Fixed fixed, float f, int i, Object obj) {
                    if ((i & 1) != 0) {
                        f = fixed.heightDp;
                    }
                    return fixed.copy(f);
                }

                /* renamed from: component1, reason: from getter */
                public final float getHeightDp() {
                    return this.heightDp;
                }

                public final Fixed copy(float heightDp) {
                    return new Fixed(heightDp);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Fixed) && Float.compare(this.heightDp, ((Fixed) other).heightDp) == 0;
                }

                public int hashCode() {
                    return Float.hashCode(this.heightDp);
                }

                public String toString() {
                    return "Fixed(heightDp=" + this.heightDp + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeFloat(this.heightDp);
                }

                public Fixed(float f) {
                    this.heightDp = f;
                }

                public /* synthetic */ Fixed(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? 250.0f : f);
                }

                public final float getHeightDp() {
                    return this.heightDp;
                }
            }

            /* compiled from: ShimmerLoaderType.kt */
            @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size$Relative;", "Lcom/robinhood/compose/common/ShimmerLoaderType$Hero$Size;", "fraction", "", "<init>", "(F)V", "getFraction", "()F", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Relative implements Size {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Relative> CREATOR = new Creator();
                private final float fraction;

                /* compiled from: ShimmerLoaderType.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Creator implements Parcelable.Creator<Relative> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Relative createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Relative(parcel.readFloat());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Relative[] newArray(int i) {
                        return new Relative[i];
                    }
                }

                public Relative() {
                    this(0.0f, 1, null);
                }

                public static /* synthetic */ Relative copy$default(Relative relative, float f, int i, Object obj) {
                    if ((i & 1) != 0) {
                        f = relative.fraction;
                    }
                    return relative.copy(f);
                }

                /* renamed from: component1, reason: from getter */
                public final float getFraction() {
                    return this.fraction;
                }

                public final Relative copy(float fraction) {
                    return new Relative(fraction);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Relative) && Float.compare(this.fraction, ((Relative) other).fraction) == 0;
                }

                public int hashCode() {
                    return Float.hashCode(this.fraction);
                }

                public String toString() {
                    return "Relative(fraction=" + this.fraction + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeFloat(this.fraction);
                }

                public Relative(float f) {
                    this.fraction = f;
                }

                public /* synthetic */ Relative(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? 0.5f : f);
                }

                public final float getFraction() {
                    return this.fraction;
                }
            }
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Text;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "includeHeader", "", "includeBottomButton", "<init>", "(ZZ)V", "getIncludeHeader", "()Z", "getIncludeBottomButton", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Text extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Text> CREATOR = new Creator();
        private final boolean includeBottomButton;
        private final boolean includeHeader;

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Text> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i) {
                return new Text[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Text() {
            boolean z = false;
            this(z, z, 3, null);
        }

        public static /* synthetic */ Text copy$default(Text text, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = text.includeHeader;
            }
            if ((i & 2) != 0) {
                z2 = text.includeBottomButton;
            }
            return text.copy(z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIncludeHeader() {
            return this.includeHeader;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        public final Text copy(boolean includeHeader, boolean includeBottomButton) {
            return new Text(includeHeader, includeBottomButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return this.includeHeader == text.includeHeader && this.includeBottomButton == text.includeBottomButton;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.includeHeader) * 31) + Boolean.hashCode(this.includeBottomButton);
        }

        public String toString() {
            return "Text(includeHeader=" + this.includeHeader + ", includeBottomButton=" + this.includeBottomButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.includeHeader ? 1 : 0);
            dest.writeInt(this.includeBottomButton ? 1 : 0);
        }

        public /* synthetic */ Text(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }

        public final boolean getIncludeHeader() {
            return this.includeHeader;
        }

        public final boolean getIncludeBottomButton() {
            return this.includeBottomButton;
        }

        public Text(boolean z, boolean z2) {
            super(null);
            this.includeHeader = z;
            this.includeBottomButton = z2;
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u0003J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Promo;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "numberOfButtons", "", "<init>", "(I)V", "getNumberOfButtons", "()I", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Promo extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Promo> CREATOR = new Creator();
        private final int numberOfButtons;

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Promo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Promo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Promo(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Promo[] newArray(int i) {
                return new Promo[i];
            }
        }

        public Promo() {
            this(0, 1, null);
        }

        public static /* synthetic */ Promo copy$default(Promo promo, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = promo.numberOfButtons;
            }
            return promo.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumberOfButtons() {
            return this.numberOfButtons;
        }

        public final Promo copy(int numberOfButtons) {
            return new Promo(numberOfButtons);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Promo) && this.numberOfButtons == ((Promo) other).numberOfButtons;
        }

        public int hashCode() {
            return Integer.hashCode(this.numberOfButtons);
        }

        public String toString() {
            return "Promo(numberOfButtons=" + this.numberOfButtons + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.numberOfButtons);
        }

        public /* synthetic */ Promo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i);
        }

        public final int getNumberOfButtons() {
            return this.numberOfButtons;
        }

        public Promo(int i) {
            super(null);
            this.numberOfButtons = i;
        }
    }

    /* compiled from: ShimmerLoaderType.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/compose/common/ShimmerLoaderType$Empty;", "Lcom/robinhood/compose/common/ShimmerLoaderType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Empty extends ShimmerLoaderType {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();
        public static final Parcelable.Creator<Empty> CREATOR = new Creator();

        /* compiled from: ShimmerLoaderType.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Empty> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i) {
                return new Empty[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Empty);
        }

        public int hashCode() {
            return -1104118853;
        }

        public String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Empty() {
            super(null);
        }
    }
}

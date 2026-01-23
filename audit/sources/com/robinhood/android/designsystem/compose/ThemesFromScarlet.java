package com.robinhood.android.designsystem.compose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThemesFromScarlet.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003JG\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet;", "Landroid/os/Parcelable;", "isDay", "", "isCreditCard", "isGold", "isAchromatic", "isAccessible", "direction", "Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;", "<init>", "(ZZZZZLcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;)V", "()Z", "getDirection", "()Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Direction", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ThemesFromScarlet implements Parcelable {
    public static final Parcelable.Creator<ThemesFromScarlet> CREATOR = new Creator();
    private final Direction direction;
    private final boolean isAccessible;
    private final boolean isAchromatic;
    private final boolean isCreditCard;
    private final boolean isDay;
    private final boolean isGold;

    /* compiled from: ThemesFromScarlet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ThemesFromScarlet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemesFromScarlet createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z5 = false;
            boolean z6 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z5 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z6 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new ThemesFromScarlet(z5, z6, z2, z3, z4, parcel.readInt() == 0 ? null : Direction.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ThemesFromScarlet[] newArray(int i) {
            return new ThemesFromScarlet[i];
        }
    }

    public ThemesFromScarlet() {
        this(false, false, false, false, false, null, 63, null);
    }

    public static /* synthetic */ ThemesFromScarlet copy$default(ThemesFromScarlet themesFromScarlet, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Direction direction, int i, Object obj) {
        if ((i & 1) != 0) {
            z = themesFromScarlet.isDay;
        }
        if ((i & 2) != 0) {
            z2 = themesFromScarlet.isCreditCard;
        }
        if ((i & 4) != 0) {
            z3 = themesFromScarlet.isGold;
        }
        if ((i & 8) != 0) {
            z4 = themesFromScarlet.isAchromatic;
        }
        if ((i & 16) != 0) {
            z5 = themesFromScarlet.isAccessible;
        }
        if ((i & 32) != 0) {
            direction = themesFromScarlet.direction;
        }
        boolean z6 = z5;
        Direction direction2 = direction;
        return themesFromScarlet.copy(z, z2, z3, z4, z6, direction2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCreditCard() {
        return this.isCreditCard;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsGold() {
        return this.isGold;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsAchromatic() {
        return this.isAchromatic;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsAccessible() {
        return this.isAccessible;
    }

    /* renamed from: component6, reason: from getter */
    public final Direction getDirection() {
        return this.direction;
    }

    public final ThemesFromScarlet copy(boolean isDay, boolean isCreditCard, boolean isGold, boolean isAchromatic, boolean isAccessible, Direction direction) {
        return new ThemesFromScarlet(isDay, isCreditCard, isGold, isAchromatic, isAccessible, direction);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThemesFromScarlet)) {
            return false;
        }
        ThemesFromScarlet themesFromScarlet = (ThemesFromScarlet) other;
        return this.isDay == themesFromScarlet.isDay && this.isCreditCard == themesFromScarlet.isCreditCard && this.isGold == themesFromScarlet.isGold && this.isAchromatic == themesFromScarlet.isAchromatic && this.isAccessible == themesFromScarlet.isAccessible && this.direction == themesFromScarlet.direction;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.isDay) * 31) + Boolean.hashCode(this.isCreditCard)) * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isAchromatic)) * 31) + Boolean.hashCode(this.isAccessible)) * 31;
        Direction direction = this.direction;
        return iHashCode + (direction == null ? 0 : direction.hashCode());
    }

    public String toString() {
        return "ThemesFromScarlet(isDay=" + this.isDay + ", isCreditCard=" + this.isCreditCard + ", isGold=" + this.isGold + ", isAchromatic=" + this.isAchromatic + ", isAccessible=" + this.isAccessible + ", direction=" + this.direction + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isDay ? 1 : 0);
        dest.writeInt(this.isCreditCard ? 1 : 0);
        dest.writeInt(this.isGold ? 1 : 0);
        dest.writeInt(this.isAchromatic ? 1 : 0);
        dest.writeInt(this.isAccessible ? 1 : 0);
        Direction direction = this.direction;
        if (direction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(direction.name());
        }
    }

    public ThemesFromScarlet(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Direction direction) {
        this.isDay = z;
        this.isCreditCard = z2;
        this.isGold = z3;
        this.isAchromatic = z4;
        this.isAccessible = z5;
        this.direction = direction;
    }

    public /* synthetic */ ThemesFromScarlet(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Direction direction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? null : direction);
    }

    public final boolean isDay() {
        return this.isDay;
    }

    public final boolean isCreditCard() {
        return this.isCreditCard;
    }

    public final boolean isGold() {
        return this.isGold;
    }

    public final boolean isAchromatic() {
        return this.isAchromatic;
    }

    public final boolean isAccessible() {
        return this.isAccessible;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ThemesFromScarlet.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/designsystem/compose/ThemesFromScarlet$Direction;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE", "NEGATIVE", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Direction {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction POSITIVE = new Direction("POSITIVE", 0);
        public static final Direction NEGATIVE = new Direction("NEGATIVE", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{POSITIVE, NEGATIVE};
        }

        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        private Direction(String str, int i) {
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }
}

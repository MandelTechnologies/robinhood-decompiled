package com.robinhood.android.portfolio.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.models.portfolio.api.PositionsSortType;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionsSortOptionsKey.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00016BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u0011HÆ\u0003JW\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u00020\u0006HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020+R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "positionsLocation", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "initialSortPreference", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "allowedSortTypes", "", "Lcom/robinhood/android/models/portfolio/api/PositionsSortType;", "persistSort", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen;Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/models/portfolio/api/PositionsLocation;Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;Ljava/util/List;Z)V", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getAccountNumber", "()Ljava/lang/String;", "getPositionInstrumentType", "()Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getPositionsLocation", "()Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "getInitialSortPreference", "()Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "getAllowedSortTypes", "()Ljava/util/List;", "getPersistSort", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "InitialSortPreference", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PositionsSortOptionsKey implements DialogFragmentKey, Parcelable {
    public static final Parcelable.Creator<PositionsSortOptionsKey> CREATOR = new Creator();
    private final String accountNumber;
    private final List<PositionsSortType> allowedSortTypes;
    private final InitialSortPreference initialSortPreference;
    private final boolean persistSort;
    private final PositionInstrumentType positionInstrumentType;
    private final PositionsLocation positionsLocation;
    private final Screen screen;

    /* compiled from: PositionsSortOptionsKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<PositionsSortOptionsKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsSortOptionsKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Screen screen = (Screen) parcel.readSerializable();
            String string2 = parcel.readString();
            PositionInstrumentType positionInstrumentTypeValueOf = PositionInstrumentType.valueOf(parcel.readString());
            PositionsLocation positionsLocationValueOf = PositionsLocation.valueOf(parcel.readString());
            InitialSortPreference initialSortPreference = (InitialSortPreference) parcel.readParcelable(PositionsSortOptionsKey.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PositionsSortType.valueOf(parcel.readString()));
            }
            return new PositionsSortOptionsKey(screen, string2, positionInstrumentTypeValueOf, positionsLocationValueOf, initialSortPreference, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionsSortOptionsKey[] newArray(int i) {
            return new PositionsSortOptionsKey[i];
        }
    }

    public static /* synthetic */ PositionsSortOptionsKey copy$default(PositionsSortOptionsKey positionsSortOptionsKey, Screen screen, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, InitialSortPreference initialSortPreference, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            screen = positionsSortOptionsKey.screen;
        }
        if ((i & 2) != 0) {
            str = positionsSortOptionsKey.accountNumber;
        }
        if ((i & 4) != 0) {
            positionInstrumentType = positionsSortOptionsKey.positionInstrumentType;
        }
        if ((i & 8) != 0) {
            positionsLocation = positionsSortOptionsKey.positionsLocation;
        }
        if ((i & 16) != 0) {
            initialSortPreference = positionsSortOptionsKey.initialSortPreference;
        }
        if ((i & 32) != 0) {
            list = positionsSortOptionsKey.allowedSortTypes;
        }
        if ((i & 64) != 0) {
            z = positionsSortOptionsKey.persistSort;
        }
        List list2 = list;
        boolean z2 = z;
        InitialSortPreference initialSortPreference2 = initialSortPreference;
        PositionInstrumentType positionInstrumentType2 = positionInstrumentType;
        return positionsSortOptionsKey.copy(screen, str, positionInstrumentType2, positionsLocation, initialSortPreference2, list2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final Screen getScreen() {
        return this.screen;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    /* renamed from: component4, reason: from getter */
    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }

    /* renamed from: component5, reason: from getter */
    public final InitialSortPreference getInitialSortPreference() {
        return this.initialSortPreference;
    }

    public final List<PositionsSortType> component6() {
        return this.allowedSortTypes;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPersistSort() {
        return this.persistSort;
    }

    public final PositionsSortOptionsKey copy(Screen screen, String accountNumber, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, InitialSortPreference initialSortPreference, List<? extends PositionsSortType> allowedSortTypes, boolean persistSort) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(initialSortPreference, "initialSortPreference");
        Intrinsics.checkNotNullParameter(allowedSortTypes, "allowedSortTypes");
        return new PositionsSortOptionsKey(screen, accountNumber, positionInstrumentType, positionsLocation, initialSortPreference, allowedSortTypes, persistSort);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionsSortOptionsKey)) {
            return false;
        }
        PositionsSortOptionsKey positionsSortOptionsKey = (PositionsSortOptionsKey) other;
        return Intrinsics.areEqual(this.screen, positionsSortOptionsKey.screen) && Intrinsics.areEqual(this.accountNumber, positionsSortOptionsKey.accountNumber) && this.positionInstrumentType == positionsSortOptionsKey.positionInstrumentType && this.positionsLocation == positionsSortOptionsKey.positionsLocation && Intrinsics.areEqual(this.initialSortPreference, positionsSortOptionsKey.initialSortPreference) && Intrinsics.areEqual(this.allowedSortTypes, positionsSortOptionsKey.allowedSortTypes) && this.persistSort == positionsSortOptionsKey.persistSort;
    }

    public int hashCode() {
        Screen screen = this.screen;
        return ((((((((((((screen == null ? 0 : screen.hashCode()) * 31) + this.accountNumber.hashCode()) * 31) + this.positionInstrumentType.hashCode()) * 31) + this.positionsLocation.hashCode()) * 31) + this.initialSortPreference.hashCode()) * 31) + this.allowedSortTypes.hashCode()) * 31) + Boolean.hashCode(this.persistSort);
    }

    public String toString() {
        return "PositionsSortOptionsKey(screen=" + this.screen + ", accountNumber=" + this.accountNumber + ", positionInstrumentType=" + this.positionInstrumentType + ", positionsLocation=" + this.positionsLocation + ", initialSortPreference=" + this.initialSortPreference + ", allowedSortTypes=" + this.allowedSortTypes + ", persistSort=" + this.persistSort + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.screen);
        dest.writeString(this.accountNumber);
        dest.writeString(this.positionInstrumentType.name());
        dest.writeString(this.positionsLocation.name());
        dest.writeParcelable(this.initialSortPreference, flags);
        List<PositionsSortType> list = this.allowedSortTypes;
        dest.writeInt(list.size());
        Iterator<PositionsSortType> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        dest.writeInt(this.persistSort ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PositionsSortOptionsKey(Screen screen, String accountNumber, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, InitialSortPreference initialSortPreference, List<? extends PositionsSortType> allowedSortTypes, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(initialSortPreference, "initialSortPreference");
        Intrinsics.checkNotNullParameter(allowedSortTypes, "allowedSortTypes");
        this.screen = screen;
        this.accountNumber = accountNumber;
        this.positionInstrumentType = positionInstrumentType;
        this.positionsLocation = positionsLocation;
        this.initialSortPreference = initialSortPreference;
        this.allowedSortTypes = allowedSortTypes;
        this.persistSort = z;
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PositionInstrumentType getPositionInstrumentType() {
        return this.positionInstrumentType;
    }

    public final PositionsLocation getPositionsLocation() {
        return this.positionsLocation;
    }

    public /* synthetic */ PositionsSortOptionsKey(Screen screen, String str, PositionInstrumentType positionInstrumentType, PositionsLocation positionsLocation, InitialSortPreference initialSortPreference, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(screen, str, positionInstrumentType, positionsLocation, (i & 16) != 0 ? InitialSortPreference.Default.INSTANCE : initialSortPreference, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? false : z);
    }

    public final InitialSortPreference getInitialSortPreference() {
        return this.initialSortPreference;
    }

    public final List<PositionsSortType> getAllowedSortTypes() {
        return this.allowedSortTypes;
    }

    public final boolean getPersistSort() {
        return this.persistSort;
    }

    /* compiled from: PositionsSortOptionsKey.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "Landroid/os/Parcelable;", "Default", "None", "Override", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$Default;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$None;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$Override;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes11.dex */
    public interface InitialSortPreference extends Parcelable {

        /* compiled from: PositionsSortOptionsKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$Default;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default implements InitialSortPreference {
            public static final Default INSTANCE = new Default();
            public static final Parcelable.Creator<Default> CREATOR = new Creator();

            /* compiled from: PositionsSortOptionsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Default);
            }

            public int hashCode() {
                return -2085861788;
            }

            public String toString() {
                return "Default";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Default() {
            }
        }

        /* compiled from: PositionsSortOptionsKey.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$None;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements InitialSortPreference {
            public static final None INSTANCE = new None();
            public static final Parcelable.Creator<None> CREATOR = new Creator();

            /* compiled from: PositionsSortOptionsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -1519457803;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private None() {
            }
        }

        /* compiled from: PositionsSortOptionsKey.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference$Override;", "Lcom/robinhood/android/portfolio/contracts/PositionsSortOptionsKey$InitialSortPreference;", "sortPreference", "Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionsSortPreference;)V", "getSortPreference", "()Lcom/robinhood/android/models/portfolio/PositionsSortPreference;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Override implements InitialSortPreference {
            public static final Parcelable.Creator<Override> CREATOR = new Creator();
            private final PositionsSortPreference sortPreference;

            /* compiled from: PositionsSortOptionsKey.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Override> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Override createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Override((PositionsSortPreference) parcel.readParcelable(Override.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Override[] newArray(int i) {
                    return new Override[i];
                }
            }

            public static /* synthetic */ Override copy$default(Override override, PositionsSortPreference positionsSortPreference, int i, Object obj) {
                if ((i & 1) != 0) {
                    positionsSortPreference = override.sortPreference;
                }
                return override.copy(positionsSortPreference);
            }

            /* renamed from: component1, reason: from getter */
            public final PositionsSortPreference getSortPreference() {
                return this.sortPreference;
            }

            public final Override copy(PositionsSortPreference sortPreference) {
                Intrinsics.checkNotNullParameter(sortPreference, "sortPreference");
                return new Override(sortPreference);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Override) && Intrinsics.areEqual(this.sortPreference, ((Override) other).sortPreference);
            }

            public int hashCode() {
                return this.sortPreference.hashCode();
            }

            public String toString() {
                return "Override(sortPreference=" + this.sortPreference + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.sortPreference, flags);
            }

            public Override(PositionsSortPreference sortPreference) {
                Intrinsics.checkNotNullParameter(sortPreference, "sortPreference");
                this.sortPreference = sortPreference;
            }

            public final PositionsSortPreference getSortPreference() {
                return this.sortPreference;
            }
        }
    }
}

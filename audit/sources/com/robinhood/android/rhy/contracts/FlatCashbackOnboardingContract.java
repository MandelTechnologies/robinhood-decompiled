package com.robinhood.android.rhy.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FlatCashbackOnboardingContract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract;", "", "<init>", "()V", "Key", "DialogKey", "EntryPoint", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FlatCashbackOnboardingContract {
    public static final FlatCashbackOnboardingContract INSTANCE = new FlatCashbackOnboardingContract();

    private FlatCashbackOnboardingContract() {
    }

    /* compiled from: FlatCashbackOnboardingContract.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "source", "Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$EntryPoint;", "<init>", "(Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$EntryPoint;)V", "getSource", "()Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$EntryPoint;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final /* data */ class Key implements FragmentKey {
        public static final Parcelable.Creator<Key> CREATOR = new Creator();
        private final EntryPoint source;

        /* compiled from: FlatCashbackOnboardingContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Key(EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
            }
        }

        public static /* synthetic */ Key copy$default(Key key, EntryPoint entryPoint, int i, Object obj) {
            if ((i & 1) != 0) {
                entryPoint = key.source;
            }
            return key.copy(entryPoint);
        }

        /* renamed from: component1, reason: from getter */
        public final EntryPoint getSource() {
            return this.source;
        }

        public final Key copy(EntryPoint source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Key(source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Key) && this.source == ((Key) other).source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "Key(source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source.name());
        }

        public Key(EntryPoint source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final EntryPoint getSource() {
            return this.source;
        }
    }

    /* compiled from: FlatCashbackOnboardingContract.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$DialogKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class DialogKey implements DialogFragmentKey, Parcelable {
        public static final DialogKey INSTANCE = new DialogKey();
        public static final Parcelable.Creator<DialogKey> CREATOR = new Creator();

        /* compiled from: FlatCashbackOnboardingContract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<DialogKey> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogKey createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DialogKey.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DialogKey[] newArray(int i) {
                return new DialogKey[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private DialogKey() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FlatCashbackOnboardingContract.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/FlatCashbackOnboardingContract$EntryPoint;", "", "<init>", "(Ljava/lang/String;I)V", "UPSELL", "DIRECT_DEPOSIT", "RECURRING_ACH_DEPOSIT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint UPSELL = new EntryPoint("UPSELL", 0);
        public static final EntryPoint DIRECT_DEPOSIT = new EntryPoint("DIRECT_DEPOSIT", 1);
        public static final EntryPoint RECURRING_ACH_DEPOSIT = new EntryPoint("RECURRING_ACH_DEPOSIT", 2);

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{UPSELL, DIRECT_DEPOSIT, RECURRING_ACH_DEPOSIT};
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i) {
        }

        static {
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }
}

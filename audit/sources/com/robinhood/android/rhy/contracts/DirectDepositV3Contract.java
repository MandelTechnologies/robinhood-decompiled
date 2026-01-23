package com.robinhood.android.rhy.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositV3Contract.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract;", "", "<init>", "()V", "Key", "Callbacks", "CompletionType", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DirectDepositV3Contract {
    public static final DirectDepositV3Contract INSTANCE = new DirectDepositV3Contract();

    /* compiled from: DirectDepositV3Contract.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Callbacks;", "", "onDirectDepositFlowCompleted", "", "completionType", "Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$CompletionType;", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDirectDepositFlowCompleted(CompletionType completionType);
    }

    private DirectDepositV3Contract() {
    }

    /* compiled from: DirectDepositV3Contract.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$Key;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class Key implements FragmentKey {
        public static final Key INSTANCE = new Key();
        public static final Parcelable.Creator<Key> CREATOR = new Creator();

        /* compiled from: DirectDepositV3Contract.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes5.dex */
        public static final class Creator implements Parcelable.Creator<Key> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Key.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Key[] newArray(int i) {
                return new Key[i];
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

        private Key() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DirectDepositV3Contract.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/contracts/DirectDepositV3Contract$CompletionType;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "MANUAL", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CompletionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CompletionType[] $VALUES;
        public static final CompletionType AUTOMATIC = new CompletionType("AUTOMATIC", 0);
        public static final CompletionType MANUAL = new CompletionType("MANUAL", 1);

        private static final /* synthetic */ CompletionType[] $values() {
            return new CompletionType[]{AUTOMATIC, MANUAL};
        }

        public static EnumEntries<CompletionType> getEntries() {
            return $ENTRIES;
        }

        private CompletionType(String str, int i) {
        }

        static {
            CompletionType[] completionTypeArr$values = $values();
            $VALUES = completionTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(completionTypeArr$values);
        }

        public static CompletionType valueOf(String str) {
            return (CompletionType) Enum.valueOf(CompletionType.class, str);
        }

        public static CompletionType[] values() {
            return (CompletionType[]) $VALUES.clone();
        }
    }
}

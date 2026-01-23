package com.robinhood.android.recurring.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFragmentKeys.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/recurring/contracts/RecurringAccountSelection;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.recurring.contracts.RecurringAccountSelection, reason: use source file name */
/* loaded from: classes17.dex */
public final class RecurringFragmentKeys implements FragmentKey {
    public static final RecurringFragmentKeys INSTANCE = new RecurringFragmentKeys();
    public static final Parcelable.Creator<RecurringFragmentKeys> CREATOR = new Creator();

    /* compiled from: RecurringFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.recurring.contracts.RecurringAccountSelection$Creator */
    /* loaded from: classes11.dex */
    public static final class Creator implements Parcelable.Creator<RecurringFragmentKeys> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFragmentKeys createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return RecurringFragmentKeys.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFragmentKeys[] newArray(int i) {
            return new RecurringFragmentKeys[i];
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

    private RecurringFragmentKeys() {
    }
}

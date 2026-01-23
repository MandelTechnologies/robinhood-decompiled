package com.robinhood.android.acatsin.borrowingfee;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BorrowingFeeBottomSheetKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acatsin/borrowingfee/BorrowingFeeBottomSheetKey;", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "Landroid/os/Parcelable;", "shortPositionsWithFees", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acatsin/borrowingfee/UiShortPositionFeeData;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getShortPositionsWithFees", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class BorrowingFeeBottomSheetKey implements DialogFragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BorrowingFeeBottomSheetKey> CREATOR = new Creator();
    private final ImmutableList<UiShortPositionFeeData> shortPositionsWithFees;

    /* compiled from: BorrowingFeeBottomSheetKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BorrowingFeeBottomSheetKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowingFeeBottomSheetKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UiShortPositionFeeData.CREATOR.createFromParcel(parcel));
            }
            return new BorrowingFeeBottomSheetKey(extensions2.toPersistentList(arrayList));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowingFeeBottomSheetKey[] newArray(int i) {
            return new BorrowingFeeBottomSheetKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BorrowingFeeBottomSheetKey copy$default(BorrowingFeeBottomSheetKey borrowingFeeBottomSheetKey, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = borrowingFeeBottomSheetKey.shortPositionsWithFees;
        }
        return borrowingFeeBottomSheetKey.copy(immutableList);
    }

    public final ImmutableList<UiShortPositionFeeData> component1() {
        return this.shortPositionsWithFees;
    }

    public final BorrowingFeeBottomSheetKey copy(ImmutableList<UiShortPositionFeeData> shortPositionsWithFees) {
        Intrinsics.checkNotNullParameter(shortPositionsWithFees, "shortPositionsWithFees");
        return new BorrowingFeeBottomSheetKey(shortPositionsWithFees);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BorrowingFeeBottomSheetKey) && Intrinsics.areEqual(this.shortPositionsWithFees, ((BorrowingFeeBottomSheetKey) other).shortPositionsWithFees);
    }

    public int hashCode() {
        return this.shortPositionsWithFees.hashCode();
    }

    public String toString() {
        return "BorrowingFeeBottomSheetKey(shortPositionsWithFees=" + this.shortPositionsWithFees + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ImmutableList<UiShortPositionFeeData> immutableList = this.shortPositionsWithFees;
        dest.writeInt(immutableList.size());
        Iterator<UiShortPositionFeeData> it = immutableList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public BorrowingFeeBottomSheetKey(ImmutableList<UiShortPositionFeeData> shortPositionsWithFees) {
        Intrinsics.checkNotNullParameter(shortPositionsWithFees, "shortPositionsWithFees");
        this.shortPositionsWithFees = shortPositionsWithFees;
    }

    public final ImmutableList<UiShortPositionFeeData> getShortPositionsWithFees() {
        return this.shortPositionsWithFees;
    }
}

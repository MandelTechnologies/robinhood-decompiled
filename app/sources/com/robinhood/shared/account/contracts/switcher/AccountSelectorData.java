package com.robinhood.shared.account.contracts.switcher;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountSelectorData.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorData;", "Landroid/os/Parcelable;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSelectorRowData;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AccountSelectorData implements Parcelable {
    public static final Parcelable.Creator<AccountSelectorData> CREATOR = new Creator();
    private final ImmutableList<AccountSelectorRowData> rows;

    /* compiled from: AccountSelectorData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSelectorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AccountSelectorRowData.CREATOR.createFromParcel(parcel));
            }
            return new AccountSelectorData(extensions2.toPersistentList(arrayList));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorData[] newArray(int i) {
            return new AccountSelectorData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountSelectorData copy$default(AccountSelectorData accountSelectorData, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = accountSelectorData.rows;
        }
        return accountSelectorData.copy(immutableList);
    }

    public final ImmutableList<AccountSelectorRowData> component1() {
        return this.rows;
    }

    public final AccountSelectorData copy(ImmutableList<AccountSelectorRowData> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new AccountSelectorData(rows);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AccountSelectorData) && Intrinsics.areEqual(this.rows, ((AccountSelectorData) other).rows);
    }

    public int hashCode() {
        return this.rows.hashCode();
    }

    public String toString() {
        return "AccountSelectorData(rows=" + this.rows + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ImmutableList<AccountSelectorRowData> immutableList = this.rows;
        dest.writeInt(immutableList.size());
        Iterator<AccountSelectorRowData> it = immutableList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public AccountSelectorData(ImmutableList<AccountSelectorRowData> rows) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
    }

    public final ImmutableList<AccountSelectorRowData> getRows() {
        return this.rows;
    }
}

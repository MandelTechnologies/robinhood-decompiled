package com.robinhood.android.redesign.accounttab;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorTabKey.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0007J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/AccountSelectorTabArgs;", "Landroid/os/Parcelable;", "id", "", "isEmbedded", "", "initialSpacerHeight", "", "<init>", "(Ljava/lang/String;ZI)V", "getId", "()Ljava/lang/String;", "()Z", "getInitialSpacerHeight", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AccountSelectorTabArgs implements Parcelable {
    public static final Parcelable.Creator<AccountSelectorTabArgs> CREATOR = new Creator();
    private final String id;
    private final int initialSpacerHeight;
    private final boolean isEmbedded;

    /* compiled from: AccountSelectorTabKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountSelectorTabArgs> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorTabArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSelectorTabArgs(parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountSelectorTabArgs[] newArray(int i) {
            return new AccountSelectorTabArgs[i];
        }
    }

    public static /* synthetic */ AccountSelectorTabArgs copy$default(AccountSelectorTabArgs accountSelectorTabArgs, String str, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accountSelectorTabArgs.id;
        }
        if ((i2 & 2) != 0) {
            z = accountSelectorTabArgs.isEmbedded;
        }
        if ((i2 & 4) != 0) {
            i = accountSelectorTabArgs.initialSpacerHeight;
        }
        return accountSelectorTabArgs.copy(str, z, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInitialSpacerHeight() {
        return this.initialSpacerHeight;
    }

    public final AccountSelectorTabArgs copy(String id, boolean isEmbedded, int initialSpacerHeight) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AccountSelectorTabArgs(id, isEmbedded, initialSpacerHeight);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectorTabArgs)) {
            return false;
        }
        AccountSelectorTabArgs accountSelectorTabArgs = (AccountSelectorTabArgs) other;
        return Intrinsics.areEqual(this.id, accountSelectorTabArgs.id) && this.isEmbedded == accountSelectorTabArgs.isEmbedded && this.initialSpacerHeight == accountSelectorTabArgs.initialSpacerHeight;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Boolean.hashCode(this.isEmbedded)) * 31) + Integer.hashCode(this.initialSpacerHeight);
    }

    public String toString() {
        return "AccountSelectorTabArgs(id=" + this.id + ", isEmbedded=" + this.isEmbedded + ", initialSpacerHeight=" + this.initialSpacerHeight + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeInt(this.isEmbedded ? 1 : 0);
        dest.writeInt(this.initialSpacerHeight);
    }

    public AccountSelectorTabArgs(String id, boolean z, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.isEmbedded = z;
        this.initialSpacerHeight = i;
    }

    public /* synthetic */ AccountSelectorTabArgs(String str, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? true : z, i);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public final int getInitialSpacerHeight() {
        return this.initialSpacerHeight;
    }
}

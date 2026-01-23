package com.robinhood.android.acatsin.util.names;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NamesOnAccount.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "Landroid/os/Parcelable;", "currentUserName", "Lcom/robinhood/android/acatsin/util/names/Name;", "allNames", "", "<init>", "(Lcom/robinhood/android/acatsin/util/names/Name;Ljava/util/List;)V", "getCurrentUserName", "()Lcom/robinhood/android/acatsin/util/names/Name;", "getAllNames", "()Ljava/util/List;", "coOwnerName", "getCoOwnerName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final /* data */ class NamesOnAccount implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NamesOnAccount> CREATOR = new Creator();
    private final List<NamesOnAccount2> allNames;
    private final NamesOnAccount2 currentUserName;

    /* compiled from: NamesOnAccount.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<NamesOnAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NamesOnAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            NamesOnAccount2 namesOnAccount2CreateFromParcel = NamesOnAccount2.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(NamesOnAccount2.CREATOR.createFromParcel(parcel));
            }
            return new NamesOnAccount(namesOnAccount2CreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NamesOnAccount[] newArray(int i) {
            return new NamesOnAccount[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NamesOnAccount copy$default(NamesOnAccount namesOnAccount, NamesOnAccount2 namesOnAccount2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            namesOnAccount2 = namesOnAccount.currentUserName;
        }
        if ((i & 2) != 0) {
            list = namesOnAccount.allNames;
        }
        return namesOnAccount.copy(namesOnAccount2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NamesOnAccount2 getCurrentUserName() {
        return this.currentUserName;
    }

    public final List<NamesOnAccount2> component2() {
        return this.allNames;
    }

    public final NamesOnAccount copy(NamesOnAccount2 currentUserName, List<NamesOnAccount2> allNames) {
        Intrinsics.checkNotNullParameter(currentUserName, "currentUserName");
        Intrinsics.checkNotNullParameter(allNames, "allNames");
        return new NamesOnAccount(currentUserName, allNames);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NamesOnAccount)) {
            return false;
        }
        NamesOnAccount namesOnAccount = (NamesOnAccount) other;
        return Intrinsics.areEqual(this.currentUserName, namesOnAccount.currentUserName) && Intrinsics.areEqual(this.allNames, namesOnAccount.allNames);
    }

    public int hashCode() {
        return (this.currentUserName.hashCode() * 31) + this.allNames.hashCode();
    }

    public String toString() {
        return "NamesOnAccount(currentUserName=" + this.currentUserName + ", allNames=" + this.allNames + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.currentUserName.writeToParcel(dest, flags);
        List<NamesOnAccount2> list = this.allNames;
        dest.writeInt(list.size());
        Iterator<NamesOnAccount2> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public NamesOnAccount(NamesOnAccount2 currentUserName, List<NamesOnAccount2> allNames) {
        Intrinsics.checkNotNullParameter(currentUserName, "currentUserName");
        Intrinsics.checkNotNullParameter(allNames, "allNames");
        this.currentUserName = currentUserName;
        this.allNames = allNames;
    }

    public final NamesOnAccount2 getCurrentUserName() {
        return this.currentUserName;
    }

    public final List<NamesOnAccount2> getAllNames() {
        return this.allNames;
    }

    public final NamesOnAccount2 getCoOwnerName() {
        Object next;
        Iterator<T> it = this.allNames.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!Intrinsics.areEqual((NamesOnAccount2) next, this.currentUserName)) {
                break;
            }
        }
        return (NamesOnAccount2) next;
    }
}

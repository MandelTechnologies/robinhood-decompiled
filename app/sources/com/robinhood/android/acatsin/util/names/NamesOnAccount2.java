package com.robinhood.android.acatsin.util.names;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NamesOnAccount.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u0003H\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/acatsin/util/names/Name;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFirstName", "()Ljava/lang/String;", "getLastName", "toString", "fullName", "getFullName", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.util.names.Name, reason: use source file name */
/* loaded from: classes24.dex */
public final /* data */ class NamesOnAccount2 implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<NamesOnAccount2> CREATOR = new Creator();
    private final String firstName;
    private final String lastName;

    /* compiled from: NamesOnAccount.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.util.names.Name$Creator */
    public static final class Creator implements Parcelable.Creator<NamesOnAccount2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NamesOnAccount2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NamesOnAccount2(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NamesOnAccount2[] newArray(int i) {
            return new NamesOnAccount2[i];
        }
    }

    public static /* synthetic */ NamesOnAccount2 copy$default(NamesOnAccount2 namesOnAccount2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = namesOnAccount2.firstName;
        }
        if ((i & 2) != 0) {
            str2 = namesOnAccount2.lastName;
        }
        return namesOnAccount2.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final NamesOnAccount2 copy(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new NamesOnAccount2(firstName, lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NamesOnAccount2)) {
            return false;
        }
        NamesOnAccount2 namesOnAccount2 = (NamesOnAccount2) other;
        return Intrinsics.areEqual(this.firstName, namesOnAccount2.firstName) && Intrinsics.areEqual(this.lastName, namesOnAccount2.lastName);
    }

    public int hashCode() {
        return (this.firstName.hashCode() * 31) + this.lastName.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    public NamesOnAccount2(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return getFullName();
    }

    public final String getFullName() {
        return this.firstName + PlaceholderUtils.XXShortPlaceholderText + this.lastName;
    }
}

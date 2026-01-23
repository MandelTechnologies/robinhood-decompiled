package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: com.plaid.internal.L4 */
/* loaded from: classes16.dex */
public final class C5896L4 implements Parcelable {
    public static final Parcelable.Creator<C5896L4> CREATOR = new a();

    /* renamed from: a */
    public final boolean f1526a;

    /* renamed from: com.plaid.internal.L4$a */
    public static final class a implements Parcelable.Creator<C5896L4> {
        @Override // android.os.Parcelable.Creator
        public final C5896L4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new C5896L4(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final C5896L4[] newArray(int i) {
            return new C5896L4[i];
        }
    }

    public C5896L4() {
        this.f1526a = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5896L4) && this.f1526a == ((C5896L4) obj).f1526a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1526a);
    }

    public final String toString() {
        return "PlaidClientSideOnlyConfiguration(noLoadingUi=" + this.f1526a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f1526a ? 1 : 0);
    }

    public C5896L4(boolean z) {
        this.f1526a = z;
    }
}

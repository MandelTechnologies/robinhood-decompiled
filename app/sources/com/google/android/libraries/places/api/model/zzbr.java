package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.libraries.places:places@@3.5.0 */
/* loaded from: classes27.dex */
final class zzbr implements Parcelable.Creator {
    zzbr() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string5 = parcel.readInt() == 0 ? parcel.readString() : null;
        String string6 = parcel.readInt() == 0 ? parcel.readString() : null;
        Double dValueOf = Double.valueOf(parcel.readDouble());
        AuthorAttribution authorAttribution = (AuthorAttribution) parcel.readParcelable(Review.class.getClassLoader());
        String string7 = null;
        String str = string3;
        String str2 = string4;
        String str3 = string5;
        String str4 = string6;
        String string8 = parcel.readString();
        if (parcel.readInt() == 0) {
            string7 = parcel.readString();
        }
        return new zzbs(string2, str, str2, str3, str4, dValueOf, authorAttribution, string8, string7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbs[i];
    }
}

package com.google.android.p049a;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: Codecs.java */
/* renamed from: com.google.android.a.c, reason: use source file name */
/* loaded from: classes4.dex */
public final class Codecs {
    static {
        Codecs.class.getClassLoader();
    }

    private Codecs() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m788a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m789b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}

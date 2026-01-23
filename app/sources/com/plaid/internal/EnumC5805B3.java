package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.B3 */
/* loaded from: classes16.dex */
public final class EnumC5805B3 implements Parcelable {
    public static final Parcelable.Creator<EnumC5805B3> CREATOR;
    public static final EnumC5805B3 HTTP_ERROR;
    public static final EnumC5805B3 INITIALIZATION_ERROR;
    public static final EnumC5805B3 NETWORK_ERROR;
    public static final EnumC5805B3 SESSION_EXPIRED;
    public static final EnumC5805B3 UNKNOWN_ERROR;

    /* renamed from: a */
    public static final /* synthetic */ EnumC5805B3[] f1272a;

    /* renamed from: b */
    public static final /* synthetic */ EnumEntries f1273b;

    static {
        EnumC5805B3 enumC5805B3 = new EnumC5805B3("NETWORK_ERROR", 0);
        NETWORK_ERROR = enumC5805B3;
        EnumC5805B3 enumC5805B32 = new EnumC5805B3("SESSION_EXPIRED", 1);
        SESSION_EXPIRED = enumC5805B32;
        EnumC5805B3 enumC5805B33 = new EnumC5805B3("INITIALIZATION_ERROR", 2);
        INITIALIZATION_ERROR = enumC5805B33;
        EnumC5805B3 enumC5805B34 = new EnumC5805B3("HTTP_ERROR", 3);
        HTTP_ERROR = enumC5805B34;
        EnumC5805B3 enumC5805B35 = new EnumC5805B3("UNKNOWN_ERROR", 4);
        UNKNOWN_ERROR = enumC5805B35;
        EnumC5805B3[] enumC5805B3Arr = {enumC5805B3, enumC5805B32, enumC5805B33, enumC5805B34, enumC5805B35};
        f1272a = enumC5805B3Arr;
        f1273b = EnumEntries2.enumEntries(enumC5805B3Arr);
        CREATOR = new Parcelable.Creator<EnumC5805B3>() { // from class: com.plaid.internal.B3.a
            @Override // android.os.Parcelable.Creator
            public final EnumC5805B3 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC5805B3.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC5805B3[] newArray(int i) {
                return new EnumC5805B3[i];
            }
        };
    }

    public EnumC5805B3(String str, int i) {
    }

    public static EnumEntries<EnumC5805B3> getEntries() {
        return f1273b;
    }

    public static EnumC5805B3 valueOf(String str) {
        return (EnumC5805B3) Enum.valueOf(EnumC5805B3.class, str);
    }

    public static EnumC5805B3[] values() {
        return (EnumC5805B3[]) f1272a.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}

package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.AdjustConfig;
import java.util.Map;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.c5 */
/* loaded from: classes16.dex */
public final class EnumC6054c5 implements Parcelable {
    public static final Parcelable.Creator<EnumC6054c5> CREATOR;
    public static final a Companion;
    public static final EnumC6054c5 DEVELOPMENT;
    public static final EnumC6054c5 DEVENV;
    public static final EnumC6054c5 PRODUCTION;
    public static final EnumC6054c5 SANDBOX;

    /* renamed from: b */
    public static final Map<String, EnumC6054c5> f1939b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC6054c5[] f1940c;

    /* renamed from: d */
    public static final /* synthetic */ EnumEntries f1941d;

    /* renamed from: a */
    public final String f1942a;

    @SourceDebugExtension
    /* renamed from: com.plaid.internal.c5$a */
    public static final class a {
        /* renamed from: a */
        public static EnumC6054c5 m1379a(String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            EnumC6054c5 enumC6054c5 = (EnumC6054c5) EnumC6054c5.f1939b.get(json);
            return enumC6054c5 == null ? EnumC6054c5.SANDBOX : enumC6054c5;
        }
    }

    static {
        EnumC6054c5 enumC6054c5 = new EnumC6054c5("PRODUCTION", 0, "production");
        PRODUCTION = enumC6054c5;
        EnumC6054c5 enumC6054c52 = new EnumC6054c5("DEVELOPMENT", 1, "development");
        DEVELOPMENT = enumC6054c52;
        EnumC6054c5 enumC6054c53 = new EnumC6054c5("SANDBOX", 2, AdjustConfig.ENVIRONMENT_SANDBOX);
        SANDBOX = enumC6054c53;
        EnumC6054c5 enumC6054c54 = new EnumC6054c5("DEVENV", 3, "devenv");
        DEVENV = enumC6054c54;
        EnumC6054c5[] enumC6054c5Arr = {enumC6054c5, enumC6054c52, enumC6054c53, enumC6054c54};
        f1940c = enumC6054c5Arr;
        f1941d = EnumEntries2.enumEntries(enumC6054c5Arr);
        Companion = new a();
        CREATOR = new Parcelable.Creator<EnumC6054c5>() { // from class: com.plaid.internal.c5.b
            @Override // android.os.Parcelable.Creator
            public final EnumC6054c5 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC6054c5.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC6054c5[] newArray(int i) {
                return new EnumC6054c5[i];
            }
        };
        f1939b = MapsKt.mapOf(Tuples4.m3642to("production", enumC6054c5), Tuples4.m3642to("development", enumC6054c52), Tuples4.m3642to(AdjustConfig.ENVIRONMENT_SANDBOX, enumC6054c53), Tuples4.m3642to("devenv", enumC6054c54));
    }

    public EnumC6054c5(String str, int i, String str2) {
        this.f1942a = str2;
    }

    public static EnumEntries<EnumC6054c5> getEntries() {
        return f1941d;
    }

    public static EnumC6054c5 valueOf(String str) {
        return (EnumC6054c5) Enum.valueOf(EnumC6054c5.class, str);
    }

    public static EnumC6054c5[] values() {
        return (EnumC6054c5[]) f1940c.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getJson() {
        return this.f1942a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}

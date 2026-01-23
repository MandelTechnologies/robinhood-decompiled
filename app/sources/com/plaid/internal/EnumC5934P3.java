package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.P3 */
/* loaded from: classes16.dex */
public final class EnumC5934P3 {
    public static final EnumC5934P3 ASSERT;
    public static final a Companion;
    public static final EnumC5934P3 DEBUG;
    public static final EnumC5934P3 ERROR;
    public static final EnumC5934P3 INFO;
    public static final EnumC5934P3 VERBOSE;
    public static final EnumC5934P3 WARN;

    /* renamed from: a */
    public static final /* synthetic */ EnumC5934P3[] f1626a;

    /* renamed from: b */
    public static final /* synthetic */ EnumEntries f1627b;

    /* renamed from: com.plaid.internal.P3$a */
    public static final class a {

        /* renamed from: com.plaid.internal.P3$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C49490a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1628a;

            static {
                int[] iArr = new int[EnumC5934P3.values().length];
                try {
                    iArr[EnumC5934P3.ASSERT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5934P3.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5934P3.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC5934P3.INFO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC5934P3.VERBOSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumC5934P3.WARN.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f1628a = iArr;
            }
        }

        /* renamed from: a */
        public static int m1293a(EnumC5934P3 logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            switch (C49490a.f1628a[logLevel.ordinal()]) {
                case 1:
                    return 7;
                case 2:
                    return 3;
                case 3:
                    return 6;
                case 4:
                    return 4;
                case 5:
                    return 2;
                case 6:
                    return 5;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        EnumC5934P3 enumC5934P3 = new EnumC5934P3("ASSERT", 0);
        ASSERT = enumC5934P3;
        EnumC5934P3 enumC5934P32 = new EnumC5934P3("DEBUG", 1);
        DEBUG = enumC5934P32;
        EnumC5934P3 enumC5934P33 = new EnumC5934P3("ERROR", 2);
        ERROR = enumC5934P33;
        EnumC5934P3 enumC5934P34 = new EnumC5934P3("INFO", 3);
        INFO = enumC5934P34;
        EnumC5934P3 enumC5934P35 = new EnumC5934P3("VERBOSE", 4);
        VERBOSE = enumC5934P35;
        EnumC5934P3 enumC5934P36 = new EnumC5934P3("WARN", 5);
        WARN = enumC5934P36;
        EnumC5934P3[] enumC5934P3Arr = {enumC5934P3, enumC5934P32, enumC5934P33, enumC5934P34, enumC5934P35, enumC5934P36};
        f1626a = enumC5934P3Arr;
        f1627b = EnumEntries2.enumEntries(enumC5934P3Arr);
        Companion = new a();
    }

    public EnumC5934P3(String str, int i) {
    }

    public static EnumEntries<EnumC5934P3> getEntries() {
        return f1627b;
    }

    public static EnumC5934P3 valueOf(String str) {
        return (EnumC5934P3) Enum.valueOf(EnumC5934P3.class, str);
    }

    public static EnumC5934P3[] values() {
        return (EnumC5934P3[]) f1626a.clone();
    }
}

package com.plaid.internal;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.b1 */
/* loaded from: classes16.dex */
public final class EnumC6040b1 {
    public static final EnumC6040b1 BACKEND_DETERMINES;
    public static final EnumC6040b1 DISABLED;
    public static final EnumC6040b1 ENABLED;

    /* renamed from: a */
    public static final /* synthetic */ EnumC6040b1[] f1916a;

    /* renamed from: b */
    public static final /* synthetic */ EnumEntries f1917b;

    /* renamed from: com.plaid.internal.b1$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1918a;

        static {
            int[] iArr = new int[EnumC6040b1.values().length];
            try {
                iArr[EnumC6040b1.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6040b1.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6040b1.BACKEND_DETERMINES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1918a = iArr;
        }
    }

    static {
        EnumC6040b1 enumC6040b1 = new EnumC6040b1("ENABLED", 0);
        ENABLED = enumC6040b1;
        EnumC6040b1 enumC6040b12 = new EnumC6040b1("DISABLED", 1);
        DISABLED = enumC6040b12;
        EnumC6040b1 enumC6040b13 = new EnumC6040b1("BACKEND_DETERMINES", 2);
        BACKEND_DETERMINES = enumC6040b13;
        EnumC6040b1[] enumC6040b1Arr = {enumC6040b1, enumC6040b12, enumC6040b13};
        f1916a = enumC6040b1Arr;
        f1917b = EnumEntries2.enumEntries(enumC6040b1Arr);
    }

    public EnumC6040b1(String str, int i) {
    }

    public static EnumEntries<EnumC6040b1> getEntries() {
        return f1917b;
    }

    public static EnumC6040b1 valueOf(String str) {
        return (EnumC6040b1) Enum.valueOf(EnumC6040b1.class, str);
    }

    public static EnumC6040b1[] values() {
        return (EnumC6040b1[]) f1916a.clone();
    }

    public final boolean isSet() {
        return this != BACKEND_DETERMINES;
    }

    public final boolean toBoolean() {
        int i = a.f1918a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Cannot convert BACKEND_DETERMINES to boolean");
    }
}

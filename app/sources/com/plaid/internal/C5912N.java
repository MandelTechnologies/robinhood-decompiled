package com.plaid.internal;

import android.util.Log;

/* renamed from: com.plaid.internal.N */
/* loaded from: classes16.dex */
public final class C5912N implements InterfaceC5951R3 {

    /* renamed from: com.plaid.internal.N$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1554a;

        static {
            int[] iArr = new int[EnumC5943Q3.values().length];
            f1554a = iArr;
            try {
                iArr[EnumC5943Q3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1554a[EnumC5943Q3.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1554a[EnumC5943Q3.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1554a[EnumC5943Q3.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.plaid.internal.InterfaceC5951R3
    /* renamed from: a */
    public final void mo1260a(EnumC5943Q3 enumC5943Q3, String str) {
        int i = a.f1554a[enumC5943Q3.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else if (i != 3) {
                i2 = 4;
                if (i == 4) {
                    i2 = 6;
                }
            } else {
                i2 = 5;
            }
        }
        Log.println(i2, "ProveSDK", str);
    }

    @Override // com.plaid.internal.InterfaceC5951R3
    /* renamed from: a */
    public final void mo1261a(EnumC5943Q3 enumC5943Q3, String str, Exception exc) {
        mo1260a(enumC5943Q3, str + '\n' + Log.getStackTraceString(exc));
    }
}

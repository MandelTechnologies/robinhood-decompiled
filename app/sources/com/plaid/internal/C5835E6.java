package com.plaid.internal;

import com.plaid.internal.C5953R5;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.E6 */
/* loaded from: classes16.dex */
public final class C5835E6 {

    /* renamed from: a */
    public static C5825D5 f1339a;

    /* renamed from: com.plaid.internal.E6$a */
    public static final class a {
        @JvmStatic
        /* renamed from: a */
        public static void m1187a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C5953R5.a.m1304b(C5953R5.f1671a, message);
            C5825D5 c5825d5 = C5835E6.f1339a;
            if (c5825d5 != null) {
                c5825d5.m1175a(message);
            }
        }

        @JvmStatic
        /* renamed from: a */
        public static void m1186a(Exception exc, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            C5953R5.a.m1302a(C5953R5.f1671a, exc, message);
            C5825D5 c5825d5 = C5835E6.f1339a;
            if (c5825d5 != null) {
                c5825d5.m1175a(message + " - " + exc.getMessage());
            }
        }
    }
}

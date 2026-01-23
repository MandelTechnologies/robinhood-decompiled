package com.plaid.internal;

/* renamed from: com.plaid.internal.d7 */
/* loaded from: classes16.dex */
public final class C7059d7 {
    /* renamed from: a */
    public static String m1492a(String str) {
        if (str == null || str.length() <= 32) {
            return str;
        }
        if (str.length() <= 30) {
            return str.substring(0, 32);
        }
        return str.substring(0, 30) + "..";
    }
}

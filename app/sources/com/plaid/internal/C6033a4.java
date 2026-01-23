package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.a4 */
/* loaded from: classes16.dex */
public final class C6033a4 {

    /* renamed from: a */
    public final int f1896a;

    /* renamed from: b */
    public final String f1897b;

    public C6033a4(int i, String str) {
        this.f1896a = i;
        this.f1897b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6033a4)) {
            return false;
        }
        C6033a4 c6033a4 = (C6033a4) obj;
        return this.f1896a == c6033a4.f1896a && Intrinsics.areEqual(this.f1897b, c6033a4.f1897b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f1896a) * 31;
        String str = this.f1897b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NetworkRequestResult(status=" + this.f1896a + ", message=" + this.f1897b + ')';
    }
}

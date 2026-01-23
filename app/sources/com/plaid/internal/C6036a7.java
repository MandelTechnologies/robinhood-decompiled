package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.a7 */
/* loaded from: classes16.dex */
public final class C6036a7 extends AbstractC5919N6 {

    /* renamed from: a */
    public final String f1907a;

    /* renamed from: b */
    public final String f1908b;

    public C6036a7(String verificationId, String redirectUri) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f1907a = verificationId;
        this.f1908b = redirectUri;
    }

    /* renamed from: a */
    public final String m1365a() {
        return this.f1908b;
    }

    /* renamed from: b */
    public final String m1366b() {
        return this.f1907a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6036a7)) {
            return false;
        }
        C6036a7 c6036a7 = (C6036a7) obj;
        return Intrinsics.areEqual(this.f1907a, c6036a7.f1907a) && Intrinsics.areEqual(this.f1908b, c6036a7.f1908b);
    }

    public final int hashCode() {
        return this.f1908b.hashCode() + (this.f1907a.hashCode() * 31);
    }

    public final String toString() {
        return "TwilioSnaSessionInfo(verificationId=" + this.f1907a + ", redirectUri=" + this.f1908b + ")";
    }
}

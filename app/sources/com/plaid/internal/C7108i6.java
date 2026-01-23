package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i6 */
/* loaded from: classes16.dex */
public final class C7108i6 extends AbstractC5919N6 {

    /* renamed from: a */
    public final String f2862a;

    public C7108i6(String verificationId) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        this.f2862a = verificationId;
    }

    /* renamed from: a */
    public final String m1531a() {
        return this.f2862a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7108i6) && Intrinsics.areEqual(this.f2862a, ((C7108i6) obj).f2862a);
    }

    public final int hashCode() {
        return this.f2862a.hashCode();
    }

    public final String toString() {
        return "ProveSnaSessionInfo(verificationId=" + this.f2862a + ")";
    }
}

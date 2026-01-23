package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.z1 */
/* loaded from: classes16.dex */
public final class C7266z1 extends AbstractC5992W {

    /* renamed from: b */
    public final String f3335b;

    /* renamed from: c */
    public final Map<String, String> f3336c;

    /* renamed from: d */
    public final int f3337d;

    public C7266z1(String message, Map<String, String> data, int i) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f3335b = message;
        this.f3336c = data;
        this.f3337d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7266z1)) {
            return false;
        }
        C7266z1 c7266z1 = (C7266z1) obj;
        return Intrinsics.areEqual(this.f3335b, c7266z1.f3335b) && Intrinsics.areEqual(this.f3336c, c7266z1.f3336c) && this.f3337d == c7266z1.f3337d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3337d) + ((this.f3336c.hashCode() + (this.f3335b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InformationBreadCrumb(message=" + this.f3335b + ", data=" + this.f3336c + ", logLevel=" + this.f3337d + ")";
    }
}

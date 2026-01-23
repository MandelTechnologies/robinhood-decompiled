package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.X3 */
/* loaded from: classes16.dex */
public final class C6005X3 extends AbstractC5992W {

    /* renamed from: b */
    public final String f1820b;

    /* renamed from: c */
    public final Map<String, String> f1821c;

    /* renamed from: d */
    public final int f1822d;

    public C6005X3(Map data, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f1820b = message;
        this.f1821c = data;
        this.f1822d = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6005X3)) {
            return false;
        }
        C6005X3 c6005x3 = (C6005X3) obj;
        return Intrinsics.areEqual(this.f1820b, c6005x3.f1820b) && Intrinsics.areEqual(this.f1821c, c6005x3.f1821c);
    }

    public final int hashCode() {
        return this.f1821c.hashCode() + (this.f1820b.hashCode() * 31);
    }

    public final String toString() {
        return "NavigationBreadCrumb(message=" + this.f1820b + ", data=" + this.f1821c + ")";
    }
}

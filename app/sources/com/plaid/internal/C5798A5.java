package com.plaid.internal;

import com.google.gson.Gson;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.A5 */
/* loaded from: classes16.dex */
public final class C5798A5 {

    /* renamed from: a */
    public final Gson f1231a;

    /* renamed from: b */
    public final SocketFactory f1232b;

    public C5798A5() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5798A5)) {
            return false;
        }
        C5798A5 c5798a5 = (C5798A5) obj;
        return Intrinsics.areEqual(this.f1231a, c5798a5.f1231a) && Intrinsics.areEqual(this.f1232b, c5798a5.f1232b);
    }

    public final int hashCode() {
        Gson gson = this.f1231a;
        int iHashCode = (gson == null ? 0 : gson.hashCode()) * 31;
        SocketFactory socketFactory = this.f1232b;
        return iHashCode + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    public final String toString() {
        return "PlaidRetrofitOptions(gson=" + this.f1231a + ", socketFactory=" + this.f1232b + ")";
    }

    public C5798A5(Gson gson, int i) {
        this.f1231a = (i & 1) != 0 ? null : gson;
        this.f1232b = null;
    }
}

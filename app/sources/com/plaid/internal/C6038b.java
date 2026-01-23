package com.plaid.internal;

import com.adjust.sdk.Constants;
import com.plaid.internal.InterfaceC7184q1;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.plaid.internal.b */
/* loaded from: classes16.dex */
public final class C6038b implements InterfaceC7184q1 {

    /* renamed from: a */
    public final C7051d f1914a;

    /* renamed from: b */
    public final C5928O6 f1915b;

    public C6038b(C6023Z3 c6023z3) {
        this.f1914a = new C7051d(c6023z3);
        this.f1915b = new C5928O6(c6023z3);
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final void mo1281a() {
        this.f1914a.mo1281a();
        this.f1915b.mo1281a();
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    public final EnumC7264z isConnected() {
        return this.f1914a.isConnected();
    }

    @Override // com.plaid.internal.InterfaceC7184q1
    /* renamed from: a */
    public final InterfaceC7184q1.b mo1280a(InterfaceC7184q1.a aVar) {
        boolean zEquals;
        try {
            zEquals = new URL(aVar.f3118a).getProtocol().equals(Constants.SCHEME);
        } catch (MalformedURLException unused) {
            zEquals = false;
        }
        if (zEquals) {
            return this.f1914a.mo1280a(aVar);
        }
        return this.f1915b.mo1280a(aVar);
    }
}

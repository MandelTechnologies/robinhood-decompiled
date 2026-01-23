package com.plaid.internal;

import com.plaid.internal.C7089g7;

/* renamed from: com.plaid.internal.j */
/* loaded from: classes16.dex */
public final class C7111j implements InterfaceC5794A1 {

    /* renamed from: a */
    public final /* synthetic */ C7164o f2863a;

    public C7111j(C7164o c7164o) {
        this.f2863a = c7164o;
    }

    @Override // com.plaid.internal.InterfaceC5794A1
    /* renamed from: a */
    public final InterfaceC7184q1 mo1130a() {
        C7089g7 c7089g7 = this.f2863a.f3034f;
        C7089g7.a aVar = c7089g7.f2813a;
        if (aVar == null) {
            C7089g7.f2812d.m1635a(EnumC5943Q3.DEBUG, "no cached http client available", new Object[0]);
            return null;
        }
        if (aVar.f2816a.isConnected() == EnumC7264z.YES) {
            C7089g7.f2812d.m1635a(EnumC5943Q3.DEBUG, "use cached http client (still connected)", new Object[0]);
            return c7089g7.f2813a.f2816a;
        }
        C7089g7.f2812d.m1635a(EnumC5943Q3.DEBUG, "discard cached http client (disconnected)", new Object[0]);
        return null;
    }
}

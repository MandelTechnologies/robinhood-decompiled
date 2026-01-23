package com.plaid.internal;

/* renamed from: com.plaid.internal.u0 */
/* loaded from: classes16.dex */
public final class C7219u0 {

    /* renamed from: a */
    public final C7066e4 f3227a;

    /* renamed from: b */
    public final EnumC6053c4 f3228b;

    /* renamed from: c */
    public final C7201s0 f3229c;

    public C7219u0(C7066e4 c7066e4, EnumC6053c4 enumC6053c4, C5981U6 c5981u6, C7201s0 c7201s0) {
        this.f3227a = c7066e4;
        this.f3228b = enumC6053c4;
        this.f3229c = c7201s0;
    }

    /* renamed from: a */
    public final C6038b m1620a() throws C7182q, InterruptedException {
        if (this.f3227a.m1496a()) {
            throw new C7182q(EnumC5957S0.PRE_CHECK_AIRPLANE_MODE_ENABLED);
        }
        C6023Z3 c6023z3M1495a = this.f3227a.m1495a(this.f3228b);
        if (c6023z3M1495a == null) {
            throw new C7182q(EnumC5957S0.PRE_CHECK_NO_CELLULAR_RADIO);
        }
        try {
            C6038b c6038b = new C6038b(c6023z3M1495a);
            c6038b.f1914a.f2713c = 10000;
            c6038b.f1915b.f1605c = 10000;
            if (this.f3229c.m1601a(c6038b)) {
                return c6038b;
            }
            throw new C7182q(EnumC5957S0.PRE_CHECK_NO_CELLULAR_CONNECTION);
        } catch (C7182q | RuntimeException e) {
            if (!c6023z3M1495a.f1867d) {
                c6023z3M1495a.f1867d = true;
                c6023z3M1495a.f1865b.run();
            }
            throw e;
        }
    }
}

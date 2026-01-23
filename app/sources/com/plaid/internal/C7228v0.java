package com.plaid.internal;

/* renamed from: com.plaid.internal.v0 */
/* loaded from: classes16.dex */
public final class C7228v0 implements InterfaceC5946Q6 {

    /* renamed from: a */
    public final C7219u0 f3238a;

    public C7228v0(C7219u0 c7219u0) {
        this.f3238a = c7219u0;
    }

    @Override // com.plaid.internal.InterfaceC5946Q6
    /* renamed from: a */
    public final C7091h mo1296a(Object obj, C7173p c7173p) {
        try {
            InterfaceC7184q1 interfaceC7184q1Mo1130a = ((InterfaceC5794A1) obj).mo1130a();
            return interfaceC7184q1Mo1130a != null ? C7091h.m1518a(interfaceC7184q1Mo1130a) : C7091h.m1518a(this.f3238a.m1620a());
        } catch (C7182q e) {
            return C7091h.m1517a((Exception) e);
        }
    }
}

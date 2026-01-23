package com.plaid.internal;

/* renamed from: com.plaid.internal.g1 */
/* loaded from: classes16.dex */
public final class C7083g1 implements InterfaceC7073f1 {

    /* renamed from: a */
    public final String f2790a;

    /* renamed from: b */
    public final long f2791b;

    /* renamed from: c */
    public final String f2792c;

    public C7083g1(long j, String str, String str2) {
        this.f2790a = str;
        this.f2791b = j;
        this.f2792c = str2;
    }

    @Override // com.plaid.internal.InterfaceC7073f1
    /* renamed from: a */
    public final String mo1502a(InterfaceC7184q1 interfaceC7184q1, C7173p c7173p) throws InterruptedException {
        c7173p.f3082d = "test";
        c7173p.f3083e = this.f2792c;
        long j = this.f2791b;
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return this.f2790a;
    }
}

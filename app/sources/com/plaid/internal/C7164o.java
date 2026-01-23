package com.plaid.internal;

import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.o */
/* loaded from: classes16.dex */
public final class C7164o<R> {

    /* renamed from: g */
    public static final C7237w0 f3028g;

    /* renamed from: a */
    public final C7228v0 f3029a;

    /* renamed from: b */
    public final C7210t0 f3030b;

    /* renamed from: c */
    public final C7118j6 f3031c;

    /* renamed from: d */
    public final C7192r0 f3032d;

    /* renamed from: e */
    public final C7098h6 f3033e;

    /* renamed from: f */
    public final C7089g7 f3034f;

    /* renamed from: com.plaid.internal.o$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC7184q1 f3035a;

        /* renamed from: b */
        public final C5811C0 f3036b;

        public a(C5811C0 c5811c0, InterfaceC7184q1 interfaceC7184q1) {
            this.f3035a = interfaceC7184q1;
            this.f3036b = c5811c0;
        }
    }

    public C7164o(C7089g7 c7089g7, C7228v0 c7228v0, C7210t0 c7210t0, C7118j6 c7118j6, C7192r0 c7192r0, C7098h6 c7098h6) {
        this.f3034f = c7089g7;
        this.f3029a = c7228v0;
        this.f3030b = c7210t0;
        this.f3031c = c7118j6;
        this.f3032d = c7192r0;
        this.f3033e = c7098h6;
    }

    /* renamed from: a */
    public static void m1568a(EnumC5954R6 enumC5954R6, C7173p c7173p) throws C7182q {
        if (enumC5954R6 != EnumC5954R6.FINISH && c7173p.f3079a) {
            throw new C7182q(EnumC5957S0.GENERIC_TIMEOUT);
        }
        c7173p.f3080b = enumC5954R6;
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f3028g = new C7237w0("auth");
    }

    /* renamed from: a */
    public static <I, O> O m1567a(EnumC5954R6 enumC5954R6, InterfaceC5946Q6<I, O> interfaceC5946Q6, I i, C7173p c7173p) throws C7191r {
        try {
            m1568a(enumC5954R6, c7173p);
            f3028g.m1635a(EnumC5943Q3.INFO, "execute step: " + enumC5954R6, new Object[0]);
            return (O) interfaceC5946Q6.mo1296a(i, c7173p).m1519a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new C7191r(enumC5954R6, e);
        } catch (ExecutionException e2) {
            throw new C7191r(enumC5954R6, e2.getCause());
        } catch (Exception e3) {
            throw new C7191r(enumC5954R6, e3);
        }
    }
}

package com.plaid.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/* renamed from: com.plaid.internal.V6 */
/* loaded from: classes16.dex */
public final class C5990V6<R> {

    /* renamed from: a */
    public final C7164o<R> f1774a;

    /* renamed from: b */
    public final ExecutorService f1775b = Executors.newCachedThreadPool();

    /* renamed from: c */
    public final boolean f1776c = true;

    /* renamed from: d */
    public final C5820D0 f1777d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.plaid.internal.V6$a */
    public class a<T> implements Callable<T> {

        /* renamed from: a */
        public final /* synthetic */ c f1778a;

        public a(c cVar) {
            this.f1778a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            return (T) this.f1778a.call();
        }
    }

    /* renamed from: com.plaid.internal.V6$b */
    public class b implements c<R> {

        /* renamed from: a */
        public final /* synthetic */ C7173p f1779a;

        public b(C7173p c7173p) {
            this.f1779a = c7173p;
        }

        @Override // com.plaid.internal.C5990V6.c
        public final R call() {
            C7164o<R> c7164o = C5990V6.this.f1774a;
            c7164o.f3034f.m1514a((InterfaceC7184q1) C7164o.m1567a(EnumC5954R6.PRE_CHECK, c7164o.f3029a, new C7101i(), this.f1779a));
            return null;
        }
    }

    /* renamed from: com.plaid.internal.V6$c */
    public interface c<T> {
        T call();
    }

    public C5990V6(C7164o c7164o, C5820D0 c5820d0) {
        this.f1774a = c7164o;
        this.f1777d = c5820d0;
    }

    /* renamed from: a */
    public final <T> T m1333a(c<T> cVar, C7173p c7173p) throws C7191r {
        try {
            return this.f1775b.submit(new a(cVar)).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new C7191r(c7173p.f3080b, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof C7191r) {
                throw ((C7191r) cause);
            }
            throw new C7191r(c7173p.f3080b, cause);
        } catch (TimeoutException unused) {
            c7173p.f3079a = true;
            throw new C7191r(c7173p.f3080b, new C7182q(EnumC5957S0.GENERIC_TIMEOUT));
        }
    }

    /* renamed from: b */
    public final void m1334b() throws C7191r {
        C7173p c7173p = new C7173p();
        m1333a(new b(c7173p), c7173p);
    }

    /* renamed from: a */
    public final R m1332a() throws C7191r {
        String strM1208a;
        C7173p c7173p = new C7173p();
        try {
            strM1208a = (String) m1333a(new C5999W6(this, c7173p), c7173p);
        } catch (C7191r e) {
            if (this.f1776c && e.f3144a == EnumC5954R6.AUTHENTICATION) {
                strM1208a = C5855H.m1208a(e, c7173p);
            } else {
                throw e;
            }
        }
        C7164o<R> c7164o = this.f1774a;
        c7164o.getClass();
        try {
            R r = (R) C7164o.m1567a(EnumC5954R6.FINISH, c7164o.f3033e, new C7155n(strM1208a), c7173p);
            C7164o.f3028g.m1635a(EnumC5943Q3.INFO, "authentication completed", new Object[0]);
            C7089g7 c7089g7 = c7164o.f3034f;
            synchronized (c7089g7) {
                c7089g7.m1515b();
            }
            return r;
        } catch (C7191r e2) {
            c7164o.f3034f.m1513a();
            throw e2;
        }
    }
}

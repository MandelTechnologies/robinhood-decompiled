package com.plaid.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.plaid.internal.g7 */
/* loaded from: classes16.dex */
public final class C7089g7 {

    /* renamed from: d */
    public static final C7237w0 f2812d;

    /* renamed from: a */
    public a f2813a;

    /* renamed from: b */
    public final Handler f2814b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final int f2815c = 120000;

    /* renamed from: com.plaid.internal.g7$a */
    public static class a {

        /* renamed from: a */
        public final InterfaceC7184q1 f2816a;

        /* renamed from: b */
        public final RunnableC49491a f2817b = new RunnableC49491a();

        /* renamed from: c */
        public boolean f2818c = false;

        /* renamed from: com.plaid.internal.g7$a$a, reason: collision with other inner class name */
        public class RunnableC49491a implements Runnable {
            public RunnableC49491a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                if (aVar.f2818c) {
                    return;
                }
                C7089g7.f2812d.m1635a(EnumC5943Q3.INFO, "release http client", new Object[0]);
                aVar.f2818c = true;
                aVar.f2816a.mo1281a();
            }
        }

        public a(InterfaceC7184q1 interfaceC7184q1) {
            this.f2816a = interfaceC7184q1;
        }
    }

    /* renamed from: a */
    public final void m1513a() {
        synchronized (this) {
            m1515b();
        }
    }

    /* renamed from: b */
    public final synchronized void m1515b() {
        try {
            if (this.f2813a != null) {
                C7237w0 c7237w0 = f2812d;
                c7237w0.m1635a(EnumC5943Q3.DEBUG, "release cached http client", new Object[0]);
                this.f2814b.removeCallbacks(this.f2813a.f2817b);
                a aVar = this.f2813a;
                if (!aVar.f2818c) {
                    c7237w0.m1635a(EnumC5943Q3.INFO, "release http client", new Object[0]);
                    aVar.f2818c = true;
                    aVar.f2816a.mo1281a();
                }
                this.f2813a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    static {
        EnumC5943Q3 enumC5943Q3 = C5969T3.f1714a;
        f2812d = new C7237w0("reuse-network");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000e, B:14:0x0018, B:16:0x0042, B:18:0x0046, B:12:0x0014, B:15:0x002d), top: B:23:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[Catch: all -> 0x0007, TRY_LEAVE, TryCatch #0 {all -> 0x0007, blocks: (B:4:0x0003, B:7:0x0009, B:9:0x000e, B:14:0x0018, B:16:0x0042, B:18:0x0046, B:12:0x0014, B:15:0x002d), top: B:23:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m1514a(InterfaceC7184q1 interfaceC7184q1) {
        int i;
        try {
            if (interfaceC7184q1 == null) {
                m1515b();
            } else {
                a aVar = this.f2813a;
                if (aVar != null) {
                    if ((aVar.f2818c ? null : aVar.f2816a) == interfaceC7184q1) {
                        f2812d.m1635a(EnumC5943Q3.INFO, "reuse cached http client", new Object[0]);
                        this.f2814b.removeCallbacks(this.f2813a.f2817b);
                    }
                    i = this.f2815c;
                    if (i > 0) {
                    }
                } else {
                    m1515b();
                    f2812d.m1635a(EnumC5943Q3.INFO, "cache http client", new Object[0]);
                    this.f2813a = new a(interfaceC7184q1);
                    i = this.f2815c;
                    if (i > 0) {
                        f2812d.m1635a(EnumC5943Q3.INFO, "schedule http client release in %d ms", Integer.valueOf(i));
                        this.f2814b.postDelayed(this.f2813a.f2817b, this.f2815c);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}

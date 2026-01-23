package com.plaid.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* renamed from: com.plaid.internal.h */
/* loaded from: classes16.dex */
public final class C7091h<T> {

    /* renamed from: a */
    public volatile T f2820a;

    /* renamed from: b */
    public volatile Exception f2821b;

    /* renamed from: c */
    public final CountDownLatch f2822c = new CountDownLatch(1);

    /* renamed from: a */
    public static <T> C7091h<T> m1518a(T t) {
        C7091h<T> c7091h = new C7091h<>();
        synchronized (c7091h.f2822c) {
            try {
                if (c7091h.f2822c.getCount() > 0) {
                    c7091h.f2820a = t;
                    c7091h.f2822c.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7091h;
    }

    /* renamed from: a */
    public static <T> C7091h<T> m1517a(Exception exc) {
        C7091h<T> c7091h = new C7091h<>();
        synchronized (c7091h.f2822c) {
            try {
                if (c7091h.f2822c.getCount() > 0) {
                    c7091h.f2821b = exc;
                    c7091h.f2822c.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7091h;
    }

    /* renamed from: a */
    public final T m1519a() throws ExecutionException, InterruptedException {
        this.f2822c.await();
        if (this.f2821b == null) {
            return this.f2820a;
        }
        throw new ExecutionException(this.f2821b);
    }
}

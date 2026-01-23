package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.w */
/* loaded from: classes27.dex */
final class C5217w extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f860a;

    /* renamed from: b */
    final /* synthetic */ AbstractRunnableC5214t f861b;

    /* renamed from: c */
    final /* synthetic */ C5171ae f862c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5217w(C5171ae c5171ae, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC5214t abstractRunnableC5214t) {
        super(taskCompletionSource);
        this.f860a = taskCompletionSource2;
        this.f861b = abstractRunnableC5214t;
        this.f862c = c5171ae;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    public final void mo861b() {
        synchronized (this.f862c.f824g) {
            try {
                C5171ae.m928o(this.f862c, this.f860a);
                if (this.f862c.f830m.getAndIncrement() > 0) {
                    this.f862c.f820c.m986d("Already connected to the service.", new Object[0]);
                }
                C5171ae.m930q(this.f862c, this.f861b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

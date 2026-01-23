package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.x */
/* loaded from: classes27.dex */
final class C5218x extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ C5171ae f863a;

    C5218x(C5171ae c5171ae) {
        this.f863a = c5171ae;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    public final void mo861b() {
        synchronized (this.f863a.f824g) {
            try {
                if (this.f863a.f830m.get() > 0 && this.f863a.f830m.decrementAndGet() > 0) {
                    this.f863a.f820c.m986d("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                C5171ae c5171ae = this.f863a;
                if (c5171ae.f832o != null) {
                    c5171ae.f820c.m986d("Unbind from service.", new Object[0]);
                    C5171ae c5171ae2 = this.f863a;
                    c5171ae2.f819b.unbindService(c5171ae2.f831n);
                    this.f863a.f825h = false;
                    this.f863a.f832o = null;
                    this.f863a.f831n = null;
                }
                this.f863a.m934x();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

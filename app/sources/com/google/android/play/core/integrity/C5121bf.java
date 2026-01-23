package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC5203i;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bf */
/* loaded from: classes27.dex */
final class C5121bf extends AbstractC5128bm {

    /* renamed from: a */
    final /* synthetic */ long f741a;

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f742b;

    /* renamed from: c */
    final /* synthetic */ C5129bn f743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5121bf(C5129bn c5129bn, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(c5129bn, taskCompletionSource);
        this.f741a = j;
        this.f742b = taskCompletionSource2;
        this.f743c = c5129bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        if (C5129bn.m896l(this.f743c)) {
            super.mo860a(new StandardIntegrityException(-2, null));
            return;
        }
        if (C5129bn.m895k(this.f743c, 0)) {
            super.mo860a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            C5129bn c5129bn = this.f743c;
            ((InterfaceC5203i) c5129bn.f763a.m936e()).mo977e(C5129bn.m889b(c5129bn, this.f741a, 0), new BinderC5127bl(this.f743c, this.f742b));
        } catch (RemoteException e) {
            this.f743c.f764b.m985c(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f741a));
            this.f742b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}

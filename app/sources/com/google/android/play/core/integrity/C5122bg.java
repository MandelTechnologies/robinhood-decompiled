package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.integrity.internal.InterfaceC5203i;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bg */
/* loaded from: classes27.dex */
final class C5122bg extends AbstractC5128bm {

    /* renamed from: a */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f744a;

    /* renamed from: b */
    final /* synthetic */ long f745b;

    /* renamed from: c */
    final /* synthetic */ long f746c;

    /* renamed from: d */
    final /* synthetic */ TaskCompletionSource f747d;

    /* renamed from: e */
    final /* synthetic */ C5129bn f748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5122bg(C5129bn c5129bn, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(c5129bn, taskCompletionSource);
        this.f744a = standardIntegrityTokenRequest;
        this.f745b = j;
        this.f746c = j2;
        this.f747d = taskCompletionSource2;
        this.f748e = c5129bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        if (C5129bn.m896l(this.f748e)) {
            super.mo860a(new StandardIntegrityException(-2, null));
            return;
        }
        if (C5129bn.m895k(this.f748e, 0)) {
            super.mo860a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            C5129bn c5129bn = this.f748e;
            ((InterfaceC5203i) c5129bn.f763a.m936e()).mo976d(C5129bn.m888a(c5129bn, this.f744a, this.f745b, this.f746c, 0), new BinderC5126bk(this.f748e, this.f747d, this.f745b));
        } catch (RemoteException e) {
            this.f748e.f764b.m985c(e, "requestExpressIntegrityToken(%s, %s, %s)", this.f744a.requestHash(), this.f744a.verdictOptOut(), Long.valueOf(this.f745b));
            this.f747d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}

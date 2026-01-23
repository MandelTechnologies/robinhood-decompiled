package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5171ae;
import com.google.android.play.integrity.internal.InterfaceC5203i;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bh */
/* loaded from: classes27.dex */
final class C5123bh extends AbstractC5128bm {

    /* renamed from: a */
    final /* synthetic */ Bundle f749a;

    /* renamed from: b */
    final /* synthetic */ Activity f750b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f751c;

    /* renamed from: d */
    final /* synthetic */ int f752d;

    /* renamed from: e */
    final /* synthetic */ C5129bn f753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5123bh(C5129bn c5129bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(c5129bn, taskCompletionSource);
        this.f749a = bundle;
        this.f750b = activity;
        this.f751c = taskCompletionSource2;
        this.f752d = i;
        this.f753e = c5129bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        if (C5129bn.m896l(this.f753e)) {
            super.mo860a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C5129bn c5129bn = this.f753e;
            C5171ae c5171ae = c5129bn.f763a;
            ((InterfaceC5203i) c5171ae.m936e()).mo975c(this.f749a, c5129bn.f767e.m873a(this.f750b, this.f751c, c5171ae));
        } catch (RemoteException e) {
            this.f753e.f764b.m985c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f752d));
            this.f751c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}

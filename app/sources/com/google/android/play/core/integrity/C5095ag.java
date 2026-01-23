package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5214t;
import com.google.android.play.integrity.internal.InterfaceC5208n;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ag */
/* loaded from: classes27.dex */
final class C5095ag extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ Bundle f692a;

    /* renamed from: b */
    final /* synthetic */ Activity f693b;

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f694c;

    /* renamed from: d */
    final /* synthetic */ int f695d;

    /* renamed from: e */
    final /* synthetic */ C5098aj f696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5095ag(C5098aj c5098aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f692a = bundle;
        this.f693b = activity;
        this.f694c = taskCompletionSource2;
        this.f695d = i;
        this.f696e = c5098aj;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        try {
            InterfaceC5208n interfaceC5208n = (InterfaceC5208n) this.f696e.f701a.m936e();
            Bundle bundle = this.f692a;
            C5098aj c5098aj = this.f696e;
            interfaceC5208n.mo979c(bundle, c5098aj.f705e.m873a(this.f693b, this.f694c, c5098aj.f701a));
        } catch (RemoteException e) {
            this.f696e.f702b.m985c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.f695d));
            this.f694c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}

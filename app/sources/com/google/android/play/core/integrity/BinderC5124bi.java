package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC5204j;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bi */
/* loaded from: classes27.dex */
class BinderC5124bi extends AbstractBinderC5204j {

    /* renamed from: a */
    final TaskCompletionSource f754a;

    /* renamed from: b */
    final /* synthetic */ C5129bn f755b;

    BinderC5124bi(C5129bn c5129bn, TaskCompletionSource taskCompletionSource) {
        this.f755b = c5129bn;
        this.f754a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: b */
    public final void mo883b(Bundle bundle) throws RemoteException {
        this.f755b.f763a.m939v(this.f754a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: c */
    public void mo884c(Bundle bundle) throws RemoteException {
        this.f755b.f763a.m939v(this.f754a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: d */
    public final void mo885d(Bundle bundle) throws RemoteException {
        this.f755b.f763a.m939v(this.f754a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: e */
    public void mo886e(Bundle bundle) throws RemoteException {
        this.f755b.f763a.m939v(this.f754a);
    }
}

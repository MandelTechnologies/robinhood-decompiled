package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.aa */
/* loaded from: classes27.dex */
final class C5167aa extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ IBinder f814a;

    /* renamed from: b */
    final /* synthetic */ ServiceConnectionC5170ad f815b;

    C5167aa(ServiceConnectionC5170ad serviceConnectionC5170ad, IBinder iBinder) {
        this.f814a = iBinder;
        this.f815b = serviceConnectionC5170ad;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    public final void mo861b() throws RemoteException {
        this.f815b.f817a.f832o = (IInterface) this.f815b.f817a.f827j.mo859a(this.f814a);
        C5171ae.m931r(this.f815b.f817a);
        this.f815b.f817a.f825h = false;
        Iterator it = this.f815b.f817a.f822e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f815b.f817a.f822e.clear();
    }
}

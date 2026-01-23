package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5214t;
import com.google.android.play.integrity.internal.C5172af;
import com.google.android.play.integrity.internal.InterfaceC5208n;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.af */
/* loaded from: classes27.dex */
final class C5094af extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ byte[] f686a;

    /* renamed from: b */
    final /* synthetic */ Long f687b;

    /* renamed from: c */
    final /* synthetic */ Parcelable f688c;

    /* renamed from: d */
    final /* synthetic */ TaskCompletionSource f689d;

    /* renamed from: e */
    final /* synthetic */ IntegrityTokenRequest f690e;

    /* renamed from: f */
    final /* synthetic */ C5098aj f691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5094af(C5098aj c5098aj, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f686a = bArr;
        this.f687b = l;
        this.f688c = parcelable;
        this.f689d = taskCompletionSource2;
        this.f690e = integrityTokenRequest;
        this.f691f = c5098aj;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: a */
    public final void mo860a(Exception exc) {
        if (exc instanceof C5172af) {
            super.mo860a(new IntegrityServiceException(-9, exc));
        } else {
            super.mo860a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        try {
            ((InterfaceC5208n) this.f691f.f701a.m936e()).mo980d(C5098aj.m864a(this.f691f, this.f686a, this.f687b, this.f688c), new BinderC5097ai(this.f691f, this.f689d));
        } catch (RemoteException e) {
            this.f691f.f702b.m985c(e, "requestIntegrityToken(%s)", this.f690e);
            this.f689d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}

package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5213s;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bk */
/* loaded from: classes27.dex */
final class BinderC5126bk extends BinderC5124bi {

    /* renamed from: c */
    final /* synthetic */ C5129bn f757c;

    /* renamed from: d */
    private final C5213s f758d;

    /* renamed from: e */
    private final long f759e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC5126bk(C5129bn c5129bn, TaskCompletionSource taskCompletionSource, long j) {
        super(c5129bn, taskCompletionSource);
        this.f757c = c5129bn;
        this.f758d = new C5213s("OnRequestIntegrityTokenCallback");
        this.f759e = j;
    }

    @Override // com.google.android.play.core.integrity.BinderC5124bi, com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: c */
    public final void mo884c(Bundle bundle) throws RemoteException {
        super.mo884c(bundle);
        this.f758d.m986d("onRequestExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo902a = this.f757c.f768f.mo902a(bundle);
        if (apiExceptionMo902a != null) {
            this.f754a.trySetException(apiExceptionMo902a);
            return;
        }
        C5125bj c5125bj = new C5125bj(this, this.f757c.f765c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f754a;
        C5115b c5115b = new C5115b();
        c5115b.mo880b(bundle.getString("token"));
        c5115b.mo879a(c5125bj);
        taskCompletionSource.trySetResult(c5115b.mo881c());
    }
}

package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5213s;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bl */
/* loaded from: classes27.dex */
final class BinderC5127bl extends BinderC5124bi {

    /* renamed from: c */
    final /* synthetic */ C5129bn f760c;

    /* renamed from: d */
    private final C5213s f761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC5127bl(C5129bn c5129bn, TaskCompletionSource taskCompletionSource) {
        super(c5129bn, taskCompletionSource);
        this.f760c = c5129bn;
        this.f761d = new C5213s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC5124bi, com.google.android.play.integrity.internal.InterfaceC5205k
    /* renamed from: e */
    public final void mo886e(Bundle bundle) throws RemoteException {
        super.mo886e(bundle);
        this.f761d.m986d("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionMo902a = this.f760c.f768f.mo902a(bundle);
        if (apiExceptionMo902a != null) {
            this.f754a.trySetException(apiExceptionMo902a);
        } else {
            this.f754a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}

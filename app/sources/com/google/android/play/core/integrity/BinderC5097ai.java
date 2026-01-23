package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC5209o;
import com.google.android.play.integrity.internal.C5213s;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ai */
/* loaded from: classes27.dex */
final class BinderC5097ai extends AbstractBinderC5209o {

    /* renamed from: a */
    final /* synthetic */ C5098aj f698a;

    /* renamed from: b */
    private final C5213s f699b = new C5213s("OnRequestIntegrityTokenCallback");

    /* renamed from: c */
    private final TaskCompletionSource f700c;

    BinderC5097ai(C5098aj c5098aj, TaskCompletionSource taskCompletionSource) {
        this.f698a = c5098aj;
        this.f700c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5210p
    /* renamed from: b */
    public final void mo863b(Bundle bundle) {
        this.f698a.f701a.m939v(this.f700c);
        this.f699b.m986d("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionMo902a = this.f698a.f706f.mo902a(bundle);
        if (apiExceptionMo902a != null) {
            this.f700c.trySetException(apiExceptionMo902a);
            return;
        }
        String string2 = bundle.getString("token");
        if (string2 == null) {
            this.f700c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        C5096ah c5096ah = new C5096ah(this, this.f698a.f703c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f700c;
        C5088a c5088a = new C5088a();
        c5088a.mo855b(string2);
        c5088a.mo854a(c5096ah);
        taskCompletionSource.trySetResult(c5088a.mo856c());
    }
}

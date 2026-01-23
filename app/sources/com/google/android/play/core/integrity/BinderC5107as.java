package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.AbstractBinderC5211q;
import com.google.android.play.integrity.internal.C5171ae;
import com.google.android.play.integrity.internal.C5213s;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.as */
/* loaded from: classes27.dex */
final class BinderC5107as extends AbstractBinderC5211q {

    /* renamed from: a */
    final TaskCompletionSource f719a;

    /* renamed from: b */
    final C5171ae f720b;

    /* renamed from: c */
    private final C5213s f721c = new C5213s("RequestDialogCallbackImpl");

    /* renamed from: d */
    private final String f722d;

    /* renamed from: e */
    private final InterfaceC5146k f723e;

    /* renamed from: f */
    private final Activity f724f;

    BinderC5107as(Context context, InterfaceC5146k interfaceC5146k, Activity activity, TaskCompletionSource taskCompletionSource, C5171ae c5171ae) {
        this.f722d = context.getPackageName();
        this.f723e = interfaceC5146k;
        this.f719a = taskCompletionSource;
        this.f724f = activity;
        this.f720b = c5171ae;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC5212r
    /* renamed from: b */
    public final void mo872b(Bundle bundle) {
        this.f720b.m939v(this.f719a);
        this.f721c.m986d("onRequestDialog(%s)", this.f722d);
        ApiException apiExceptionMo902a = this.f723e.mo902a(bundle);
        if (apiExceptionMo902a != null) {
            this.f719a.trySetException(apiExceptionMo902a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f721c.m984b("onRequestDialog(%s): got null dialog intent", this.f722d);
            this.f719a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f724f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ResultReceiverC5106ar(this, this.f720b.m935c()));
        this.f721c.m983a("Starting dialog intent...", new Object[0]);
        this.f724f.startActivityForResult(intent, 0);
    }
}

package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C5171ae;
import com.google.android.play.integrity.internal.InterfaceC5196bd;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.at */
/* loaded from: classes27.dex */
final class C5108at {

    /* renamed from: a */
    private final InterfaceC5196bd f725a;

    /* renamed from: b */
    private final InterfaceC5196bd f726b;

    C5108at(InterfaceC5196bd interfaceC5196bd, InterfaceC5196bd interfaceC5196bd2) {
        this.f725a = interfaceC5196bd;
        this.f726b = interfaceC5196bd2;
    }

    /* renamed from: a */
    final BinderC5107as m873a(Activity activity, TaskCompletionSource taskCompletionSource, C5171ae c5171ae) {
        Context context = (Context) this.f725a.mo857a();
        context.getClass();
        InterfaceC5146k interfaceC5146k = (InterfaceC5146k) this.f726b.mo857a();
        interfaceC5146k.getClass();
        activity.getClass();
        c5171ae.getClass();
        return new BinderC5107as(context, interfaceC5146k, activity, taskCompletionSource, c5171ae);
    }
}

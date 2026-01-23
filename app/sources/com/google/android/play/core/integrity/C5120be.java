package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5214t;
import com.google.android.play.integrity.internal.C5175ai;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.be */
/* loaded from: classes27.dex */
final class C5120be extends AbstractRunnableC5214t {

    /* renamed from: a */
    final /* synthetic */ Context f739a;

    /* renamed from: b */
    final /* synthetic */ C5129bn f740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5120be(C5129bn c5129bn, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f739a = context;
        this.f740b = c5129bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: b */
    protected final void mo861b() {
        this.f740b.f766d.trySetResult(Integer.valueOf(C5175ai.m942a(this.f739a)));
    }
}

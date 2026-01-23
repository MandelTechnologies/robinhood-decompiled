package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC5214t;
import com.google.android.play.integrity.internal.C5172af;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bm */
/* loaded from: classes27.dex */
abstract class AbstractC5128bm extends AbstractRunnableC5214t {

    /* renamed from: f */
    final /* synthetic */ C5129bn f762f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractC5128bm(C5129bn c5129bn, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f762f = c5129bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC5214t
    /* renamed from: a */
    public final void mo860a(Exception exc) {
        if (!(exc instanceof C5172af)) {
            super.mo860a(exc);
        } else if (C5129bn.m896l(this.f762f)) {
            super.mo860a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo860a(new StandardIntegrityException(-9, exc));
        }
    }
}

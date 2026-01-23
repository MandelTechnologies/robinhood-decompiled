package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ah */
/* loaded from: classes27.dex */
final class C5096ah extends AbstractC5162y {

    /* renamed from: a */
    final /* synthetic */ BinderC5097ai f697a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5096ah(BinderC5097ai binderC5097ai, String str, long j) {
        super(str, j);
        this.f697a = binderC5097ai;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5162y
    /* renamed from: b */
    final Task mo862b(Activity activity, Bundle bundle) {
        return this.f697a.f698a.m869b(activity, bundle);
    }
}

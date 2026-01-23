package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.bj */
/* loaded from: classes27.dex */
final class C5125bj extends AbstractC5162y {

    /* renamed from: a */
    final /* synthetic */ BinderC5126bk f756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5125bj(BinderC5126bk binderC5126bk, String str, long j) {
        super(str, j);
        this.f756a = binderC5126bk;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5162y
    /* renamed from: b */
    final Task mo862b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f756a.f759e);
        return this.f756a.f757c.m897c(activity, bundle);
    }
}

package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.br */
/* loaded from: classes27.dex */
final class C5133br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a */
    private final String f773a;

    /* renamed from: b */
    private final AbstractC5162y f774b;

    C5133br(String str, AbstractC5162y abstractC5162y) {
        this.f773a = str;
        this.f774b = abstractC5162y;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.f774b.m911a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f773a;
    }
}

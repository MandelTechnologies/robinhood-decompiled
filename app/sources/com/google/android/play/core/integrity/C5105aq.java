package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.aq */
/* loaded from: classes27.dex */
final class C5105aq extends IntegrityTokenResponse {

    /* renamed from: a */
    private final String f716a;

    /* renamed from: b */
    private final AbstractC5162y f717b;

    C5105aq(String str, AbstractC5162y abstractC5162y) {
        this.f716a = str;
        this.f717b = abstractC5162y;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i) {
        return this.f717b.m911a(activity, i);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f716a;
    }
}

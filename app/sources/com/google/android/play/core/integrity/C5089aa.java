package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.aa */
/* loaded from: classes27.dex */
final class C5089aa implements IntegrityManager {

    /* renamed from: a */
    private final C5098aj f683a;

    C5089aa(C5098aj c5098aj) {
        this.f683a = c5098aj;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f683a.m870c(integrityTokenRequest);
    }
}

package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.c */
/* loaded from: classes27.dex */
final class C5137c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a */
    private long f780a;

    /* renamed from: b */
    private byte f781b;

    C5137c() {
    }

    /* renamed from: a */
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder m901a(int i) {
        this.f781b = (byte) (this.f781b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f781b == 3) {
            return new C5140e(this.f780a, 0, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f781b & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.f781b & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f780a = j;
        this.f781b = (byte) (this.f781b | 1);
        return this;
    }
}

package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.am */
/* loaded from: classes27.dex */
final class C5101am extends IntegrityTokenRequest.Builder {

    /* renamed from: a */
    private String f711a;

    /* renamed from: b */
    private Long f712b;

    C5101am() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f711a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        C5102an c5102an = null;
        return new C5103ao(str, this.f712b, c5102an, c5102an);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.f712b = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f711a = str;
        return this;
    }
}

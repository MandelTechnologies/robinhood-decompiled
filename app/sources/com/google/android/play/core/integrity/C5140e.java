package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.e */
/* loaded from: classes27.dex */
final class C5140e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {

    /* renamed from: a */
    private final long f782a;

    /* synthetic */ C5140e(long j, int i, C5139d c5139d) {
        this.f782a = j;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: a */
    final int mo852a() {
        return 0;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest
    /* renamed from: b */
    public final long mo853b() {
        return this.f782a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) {
            StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest = (StandardIntegrityManager.PrepareIntegrityTokenRequest) obj;
            if (this.f782a == prepareIntegrityTokenRequest.mo853b()) {
                prepareIntegrityTokenRequest.mo852a();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f782a;
        return (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "PrepareIntegrityTokenRequest{cloudProjectNumber=" + this.f782a + ", webViewRequestMode=0}";
    }
}

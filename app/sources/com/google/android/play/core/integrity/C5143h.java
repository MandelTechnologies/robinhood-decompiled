package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.h */
/* loaded from: classes27.dex */
final class C5143h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a */
    private final String f785a;

    /* renamed from: b */
    private final Set f786b;

    /* synthetic */ C5143h(String str, Set set, C5142g c5142g) {
        this.f785a = str;
        this.f786b = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = (StandardIntegrityManager.StandardIntegrityTokenRequest) obj;
            String str = this.f785a;
            if (str != null ? str.equals(standardIntegrityTokenRequest.requestHash()) : standardIntegrityTokenRequest.requestHash() == null) {
                if (this.f786b.equals(standardIntegrityTokenRequest.verdictOptOut())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String requestHash() {
        return this.f785a;
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f785a + ", verdictOptOut=" + this.f786b.toString() + "}";
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final Set<Integer> verdictOptOut() {
        return this.f786b;
    }

    public final int hashCode() {
        String str = this.f785a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f786b.hashCode();
    }
}

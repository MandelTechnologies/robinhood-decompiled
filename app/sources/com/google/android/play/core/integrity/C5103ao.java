package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.ao */
/* loaded from: classes27.dex */
final class C5103ao extends IntegrityTokenRequest {

    /* renamed from: a */
    private final String f713a;

    /* renamed from: b */
    private final Long f714b;

    /* renamed from: c */
    private final Object f715c = null;

    /* synthetic */ C5103ao(String str, Long l, Object obj, C5102an c5102an) {
        this.f713a = str;
        this.f714b = l;
    }

    /* renamed from: a */
    private static boolean m871a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f714b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            z = this.f713a.equals(integrityTokenRequest.nonce()) && ((l = this.f714b) != null ? l.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null);
        }
        if (!(obj instanceof C5103ao) || !m871a()) {
            return z;
        }
        C5103ao c5103ao = (C5103ao) obj;
        if (!z) {
            return false;
        }
        Object obj2 = c5103ao.f715c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f713a.hashCode() ^ 1000003;
        Long l = this.f714b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l == null ? 0 : l.hashCode());
        return m871a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f713a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f713a + ", cloudProjectNumber=" + this.f714b;
        if (m871a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}

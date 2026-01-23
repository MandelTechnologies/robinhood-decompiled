package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.a */
/* loaded from: classes27.dex */
final class C5088a extends AbstractC5104ap {

    /* renamed from: a */
    private String f681a;

    /* renamed from: b */
    private AbstractC5162y f682b;

    C5088a() {
    }

    @Override // com.google.android.play.core.integrity.AbstractC5104ap
    /* renamed from: a */
    final AbstractC5104ap mo854a(AbstractC5162y abstractC5162y) {
        this.f682b = abstractC5162y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5104ap
    /* renamed from: b */
    final AbstractC5104ap mo855b(String str) {
        this.f681a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5104ap
    /* renamed from: c */
    final C5105aq mo856c() {
        AbstractC5162y abstractC5162y;
        String str = this.f681a;
        if (str != null && (abstractC5162y = this.f682b) != null) {
            return new C5105aq(str, abstractC5162y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f681a == null) {
            sb.append(" token");
        }
        if (this.f682b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

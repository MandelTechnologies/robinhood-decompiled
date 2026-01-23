package com.google.android.play.core.integrity;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.core.integrity.b */
/* loaded from: classes27.dex */
final class C5115b extends AbstractC5132bq {

    /* renamed from: a */
    private String f734a;

    /* renamed from: b */
    private AbstractC5162y f735b;

    C5115b() {
    }

    @Override // com.google.android.play.core.integrity.AbstractC5132bq
    /* renamed from: a */
    final AbstractC5132bq mo879a(AbstractC5162y abstractC5162y) {
        this.f735b = abstractC5162y;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5132bq
    /* renamed from: b */
    final AbstractC5132bq mo880b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f734a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.AbstractC5132bq
    /* renamed from: c */
    final C5133br mo881c() {
        AbstractC5162y abstractC5162y;
        String str = this.f734a;
        if (str != null && (abstractC5162y = this.f735b) != null) {
            return new C5133br(str, abstractC5162y);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f734a == null) {
            sb.append(" token");
        }
        if (this.f735b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

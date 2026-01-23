package com.google.android.play.integrity.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.Objects;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.at */
/* loaded from: classes27.dex */
final class C5186at extends AbstractC5184ar {

    /* renamed from: a */
    static final AbstractC5184ar f843a = new C5186at(new Object[0], 0);

    /* renamed from: b */
    final transient Object[] f844b;

    C5186at(Object[] objArr, int i) {
        this.f844b = objArr;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5184ar, com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: a */
    final int mo952a(Object[] objArr, int i) {
        System.arraycopy(this.f844b, 0, objArr, 0, 0);
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: b */
    final int mo953b() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: c */
    final int mo954c() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: e */
    final Object[] mo955e() {
        return this.f844b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C5178al.m946a(i, 0, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        Object obj = this.f844b[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}

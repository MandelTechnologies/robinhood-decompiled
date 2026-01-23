package com.google.android.play.integrity.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.aq */
/* loaded from: classes27.dex */
final class C5183aq extends AbstractC5184ar {

    /* renamed from: a */
    final transient int f838a;

    /* renamed from: b */
    final transient int f839b;

    /* renamed from: c */
    final /* synthetic */ AbstractC5184ar f840c;

    C5183aq(AbstractC5184ar abstractC5184ar, int i, int i2) {
        this.f840c = abstractC5184ar;
        this.f838a = i;
        this.f839b = i2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: b */
    final int mo953b() {
        return this.f840c.mo954c() + this.f838a + this.f839b;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: c */
    final int mo954c() {
        return this.f840c.mo954c() + this.f838a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: e */
    final Object[] mo955e() {
        return this.f840c.mo955e();
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5184ar
    /* renamed from: f */
    public final AbstractC5184ar subList(int i, int i2) {
        C5178al.m948c(i, i2, this.f839b);
        int i3 = this.f838a;
        return this.f840c.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        C5178al.m946a(i, this.f839b, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        return this.f840c.get(i + this.f838a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f839b;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5184ar, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}

package com.google.android.play.integrity.internal;

import java.util.Iterator;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.au */
/* loaded from: classes27.dex */
final class C5187au extends AbstractC5185as {

    /* renamed from: a */
    static final C5187au f845a;

    /* renamed from: d */
    private static final Object[] f846d;

    /* renamed from: b */
    final transient Object[] f847b;

    /* renamed from: c */
    final transient Object[] f848c;

    static {
        Object[] objArr = new Object[0];
        f846d = objArr;
        f845a = new C5187au(objArr, 0, objArr, 0, 0);
    }

    C5187au(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f847b = objArr;
        this.f848c = objArr2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: a */
    final int mo952a(Object[] objArr, int i) {
        System.arraycopy(this.f847b, 0, objArr, 0, 0);
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f848c.length;
        return false;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5185as
    /* renamed from: d */
    public final AbstractC5188av iterator() {
        return m960f().listIterator(0);
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5181ao
    /* renamed from: e */
    final Object[] mo955e() {
        return this.f847b;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5185as
    /* renamed from: g */
    final AbstractC5184ar mo961g() {
        int i = AbstractC5184ar.$r8$clinit;
        return C5186at.f843a;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5185as, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5185as
    /* renamed from: i */
    final boolean mo962i() {
        return true;
    }

    @Override // com.google.android.play.integrity.internal.AbstractC5185as, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m960f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}

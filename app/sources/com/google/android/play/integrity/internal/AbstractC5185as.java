package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.Set;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.as */
/* loaded from: classes27.dex */
public abstract class AbstractC5185as extends AbstractC5181ao implements Set {

    /* renamed from: a */
    private transient AbstractC5184ar f842a;

    AbstractC5185as() {
    }

    /* renamed from: h */
    public static AbstractC5185as m958h() {
        return C5187au.f845a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5188av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5185as) {
            ((AbstractC5185as) obj).mo962i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC5184ar m960f() {
        AbstractC5184ar abstractC5184ar = this.f842a;
        if (abstractC5184ar != null) {
            return abstractC5184ar;
        }
        AbstractC5184ar abstractC5184arMo961g = mo961g();
        this.f842a = abstractC5184arMo961g;
        return abstractC5184arMo961g;
    }

    /* renamed from: g */
    AbstractC5184ar mo961g() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    /* renamed from: i */
    boolean mo962i() {
        throw null;
    }
}

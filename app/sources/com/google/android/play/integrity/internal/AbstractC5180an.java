package com.google.android.play.integrity.internal;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* renamed from: com.google.android.play.integrity.internal.an */
/* loaded from: classes27.dex */
abstract class AbstractC5180an extends AbstractC5189aw {

    /* renamed from: a */
    private final int f834a;

    /* renamed from: b */
    private int f835b;

    protected AbstractC5180an(int i, int i2) {
        C5178al.m947b(i2, i, ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX);
        this.f834a = i;
        this.f835b = i2;
    }

    /* renamed from: a */
    protected abstract Object mo951a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f835b < this.f834a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f835b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f835b;
        this.f835b = i + 1;
        return mo951a(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f835b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f835b - 1;
        this.f835b = i;
        return mo951a(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f835b - 1;
    }
}

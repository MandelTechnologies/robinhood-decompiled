package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Objects;

/* loaded from: classes.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);

    /* renamed from: array, reason: collision with root package name */
    final transient Object[] f9820array;
    private final transient int size;

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    RegularImmutableList(Object[] array2, int size) {
        this.f9820array = array2;
        this.size = size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] internalArray() {
        return this.f9820array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int copyIntoArray(Object[] dst, int dstOff) {
        System.arraycopy(this.f9820array, 0, dst, dstOff, this.size);
        return dstOff + this.size;
    }

    @Override // java.util.List
    public E get(int i) {
        Preconditions.checkElementIndex(i, this.size);
        E e = (E) this.f9820array[i];
        Objects.requireNonNull(e);
        return e;
    }
}

package com.robinhood.utils.collections;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: ArrayRing.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001f*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001fB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0016\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0016H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006 "}, m3636d2 = {"Lcom/robinhood/utils/collections/ArrayRing;", "E", "Lcom/robinhood/utils/collections/Ring;", "Lkotlin/collections/AbstractList;", "maxCapacity", "", "initialCapacity", "<init>", "(II)V", "getMaxCapacity", "()I", "elements", "", "", "[Ljava/lang/Object;", "startIndex", "value", "size", "getSize", "transformIndex", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "ensureCapacityForInsertion", "", "get", "(I)Ljava/lang/Object;", "pushLast", "", "element", "(Ljava/lang/Object;)Z", "pushFirst", "clear", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class ArrayRing<E> extends AbstractList<E> implements Ring<E> {
    public static final int CAPACITY_INITIAL_DEFAULT = 10;
    private Object[] elements;
    private final int maxCapacity;
    private int size;
    private int startIndex;

    public /* synthetic */ ArrayRing(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 10 : i2);
    }

    @Override // com.robinhood.utils.collections.Ring
    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public ArrayRing(int i, int i2) {
        this.maxCapacity = i;
        if (getMaxCapacity() <= 0) {
            throw new IllegalArgumentException(("Max capacity must be greater than 0: " + getMaxCapacity()).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("Initial capacity must not be negative: " + i2).toString());
        }
        this.elements = new Object[i2];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    private final int transformIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index not in range: " + index);
        }
        return (index + this.startIndex) % this.elements.length;
    }

    private final void ensureCapacityForInsertion() {
        if (size() < this.elements.length || size() == getMaxCapacity()) {
            return;
        }
        int i = this.startIndex;
        Object[] objArr = this.elements;
        int length = objArr.length;
        Object[] objArr2 = new Object[RangesKt.coerceIn((length >> 1) + length, 2, getMaxCapacity())];
        int i2 = length - i;
        System.arraycopy(objArr, i, objArr2, 0, i2);
        System.arraycopy(objArr, 0, objArr2, i2, i);
        this.elements = objArr2;
        this.startIndex = 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        return (E) this.elements[transformIndex(index)];
    }

    @Override // com.robinhood.utils.collections.Ring
    public boolean pushLast(E element) {
        ensureCapacityForInsertion();
        Object[] objArr = this.elements;
        if (size() == getMaxCapacity()) {
            int i = this.startIndex;
            objArr[i] = element;
            this.startIndex = (i + 1) % objArr.length;
            return true;
        }
        objArr[(this.startIndex + size()) % objArr.length] = element;
        this.size = size() + 1;
        return false;
    }

    @Override // com.robinhood.utils.collections.Ring
    public boolean pushFirst(E element) {
        ensureCapacityForInsertion();
        Object[] objArr = this.elements;
        int length = this.startIndex;
        if (length == 0) {
            length = objArr.length;
        }
        int i = length - 1;
        this.startIndex = i;
        objArr[i] = element;
        if (size() == getMaxCapacity()) {
            return true;
        }
        this.size = size() + 1;
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List, com.robinhood.utils.collections.Ring
    public void clear() {
        this.startIndex = 0;
        this.size = 0;
        ArraysKt.fill$default(this.elements, (Object) null, 0, 0, 6, (Object) null);
    }
}

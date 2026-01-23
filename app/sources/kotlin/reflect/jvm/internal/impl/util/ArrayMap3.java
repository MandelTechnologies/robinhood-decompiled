package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap, reason: use source file name */
/* loaded from: classes23.dex */
public final class ArrayMap3 extends ArrayMap {
    public static final ArrayMap3 INSTANCE = new ArrayMap3();

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public Void get(int i) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 0;
    }

    private ArrayMap3() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.EmptyArrayMap$iterator$1 */
    public static final class C460151 implements Iterator, KMarkers {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C460151() {
        }

        @Override // java.util.Iterator
        public Void next() {
            throw new NoSuchElementException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator iterator() {
        return new C460151();
    }
}

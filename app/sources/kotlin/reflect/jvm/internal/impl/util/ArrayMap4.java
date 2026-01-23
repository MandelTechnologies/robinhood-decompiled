package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap, reason: use source file name */
/* loaded from: classes14.dex */
public final class ArrayMap4<T> extends ArrayMap<T> {
    private final int index;
    private final T value;

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArrayMap4(T value, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    public final T getValue() {
        return this.value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i, T value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public T get(int i) {
        if (i == this.index) {
            return this.value;
        }
        return null;
    }

    /* compiled from: ArrayMap.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.OneElementArrayMap$iterator$1 */
    public static final class C460161 implements Iterator<T>, KMarkers {
        private boolean notVisited = true;
        final /* synthetic */ ArrayMap4<T> this$0;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        C460161(ArrayMap4<T> arrayMap4) {
            this.this$0 = arrayMap4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.notVisited;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.notVisited) {
                this.notVisited = false;
                return this.this$0.getValue();
            }
            throw new NoSuchElementException();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    public Iterator<T> iterator() {
        return new C460161(this);
    }
}

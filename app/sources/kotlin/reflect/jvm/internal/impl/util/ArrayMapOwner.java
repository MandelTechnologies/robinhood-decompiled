package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMarkers;
import kotlin.reflect.KClass;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner, reason: use source file name */
/* loaded from: classes23.dex */
public abstract class ArrayMapOwner<K, V> implements Iterable<V>, KMarkers {
    protected abstract ArrayMap<V> getArrayMap();

    protected abstract ArrayMapOwner3<K, V> getTypeRegistry();

    protected abstract void registerComponent(String str, V v);

    /* compiled from: ArrayMapOwner.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner$AbstractArrayMapAccessor */
    /* loaded from: classes14.dex */
    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* renamed from: id */
        private final int f7037id;

        public AbstractArrayMapAccessor(int i) {
            this.f7037id = i;
        }

        protected final T extractValue(ArrayMapOwner<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.getArrayMap().get(this.f7037id);
        }
    }

    protected final void registerComponent(KClass<? extends K> tClass, V value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String qualifiedName = tClass.getQualifiedName();
        Intrinsics.checkNotNull(qualifiedName);
        registerComponent(qualifiedName, (String) value);
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return getArrayMap().iterator();
    }

    public final boolean isEmpty() {
        return getArrayMap().getSize() == 0;
    }
}

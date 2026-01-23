package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.util.ArrayMapOwner;

/* compiled from: ArrayMapOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor, reason: use source file name */
/* loaded from: classes14.dex */
public final class ArrayMapOwner2<K, V, T extends V> extends ArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements Interfaces2<ArrayMapOwner<K, V>, V> {
    @Override // kotlin.properties.Interfaces2
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((ArrayMapOwner) obj, (KProperty<?>) kProperty);
    }

    public ArrayMapOwner2(int i) {
        super(i);
    }

    public T getValue(ArrayMapOwner<K, V> thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return extractValue(thisRef);
    }
}

package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes2;

/* compiled from: TypeAttributes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeAttribute, reason: use source file name */
/* loaded from: classes14.dex */
public abstract class TypeAttributes2<T extends TypeAttributes2<? extends T>> {
    public abstract T add(T t);

    public abstract KClass<? extends T> getKey();

    public abstract T intersect(T t);
}

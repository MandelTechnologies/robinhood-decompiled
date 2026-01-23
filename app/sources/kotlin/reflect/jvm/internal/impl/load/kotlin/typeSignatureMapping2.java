package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* compiled from: typeSignatureMapping.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory, reason: use source file name */
/* loaded from: classes14.dex */
public interface typeSignatureMapping2<T> {
    T boxType(T t);

    T createFromString(String str);

    T createObjectType(String str);

    T createPrimitiveType(PrimitiveType primitiveType);

    T getJavaLangClassType();

    String toString(T t);
}

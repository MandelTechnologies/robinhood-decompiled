package io.ktor.util.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVM5;

/* compiled from: TypeInfoJvm.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a/\u0010\b\u001a\u00020\u00072\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\r\u001a\u00020\f*\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u001f\u0010\u0013\u001a\u00060\u0000j\u0002`\u0001*\u00020\u00058F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010*\n\u0010\u0014\"\u00020\u00002\u00020\u0000¨\u0006\u0015"}, m3636d2 = {"Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/reflect/KType;", "kType", "Lio/ktor/util/reflect/TypeInfo;", "typeInfoImpl", "(Ljava/lang/reflect/Type;Lkotlin/reflect/KClass;Lkotlin/reflect/KType;)Lio/ktor/util/reflect/TypeInfo;", "", "type", "", "instanceOf", "(Ljava/lang/Object;Lkotlin/reflect/KClass;)Z", "getPlatformType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getPlatformType$annotations", "(Lkotlin/reflect/KType;)V", "platformType", "Type", "ktor-utils"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.util.reflect.TypeInfoJvmKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class TypeInfoJvm {
    public static final TypeInfo typeInfoImpl(Type reifiedType, KClass<?> kClass, KType kType) {
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new TypeInfo(kClass, reifiedType, kType);
    }

    public static final boolean instanceOf(Object obj, KClass<?> type2) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type2, "type");
        return JvmClassMapping.getJavaClass(type2).isInstance(obj);
    }

    public static final Type getPlatformType(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return TypesJVM5.getJavaType(kType);
    }
}

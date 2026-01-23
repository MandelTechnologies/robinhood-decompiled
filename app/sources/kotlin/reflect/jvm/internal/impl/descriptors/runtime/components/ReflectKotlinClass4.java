package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIterator2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.reflectClassUtil;

/* compiled from: ReflectKotlinClass.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer, reason: use source file name */
/* loaded from: classes14.dex */
final class ReflectKotlinClass4 {
    public static final ReflectKotlinClass4 INSTANCE = new ReflectKotlinClass4();

    private ReflectKotlinClass4() {
    }

    public final String methodDesc(Method method) {
        Intrinsics.checkNotNullParameter(method, "method");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator it = ArrayIterator2.iterator(method.getParameterTypes());
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Intrinsics.checkNotNull(cls);
            sb.append(reflectClassUtil.getDesc(cls));
        }
        sb.append(")");
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb.append(reflectClassUtil.getDesc(returnType));
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final String constructorDesc(Constructor<?> constructor) {
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        Iterator it = ArrayIterator2.iterator(constructor.getParameterTypes());
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Intrinsics.checkNotNull(cls);
            sb.append(reflectClassUtil.getDesc(cls));
        }
        sb.append(")V");
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final String fieldDesc(Field field) {
        Intrinsics.checkNotNullParameter(field, "field");
        Class<?> type2 = field.getType();
        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
        return reflectClassUtil.getDesc(type2);
    }
}

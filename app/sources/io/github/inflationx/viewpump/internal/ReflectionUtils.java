package io.github.inflationx.viewpump.internal;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: -ReflectionUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\n*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\u00020\u0004*\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u00012\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\"\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Ljava/lang/reflect/Field;", "", "obj", "value", "", "setValueQuietly", "(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)V", "Ljava/lang/Class;", "", "methodName", "Ljava/lang/reflect/Method;", "getAccessibleMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", "target", "", "args", "invokeMethod", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)V", "viewpump_release"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
@JvmName
/* renamed from: io.github.inflationx.viewpump.internal.-ReflectionUtils, reason: invalid class name */
/* loaded from: classes21.dex */
public final class ReflectionUtils {
    public static final void setValueQuietly(Field field, Object obj, Object value) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(field, "<this>");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            field.set(obj, value);
        } catch (IllegalAccessException unused) {
        }
    }

    public static final Method getAccessibleMethod(Class<?> cls, String methodName) throws SecurityException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Method[] methods = cls.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        for (Method method : methods) {
            if (Intrinsics.areEqual(method.getName(), methodName)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static final void invokeMethod(Method method, Object target, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(args, "args");
        if (method == null) {
            return;
        }
        try {
            method.invoke(target, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException e) {
            Log.d("ReflectionUtils", "Can't access method using reflection", e);
        } catch (InvocationTargetException e2) {
            Log.d("ReflectionUtils", "Can't invoke method using reflection", e2);
        }
    }
}

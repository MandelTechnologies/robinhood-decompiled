package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReflectJavaRecordComponent.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader, reason: use source file name */
/* loaded from: classes14.dex */
final class ReflectJavaRecordComponent2 {
    public static final ReflectJavaRecordComponent2 INSTANCE = new ReflectJavaRecordComponent2();
    private static Cache _cache;

    /* compiled from: ReflectJavaRecordComponent.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader$Cache */
    public static final class Cache {
        private final Method getAccessor;
        private final Method getType;

        public Cache(Method method, Method method2) {
            this.getType = method;
            this.getAccessor = method2;
        }

        public final Method getGetType() {
            return this.getType;
        }

        public final Method getGetAccessor() {
            return this.getAccessor;
        }
    }

    private ReflectJavaRecordComponent2() {
    }

    private final Cache buildCache(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    private final Cache initCache(Object obj) {
        Cache cache2 = _cache;
        if (cache2 != null) {
            return cache2;
        }
        Cache cacheBuildCache = buildCache(obj);
        _cache = cacheBuildCache;
        return cacheBuildCache;
    }

    public final Class<?> loadGetType(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getType = initCache(recordComponent).getGetType();
        if (getType == null) {
            return null;
        }
        Object objInvoke = getType.invoke(recordComponent, null);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }

    public final Method loadGetAccessor(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Method getAccessor = initCache(recordComponent).getGetAccessor();
        if (getAccessor == null) {
            return null;
        }
        Object objInvoke = getAccessor.invoke(recordComponent, null);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }
}

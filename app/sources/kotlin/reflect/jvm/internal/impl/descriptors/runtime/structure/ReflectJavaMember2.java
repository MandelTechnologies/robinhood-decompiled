package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReflectJavaMember.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader, reason: use source file name */
/* loaded from: classes14.dex */
final class ReflectJavaMember2 {
    public static final ReflectJavaMember2 INSTANCE = new ReflectJavaMember2();

    /* renamed from: cache, reason: collision with root package name */
    private static Cache f10746cache;

    /* compiled from: ReflectJavaMember.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader$Cache */
    public static final class Cache {
        private final Method getName;
        private final Method getParameters;

        public Cache(Method method, Method method2) {
            this.getParameters = method;
            this.getName = method2;
        }

        public final Method getGetName() {
            return this.getName;
        }

        public final Method getGetParameters() {
            return this.getParameters;
        }
    }

    private ReflectJavaMember2() {
    }

    public final Cache buildCache(Member member) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), reflectClassUtil.getSafeClassLoader(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    public final List<String> loadParameterNames(Member member) {
        Method getName;
        Intrinsics.checkNotNullParameter(member, "member");
        Cache cacheBuildCache = f10746cache;
        if (cacheBuildCache == null) {
            synchronized (this) {
                cacheBuildCache = f10746cache;
                if (cacheBuildCache == null) {
                    cacheBuildCache = INSTANCE.buildCache(member);
                    f10746cache = cacheBuildCache;
                }
            }
        }
        Method getParameters = cacheBuildCache.getGetParameters();
        if (getParameters == null || (getName = cacheBuildCache.getGetName()) == null) {
            return null;
        }
        Object objInvoke = getParameters.invoke(member, null);
        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = getName.invoke(obj, null);
            Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}

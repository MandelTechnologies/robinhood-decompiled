package com.twilio.conversations.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes12.dex */
public class RethrowingForwarder {
    public static <T> T create(T t, Class<? extends RuntimeException> cls) {
        if (t == null) {
            return null;
        }
        Class<?>[] implementedInterfaces = getImplementedInterfaces(t);
        if (implementedInterfaces.length == 0) {
            throw new IllegalArgumentException("The target object must implement at least one interface");
        }
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), implementedInterfaces, new RethrowingProxy(t, cls));
    }

    private static Class<?>[] getImplementedInterfaces(Object obj) {
        HashSet hashSet = new HashSet();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            hashSet.addAll(Arrays.asList(superclass.getInterfaces()));
        }
        return (Class[]) hashSet.toArray(new Class[0]);
    }

    private RethrowingForwarder() {
    }

    private static class RethrowingProxy implements InvocationHandler {
        private static final Method OBJECT_EQUALS;
        private static final Method OBJECT_HASHCODE;
        private final Constructor<? extends RuntimeException> mExceptionConstructor;
        private final Object mTarget;

        static {
            try {
                OBJECT_EQUALS = Object.class.getMethod("equals", Object.class);
                OBJECT_HASHCODE = Object.class.getMethod("hashCode", null);
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("never happens", e);
            }
        }

        RethrowingProxy(Object obj, Class<? extends RuntimeException> cls) {
            this.mTarget = obj;
            try {
                this.mExceptionConstructor = cls.getConstructor(Throwable.class);
            } catch (NoSuchMethodException unused) {
                throw new IllegalArgumentException("Constructor " + cls.getName() + "(Throwable) not found");
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (OBJECT_HASHCODE.equals(method)) {
                return Integer.valueOf(this.mTarget.hashCode());
            }
            if (OBJECT_EQUALS.equals(method)) {
                return Boolean.valueOf(equalsInternal(obj, objArr[0]));
            }
            try {
                return method.invoke(this.mTarget, objArr);
            } catch (InvocationTargetException e) {
                throw this.mExceptionConstructor.newInstance(e.getCause());
            }
        }

        private boolean equalsInternal(Object obj, Object obj2) {
            if (obj2 != null && obj2.getClass() == obj.getClass()) {
                RethrowingProxy rethrowingProxy = (RethrowingProxy) Proxy.getInvocationHandler(obj2);
                if (rethrowingProxy.mExceptionConstructor.equals(this.mExceptionConstructor) && rethrowingProxy.mTarget.equals(this.mTarget)) {
                    return true;
                }
            }
            return false;
        }
    }
}

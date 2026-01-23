package com.robinhood.api.retrofit;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ApiStubs.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/api/retrofit/ApiStubs;", "", "<init>", "()V", "empty", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "()Ljava/lang/Object;", "RxInvocationHandler", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ApiStubs {
    public static final ApiStubs INSTANCE = new ApiStubs();

    private ApiStubs() {
    }

    /* compiled from: ApiStubs.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\rH\u0096\u0002¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0006R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/api/retrofit/ApiStubs$RxInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "<init>", "()V", "returnValues", "", "Ljava/lang/Class;", "", "invoke", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "validate", "", "clazz", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class RxInvocationHandler implements InvocationHandler {
        public static final RxInvocationHandler INSTANCE = new RxInvocationHandler();
        private static final Map<Class<?>, Object> returnValues = MapsKt.mapOf(Tuples4.m3642to(Completable.class, Completable.complete()), Tuples4.m3642to(Single.class, Single.never()), Tuples4.m3642to(Maybe.class, Maybe.empty()), Tuples4.m3642to(Observable.class, Observable.empty()));

        private RxInvocationHandler() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] args) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            Class<?> returnType = method.getReturnType();
            Object obj = returnValues.get(returnType);
            if (obj != null) {
                return obj;
            }
            throw new UnsupportedOperationException("Unknown return type: " + returnType);
        }

        public final void validate(Class<?> clazz) throws SecurityException {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (!clazz.isInterface()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            Method[] methods = clazz.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            ArrayList arrayList = new ArrayList();
            for (Method method : methods) {
                if (!returnValues.keySet().contains(method.getReturnType())) {
                    arrayList.add(method);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            throw new IllegalArgumentException(("One or more method has an unsupported return type: " + arrayList).toString());
        }
    }

    @JvmStatic
    public static final <T> T empty(Class<T> clazz) throws SecurityException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        RxInvocationHandler rxInvocationHandler = RxInvocationHandler.INSTANCE;
        rxInvocationHandler.validate(clazz);
        return (T) Proxy.getProxyClass(clazz.getClassLoader(), clazz).getConstructor(InvocationHandler.class).newInstance(rxInvocationHandler);
    }

    public final /* synthetic */ <T> T empty() {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) empty(Object.class);
    }
}

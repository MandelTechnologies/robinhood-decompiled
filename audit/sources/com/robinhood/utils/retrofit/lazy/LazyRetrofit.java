package com.robinhood.utils.retrofit.lazy;

import com.squareup.moshi.Types;
import dagger.Lazy;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: LazyRetrofit.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0002\u0010\rJ3\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0014R\u0016\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\u000e\u001a0\b\u0001\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/retrofit/lazy/DeferredInvocationHandler;", "Ljava/lang/reflect/InvocationHandler;", "lazy", "Ldagger/Lazy;", "", "<init>", "(Ldagger/Lazy;)V", "invoke", "proxy", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "proceedSuspend", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "Lkotlin/jvm/functions/Function3;", "proceed", "R", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler, reason: use source file name */
/* loaded from: classes21.dex */
public final class LazyRetrofit implements InvocationHandler {
    private final Lazy<? extends Object> lazy;
    private final Function3<Method, Object[], Continuation<Object>, Object> proceedSuspend;

    public LazyRetrofit(Lazy<? extends Object> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "lazy");
        this.lazy = lazy;
        this.proceedSuspend = new LazyRetrofit2(this, null);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object proxy, final Method method, final Object[] args) {
        Class<?> rawType;
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.areEqual(returnType, Object.class)) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
            Type type2 = (Type) ArraysKt.lastOrNull(genericParameterTypes);
            if (type2 != null) {
                rawType = Types.getRawType(type2);
                Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            } else {
                rawType = null;
            }
            if (Intrinsics.areEqual(rawType, Continuation.class)) {
                Intrinsics.checkNotNull(args);
                Object objLast = ArraysKt.last(args);
                Intrinsics.checkNotNull(objLast, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
                Object[] objArrCopyOfRange = ArraysKt.copyOfRange(args, 0, ArraysKt.getLastIndex(args));
                Function3<Method, Object[], Continuation<Object>, Object> function3 = this.proceedSuspend;
                Intrinsics.checkNotNull(function3, "null cannot be cast to non-null type kotlin.Function3<java.lang.reflect.Method, kotlin.Array<out kotlin.Any?>, kotlin.coroutines.Continuation<kotlin.Any?>, kotlin.Any?>");
                return ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(method, objArrCopyOfRange, (Continuation) objLast);
            }
            return proceed(method, args);
        }
        if (Intrinsics.areEqual(returnType, Single.class)) {
            return Single.defer(new Callable() { // from class: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler.invoke.1
                @Override // java.util.concurrent.Callable
                public final SingleSource<? extends Object> call() {
                    return (SingleSource) LazyRetrofit.this.proceed(method, args);
                }
            }).subscribeOn(Schedulers.computation());
        }
        if (Intrinsics.areEqual(returnType, Maybe.class)) {
            return Maybe.defer(new Callable() { // from class: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler.invoke.2
                @Override // java.util.concurrent.Callable
                public final MaybeSource<? extends Object> call() {
                    return (MaybeSource) LazyRetrofit.this.proceed(method, args);
                }
            }).subscribeOn(Schedulers.computation());
        }
        if (Intrinsics.areEqual(returnType, Observable.class)) {
            return Observable.defer(new Callable() { // from class: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler.invoke.3
                @Override // java.util.concurrent.Callable
                public final ObservableSource<? extends Object> call() {
                    return (ObservableSource) LazyRetrofit.this.proceed(method, args);
                }
            }).subscribeOn(Schedulers.computation());
        }
        return proceed(method, args);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> R proceed(Method method, Object[] args) {
        R r;
        if (args == null) {
            r = (R) method.invoke(this.lazy.get(), null);
        } else {
            r = (R) method.invoke(this.lazy.get(), Arrays.copyOf(args, args.length));
        }
        Intrinsics.checkNotNull(r, "null cannot be cast to non-null type R of com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler.proceed");
        return r;
    }
}

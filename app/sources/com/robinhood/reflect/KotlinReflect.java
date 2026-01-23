package com.robinhood.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.Dispatchers;

/* compiled from: KotlinReflect.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\tH\u0086@¢\u0006\u0002\u0010\n\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\fH\u0002\"\u0015\u0010\u000b\u001a\u00020\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"callSuspend", "", "Ljava/lang/reflect/Method;", "instance", "args", "", "(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendAndThrow", "", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinReturnType", "Ljava/lang/reflect/Type;", "getKotlinReturnType", "(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Type;", "unwrapLowerBound", "lib-reflect"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.reflect.KotlinReflectKt, reason: use source file name */
/* loaded from: classes19.dex */
public final class KotlinReflect {

    /* compiled from: KotlinReflect.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.reflect.KotlinReflectKt", m3645f = "KotlinReflect.kt", m3646l = {26}, m3647m = "callSuspend")
    /* renamed from: com.robinhood.reflect.KotlinReflectKt$callSuspend$1 */
    static final class C361581 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C361581(Continuation<? super C361581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinReflect.callSuspend(null, null, null, this);
        }
    }

    /* compiled from: KotlinReflect.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.reflect.KotlinReflectKt", m3645f = "KotlinReflect.kt", m3646l = {42}, m3647m = "suspendAndThrow")
    /* renamed from: com.robinhood.reflect.KotlinReflectKt$suspendAndThrow$1 */
    /* loaded from: classes26.dex */
    static final class C361591 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C361591(Continuation<? super C361591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinReflect.suspendAndThrow(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object callSuspend(Method method, Object obj, Object[] objArr, Continuation<Object> continuation) throws Throwable {
        C361581 c361581;
        if (continuation instanceof C361581) {
            c361581 = (C361581) continuation;
            int i = c361581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361581.label = i - Integer.MIN_VALUE;
            } else {
                c361581 = new C361581(continuation);
            }
        }
        Object obj2 = c361581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361581.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
                return obj2;
            }
            ResultKt.throwOnFailure(obj2);
            c361581.L$0 = method;
            c361581.L$1 = obj;
            c361581.L$2 = objArr;
            c361581.label = 1;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(objArr);
            spreadBuilder.add(c361581);
            Object objInvoke = method.invoke(obj, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(c361581);
            }
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw new IllegalStateException("Required value was null.");
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object suspendAndThrow(final Throwable th, Continuation<?> continuation) {
        final C361591 c361591;
        if (continuation instanceof C361591) {
            c361591 = (C361591) continuation;
            int i = c361591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c361591.label = i - Integer.MIN_VALUE;
            } else {
                c361591 = new C361591(continuation);
            }
        }
        Object obj = c361591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c361591.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c361591.L$0 = th;
            c361591.label = 1;
            Dispatchers.getDefault().dispatch(c361591.getContext(), new Runnable() { // from class: com.robinhood.reflect.KotlinReflectKt$suspendAndThrow$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    Continuation continuationIntercepted = IntrinsicsKt.intercepted(c361591);
                    Result.Companion companion = Result.INSTANCE;
                    continuationIntercepted.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(th)));
                }
            });
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(c361591);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new ExceptionsH();
    }

    public static final Type getKotlinReturnType(Method method) {
        Type[] actualTypeArguments;
        Type type2;
        Type typeUnwrapLowerBound;
        Intrinsics.checkNotNullParameter(method, "<this>");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "getGenericParameterTypes(...)");
        Object objLastOrNull = ArraysKt.lastOrNull(genericParameterTypes);
        ParameterizedType parameterizedType = objLastOrNull instanceof ParameterizedType ? (ParameterizedType) objLastOrNull : null;
        if (parameterizedType != null) {
            ParameterizedType parameterizedType2 = Intrinsics.areEqual(parameterizedType.getRawType(), Continuation.class) ? parameterizedType : null;
            if (parameterizedType2 != null && (actualTypeArguments = parameterizedType2.getActualTypeArguments()) != null && (type2 = (Type) ArraysKt.singleOrNull(actualTypeArguments)) != null && (typeUnwrapLowerBound = unwrapLowerBound(type2)) != null) {
                return typeUnwrapLowerBound;
            }
        }
        Type genericReturnType = method.getGenericReturnType();
        Intrinsics.checkNotNullExpressionValue(genericReturnType, "getGenericReturnType(...)");
        return genericReturnType;
    }

    private static final Type unwrapLowerBound(Type type2) {
        if (type2 instanceof WildcardType) {
            Type[] lowerBounds = ((WildcardType) type2).getLowerBounds();
            Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
            Type type3 = (Type) ArraysKt.singleOrNull(lowerBounds);
            if (type3 != null) {
                return type3;
            }
        }
        return type2;
    }
}

package com.robinhood.utils.retrofit.lazy;

import com.robinhood.reflect.KotlinReflect;
import dispatch.core.Suspend;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyRetrofit.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005H\n"}, m3636d2 = {"<anonymous>", "", "method", "Ljava/lang/reflect/Method;", "args", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler$proceedSuspend$1", m3645f = "LazyRetrofit.kt", m3646l = {97, 101}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler$proceedSuspend$1, reason: use source file name */
/* loaded from: classes21.dex */
final class LazyRetrofit2 extends ContinuationImpl7 implements Function3<Method, Object[], Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ LazyRetrofit this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyRetrofit2(LazyRetrofit lazyRetrofit, Continuation<? super LazyRetrofit2> continuation) {
        super(3, continuation);
        this.this$0 = lazyRetrofit;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Method method, Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(method, objArr, (Continuation<Object>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Method method, Object[] objArr, Continuation<Object> continuation) {
        LazyRetrofit2 lazyRetrofit2 = new LazyRetrofit2(this.this$0, continuation);
        lazyRetrofit2.L$0 = method;
        lazyRetrofit2.L$1 = objArr;
        return lazyRetrofit2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (com.robinhood.reflect.KotlinReflect.suspendAndThrow(r8, r7) != r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Throwable th) {
            this.label = 2;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C419721 c419721 = new C419721((Method) this.L$0, this.this$0, (Object[]) this.L$1, null);
            this.L$0 = null;
            this.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c419721, this, 1, null);
            return objWithDefault$default == coroutine_suspended ? coroutine_suspended : objWithDefault$default;
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        throw new ExceptionsH();
    }

    /* compiled from: LazyRetrofit.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler$proceedSuspend$1$1", m3645f = "LazyRetrofit.kt", m3646l = {98}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.utils.retrofit.lazy.DeferredInvocationHandler$proceedSuspend$1$1 */
    static final class C419721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ Object[] $args;
        final /* synthetic */ Method $method;
        int label;
        final /* synthetic */ LazyRetrofit this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C419721(Method method, LazyRetrofit lazyRetrofit, Object[] objArr, Continuation<? super C419721> continuation) {
            super(2, continuation);
            this.$method = method;
            this.this$0 = lazyRetrofit;
            this.$args = objArr;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C419721(this.$method, this.this$0, this.$args, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C419721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Method method = this.$method;
            Object obj2 = this.this$0.lazy.get();
            Object[] objArr = this.$args;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.label = 1;
            Object objCallSuspend = KotlinReflect.callSuspend(method, obj2, objArrCopyOf, this);
            return objCallSuspend == coroutine_suspended ? coroutine_suspended : objCallSuspend;
        }
    }
}

package com.robinhood.coroutines;

import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetryOnError.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aP\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005H\u0086@¢\u0006\u0002\u0010\u000b\u001a<\u0010\f\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0005H\u0086@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"retryExponential", "T", "maxRetries", "", "predicate", "Lkotlin/Function1;", "", "", "block", "Lkotlin/coroutines/Continuation;", "", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runCatchingNetworkExceptionsWithRetryExponential", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.coroutines.RetryOnErrorKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class RetryOnError {

    /* compiled from: RetryOnError.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.RetryOnErrorKt", m3645f = "RetryOnError.kt", m3646l = {23, 28}, m3647m = "retryExponential")
    /* renamed from: com.robinhood.coroutines.RetryOnErrorKt$retryExponential$1 */
    static final class C329581<T> extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C329581(Continuation<? super C329581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RetryOnError.retryExponential(0, null, null, this);
        }
    }

    /* compiled from: RetryOnError.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.RetryOnErrorKt", m3645f = "RetryOnError.kt", m3646l = {46}, m3647m = "runCatchingNetworkExceptionsWithRetryExponential")
    /* renamed from: com.robinhood.coroutines.RetryOnErrorKt$runCatchingNetworkExceptionsWithRetryExponential$1 */
    /* loaded from: classes15.dex */
    static final class C329591<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329591(Continuation<? super C329591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RetryOnError.runCatchingNetworkExceptionsWithRetryExponential(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryExponential$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009d -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object retryExponential(int i, Function1<? super Throwable, Boolean> function1, Function1<? super Continuation<? super T>, ? extends Object> function12, Continuation<? super T> continuation) {
        C329581 c329581;
        Function1<? super Continuation<? super T>, ? extends Object> function13;
        Function1<? super Throwable, Boolean> function14;
        int i2;
        Throwable th;
        Function1<? super Continuation<? super T>, ? extends Object> function15;
        int i3;
        int i4;
        Function1<? super Throwable, Boolean> function16;
        int i5;
        if (continuation instanceof C329581) {
            c329581 = (C329581) continuation;
            int i6 = c329581.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c329581.label = i6 - Integer.MIN_VALUE;
            } else {
                c329581 = new C329581(continuation);
            }
        }
        Object obj = c329581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = c329581.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            function13 = function12;
            function14 = function1;
            i2 = 1;
            c329581.L$0 = function14;
            c329581.L$1 = function13;
            c329581.I$0 = i;
            c329581.I$1 = i2;
            c329581.label = 1;
            Object objInvoke = function13.invoke(c329581);
            if (objInvoke != coroutine_suspended) {
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c329581.I$1;
                i3 = c329581.I$0;
                function15 = (Function1) c329581.L$1;
                function16 = (Function1) c329581.L$0;
                ResultKt.throwOnFailure(obj);
                int i8 = i3;
                i2 = i5;
                i = i8;
                function13 = function15;
                function14 = function16;
                try {
                } catch (Throwable th2) {
                    int i9 = i2;
                    i3 = i;
                    i4 = i9;
                    function16 = function14;
                    function15 = function13;
                    th = th2;
                    if (i4 > i3) {
                    }
                    throw th;
                }
                c329581.L$0 = function14;
                c329581.L$1 = function13;
                c329581.I$0 = i;
                c329581.I$1 = i2;
                c329581.label = 1;
                Object objInvoke2 = function13.invoke(c329581);
                return objInvoke2 != coroutine_suspended ? coroutine_suspended : objInvoke2;
            }
            i4 = c329581.I$1;
            i3 = c329581.I$0;
            function15 = (Function1) c329581.L$1;
            function16 = (Function1) c329581.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                if (i4 > i3 && function16.invoke(th).booleanValue()) {
                    long jPow = (long) Math.pow(2.0d, i4);
                    i5 = i4 + 1;
                    c329581.L$0 = function16;
                    c329581.L$1 = function15;
                    c329581.I$0 = i3;
                    c329581.I$1 = i5;
                    c329581.label = 2;
                } else {
                    throw th;
                }
            }
        }
    }

    public static /* synthetic */ Object retryExponential$default(int i, Function1 function1, Function1 function12, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.coroutines.RetryOnErrorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(RetryOnError.retryExponential$lambda$0((Throwable) obj2));
                }
            };
        }
        return retryExponential(i, function1, function12, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object runCatchingNetworkExceptionsWithRetryExponential(int i, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) throws Throwable {
        C329591 c329591;
        Object objM28550constructorimpl;
        if (continuation instanceof C329591) {
            c329591 = (C329591) continuation;
            int i2 = c329591.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c329591.label = i2 - Integer.MIN_VALUE;
            } else {
                c329591 = new C329591(continuation);
            }
        }
        Object objRetryExponential = c329591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c329591.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objRetryExponential);
                Result.Companion companion = Result.INSTANCE;
                Function1 function12 = new Function1() { // from class: com.robinhood.coroutines.RetryOnErrorKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(RetryOnError.m2579x22a799e2((Throwable) obj));
                    }
                };
                c329591.label = 1;
                objRetryExponential = retryExponential(i, function12, function1, c329591);
                if (objRetryExponential == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRetryExponential);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(objRetryExponential);
        } catch (Throwable th) {
            Throwables.rethrowIfNotNetworkRelated(th);
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28555isFailureimpl(objM28550constructorimpl)) {
            return null;
        }
        return objM28550constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: runCatchingNetworkExceptionsWithRetryExponential$lambda$2$lambda$1 */
    public static final boolean m2579x22a799e2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Throwables.isNetworkRelated(it);
    }
}

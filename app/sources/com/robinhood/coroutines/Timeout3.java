package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout4;
import kotlinx.coroutines.Timeout6;

/* compiled from: Timeout.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"withTimeoutStacktrace", "T", "timeMillis", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.TimeoutKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Timeout3 {

    /* compiled from: Timeout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.TimeoutKt", m3645f = "Timeout.kt", m3646l = {9}, m3647m = "withTimeoutStacktrace")
    /* renamed from: com.robinhood.coroutines.TimeoutKt$withTimeoutStacktrace$1 */
    static final class C329601<T> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C329601(Continuation<? super C329601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Timeout3.withTimeoutStacktrace(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withTimeoutStacktrace(long j, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Timeout2 {
        C329601 c329601;
        if (continuation instanceof C329601) {
            c329601 = (C329601) continuation;
            int i = c329601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329601.label = i - Integer.MIN_VALUE;
            } else {
                c329601 = new C329601(continuation);
            }
        }
        Object obj = c329601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329601.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            c329601.label = 1;
            Object objWithTimeout = Timeout6.withTimeout(j, function2, c329601);
            return objWithTimeout == coroutine_suspended ? coroutine_suspended : objWithTimeout;
        } catch (Timeout4 e) {
            throw new Timeout2(e);
        }
    }
}

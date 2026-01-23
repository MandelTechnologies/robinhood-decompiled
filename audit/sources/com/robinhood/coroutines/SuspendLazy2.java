package com.robinhood.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.Mutex3;

/* compiled from: SuspendLazy.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0011*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0011B%\u0012\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00028\u0000H\u0096B¢\u0006\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0003\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/coroutines/DoubleCheckSuspendLazy;", "T", "Lcom/robinhood/coroutines/SuspendLazy;", "initializer", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "lock", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/jvm/functions/Function1;", "value", "isInitialized", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-coroutines"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.coroutines.DoubleCheckSuspendLazy, reason: use source file name */
/* loaded from: classes15.dex */
public final class SuspendLazy2<T> implements SuspendLazy<T> {
    private static final Object UNINITIALIZED = new Object();
    private Function1<? super Continuation<? super T>, ? extends Object> initializer;
    private final Mutex lock;
    private volatile Object value;

    /* compiled from: SuspendLazy.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.coroutines.DoubleCheckSuspendLazy", m3645f = "SuspendLazy.kt", m3646l = {61, 42}, m3647m = "invoke")
    /* renamed from: com.robinhood.coroutines.DoubleCheckSuspendLazy$invoke$1 */
    static final class C329571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SuspendLazy2<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C329571(SuspendLazy2<? extends T> suspendLazy2, Continuation<? super C329571> continuation) {
            super(continuation);
            this.this$0 = suspendLazy2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.invoke(this);
        }
    }

    public SuspendLazy2(Function1<? super Continuation<? super T>, ? extends Object> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.lock = Mutex3.Mutex$default(false, 1, null);
        this.initializer = initializer;
        this.value = UNINITIALIZED;
    }

    @Override // com.robinhood.coroutines.SuspendLazy
    public boolean isInitialized() {
        return !Intrinsics.areEqual(this.value, UNINITIALIZED);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.coroutines.SuspendLazy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(Continuation<? super T> continuation) throws Throwable {
        C329571 c329571;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object obj;
        if (continuation instanceof C329571) {
            c329571 = (C329571) continuation;
            int i = c329571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c329571.label = i - Integer.MIN_VALUE;
            } else {
                c329571 = new C329571(this, continuation);
            }
        }
        Object obj2 = c329571.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c329571.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                Object obj3 = this.value;
                if (obj3 != UNINITIALIZED) {
                    return obj3;
                }
                mutex = this.lock;
                c329571.L$0 = mutex;
                c329571.label = 1;
                if (mutex.lock(null, c329571) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c329571.L$0;
                try {
                    ResultKt.throwOnFailure(obj2);
                    this.value = obj2;
                    this.initializer = null;
                    obj = obj2;
                    mutex = mutex2;
                    mutex.unlock(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) c329571.L$0;
            ResultKt.throwOnFailure(obj2);
            mutex = mutex3;
            obj = this.value;
            if (obj == UNINITIALIZED) {
                Function1<? super Continuation<? super T>, ? extends Object> function1 = this.initializer;
                if (function1 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                c329571.L$0 = mutex;
                c329571.label = 2;
                Object objInvoke = function1.invoke(c329571);
                if (objInvoke != coroutine_suspended) {
                    mutex2 = mutex;
                    obj2 = objInvoke;
                    this.value = obj2;
                    this.initializer = null;
                    obj = obj2;
                    mutex = mutex2;
                    mutex.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            }
            mutex.unlock(null);
            return obj;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}

package com.plaid.internal;

import com.plaid.internal.AbstractC6043b4;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

@DebugMetadata(m3644c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", m3645f = "ExponentialBackoffRetry.kt", m3646l = {32, 33}, m3647m = "invokeSuspend")
/* renamed from: com.plaid.internal.X0 */
/* loaded from: classes16.dex */
public final class C6002X0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Ref.ObjectRef f1812a;

    /* renamed from: b */
    public int f1813b;

    /* renamed from: c */
    public final /* synthetic */ Ref.IntRef f1814c;

    /* renamed from: d */
    public final /* synthetic */ Ref.ObjectRef<AbstractC6043b4<Object, Object>> f1815d;

    /* renamed from: e */
    public final /* synthetic */ Function1<Continuation<? super AbstractC6043b4<Object, ? extends Object>>, Object> f1816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6002X0(Ref.IntRef intRef, Ref.ObjectRef<AbstractC6043b4<Object, Object>> objectRef, Function1<? super Continuation<? super AbstractC6043b4<Object, ? extends Object>>, ? extends Object> function1, Continuation<? super C6002X0> continuation) {
        super(2, continuation);
        this.f1814c = intRef;
        this.f1815d = objectRef;
        this.f1816e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6002X0(this.f1814c, this.f1815d, this.f1816e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C6002X0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
    
        if (r9 != r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0084 -> B:26:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef<AbstractC6043b4<Object, Object>> objectRef;
        AbstractC6043b4<Object, Object> abstractC6043b4;
        long jMin;
        T t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1813b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f1814c.element < 4) {
                abstractC6043b4 = this.f1815d.element;
                abstractC6043b4.getClass();
                if (abstractC6043b4 instanceof AbstractC6043b4.a) {
                }
                long jPow = ((long) Math.pow(2.0d, this.f1814c.element)) * 1000;
                jMin = Math.min(Random.INSTANCE.nextLong(0L, jPow) + jPow, 32000L);
                this.f1812a = null;
                this.f1813b = 1;
                if (DelayKt.delay(jMin, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f1812a;
            ResultKt.throwOnFailure(obj);
            t = obj;
            objectRef.element = t;
            this.f1814c.element++;
            if (this.f1814c.element < 4 && this.f1815d.element.m1370a()) {
                abstractC6043b4 = this.f1815d.element;
                abstractC6043b4.getClass();
                if ((abstractC6043b4 instanceof AbstractC6043b4.a) || ((AbstractC6043b4.a) abstractC6043b4).f1921b != 400) {
                    long jPow2 = ((long) Math.pow(2.0d, this.f1814c.element)) * 1000;
                    jMin = Math.min(Random.INSTANCE.nextLong(0L, jPow2) + jPow2, 32000L);
                    this.f1812a = null;
                    this.f1813b = 1;
                    if (DelayKt.delay(jMin, this) != coroutine_suspended) {
                        objectRef = this.f1815d;
                        Function1<Continuation<? super AbstractC6043b4<Object, ? extends Object>>, Object> function1 = this.f1816e;
                        this.f1812a = objectRef;
                        this.f1813b = 2;
                        Object objInvoke = function1.invoke(this);
                        t = objInvoke;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = this.f1815d;
        Function1<Continuation<? super AbstractC6043b4<Object, ? extends Object>>, Object> function12 = this.f1816e;
        this.f1812a = objectRef;
        this.f1813b = 2;
        Object objInvoke2 = function12.invoke(this);
        t = objInvoke2;
    }
}

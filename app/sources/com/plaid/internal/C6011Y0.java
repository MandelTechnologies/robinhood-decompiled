package com.plaid.internal;

import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.plaid.internal.Y0 */
/* loaded from: classes16.dex */
public final class C6011Y0 {

    /* renamed from: a */
    public static final C6011Y0 f1843a = new C6011Y0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1356a(C5959S2 c5959s2, ContinuationImpl continuationImpl) {
        C5993W0 c5993w0;
        Ref.ObjectRef objectRef;
        Function1 function1;
        Ref.ObjectRef objectRef2;
        T t;
        Ref.ObjectRef objectRef3;
        if (continuationImpl instanceof C5993W0) {
            c5993w0 = (C5993W0) continuationImpl;
            int i = c5993w0.f1792f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5993w0.f1792f = i - Integer.MIN_VALUE;
            } else {
                c5993w0 = new C5993W0(this, continuationImpl);
            }
        }
        Object obj = c5993w0.f1790d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c5993w0.f1792f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            objectRef = new Ref.ObjectRef();
            c5993w0.f1787a = c5959s2;
            c5993w0.f1788b = objectRef;
            c5993w0.f1789c = objectRef;
            c5993w0.f1792f = 1;
            Object objInvoke = c5959s2.invoke(c5993w0);
            if (objInvoke != coroutine_suspended) {
                function1 = c5959s2;
                objectRef2 = objectRef;
                t = objInvoke;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef3 = (Ref.ObjectRef) c5993w0.f1787a;
            ResultKt.throwOnFailure(obj);
            return objectRef3.element;
        }
        objectRef2 = c5993w0.f1789c;
        Ref.ObjectRef objectRef4 = c5993w0.f1788b;
        function1 = (Function1) c5993w0.f1787a;
        ResultKt.throwOnFailure(obj);
        t = obj;
        objectRef = objectRef4;
        objectRef2.element = t;
        Ref.IntRef intRef = new Ref.IntRef();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        C6002X0 c6002x0 = new C6002X0(intRef, objectRef, function1, null);
        c5993w0.f1787a = objectRef;
        c5993w0.f1788b = null;
        c5993w0.f1789c = null;
        c5993w0.f1792f = 2;
        if (BuildersKt.withContext(io2, c6002x0, c5993w0) != coroutine_suspended) {
            objectRef3 = objectRef;
            return objectRef3.element;
        }
        return coroutine_suspended;
    }
}

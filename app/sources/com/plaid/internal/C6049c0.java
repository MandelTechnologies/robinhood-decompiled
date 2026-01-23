package com.plaid.internal;

import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(m3644c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", m3645f = "CrashStorage.kt", m3646l = {47, 47}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.plaid.internal.c0 */
/* loaded from: classes16.dex */
public final class C6049c0 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public C7082g0 f1933a;

    /* renamed from: b */
    public Iterator f1934b;

    /* renamed from: c */
    public int f1935c;

    /* renamed from: d */
    public final /* synthetic */ C7082g0 f1936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6049c0(C7082g0 c7082g0, Continuation<? super C6049c0> continuation) {
        super(2, continuation);
        this.f1936d = c7082g0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C6049c0(this.f1936d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new C6049c0(this.f1936d, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r6 == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C7082g0 c7082g0;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1935c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C7082g0 c7082g02 = this.f1936d;
            this.f1935c = 1;
            obj = c7082g02.f2786a.m1376a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = this.f1934b;
                c7082g0 = this.f1933a;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    String str = (String) it.next();
                    C6044b5 c6044b5 = c7082g0.f2786a;
                    this.f1933a = c7082g0;
                    this.f1934b = it;
                    this.f1935c = 2;
                    if (c6044b5.m1375a(str, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        c7082g0 = this.f1936d;
        it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }
}

package com.robinhood.android.udf;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [DS] */
/* compiled from: BaseDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "DS", "", "ds", "mutation", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.udf.BaseDuxo$stateFlow$2$1", m3645f = "BaseDuxo.kt", m3646l = {83}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.udf.BaseDuxo$stateFlow$2$1, reason: use source file name */
/* loaded from: classes20.dex */
final class BaseDuxo2<DS> extends ContinuationImpl7 implements Function3<DS, Function2<? super DS, ? super Continuation<? super DS>, ? extends Object>, Continuation<? super DS>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    BaseDuxo2(Continuation<? super BaseDuxo2> continuation) {
        super(3, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((BaseDuxo2<DS>) obj, (Function2<? super BaseDuxo2<DS>, ? super Continuation<? super BaseDuxo2<DS>>, ? extends Object>) obj2, (Continuation<? super BaseDuxo2<DS>>) obj3);
    }

    public final Object invoke(DS ds, Function2<? super DS, ? super Continuation<? super DS>, ? extends Object> function2, Continuation<? super DS> continuation) {
        BaseDuxo2 baseDuxo2 = new BaseDuxo2(continuation);
        baseDuxo2.L$0 = ds;
        baseDuxo2.L$1 = function2;
        return baseDuxo2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
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
        Object obj2 = this.L$0;
        Function2 function2 = (Function2) this.L$1;
        this.L$0 = null;
        this.label = 1;
        Object objInvoke = function2.invoke(obj2, this);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}

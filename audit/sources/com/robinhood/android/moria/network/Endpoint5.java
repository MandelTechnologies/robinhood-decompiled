package com.robinhood.android.moria.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [P, T] */
/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u00032\u0006\u0010\u0005\u001a\u0002H\u00022\u0006\u0010\u0006\u001a\u0002H\u0004H\n"}, m3636d2 = {"<anonymous>", "", "P", "", "T", "<unused var>", "t"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moria.network.Endpoint$Companion$create$1", m3645f = "Endpoint.kt", m3646l = {112}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.moria.network.Endpoint$Companion$create$1, reason: use source file name */
/* loaded from: classes17.dex */
final class Endpoint5<P, T> extends ContinuationImpl7 implements Function3<P, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $defaultSaveAction;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Endpoint5(Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Endpoint5> continuation) {
        super(3, continuation);
        this.$defaultSaveAction = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Unit> continuation) {
        return invoke2((Endpoint5<P, T>) obj, obj2, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(P p, T t, Continuation<? super Unit> continuation) {
        Endpoint5 endpoint5 = new Endpoint5(this.$defaultSaveAction, continuation);
        endpoint5.L$0 = t;
        return endpoint5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            Function2<T, Continuation<? super Unit>, Object> function2 = this.$defaultSaveAction;
            this.label = 1;
            if (function2.invoke(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

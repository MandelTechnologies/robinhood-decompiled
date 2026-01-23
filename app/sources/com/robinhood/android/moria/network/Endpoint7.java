package com.robinhood.android.moria.network;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: Add missing generic type declarations: [P] */
/* compiled from: Endpoint.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u0002H\u0002H\n"}, m3636d2 = {"<anonymous>", "", "P", "", "lastUpdatedAt", "", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.moria.network.Endpoint$Companion$createWithParams$1", m3645f = "Endpoint.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.moria.network.Endpoint$Companion$createWithParams$1, reason: use source file name */
/* loaded from: classes8.dex */
final class Endpoint7<P> extends ContinuationImpl7 implements Function3<Long, P, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Function1<Long, Boolean> $staleDecider;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Endpoint7(Function1<? super Long, Boolean> function1, Continuation<? super Endpoint7> continuation) {
        super(3, continuation);
        this.$staleDecider = function1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Long l, P p, Continuation<? super Boolean> continuation) {
        Endpoint7 endpoint7 = new Endpoint7(this.$staleDecider, continuation);
        endpoint7.L$0 = l;
        return endpoint7.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Long l, Object obj, Continuation<? super Boolean> continuation) {
        return invoke2(l, (Long) obj, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return this.$staleDecider.invoke((Long) this.L$0);
    }
}

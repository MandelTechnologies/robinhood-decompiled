package com.robinhood.store.advisory;

import com.robinhood.models.advisory.p304db.portfolio.RestrictedAsset;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RestrictStocksStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "", "Lcom/robinhood/models/advisory/db/portfolio/RestrictedAsset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.advisory.RestrictStocksStore$searchRestrictableStocksEndpoint$2", m3645f = "RestrictStocksStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.advisory.RestrictStocksStore$searchRestrictableStocksEndpoint$2, reason: use source file name */
/* loaded from: classes12.dex */
final class RestrictStocksStore5 extends ContinuationImpl7 implements Function2<List<? extends RestrictedAsset>, Continuation<? super Unit>, Object> {
    int label;

    RestrictStocksStore5(Continuation<? super RestrictStocksStore5> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RestrictStocksStore5(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends RestrictedAsset> list, Continuation<? super Unit> continuation) {
        return invoke2((List<RestrictedAsset>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<RestrictedAsset> list, Continuation<? super Unit> continuation) {
        return ((RestrictStocksStore5) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}

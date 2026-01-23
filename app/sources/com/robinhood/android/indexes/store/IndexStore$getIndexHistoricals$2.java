package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndexHistoricals;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexHistoricals;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexHistoricals$2", m3645f = "IndexStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexHistoricals$2 extends ContinuationImpl7 implements Function2<ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>>, Continuation<? super Unit>, Object> {
    int label;

    IndexStore$getIndexHistoricals$2(Continuation<? super IndexStore$getIndexHistoricals$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndexStore$getIndexHistoricals$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>> apiMarketdataResponse, Continuation<? super Unit> continuation) {
        return ((IndexStore$getIndexHistoricals$2) create(apiMarketdataResponse, continuation)).invokeSuspend(Unit.INSTANCE);
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

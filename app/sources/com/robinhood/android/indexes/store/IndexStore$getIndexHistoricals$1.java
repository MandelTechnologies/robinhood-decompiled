package com.robinhood.android.indexes.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.models.api.ApiIndexHistoricals;
import com.robinhood.android.indexes.models.api.ApiIndexHistoricalsDetailRequest;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.api.IndexApi;
import com.robinhood.models.p355ui.Historical;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexHistoricals;", "request", "Lcom/robinhood/android/indexes/models/api/ApiIndexHistoricalsDetailRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexHistoricals$1", m3645f = "IndexStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexHistoricals$1 extends ContinuationImpl7 implements Function2<ApiIndexHistoricalsDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexHistoricals$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexHistoricals$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexHistoricals$1 indexStore$getIndexHistoricals$1 = new IndexStore$getIndexHistoricals$1(this.this$0, continuation);
        indexStore$getIndexHistoricals$1.L$0 = obj;
        return indexStore$getIndexHistoricals$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIndexHistoricalsDetailRequest apiIndexHistoricalsDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexHistoricals>>> continuation) {
        return ((IndexStore$getIndexHistoricals$1) create(apiIndexHistoricalsDetailRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiIndexHistoricalsDetailRequest apiIndexHistoricalsDetailRequest = (ApiIndexHistoricalsDetailRequest) this.L$0;
            if (apiIndexHistoricalsDetailRequest instanceof ApiIndexHistoricalsDetailRequest.ApiIndexHistoricalsRequestById) {
                IndexApi indexApi = this.this$0.indexApi;
                ApiIndexHistoricalsDetailRequest.ApiIndexHistoricalsRequestById apiIndexHistoricalsRequestById = (ApiIndexHistoricalsDetailRequest.ApiIndexHistoricalsRequestById) apiIndexHistoricalsDetailRequest;
                UUID id = apiIndexHistoricalsRequestById.getId();
                Historical.Interval interval = apiIndexHistoricalsRequestById.getInterval();
                Instant start = apiIndexHistoricalsRequestById.getStart();
                Instant end = apiIndexHistoricalsRequestById.getEnd();
                this.label = 1;
                obj = indexApi.getIndexHistoricalsById(id, interval, start, end, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (ApiMarketdataResponse) obj;
    }
}

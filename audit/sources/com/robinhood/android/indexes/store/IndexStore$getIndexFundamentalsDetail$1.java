package com.robinhood.android.indexes.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentals;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentalsDetailRequest;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.api.IndexApi;
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

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentals;", "request", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsDetailRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexFundamentalsDetail$1", m3645f = "IndexStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexFundamentalsDetail$1 extends ContinuationImpl7 implements Function2<ApiIndexFundamentalsDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexFundamentals>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexFundamentalsDetail$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexFundamentalsDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexFundamentalsDetail$1 indexStore$getIndexFundamentalsDetail$1 = new IndexStore$getIndexFundamentalsDetail$1(this.this$0, continuation);
        indexStore$getIndexFundamentalsDetail$1.L$0 = obj;
        return indexStore$getIndexFundamentalsDetail$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIndexFundamentalsDetailRequest apiIndexFundamentalsDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexFundamentals>>> continuation) {
        return ((IndexStore$getIndexFundamentalsDetail$1) create(apiIndexFundamentalsDetailRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiIndexFundamentalsDetailRequest apiIndexFundamentalsDetailRequest = (ApiIndexFundamentalsDetailRequest) this.L$0;
            if (apiIndexFundamentalsDetailRequest instanceof ApiIndexFundamentalsDetailRequest.ApiIndexFundamentalsDetailRequestById) {
                IndexApi indexApi = this.this$0.indexApi;
                UUID id = ((ApiIndexFundamentalsDetailRequest.ApiIndexFundamentalsDetailRequestById) apiIndexFundamentalsDetailRequest).getId();
                this.label = 1;
                obj = indexApi.getIndexFundamentalsById(id, this);
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

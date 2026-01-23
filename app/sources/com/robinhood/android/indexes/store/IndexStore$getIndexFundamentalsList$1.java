package com.robinhood.android.indexes.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentals;
import com.robinhood.android.indexes.api.fundamentals.ApiIndexFundamentalsListRequest;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.api.IndexApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import java.util.List;
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
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentals;", "request", "Lcom/robinhood/android/indexes/api/fundamentals/ApiIndexFundamentalsListRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexFundamentalsList$1", m3645f = "IndexStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexFundamentalsList$1 extends ContinuationImpl7 implements Function2<ApiIndexFundamentalsListRequest, Continuation<? super ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiIndexFundamentals>>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexFundamentalsList$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexFundamentalsList$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexFundamentalsList$1 indexStore$getIndexFundamentalsList$1 = new IndexStore$getIndexFundamentalsList$1(this.this$0, continuation);
        indexStore$getIndexFundamentalsList$1.L$0 = obj;
        return indexStore$getIndexFundamentalsList$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ApiIndexFundamentalsListRequest apiIndexFundamentalsListRequest, Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexFundamentals>>>> continuation) {
        return ((IndexStore$getIndexFundamentalsList$1) create(apiIndexFundamentalsListRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ApiIndexFundamentalsListRequest apiIndexFundamentalsListRequest, Continuation<? super ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiIndexFundamentals>>>> continuation) {
        return invoke2(apiIndexFundamentalsListRequest, (Continuation<? super ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexFundamentals>>>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r5 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (ApiMarketdataResponse) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (ApiMarketdataResponse) obj;
        }
        ResultKt.throwOnFailure(obj);
        ApiIndexFundamentalsListRequest apiIndexFundamentalsListRequest = (ApiIndexFundamentalsListRequest) this.L$0;
        if (apiIndexFundamentalsListRequest instanceof ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestByIds) {
            IndexApi indexApi = this.this$0.indexApi;
            CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(((ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestByIds) apiIndexFundamentalsListRequest).getIds());
            this.label = 1;
            obj = indexApi.getIndexFundamentalsByIds(commaSeparatedList, this);
        } else if (apiIndexFundamentalsListRequest instanceof ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestBySymbols) {
            IndexApi indexApi2 = this.this$0.indexApi;
            CommaSeparatedList<String> commaSeparatedList2 = CommaSeparatedList2.toCommaSeparatedList(((ApiIndexFundamentalsListRequest.ApiIndexFundamentalsRequestBySymbols) apiIndexFundamentalsListRequest).getSymbols());
            this.label = 2;
            obj = indexApi2.getIndexFundamentalsBySymbols(commaSeparatedList2, this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }
}

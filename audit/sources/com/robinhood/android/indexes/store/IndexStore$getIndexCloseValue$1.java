package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndexCloseDetailRequest;
import com.robinhood.android.indexes.models.api.ApiIndexCloseValue;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseValue;", "request", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseDetailRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexCloseValue$1", m3645f = "IndexStore.kt", m3646l = {107, 110}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexCloseValue$1 extends ContinuationImpl7 implements Function2<ApiIndexCloseDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexCloseValue>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexCloseValue$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexCloseValue$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexCloseValue$1 indexStore$getIndexCloseValue$1 = new IndexStore$getIndexCloseValue$1(this.this$0, continuation);
        indexStore$getIndexCloseValue$1.L$0 = obj;
        return indexStore$getIndexCloseValue$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIndexCloseDetailRequest apiIndexCloseDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexCloseValue>>> continuation) {
        return ((IndexStore$getIndexCloseValue$1) create(apiIndexCloseDetailRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r12 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r12 == r0) goto L21;
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
        ApiIndexCloseDetailRequest apiIndexCloseDetailRequest = (ApiIndexCloseDetailRequest) this.L$0;
        if (apiIndexCloseDetailRequest instanceof ApiIndexCloseDetailRequest.ApiIndexCloseRequestById) {
            IndexApi indexApi = this.this$0.indexApi;
            UUID id = ((ApiIndexCloseDetailRequest.ApiIndexCloseRequestById) apiIndexCloseDetailRequest).getId();
            this.label = 1;
            obj = IndexApi.DefaultImpls.getIndexCloseValueById$default(indexApi, id, null, null, this, 6, null);
        } else if (apiIndexCloseDetailRequest instanceof ApiIndexCloseDetailRequest.ApiIndexCloseRequestBySymbol) {
            IndexApi indexApi2 = this.this$0.indexApi;
            String symbol = ((ApiIndexCloseDetailRequest.ApiIndexCloseRequestBySymbol) apiIndexCloseDetailRequest).getSymbol();
            this.label = 2;
            obj = IndexApi.DefaultImpls.getIndexCloseValueBySymbol$default(indexApi2, symbol, null, null, this, 6, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }
}

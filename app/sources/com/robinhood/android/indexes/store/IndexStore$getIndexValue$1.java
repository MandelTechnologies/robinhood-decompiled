package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndexValue;
import com.robinhood.android.indexes.models.api.ApiIndexValueDetailRequest;
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
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexValue;", "request", "Lcom/robinhood/android/indexes/models/api/ApiIndexValueDetailRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexValue$1", m3645f = "IndexStore.kt", m3646l = {63, 64}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexValue$1 extends ContinuationImpl7 implements Function2<ApiIndexValueDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexValue>>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexValue$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexValue$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexValue$1 indexStore$getIndexValue$1 = new IndexStore$getIndexValue$1(this.this$0, continuation);
        indexStore$getIndexValue$1.L$0 = obj;
        return indexStore$getIndexValue$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiIndexValueDetailRequest apiIndexValueDetailRequest, Continuation<? super ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexValue>>> continuation) {
        return ((IndexStore$getIndexValue$1) create(apiIndexValueDetailRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r5 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
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
        ApiIndexValueDetailRequest apiIndexValueDetailRequest = (ApiIndexValueDetailRequest) this.L$0;
        if (apiIndexValueDetailRequest instanceof ApiIndexValueDetailRequest.ApiIndexValueRequestById) {
            IndexApi indexApi = this.this$0.indexApi;
            UUID id = ((ApiIndexValueDetailRequest.ApiIndexValueRequestById) apiIndexValueDetailRequest).getId();
            this.label = 1;
            obj = indexApi.getIndexValueById(id, this);
        } else if (apiIndexValueDetailRequest instanceof ApiIndexValueDetailRequest.ApiIndexValueRequestBySymbol) {
            IndexApi indexApi2 = this.this$0.indexApi;
            String symbol = ((ApiIndexValueDetailRequest.ApiIndexValueRequestBySymbol) apiIndexValueDetailRequest).getSymbol();
            this.label = 2;
            obj = indexApi2.getIndexValueBySymbol(symbol, this);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }
}

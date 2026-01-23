package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndexCloseValue;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.dao.IndexCloseValueDao;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiResponse", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexCloseValue$2", m3645f = "IndexStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexCloseValue$2 extends ContinuationImpl7 implements Function2<ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexCloseValue>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexCloseValue$2(IndexStore indexStore, Continuation<? super IndexStore$getIndexCloseValue$2> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexCloseValue$2 indexStore$getIndexCloseValue$2 = new IndexStore$getIndexCloseValue$2(this.this$0, continuation);
        indexStore$getIndexCloseValue$2.L$0 = obj;
        return indexStore$getIndexCloseValue$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMarketdataResponse<ApiMarketdataResponse<ApiIndexCloseValue>> apiMarketdataResponse, Continuation<? super Unit> continuation) {
        return ((IndexStore$getIndexCloseValue$2) create(apiMarketdataResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ApiIndexCloseValue apiIndexCloseValue;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiMarketdataResponse apiMarketdataResponse = (ApiMarketdataResponse) ((ApiMarketdataResponse) this.L$0).getData();
        IndexCloseValue dbModel = (apiMarketdataResponse == null || (apiIndexCloseValue = (ApiIndexCloseValue) apiMarketdataResponse.getData()) == null) ? null : apiIndexCloseValue.toDbModel();
        if (dbModel != null) {
            this.this$0.indexCloseValueDao.insert((IndexCloseValueDao) dbModel);
        }
        return Unit.INSTANCE;
    }
}

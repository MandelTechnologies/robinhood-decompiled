package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndexCloseValue;
import com.robinhood.android.indexes.models.api.ApiMarketdataResponse;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiResponse", "Lcom/robinhood/android/indexes/models/api/ApiMarketdataResponse;", "", "Lcom/robinhood/android/indexes/models/api/ApiIndexCloseValue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexCloseValues$2", m3645f = "IndexStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes10.dex */
final class IndexStore$getIndexCloseValues$2 extends ContinuationImpl7 implements Function2<ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiIndexCloseValue>>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexCloseValues$2(IndexStore indexStore, Continuation<? super IndexStore$getIndexCloseValues$2> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexCloseValues$2 indexStore$getIndexCloseValues$2 = new IndexStore$getIndexCloseValues$2(this.this$0, continuation);
        indexStore$getIndexCloseValues$2.L$0 = obj;
        return indexStore$getIndexCloseValues$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexCloseValue>>> apiMarketdataResponse, Continuation<? super Unit> continuation) {
        return ((IndexStore$getIndexCloseValues$2) create(apiMarketdataResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ApiMarketdataResponse<List<? extends ApiMarketdataResponse<ApiIndexCloseValue>>> apiMarketdataResponse, Continuation<? super Unit> continuation) {
        return invoke2((ApiMarketdataResponse<List<ApiMarketdataResponse<ApiIndexCloseValue>>>) apiMarketdataResponse, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List list = (List) ((ApiMarketdataResponse) this.L$0).getData();
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ApiIndexCloseValue apiIndexCloseValue = (ApiIndexCloseValue) ((ApiMarketdataResponse) it.next()).getData();
                IndexCloseValue dbModel = apiIndexCloseValue != null ? apiIndexCloseValue.toDbModel() : null;
                if (dbModel != null) {
                    arrayList2.add(dbModel);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            this.this$0.indexCloseValueDao.insert((Iterable) arrayList);
        }
        return Unit.INSTANCE;
    }
}

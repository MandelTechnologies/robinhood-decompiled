package com.robinhood.shared.store.lists.store;

import com.robinhood.models.api.bonfire.ApiListRecord;
import com.robinhood.models.api.bonfire.ApiListsOrder;
import com.robinhood.models.api.bonfire.ApiSaveListOrderRequest;
import com.robinhood.models.dao.ListsOrderDao;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import com.robinhood.models.p320db.bonfire.ListsOrder3;
import com.robinhood.shared.store.lists.ListsApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ListsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/ListsOrder;", "it", "Lcom/robinhood/models/api/bonfire/ApiSaveListOrderRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListsOrderStore$updateOrderedListsEndpoint$1", m3645f = "ListsOrderStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$updateOrderedListsEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ListsOrderStore5 extends ContinuationImpl7 implements Function2<ApiSaveListOrderRequest, Continuation<? super ListsOrder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ListsOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListsOrderStore5(ListsOrderStore listsOrderStore, Continuation<? super ListsOrderStore5> continuation) {
        super(2, continuation);
        this.this$0 = listsOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ListsOrderStore5 listsOrderStore5 = new ListsOrderStore5(this.this$0, continuation);
        listsOrderStore5.L$0 = obj;
        return listsOrderStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiSaveListOrderRequest apiSaveListOrderRequest, Continuation<? super ListsOrder> continuation) {
        return ((ListsOrderStore5) create(apiSaveListOrderRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ApiSaveListOrderRequest apiSaveListOrderRequest = (ApiSaveListOrderRequest) this.L$0;
            List<ApiListRecord> lists = apiSaveListOrderRequest.getLists();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lists, 10));
            Iterator<T> it = lists.iterator();
            while (it.hasNext()) {
                arrayList.add(ListsOrder3.toDbModel((ApiListRecord) it.next()));
            }
            this.this$0.dao.insert((ListsOrderDao) new ListsOrder(0, arrayList, 1, null));
            ListsApi listsApi = this.this$0.listsApi;
            this.label = 1;
            obj = listsApi.saveListsOrder(apiSaveListOrderRequest, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ListsOrder3.toDbModel((ApiListsOrder) obj);
    }
}

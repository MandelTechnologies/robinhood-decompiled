package com.robinhood.shared.store.lists.store;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.models.api.bonfire.ApiListRecord;
import com.robinhood.models.api.bonfire.ApiSaveListOrderRequest;
import com.robinhood.models.dao.ListsOrderDao;
import com.robinhood.models.p320db.bonfire.ListRecord;
import com.robinhood.models.p320db.bonfire.ListsOrder;
import java.util.ArrayList;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ListsOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListsOrderStore$saveOrderedListWithDelay$1", m3645f = "ListsOrderStore.kt", m3646l = {92, 104}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.store.lists.store.ListsOrderStore$saveOrderedListWithDelay$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ListsOrderStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ ListsOrder $listsOrder;
    int label;
    final /* synthetic */ ListsOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListsOrderStore4(ListsOrderStore listsOrderStore, ListsOrder listsOrder, long j, Continuation<? super ListsOrderStore4> continuation) {
        super(2, continuation);
        this.this$0 = listsOrderStore;
        this.$listsOrder = listsOrder;
        this.$delay = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ListsOrderStore4(this.this$0, this.$listsOrder, this.$delay, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ListsOrderStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (com.robinhood.android.moria.network.PostEndpoint.DefaultImpls.post$default(r6, r7, null, r12, 2, null) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert((ListsOrderDao) this.$listsOrder);
            long j = this.$delay;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(j, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        List<ListRecord> lists = this.$listsOrder.getLists();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(lists, 10));
        for (ListRecord listRecord : lists) {
            arrayList.add(new ApiListRecord(listRecord.getId(), listRecord.getListType()));
        }
        ApiSaveListOrderRequest apiSaveListOrderRequest = new ApiSaveListOrderRequest(arrayList);
        PostEndpoint postEndpoint = this.this$0.updateOrderedListsEndpoint;
        this.label = 2;
    }
}

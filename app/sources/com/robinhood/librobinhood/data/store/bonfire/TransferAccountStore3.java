package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.dao.TransferAccountDao;
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

/* compiled from: TransferAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/bonfire/ApiTransferAccountsResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$endpoint$2", m3645f = "TransferAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class TransferAccountStore3 extends ContinuationImpl7 implements Function2<ApiTransferAccountsResponse, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountStore3(TransferAccountStore transferAccountStore, Continuation<? super TransferAccountStore3> continuation) {
        super(2, continuation);
        this.this$0 = transferAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferAccountStore3 transferAccountStore3 = new TransferAccountStore3(this.this$0, continuation);
        transferAccountStore3.L$0 = obj;
        return transferAccountStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiTransferAccountsResponse apiTransferAccountsResponse, Continuation<? super Unit> continuation) {
        return ((TransferAccountStore3) create(apiTransferAccountsResponse, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ApiTransferAccountsResponse apiTransferAccountsResponse = (ApiTransferAccountsResponse) this.L$0;
            TransferAccountDao transferAccountDao = this.this$0.dao;
            List<ApiTransferAccount> results = apiTransferAccountsResponse.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(((ApiTransferAccount) it.next()).getId());
            }
            transferAccountDao.deleteStaleRecords(arrayList);
            this.this$0.dao.insert(this.this$0.toDbModel(apiTransferAccountsResponse));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.transfer.ApiCryptoTransferHistoryDetailResponse;
import com.robinhood.models.crypto.dao.CryptoTransferHistoryItemDao;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferHistoryItem2;
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

/* compiled from: CryptoTransfersStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferHistoryDetailResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoTransfersStore$getHistory$2", m3645f = "CryptoTransfersStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoTransfersStore$getHistory$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiCryptoTransferHistoryDetailResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoTransfersStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoTransfersStore$getHistory$2(CryptoTransfersStore cryptoTransfersStore, Continuation<? super CryptoTransfersStore$getHistory$2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoTransfersStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoTransfersStore$getHistory$2 cryptoTransfersStore$getHistory$2 = new CryptoTransfersStore$getHistory$2(this.this$0, continuation);
        cryptoTransfersStore$getHistory$2.L$0 = obj;
        return cryptoTransfersStore$getHistory$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiCryptoTransferHistoryDetailResponse> paginatedResult, Continuation<? super Unit> continuation) {
        return ((CryptoTransfersStore$getHistory$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiCryptoTransferHistoryDetailResponse> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiCryptoTransferHistoryDetailResponse>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            CryptoTransferHistoryItemDao cryptoTransferHistoryItemDao = this.this$0.historyItemsDao;
            PaginationCursor previous = paginatedResult.getPrevious();
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(CryptoTransferHistoryItem2.toHistoryItemDbModel((ApiCryptoTransferHistoryDetailResponse) it.next()));
            }
            cryptoTransferHistoryItemDao.insert(previous, arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

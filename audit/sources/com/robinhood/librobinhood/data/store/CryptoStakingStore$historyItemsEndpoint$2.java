package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.staking.ApiCryptoStakingHistoryItem;
import com.robinhood.models.crypto.dao.CryptoStakingHistoryItemDao;
import com.robinhood.models.crypto.p314db.staking.CryptoStakingHistoryItem2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoStakingStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/staking/ApiCryptoStakingHistoryItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoStakingStore$historyItemsEndpoint$2", m3645f = "CryptoStakingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class CryptoStakingStore$historyItemsEndpoint$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends UUID, ? extends PaginationCursor>, PaginatedResult<? extends ApiCryptoStakingHistoryItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoStakingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoStakingStore$historyItemsEndpoint$2(CryptoStakingStore cryptoStakingStore, Continuation<? super CryptoStakingStore$historyItemsEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = cryptoStakingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiCryptoStakingHistoryItem> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<UUID, PaginationCursor>) tuples2, (PaginatedResult<ApiCryptoStakingHistoryItem>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, PaginationCursor> tuples2, PaginatedResult<ApiCryptoStakingHistoryItem> paginatedResult, Continuation<? super Unit> continuation) {
        CryptoStakingStore$historyItemsEndpoint$2 cryptoStakingStore$historyItemsEndpoint$2 = new CryptoStakingStore$historyItemsEndpoint$2(this.this$0, continuation);
        cryptoStakingStore$historyItemsEndpoint$2.L$0 = tuples2;
        cryptoStakingStore$historyItemsEndpoint$2.L$1 = paginatedResult;
        return cryptoStakingStore$historyItemsEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            PaginatedResult paginatedResult = (PaginatedResult) this.L$1;
            UUID uuid = (UUID) tuples2.component1();
            CryptoStakingHistoryItemDao cryptoStakingHistoryItemDao = this.this$0.historyItemDao;
            PaginationCursor previous = paginatedResult.getPrevious();
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(CryptoStakingHistoryItem2.toDbModel((ApiCryptoStakingHistoryItem) it.next()));
            }
            cryptoStakingHistoryItemDao.insert(uuid, previous, arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

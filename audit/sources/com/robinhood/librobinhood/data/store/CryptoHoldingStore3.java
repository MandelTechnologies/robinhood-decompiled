package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCryptoHolding;
import com.robinhood.models.crypto.dao.CurrencyDao;
import com.robinhood.models.crypto.p314db.Currency4;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: CryptoHoldingStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$FetchCryptoHoldingParams;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoHolding;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$fetchHoldingsEndpoint$2", m3645f = "CryptoHoldingStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$fetchHoldingsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoHoldingStore3 extends ContinuationImpl7 implements Function3<Tuples2<? extends CryptoHoldingStore.FetchCryptoHoldingParams, ? extends PaginationCursor>, PaginatedResult<? extends ApiCryptoHolding>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CryptoHoldingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHoldingStore3(CryptoHoldingStore cryptoHoldingStore, Continuation<? super CryptoHoldingStore3> continuation) {
        super(3, continuation);
        this.this$0 = cryptoHoldingStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoHoldingStore.FetchCryptoHoldingParams, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiCryptoHolding> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<CryptoHoldingStore.FetchCryptoHoldingParams, PaginationCursor>) tuples2, (PaginatedResult<ApiCryptoHolding>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoHoldingStore.FetchCryptoHoldingParams, PaginationCursor> tuples2, PaginatedResult<ApiCryptoHolding> paginatedResult, Continuation<? super Unit> continuation) {
        CryptoHoldingStore3 cryptoHoldingStore3 = new CryptoHoldingStore3(this.this$0, continuation);
        cryptoHoldingStore3.L$0 = tuples2;
        cryptoHoldingStore3.L$1 = paginatedResult;
        return cryptoHoldingStore3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        PaginatedResult<ApiCryptoHolding> paginatedResult = (PaginatedResult) this.L$1;
        this.this$0.cryptoHoldingDao.insert(paginatedResult, ((CryptoHoldingStore.FetchCryptoHoldingParams) tuples2.component1()).getCryptoAccountId());
        CurrencyDao currencyDao = this.this$0.currencyDao;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult, 10));
        Iterator<ApiCryptoHolding> it = paginatedResult.iterator();
        while (it.hasNext()) {
            arrayList.add(Currency4.toDbModel(it.next().getCurrency()));
        }
        currencyDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}

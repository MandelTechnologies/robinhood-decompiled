package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Currency4;
import com.robinhood.models.crypto.p314db.CurrencyPair2;
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

/* compiled from: CurrencyPairV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairsEndpoint$2", m3645f = "CurrencyPairV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairsEndpoint$2, reason: use source file name */
/* loaded from: classes20.dex */
final class CurrencyPairV2Store7 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiCurrencyPair>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CurrencyPairV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyPairV2Store7(CurrencyPairV2Store currencyPairV2Store, Continuation<? super CurrencyPairV2Store7> continuation) {
        super(2, continuation);
        this.this$0 = currencyPairV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyPairV2Store7 currencyPairV2Store7 = new CurrencyPairV2Store7(this.this$0, continuation);
        currencyPairV2Store7.L$0 = obj;
        return currencyPairV2Store7;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiCurrencyPair> paginatedResult, Continuation<? super Unit> continuation) {
        return ((CurrencyPairV2Store7) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiCurrencyPair> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiCurrencyPair>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        List results = paginatedResult.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(CurrencyPair2.toDbModel((ApiCurrencyPair) it.next()));
        }
        this.this$0.currencyPairDao.insert((Iterable) arrayList);
        this.this$0.currencyPairRhRoomDao.insert((Iterable) arrayList);
        List<ApiCurrencyPair> results2 = paginatedResult.getResults();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(results2, 10));
        for (ApiCurrencyPair apiCurrencyPair : results2) {
            arrayList2.add(CollectionsKt.listOf((Object[]) new Currency[]{Currency4.toDbModel(apiCurrencyPair.getAssetCurrency()), Currency4.toDbModel(apiCurrencyPair.getQuoteCurrency())}));
        }
        List listFlatten = CollectionsKt.flatten(arrayList2);
        this.this$0.currencyDao.insert((Iterable) listFlatten);
        this.this$0.currencyRhRoomDao.insert(listFlatten);
        return Unit.INSTANCE;
    }
}

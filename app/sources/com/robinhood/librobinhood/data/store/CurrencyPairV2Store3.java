package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiCurrencyPair;
import com.robinhood.models.crypto.dao.CurrencyPairDao;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p314db.Currency4;
import com.robinhood.models.crypto.p314db.CurrencyPair;
import com.robinhood.models.crypto.p314db.CurrencyPair2;
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

/* compiled from: CurrencyPairV2Store.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "currencyPair", "Lcom/robinhood/models/api/ApiCurrencyPair;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairEndpoint$2", m3645f = "CurrencyPairV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CurrencyPairV2Store$getCurrencyPairEndpoint$2, reason: use source file name */
/* loaded from: classes20.dex */
final class CurrencyPairV2Store3 extends ContinuationImpl7 implements Function2<ApiCurrencyPair, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CurrencyPairV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CurrencyPairV2Store3(CurrencyPairV2Store currencyPairV2Store, Continuation<? super CurrencyPairV2Store3> continuation) {
        super(2, continuation);
        this.this$0 = currencyPairV2Store;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CurrencyPairV2Store3 currencyPairV2Store3 = new CurrencyPairV2Store3(this.this$0, continuation);
        currencyPairV2Store3.L$0 = obj;
        return currencyPairV2Store3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiCurrencyPair apiCurrencyPair, Continuation<? super Unit> continuation) {
        return ((CurrencyPairV2Store3) create(apiCurrencyPair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiCurrencyPair apiCurrencyPair = (ApiCurrencyPair) this.L$0;
        List listListOf = CollectionsKt.listOf((Object[]) new Currency[]{Currency4.toDbModel(apiCurrencyPair.getAssetCurrency()), Currency4.toDbModel(apiCurrencyPair.getQuoteCurrency())});
        this.this$0.currencyDao.insert((Iterable) listListOf);
        this.this$0.currencyRhRoomDao.insert(listListOf);
        CurrencyPair dbModel = CurrencyPair2.toDbModel(apiCurrencyPair);
        this.this$0.currencyPairDao.insert((CurrencyPairDao) dbModel);
        this.this$0.currencyPairRhRoomDao.insert((com.robinhood.models.dao.CurrencyPairDao) dbModel);
        return Unit.INSTANCE;
    }
}

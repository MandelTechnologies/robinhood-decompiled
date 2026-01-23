package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoHoldingStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCryptoHolding;
import com.robinhood.models.api.retrofit.NummusApi;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoHoldingStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoHolding;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/CryptoHoldingStore$FetchCryptoHoldingParams;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoHoldingStore$fetchHoldingsEndpoint$1", m3645f = "CryptoHoldingStore.kt", m3646l = {54}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoHoldingStore$fetchHoldingsEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoHoldingStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoHoldingStore.FetchCryptoHoldingParams, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiCryptoHolding>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoHoldingStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoHoldingStore2(CryptoHoldingStore cryptoHoldingStore, Continuation<? super CryptoHoldingStore2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoHoldingStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoHoldingStore2 cryptoHoldingStore2 = new CryptoHoldingStore2(this.this$0, continuation);
        cryptoHoldingStore2.L$0 = obj;
        return cryptoHoldingStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoHoldingStore.FetchCryptoHoldingParams, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiCryptoHolding>> continuation) {
        return invoke2((Tuples2<CryptoHoldingStore.FetchCryptoHoldingParams, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiCryptoHolding>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoHoldingStore.FetchCryptoHoldingParams, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiCryptoHolding>> continuation) {
        return ((CryptoHoldingStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        CryptoHoldingStore.FetchCryptoHoldingParams fetchCryptoHoldingParams = (CryptoHoldingStore.FetchCryptoHoldingParams) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        NummusApi nummusApi = this.this$0.nummus;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        UUID cryptoAccountId = fetchCryptoHoldingParams.getCryptoAccountId();
        this.label = 1;
        Object objFetchHoldings = nummusApi.fetchHoldings(value, cryptoAccountId, this);
        return objFetchHoldings == coroutine_suspended ? coroutine_suspended : objFetchHoldings;
    }
}

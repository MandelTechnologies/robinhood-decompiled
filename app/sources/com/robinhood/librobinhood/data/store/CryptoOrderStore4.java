package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.Nummus;
import com.robinhood.librobinhood.data.store.CryptoOrderStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCryptoOrder;
import com.robinhood.models.crypto.p314db.CryptoOrder;
import com.robinhood.shared.crypto.utils.UpdatedAtGteUtil;
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
import p479j$.time.Instant;

/* compiled from: CryptoOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCryptoOrder;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/librobinhood/data/store/CryptoOrderStore$PendingRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoOrderStore$pendingEndpoint$1", m3645f = "CryptoOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$pendingEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoOrderStore4 extends ContinuationImpl7 implements Function2<Tuples2<? extends CryptoOrderStore.PendingRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiCryptoOrder>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CryptoOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderStore4(CryptoOrderStore cryptoOrderStore, Continuation<? super CryptoOrderStore4> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CryptoOrderStore4 cryptoOrderStore4 = new CryptoOrderStore4(this.this$0, continuation);
        cryptoOrderStore4.L$0 = obj;
        return cryptoOrderStore4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CryptoOrderStore.PendingRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiCryptoOrder>> continuation) {
        return invoke2((Tuples2<CryptoOrderStore.PendingRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiCryptoOrder>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CryptoOrderStore.PendingRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiCryptoOrder>> continuation) {
        return ((CryptoOrderStore4) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        CryptoOrderStore.PendingRequest pendingRequest = (CryptoOrderStore.PendingRequest) tuples2.component1();
        PaginationCursor paginationCursor = (PaginationCursor) tuples2.component2();
        Instant updatedAtGte = UpdatedAtGteUtil.getUpdatedAtGte(this.this$0.dao.getLatestUpdatedAt(), this.this$0.getLastUpdatedAtManager().getLastUpdatedAt(CryptoOrder.class));
        Nummus nummus2 = this.this$0.nummus;
        String value = paginationCursor != null ? paginationCursor.getValue() : null;
        UUID accountId = pendingRequest.getAccountId();
        this.label = 1;
        Object objFetchOrders = nummus2.fetchOrders(value, updatedAtGte, accountId, this);
        return objFetchOrders == coroutine_suspended ? coroutine_suspended : objFetchOrders;
    }
}

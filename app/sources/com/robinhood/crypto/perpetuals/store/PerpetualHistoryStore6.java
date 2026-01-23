package com.robinhood.crypto.perpetuals.store;

import com.robinhood.android.regiongate.PerpetualsRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderDetails3;
import com.robinhood.crypto.perpetuals.store.PerpetualHistoryStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import crypto_perpetuals.order.p438v1.OrderDetailsDto;
import crypto_perpetuals.service.p440v1.CryptoPerpetualsService;
import crypto_perpetuals.service.p440v1.ListOrderRequestDto;
import crypto_perpetuals.service.p440v1.ListOrderResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PerpetualHistoryStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualOrderDetails;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/crypto/perpetuals/store/PerpetualsHistoryStore$PaginatedListOrderRequest;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$paginatedListOrderDetailsEndpoint$1", m3645f = "PerpetualHistoryStore.kt", m3646l = {69, 75}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.store.PerpetualsHistoryStore$paginatedListOrderDetailsEndpoint$1, reason: use source file name */
/* loaded from: classes15.dex */
final class PerpetualHistoryStore6 extends ContinuationImpl7 implements Function2<Tuples2<? extends PerpetualHistoryStore.PaginatedListOrderRequest, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends PerpetualOrderDetails>>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PerpetualHistoryStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerpetualHistoryStore6(PerpetualHistoryStore perpetualHistoryStore, Continuation<? super PerpetualHistoryStore6> continuation) {
        super(2, continuation);
        this.this$0 = perpetualHistoryStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PerpetualHistoryStore6 perpetualHistoryStore6 = new PerpetualHistoryStore6(this.this$0, continuation);
        perpetualHistoryStore6.L$0 = obj;
        return perpetualHistoryStore6;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends PerpetualHistoryStore.PaginatedListOrderRequest, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends PerpetualOrderDetails>> continuation) {
        return invoke2((Tuples2<PerpetualHistoryStore.PaginatedListOrderRequest, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<PerpetualOrderDetails>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<PerpetualHistoryStore.PaginatedListOrderRequest, PaginationCursor> tuples2, Continuation<? super PaginatedResult<PerpetualOrderDetails>> continuation) {
        return ((PerpetualHistoryStore6) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[LOOP:0: B:30:0x00be->B:32:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PerpetualHistoryStore.PaginatedListOrderRequest paginatedListOrderRequest;
        PaginationCursor paginationCursor;
        Object objFirst;
        Object objListOrder;
        PaginationCursor paginationCursor2;
        String value;
        ListOrderRequestDto listOrderRequestDtoCopy$default;
        Iterator<T> it;
        String next_token;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        PaginationCursor paginationCursor3 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            paginatedListOrderRequest = (PerpetualHistoryStore.PaginatedListOrderRequest) tuples2.component1();
            paginationCursor = (PaginationCursor) tuples2.component2();
            Flow flowStreamRegionGateStateFlow$default = RegionGateProvider.DefaultImpls.streamRegionGateStateFlow$default(this.this$0.regionGateProvider, PerpetualsRegionGate.INSTANCE, false, 2, null);
            this.L$0 = paginatedListOrderRequest;
            this.L$1 = paginationCursor;
            this.label = 1;
            objFirst = FlowKt.first(flowStreamRegionGateStateFlow$default, this);
            if (objFirst != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paginationCursor2 = (PaginationCursor) this.L$0;
            ResultKt.throwOnFailure(obj);
            objListOrder = obj;
            ListOrderResponseDto listOrderResponseDto = (ListOrderResponseDto) objListOrder;
            List<OrderDetailsDto> orders = listOrderResponseDto.getOrders();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(orders, 10));
            it = orders.iterator();
            while (it.hasNext()) {
                arrayList.add(PerpetualOrderDetails3.toDbModel((OrderDetailsDto) it.next()));
            }
            next_token = listOrderResponseDto.getNext_token();
            if (next_token != null) {
                if (arrayList.isEmpty()) {
                    next_token = null;
                }
                if (next_token != null) {
                    paginationCursor3 = new PaginationCursor(next_token);
                }
            }
            return new PaginatedResult(arrayList, paginationCursor2, paginationCursor3);
        }
        paginationCursor = (PaginationCursor) this.L$1;
        PerpetualHistoryStore.PaginatedListOrderRequest paginatedListOrderRequest2 = (PerpetualHistoryStore.PaginatedListOrderRequest) this.L$0;
        ResultKt.throwOnFailure(obj);
        paginatedListOrderRequest = paginatedListOrderRequest2;
        objFirst = obj;
        if (!((Boolean) objFirst).booleanValue()) {
            return new PaginatedResult(CollectionsKt.emptyList(), null, null, 6, null);
        }
        ListOrderRequestDto request = paginatedListOrderRequest.getRequest();
        if (paginationCursor != null && (value = paginationCursor.getValue()) != null && (listOrderRequestDtoCopy$default = ListOrderRequestDto.copy$default(request, null, null, null, null, null, value, 31, null)) != null) {
            request = listOrderRequestDtoCopy$default;
        }
        CryptoPerpetualsService cryptoPerpetualsService = this.this$0.service;
        this.L$0 = paginationCursor;
        this.L$1 = null;
        this.label = 2;
        objListOrder = cryptoPerpetualsService.ListOrder(request, this);
        if (objListOrder != coroutine_suspended) {
            paginationCursor2 = paginationCursor;
            ListOrderResponseDto listOrderResponseDto2 = (ListOrderResponseDto) objListOrder;
            List<OrderDetailsDto> orders2 = listOrderResponseDto2.getOrders();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(orders2, 10));
            it = orders2.iterator();
            while (it.hasNext()) {
            }
            next_token = listOrderResponseDto2.getNext_token();
            if (next_token != null) {
            }
            return new PaginatedResult(arrayList2, paginationCursor2, paginationCursor3);
        }
        return coroutine_suspended;
    }
}

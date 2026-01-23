package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import com.robinhood.android.udf.HasSavedState;
import java.util.Collection;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nummus.p512v1.NummusService;
import nummus.p512v1.OrderTaxLotDetailDto;
import nummus.p512v1.TaxLotsForOrderRequestDto;
import nummus.p512v1.TaxLotsForOrderResponseDto;

/* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$fetchNextPage$1$1", m3645f = "CryptoOrderDetailTaxLotsDuxo.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$fetchNextPage$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderDetailTaxLotsDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoOrderDetailTaxLotsDataState $it;
    int label;
    final /* synthetic */ CryptoOrderDetailTaxLotsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoOrderDetailTaxLotsDuxo2(CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo, CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState, Continuation<? super CryptoOrderDetailTaxLotsDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = cryptoOrderDetailTaxLotsDuxo;
        this.$it = cryptoOrderDetailTaxLotsDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoOrderDetailTaxLotsDuxo2(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoOrderDetailTaxLotsDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NummusService nummusService = this.this$0.nummusService;
            String string2 = ((CryptoOrderDetailTaxLotsFragmentKey) CryptoOrderDetailTaxLotsDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getOrderUuid().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            TaxLotsForOrderRequestDto taxLotsForOrderRequestDto = new TaxLotsForOrderRequestDto(string2, this.$it.getNextCursor(), null, 4, null);
            this.label = 1;
            obj = nummusService.TaxLotsForOrder(taxLotsForOrderRequestDto, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C404431((TaxLotsForOrderResponseDto) obj, null));
        this.this$0.requestNextPageJob = null;
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderDetailTaxLotsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$fetchNextPage$1$1$1", m3645f = "CryptoOrderDetailTaxLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsDuxo$fetchNextPage$1$1$1 */
    static final class C404431 extends ContinuationImpl7 implements Function2<CryptoOrderDetailTaxLotsDataState, Continuation<? super CryptoOrderDetailTaxLotsDataState>, Object> {
        final /* synthetic */ TaxLotsForOrderResponseDto $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C404431(TaxLotsForOrderResponseDto taxLotsForOrderResponseDto, Continuation<? super C404431> continuation) {
            super(2, continuation);
            this.$response = taxLotsForOrderResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C404431 c404431 = new C404431(this.$response, continuation);
            c404431.L$0 = obj;
            return c404431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState, Continuation<? super CryptoOrderDetailTaxLotsDataState> continuation) {
            return ((C404431) create(cryptoOrderDetailTaxLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoOrderDetailTaxLotsDataState cryptoOrderDetailTaxLotsDataState = (CryptoOrderDetailTaxLotsDataState) this.L$0;
            List<OrderTaxLotDetailDto> taxLotDetails = cryptoOrderDetailTaxLotsDataState.getTaxLotDetails();
            if (taxLotDetails == null) {
                taxLotDetails = CollectionsKt.emptyList();
            }
            return CryptoOrderDetailTaxLotsDataState.copy$default(cryptoOrderDetailTaxLotsDataState, null, null, null, null, CollectionsKt.plus((Collection) taxLotDetails, (Iterable) this.$response.getOrder_tax_lot_details()), this.$response.getNext(), 15, null);
        }
    }
}

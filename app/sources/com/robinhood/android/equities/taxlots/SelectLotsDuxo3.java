package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.SelectLotsDuxo;
import com.robinhood.android.equities.taxlots.SelectLotsEvent;
import com.robinhood.android.equities.taxlots.SelectLotsKey;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.udf.HasSavedState;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SelectLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$resetToInitialSelection$1$1", m3645f = "SelectLotsDuxo.kt", m3646l = {378, 384}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$resetToInitialSelection$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SelectLotsDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelectLotsDataState $ds;
    final /* synthetic */ List<TaxLotSelection> $initialLots;
    final /* synthetic */ BigDecimal $numberOfShares;
    int label;
    final /* synthetic */ SelectLotsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsDuxo3(SelectLotsDuxo selectLotsDuxo, List<TaxLotSelection> list, SelectLotsDataState selectLotsDataState, BigDecimal bigDecimal, Continuation<? super SelectLotsDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = selectLotsDuxo;
        this.$initialLots = list;
        this.$ds = selectLotsDataState;
        this.$numberOfShares = bigDecimal;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectLotsDuxo3(this.this$0, this.$initialLots, this.$ds, this.$numberOfShares, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectLotsDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        if (r3.setTaxLotsSelectionMethod(r4, r5, r6, r7, null, r9) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SelectLotsDuxo3 selectLotsDuxo3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
            SelectLotsDuxo.Companion companion = SelectLotsDuxo.INSTANCE;
            String accountNumber = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber();
            UUID orderId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getOrderId();
            UUID instrumentId = ((SelectLotsKey) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
            List<TaxLotSelection> list = this.$initialLots;
            this.label = 1;
            selectLotsDuxo3 = this;
            if (taxLotsCachedService.setSelectedTaxLots(accountNumber, orderId, instrumentId, list, selectLotsDuxo3) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            selectLotsDuxo3 = this;
            selectLotsDuxo3.this$0.submit(new SelectLotsEvent.Dismiss(new SelectLotsKey.Result.Complete(selectLotsDuxo3.$numberOfShares, selectLotsDuxo3.$initialLots)));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        selectLotsDuxo3 = this;
        TaxLotsCachedService taxLotsCachedService2 = selectLotsDuxo3.this$0.taxLotsCachedService;
        SelectLotsDuxo.Companion companion2 = SelectLotsDuxo.INSTANCE;
        String accountNumber2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo3.this$0)).getAccountNumber();
        UUID orderId2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo3.this$0)).getOrderId();
        UUID instrumentId2 = ((SelectLotsKey) companion2.getArgs((HasSavedState) selectLotsDuxo3.this$0)).getInstrumentId();
        SelectionStrategy initialSelectionStrategy = selectLotsDuxo3.$ds.getInitialSelectionStrategy();
        selectLotsDuxo3.label = 2;
    }
}

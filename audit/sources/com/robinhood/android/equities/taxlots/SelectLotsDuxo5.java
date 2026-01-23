package com.robinhood.android.equities.taxlots;

import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.math.BigDecimals7;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategySummary;
import equity_trading_tax_lots.proto.p460v1.SetTaxLotsSelectionMethodResponse;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SelectLotsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equities/taxlots/SelectLotsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$3$1", m3645f = "SelectLotsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equities.taxlots.SelectLotsDuxo$setSelectionStrategy$1$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class SelectLotsDuxo5 extends ContinuationImpl7 implements Function2<SelectLotsDataState, Continuation<? super SelectLotsDataState>, Object> {
    final /* synthetic */ SelectionStrategySummary $it;
    final /* synthetic */ SetTaxLotsSelectionMethodResponse $response;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectLotsDuxo5(SetTaxLotsSelectionMethodResponse setTaxLotsSelectionMethodResponse, SelectionStrategySummary selectionStrategySummary, Continuation<? super SelectLotsDuxo5> continuation) {
        super(2, continuation);
        this.$response = setTaxLotsSelectionMethodResponse;
        this.$it = selectionStrategySummary;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SelectLotsDuxo5 selectLotsDuxo5 = new SelectLotsDuxo5(this.$response, this.$it, continuation);
        selectLotsDuxo5.L$0 = obj;
        return selectLotsDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectLotsDataState selectLotsDataState, Continuation<? super SelectLotsDataState> continuation) {
        return ((SelectLotsDuxo5) create(selectLotsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String amount;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SelectLotsDataState selectLotsDataState = (SelectLotsDataState) this.L$0;
        BigDecimal bigDecimalOrZero = BigDecimals7.orZero(BigDecimals7.toBigDecimalOrNull(this.$response.getMaximum_number_of_shares()));
        SelectionStrategy selection_strategy = this.$response.getSelection_strategy();
        TaxLotsStringsHelper taxLotsStringsHelper = TaxLotsStringsHelper.INSTANCE;
        Money estimated_gain_loss = this.$it.getEstimated_gain_loss();
        return SelectLotsDataState.copy$default(selectLotsDataState, null, null, null, null, false, null, null, null, false, null, 0, null, null, null, null, null, false, false, null, null, false, null, null, new SetSelectionStrategyFailure(bigDecimalOrZero, selection_strategy, taxLotsStringsHelper.getGainLossAlert(BigDecimals7.orZero((estimated_gain_loss == null || (amount = estimated_gain_loss.getAmount()) == null) ? null : BigDecimals7.toBigDecimalOrNull(amount)))), null, null, null, 0, 260046847, null);
    }
}

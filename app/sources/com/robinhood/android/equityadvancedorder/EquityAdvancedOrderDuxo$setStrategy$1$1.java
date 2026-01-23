package com.robinhood.android.equityadvancedorder;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.taxlots.microgram.TaxLotsCachedService;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.udf.HasSavedState;
import equity_trading_tax_lots.proto.p460v1.TaxLotSelection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setStrategy$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$setStrategy$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityAdvancedOrderDataState $it;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$setStrategy$1$1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDuxo$setStrategy$1$1> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
        this.$it = equityAdvancedOrderDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderDuxo$setStrategy$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderDuxo$setStrategy$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EquityAdvancedOrderDuxo$setStrategy$1$1 equityAdvancedOrderDuxo$setStrategy$1$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TaxLotsCachedService taxLotsCachedService = this.this$0.taxLotsCachedService;
            String accountNumber = this.$it.getCommonState().getAccountNumber();
            EquityAdvancedOrderDuxo.Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
            UUID refId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getRefId();
            UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
            List<TaxLotSelection> listEmptyList = CollectionsKt.emptyList();
            this.label = 1;
            equityAdvancedOrderDuxo$setStrategy$1$1 = this;
            if (taxLotsCachedService.setSelectedTaxLots(accountNumber, refId, instrumentId, listEmptyList, equityAdvancedOrderDuxo$setStrategy$1$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            equityAdvancedOrderDuxo$setStrategy$1$1 = this;
        }
        EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = equityAdvancedOrderDuxo$setStrategy$1$1.this$0;
        String accountNumber2 = equityAdvancedOrderDuxo$setStrategy$1$1.$it.getCommonState().getAccountNumber();
        EquityAdvancedOrderDuxo.Companion companion2 = EquityAdvancedOrderDuxo.INSTANCE;
        equityAdvancedOrderDuxo.submit(new EquityOrderEvent.Advanced.ShowTaxLotsSelection(accountNumber2, ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) equityAdvancedOrderDuxo$setStrategy$1$1.this$0)).getRefId(), ((EquityAdvancedOrderFragment.Args) companion2.getArgs((HasSavedState) equityAdvancedOrderDuxo$setStrategy$1$1.this$0)).getInstrumentId(), equityAdvancedOrderDuxo$setStrategy$1$1.$it.getNumberOfShares()));
        return Unit.INSTANCE;
    }
}

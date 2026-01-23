package com.robinhood.android.trade.equity.p261ui.confirmation;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.Order;
import equity_trading_tax_lots.proto.p460v1.StreamTaxLotsSummaryResponse;
import equity_trading_tax_lots.proto.p460v1.TaxLotStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Merge.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0015\u0010\u0006\u001a\u00118\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, m3636d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "it", "", "<anonymous>"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$invokeSuspend$$inlined$flatMapLatest$1", m3645f = "OrderConfirmationDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$invokeSuspend$$inlined$flatMapLatest$1 */
/* loaded from: classes9.dex */
public final class C29461x7b85e75b extends ContinuationImpl7 implements Function3<FlowCollector<? super StreamTaxLotsSummaryResponse>, Tuples2<? extends Boolean, ? extends Order>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ OrderConfirmationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29461x7b85e75b(Continuation continuation, OrderConfirmationDuxo orderConfirmationDuxo) {
        super(3, continuation);
        this.this$0 = orderConfirmationDuxo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super StreamTaxLotsSummaryResponse> flowCollector, Tuples2<? extends Boolean, ? extends Order> tuples2, Continuation<? super Unit> continuation) {
        C29461x7b85e75b c29461x7b85e75b = new C29461x7b85e75b(continuation, this.this$0);
        c29461x7b85e75b.L$0 = flowCollector;
        c29461x7b85e75b.L$1 = tuples2;
        return c29461x7b85e75b.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Tuples2 tuples2 = (Tuples2) this.L$1;
            final boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
            Order order = (Order) tuples2.component2();
            this.this$0.applyMutation(new Function1<OrderConfirmationViewState, OrderConfirmationViewState>() { // from class: com.robinhood.android.trade.equity.ui.confirmation.OrderConfirmationDuxo$onResume$59$1$1
                @Override // kotlin.jvm.functions.Function1
                public final OrderConfirmationViewState invoke(OrderConfirmationViewState applyMutation) {
                    Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
                    return OrderConfirmationViewState.copy$default(applyMutation, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, false, null, false, null, null, false, null, null, null, false, zBooleanValue, null, false, false, false, 1040187391, null);
                }
            });
            Flow<StreamTaxLotsSummaryResponse> flowStreamTaxLotSummary = this.this$0.taxLotsCachedService.streamTaxLotSummary(order.getAccountNumber(), order.getId(), order.getInstrument(), TaxLotStatus.HISTORY);
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flowStreamTaxLotSummary, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}

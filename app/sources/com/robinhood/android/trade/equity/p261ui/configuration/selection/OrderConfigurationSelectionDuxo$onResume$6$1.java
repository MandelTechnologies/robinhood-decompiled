package com.robinhood.android.trade.equity.p261ui.configuration.selection;

import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderConfigurationSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/configuration/selection/OrderConfigurationSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.configuration.selection.OrderConfigurationSelectionDuxo$onResume$6$1", m3645f = "OrderConfigurationSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class OrderConfigurationSelectionDuxo$onResume$6$1 extends ContinuationImpl7 implements Function2<OrderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState>, Object> {
    final /* synthetic */ Boolean $isJointAccount;
    final /* synthetic */ InstrumentRecurringTradability $recurringTradability;
    final /* synthetic */ Boolean $supportedAccountForRecurring;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderConfigurationSelectionDuxo$onResume$6$1(Boolean bool, InstrumentRecurringTradability instrumentRecurringTradability, Boolean bool2, Continuation<? super OrderConfigurationSelectionDuxo$onResume$6$1> continuation) {
        super(2, continuation);
        this.$supportedAccountForRecurring = bool;
        this.$recurringTradability = instrumentRecurringTradability;
        this.$isJointAccount = bool2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrderConfigurationSelectionDuxo$onResume$6$1 orderConfigurationSelectionDuxo$onResume$6$1 = new OrderConfigurationSelectionDuxo$onResume$6$1(this.$supportedAccountForRecurring, this.$recurringTradability, this.$isJointAccount, continuation);
        orderConfigurationSelectionDuxo$onResume$6$1.L$0 = obj;
        return orderConfigurationSelectionDuxo$onResume$6$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(OrderConfigurationSelectionDataState orderConfigurationSelectionDataState, Continuation<? super OrderConfigurationSelectionDataState> continuation) {
        return ((OrderConfigurationSelectionDuxo$onResume$6$1) create(orderConfigurationSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return OrderConfigurationSelectionDataState.copy$default((OrderConfigurationSelectionDataState) this.L$0, null, null, null, false, null, this.$supportedAccountForRecurring.booleanValue() && this.$recurringTradability.isRecurringTradable(), this.$recurringTradability.getReason(), this.$isJointAccount.booleanValue() && !this.$supportedAccountForRecurring.booleanValue(), null, null, null, null, null, false, false, false, false, null, false, false, 1048351, null);
    }
}

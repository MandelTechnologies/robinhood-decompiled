package com.robinhood.android.equityadvancedorder;

import com.robinhood.analytics.EventLogger;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1502}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderDuxo$showTaxLotsSelection$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<EquityAdvancedOrderViewState> stateFlow = this.this$0.getStateFlow();
            this.label = 1;
            obj = FlowKt.first(stateFlow, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        EventLogger.DefaultImpls.logTap$default(this.this$0.eventLogger, null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.ROW, "SELECT_LOTS", null, 4, null), null, ((EquityAdvancedOrderViewState) obj).getLoggingEquityOrderContext(), false, 41, null);
        return Unit.INSTANCE;
    }
}

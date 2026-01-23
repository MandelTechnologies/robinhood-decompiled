package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.utils.EquityOrderContexts;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.contracts.equity_order_context.proto.p487v1.StreamOrderContextResponse;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1497}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityAdvancedOrderDataState $dataState;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1(EquityAdvancedOrderDataState equityAdvancedOrderDataState, EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, Continuation<? super EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1> continuation) {
        super(2, continuation);
        this.$dataState = equityAdvancedOrderDataState;
        this.this$0 = equityAdvancedOrderDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1(this.$dataState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderDuxo$showTaxLotsSelection$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        StreamOrderContextResponse proto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EquityOrderContext equityOrderContext = this.$dataState.getEquityOrderContext();
            if (equityOrderContext != null && (proto = EquityOrderContexts.toProto(equityOrderContext, ((EquityAdvancedOrderFragment.Args) EquityAdvancedOrderDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getRefId())) != null) {
                EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = this.this$0;
                this.label = 1;
                if (equityAdvancedOrderDuxo.m1960xf1418bf5(proto, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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

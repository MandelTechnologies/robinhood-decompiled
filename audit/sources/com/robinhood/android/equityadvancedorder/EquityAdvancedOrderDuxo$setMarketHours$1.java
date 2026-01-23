package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.ILimit;
import com.robinhood.android.equityadvancedorder.datastate.LimitStandard;
import com.robinhood.android.equityadvancedorder.datastate.LimitTaxLots;
import com.robinhood.models.p320db.OrderMarketHours;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$setMarketHours$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$setMarketHours$1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
    final /* synthetic */ OrderMarketHours $orderMarketHours;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$setMarketHours$1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, OrderMarketHours orderMarketHours, Continuation<? super EquityAdvancedOrderDuxo$setMarketHours$1> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
        this.$orderMarketHours = orderMarketHours;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityAdvancedOrderDuxo$setMarketHours$1 equityAdvancedOrderDuxo$setMarketHours$1 = new EquityAdvancedOrderDuxo$setMarketHours$1(this.this$0, this.$orderMarketHours, continuation);
        equityAdvancedOrderDuxo$setMarketHours$1.L$0 = obj;
        return equityAdvancedOrderDuxo$setMarketHours$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
        return ((EquityAdvancedOrderDuxo$setMarketHours$1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
        if (!(equityAdvancedOrderDataState instanceof ILimit)) {
            return this.this$0.illegalMutation(equityAdvancedOrderDataState);
        }
        ILimit iLimit = (ILimit) equityAdvancedOrderDataState;
        OrderMarketHours orderMarketHours = this.$orderMarketHours;
        if (iLimit instanceof LimitStandard) {
            LimitStandard limitStandard = (LimitStandard) iLimit;
            return LimitStandard.copy$default(limitStandard, null, ILimit.LimitState.copy$default(limitStandard.getLimitState(), null, null, orderMarketHours, null, null, null, false, false, null, false, 1019, null), 1, null);
        }
        if (!(iLimit instanceof LimitTaxLots)) {
            throw new NoWhenBranchMatchedException();
        }
        LimitTaxLots limitTaxLots = (LimitTaxLots) iLimit;
        return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitTaxLots.getLimitStandard(), null, ILimit.LimitState.copy$default(limitTaxLots.getLimitState(), null, null, orderMarketHours, null, null, null, false, false, null, false, 1019, null), 1, null), null, 2, null);
    }
}

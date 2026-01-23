package com.robinhood.android.equityadvancedorder;

import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Ljava/math/BigDecimal;", "it", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderViewState, Continuation<? super BigDecimal>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1(Continuation<? super EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1 equityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1 = new EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1(continuation);
        equityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1.L$0 = obj;
        return equityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityAdvancedOrderViewState equityAdvancedOrderViewState, Continuation<? super BigDecimal> continuation) {
        return ((EquityAdvancedOrderDuxo$fetchStrategySummary$1$sharesFlow$1) create(equityAdvancedOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String numberOfSharesString = ((EquityAdvancedOrderViewState) this.L$0).getNumberOfSharesString();
        if (numberOfSharesString != null) {
            return BigDecimals7.toBigDecimalOrNull(numberOfSharesString);
        }
        return null;
    }
}

package com.robinhood.android.trade.equity.activity;

import com.robinhood.android.common.buysell.BuySellData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/common/buysell/BuySellData;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1$resolvedSide$buySellData$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$resolveEffectiveSide$1$resolvedSide$buySellData$1, reason: use source file name */
/* loaded from: classes9.dex */
final class EquityOrderActivityDuxo3 extends ContinuationImpl7 implements Function2<BuySellData, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;

    EquityOrderActivityDuxo3(Continuation<? super EquityOrderActivityDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderActivityDuxo3 equityOrderActivityDuxo3 = new EquityOrderActivityDuxo3(continuation);
        equityOrderActivityDuxo3.L$0 = obj;
        return equityOrderActivityDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BuySellData buySellData, Continuation<? super Boolean> continuation) {
        return ((EquityOrderActivityDuxo3) create(buySellData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BuySellData buySellData = (BuySellData) this.L$0;
        return boxing.boxBoolean(buySellData.getAccount() != null && buySellData.isLoaded());
    }
}

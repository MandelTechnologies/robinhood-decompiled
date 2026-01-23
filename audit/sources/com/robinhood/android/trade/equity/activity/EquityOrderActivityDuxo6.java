package com.robinhood.android.trade.equity.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityOrderActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/activity/EquityOrderActivityViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$2$1", m3645f = "EquityOrderActivityDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.equity.activity.EquityOrderActivityDuxo$startStores$2$1, reason: use source file name */
/* loaded from: classes9.dex */
final class EquityOrderActivityDuxo6 extends ContinuationImpl7 implements Function2<EquityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState>, Object> {
    final /* synthetic */ String $accountNumber;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityOrderActivityDuxo6(String str, Continuation<? super EquityOrderActivityDuxo6> continuation) {
        super(2, continuation);
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityOrderActivityDuxo6 equityOrderActivityDuxo6 = new EquityOrderActivityDuxo6(this.$accountNumber, continuation);
        equityOrderActivityDuxo6.L$0 = obj;
        return equityOrderActivityDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityOrderActivityViewState equityOrderActivityViewState, Continuation<? super EquityOrderActivityViewState> continuation) {
        return ((EquityOrderActivityDuxo6) create(equityOrderActivityViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityOrderActivityViewState equityOrderActivityViewState = (EquityOrderActivityViewState) this.L$0;
        return equityOrderActivityViewState.copy((32767 & 1) != 0 ? equityOrderActivityViewState.instrumentId : null, (32767 & 2) != 0 ? equityOrderActivityViewState.instrument : null, (32767 & 4) != 0 ? equityOrderActivityViewState.side : null, (32767 & 8) != 0 ? equityOrderActivityViewState.completionUrl : null, (32767 & 16) != 0 ? equityOrderActivityViewState.isPreIpo : null, (32767 & 32) != 0 ? equityOrderActivityViewState.isOtc : null, (32767 & 64) != 0 ? equityOrderActivityViewState.isTwentyFourHourMarketSession : false, (32767 & 128) != 0 ? equityOrderActivityViewState.individualAccountNumber : this.$accountNumber, (32767 & 256) != 0 ? equityOrderActivityViewState.providedAccountNumber : null, (32767 & 512) != 0 ? equityOrderActivityViewState.accountPosition : null, (32767 & 1024) != 0 ? equityOrderActivityViewState.tradingSession : null, (32767 & 2048) != 0 ? equityOrderActivityViewState.orderConfiguration : null, (32767 & 4096) != 0 ? equityOrderActivityViewState.equityOrderFlowSource : null, (32767 & 8192) != 0 ? equityOrderActivityViewState.defaultableOrderConfiguration : null, (32767 & 16384) != 0 ? equityOrderActivityViewState.isMarketBuysEnabled : false, (32767 & 32768) != 0 ? equityOrderActivityViewState.buyToCloseExperimentEnabled : false);
    }
}

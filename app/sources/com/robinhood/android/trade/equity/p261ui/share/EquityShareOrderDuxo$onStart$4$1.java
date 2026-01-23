package com.robinhood.android.trade.equity.p261ui.share;

import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: EquityShareOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/trade/equity/ui/share/EquityShareOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.equity.ui.share.EquityShareOrderDuxo$onStart$4$1", m3645f = "EquityShareOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class EquityShareOrderDuxo$onStart$4$1 extends ContinuationImpl7 implements Function2<EquityShareOrderDataState, Continuation<? super EquityShareOrderDataState>, Object> {
    final /* synthetic */ InstrumentAccountSwitcher $accountSwitcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityShareOrderDuxo$onStart$4$1(InstrumentAccountSwitcher instrumentAccountSwitcher, Continuation<? super EquityShareOrderDuxo$onStart$4$1> continuation) {
        super(2, continuation);
        this.$accountSwitcher = instrumentAccountSwitcher;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquityShareOrderDuxo$onStart$4$1 equityShareOrderDuxo$onStart$4$1 = new EquityShareOrderDuxo$onStart$4$1(this.$accountSwitcher, continuation);
        equityShareOrderDuxo$onStart$4$1.L$0 = obj;
        return equityShareOrderDuxo$onStart$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EquityShareOrderDataState equityShareOrderDataState, Continuation<? super EquityShareOrderDataState> continuation) {
        return ((EquityShareOrderDuxo$onStart$4$1) create(equityShareOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        EquityShareOrderDataState equityShareOrderDataState = (EquityShareOrderDataState) this.L$0;
        return equityShareOrderDataState.copy(((-8388617) & 1) != 0 ? equityShareOrderDataState.configuration : null, ((-8388617) & 2) != 0 ? equityShareOrderDataState.side : null, ((-8388617) & 4) != 0 ? equityShareOrderDataState.nbboSummary : null, ((-8388617) & 8) != 0 ? equityShareOrderDataState.sessionChangeAlertContent : null, ((-8388617) & 16) != 0 ? equityShareOrderDataState.instrumentAccountSwitcher : this.$accountSwitcher, ((-8388617) & 32) != 0 ? equityShareOrderDataState.allAccounts : null, ((-8388617) & 64) != 0 ? equityShareOrderDataState.loadingAccountSwitcher : false, ((-8388617) & 128) != 0 ? equityShareOrderDataState.account : null, ((-8388617) & 256) != 0 ? equityShareOrderDataState.instrument : null, ((-8388617) & 512) != 0 ? equityShareOrderDataState.quote : null, ((-8388617) & 1024) != 0 ? equityShareOrderDataState.position : null, ((-8388617) & 2048) != 0 ? equityShareOrderDataState.instrumentBuyingPower : null, ((-8388617) & 4096) != 0 ? equityShareOrderDataState.experiments : null, ((-8388617) & 8192) != 0 ? equityShareOrderDataState.isBackupWithheld : false, ((-8388617) & 16384) != 0 ? equityShareOrderDataState.backupWithholdingEstimateAmountResponse : null, ((-8388617) & 32768) != 0 ? equityShareOrderDataState.mlpExperimentMember : false, ((-8388617) & 65536) != 0 ? equityShareOrderDataState.withholdingStatus : null, ((-8388617) & 131072) != 0 ? equityShareOrderDataState.collateral : null, ((-8388617) & 262144) != 0 ? equityShareOrderDataState.marketHours : null, ((-8388617) & 524288) != 0 ? equityShareOrderDataState.nextEffectiveMarketHours : null, ((-8388617) & 1048576) != 0 ? equityShareOrderDataState.isAdtHours : null, ((-8388617) & 2097152) != 0 ? equityShareOrderDataState.staticInputs : null, ((-8388617) & 4194304) != 0 ? equityShareOrderDataState.equityOrderContext : null, ((-8388617) & 8388608) != 0 ? equityShareOrderDataState.validationState : null, ((-8388617) & 16777216) != 0 ? equityShareOrderDataState.estimatedFees : null, ((-8388617) & 33554432) != 0 ? equityShareOrderDataState.overrideToExecuteInMarketHoursOnly : false, ((-8388617) & 67108864) != 0 ? equityShareOrderDataState.checkOverrides : null, ((-8388617) & 134217728) != 0 ? equityShareOrderDataState.isCancelPendingCryptoOrdersLoading : false, ((-8388617) & 268435456) != 0 ? equityShareOrderDataState.loadingNbbo : false, ((-8388617) & 536870912) != 0 ? equityShareOrderDataState.overrideFlipIpoAccessShares : false, ((-8388617) & 1073741824) != 0 ? equityShareOrderDataState.isMarketBuysEnabled : null, ((-8388617) & Integer.MIN_VALUE) != 0 ? equityShareOrderDataState.silentActionsTaken : null, (16383 & 1) != 0 ? equityShareOrderDataState.microgramOrderSummary : null, (16383 & 2) != 0 ? equityShareOrderDataState.microgramState : null, (16383 & 4) != 0 ? equityShareOrderDataState.flowSource : null, (16383 & 8) != 0 ? equityShareOrderDataState.orderPendingReplacement : null, (16383 & 16) != 0 ? equityShareOrderDataState.taxLotsSelection : null, (16383 & 32) != 0 ? equityShareOrderDataState.taxLotSelectionType : null, (16383 & 64) != 0 ? equityShareOrderDataState.taxLotsEstCredit : null, (16383 & 128) != 0 ? equityShareOrderDataState.taxLotsGainLoss : null, (16383 & 256) != 0 ? equityShareOrderDataState.taxLotsM1ExperimentMember : false, (16383 & 512) != 0 ? equityShareOrderDataState.subzeroEnabled : false, (16383 & 1024) != 0 ? equityShareOrderDataState.shortingInfo : null, (16383 & 2048) != 0 ? equityShareOrderDataState.marginAccounts : null, (16383 & 4096) != 0 ? equityShareOrderDataState.resetTooltipKey : 0, (16383 & 8192) != 0 ? equityShareOrderDataState.useSduiAccountSwitcher : false);
    }
}

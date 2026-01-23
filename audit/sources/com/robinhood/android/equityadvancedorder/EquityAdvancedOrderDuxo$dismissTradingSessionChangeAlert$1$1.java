package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderFragment;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.LimitStandard;
import com.robinhood.android.equityadvancedorder.datastate.LimitTaxLots;
import com.robinhood.android.equityadvancedorder.datastate.MarketStandard;
import com.robinhood.android.equityadvancedorder.datastate.MarketTaxLots;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.android.trading.contracts.configuration.DirectOrder;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.EquityTradingSessionChangedStore;
import com.robinhood.models.p320db.EquityOrderSide;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {2114}, m3647m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityAdvancedOrderDataState $it;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
        this.$it = equityAdvancedOrderDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1(this.this$0, this.$it, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1 equityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1;
        Object objM22646determineCurrentSessionConfigurationyxL6bBk$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C151671(null));
            EquityTradingSessionChangedStore equityTradingSessionChangedStore = this.this$0.tradingSessionChangedStore;
            EquityAdvancedOrderDuxo.Companion companion = EquityAdvancedOrderDuxo.INSTANCE;
            UUID instrumentId = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getInstrumentId();
            EquityOrderSide side = ((EquityAdvancedOrderFragment.Args) companion.getArgs((HasSavedState) this.this$0)).getSide();
            AdvancedOrder workingConfiguration = this.$it.getWorkingConfiguration();
            this.label = 1;
            equityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1 = this;
            objM22646determineCurrentSessionConfigurationyxL6bBk$default = EquityTradingSessionChangedStore.m22646determineCurrentSessionConfigurationyxL6bBk$default(equityTradingSessionChangedStore, instrumentId, side, workingConfiguration, false, equityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1, 8, null);
            if (objM22646determineCurrentSessionConfigurationyxL6bBk$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM22646determineCurrentSessionConfigurationyxL6bBk$default = ((Result) obj).getValue();
            equityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1 = this;
        }
        EquityAdvancedOrderDuxo equityAdvancedOrderDuxo = equityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1.this$0;
        if (Result.m28553exceptionOrNullimpl(objM22646determineCurrentSessionConfigurationyxL6bBk$default) == null) {
            DirectOrder directOrder = (DirectOrder) objM22646determineCurrentSessionConfigurationyxL6bBk$default;
            if (directOrder instanceof AdvancedOrder) {
                equityAdvancedOrderDuxo.m1958xf90208f1(((AdvancedOrder) directOrder).getOrderConfiguration());
            } else if (directOrder != null) {
                equityAdvancedOrderDuxo.submit(new EquityOrderEvent.ChangeOrderConfiguration(directOrder));
            }
        } else {
            equityAdvancedOrderDuxo.submit(EquityOrderEvent.Exit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$dismissTradingSessionChangeAlert$1$1$1 */
    static final class C151671 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C151671(Continuation<? super C151671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C151671 c151671 = new C151671(continuation);
            c151671.L$0 = obj;
            return c151671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((C151671) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }
}

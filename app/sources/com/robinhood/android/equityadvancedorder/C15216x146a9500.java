package com.robinhood.android.equityadvancedorder;

import com.robinhood.android.equity.validation.EquityOrderContext;
import com.robinhood.android.equity.validation.event.EquityOrderEvent;
import com.robinhood.android.equityadvancedorder.datastate.EquityAdvancedOrderDataState;
import com.robinhood.android.equityadvancedorder.datastate.LimitStandard;
import com.robinhood.android.equityadvancedorder.datastate.LimitTaxLots;
import com.robinhood.android.equityadvancedorder.datastate.MarketStandard;
import com.robinhood.android.equityadvancedorder.datastate.MarketTaxLots;
import com.robinhood.android.equityadvancedorder.ordersummary.EquityOrderSummaryService2;
import com.robinhood.android.trading.contracts.configuration.AdvancedOrder;
import com.robinhood.models.p320db.DirectOrderRequestDraft;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p320db.TradingSession;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import equity_order_summary.proto.p459v1.EquityOrderSummaryService;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import rosetta.order.EquityOverrideDto;

/* compiled from: EquityAdvancedOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {1180}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1 */
/* loaded from: classes3.dex */
final class C15216x146a9500 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedOrder.Complete $configuration;
    final /* synthetic */ EquityOrderContext $context;
    final /* synthetic */ EquityAdvancedOrderDataState $state;
    int label;
    final /* synthetic */ EquityAdvancedOrderDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C15216x146a9500(EquityAdvancedOrderDuxo equityAdvancedOrderDuxo, EquityAdvancedOrderDataState equityAdvancedOrderDataState, AdvancedOrder.Complete complete, EquityOrderContext equityOrderContext, Continuation<? super C15216x146a9500> continuation) {
        super(2, continuation);
        this.this$0 = equityAdvancedOrderDuxo;
        this.$state = equityAdvancedOrderDataState;
        this.$configuration = complete;
        this.$context = equityOrderContext;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C15216x146a9500(this.this$0, this.$state, this.$configuration, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C15216x146a9500) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        C15216x146a9500 c15216x146a9500;
        AdvancedOrder.Complete completeValidated;
        EquityOrderContext equityOrderContext;
        List<String> checkOverrides;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            EquityOrderSummaryService idlOrderSummaryService = this.this$0.getIdlOrderSummaryService();
            EquityOrderContext equityOrderContext2 = this.$state.getEquityOrderContext();
            if (equityOrderContext2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            DirectOrderRequestDraft orderRequestDraft = equityOrderContext2.getOrderRequestDraft();
            TradingSession tradingSession = this.$state.getCommonState().getTradingSession();
            MarketHours currentMarketHours = tradingSession != null ? tradingSession.getCurrentMarketHours() : null;
            if (currentMarketHours != null) {
                this.label = 1;
                c15216x146a9500 = this;
                obj = EquityOrderSummaryService2.getOrderSummary$default(idlOrderSummaryService, orderRequestDraft, currentMarketHours, false, c15216x146a9500, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c15216x146a9500 = this;
        }
        String str = (String) obj;
        c15216x146a9500.this$0.applyMutation(new AnonymousClass1(str, null));
        AdvancedOrder.Complete complete = c15216x146a9500.$configuration;
        if (complete != null) {
            List<String> mutableList = CollectionsKt.toMutableList((Collection) complete.getCheckOverrides());
            String json_value = EquityOverrideDto.OVERRIDE_DAY_TRADE_CHECKS_SELL.getJson_value();
            if (json_value != null && (equityOrderContext = c15216x146a9500.$context) != null && (checkOverrides = equityOrderContext.getCheckOverrides()) != null && checkOverrides.contains(json_value) && !mutableList.contains(json_value)) {
                mutableList.add(json_value);
            }
            AdvancedOrder.Complete complete2 = c15216x146a9500.$configuration;
            if (complete2 instanceof AdvancedOrder.MarketComplete) {
                completeValidated = ((AdvancedOrder.MarketComplete) complete2).validated(mutableList, str);
            } else {
                if (!(complete2 instanceof AdvancedOrder.LimitComplete)) {
                    throw new NoWhenBranchMatchedException();
                }
                completeValidated = ((AdvancedOrder.LimitComplete) complete2).validated(mutableList, str);
            }
        } else {
            completeValidated = null;
        }
        if (c15216x146a9500.$state.getCommonState().getAdvancedOrderSubmissionExperimentMember()) {
            c15216x146a9500.this$0.applyMutation(new AnonymousClass2(null));
        } else if (completeValidated != null) {
            c15216x146a9500.this$0.submit(new EquityOrderEvent.Advanced.CompleteOrderEvent(completeValidated));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1$1", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        final /* synthetic */ String $summary;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$summary = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$summary, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((AnonymousClass1) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EquityAdvancedOrderDataState equityAdvancedOrderDataState = (EquityAdvancedOrderDataState) this.L$0;
            String str = this.$summary;
            if (equityAdvancedOrderDataState instanceof MarketStandard) {
                MarketStandard marketStandard = (MarketStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState = marketStandard.getCommonState();
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : commonState.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : str, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : null, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : commonState2.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : str, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : null, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : commonState3.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : str, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : null, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : commonState4.getEditingField(), (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : str, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : null, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }

    /* compiled from: EquityAdvancedOrderDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/equityadvancedorder/datastate/EquityAdvancedOrderDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1$2", m3645f = "EquityAdvancedOrderDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.EquityAdvancedOrderDuxo$validateAndReviewOrder$handleNoAlert$1$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<EquityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(EquityAdvancedOrderDataState equityAdvancedOrderDataState, Continuation<? super EquityAdvancedOrderDataState> continuation) {
            return ((AnonymousClass2) create(equityAdvancedOrderDataState, continuation)).invokeSuspend(Unit.INSTANCE);
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
                return marketStandard.copy(commonState.copy((Integer.MAX_VALUE & 1) != 0 ? commonState.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState.refId : null, (511 & 2) != 0 ? commonState.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState.orderFormState : OrderForm6.REVIEWING, (511 & 8) != 0 ? commonState.subzeroEnabled : false, (511 & 16) != 0 ? commonState.shortingInfo : null, (511 & 32) != 0 ? commonState.clock : null, (511 & 64) != 0 ? commonState.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState.experimentVariant : null));
            }
            if (equityAdvancedOrderDataState instanceof LimitStandard) {
                LimitStandard limitStandard = (LimitStandard) equityAdvancedOrderDataState;
                EquityAdvancedOrderDataState.CommonState commonState2 = limitStandard.getCommonState();
                return LimitStandard.copy$default(limitStandard, commonState2.copy((Integer.MAX_VALUE & 1) != 0 ? commonState2.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState2.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState2.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState2.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState2.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState2.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState2.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState2.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState2.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState2.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState2.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState2.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState2.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState2.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState2.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState2.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState2.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState2.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState2.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState2.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState2.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState2.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState2.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState2.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState2.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState2.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState2.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState2.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState2.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState2.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState2.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState2.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState2.refId : null, (511 & 2) != 0 ? commonState2.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState2.orderFormState : OrderForm6.REVIEWING, (511 & 8) != 0 ? commonState2.subzeroEnabled : false, (511 & 16) != 0 ? commonState2.shortingInfo : null, (511 & 32) != 0 ? commonState2.clock : null, (511 & 64) != 0 ? commonState2.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState2.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState2.experimentVariant : null), null, 2, null);
            }
            if (equityAdvancedOrderDataState instanceof MarketTaxLots) {
                MarketTaxLots marketTaxLots = (MarketTaxLots) equityAdvancedOrderDataState;
                MarketStandard marketStandard2 = marketTaxLots.getMarketStandard();
                EquityAdvancedOrderDataState.CommonState commonState3 = marketTaxLots.getCommonState();
                return MarketTaxLots.copy$default(marketTaxLots, marketStandard2.copy(commonState3.copy((Integer.MAX_VALUE & 1) != 0 ? commonState3.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState3.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState3.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState3.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState3.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState3.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState3.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState3.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState3.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState3.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState3.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState3.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState3.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState3.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState3.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState3.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState3.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState3.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState3.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState3.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState3.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState3.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState3.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState3.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState3.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState3.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState3.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState3.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState3.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState3.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState3.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState3.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState3.refId : null, (511 & 2) != 0 ? commonState3.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState3.orderFormState : OrderForm6.REVIEWING, (511 & 8) != 0 ? commonState3.subzeroEnabled : false, (511 & 16) != 0 ? commonState3.shortingInfo : null, (511 & 32) != 0 ? commonState3.clock : null, (511 & 64) != 0 ? commonState3.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState3.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState3.experimentVariant : null)), null, 2, null);
            }
            if (!(equityAdvancedOrderDataState instanceof LimitTaxLots)) {
                throw new NoWhenBranchMatchedException();
            }
            LimitTaxLots limitTaxLots = (LimitTaxLots) equityAdvancedOrderDataState;
            LimitStandard limitStandard2 = limitTaxLots.getLimitStandard();
            EquityAdvancedOrderDataState.CommonState commonState4 = limitTaxLots.getCommonState();
            return LimitTaxLots.copy$default(limitTaxLots, LimitStandard.copy$default(limitStandard2, commonState4.copy((Integer.MAX_VALUE & 1) != 0 ? commonState4.instrument : null, (Integer.MAX_VALUE & 2) != 0 ? commonState4.accountNumber : null, (Integer.MAX_VALUE & 4) != 0 ? commonState4.nbboSummary : null, (Integer.MAX_VALUE & 8) != 0 ? commonState4.editMode : null, (Integer.MAX_VALUE & 16) != 0 ? commonState4.isKeyboardVisible : false, (Integer.MAX_VALUE & 32) != 0 ? commonState4.editingField : null, (Integer.MAX_VALUE & 64) != 0 ? commonState4.numberOfSharesString : null, (Integer.MAX_VALUE & 128) != 0 ? commonState4.quote : null, (Integer.MAX_VALUE & 256) != 0 ? commonState4.position : null, (Integer.MAX_VALUE & 512) != 0 ? commonState4.side : null, (Integer.MAX_VALUE & 1024) != 0 ? commonState4.estimatedFees : null, (Integer.MAX_VALUE & 2048) != 0 ? commonState4.isBackupWithheld : false, (Integer.MAX_VALUE & 4096) != 0 ? commonState4.loadingAccountSwitcher : false, (Integer.MAX_VALUE & 8192) != 0 ? commonState4.accountSwitcher : null, (Integer.MAX_VALUE & 16384) != 0 ? commonState4.allAccounts : null, (Integer.MAX_VALUE & 32768) != 0 ? commonState4.instrumentBuyingPower : null, (Integer.MAX_VALUE & 65536) != 0 ? commonState4.validationState : null, (Integer.MAX_VALUE & 131072) != 0 ? commonState4.silentActionsTaken : null, (Integer.MAX_VALUE & 262144) != 0 ? commonState4.microgramOrderSummary : null, (Integer.MAX_VALUE & 524288) != 0 ? commonState4.overrideFlipIpoAccessShares : false, (Integer.MAX_VALUE & 1048576) != 0 ? commonState4.overrideToExecuteInMarketHoursOnly : false, (Integer.MAX_VALUE & 2097152) != 0 ? commonState4.checkOverrides : null, (Integer.MAX_VALUE & 4194304) != 0 ? commonState4.flowSource : null, (Integer.MAX_VALUE & 8388608) != 0 ? commonState4.tradingSession : null, (Integer.MAX_VALUE & 16777216) != 0 ? commonState4.nextMarketHours : null, (Integer.MAX_VALUE & 33554432) != 0 ? commonState4.sessionChangeAlertContent : null, (Integer.MAX_VALUE & 67108864) != 0 ? commonState4.showOvernightShortAlert : false, (Integer.MAX_VALUE & 134217728) != 0 ? commonState4.orderToReplaceId : null, (Integer.MAX_VALUE & 268435456) != 0 ? commonState4.orderPendingReplacement : null, (Integer.MAX_VALUE & 536870912) != 0 ? commonState4.advancedMarketOrdersEnabled : false, (Integer.MAX_VALUE & 1073741824) != 0 ? commonState4.marketBuysEnabled : false, (Integer.MAX_VALUE & Integer.MIN_VALUE) != 0 ? commonState4.onSwitchOrderConfiguration : null, (511 & 1) != 0 ? commonState4.refId : null, (511 & 2) != 0 ? commonState4.advancedOrderSubmissionExperimentMember : false, (511 & 4) != 0 ? commonState4.orderFormState : OrderForm6.REVIEWING, (511 & 8) != 0 ? commonState4.subzeroEnabled : false, (511 & 16) != 0 ? commonState4.shortingInfo : null, (511 & 32) != 0 ? commonState4.clock : null, (511 & 64) != 0 ? commonState4.accountsWithAccessToMargin : null, (511 & 128) != 0 ? commonState4.useSduiAccountSwitcher : false, (511 & 256) != 0 ? commonState4.experimentVariant : null), null, 2, null), null, 2, null);
        }
    }
}

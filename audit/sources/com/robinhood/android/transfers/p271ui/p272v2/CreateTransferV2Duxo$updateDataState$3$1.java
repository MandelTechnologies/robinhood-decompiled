package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
import com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$3$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {771}, m3647m = "invokeSuspend")
/* loaded from: classes9.dex */
final class CreateTransferV2Duxo$updateDataState$3$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CreateTransferV2DataState $state;
    int label;
    final /* synthetic */ CreateTransferV2Duxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTransferV2Duxo$updateDataState$3$1(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2Duxo$updateDataState$3$1> continuation) {
        super(2, continuation);
        this.this$0 = createTransferV2Duxo;
        this.$state = createTransferV2DataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTransferV2Duxo$updateDataState$3$1(this.this$0, this.$state, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTransferV2Duxo$updateDataState$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TransferDisclosureManagedService transferDisclosureManagedService = this.this$0.disclosureService;
            if (transferDisclosureManagedService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("disclosureService");
                transferDisclosureManagedService = null;
            }
            CreateTransferState microgramCreateTransferState = MicrogramConverters.toMicrogramCreateTransferState(this.$state);
            this.label = 1;
            if (transferDisclosureManagedService.updateDisclosure(microgramCreateTransferState, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.applyMutation(new C311881(null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$3$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$3$1$1 */
    static final class C311881 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311881(Continuation<? super C311881> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311881 c311881 = new C311881(continuation);
            c311881.L$0 = obj;
            return c311881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311881) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : true, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }
}

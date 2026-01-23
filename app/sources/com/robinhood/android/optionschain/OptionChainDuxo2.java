package com.robinhood.android.optionschain;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.contracts.InternalOptionChainFragmentKey;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.OptionChainCustomizationDiscoveryStore;
import com.robinhood.models.p355ui.IacAlertSheet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionChainDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.optionschain.OptionChainDuxo$onCreate$24$1", m3645f = "OptionChainDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$24$1, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionChainDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OptionChainDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionChainDuxo2(OptionChainDuxo optionChainDuxo, Continuation<? super OptionChainDuxo2> continuation) {
        super(2, continuation);
        this.this$0 = optionChainDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OptionChainDuxo2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OptionChainDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OptionChainCustomizationDiscoveryStore optionChainCustomizationDiscoveryStore = this.this$0.optionChainCustomizationDiscoveryStore;
            UUID optionChainId = ((InternalOptionChainFragmentKey) OptionChainDuxo.INSTANCE.getArgs((HasSavedState) this.this$0)).getOptionChainId();
            this.label = 1;
            obj = optionChainCustomizationDiscoveryStore.getIacAlertSheetForInvestingOptionChain(optionChainId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final IacAlertSheet iacAlertSheet = (IacAlertSheet) obj;
        this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainDuxo$onCreate$24$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return OptionChainDuxo2.invokeSuspend$lambda$0(iacAlertSheet, (OptionChainViewState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionChainViewState invokeSuspend$lambda$0(IacAlertSheet iacAlertSheet, OptionChainViewState optionChainViewState) {
        return optionChainViewState.copy(((-1) & 1) != 0 ? optionChainViewState.account : null, ((-1) & 2) != 0 ? optionChainViewState.chainScrollTarget : null, ((-1) & 4) != 0 ? optionChainViewState.currentPage : null, ((-1) & 8) != 0 ? optionChainViewState.currentOrNextMarketDates : null, ((-1) & 16) != 0 ? optionChainViewState.currentSelloutTime : null, ((-1) & 32) != 0 ? optionChainViewState.defaultPricingSettingOverride : null, ((-1) & 64) != 0 ? optionChainViewState.defaultPricingSettingServerValue : null, ((-1) & 128) != 0 ? optionChainViewState.equityInstrument : null, ((-1) & 256) != 0 ? optionChainViewState.existingPositionExpirationDateStates : null, ((-1) & 512) != 0 ? optionChainViewState.fridayTradingErrorEvent : null, ((-1) & 1024) != 0 ? optionChainViewState.hasMultipleAccounts : false, ((-1) & 2048) != 0 ? optionChainViewState.hasSeenSbsChain : false, ((-1) & 4096) != 0 ? optionChainViewState.hasSeenSbsChainBottomSheet : false, ((-1) & 8192) != 0 ? optionChainViewState.hasSeenTopTooltipBannerInThisSession : false, ((-1) & 16384) != 0 ? optionChainViewState.hasSeenChainSettings : false, ((-1) & 32768) != 0 ? optionChainViewState.hasSeenSbsNuxRevampChainSettings : false, ((-1) & 65536) != 0 ? optionChainViewState.iacAlertSheet : iacAlertSheet, ((-1) & 131072) != 0 ? optionChainViewState.inSideBySideNuxRevampExperiment : false, ((-1) & 262144) != 0 ? optionChainViewState.isDay : null, ((-1) & 524288) != 0 ? optionChainViewState.isOnboardingSearchSelectorVisible : false, ((-1) & 1048576) != 0 ? optionChainViewState.launchMode : null, ((-1) & 2097152) != 0 ? optionChainViewState.nuxSearchDismissed : false, ((-1) & 4194304) != 0 ? optionChainViewState.uiOptionChains : null, ((-1) & 8388608) != 0 ? optionChainViewState.optionInstrumentToRollQuote : null, ((-1) & 16777216) != 0 ? optionChainViewState.optionOrderFilter : null, ((-1) & 33554432) != 0 ? optionChainViewState.optionChainConfiguration : null, ((-1) & 67108864) != 0 ? optionChainViewState.rollingExpirationDateEvent : null, ((-1) & 134217728) != 0 ? optionChainViewState.selectedContractType : null, ((-1) & 268435456) != 0 ? optionChainViewState.selectedOrderSide : null, ((-1) & 536870912) != 0 ? optionChainViewState.optionStrategyBuilder : null, ((-1) & 1073741824) != 0 ? optionChainViewState.optionStrategyBuilderNuxStates : null, ((-1) & Integer.MIN_VALUE) != 0 ? optionChainViewState.optionChainSettingsPnlChartType : null, ((-4097) & 1) != 0 ? optionChainViewState.targetExpirationPageFromTargetLegsEvent : null, ((-4097) & 2) != 0 ? optionChainViewState.targetExpirationPageFromSbsChainEvent : null, ((-4097) & 4) != 0 ? optionChainViewState.targetStrikePriceEvent : null, ((-4097) & 8) != 0 ? optionChainViewState.scrollTargetEvent : null, ((-4097) & 16) != 0 ? optionChainViewState.selectedSentiment : null, ((-4097) & 32) != 0 ? optionChainViewState.tradeOnExpirationState : null, ((-4097) & 64) != 0 ? optionChainViewState.underlyingQuote : null, ((-4097) & 128) != 0 ? optionChainViewState.underlyingIndexValue : null, ((-4097) & 256) != 0 ? optionChainViewState.underlyingIndexCloseValue : null, ((-4097) & 512) != 0 ? optionChainViewState.upsellHookEvent : null, ((-4097) & 1024) != 0 ? optionChainViewState.buySelectedMetrics : null, ((-4097) & 2048) != 0 ? optionChainViewState.sellSelectedMetrics : null, ((-4097) & 4096) != 0 ? optionChainViewState.tooltip : null, ((-4097) & 8192) != 0 ? optionChainViewState.chainCustomizationErrorEvent : null, ((-4097) & 16384) != 0 ? optionChainViewState.shouldShowDiscoverZeroDteBottomSheetInCurrentSession : false, ((-4097) & 32768) != 0 ? optionChainViewState.showDiscoverZeroDteSnackbarEvent : null, ((-4097) & 65536) != 0 ? optionChainViewState.discoverZeroDteSnackbarState : null, ((-4097) & 131072) != 0 ? optionChainViewState.isEtfSupported : false, ((-4097) & 262144) != 0 ? optionChainViewState.shouldShowMultipleUnderlyingsTooltip : false, ((-4097) & 524288) != 0 ? optionChainViewState.shouldShowSettleOnOpenTooltip : false, ((-4097) & 1048576) != 0 ? optionChainViewState.shouldShowSwitchFocusedToSbsTooltipPref : false, ((-4097) & 2097152) != 0 ? optionChainViewState.simulatedReturnChartShown : false, ((-4097) & 4194304) != 0 ? optionChainViewState.simulatedReturnSwitchChartTooltipShown : false, ((-4097) & 8388608) != 0 ? optionChainViewState.defaultToNearestExpirationDateEvent : null, ((-4097) & 16777216) != 0 ? optionChainViewState.dismissSelloutSnackbarEvent : null, ((-4097) & 33554432) != 0 ? optionChainViewState.selloutSnackbarDismissedOrElapsed : false, ((-4097) & 67108864) != 0 ? optionChainViewState.isSelloutSnackbarDismissalExperimentEnabled : false, ((-4097) & 134217728) != 0 ? optionChainViewState.inSelloutImprovementExperiment : false, ((-4097) & 268435456) != 0 ? optionChainViewState.inSnackbarDismissalFollowUpExperiment : false, ((-4097) & 536870912) != 0 ? optionChainViewState.settingGreenDotRemainingBlinks : 0, ((-4097) & 1073741824) != 0 ? optionChainViewState.isIndexOptionsExtendedHoursEnabled : false, ((-4097) & Integer.MIN_VALUE) != 0 ? optionChainViewState.isMemberPdtRevampV1 : false);
    }
}

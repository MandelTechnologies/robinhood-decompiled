package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.TransferDataExtensions;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.lib.limits.GetLimitTriggered;
import com.robinhood.android.transfers.lib.validation.TransferValidationInput;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.IraTransferInfo5;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.Limits;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.TransferAccounts5;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.TransferDirectionV2s;
import com.robinhood.android.transfers.p271ui.p272v2.utils.GetUpdatedIraContributionWhenContinueToReview;
import com.robinhood.android.transfers.util.ToApiAccount;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CreateTransferV2DataState.kt */
@Metadata(m3635d1 = {"\u0000²\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0001\u001a\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0000\u001a\u000e\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0000\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a*\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a4\u0010\u0018\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0019*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0000\u001a \u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\r0\u001cH\u0002\u001a*\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019*\b\u0012\u0004\u0012\u00020\r0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0002\u001a*\u0010 \u001a\u0004\u0018\u00010\u0017*\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001aT\u0010L\u001a\u00020M*\u00020\u00012\b\u0010N\u001a\u0004\u0018\u00010\r2\b\u0010O\u001a\u0004\u0018\u00010\r2\u0006\u0010P\u001a\u00020Q2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010R\u001a\u0004\u0018\u00010S2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010W2\u0006\u0010X\u001a\u00020\u0007\u001a\f\u0010Y\u001a\u0004\u0018\u00010Z*\u00020\u0001\"\u0018\u0010\b\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010!\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\"\u0010\n\"\u0015\u0010#\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b$\u0010\n\"\u001b\u0010%\u001a\u00020&*\u00020\u00018F¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0015\u0010+\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b,\u0010\n\"\u001d\u0010-\u001a\u0004\u0018\u00010.*\u00020\u00018F¢\u0006\f\u0012\u0004\b/\u0010(\u001a\u0004\b0\u00101\"\u0015\u00102\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b2\u0010\n\"\u0015\u00103\u001a\u00020\u0007*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b3\u0010\n\"\u001a\u00104\u001a\u0004\u0018\u000105*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0017\u00108\u001a\u0004\u0018\u000109*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010<\u001a\u0004\u0018\u00010=*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b>\u0010?\"\u0017\u0010@\u001a\u0004\u0018\u00010A*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bB\u0010C\"\u0017\u0010D\u001a\u0004\u0018\u00010E*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bF\u0010G\"\u0017\u0010H\u001a\u0004\u0018\u00010I*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bJ\u0010K\"\u0018\u0010[\u001a\u00020\u0007*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010\n¨\u0006]"}, m3636d2 = {"mutateToEnterReviewMode", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "shouldLaunchIraDistributionWhenContinueToReview", "", "shouldDefaultFromAccountOnStart", "getShouldDefaultFromAccountOnStart", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Z", "isTransferAccountBelowLimits", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "externalAccountDefault", "primaryIndividualDefault", "nullOrOnlyEligibleAccount", "transferAccountDirection", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "preselect", "preselection", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "fromDefault", "", "getRothConversionValue", "Lkotlin/Pair;", "inRothConversionAdvisoryExperiment", "transferAccounts", "", "getSelfDirectedTraditionalIraToSelfDirectedRothIra", "getSelfDirectedTraditionalIraToAccountId", "toAccountId", "toDefault", "shouldResetFromAccountWhenReturningToEdit", "getShouldResetFromAccountWhenReturningToEdit", "shouldResetToAccountWhenReturningToEdit", "getShouldResetToAccountWhenReturningToEdit", "adjustedFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getAdjustedFrequency$annotations", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)V", "getAdjustedFrequency", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/models/api/bonfire/TransferFrequency;", "showFrequencyBottomSheetOnLaunch", "getShowFrequencyBottomSheetOnLaunch", "selectedAchTransferOptionOrDefault", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "getSelectedAchTransferOptionOrDefault$annotations", "getSelectedAchTransferOptionOrDefault", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/android/lib/transfers/AchTransferOption;", "isRfpEligibleTransfer", "isRtpEligibleTransfer", "transferProductTypeForLimitsCheck", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "getTransferProductTypeForLimitsCheck", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "iraDistributionFeesRequest", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionFeeRequest;", "getIraDistributionFeesRequest", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionFeeRequest;", "iraDistributionTaxWithholdingRequest", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;", "getIraDistributionTaxWithholdingRequest", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;", "iraDistributionData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "getIraDistributionData", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "iraTransferInfoState", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "getIraTransferInfoState", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "transferSummaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getTransferSummaryRequest", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "transferValidationInput", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "sessionId", "Ljava/util/UUID;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "areMarketsOpenExtended", "getRewardPillRequestData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "shouldValidateBeforeReview", "getShouldValidateBeforeReview", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DataStateKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2DataState2 {

    /* compiled from: CreateTransferV2DataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2DataStateKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TransferDirectionV2.values().length];
            try {
                iArr[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr2[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void getAdjustedFrequency$annotations(CreateTransferV2DataState createTransferV2DataState) {
    }

    public static /* synthetic */ void getSelectedAchTransferOptionOrDefault$annotations(CreateTransferV2DataState createTransferV2DataState) {
    }

    public static final CreateTransferV2DataState mutateToEnterReviewMode(CreateTransferV2DataState createTransferV2DataState, TransferConfiguration transferConfiguration, EventLogger eventLogger) {
        String newSelectedAccountId;
        String newSelectedAccountId2;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        if (createTransferV2DataState.getFromAccountId() == null || createTransferV2DataState.getToAccountId() == null) {
            String fromAccountId = createTransferV2DataState.getFromAccountId();
            if (fromAccountId == null) {
                fromAccountId = fromDefault(createTransferV2DataState, transferConfiguration.getFrom(), eventLogger, transferConfiguration);
            }
            String toAccountId = createTransferV2DataState.getToAccountId();
            String str = fromAccountId;
            newSelectedAccountId = toAccountId == null ? toDefault(createTransferV2DataState, transferConfiguration.getTo(), eventLogger, transferConfiguration) : toAccountId;
            newSelectedAccountId2 = str;
        } else {
            newSelectedAccountId2 = Limits.getNewSelectedAccountId(createTransferV2DataState, createTransferV2DataState.getFromAccountId());
            newSelectedAccountId = Limits.getNewSelectedAccountId(createTransferV2DataState, createTransferV2DataState.getToAccountId());
        }
        Tuples2<TransferAccount, TransferAccount> tuples2PartiallyNullInvalidAccountPairing = TransferAccounts5.partiallyNullInvalidAccountPairing(createTransferV2DataState.getDirection(), createTransferV2DataState.getTransferAccounts().get(newSelectedAccountId2), createTransferV2DataState.getTransferAccounts().get(newSelectedAccountId));
        TransferAccount transferAccountComponent1 = tuples2PartiallyNullInvalidAccountPairing.component1();
        TransferAccount transferAccountComponent2 = tuples2PartiallyNullInvalidAccountPairing.component2();
        return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : transferAccountComponent1 != null ? transferAccountComponent1.getAccountId() : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : transferAccountComponent2 != null ? transferAccountComponent2.getAccountId() : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : CreateTransferViewState.Mode.REVIEW, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : GetUpdatedIraContributionWhenContinueToReview.getUpdatedIraContributionWhenContinueToReview(createTransferV2DataState.getIraContribution(), createTransferV2DataState.getDirection(), transferConfiguration.getIraContributionType(), transferAccountComponent2, createTransferV2DataState.getSystemCalendarYear()), (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
    }

    public static final boolean shouldLaunchIraDistributionWhenContinueToReview(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccount;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        return (transferAccountFromTransferAccount == null || !transferAccountFromTransferAccount.isIra() || (transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState)) == null || transferAccount.isIra() || createTransferV2DataState.getIraDistribution() != null) ? false : true;
    }

    public static final boolean getShouldDefaultFromAccountOnStart(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return createTransferV2DataState.getFromAccountId() == null && createTransferV2DataState.getToAccountId() == null && TransferDirectionV2s.getShouldPreloadDefaults(createTransferV2DataState.getDirection());
    }

    public static final boolean isTransferAccountBelowLimits(CreateTransferV2DataState createTransferV2DataState, TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
        List<ApiLimitsHubResponse> allTransferLimitsForTransferAccount = Limits.getAllTransferLimitsForTransferAccount(createTransferV2DataState.getTransferLimits(), createTransferV2DataState.getDirection(), transferAccount);
        List<ApiLimitsHubResponse> list = allTransferLimitsForTransferAccount;
        boolean zIsEmpty = allTransferLimitsForTransferAccount.isEmpty();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            zIsEmpty = zIsEmpty || GetLimitTriggered.getLimitTriggered(createTransferV2DataState.getAmount(), (ApiLimitsHubResponse) it.next()) == null;
        }
        return zIsEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map] */
    public static final TransferAccount externalAccountDefault(CreateTransferV2DataState createTransferV2DataState) {
        boolean z;
        Object next;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getTransferLimits().isEmpty()) {
            return null;
        }
        Collection<TransferAccount> collectionValues = createTransferV2DataState.getTransferAccounts().values();
        ArrayList<TransferAccount> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            TransferAccount transferAccount = (TransferAccount) obj;
            if (transferAccount.isExternal() && TransferAccounts5.isEnabledForTransferDirection(transferAccount, createTransferV2DataState.getDirection())) {
                arrayList.add(obj);
            }
        }
        Map<String, Long> paymentMethodLastUsagesMap = createTransferV2DataState.getPaymentMethodLastUsagesMap();
        ?? linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Long>> it = paymentMethodLastUsagesMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Long> next2 = it.next();
            TransferAccount transferAccount2 = createTransferV2DataState.getTransferAccounts().get(next2.getKey());
            if (!((transferAccount2 == null || TransferAccounts5.isEnabledForTransferDirection(transferAccount2, createTransferV2DataState.getDirection())) ? false : true)) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!createTransferV2DataState.getPaymentMethodLastUsagesMap().containsKey(((TransferAccount) it2.next()).getAccountId())) {
                    break;
                }
            }
            z = false;
        }
        if (z) {
            linkedHashMap = MapsKt.toMutableMap(createTransferV2DataState.getPaymentMethodLastUsagesMap());
            for (TransferAccount transferAccount3 : arrayList) {
                if (TransferAccounts5.isEnabledForTransferDirection(transferAccount3, createTransferV2DataState.getDirection())) {
                    linkedHashMap.putIfAbsent(transferAccount3.getAccountId(), 0L);
                }
            }
        }
        Iterator it3 = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2DataStateKt$externalAccountDefault$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Long) ((Map.Entry) t2).getValue(), (Long) ((Map.Entry) t).getValue());
            }
        }).iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            TransferAccount transferAccount4 = createTransferV2DataState.getTransferAccounts().get((String) ((Map.Entry) next).getKey());
            if (transferAccount4 != null && transferAccount4.isExternal() && TransferAccounts5.isEnabledForTransferDirection(transferAccount4, createTransferV2DataState.getDirection()) && isTransferAccountBelowLimits(createTransferV2DataState, transferAccount4)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return createTransferV2DataState.getTransferAccounts().get((String) entry.getKey());
        }
        return null;
    }

    public static final TransferAccount primaryIndividualDefault(CreateTransferV2DataState createTransferV2DataState) {
        Object next;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Iterator<T> it = createTransferV2DataState.getTransferAccounts().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransferAccount transferAccount = (TransferAccount) next;
            if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS && Intrinsics.areEqual(transferAccount.isDefaultInternalAccount(), Boolean.TRUE)) {
                break;
            }
        }
        return (TransferAccount) next;
    }

    public static final TransferAccount nullOrOnlyEligibleAccount(CreateTransferV2DataState createTransferV2DataState, TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(transferAccountDirection, "transferAccountDirection");
        if (transferAccountDirection == TransferAccountDirection.SOURCE) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[createTransferV2DataState.getDirection().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Collection<TransferAccount> collectionValues = createTransferV2DataState.getTransferAccounts().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            TransferAccount transferAccount = (TransferAccount) obj;
            if (transferAccount.isExternal() == (createTransferV2DataState.getDirection() == TransferDirectionV2.WITHDRAW) && TransferAccounts5.isEnabledForTransferDirection(transferAccount, createTransferV2DataState.getDirection())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            arrayList = null;
        }
        TransferAccount transferAccount2 = arrayList != null ? (TransferAccount) CollectionsKt.firstOrNull((List) arrayList) : null;
        if (transferAccount2 == null || isTransferAccountBelowLimits(createTransferV2DataState, transferAccount2)) {
            return transferAccount2;
        }
        return null;
    }

    public static final TransferAccount preselect(CreateTransferV2DataState createTransferV2DataState, TransferConfiguration.TransferAccountSelection preselection) {
        Object next;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(preselection, "preselection");
        Iterator<T> it = createTransferV2DataState.getTransferAccounts().values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (TransferAccounts2.preselectionPredicate((TransferAccount) next, preselection)) {
                break;
            }
        }
        return (TransferAccount) next;
    }

    public static final String fromDefault(CreateTransferV2DataState createTransferV2DataState, TransferConfiguration.TransferAccountSelection transferAccountSelection, EventLogger eventLogger, TransferConfiguration transferConfiguration) {
        TransferAccount transferAccountExternalAccountDefault;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (transferAccountSelection != null) {
            TransferAccount transferAccountPreselect = preselect(createTransferV2DataState, transferAccountSelection);
            if (transferAccountPreselect != null) {
                return transferAccountPreselect.getAccountId();
            }
            return null;
        }
        Tuples2<String, String> rothConversionValue = transferConfiguration != null ? getRothConversionValue(transferConfiguration, createTransferV2DataState.getInRothConversionAdvisoryExperiment(), createTransferV2DataState.getTransferAccounts().values()) : null;
        if (rothConversionValue != null) {
            return rothConversionValue.getFirst();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[createTransferV2DataState.getDirection().ordinal()];
        if (i == 1) {
            transferAccountExternalAccountDefault = externalAccountDefault(createTransferV2DataState);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccountExternalAccountDefault = primaryIndividualDefault(createTransferV2DataState);
        }
        if (eventLogger != null) {
            Screen screen$feature_transfers_externalRelease = CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.FROM_ACCOUNT_DEFAULT;
            MAXTransferContext maxTransferContext = createTransferV2DataState.getMaxTransferContext();
            EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen$feature_transfers_externalRelease, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext.copy((377169 & 1) != 0 ? maxTransferContext.id : null, (377169 & 2) != 0 ? maxTransferContext.amount : null, (377169 & 4) != 0 ? maxTransferContext.source_account : transferAccountExternalAccountDefault != null ? Transfers.toProtobuf(transferAccountExternalAccountDefault) : null, (377169 & 8) != 0 ? maxTransferContext.sink_account : null, (377169 & 16) != 0 ? maxTransferContext.frequency : null, (377169 & 32) != 0 ? maxTransferContext.ira_contribution_data : null, (377169 & 64) != 0 ? maxTransferContext.entry_point : null, (377169 & 128) != 0 ? maxTransferContext.ira_distribution_data : null, (377169 & 256) != 0 ? maxTransferContext.session_id : null, (377169 & 512) != 0 ? maxTransferContext.ach_transfer_data : null, (377169 & 1024) != 0 ? maxTransferContext.deposit_suggestions : null, (377169 & 2048) != 0 ? maxTransferContext.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? maxTransferContext.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? maxTransferContext.currency_conversion_data : null, (377169 & 16384) != 0 ? maxTransferContext.locality : null, (377169 & 32768) != 0 ? maxTransferContext.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? maxTransferContext.transfer_v2_direction : null, (377169 & 131072) != 0 ? maxTransferContext.selected_pill_amount : null, (377169 & 262144) != 0 ? maxTransferContext.transfer_method : null, (377169 & 524288) != 0 ? maxTransferContext.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), 12, null);
        }
        if (transferAccountExternalAccountDefault != null) {
            return transferAccountExternalAccountDefault.getAccountId();
        }
        return null;
    }

    public static final Tuples2<String, String> getRothConversionValue(TransferConfiguration transferConfiguration, boolean z, Collection<TransferAccount> transferAccounts) {
        Intrinsics.checkNotNullParameter(transferConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        if (!(transferConfiguration instanceof TransferConfiguration.RothConversion) || !z) {
            return null;
        }
        TransferConfiguration.RothConversion rothConversion = (TransferConfiguration.RothConversion) transferConfiguration;
        if (rothConversion.getFromAccountId() == null && rothConversion.getToAccountId() == null) {
            return getSelfDirectedTraditionalIraToSelfDirectedRothIra(transferAccounts);
        }
        if (rothConversion.getFromAccountId() != null && rothConversion.getToAccountId() == null) {
            return Tuples4.m3642to(rothConversion.getFromAccountId(), null);
        }
        if (rothConversion.getFromAccountId() == null && rothConversion.getToAccountId() != null) {
            return getSelfDirectedTraditionalIraToAccountId(transferAccounts, rothConversion.getToAccountId());
        }
        return Tuples4.m3642to(rothConversion.getFromAccountId(), rothConversion.getToAccountId());
    }

    private static final Tuples2<String, String> getSelfDirectedTraditionalIraToSelfDirectedRothIra(Collection<TransferAccount> collection) {
        Object next;
        Object next2;
        Collection<TransferAccount> collection2 = collection;
        Iterator<T> it = collection2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransferAccount transferAccount = (TransferAccount) next;
            if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL && !transferAccount.isManaged()) {
                break;
            }
        }
        TransferAccount transferAccount2 = (TransferAccount) next;
        String accountId = transferAccount2 != null ? transferAccount2.getAccountId() : null;
        Iterator<T> it2 = collection2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            TransferAccount transferAccount3 = (TransferAccount) next2;
            if (transferAccount3.getType() == ApiTransferAccount.TransferAccountType.IRA_ROTH && !transferAccount3.isManaged()) {
                break;
            }
        }
        TransferAccount transferAccount4 = (TransferAccount) next2;
        String accountId2 = transferAccount4 != null ? transferAccount4.getAccountId() : null;
        if (accountId == null || accountId2 == null) {
            return null;
        }
        return Tuples4.m3642to(accountId, accountId2);
    }

    private static final Tuples2<String, String> getSelfDirectedTraditionalIraToAccountId(Collection<TransferAccount> collection, String str) {
        Object next;
        if (str != null) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                TransferAccount transferAccount = (TransferAccount) next;
                if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL && !transferAccount.isManaged()) {
                    break;
                }
            }
            TransferAccount transferAccount2 = (TransferAccount) next;
            String accountId = transferAccount2 != null ? transferAccount2.getAccountId() : null;
            if (accountId != null) {
                return Tuples4.m3642to(accountId, str);
            }
        }
        return null;
    }

    public static final String toDefault(CreateTransferV2DataState createTransferV2DataState, TransferConfiguration.TransferAccountSelection transferAccountSelection, EventLogger eventLogger, TransferConfiguration transferConfiguration) {
        TransferAccount transferAccountNullOrOnlyEligibleAccount;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Tuples2<String, String> rothConversionValue = transferConfiguration != null ? getRothConversionValue(transferConfiguration, createTransferV2DataState.getInRothConversionAdvisoryExperiment(), createTransferV2DataState.getTransferAccounts().values()) : null;
        if (rothConversionValue != null) {
            return rothConversionValue.getSecond();
        }
        if (transferAccountSelection == null || (transferAccountNullOrOnlyEligibleAccount = preselect(createTransferV2DataState, transferAccountSelection)) == null) {
            if (createTransferV2DataState.getDirection() == TransferDirectionV2.DEPOSIT && createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment()) {
                transferAccountNullOrOnlyEligibleAccount = primaryIndividualDefault(createTransferV2DataState);
            } else {
                transferAccountNullOrOnlyEligibleAccount = nullOrOnlyEligibleAccount(createTransferV2DataState, TransferAccountDirection.SINK);
            }
        }
        if (transferAccountNullOrOnlyEligibleAccount == null) {
            return null;
        }
        if (eventLogger != null) {
            Screen screen$feature_transfers_externalRelease = CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease();
            UserInteractionEventData.Action action = UserInteractionEventData.Action.TO_ACCOUNT_TYPE;
            MAXTransferContext maxTransferContext = createTransferV2DataState.getMaxTransferContext();
            EventLogger.DefaultImpls.logAppear$default(eventLogger, action, screen$feature_transfers_externalRelease, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, maxTransferContext.copy((377169 & 1) != 0 ? maxTransferContext.id : null, (377169 & 2) != 0 ? maxTransferContext.amount : null, (377169 & 4) != 0 ? maxTransferContext.source_account : null, (377169 & 8) != 0 ? maxTransferContext.sink_account : Transfers.toProtobuf(transferAccountNullOrOnlyEligibleAccount), (377169 & 16) != 0 ? maxTransferContext.frequency : null, (377169 & 32) != 0 ? maxTransferContext.ira_contribution_data : null, (377169 & 64) != 0 ? maxTransferContext.entry_point : null, (377169 & 128) != 0 ? maxTransferContext.ira_distribution_data : null, (377169 & 256) != 0 ? maxTransferContext.session_id : null, (377169 & 512) != 0 ? maxTransferContext.ach_transfer_data : null, (377169 & 1024) != 0 ? maxTransferContext.deposit_suggestions : null, (377169 & 2048) != 0 ? maxTransferContext.ira_roth_conversion_data : null, (377169 & 4096) != 0 ? maxTransferContext.transfer_limit_validation_error : null, (377169 & 8192) != 0 ? maxTransferContext.currency_conversion_data : null, (377169 & 16384) != 0 ? maxTransferContext.locality : null, (377169 & 32768) != 0 ? maxTransferContext.entry_point_logging_identifier : null, (377169 & 65536) != 0 ? maxTransferContext.transfer_v2_direction : null, (377169 & 131072) != 0 ? maxTransferContext.selected_pill_amount : null, (377169 & 262144) != 0 ? maxTransferContext.transfer_method : null, (377169 & 524288) != 0 ? maxTransferContext.unknownFields() : null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), 12, null);
        }
        return transferAccountNullOrOnlyEligibleAccount.getAccountId();
    }

    public static final boolean getShouldResetFromAccountWhenReturningToEdit(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccountFromTransferAccount;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return (createTransferV2DataState.isFromAccountFixed() || (transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState)) == null || !transferAccountFromTransferAccount.isExternal()) ? false : true;
    }

    public static final boolean getShouldResetToAccountWhenReturningToEdit(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return (createTransferV2DataState.isToAccountFixed() || createTransferV2DataState.getDirection() == TransferDirectionV2.DEPOSIT) ? false : true;
    }

    public static final ApiCreateTransferRequest2 getAdjustedFrequency(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getDirection() == TransferDirectionV2.DEPOSIT && createTransferV2DataState.getFrequency() != ApiCreateTransferRequest2.ONCE && TransferDataExtensions.isEligibleForRecurringDeposit(CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState), CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState), createTransferV2DataState.getIraContribution(), createTransferV2DataState.getSystemCalendarYear()) && getSelectedAchTransferOptionOrDefault(createTransferV2DataState) != AchTransferOption.INSTANT) {
            return createTransferV2DataState.getFrequency();
        }
        return ApiCreateTransferRequest2.ONCE;
    }

    public static final boolean getShowFrequencyBottomSheetOnLaunch(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return createTransferV2DataState.getShouldShowFrequencyBottomSheetOnLaunch() && createTransferV2DataState.getDirection() == TransferDirectionV2.DEPOSIT && !createTransferV2DataState.getStopShowingFrequencyBottomSheetOnLaunch();
    }

    public static final AchTransferOption getSelectedAchTransferOptionOrDefault(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (isRfpEligibleTransfer(createTransferV2DataState)) {
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = createTransferV2DataState.getAdditionalDataState();
            if ((additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.Loading) || (additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ValidationCheck)) {
                return null;
            }
            if (additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.None) {
                return AchTransferOption.STANDARD;
            }
            if (additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded) {
                if (((CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded) createTransferV2DataState.getAdditionalDataState()).isEligible() && createTransferV2DataState.getFrequency() == ApiCreateTransferRequest2.ONCE) {
                    AchTransferOption selectedAchTransferOption = createTransferV2DataState.getSelectedAchTransferOption();
                    return selectedAchTransferOption == null ? AchTransferOption.STANDARD : selectedAchTransferOption;
                }
                return AchTransferOption.STANDARD;
            }
            if (additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) {
                throw new IllegalStateException("This state is only available for RTP!");
            }
            throw new NoWhenBranchMatchedException();
        }
        if (isRtpEligibleTransfer(createTransferV2DataState)) {
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState2 = createTransferV2DataState.getAdditionalDataState();
            if ((additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.Loading) || (additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ValidationCheck) || (additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.None)) {
                return null;
            }
            if (additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) {
                return createTransferV2DataState.getSelectedAchTransferOption();
            }
            if (additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded) {
                throw new IllegalStateException("This state is only available for RFP!");
            }
            throw new NoWhenBranchMatchedException();
        }
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        ApiTransferAccount.TransferAccountType type2 = transferAccountFromTransferAccount != null ? transferAccountFromTransferAccount.getType() : null;
        ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.ACH;
        if (type2 != transferAccountType) {
            TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
            if ((transferAccount != null ? transferAccount.getType() : null) != transferAccountType) {
                return null;
            }
        }
        return AchTransferOption.STANDARD;
    }

    public static final boolean isRfpEligibleTransfer(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccount;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        return transferAccountFromTransferAccount != null && TransferAccounts2.isRfpEligible(transferAccountFromTransferAccount) && (transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState)) != null && TransferAccounts2.isRfpEligibleSink(transferAccount);
    }

    public static final boolean isRtpEligibleTransfer(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccount;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        return transferAccountFromTransferAccount != null && TransferAccounts2.isRtpEligibleSource(transferAccountFromTransferAccount) && (transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState)) != null && TransferAccounts2.isRtpEligible(transferAccount);
    }

    public static final TransferProductType getTransferProductTypeForLimitsCheck(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount == null || transferAccount == null || transferAccountFromTransferAccount.getType().isIra() || transferAccount.getType().isIra() || getAdjustedFrequency(createTransferV2DataState) != ApiCreateTransferRequest2.ONCE) {
            return null;
        }
        if ((TransferAccounts2.isRfpEligible(transferAccountFromTransferAccount) && TransferAccounts2.isRfpEligibleSink(transferAccount)) || (TransferAccounts2.isRtpEligibleSource(transferAccountFromTransferAccount) && TransferAccounts2.isRtpEligible(transferAccount))) {
            return null;
        }
        if (!transferAccountFromTransferAccount.isExternal() && !transferAccount.isExternal()) {
            return TransferProductType.INTER_ENTITY;
        }
        if (!transferAccountFromTransferAccount.isExternal()) {
            transferAccountFromTransferAccount = transferAccount;
        }
        ApiTransferAccount.TransferAccountType type2 = transferAccountFromTransferAccount.getType();
        int i = WhenMappings.$EnumSwitchMapping$1[type2.ordinal()];
        if (i == 1) {
            return TransferProductType.ORIGINATED_ACH;
        }
        if (i == 2) {
            return TransferProductType.DEBIT_CARD_FUNDING;
        }
        throw new IllegalStateException(("Unsupported externalAccountType: " + type2).toString());
    }

    public static final CreateTransferViewState.IraDistributionFeeRequest getIraDistributionFeesRequest(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getIraDistribution() == null) {
            return null;
        }
        return new CreateTransferViewState.IraDistributionFeeRequest(createTransferV2DataState.getAmount());
    }

    public static final CreateTransferViewState.IraDistributionTaxWithholdingRequest getIraDistributionTaxWithholdingRequest(CreateTransferV2DataState createTransferV2DataState) {
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution;
        IraDistributionType distributionType;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount == null || !transferAccountFromTransferAccount.isIra() || (iraDistribution = createTransferV2DataState.getIraDistribution()) == null || (distributionType = iraDistribution.getDistributionType()) == null) {
            return null;
        }
        return new CreateTransferViewState.IraDistributionTaxWithholdingRequest(createTransferV2DataState.getAmount(), transferAccountFromTransferAccount, distributionType, createTransferV2DataState.getIraStateWithholdingPercentOverride(), createTransferV2DataState.getIraFederalWithholdingPercentOverride());
    }

    public static final ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData getIraDistributionData(CreateTransferV2DataState createTransferV2DataState) {
        ApiIraDistributionTaxWithholding calculatedTaxWithholding;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getIraDistribution() == null) {
            return null;
        }
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
        if (success == null || (calculatedTaxWithholding = success.getCalculatedTaxWithholding()) == null) {
            return null;
        }
        return new ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData(createTransferV2DataState.getIraDistribution().getDistributionType(), calculatedTaxWithholding.getState_withholding_percent(), calculatedTaxWithholding.getFederal_withholding_percent(), calculatedTaxWithholding.getState());
    }

    public static final IraTransferInfo5 getIraTransferInfoState(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getIraContribution() != null) {
            return new IraTransferInfo5.Contribution(createTransferV2DataState.getIraContribution(), getAdjustedFrequency(createTransferV2DataState) != ApiCreateTransferRequest2.ONCE);
        }
        if (createTransferV2DataState.getIraDistribution() != null) {
            return new IraTransferInfo5.Distribution(createTransferV2DataState.getIraDistribution(), null);
        }
        return null;
    }

    public static final ApiTransferSummaryRequest getTransferSummaryRequest(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getMode() != CreateTransferViewState.Mode.EDIT) {
            return null;
        }
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState);
        ApiTransferSummaryRequest.Account account = transferAccountFromTransferAccount != null ? new ApiTransferSummaryRequest.Account(transferAccountFromTransferAccount.getAccountId(), transferAccountFromTransferAccount.getType(), null, 4, null) : null;
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState);
        return new ApiTransferSummaryRequest(account, transferAccount != null ? new ApiTransferSummaryRequest.Account(transferAccount.getAccountId(), transferAccount.getType(), null, 4, null) : null, Integer.valueOf(createTransferV2DataState.getEntryPoint().getValue()), getAdjustedFrequency(createTransferV2DataState), createTransferV2DataState.getDirection(), createTransferV2DataState.getAmount(), new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(createTransferV2DataState.getPromotionName(), createTransferV2DataState.getPromotionType()));
    }

    public static final TransferValidationInput transferValidationInput(CreateTransferV2DataState createTransferV2DataState, TransferAccount transferAccount, TransferAccount transferAccount2, UUID sessionId, TransferConfiguration transferConfiguration, UnifiedBalances unifiedBalances, Portfolio portfolio, IraContributionQuestionnaireResult.IraContribution iraContribution, boolean z) {
        CreateTransferLimitsState limitsRetrieved;
        ApiIraDistributionTaxWithholding calculatedTaxWithholding;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        MAXTransferContext.EntryPoint entryPoint = transferConfiguration.getEntryPoint();
        String entryPointLoggingIdentifier = transferConfiguration.getEntryPointLoggingIdentifier();
        if (entryPointLoggingIdentifier == null) {
            entryPointLoggingIdentifier = "";
        }
        String str = entryPointLoggingIdentifier;
        TransferDirectionV2 direction = createTransferV2DataState.getDirection();
        BigDecimal amount = createTransferV2DataState.getAmount();
        ApiLimitsHubResponse limitHubResponseForTransfer = Limits.getLimitHubResponseForTransfer(createTransferV2DataState.getTransferLimits(), createTransferV2DataState.getDirection(), getTransferProductTypeForLimitsCheck(createTransferV2DataState));
        if (limitHubResponseForTransfer != null) {
            limitsRetrieved = new CreateTransferLimitsState.LimitsRetrieved(limitHubResponseForTransfer);
        } else {
            limitsRetrieved = CreateTransferLimitsState.None.INSTANCE;
        }
        CreateTransferLimitsState createTransferLimitsState = limitsRetrieved;
        List list = CollectionsKt.toList(createTransferV2DataState.getTransferLimits().values());
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution = createTransferV2DataState.getIraDistribution();
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
        ApiIraDistributionTaxWithholding.DistributionAlert pre_review_alert = null;
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
        if (success != null && (calculatedTaxWithholding = success.getCalculatedTaxWithholding()) != null) {
            pre_review_alert = calculatedTaxWithholding.getPre_review_alert();
        }
        return new TransferValidationInput(sessionId, entryPoint, str, amount, transferAccount, transferAccount2, transferConfiguration, portfolio, unifiedBalances, z, createTransferLimitsState, iraContribution, iraDistribution, pre_review_alert, createTransferV2DataState.getIraDistributionFee(), createTransferV2DataState.getOverrideNoEnokiAlert(), createTransferV2DataState.getOverrideDistributionPreReviewAlert(), createTransferV2DataState.getOverrideDistributionEnokiRemovalAlert(), true, createTransferV2DataState.getOverrideGoldApyBoostMinDepositCheck(), list, null, direction, createTransferV2DataState.isLimitWireUpsellEnabled(), createTransferV2DataState.isMemberPdtRevampV1(), 2097152, null);
    }

    public static final ApiCreateTransferRequest getRewardPillRequestData(CreateTransferV2DataState createTransferV2DataState) {
        ApiCreateTransferRequest.ApiTransferAccount apiAccount;
        ApiCreateTransferRequest.ApiTransferAccount apiAccount2;
        ApiCreateTransferRequest2 adjustedFrequency;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getDirection() != TransferDirectionV2.DEPOSIT) {
            return null;
        }
        String fromAccountId = createTransferV2DataState.getFromAccountId();
        if (fromAccountId == null) {
            fromAccountId = fromDefault(createTransferV2DataState, null, null, null);
        }
        TransferAccount transferAccount = createTransferV2DataState.getTransferAccounts().get(fromAccountId);
        if (transferAccount != null && (apiAccount = ToApiAccount.toApiAccount(transferAccount)) != null) {
            String toAccountId = createTransferV2DataState.getToAccountId();
            if (toAccountId == null) {
                toAccountId = toDefault(createTransferV2DataState, null, null, null);
            }
            TransferAccount transferAccount2 = createTransferV2DataState.getTransferAccounts().get(toAccountId);
            if (transferAccount2 != null && (apiAccount2 = ToApiAccount.toApiAccount(transferAccount2)) != null) {
                UUID uuidFromString = UUID.fromString("00000000-0000-0000-0000-000000000000");
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                BigDecimal amount = createTransferV2DataState.getAmount();
                if (TransferDataExtensions.isEligibleForRecurringDeposit(CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataState), CreateTransferV2StateProvider2.toTransferAccount(createTransferV2DataState), createTransferV2DataState.getIraContribution(), createTransferV2DataState.getSystemCalendarYear())) {
                    adjustedFrequency = getAdjustedFrequency(createTransferV2DataState);
                } else {
                    adjustedFrequency = ApiCreateTransferRequest2.ONCE;
                }
                return new ApiCreateTransferRequest(uuidFromString, amount, apiAccount, apiAccount2, adjustedFrequency, null, new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, createTransferV2DataState.getEntryPoint(), null, null, null, null, null, null, new ApiCreateTransferRequest.ApiTransferAdditionalData.ApiIncentivesTransferData(createTransferV2DataState.getPromotionName(), createTransferV2DataState.getPromotionType()), DocUploadParentFragment.V2_TAG, false, null, null, 59375, null), null, null, null, null, false, null, 8096, null);
            }
        }
        return null;
    }

    public static final boolean getShouldValidateBeforeReview(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return createTransferV2DataState.isLimitWireUpsellEnabled();
    }
}

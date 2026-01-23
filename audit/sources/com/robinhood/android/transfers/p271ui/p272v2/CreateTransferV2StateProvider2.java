package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.TransferDataExtensions;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.lib.utils.BigDecimals2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.lib.Frequency3;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.IraTransferInfo5;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataRowState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2InstantBankTransferSelectorViewState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ViewState;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionStateProvider;
import com.robinhood.android.transfers.util.IsEligibleForDepositSuggesstionPills;
import com.robinhood.android.transfers.util.TransferAccounts6;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiCountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.LimitsInterval;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
import p479j$.time.Year;

/* compiled from: CreateTransferV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0000\u001a\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u0002H\u0000\u001a\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u000fH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0002H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u001a\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\bH\u0000\u001a0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0017*\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\bH\u0000\u001a\u001e\u0010\"\u001a\u00020#*\u00020\u00022\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u000e\u0010'\u001a\u0004\u0018\u00010(*\u00020\u0002H\u0000\u001a\u0014\u0010)\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\bH\u0000\u001a\f\u0010*\u001a\u00020\b*\u00020\u0002H\u0000\u001a\f\u0010+\u001a\u00020\b*\u00020\u0002H\u0000\u001a\f\u0010\u0018\u001a\u00020\b*\u00020\u0002H\u0000\u001a\u001c\u0010,\u001a\u00020\b*\u00020\u00022\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0017H\u0000\u001a\f\u0010/\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a(\u00102\u001a\u0004\u0018\u00010\u0006*\u00020\u00022\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u000205\u0012\u0006\u0012\u0004\u0018\u00010604j\u0002`7H\u0002\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\"\u0018\u0010\u001d\u001a\u00020\u001e*\u00020\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\t\"\u001d\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0017*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u000e\u00108\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00109\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010?\u001a\u00020\u001eX\u0080T¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"finalTransferAmount", "Ljava/math/BigDecimal;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "amountInfoTagState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState$InfoTagState;", "amountFooterText", "Lcom/robinhood/utils/resource/StringResource;", "isIraDistributionTaxWithholdingUpToDate", "", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Z", "configuredTransferType", "Lcom/robinhood/transfers/api/TransferType;", "dropdownChipViewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DropdownChipViewState;", "dropdownChipText", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "fromTransferAccount", "toTransferAccount", "getAccountDataRow", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState;", "transferAccountDirection", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "getReviewRows", "", "isContinueButtonLoading", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "fromAccount", "toAccount", "isRecurring", "adjustedDisplayTitle", "", "getAdjustedDisplayTitle", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Ljava/lang/String;", "isRtpInstantTransferSelectorVisible", "getInstantBankTransferSelectorOptionState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState$Option$State;", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "limitReason", "getInstantTransferSelectorViewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;", "isInstantTransfersButtonEnabled", "isInstantTransfersButtonVisible", "isContinueButtonEnabled", "isContinueButtonVisible", "quickSelectorChips", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "continueButtonCopy", "getQuickSelectorChips", "(Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;)Ljava/util/List;", "getLimitReason", "key", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/TransferProductType;", "Lcom/robinhood/models/db/TransferDirection;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsKey;", "FromAccountRowTag", "ToAccountRowTag", "FrequencyRowTag", "IraContributionTypeRowTag", "IraContributionTaxYearRowTag", "IraDistributionWithholdingRowTag", "IraDistributionWithdrawalReasonRowTag", "TransferFeeRowTag", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2StateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CreateTransferV2StateProvider2 {
    public static final String FrequencyRowTag = "Frequency";
    public static final String FromAccountRowTag = "FromAccount";
    public static final String IraContributionTaxYearRowTag = "IraContributionTaxYear";
    public static final String IraContributionTypeRowTag = "IraContributionType";
    public static final String IraDistributionWithdrawalReasonRowTag = "IraDistributionWithdrawalReason";
    public static final String IraDistributionWithholdingRowTag = "IraDistributionWithholding";
    public static final String ToAccountRowTag = "ToAccount";
    public static final String TransferFeeRowTag = "TransferFeeRow";

    /* compiled from: CreateTransferV2StateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2StateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[TransferAccountDirection.values().length];
            try {
                iArr[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CreateTransferViewState.Mode.values().length];
            try {
                iArr2[CreateTransferViewState.Mode.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CreateTransferViewState.Mode.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferDirectionV2.values().length];
            try {
                iArr3[TransferDirectionV2.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[TransferDirectionV2.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TransferDirectionV2.INTER_ENTITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TransferDirection.values().length];
            try {
                iArr4[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final boolean isInstantTransfersButtonEnabled(CreateTransferV2DataState createTransferV2DataState, boolean z) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return !z;
    }

    public static final BigDecimal finalTransferAmount(CreateTransferV2DataState createTransferV2DataState) {
        ApiServiceFeeResponse serviceFeeResponse;
        ApiTransferAccount.TransferAccountType type2;
        TransferAccount transferAccount;
        ApiIraDistributionTaxWithholding calculatedTaxWithholding;
        ApiTransferAccount.TransferAccountType type3;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccount2 = toTransferAccount(createTransferV2DataState);
        if ((transferAccount2 != null ? transferAccount2.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD || (CreateTransferV2DataState2.isRtpEligibleTransfer(createTransferV2DataState) && CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == AchTransferOption.INSTANT)) {
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = createTransferV2DataState.getAdditionalDataState();
            CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded serviceFeesLoaded = additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded ? (CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) additionalDataState : null;
            if (serviceFeesLoaded == null || (serviceFeeResponse = serviceFeesLoaded.getServiceFeeResponse()) == null) {
                return null;
            }
            return serviceFeeResponse.getNet_amount();
        }
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount != null && (type2 = transferAccountFromTransferAccount.getType()) != null && type2.isIra() && ((transferAccount = toTransferAccount(createTransferV2DataState)) == null || (type3 = transferAccount.getType()) == null || !type3.isIra())) {
            CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
            CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
            if (success == null || (calculatedTaxWithholding = success.getCalculatedTaxWithholding()) == null) {
                return null;
            }
            return calculatedTaxWithholding.getAmount_received();
        }
        return createTransferV2DataState.getAmount();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CreateTransferV2ViewState.InfoTagState amountInfoTagState(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccount;
        boolean z;
        String matchRateBadgeForContributionType;
        ManagementInfo managementInfo;
        ManagementInfo managementInfo2;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getMode() == CreateTransferViewState.Mode.EDIT || (transferAccount = toTransferAccount(createTransferV2DataState)) == null || !transferAccount.isIra() || createTransferV2DataState.getMakingRothConversion()) {
            return null;
        }
        IraContributionQuestionnaireResult.IraContribution iraContribution = createTransferV2DataState.getIraContribution();
        IraContributionType iraContributionType = iraContribution != null ? iraContribution.getIraContributionType() : null;
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        ManagementType management_type = (transferAccountFromTransferAccount == null || (managementInfo2 = transferAccountFromTransferAccount.getManagementInfo()) == null) ? null : managementInfo2.getManagement_type();
        ManagementType managementType = ManagementType.MANAGED;
        if (management_type != managementType) {
            TransferAccount transferAccount2 = toTransferAccount(createTransferV2DataState);
            if (((transferAccount2 == null || (managementInfo = transferAccount2.getManagementInfo()) == null) ? null : managementInfo.getManagement_type()) != managementType) {
                z = false;
            }
            if (iraContributionType == null) {
            }
            TransferAccount transferAccountFromTransferAccount2 = fromTransferAccount(createTransferV2DataState);
            if (transferAccountFromTransferAccount2 == null) {
                matchRateBadgeForContributionType = TransferAccounts6.getMatchRateBadgeForContributionType(transferAccount, iraContributionType, transferAccountFromTransferAccount2 == null && !transferAccountFromTransferAccount2.isExternal(), null, z);
                if (matchRateBadgeForContributionType != null) {
                }
            }
        } else {
            z = true;
            if (iraContributionType == null) {
                iraContributionType = IraContributionType.ONE_TIME_CONTRIBUTION;
            }
            TransferAccount transferAccountFromTransferAccount22 = fromTransferAccount(createTransferV2DataState);
            matchRateBadgeForContributionType = TransferAccounts6.getMatchRateBadgeForContributionType(transferAccount, iraContributionType, transferAccountFromTransferAccount22 == null && !transferAccountFromTransferAccount22.isExternal(), null, z);
            if (matchRateBadgeForContributionType != null) {
                return new CreateTransferV2ViewState.InfoTagState(matchRateBadgeForContributionType, ServerToBentoAssetMapper2.RETIREMENT_16);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StringResource amountFooterText(CreateTransferV2DataState createTransferV2DataState) {
        TransferAccount transferAccountFromTransferAccount;
        ApiTransferAccount.TransferAccountType type2;
        TransferAccount transferAccountFromTransferAccount2;
        Object objInvoke;
        int i;
        ManagementInfo managementInfo;
        ApiIraDistributionTaxWithholding calculatedTaxWithholding;
        BigDecimal amount_received;
        Money money;
        ApiTransferAccount.TransferAccountType type3;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        ManagementType management_type = null;
        if (createTransferV2DataState.getMode() == CreateTransferViewState.Mode.EDIT || (transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState)) == null || (type2 = transferAccountFromTransferAccount.getType()) == null || !type2.isIra() || ((transferAccountFromTransferAccount2 = fromTransferAccount(createTransferV2DataState)) != null && (type3 = transferAccountFromTransferAccount2.getType()) != null && type3.isIra() && toTransferAccount(createTransferV2DataState) == null)) {
            return null;
        }
        if (isIraDistributionTaxWithholdingUpToDate(createTransferV2DataState) && BigDecimals7.isPositive(createTransferV2DataState.getAmount())) {
            CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
            CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
            if (success != null && (calculatedTaxWithholding = success.getCalculatedTaxWithholding()) != null && (amount_received = calculatedTaxWithholding.getAmount_received()) != null && (money = Money3.toMoney(amount_received, Currencies.USD)) != null) {
                objInvoke = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
        } else {
            objInvoke = null;
        }
        if (createTransferV2DataState.getMakingRothConversion()) {
            return null;
        }
        TransferAccount transferAccountFromTransferAccount3 = fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount3 != null && (managementInfo = transferAccountFromTransferAccount3.getManagementInfo()) != null) {
            management_type = managementInfo.getManagement_type();
        }
        if (management_type == ManagementType.MANAGED) {
            i = C30065R.string.transfer_ira_distribution_after_withholding_est;
        } else {
            i = C30065R.string.transfer_ira_distribution_after_withholding;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (objInvoke == null) {
            objInvoke = companion.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return companion.invoke(i, objInvoke);
    }

    public static final boolean isIraDistributionTaxWithholdingUpToDate(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount == null) {
            return false;
        }
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
        ApiIraDistributionTaxWithholding calculatedTaxWithholding = success != null ? success.getCalculatedTaxWithholding() : null;
        return createTransferV2DataState.getIraDistribution() != null && calculatedTaxWithholding != null && BigDecimals7.m2977eq(createTransferV2DataState.getAmount(), calculatedTaxWithholding.getAmount()) && transferAccountFromTransferAccount.getType() == calculatedTaxWithholding.getAccount_type() && createTransferV2DataState.getIraDistribution().getDistributionType() == calculatedTaxWithholding.getDistribution_type() && (createTransferV2DataState.getIraFederalWithholdingPercentOverride() == null || BigDecimals7.m2977eq(createTransferV2DataState.getIraFederalWithholdingPercentOverride(), calculatedTaxWithholding.getFederal_withholding_percent())) && (createTransferV2DataState.getIraStateWithholdingPercentOverride() == null || BigDecimals7.m2977eq(createTransferV2DataState.getIraStateWithholdingPercentOverride(), calculatedTaxWithholding.getState_withholding_percent()));
    }

    public static final TransferType configuredTransferType(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getConfigureForOutgoingWires()) {
            return TransferType.OUTGOING_WIRE;
        }
        return null;
    }

    public static final CreateTransferV2DropdownChipViewState dropdownChipViewState(CreateTransferV2DataState createTransferV2DataState) {
        StringResource stringResourceDropdownChipText;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        if (createTransferV2DataState.getDirection() == TransferDirectionV2.DEPOSIT || createTransferV2DataState.getMode() != CreateTransferViewState.Mode.EDIT || transferAccountFromTransferAccount == null || (stringResourceDropdownChipText = dropdownChipText(transferAccountFromTransferAccount)) == null) {
            return null;
        }
        return new CreateTransferV2DropdownChipViewState(stringResourceDropdownChipText);
    }

    private static final StringResource dropdownChipText(TransferAccount transferAccount) {
        DisplayName.Variants variants;
        DisplayName brokerageAccountDisplayName = AccountDisplayNames.getBrokerageAccountDisplayName(transferAccount);
        StringResource inSentence = (brokerageAccountDisplayName == null || (variants = brokerageAccountDisplayName.getShort()) == null) ? null : variants.getInSentence();
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C30065R.string.withdrawal_account_selection_chip;
        if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHY) {
            inSentence = companion.invoke(C8179R.string.account_type_spending, new Object[0]);
        } else if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHY_BANKING) {
            inSentence = companion.invoke(transferAccount.getAccountName());
        } else if (inSentence == null) {
            return null;
        }
        return companion.invoke(i, inSentence);
    }

    public static final TransferAccount fromTransferAccount(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return createTransferV2DataState.getTransferAccounts().get(createTransferV2DataState.getFromAccountId());
    }

    public static final TransferAccount toTransferAccount(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return createTransferV2DataState.getTransferAccounts().get(createTransferV2DataState.getToAccountId());
    }

    public static final CreateTransferV2DataRowState getAccountDataRow(CreateTransferV2DataState createTransferV2DataState, TransferAccountDirection transferAccountDirection) {
        TransferAccount transferAccountFromTransferAccount;
        StringResource stringResourceInvoke;
        int i;
        boolean zIsFromAccountFixed;
        String str;
        String adjustedDisplayTitle;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(transferAccountDirection, "transferAccountDirection");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[transferAccountDirection.ordinal()];
        if (i2 == 1) {
            transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccountFromTransferAccount = toTransferAccount(createTransferV2DataState);
        }
        if (transferAccountFromTransferAccount == null || (adjustedDisplayTitle = getAdjustedDisplayTitle(transferAccountFromTransferAccount)) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(adjustedDisplayTitle)) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C30065R.string.account_selection_placeholder, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = iArr[transferAccountDirection.ordinal()];
        if (i3 == 1) {
            i = C11048R.string.general_label_from;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.general_label_to;
        }
        StringResource stringResourceInvoke2 = companion.invoke(i, new Object[0]);
        int i4 = iArr[transferAccountDirection.ordinal()];
        if (i4 == 1) {
            zIsFromAccountFixed = createTransferV2DataState.isFromAccountFixed();
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zIsFromAccountFixed = createTransferV2DataState.isToAccountFixed();
        }
        CreateTransferV2DataRowState.OnClickAction.AccountSelection accountSelection = zIsFromAccountFixed ? null : new CreateTransferV2DataRowState.OnClickAction.AccountSelection(transferAccountDirection, transferAccountFromTransferAccount);
        int i5 = iArr[transferAccountDirection.ordinal()];
        if (i5 == 1) {
            str = "FromAccount";
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ToAccount";
        }
        return new CreateTransferV2DataRowState(stringResourceInvoke2, stringResource, accountSelection, false, str, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<CreateTransferV2DataRowState> getReviewRows(CreateTransferV2DataState createTransferV2DataState, boolean z) {
        CreateTransferV2DataRowState createTransferV2DataRowState;
        CreateTransferV2DataRowState createTransferV2DataRowState2;
        CreateTransferV2DataRowState createTransferV2DataRowState3;
        CreateTransferV2DataRowState createTransferV2DataRowState4;
        CreateTransferV2DataRowState createTransferV2DataRowState5;
        ApiServiceFeeResponse serviceFeeResponse;
        BigDecimal service_fee;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        TransferAccount transferAccount = toTransferAccount(createTransferV2DataState);
        SpreadBuilder spreadBuilder = new SpreadBuilder(9);
        spreadBuilder.add(getAccountDataRow(createTransferV2DataState, TransferAccountDirection.SOURCE));
        spreadBuilder.add(getAccountDataRow(createTransferV2DataState, TransferAccountDirection.SINK));
        CreateTransferV2DataRowState createTransferV2DataRowState6 = null;
        if (!TransferDataExtensions.isEligibleForRecurringDeposit(transferAccountFromTransferAccount, transferAccount, createTransferV2DataState.getIraContribution(), createTransferV2DataState.getSystemCalendarYear()) || createTransferV2DataState.getHideFrequency()) {
            createTransferV2DataRowState = null;
        } else {
            StringResource.Companion companion = StringResource.INSTANCE;
            createTransferV2DataRowState = new CreateTransferV2DataRowState(companion.invoke(C30065R.string.ach_transfer_automatic_deposit_detail_frequency_header, new Object[0]), companion.invoke(Frequency3.getTextRes(createTransferV2DataState.getFrequency()), new Object[0]), CreateTransferV2DataRowState.OnClickAction.FrequencySelection.INSTANCE, false, FrequencyRowTag, 8, null);
        }
        spreadBuilder.add(createTransferV2DataRowState);
        if ((transferAccount != null ? transferAccount.getType() : null) == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = createTransferV2DataState.getAdditionalDataState();
            CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded serviceFeesLoaded = additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded ? (CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) additionalDataState : null;
            if (serviceFeesLoaded == null || (serviceFeeResponse = serviceFeesLoaded.getServiceFeeResponse()) == null || (service_fee = serviceFeeResponse.getService_fee()) == null) {
                createTransferV2DataRowState2 = null;
            } else {
                StringResource.Companion companion2 = StringResource.INSTANCE;
                createTransferV2DataRowState2 = new CreateTransferV2DataRowState(companion2.invoke(C13932R.string.debit_card_fee_label, new Object[0]), companion2.invoke(Money.format$default(Money3.toMoney(service_fee, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)), null, false, TransferFeeRowTag, 8, null);
            }
        }
        spreadBuilder.add(createTransferV2DataRowState2);
        spreadBuilder.addSpread(getReviewRows(CreateTransferV2DataState2.getIraTransferInfoState(createTransferV2DataState), transferAccountFromTransferAccount, transferAccount, CreateTransferV2DataState2.getAdjustedFrequency(createTransferV2DataState) != ApiCreateTransferRequest2.ONCE).toArray(new CreateTransferV2DataRowState[0]));
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
        if (success != null) {
            ApiIraDistributionTaxWithholding calculatedTaxWithholding = success.getCalculatedTaxWithholding();
            StringResource.Companion companion3 = StringResource.INSTANCE;
            createTransferV2DataRowState3 = new CreateTransferV2DataRowState(companion3.invoke(C30065R.string.f4994x70a43663, Formats.getPercentFormat().format(calculatedTaxWithholding.getFederal_withholding_percent())), companion3.invoke(Money.format$default(Money3.toMoney(calculatedTaxWithholding.getFederal_withholding_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)), CreateTransferV2DataRowState.OnClickAction.EditIraDistributionTaxWithholding.INSTANCE, false, IraDistributionWithholdingRowTag, 8, null);
        } else {
            createTransferV2DataRowState3 = null;
        }
        spreadBuilder.add(createTransferV2DataRowState3);
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult2 = createTransferV2DataState.getIraCalculatedTaxWithholdingResult();
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success2 = iraCalculatedTaxWithholdingResult2 instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult2 : null;
        if (success2 != null) {
            ApiIraDistributionTaxWithholding calculatedTaxWithholding2 = success2.getCalculatedTaxWithholding();
            StringResource.Companion companion4 = StringResource.INSTANCE;
            createTransferV2DataRowState4 = new CreateTransferV2DataRowState(companion4.invoke(C30065R.string.f4996x9bedb2f, calculatedTaxWithholding2.getState(), Formats.getPercentFormat().format(calculatedTaxWithholding2.getState_withholding_percent())), companion4.invoke(Money.format$default(Money3.toMoney(calculatedTaxWithholding2.getState_withholding_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)), CreateTransferV2DataRowState.OnClickAction.EditIraDistributionTaxWithholding.INSTANCE, false, IraDistributionWithholdingRowTag, 8, null);
        } else {
            createTransferV2DataRowState4 = null;
        }
        spreadBuilder.add(createTransferV2DataRowState4);
        if (createTransferV2DataState.getRothConversionTransferInfo() != null) {
            StringResource.Companion companion5 = StringResource.INSTANCE;
            createTransferV2DataRowState5 = new CreateTransferV2DataRowState(companion5.invoke(C30065R.string.transfer_ira_distribution_type_header, new Object[0]), companion5.invoke(createTransferV2DataState.getRothConversionTransferInfo().getWithdrawal_reason_value()), null, true, "transfer_ira_distribution_type_header");
        } else {
            createTransferV2DataRowState5 = null;
        }
        spreadBuilder.add(createTransferV2DataRowState5);
        if (createTransferV2DataState.getRothConversionTransferInfo() != null) {
            StringResource.Companion companion6 = StringResource.INSTANCE;
            createTransferV2DataRowState6 = new CreateTransferV2DataRowState(companion6.invoke(C30065R.string.transfer_ira_contribution_tax_year_header, new Object[0]), companion6.invoke(String.valueOf(createTransferV2DataState.getRothConversionTransferInfo().getTax_year())), null, true, "transfer_ira_contribution_tax_year_header");
        }
        spreadBuilder.add(createTransferV2DataRowState6);
        List<CreateTransferV2DataRowState> listListOfNotNull = CollectionsKt.listOfNotNull(spreadBuilder.toArray(new CreateTransferV2DataRowState[spreadBuilder.size()]));
        if (!z) {
            return listListOfNotNull;
        }
        List<CreateTransferV2DataRowState> list = listListOfNotNull;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CreateTransferV2DataRowState.copy$default((CreateTransferV2DataRowState) it.next(), null, null, null, false, null, 27, null));
        }
        return arrayList;
    }

    public static final List<CreateTransferV2DataRowState> getReviewRows(IraTransferInfo5 iraTransferInfo5, TransferAccount transferAccount, TransferAccount transferAccount2, boolean z) {
        CreateTransferV2DataRowState.OnClickAction.EditIraContributionType editIraContributionType;
        if (iraTransferInfo5 instanceof IraTransferInfo5.Contribution) {
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C30065R.string.transfer_ira_contribution_contribution_type_header, new Object[0]);
            IraTransferInfo5.Contribution contribution = (IraTransferInfo5.Contribution) iraTransferInfo5;
            StringResource stringResourceInvoke2 = companion.invoke(CreateRetirementContributionStateProvider.INSTANCE.getTextRes(contribution.getValue()), new Object[0]);
            CreateTransferV2DataRowState createTransferV2DataRowState = null;
            if (z) {
                editIraContributionType = null;
            } else if (transferAccount2 != null) {
                editIraContributionType = new CreateTransferV2DataRowState.OnClickAction.EditIraContributionType(transferAccount2, contribution.getValue().getIraContributionType());
            } else {
                throw new IllegalStateException("To account needs to be present for contributions!");
            }
            CreateTransferV2DataRowState createTransferV2DataRowState2 = new CreateTransferV2DataRowState(stringResourceInvoke, stringResourceInvoke2, editIraContributionType, z, IraContributionTypeRowTag);
            Year taxYear = contribution.getTaxYear();
            if (taxYear != null) {
                StringResource stringResourceInvoke3 = companion.invoke(C30065R.string.transfer_ira_contribution_tax_year_header, new Object[0]);
                String string2 = taxYear.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                createTransferV2DataRowState = new CreateTransferV2DataRowState(stringResourceInvoke3, companion.invoke(string2), z ? null : CreateTransferV2DataRowState.OnClickAction.EditIraContributionTaxYear.INSTANCE, z, IraContributionTaxYearRowTag);
            }
            return CollectionsKt.listOfNotNull((Object[]) new CreateTransferV2DataRowState[]{createTransferV2DataRowState2, createTransferV2DataRowState});
        }
        if (iraTransferInfo5 instanceof IraTransferInfo5.Distribution) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            StringResource stringResourceInvoke4 = companion2.invoke(C30065R.string.transfer_ira_distribution_type_header, new Object[0]);
            StringResource stringResourceInvoke5 = companion2.invoke(((IraTransferInfo5.Distribution) iraTransferInfo5).getDistributionRowValueRes(), new Object[0]);
            if (transferAccount != null) {
                return CollectionsKt.listOf(new CreateTransferV2DataRowState(stringResourceInvoke4, stringResourceInvoke5, new CreateTransferV2DataRowState.OnClickAction.EditIraDistributionType(transferAccount), false, IraDistributionWithdrawalReasonRowTag, 8, null));
            }
            throw new IllegalStateException("From account needs to be present for distributions!");
        }
        if (!(iraTransferInfo5 instanceof IraTransferInfo5.RothConversion) && iraTransferInfo5 != null) {
            throw new NoWhenBranchMatchedException();
        }
        return CollectionsKt.emptyList();
    }

    public static final String getAdjustedDisplayTitle(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        if (transferAccount.isExternal()) {
            String str = (String) CollectionsKt.lastOrNull(StringsKt.split$default((CharSequence) transferAccount.getDisplayTitle(), new String[]{" · "}, false, 0, 6, (Object) null));
            return str == null ? transferAccount.getDisplayTitle() : str;
        }
        return transferAccount.getDisplayTitle();
    }

    public static final boolean isRtpInstantTransferSelectorVisible(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        return (createTransferV2DataState.getAdditionalDataState() instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) && CreateTransferV2DataState2.isRtpEligibleTransfer(createTransferV2DataState);
    }

    public static final CreateTransferV2InstantBankTransferSelectorViewState.Option.State getInstantBankTransferSelectorOptionState(CreateTransferV2DataState createTransferV2DataState, AchTransferOption achTransferOption, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        Intrinsics.checkNotNullParameter(achTransferOption, "achTransferOption");
        if (stringResource != null) {
            return CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
        }
        if (CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == achTransferOption) {
            return CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_SELECTED;
        }
        return CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_NOT_SELECTED;
    }

    public static final CreateTransferV2InstantBankTransferSelectorViewState getInstantTransferSelectorViewState(CreateTransferV2DataState createTransferV2DataState) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        StringResource stringResource;
        CreateTransferV2InstantBankTransferSelectorViewState.Option.State state;
        StringResource stringResource2;
        CreateTransferV2InstantBankTransferSelectorViewState.Option.State state2;
        StringResource stringResourceInvoke3;
        ManagementInfo managementInfo;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (isRtpInstantTransferSelectorVisible(createTransferV2DataState)) {
            TransferProductType transferProductType = TransferProductType.INSTANT_BANK_TRANSFER;
            TransferDirection transferDirection = TransferDirection.WITHDRAW;
            StringResource limitReason = getLimitReason(createTransferV2DataState, Tuples4.m3642to(transferProductType, transferDirection));
            StringResource limitReason2 = getLimitReason(createTransferV2DataState, Tuples4.m3642to(TransferProductType.ORIGINATED_ACH, transferDirection));
            AchTransferOption achTransferOption = AchTransferOption.STANDARD;
            CreateTransferV2InstantBankTransferSelectorViewState.Option.State instantBankTransferSelectorOptionState = getInstantBankTransferSelectorOptionState(createTransferV2DataState, achTransferOption, limitReason2);
            AchTransferOption achTransferOption2 = AchTransferOption.INSTANT;
            CreateTransferV2InstantBankTransferSelectorViewState.Option.State instantBankTransferSelectorOptionState2 = getInstantBankTransferSelectorOptionState(createTransferV2DataState, achTransferOption2, limitReason);
            Color color = Color.f5853FG;
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke4 = companion.invoke(C30065R.string.gated_instant_ach_standard_option_primary_text, new Object[0]);
            if (limitReason2 == null) {
                limitReason2 = companion.invoke(C30065R.string.gated_instant_ach_rtp_standard_option_secondary_text, new Object[0]);
            }
            StringResource stringResource3 = limitReason2;
            CreateTransferV2InstantBankTransferSelectorViewState.Option.State state3 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_SELECTED;
            CreateTransferV2InstantBankTransferSelectorViewState.Option option = new CreateTransferV2InstantBankTransferSelectorViewState.Option(color, null, stringResourceInvoke4, stringResource3, instantBankTransferSelectorOptionState == state3, achTransferOption, instantBankTransferSelectorOptionState);
            Color color2 = Color.POSITIVE;
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.LIGHTNING_16);
            StringResource stringResourceInvoke5 = companion.invoke(C30065R.string.gated_instant_ach_instant_option_primary_text, new Object[0]);
            if (limitReason == null) {
                int i = C30065R.string.transfer_account_fee_template;
                CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = createTransferV2DataState.getAdditionalDataState();
                Intrinsics.checkNotNull(additionalDataState, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.v2.additionaldata.CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded");
                limitReason = companion.invoke(i, Money.format$default(Money3.toMoney(((CreateTransferV2AdditionalDataClient.AdditionalDataState.ServiceFeesLoaded) additionalDataState).getServiceFeeResponse().getService_fee(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            }
            return new CreateTransferV2InstantBankTransferSelectorViewState(option, new CreateTransferV2InstantBankTransferSelectorViewState.Option(color2, size16, stringResourceInvoke5, limitReason, instantBankTransferSelectorOptionState2 == state3, achTransferOption2, instantBankTransferSelectorOptionState2));
        }
        CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState2 = createTransferV2DataState.getAdditionalDataState();
        CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState = null;
        management_type = null;
        ManagementType management_type = null;
        createTransferV2InstantBankTransferSelectorViewState = null;
        CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded rfpEligibilityLoaded = additionalDataState2 instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded ? (CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded) additionalDataState2 : null;
        if (rfpEligibilityLoaded != null) {
            if (rfpEligibilityLoaded.isEligible()) {
                TransferProductType transferProductType2 = TransferProductType.INSTANT_BANK_TRANSFER;
                TransferDirection transferDirection2 = TransferDirection.DEPOSIT;
                StringResource limitReason3 = getLimitReason(createTransferV2DataState, Tuples4.m3642to(transferProductType2, transferDirection2));
                StringResource limitReason4 = getLimitReason(createTransferV2DataState, Tuples4.m3642to(TransferProductType.ORIGINATED_ACH, transferDirection2));
                if (createTransferV2DataState.getFrequency() != ApiCreateTransferRequest2.ONCE) {
                    limitReason3 = StringResource.INSTANCE.invoke(C30065R.string.f4991x7f31ada1, new Object[0]);
                } else {
                    String errorMessage = ((CreateTransferV2AdditionalDataClient.AdditionalDataState.RfpEligibilityLoaded) createTransferV2DataState.getAdditionalDataState()).getErrorMessage();
                    if (errorMessage != null && (stringResourceInvoke = StringResource.INSTANCE.invoke(errorMessage)) != null) {
                        limitReason3 = stringResourceInvoke;
                    }
                }
                TransferAccount transferAccount = createTransferV2DataState.getTransferAccounts().get(createTransferV2DataState.getToAccountId());
                if (transferAccount != null && (managementInfo = transferAccount.getManagementInfo()) != null) {
                    management_type = managementInfo.getManagement_type();
                }
                boolean z = management_type == ManagementType.MANAGED;
                Color color3 = Color.f5853FG;
                StringResource.Companion companion2 = StringResource.INSTANCE;
                StringResource stringResourceInvoke6 = companion2.invoke(C30065R.string.gated_instant_ach_standard_option_primary_text, new Object[0]);
                if (limitReason4 != null) {
                    stringResource = limitReason4;
                } else {
                    if (!createTransferV2DataState.isEligibleForInstantDeposits() || !BigDecimals7.isPositive(createTransferV2DataState.getEligbleDepositAsInstant())) {
                        stringResourceInvoke2 = companion2.invoke(C30065R.string.gated_instant_ach_rfp_standard_option_secondary_text, new Object[0]);
                    } else if (z) {
                        stringResourceInvoke2 = companion2.invoke(C30065R.string.gated_instant_ach_rfp_standard_option_managed_text, new Object[0]);
                    } else {
                        int i2 = C30065R.string.f4992xdf76e2ae;
                        NumberFormatter noSymbolPercentFormat = Formats.getNoSymbolPercentFormat();
                        BigDecimal eligbleDepositAsInstant = createTransferV2DataState.getEligbleDepositAsInstant();
                        if (eligbleDepositAsInstant == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        BigDecimal bigDecimalMin = eligbleDepositAsInstant.min(createTransferV2DataState.getAmount());
                        Intrinsics.checkNotNullExpressionValue(bigDecimalMin, "min(...)");
                        stringResourceInvoke2 = companion2.invoke(i2, noSymbolPercentFormat.format(bigDecimalMin));
                    }
                    stringResource = stringResourceInvoke2;
                }
                AchTransferOption achTransferOption3 = AchTransferOption.STANDARD;
                if (limitReason4 != null) {
                    state = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
                } else if (CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == achTransferOption3) {
                    state = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_SELECTED;
                } else {
                    state = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_NOT_SELECTED;
                }
                CreateTransferV2InstantBankTransferSelectorViewState.Option option2 = new CreateTransferV2InstantBankTransferSelectorViewState.Option(color3, null, stringResourceInvoke6, stringResource, false, achTransferOption3, state);
                Color color4 = Color.POSITIVE;
                BentoIcon4.Size16 size162 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.LIGHTNING_16);
                StringResource stringResourceInvoke7 = companion2.invoke(C30065R.string.gated_instant_ach_instant_option_primary_text, new Object[0]);
                if (limitReason3 == null) {
                    if (z) {
                        stringResourceInvoke3 = companion2.invoke(C30065R.string.gated_instant_ach_rfp_instant_option_managed_secondary_text, new Object[0]);
                    } else {
                        stringResourceInvoke3 = companion2.invoke(C30065R.string.gated_instant_ach_rfp_instant_option_secondary_text, new Object[0]);
                    }
                    stringResource2 = stringResourceInvoke3;
                } else {
                    stringResource2 = limitReason3;
                }
                AchTransferOption achTransferOption4 = AchTransferOption.INSTANT;
                if (limitReason3 != null) {
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.DISABLED;
                } else if (CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == achTransferOption4) {
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_SELECTED;
                } else {
                    state2 = CreateTransferV2InstantBankTransferSelectorViewState.Option.State.ENABLED_NOT_SELECTED;
                }
                createTransferV2InstantBankTransferSelectorViewState = new CreateTransferV2InstantBankTransferSelectorViewState(option2, new CreateTransferV2InstantBankTransferSelectorViewState.Option(color4, size162, stringResourceInvoke7, stringResource2, false, achTransferOption4, state2));
            }
        }
        return createTransferV2InstantBankTransferSelectorViewState;
    }

    public static final boolean isInstantTransfersButtonVisible(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getMode() != CreateTransferViewState.Mode.REVIEW || createTransferV2DataState.getDirection() != TransferDirectionV2.WITHDRAW) {
            return false;
        }
        TransferAccount transferAccountFromTransferAccount = fromTransferAccount(createTransferV2DataState);
        if (transferAccountFromTransferAccount != null && transferAccountFromTransferAccount.isManaged()) {
            return false;
        }
        TransferAccount transferAccount = toTransferAccount(createTransferV2DataState);
        if (transferAccount != null && !transferAccount.isExternal()) {
            return false;
        }
        Collection<TransferAccount> collectionValues = createTransferV2DataState.getTransferAccounts().values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (TransferAccount transferAccount2 : collectionValues) {
                if (transferAccount2.getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD || TransferAccounts2.isRtpEligible(transferAccount2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean isContinueButtonEnabled(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (!BigDecimals7.m2978gt(createTransferV2DataState.getAmount(), BigDecimal.ZERO)) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[createTransferV2DataState.getMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (fromTransferAccount(createTransferV2DataState) == null || toTransferAccount(createTransferV2DataState) == null) {
                return false;
            }
            if ((CreateTransferV2DataState2.isRtpEligibleTransfer(createTransferV2DataState) && CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == null) || createTransferV2DataState.getShouldShowRothIraReviewStateErrorRetryText()) {
                return false;
            }
        } else if (createTransferV2DataState.getTransferAccounts().isEmpty()) {
            return false;
        }
        return true;
    }

    public static final boolean isContinueButtonLoading(CreateTransferV2DataState createTransferV2DataState) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.isCreatingTransfer() || Intrinsics.areEqual(createTransferV2DataState.getAdditionalDataState(), CreateTransferV2AdditionalDataClient.AdditionalDataState.Loading.INSTANCE)) {
            return true;
        }
        return createTransferV2DataState.getMode() == CreateTransferViewState.Mode.REVIEW && (createTransferV2DataState.getIraCalculatedTaxWithholdingResult() instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Loading);
    }

    public static final boolean isContinueButtonVisible(CreateTransferV2DataState createTransferV2DataState, List<QuickSelectorChip> list) {
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$2[createTransferV2DataState.getDirection().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (IsEligibleForDepositSuggesstionPills.isEligibleForDepositSuggestionPills(createTransferV2DataState.getEntryPoint())) {
            List<QuickSelectorChip> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return false;
            }
            if (!BigDecimals7.m2978gt(createTransferV2DataState.getAmount(), BigDecimal.ZERO) && !createTransferV2DataState.getSkipWaitingForSuggestionPills()) {
                return false;
            }
        }
        return true;
    }

    public static final StringResource continueButtonCopy(CreateTransferV2DataState createTransferV2DataState) {
        int i;
        Object objInvoke;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$1[createTransferV2DataState.getMode().ordinal()];
        if (i2 == 1) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (CreateTransferV2DataState2.getAdjustedFrequency(createTransferV2DataState) != ApiCreateTransferRequest2.ONCE) {
            return StringResource.INSTANCE.invoke(C30065R.string.schedule_deposit_label, new Object[0]);
        }
        if (isRtpInstantTransferSelectorVisible(createTransferV2DataState) && CreateTransferV2DataState2.getSelectedAchTransferOptionOrDefault(createTransferV2DataState) == null) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = WhenMappings.$EnumSwitchMapping$2[createTransferV2DataState.getDirection().ordinal()];
        if (i3 == 1) {
            i = C30065R.string.deposit_action;
        } else if (i3 == 2) {
            i = C30065R.string.withdraw_action;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = C30065R.string.transfer_action;
        }
        BigDecimal bigDecimalFinalTransferAmount = finalTransferAmount(createTransferV2DataState);
        if (bigDecimalFinalTransferAmount == null || (objInvoke = BigDecimals2.formatCurrencyWithOptionalDecimal$default(bigDecimalFinalTransferAmount, null, 1, null)) == null) {
            objInvoke = companion.invoke(C30065R.string.transfer_ira_distribution_after_withholding_placeholder, new Object[0]);
        }
        return companion.invoke(i, objInvoke);
    }

    public static final List<QuickSelectorChip> getQuickSelectorChips(CreateTransferV2DataState createTransferV2DataState) {
        List<Money> depositSuggestionPills;
        Intrinsics.checkNotNullParameter(createTransferV2DataState, "<this>");
        if (createTransferV2DataState.getDirection() == TransferDirectionV2.WITHDRAW || createTransferV2DataState.getDirection() == TransferDirectionV2.INTER_ENTITY || createTransferV2DataState.getMode() == CreateTransferViewState.Mode.REVIEW || BigDecimals7.m2978gt(createTransferV2DataState.getAmount(), BigDecimal.ZERO) || (depositSuggestionPills = createTransferV2DataState.getDepositSuggestionPills()) == null || depositSuggestionPills.isEmpty() || !IsEligibleForDepositSuggesstionPills.isEligibleForDepositSuggestionPills(createTransferV2DataState.getEntryPoint())) {
            return null;
        }
        List<Money> depositSuggestionPills2 = createTransferV2DataState.getDepositSuggestionPills();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(depositSuggestionPills2, 10));
        for (Money money : depositSuggestionPills2) {
            arrayList.add(new QuickSelectorChip(Formats.getWholeNumberAmountFormat().format(money.getDecimalValue()), money.getDecimalValue(), true));
        }
        return arrayList;
    }

    private static final StringResource getLimitReason(CreateTransferV2DataState createTransferV2DataState, Tuples2<? extends TransferProductType, ? extends TransferDirection> tuples2) {
        ApiAmountLimit apiAmountLimit;
        ApiCountLimit apiCountLimit;
        int i;
        Object next;
        Object next2;
        ApiLimitsHubResponse apiLimitsHubResponse = createTransferV2DataState.getTransferLimits().get(tuples2);
        if (apiLimitsHubResponse == null) {
            return null;
        }
        List<ApiAmountLimit> amount_limits = apiLimitsHubResponse.getAmount_limits();
        if (amount_limits != null) {
            Iterator<T> it = amount_limits.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (((ApiAmountLimit) next2).getLimits_interval() == LimitsInterval.DAILY) {
                    break;
                }
            }
            apiAmountLimit = (ApiAmountLimit) next2;
        } else {
            apiAmountLimit = null;
        }
        if (apiAmountLimit != null && createTransferV2DataState.getAmount().compareTo(apiAmountLimit.getRemaining_amount()) > 0) {
            return StringResource.INSTANCE.invoke(C30065R.string.amount_daily_limit, Money.format$default(Money3.toMoney(apiAmountLimit.getTotal_amount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        List<ApiCountLimit> count_limits = apiLimitsHubResponse.getCount_limits();
        if (count_limits != null) {
            Iterator<T> it2 = count_limits.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((ApiCountLimit) next).getLimits_interval() == LimitsInterval.DAILY) {
                    break;
                }
            }
            apiCountLimit = (ApiCountLimit) next;
        } else {
            apiCountLimit = null;
        }
        if (apiCountLimit != null && apiCountLimit.getRemaining_count() == 0) {
            StringResource.Companion companion = StringResource.INSTANCE;
            TransferDirection second = tuples2.getSecond();
            int i2 = second == null ? -1 : WhenMappings.$EnumSwitchMapping$3[second.ordinal()];
            if (i2 != -1) {
                if (i2 == 1) {
                    i = C30065R.string.deposit_count_limit_reached;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = C30065R.string.withdraw_count_limit_reached;
                }
                return companion.invoke(i, Integer.valueOf(apiCountLimit.getTotal_count()));
            }
        }
        return null;
    }
}

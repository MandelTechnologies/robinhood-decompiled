package com.robinhood.android.advisory.onboarding.retirement.contribution;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.TransferAccounts4;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.lib.validation.TransferValidationInput;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContributionConfigMappers.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"toTransferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "Lcom/robinhood/store/advisory/AdvisoryFirstDepositConfig$Transfer;", "sessionId", "Ljava/util/UUID;", "sink", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toTransferValidationInput", "Lcom/robinhood/android/transfers/lib/validation/TransferValidationInput;", "areMarketsOpenExtended", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.ContributionConfigMappersKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ContributionConfigMappers {
    public static final ApiCreateTransferRequest toTransferRequest(AdvisoryFirstDepositConfig.Transfer transfer, UUID sessionId, TransferAccount sink) {
        ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData;
        Intrinsics.checkNotNullParameter(transfer, "<this>");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sink, "sink");
        BigDecimal decimalValue = transfer.getAmount().getDecimalValue();
        ApiCreateTransferRequest.ApiTransferAccount requestModel = TransferAccounts4.toRequestModel(transfer.getSourceAccount());
        ApiCreateTransferRequest.ApiTransferAccount requestModel2 = TransferAccounts4.toRequestModel(sink);
        ApiCreateTransferRequest2 frequency = transfer.getFrequency();
        if (transfer instanceof AdvisoryFirstDepositConfig.Transfer.Retirement) {
            apiTransferAdditionalData = new ApiCreateTransferRequest.ApiTransferAdditionalData(null, new ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData(IraContributionType.ONE_TIME_CONTRIBUTION, ((AdvisoryFirstDepositConfig.Transfer.Retirement) transfer).getTaxYear()), null, null, MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW, null, null, null, null, null, null, null, null, false, null, null, 65517, null);
        } else {
            if (!(transfer instanceof AdvisoryFirstDepositConfig.Transfer.Deposit)) {
                throw new NoWhenBranchMatchedException();
            }
            apiTransferAdditionalData = new ApiCreateTransferRequest.ApiTransferAdditionalData(null, null, null, null, MAXTransferContext.EntryPoint.MANAGED_ACCOUNT_ONBOARDING_FLOW, null, null, null, null, null, null, null, null, false, null, null, 65519, null);
        }
        return new ApiCreateTransferRequest(sessionId, decimalValue, requestModel, requestModel2, frequency, null, apiTransferAdditionalData, null, null, null, null, false, null, 8096, null);
    }

    public static final TransferValidationInput toTransferValidationInput(AdvisoryFirstDepositConfig.Transfer transfer, UUID sessionId, TransferAccount sink, boolean z) {
        IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution;
        Intrinsics.checkNotNullParameter(transfer, "<this>");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sink, "sink");
        TransferAccount sourceAccount = transfer.getSourceAccount();
        TransferConfiguration.IraContribution iraContribution = new TransferConfiguration.IraContribution(transfer.getAmount().getDecimalValue(), null, TransferAccounts4.toConfigurationAccount(transfer.getSourceAccount()), TransferAccounts4.toConfigurationAccount(sink), null, null, null, null, EnumC7081g.f2778x3356acf6, null);
        CreateTransferLimitsState.None none = CreateTransferLimitsState.None.INSTANCE;
        if (transfer instanceof AdvisoryFirstDepositConfig.Transfer.Retirement) {
            AdvisoryFirstDepositConfig.Transfer.Retirement retirement = (AdvisoryFirstDepositConfig.Transfer.Retirement) transfer;
            oneTimeContribution = new IraContributionQuestionnaireResult.IraContribution.OneTimeContribution(sink, retirement.getTaxYear(), retirement.getContributionLimit());
        } else {
            if (!(transfer instanceof AdvisoryFirstDepositConfig.Transfer.Deposit)) {
                throw new NoWhenBranchMatchedException();
            }
            oneTimeContribution = null;
        }
        IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution2 = oneTimeContribution;
        return new TransferValidationInput(sessionId, MAXTransferContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, "", transfer.getAmount().getDecimalValue(), sourceAccount, sink, iraContribution, null, null, z, none, oneTimeContribution2, null, null, null, false, false, false, false, false, null, null, null, false, false, 32505856, null);
    }
}

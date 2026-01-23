package com.robinhood.android.lib.transfers;

import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.lib.ExtensionsKt;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.converters.cash.Transfers;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.rosetta.eventlogging.TransferContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: TransferDataExtensions.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0007*\u00020\n¢\u0006\u0004\b\f\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0007*\u00020\n¢\u0006\u0004\b\r\u0010\u000b\u001a+\u0010\u0016\u001a\u00020\u0015*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/models/db/bonfire/TransferAccount;", "fromAccount", "toAccount", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "j$/time/Year", "systemCalendarYear", "", "isEligibleForRecurringDeposit", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;Lj$/time/Year;)Z", "Lcom/robinhood/android/lib/transfers/TransferData;", "(Lcom/robinhood/android/lib/transfers/TransferData;)Z", "shouldExecuteImmediately", "isRhyBankingTransfer", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "entryPoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;", "direction", "", "locality", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "toTransferContext", "(Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferV2Direction;Ljava/lang/String;)Lcom/robinhood/rosetta/eventlogging/MAXTransferContext;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.transfers.TransferDataExtensionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TransferDataExtensions {
    public static final boolean isEligibleForRecurringDeposit(TransferAccount transferAccount, TransferAccount transferAccount2, IraContributionQuestionnaireResult iraContributionQuestionnaireResult, Year systemCalendarYear) {
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        return transferAccount != null && transferAccount.isEligibleRecurringDepositsSource() && transferAccount2 != null && TransferAccounts2.isEligibleRecurringDepositsSink(transferAccount2, iraContributionQuestionnaireResult, systemCalendarYear);
    }

    public static final boolean isEligibleForRecurringDeposit(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "<this>");
        return isEligibleForRecurringDeposit(transferData.getFromAccount(), transferData.getToAccount(), transferData.getIraContribution(), transferData.getSystemCalendarYear());
    }

    public static final boolean shouldExecuteImmediately(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "<this>");
        return isEligibleForRecurringDeposit(transferData) && transferData.getFrequency() != ApiCreateTransferRequest2.ONCE && transferData.getInRecurringIncludeDepositExperiment();
    }

    public static final boolean isRhyBankingTransfer(TransferData transferData) {
        Intrinsics.checkNotNullParameter(transferData, "<this>");
        ApiTransferAccount.TransferAccountType type2 = transferData.getFromAccount().getType();
        ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY_BANKING;
        return type2 == transferAccountType || transferData.getToAccount().getType() == transferAccountType;
    }

    public static /* synthetic */ MAXTransferContext toTransferContext$default(ApiCreateTransferRequest apiCreateTransferRequest, MAXTransferContext.EntryPoint entryPoint, MAXTransferContext.TransferV2Direction transferV2Direction, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = CountryCode.COUNTRY_CODE_US;
        }
        return toTransferContext(apiCreateTransferRequest, entryPoint, transferV2Direction, str);
    }

    public static final MAXTransferContext toTransferContext(ApiCreateTransferRequest apiCreateTransferRequest, MAXTransferContext.EntryPoint entryPoint, MAXTransferContext.TransferV2Direction direction, String locality) {
        Boolean boolIs_instant_transfer;
        ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData ira_distribution_data;
        Intrinsics.checkNotNullParameter(apiCreateTransferRequest, "<this>");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(locality, "locality");
        String string2 = apiCreateTransferRequest.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Money moneyForLogging = ExtensionsKt.toMoneyForLogging(apiCreateTransferRequest.getAmount());
        MAXTransferContext.TransferAccount protobuf = Transfers.toProtobuf(apiCreateTransferRequest.getSource());
        MAXTransferContext.TransferAccount protobuf2 = Transfers.toProtobuf(apiCreateTransferRequest.getSink());
        TransferContext.Frequency protobuf3 = Transfers.toProtobuf(apiCreateTransferRequest.getFrequency());
        ApiCreateTransferRequest.ApiTransferAdditionalData additional_data = apiCreateTransferRequest.getAdditional_data();
        MAXTransferContext.IRADistributionData protobuf4 = (additional_data == null || (ira_distribution_data = additional_data.getIra_distribution_data()) == null) ? null : Transfers.toProtobuf(ira_distribution_data);
        ApiCreateTransferRequest.ApiTransferAdditionalData additional_data2 = apiCreateTransferRequest.getAdditional_data();
        return new MAXTransferContext(string2, moneyForLogging, protobuf, protobuf2, protobuf3, null, entryPoint, protobuf4, null, (additional_data2 == null || (boolIs_instant_transfer = additional_data2.is_instant_transfer()) == null) ? null : new MAXTransferContext.ACHTransferData(Booleans2.toProtobuf(boolIs_instant_transfer), null, null, null, 14, null), null, null, null, null, locality, null, direction, null, null, null, 965920, null);
    }
}

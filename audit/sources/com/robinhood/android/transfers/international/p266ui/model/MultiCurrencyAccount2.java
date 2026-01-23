package com.robinhood.android.transfers.international.p266ui.model;

import bff_money_movement.service.p019v1.TransferAccountTypeDto;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.transfers.disclosures.contracts.CreateTransferState;
import com.robinhood.transfers.disclosures.contracts.ManagementInfo;
import com.robinhood.transfers.disclosures.contracts.TransferAccountType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.TransferDto;

/* compiled from: MultiCurrencyAccount.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0000\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0002\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"toMgTransferAccount", "Lcom/robinhood/transfers/disclosures/contracts/CreateTransferState$ApiTransferAccount;", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "toTransferSummaryRequestAccount", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest$Account;", "toAnalyticsAccount", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "toTransferAccountDto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/TransferDto$AccountDto;", "loggingIdentifier", "", "getLoggingIdentifier", "(Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;)Ljava/lang/String;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.model.MultiCurrencyAccountKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class MultiCurrencyAccount2 {
    public static final CreateTransferState.ApiTransferAccount toMgTransferAccount(MultiCurrencyAccount multiCurrencyAccount) {
        Intrinsics.checkNotNullParameter(multiCurrencyAccount, "<this>");
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            MultiCurrencyAccount.External external = (MultiCurrencyAccount.External) multiCurrencyAccount;
            return new CreateTransferState.ApiTransferAccount((ManagementInfo) null, TransferAccountType.I18N_BANK_ACCOUNT, external.getInstrument().getInstrumentId().toString(), external.getCurrency().getCurrencyCode(), 1, (DefaultConstructorMarker) null);
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        MultiCurrencyAccount.Internal internal = (MultiCurrencyAccount.Internal) multiCurrencyAccount;
        return new CreateTransferState.ApiTransferAccount((ManagementInfo) null, TransferAccountType.RHS, internal.getAccountNumber(), internal.getCurrency().getCurrencyCode(), 1, (DefaultConstructorMarker) null);
    }

    public static final ApiTransferSummaryRequest.Account toTransferSummaryRequestAccount(MultiCurrencyAccount multiCurrencyAccount) {
        Intrinsics.checkNotNullParameter(multiCurrencyAccount, "<this>");
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            MultiCurrencyAccount.External external = (MultiCurrencyAccount.External) multiCurrencyAccount;
            String string2 = external.getInstrument().getInstrumentId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new ApiTransferSummaryRequest.Account(string2, ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT, external.getCurrency().getCurrencyCode());
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        MultiCurrencyAccount.Internal internal = (MultiCurrencyAccount.Internal) multiCurrencyAccount;
        return new ApiTransferSummaryRequest.Account(internal.getAccountNumber(), ApiTransferAccount.TransferAccountType.RHS, internal.getCurrency().getCurrencyCode());
    }

    public static final MAXTransferContext.TransferAccount toAnalyticsAccount(MultiCurrencyAccount multiCurrencyAccount) {
        Intrinsics.checkNotNullParameter(multiCurrencyAccount, "<this>");
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            MultiCurrencyAccount.External external = (MultiCurrencyAccount.External) multiCurrencyAccount;
            return new MAXTransferContext.TransferAccount(external.getIdentifier(), MAXTransferContext.TransferAccount.TransferAccountType.I18N_BANK_ACCOUNT, null, Currency2.toRosettaCurrency(external.getCurrency()), null, null, 52, null);
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
            throw new NoWhenBranchMatchedException();
        }
        return new MAXTransferContext.TransferAccount(null, MAXTransferContext.TransferAccount.TransferAccountType.RHS, null, Currency2.toRosettaCurrency(((MultiCurrencyAccount.Internal) multiCurrencyAccount).getCurrency()), null, null, 53, null);
    }

    public static final TransferDto.AccountDto toTransferAccountDto(MultiCurrencyAccount multiCurrencyAccount) {
        TransferAccountTypeDto transferAccountTypeDto;
        Intrinsics.checkNotNullParameter(multiCurrencyAccount, "<this>");
        String identifier = multiCurrencyAccount.getIdentifier();
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.External) {
            transferAccountTypeDto = TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_SG_BANK_ACCOUNT;
        } else {
            if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.Internal)) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccountTypeDto = TransferAccountTypeDto.TRANSFER_ACCOUNT_TYPE_RHS;
        }
        return new TransferDto.AccountDto(identifier, transferAccountTypeDto);
    }

    public static final String getLoggingIdentifier(MultiCurrencyAccount multiCurrencyAccount) {
        Intrinsics.checkNotNullParameter(multiCurrencyAccount, "<this>");
        if (multiCurrencyAccount instanceof MultiCurrencyAccount.Internal) {
            String currencyCode = ((MultiCurrencyAccount.Internal) multiCurrencyAccount).getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            return currencyCode;
        }
        if (!(multiCurrencyAccount instanceof MultiCurrencyAccount.External)) {
            throw new NoWhenBranchMatchedException();
        }
        MultiCurrencyAccount.External external = (MultiCurrencyAccount.External) multiCurrencyAccount;
        return external.getInstrument().getInstrumentId() + "_" + external.getCurrency().getCurrencyCode();
    }
}

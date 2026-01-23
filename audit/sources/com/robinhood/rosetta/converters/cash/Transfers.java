package com.robinhood.rosetta.converters.cash;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: Transfers.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0000\u001a\u00020\t*\u00020\n\u001a\n\u0010\u0000\u001a\u00020\u000b*\u00020\f\u001a\n\u0010\u0000\u001a\u00020\r*\u00020\u000e¨\u0006\u000f"}, m3636d2 = {"toProtobuf", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toAchProtobuf", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$ACHTransferAccountMetadata;", "Lcom/robinhood/models/db/bonfire/TransferAccountAdditionalData;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAccount;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRAContributionData;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraContributionData;", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$IRADistributionData;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest$ApiTransferAdditionalData$IraDistributionData;", "Lcom/robinhood/rosetta/eventlogging/TransferContext$Frequency;", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.cash.TransfersKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Transfers {

    /* compiled from: Transfers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.rosetta.converters.cash.TransfersKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiCreateTransferRequest2.values().length];
            try {
                iArr2[ApiCreateTransferRequest2.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ApiCreateTransferRequest2.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final MAXTransferContext.TransferAccount toProtobuf(TransferAccount transferAccount) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        String accountId = transferAccount.getAccountId();
        MAXTransferContext.TransferAccount.TransferAccountType protobuf = toProtobuf(transferAccount.getType());
        TransferAccountAdditionalData additionalData = transferAccount.getAdditionalData();
        return new MAXTransferContext.TransferAccount(accountId, protobuf, additionalData != null ? toAchProtobuf(additionalData) : null, null, null, null, 56, null);
    }

    public static final MAXTransferContext.TransferAccount.ACHTransferAccountMetadata toAchProtobuf(TransferAccountAdditionalData transferAccountAdditionalData) {
        Intrinsics.checkNotNullParameter(transferAccountAdditionalData, "<this>");
        TransferAccountAdditionalData.Ach ach = transferAccountAdditionalData instanceof TransferAccountAdditionalData.Ach ? (TransferAccountAdditionalData.Ach) transferAccountAdditionalData : null;
        if (ach == null || ach.getData() == null) {
            return null;
        }
        return new MAXTransferContext.TransferAccount.ACHTransferAccountMetadata(Booleans2.toProtobuf(Boolean.valueOf(((TransferAccountAdditionalData.Ach) transferAccountAdditionalData).getData().isInstantWithdrawalsEligible())), null, 2, null);
    }

    public static final MAXTransferContext.TransferAccount toProtobuf(ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount) {
        Intrinsics.checkNotNullParameter(apiTransferAccount, "<this>");
        return new MAXTransferContext.TransferAccount(apiTransferAccount.getId(), toProtobuf(apiTransferAccount.getType()), null, null, null, null, 60, null);
    }

    public static final MAXTransferContext.TransferAccount.TransferAccountType toProtobuf(ApiTransferAccount.TransferAccountType transferAccountType) {
        Intrinsics.checkNotNullParameter(transferAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
            case 1:
                return MAXTransferContext.TransferAccount.TransferAccountType.ACH;
            case 2:
                return MAXTransferContext.TransferAccount.TransferAccountType.DCF;
            case 3:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHS;
            case 4:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHY;
            case 5:
                return MAXTransferContext.TransferAccount.TransferAccountType.RHY_BANKING;
            case 6:
                return MAXTransferContext.TransferAccount.TransferAccountType.IRA_ROTH;
            case 7:
                return MAXTransferContext.TransferAccount.TransferAccountType.IRA_TRADITIONAL;
            case 8:
                return MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return MAXTransferContext.TransferAccount.TransferAccountType.TRANSFER_ACCOUNT_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final MAXTransferContext.IRAContributionData toProtobuf(ApiCreateTransferRequest.ApiTransferAdditionalData.IraContributionData iraContributionData) {
        Intrinsics.checkNotNullParameter(iraContributionData, "<this>");
        String serverValue = iraContributionData.getContribution_type().getServerValue();
        Year tax_year = iraContributionData.getTax_year();
        return new MAXTransferContext.IRAContributionData(serverValue, tax_year != null ? tax_year.getValue() : 0, null, 4, null);
    }

    public static final MAXTransferContext.IRADistributionData toProtobuf(ApiCreateTransferRequest.ApiTransferAdditionalData.IraDistributionData iraDistributionData) {
        Intrinsics.checkNotNullParameter(iraDistributionData, "<this>");
        return new MAXTransferContext.IRADistributionData(iraDistributionData.getDistribution_type().getServerValue(), iraDistributionData.getState(), iraDistributionData.getState_tax_withholding_percent().doubleValue(), iraDistributionData.getFederal_tax_withholding_percent().doubleValue(), null, null, 48, null);
    }

    public static final TransferContext.Frequency toProtobuf(ApiCreateTransferRequest2 apiCreateTransferRequest2) {
        Intrinsics.checkNotNullParameter(apiCreateTransferRequest2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[apiCreateTransferRequest2.ordinal()]) {
            case 1:
                return TransferContext.Frequency.ONCE;
            case 2:
                return TransferContext.Frequency.WEEKLY;
            case 3:
                return TransferContext.Frequency.BIWEEKLY;
            case 4:
                return TransferContext.Frequency.MONTHLY;
            case 5:
                return TransferContext.Frequency.QUARTERLY;
            case 6:
                return TransferContext.Frequency.FREQUENCY_TYPE_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

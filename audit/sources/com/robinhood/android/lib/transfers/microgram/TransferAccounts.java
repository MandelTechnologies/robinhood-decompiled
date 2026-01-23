package com.robinhood.android.lib.transfers.microgram;

import com.robinhood.lib.bigdecimalinterop.BigDecimals6;
import com.robinhood.lib.transfers.contracts.models.TransferAccount;
import com.robinhood.lib.transfers.contracts.models.TransferAccountStatus;
import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.Converters4;
import p479j$.time.Instant;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0002\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"toMicrogramTransferAccount", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "toMicrogramTransferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "toMicrogramTransferAccountStatus", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountStatus;", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountStatus;", "toMicrogramEnokiInfo", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount$EnokiInfo;", "Lcom/robinhood/models/db/bonfire/TransferAccount$EnokiInfo;", "toMicrogramMatchRateByTransferType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccount$MatchRateByTransferType;", "Lcom/robinhood/models/db/bonfire/TransferAccount$MatchRateByTransferType;", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.transfers.microgram.TransferAccountsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TransferAccounts {

    /* compiled from: TransferAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.transfers.microgram.TransferAccountsKt$WhenMappings */
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
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 14;
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
            int[] iArr2 = new int[ApiTransferAccount.TransferAccountStatus.values().length];
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.NEEDS_APPROVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.VERIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.NEEDS_VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ApiTransferAccount.TransferAccountStatus.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final TransferAccount toMicrogramTransferAccount(com.robinhood.models.p320db.bonfire.TransferAccount transferAccount) {
        TransferAccount.AchData achData;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        String accountId = transferAccount.getAccountId();
        TransferAccountType microgramTransferAccountType = toMicrogramTransferAccountType(transferAccount.getType());
        TransferAccountStatus microgramTransferAccountStatus = toMicrogramTransferAccountStatus(transferAccount.getStatus());
        String accountName = transferAccount.getAccountName();
        String displayTitle = transferAccount.getDisplayTitle();
        boolean zIsExternal = transferAccount.isExternal();
        boolean zIsDepositsEnabled = transferAccount.isDepositsEnabled();
        boolean zIsWithdrawalsEnabled = transferAccount.isWithdrawalsEnabled();
        Instant creationDate = transferAccount.getCreationDate();
        ArrayList arrayList = null;
        kotlinx.datetime.Instant kotlinInstant = creationDate != null ? Converters4.toKotlinInstant(creationDate) : null;
        BigDecimal withdrawableCash = transferAccount.getWithdrawableCash();
        com.ionspin.kotlin.bignum.decimal.BigDecimal bignumBigDecimal = withdrawableCash != null ? BigDecimals6.toBignumBigDecimal(withdrawableCash) : null;
        TransferAccountAdditionalData additionalData = transferAccount.getAdditionalData();
        TransferAccountAdditionalData.Ach ach = additionalData instanceof TransferAccountAdditionalData.Ach ? (TransferAccountAdditionalData.Ach) additionalData : null;
        if (ach != null) {
            TransferAccountAdditionalData.Ach.Data data = ach.getData();
            achData = new TransferAccount.AchData(data.isInstantWithdrawalsEligible(), data.isRfpEligible());
        } else {
            achData = null;
        }
        TransferAccount.EnokiInfo enokiInfo = transferAccount.getEnokiInfo();
        TransferAccount.EnokiInfo microgramEnokiInfo = enokiInfo != null ? toMicrogramEnokiInfo(enokiInfo) : null;
        List<Money> currencyBalances = transferAccount.getCurrencyBalances();
        if (currencyBalances != null) {
            List<Money> list = currencyBalances;
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Money money : list) {
                com.ionspin.kotlin.bignum.decimal.BigDecimal bignumBigDecimal2 = BigDecimals6.toBignumBigDecimal(money.getDecimalValue());
                String currencyCode = money.getCurrency().getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                arrayList.add(new com.robinhood.lib.transfers.contracts.models.Money(bignumBigDecimal2, currencyCode));
                kotlinInstant = kotlinInstant;
                accountId = accountId;
            }
        }
        return new com.robinhood.lib.transfers.contracts.models.TransferAccount(accountId, microgramTransferAccountType, microgramTransferAccountStatus, accountName, displayTitle, zIsExternal, zIsDepositsEnabled, zIsWithdrawalsEnabled, kotlinInstant, achData, microgramEnokiInfo, bignumBigDecimal, arrayList, transferAccount.isDefaultInternalAccount());
    }

    private static final TransferAccountType toMicrogramTransferAccountType(ApiTransferAccount.TransferAccountType transferAccountType) {
        switch (WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
            case 1:
                return TransferAccountType.ACH;
            case 2:
                return TransferAccountType.DEBIT_CARD;
            case 3:
                return TransferAccountType.RHS;
            case 4:
                return TransferAccountType.RHY;
            case 5:
                return TransferAccountType.RHY_BANKING;
            case 6:
                return TransferAccountType.IRA_ROTH;
            case 7:
                return TransferAccountType.IRA_TRADITIONAL;
            case 8:
                return TransferAccountType.SEPA;
            case 9:
                return TransferAccountType.RHCE;
            case 10:
                return TransferAccountType.UK_BANK_ACCOUNT;
            case 11:
                return TransferAccountType.I18N_BANK_ACCOUNT;
            case 12:
                return TransferAccountType.JOINT_TENANCY_WITH_ROS;
            case 13:
                return TransferAccountType.OUTGOING_WIRE_ACCOUNT;
            case 14:
                return TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES;
            case 15:
                return TransferAccountType.CUSTODIAL_UGMA;
            case 16:
                return TransferAccountType.CUSTODIAL_UTMA;
            case 17:
                return TransferAccountType.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final TransferAccountStatus toMicrogramTransferAccountStatus(ApiTransferAccount.TransferAccountStatus transferAccountStatus) {
        switch (WhenMappings.$EnumSwitchMapping$1[transferAccountStatus.ordinal()]) {
            case 1:
                return TransferAccountStatus.APPROVED;
            case 2:
                return TransferAccountStatus.NEEDS_APPROVAL;
            case 3:
                return TransferAccountStatus.VERIFIED;
            case 4:
                return TransferAccountStatus.NEEDS_VERIFICATION;
            case 5:
                return TransferAccountStatus.PENDING;
            case 6:
                return TransferAccountStatus.UNKNOWN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final TransferAccount.EnokiInfo toMicrogramEnokiInfo(TransferAccount.EnokiInfo enokiInfo) {
        String badgeTitle = enokiInfo.getBadgeTitle();
        String badgeTitleTemplate = enokiInfo.getBadgeTitleTemplate();
        if (badgeTitleTemplate == null) {
            badgeTitleTemplate = "";
        }
        TransferAccount.MatchRateByTransferType matchRateByTransferType = enokiInfo.getMatchRateByTransferType();
        return new TransferAccount.EnokiInfo(badgeTitle, badgeTitleTemplate, matchRateByTransferType != null ? toMicrogramMatchRateByTransferType(matchRateByTransferType) : null);
    }

    private static final TransferAccount.MatchRateByTransferType toMicrogramMatchRateByTransferType(TransferAccount.MatchRateByTransferType matchRateByTransferType) {
        return new TransferAccount.MatchRateByTransferType(BigDecimals6.toBignumBigDecimal(matchRateByTransferType.getAchTransferPercentage()), BigDecimals6.toBignumBigDecimal(matchRateByTransferType.getDirectRolloverPercentage()), BigDecimals6.toBignumBigDecimal(matchRateByTransferType.getIndirectRolloverPercentage()), BigDecimals6.toBignumBigDecimal(matchRateByTransferType.getAcatInPercentage()), BigDecimals6.toBignumBigDecimal(matchRateByTransferType.getInternalAccountTransferPercentage()));
    }
}

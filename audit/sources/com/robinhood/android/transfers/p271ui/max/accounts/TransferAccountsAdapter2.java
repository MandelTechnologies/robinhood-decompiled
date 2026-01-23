package com.robinhood.android.transfers.p271ui.max.accounts;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.banking.util.SpannableUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.accounts.TransferAccountsViewState;
import com.robinhood.android.transfers.p271ui.max.createtransfer.MatchaDisplayInfo;
import com.robinhood.android.transfers.util.Resources2;
import com.robinhood.android.transfers.util.SpannableStringBuilders2;
import com.robinhood.android.transfers.util.TransferAccounts6;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferAccountsAdapter.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aT\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002\u001a \u0010\u0015\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0019"}, m3636d2 = {"iconRes", "", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "getIconRes", "(Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;)Ljava/lang/Integer;", "getSecondaryText", "", "Lcom/robinhood/android/transfers/ui/max/accounts/TransferAccountsViewState$AccountTransferDisplayData;", "context", "Landroid/content/Context;", "transactingAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "", "isOutgoingWire", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "getEnokiSecondaryText", "enokiBadgeTitle", "", "secondaryText", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapterKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccountsAdapter2 {

    /* compiled from: TransferAccountsAdapter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.accounts.TransferAccountsAdapterKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final CharSequence getEnokiSecondaryText(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableStringBuilders2.appendRetirementBadgeText(spannableStringBuilder, context, str);
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " · ");
            spannableStringBuilder.append((CharSequence) str2);
        }
        return new SpannedString(spannableStringBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer getIconRes(ApiTransferAccount.TransferAccountType transferAccountType) {
        switch (WhenMappings.$EnumSwitchMapping$0[transferAccountType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return Integer.valueOf(C20690R.drawable.ic_rds_banking_24dp);
            case 6:
                return Integer.valueOf(C30065R.drawable.ic_card_24dp);
            case 7:
                return Integer.valueOf(C20690R.drawable.ic_rds_chart_line_24dp);
            case 8:
                return Integer.valueOf(C20690R.drawable.ic_rds_cash_24dp);
            case 9:
            case 10:
            case 11:
                return Integer.valueOf(C20690R.drawable.ic_rds_retirement_24dp);
            case 12:
                return Integer.valueOf(C20690R.drawable.ic_rds_joint_account_24dp);
            case 13:
                return Integer.valueOf(C20690R.drawable.ic_rds_crypto_24dp);
            case 14:
            case 15:
                return Integer.valueOf(C20690R.drawable.ic_rds_custodial_24dp);
            case 16:
            case 17:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ CharSequence getSecondaryText$default(TransferAccountsViewState.AccountTransferDisplayData accountTransferDisplayData, Context context, TransferAccount transferAccount, TransferAccountDirection transferAccountDirection, IraContributionType iraContributionType, boolean z, boolean z2, MatchRateBreakdown matchRateBreakdown, int i, Object obj) {
        if ((i & 2) != 0) {
            transferAccount = null;
        }
        if ((i & 4) != 0) {
            transferAccountDirection = null;
        }
        if ((i & 8) != 0) {
            iraContributionType = null;
        }
        return getSecondaryText(accountTransferDisplayData, context, transferAccount, transferAccountDirection, iraContributionType, z, z2, matchRateBreakdown);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getSecondaryText(TransferAccountsViewState.AccountTransferDisplayData accountTransferDisplayData, Context context, TransferAccount transferAccount, TransferAccountDirection transferAccountDirection, IraContributionType iraContributionType, boolean z, boolean z2, MatchRateBreakdown matchRateBreakdown) throws Resources.NotFoundException {
        int i;
        Resources resources = context.getResources();
        MatchaDisplayInfo matchaDisplayInfoFromServiceFeeDisplayText = MatchaDisplayInfo.INSTANCE.fromServiceFeeDisplayText(context, accountTransferDisplayData.getServiceFeeDisplayText());
        TransferAccountDirection transferAccountDirection2 = TransferAccountDirection.SINK;
        if (transferAccountDirection == transferAccountDirection2 && TransferAccounts2.isRtpEligibleSource(transferAccount) && TransferAccounts2.isRtpEligible(accountTransferDisplayData.getAccount()) && !z2) {
            Intrinsics.checkNotNull(resources);
            return Resources2.getInstantEligibleAchSecondaryText(resources, context, matchaDisplayInfoFromServiceFeeDisplayText);
        }
        if (accountTransferDisplayData.getAccount().getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
            Intrinsics.checkNotNull(resources);
            return Resources2.getDebitCardSecondaryText(resources, context, accountTransferDisplayData.getAccount(), null, transferAccountDirection, matchaDisplayInfoFromServiceFeeDisplayText);
        }
        String string2 = null;
        if (accountTransferDisplayData.getAccount().isExternal() && !z) {
            TransferAccount.EnokiInfo enokiInfo = accountTransferDisplayData.getAccount().getEnokiInfo();
            String badgeTitle = enokiInfo != null ? enokiInfo.getBadgeTitle() : null;
            if (iraContributionType != null && iraContributionType.isMatchEligible() && transferAccountDirection == TransferAccountDirection.SOURCE && transferAccount != null && transferAccount.isIra() && badgeTitle != null) {
                return getEnokiSecondaryText$default(context, badgeTitle, null, 2, null);
            }
            return accountTransferDisplayData.getAccount().getAccountNumber();
        }
        if (accountTransferDisplayData.getAccount().getType() == ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) resources.getString(C30065R.string.uk_bank_account_formatted_instant_transfers_text));
            SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorForeground2), 0);
            return new SpannedString(spannableStringBuilder);
        }
        BigDecimal withdrawableCash = accountTransferDisplayData.getAccount().getWithdrawableCash();
        if (withdrawableCash != null) {
            if (accountTransferDisplayData.getAccount().getType() == ApiTransferAccount.TransferAccountType.RHY) {
                i = C30065R.string.transfer_account_cash_balance;
            } else {
                i = C30065R.string.transfer_account_withdrawable_cash;
            }
            String string3 = resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            string2 = resources.getString(C30065R.string.transfer_account_balance_format, string3, Formats.getAmountFormat().format(withdrawableCash));
        }
        String matchRateBadgeForContributionType$default = TransferAccounts6.getMatchRateBadgeForContributionType$default(accountTransferDisplayData.getAccount(), iraContributionType == null ? IraContributionType.ONE_TIME_CONTRIBUTION : iraContributionType, (transferAccount == null || transferAccount.isExternal()) ? false : true, matchRateBreakdown, false, 8, null);
        return ((iraContributionType == null || iraContributionType.isMatchEligible()) && transferAccountDirection == transferAccountDirection2 && ((transferAccount != null && transferAccount.isEnokiEnabled()) || z) && matchRateBadgeForContributionType$default != null) ? getEnokiSecondaryText(context, matchRateBadgeForContributionType$default, string2) : string2;
    }

    static /* synthetic */ CharSequence getEnokiSecondaryText$default(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return getEnokiSecondaryText(context, str, str2);
    }
}

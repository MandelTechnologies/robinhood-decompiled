package com.robinhood.android.transfers.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.p271ui.max.createtransfer.MatchaDisplayInfo;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u001a0\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r\u001a4\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002¨\u0006\u001c"}, m3636d2 = {"getValueText", "", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "context", "Landroid/content/Context;", "otherAccount", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "serviceFee", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "iraContributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "isInInterEntityMatchExperiment", "", "isOutgoingWire", "matchaDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/createtransfer/MatchaDisplayInfo;", "getMatchRateBadgeForContributionType", "", "contributionType", "isInternalTransfer", "matchRateOverrideValues", "Lcom/robinhood/android/models/retirement/db/MatchRateBreakdown;", "isManaged", "getDynamicMatchBadge", "matchRates", "Lcom/robinhood/models/db/bonfire/TransferAccount$MatchRateByTransferType;", "badgeTitleTemplate", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.util.TransferAccountsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAccounts6 {

    /* compiled from: TransferAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.util.TransferAccountsKt$WhenMappings */
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
                iArr[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 9;
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
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UGMA.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.CUSTODIAL_UTMA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IraContributionType.values().length];
            try {
                iArr2[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[IraContributionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final CharSequence getValueText(TransferAccount transferAccount, Context context, TransferAccount transferAccount2, TransferAccountDirection direction, ApiServiceFeeResponse apiServiceFeeResponse, IraContributionType iraContributionType, boolean z, boolean z2, MatchaDisplayInfo matchaDisplayInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(direction, "direction");
        ApiTransferAccount.TransferAccountType type2 = transferAccount != null ? transferAccount.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (matchaDisplayInfo == null || z2) {
                    return null;
                }
                Resources resources = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return Resources2.getInstantEligibleAchSecondaryText(resources, context, matchaDisplayInfo);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 6:
                if (matchaDisplayInfo == null || z2) {
                    return null;
                }
                Resources resources2 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                return Resources2.getInstantEligibleAchSecondaryText(resources2, context, matchaDisplayInfo);
            case 7:
            case 8:
                if (iraContributionType != null && iraContributionType.isMatchEligible() && direction == TransferAccountDirection.SINK && ((transferAccount2 != null && transferAccount2.isEnokiEnabled()) || z)) {
                    boolean z3 = false;
                    if (transferAccount2 != null && !transferAccount2.isExternal()) {
                        z3 = true;
                    }
                    String matchRateBadgeForContributionType$default = getMatchRateBadgeForContributionType$default(transferAccount, iraContributionType, z3, null, false, 8, null);
                    if (matchRateBadgeForContributionType$default != null) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        SpannableStringBuilders2.appendRetirementBadgeText(spannableStringBuilder, context, matchRateBadgeForContributionType$default);
                        return new SpannedString(spannableStringBuilder);
                    }
                }
                return null;
            case 9:
                Resources resources3 = context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                return Resources2.getDebitCardSecondaryText(resources3, context, transferAccount, apiServiceFeeResponse, direction, matchaDisplayInfo);
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return null;
        }
    }

    public static /* synthetic */ String getMatchRateBadgeForContributionType$default(TransferAccount transferAccount, IraContributionType iraContributionType, boolean z, MatchRateBreakdown matchRateBreakdown, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        return getMatchRateBadgeForContributionType(transferAccount, iraContributionType, z, matchRateBreakdown, z2);
    }

    public static final String getMatchRateBadgeForContributionType(TransferAccount transferAccount, IraContributionType contributionType, boolean z, MatchRateBreakdown matchRateBreakdown, boolean z2) {
        TransferAccount.EnokiInfo enokiInfo;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(contributionType, "contributionType");
        if (z2 || (enokiInfo = transferAccount.getEnokiInfo()) == null) {
            return null;
        }
        TransferAccount.MatchRateByTransferType matchRateByTransferType = enokiInfo.getMatchRateByTransferType();
        String badgeTitleTemplate = enokiInfo.getBadgeTitleTemplate();
        if (matchRateByTransferType != null && badgeTitleTemplate != null) {
            return getDynamicMatchBadge(matchRateByTransferType, badgeTitleTemplate, contributionType, z, matchRateBreakdown);
        }
        return enokiInfo.getBadgeTitle();
    }

    private static final String getDynamicMatchBadge(TransferAccount.MatchRateByTransferType matchRateByTransferType, String str, IraContributionType iraContributionType, boolean z, MatchRateBreakdown matchRateBreakdown) {
        BigDecimal achTransferPercentage;
        String string2;
        BigDecimal internalAccountTransferPercentage;
        BigDecimal indirectRolloverPercentage;
        int i = WhenMappings.$EnumSwitchMapping$1[iraContributionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal indirectRolloverPercentage2 = matchRateByTransferType.getIndirectRolloverPercentage();
            if (matchRateBreakdown == null || (indirectRolloverPercentage = matchRateBreakdown.getIndirectRolloverPercentage()) == null) {
                indirectRolloverPercentage = BigDecimal.ZERO;
            }
            string2 = indirectRolloverPercentage2.max(indirectRolloverPercentage).toString();
        } else if (z) {
            BigDecimal internalAccountTransferPercentage2 = matchRateByTransferType.getInternalAccountTransferPercentage();
            if (matchRateBreakdown == null || (internalAccountTransferPercentage = matchRateBreakdown.getInternalAccountTransferPercentage()) == null) {
                internalAccountTransferPercentage = BigDecimal.ZERO;
            }
            string2 = internalAccountTransferPercentage2.max(internalAccountTransferPercentage).toString();
        } else {
            BigDecimal achTransferPercentage2 = matchRateByTransferType.getAchTransferPercentage();
            if (matchRateBreakdown == null || (achTransferPercentage = matchRateBreakdown.getAchTransferPercentage()) == null) {
                achTransferPercentage = BigDecimal.ZERO;
            }
            string2 = achTransferPercentage2.max(achTransferPercentage).toString();
        }
        String str2 = string2;
        Intrinsics.checkNotNull(str2);
        return StringsKt.replace$default(str, "MATCH_RATE", str2, false, 4, (Object) null);
    }
}

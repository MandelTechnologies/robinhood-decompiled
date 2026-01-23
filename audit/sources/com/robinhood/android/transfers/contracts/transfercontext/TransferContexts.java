package com.robinhood.android.transfers.contracts.transfercontext;

import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferContexts.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m3636d2 = {"toTransferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext;", "toTransferFrequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "Lcom/robinhood/models/api/ApiAutomaticDeposit$Frequency;", "toTransferAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "Lcom/robinhood/android/transfers/contracts/transfercontext/TransferContext$RobinhoodAccountType;", "contracts_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.contracts.transfercontext.TransferContextsKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferContexts {

    /* compiled from: TransferContexts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.contracts.transfercontext.TransferContextsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ApiAutomaticDeposit.Frequency.values().length];
            try {
                iArr[ApiAutomaticDeposit.Frequency.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiAutomaticDeposit.Frequency.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferContext.RobinhoodAccountType.values().length];
            try {
                iArr2[TransferContext.RobinhoodAccountType.BROKERAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TransferContext.RobinhoodAccountType.SPENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[TransferContext.RobinhoodAccountType.RHS_ROTH_IRA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[TransferContext.RobinhoodAccountType.RHS_TRADITIONAL_IRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[TransferContext.RobinhoodAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final TransferConfiguration toTransferConfiguration(TransferContext transferContext) {
        ApiCreateTransferRequest2 apiCreateTransferRequest2;
        Intrinsics.checkNotNullParameter(transferContext, "<this>");
        if (transferContext instanceof TransferContext.Normal) {
            TransferContext.Normal normal = (TransferContext.Normal) transferContext;
            if (normal.getDirection() == TransferDirection.DEPOSIT) {
                String str = null;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                String str2 = null;
                String str3 = null;
                boolean z4 = false;
                return new TransferConfiguration.Standard(normal.getRecommendedAmount(), null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(str, z, toTransferAccountType(normal.getAccountType()), 3, null), null, null, 0 == true ? 1 : 0, z2, z3, str2, str3, z4, 8166, null);
            }
            String str4 = null;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            String str5 = null;
            String str6 = null;
            boolean z8 = false;
            return new TransferConfiguration.Standard(normal.getRecommendedAmount(), null, false, new TransferConfiguration.TransferAccountSelection(null, false, toTransferAccountType(normal.getAccountType()), 3, null), new TransferConfiguration.TransferAccountSelection(str4, z5, ApiTransferAccount.TransferAccountType.ACH, 3, null), null, null, 0 == true ? 1 : 0, z6, z7, str5, str6, z8, 8166, null);
        }
        if (transferContext instanceof TransferContext.MarginDeposit) {
            TransferContext.MarginDeposit marginDeposit = (TransferContext.MarginDeposit) transferContext;
            BigDecimal recommendedAmount = marginDeposit.getRecommendedAmount();
            BigDecimal minAmount = marginDeposit.getMinAmount();
            Intrinsics.checkNotNull(minAmount);
            return new TransferConfiguration.MarginDeposit(recommendedAmount, minAmount, MAXTransferContext.EntryPoint.MARGIN_HUB, null, 8, null);
        }
        int i = 2;
        if (transferContext instanceof TransferContext.DayTradeCall) {
            return new TransferConfiguration.DayTradeCall(((TransferContext.DayTradeCall) transferContext).getRecommendedAmount(), false, i, null);
        }
        if (transferContext instanceof TransferContext.MarginCallPrevention) {
            return new TransferConfiguration.MarginCallPrevention(((TransferContext.MarginCallPrevention) transferContext).getRecommendedAmount(), false, null, null, null, null, 62, null);
        }
        if (transferContext instanceof TransferContext.MarginResolution) {
            TransferContext.MarginResolution marginResolution = (TransferContext.MarginResolution) transferContext;
            return new TransferConfiguration.MarginResolution(marginResolution.getRecommendedAmount(), marginResolution.getMinAmount(), false, null, null, 28, null);
        }
        if (transferContext instanceof TransferContext.RecurringInsufficientBuyingPower) {
            TransferContext.RecurringInsufficientBuyingPower recurringInsufficientBuyingPower = (TransferContext.RecurringInsufficientBuyingPower) transferContext;
            return new TransferConfiguration.RecurringInsufficientBuyingPower(recurringInsufficientBuyingPower.getRecommendedAmount(), recurringInsufficientBuyingPower.getInvestmentScheduleFrequency());
        }
        if (transferContext instanceof TransferContext.DepositDeepLink) {
            TransferContext.DepositDeepLink depositDeepLink = (TransferContext.DepositDeepLink) transferContext;
            BigDecimal recommendedAmount2 = depositDeepLink.getRecommendedAmount();
            TransferConfiguration.TransferAccountSelection transferAccountSelection = new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null);
            TransferConfiguration.TransferAccountSelection transferAccountSelection2 = new TransferConfiguration.TransferAccountSelection(null, false, toTransferAccountType(depositDeepLink.getAccountType()), 3, null);
            int i2 = WhenMappings.$EnumSwitchMapping$0[depositDeepLink.getRecommendedFrequency().ordinal()];
            if (i2 == 1) {
                apiCreateTransferRequest2 = ApiCreateTransferRequest2.ONCE;
            } else if (i2 == 2) {
                apiCreateTransferRequest2 = ApiCreateTransferRequest2.WEEKLY;
            } else if (i2 == 3) {
                apiCreateTransferRequest2 = ApiCreateTransferRequest2.BIWEEKLY;
            } else if (i2 == 4) {
                apiCreateTransferRequest2 = ApiCreateTransferRequest2.MONTHLY;
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                apiCreateTransferRequest2 = ApiCreateTransferRequest2.QUARTERLY;
            }
            return new TransferConfiguration.Standard(recommendedAmount2, apiCreateTransferRequest2, false, transferAccountSelection, transferAccountSelection2, null, null, null, false, false, null, null, false, 8164, null);
        }
        if (transferContext instanceof TransferContext.RecommendedDeposit) {
            String str7 = null;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            String str8 = null;
            String str9 = null;
            boolean z12 = false;
            return new TransferConfiguration.Standard(((TransferContext.RecommendedDeposit) transferContext).getRecommendedAmount(), null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(str7, z9, ApiTransferAccount.TransferAccountType.RHS, 3, null), null, null, 0 == true ? 1 : 0, z10, z11, str8, str9, z12, 8166, null);
        }
        if (transferContext instanceof TransferContext.RecommendationsOrderDeposit) {
            String str10 = null;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            String str11 = null;
            String str12 = null;
            boolean z16 = false;
            return new TransferConfiguration.Standard(((TransferContext.RecommendationsOrderDeposit) transferContext).getRecommendedAmount(), null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(str10, z13, ApiTransferAccount.TransferAccountType.RHS, 3, null), null, null, 0 == true ? 1 : 0, z14, z15, str11, str12, z16, 8166, null);
        }
        if (!(transferContext instanceof TransferContext.AutomaticDeposit) && !(transferContext instanceof TransferContext.QueuedDeposit) && !(transferContext instanceof TransferContext.RecurringDepositFromOnboarding) && !(transferContext instanceof TransferContext.NormalIav)) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Unimplemented");
    }

    public static final ApiCreateTransferRequest2 toTransferFrequency(ApiAutomaticDeposit.Frequency frequency) {
        Intrinsics.checkNotNullParameter(frequency, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            return ApiCreateTransferRequest2.ONCE;
        }
        if (i == 2) {
            return ApiCreateTransferRequest2.WEEKLY;
        }
        if (i == 3) {
            return ApiCreateTransferRequest2.BIWEEKLY;
        }
        if (i == 4) {
            return ApiCreateTransferRequest2.MONTHLY;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiCreateTransferRequest2.QUARTERLY;
    }

    public static final ApiTransferAccount.TransferAccountType toTransferAccountType(TransferContext.RobinhoodAccountType robinhoodAccountType) {
        Intrinsics.checkNotNullParameter(robinhoodAccountType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[robinhoodAccountType.ordinal()];
        if (i == 1) {
            return ApiTransferAccount.TransferAccountType.RHS;
        }
        if (i == 2) {
            return ApiTransferAccount.TransferAccountType.RHY;
        }
        if (i == 3) {
            return ApiTransferAccount.TransferAccountType.IRA_ROTH;
        }
        if (i == 4) {
            return ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS;
    }
}

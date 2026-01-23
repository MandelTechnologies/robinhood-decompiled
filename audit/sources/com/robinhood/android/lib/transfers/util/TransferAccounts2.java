package com.robinhood.android.lib.transfers.util;

import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: TransferAccounts.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\b\u0012\u0004\u0012\u00020\u00000\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001c\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010\u001e\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001d\"\u0017\u0010\u001f\u001a\u00020\u0005*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d\"\u0017\u0010 \u001a\u00020\u0005*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u001d¨\u0006!"}, m3636d2 = {"Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "j$/time/Year", "systemCalendarYear", "", "isEligibleRecurringDepositsSink", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult;Lj$/time/Year;)Z", "", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "transferAccountDirection", "filterForRecurringDepositsEligibility", "(Ljava/util/List;Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;)Ljava/util/List;", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "iraContributionType", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getDefaultContributionInfo", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/IraContributionType;Lj$/time/Year;)Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;", "preselection", "preselectionPredicate", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/TransferConfiguration$TransferAccountSelection;)Z", "", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "RecurringDepositEligibleSources", "Ljava/util/Set;", "getRecurringDepositEligibleSources", "()Ljava/util/Set;", "isRtpEligible", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Z", "isRfpEligible", "isRtpEligibleSource", "isRfpEligibleSink", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.transfers.util.TransferAccountsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TransferAccounts2 {
    private static final Set<ApiTransferAccount.TransferAccountType> RecurringDepositEligibleSources = SetsKt.setOf((Object[]) new ApiTransferAccount.TransferAccountType[]{ApiTransferAccount.TransferAccountType.IRA_ROTH, ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL, ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS, ApiTransferAccount.TransferAccountType.RHS, ApiTransferAccount.TransferAccountType.RHY});

    /* compiled from: TransferAccounts.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.transfers.util.TransferAccountsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 1;
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
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.ACH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.DEBIT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHY_BANKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.SEPA.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.UK_BANK_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.I18N_BANK_ACCOUNT.ordinal()] = 12;
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
            int[] iArr2 = new int[TransferAccountDirection.values().length];
            try {
                iArr2[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[IraContributionType.values().length];
            try {
                iArr3[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final boolean isEligibleRecurringDepositsSink(TransferAccount transferAccount, IraContributionQuestionnaireResult iraContributionQuestionnaireResult, Year systemCalendarYear) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        if (transferAccount.isIra()) {
            return transferAccount.isEligibleRecurringDepositsSink() && (iraContributionQuestionnaireResult instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) && Intrinsics.areEqual(((IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) iraContributionQuestionnaireResult).getTaxYear(), systemCalendarYear);
        }
        return transferAccount.isEligibleRecurringDepositsSink();
    }

    public static final boolean isRtpEligible(TransferAccount transferAccount) {
        TransferAccountAdditionalData.Ach.Data data;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        TransferAccountAdditionalData additionalData = transferAccount.getAdditionalData();
        TransferAccountAdditionalData.Ach ach = additionalData instanceof TransferAccountAdditionalData.Ach ? (TransferAccountAdditionalData.Ach) additionalData : null;
        return (ach == null || (data = ach.getData()) == null || !data.isInstantWithdrawalsEligible()) ? false : true;
    }

    public static final boolean isRfpEligible(TransferAccount transferAccount) {
        TransferAccountAdditionalData.Ach.Data data;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        TransferAccountAdditionalData additionalData = transferAccount.getAdditionalData();
        TransferAccountAdditionalData.Ach ach = additionalData instanceof TransferAccountAdditionalData.Ach ? (TransferAccountAdditionalData.Ach) additionalData : null;
        return (ach == null || (data = ach.getData()) == null || !data.isRfpEligible()) ? false : true;
    }

    public static final boolean isRtpEligibleSource(TransferAccount transferAccount) {
        ManagementInfo managementInfo;
        if (((transferAccount == null || (managementInfo = transferAccount.getManagementInfo()) == null) ? null : managementInfo.getManagement_type()) == ManagementType.MANAGED) {
            return false;
        }
        ApiTransferAccount.TransferAccountType type2 = transferAccount != null ? transferAccount.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public static final boolean isRfpEligibleSink(TransferAccount transferAccount) {
        ApiTransferAccount.TransferAccountType type2 = transferAccount != null ? transferAccount.getType() : null;
        int i = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        return i == 1 || i == 2;
    }

    public static final List<TransferAccount> filterForRecurringDepositsEligibility(List<TransferAccount> list, TransferAccountDirection transferAccountDirection) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(transferAccountDirection, "transferAccountDirection");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            TransferAccount transferAccount = (TransferAccount) obj;
            int i = WhenMappings.$EnumSwitchMapping$1[transferAccountDirection.ordinal()];
            boolean zContains = true;
            if (i == 1) {
                if (transferAccount.getType() != ApiTransferAccount.TransferAccountType.ACH) {
                    zContains = false;
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zContains = RecurringDepositEligibleSources.contains(transferAccount.getType());
            }
            if (zContains) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Set<ApiTransferAccount.TransferAccountType> getRecurringDepositEligibleSources() {
        return RecurringDepositEligibleSources;
    }

    public static /* synthetic */ IraContributionQuestionnaireResult.IraContribution getDefaultContributionInfo$default(TransferAccount transferAccount, IraContributionType iraContributionType, Year year, int i, Object obj) {
        if ((i & 1) != 0) {
            iraContributionType = null;
        }
        return getDefaultContributionInfo(transferAccount, iraContributionType, year);
    }

    public static final IraContributionQuestionnaireResult.IraContribution getDefaultContributionInfo(TransferAccount transferAccount, IraContributionType iraContributionType, Year systemCalendarYear) {
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(systemCalendarYear, "systemCalendarYear");
        switch (WhenMappings.$EnumSwitchMapping$0[transferAccount.getType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return null;
            case 4:
            case 5:
                if ((iraContributionType == null ? -1 : WhenMappings.$EnumSwitchMapping$2[iraContributionType.ordinal()]) == 1) {
                    return new IraContributionQuestionnaireResult.IraContribution.IndirectRollover(transferAccount);
                }
                return new IraContributionQuestionnaireResult.IraContribution.OneTimeContribution(transferAccount, systemCalendarYear, null, 4, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean preselectionPredicate(TransferAccount transferAccount, TransferConfiguration.TransferAccountSelection preselection) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        Intrinsics.checkNotNullParameter(preselection, "preselection");
        if (transferAccount.getStatus() == ApiTransferAccount.TransferAccountStatus.APPROVED) {
            if (preselection.getId() == null && preselection.getType() != null) {
                if (transferAccount.getType() != preselection.getType() || transferAccount.isManaged()) {
                }
            } else if (preselection.getId() != null && preselection.getType() == null) {
                zAreEqual = Intrinsics.areEqual(transferAccount.getAccountId(), preselection.getId());
            } else {
                zAreEqual = preselection.getId() != null && preselection.getType() != null && transferAccount.getType() == preselection.getType() && Intrinsics.areEqual(transferAccount.getAccountId(), preselection.getId());
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }
}

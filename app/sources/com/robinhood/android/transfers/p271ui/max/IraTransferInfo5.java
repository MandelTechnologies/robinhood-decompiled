package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionStateProvider;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.IraDistributionType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Year;

/* compiled from: IraTransferInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "", "RothConversion", "Contribution", "Distribution", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$Contribution;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$Distribution;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$RothConversion;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoState, reason: use source file name */
/* loaded from: classes9.dex */
public interface IraTransferInfo5 {

    /* compiled from: IraTransferInfo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$RothConversion;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "taxYearValue", "", "withdrawalReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaxYearValue", "()Ljava/lang/String;", "getWithdrawalReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoState$RothConversion, reason: from toString */
    public static final /* data */ class RothConversion implements IraTransferInfo5 {
        public static final int $stable = 0;
        private final String taxYearValue;
        private final String withdrawalReason;

        public static /* synthetic */ RothConversion copy$default(RothConversion rothConversion, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = rothConversion.taxYearValue;
            }
            if ((i & 2) != 0) {
                str2 = rothConversion.withdrawalReason;
            }
            return rothConversion.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTaxYearValue() {
            return this.taxYearValue;
        }

        /* renamed from: component2, reason: from getter */
        public final String getWithdrawalReason() {
            return this.withdrawalReason;
        }

        public final RothConversion copy(String taxYearValue, String withdrawalReason) {
            Intrinsics.checkNotNullParameter(taxYearValue, "taxYearValue");
            Intrinsics.checkNotNullParameter(withdrawalReason, "withdrawalReason");
            return new RothConversion(taxYearValue, withdrawalReason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RothConversion)) {
                return false;
            }
            RothConversion rothConversion = (RothConversion) other;
            return Intrinsics.areEqual(this.taxYearValue, rothConversion.taxYearValue) && Intrinsics.areEqual(this.withdrawalReason, rothConversion.withdrawalReason);
        }

        public int hashCode() {
            return (this.taxYearValue.hashCode() * 31) + this.withdrawalReason.hashCode();
        }

        public String toString() {
            return "RothConversion(taxYearValue=" + this.taxYearValue + ", withdrawalReason=" + this.withdrawalReason + ")";
        }

        public RothConversion(String taxYearValue, String withdrawalReason) {
            Intrinsics.checkNotNullParameter(taxYearValue, "taxYearValue");
            Intrinsics.checkNotNullParameter(withdrawalReason, "withdrawalReason");
            this.taxYearValue = taxYearValue;
            this.withdrawalReason = withdrawalReason;
        }

        public final String getTaxYearValue() {
            return this.taxYearValue;
        }

        public final String getWithdrawalReason() {
            return this.withdrawalReason;
        }
    }

    /* compiled from: IraTransferInfo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u000bR\u0011\u0010\u001c\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010 \u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$Contribution;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "value", "", "isRecurring", "<init>", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Z)V", "component1", "()Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "component2", "()Z", "copy", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;Z)Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$Contribution;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getValue", "Z", "getContributionRowValueRes", "contributionRowValueRes", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "getCurrentContributionType", "()Lcom/robinhood/models/api/bonfire/IraContributionType;", "currentContributionType", "j$/time/Year", "getTaxYear", "()Lj$/time/Year;", "taxYear", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoState$Contribution, reason: from toString */
    public static final /* data */ class Contribution implements IraTransferInfo5 {
        public static final int $stable = 8;
        private final boolean isRecurring;
        private final IraContributionQuestionnaireResult.IraContribution value;

        public static /* synthetic */ Contribution copy$default(Contribution contribution, IraContributionQuestionnaireResult.IraContribution iraContribution, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                iraContribution = contribution.value;
            }
            if ((i & 2) != 0) {
                z = contribution.isRecurring;
            }
            return contribution.copy(iraContribution, z);
        }

        /* renamed from: component1, reason: from getter */
        public final IraContributionQuestionnaireResult.IraContribution getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsRecurring() {
            return this.isRecurring;
        }

        public final Contribution copy(IraContributionQuestionnaireResult.IraContribution value, boolean isRecurring) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Contribution(value, isRecurring);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contribution)) {
                return false;
            }
            Contribution contribution = (Contribution) other;
            return Intrinsics.areEqual(this.value, contribution.value) && this.isRecurring == contribution.isRecurring;
        }

        public int hashCode() {
            return (this.value.hashCode() * 31) + Boolean.hashCode(this.isRecurring);
        }

        public String toString() {
            return "Contribution(value=" + this.value + ", isRecurring=" + this.isRecurring + ")";
        }

        public Contribution(IraContributionQuestionnaireResult.IraContribution value, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.isRecurring = z;
        }

        public final IraContributionQuestionnaireResult.IraContribution getValue() {
            return this.value;
        }

        public final boolean isRecurring() {
            return this.isRecurring;
        }

        public final int getContributionRowValueRes() {
            return CreateRetirementContributionStateProvider.INSTANCE.getTextRes(this.value);
        }

        public final IraContributionType getCurrentContributionType() {
            IraContributionQuestionnaireResult.IraContribution iraContribution = this.value;
            if (iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) {
                return IraContributionType.INDIRECT_ROLLOVER;
            }
            if (!(iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution)) {
                throw new NoWhenBranchMatchedException();
            }
            return IraContributionType.ONE_TIME_CONTRIBUTION;
        }

        public final Year getTaxYear() {
            IraContributionQuestionnaireResult.IraContribution iraContribution = this.value;
            IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution = iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution ? (IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) iraContribution : null;
            if (oneTimeContribution != null) {
                return oneTimeContribution.getTaxYear();
            }
            return null;
        }
    }

    /* compiled from: IraTransferInfo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\rHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState$Distribution;", "Lcom/robinhood/android/transfers/ui/max/IraTransferInfoState;", "value", "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "withholding", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$ShowIraDistributionTaxWithholdingInfo;", "<init>", "(Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$ShowIraDistributionTaxWithholdingInfo;)V", "getValue", "()Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "getWithholding", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$ShowIraDistributionTaxWithholdingInfo;", "distributionRowValueRes", "", "getDistributionRowValueRes", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoState$Distribution, reason: from toString */
    public static final /* data */ class Distribution implements IraTransferInfo5 {
        public static final int $stable = 8;
        private final IraDistributionQuestionnaireResult.IraDistribution value;
        private final CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo withholding;

        /* compiled from: IraTransferInfo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.max.IraTransferInfoState$Distribution$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
                try {
                    iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[IraDistributionType.values().length];
                try {
                    iArr2[IraDistributionType.EARLY.ordinal()] = 1;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr2[IraDistributionType.NORMAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[IraDistributionType.QUALIFIED_ROTH.ordinal()] = 3;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[IraDistributionType.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public static /* synthetic */ Distribution copy$default(Distribution distribution, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                iraDistribution = distribution.value;
            }
            if ((i & 2) != 0) {
                showIraDistributionTaxWithholdingInfo = distribution.withholding;
            }
            return distribution.copy(iraDistribution, showIraDistributionTaxWithholdingInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final IraDistributionQuestionnaireResult.IraDistribution getValue() {
            return this.value;
        }

        /* renamed from: component2, reason: from getter */
        public final CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo getWithholding() {
            return this.withholding;
        }

        public final Distribution copy(IraDistributionQuestionnaireResult.IraDistribution value, CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo withholding) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Distribution(value, withholding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Distribution)) {
                return false;
            }
            Distribution distribution = (Distribution) other;
            return Intrinsics.areEqual(this.value, distribution.value) && Intrinsics.areEqual(this.withholding, distribution.withholding);
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo = this.withholding;
            return iHashCode + (showIraDistributionTaxWithholdingInfo == null ? 0 : showIraDistributionTaxWithholdingInfo.hashCode());
        }

        public String toString() {
            return "Distribution(value=" + this.value + ", withholding=" + this.withholding + ")";
        }

        public Distribution(IraDistributionQuestionnaireResult.IraDistribution value, CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo showIraDistributionTaxWithholdingInfo) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.withholding = showIraDistributionTaxWithholdingInfo;
        }

        public final IraDistributionQuestionnaireResult.IraDistribution getValue() {
            return this.value;
        }

        public final CreateTransferViewState.ShowIraDistributionTaxWithholdingInfo getWithholding() {
            return this.withholding;
        }

        public final int getDistributionRowValueRes() {
            int i = WhenMappings.$EnumSwitchMapping$1[this.value.getDistributionType().ordinal()];
            if (i == 1) {
                return C30065R.string.transfer_ira_distribution_type_early;
            }
            if (i == 2) {
                if (WhenMappings.$EnumSwitchMapping$0[this.value.getTransferAccount().getType().ordinal()] == 1) {
                    return C30065R.string.transfer_ira_distribution_type_normal_roth;
                }
                return C30065R.string.transfer_ira_distribution_type_normal;
            }
            if (i == 3) {
                return C30065R.string.transfer_ira_distribution_type_qualified_roth;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Unknown distribution types should be filtered out");
        }
    }
}

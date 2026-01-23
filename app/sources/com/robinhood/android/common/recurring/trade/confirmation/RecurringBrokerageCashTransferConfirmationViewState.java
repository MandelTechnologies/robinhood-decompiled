package com.robinhood.android.common.recurring.trade.confirmation;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.recurring.trade.confirmation.RecurringOrderConfirmationViewState;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountType;

/* compiled from: RecurringBrokerageCashTransferConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÂ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÂ\u0003J?\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringBrokerageCashTransferConfirmationViewState;", "", Card.Icon.ORDER, "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "accountType", "Lrosetta/account/BrokerageAccountType;", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "paycheckRecurringBrokerageCashStatus", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;", "<init>", "(Lcom/robinhood/recurring/models/db/InvestmentSchedule;Lcom/robinhood/recurring/models/InvestmentScheduleAmount;Lrosetta/account/BrokerageAccountType;Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration$PaycheckRecurringBrokerageCashStatus;)V", "investmentScheduleState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$InvestmentScheduleState;", "description", "Lcom/robinhood/utils/resource/StringResource;", "getDescription", "()Lcom/robinhood/utils/resource/StringResource;", "secondaryButtonState", "Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "getSecondaryButtonState", "()Lcom/robinhood/android/common/recurring/trade/confirmation/RecurringOrderConfirmationViewState$SecondaryButtonState;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringBrokerageCashTransferConfirmationViewState {
    public static final int $stable = 8;
    private final BrokerageAccountType accountType;
    private final InvestmentScheduleAmount amount;
    private final RecurringOrderConfirmationViewState.InvestmentScheduleState investmentScheduleState;
    private final InvestmentSchedule order;
    private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus;
    private final RetirementMatchRate retirementMatchRate;

    /* compiled from: RecurringBrokerageCashTransferConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.Frequency.values().length];
            try {
                iArr[ApiInvestmentSchedule.Frequency.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AmountType.values().length];
            try {
                iArr2[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BrokerageAccountType.values().length];
            try {
                iArr3[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[RecurringOrderConfirmationViewState.InvestmentScheduleState.values().length];
            try {
                iArr4[RecurringOrderConfirmationViewState.InvestmentScheduleState.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[RecurringOrderConfirmationViewState.InvestmentScheduleState.PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[RecurringOrderConfirmationViewState.InvestmentScheduleState.PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final InvestmentSchedule getOrder() {
        return this.order;
    }

    /* renamed from: component2, reason: from getter */
    private final InvestmentScheduleAmount getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    private final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component4, reason: from getter */
    private final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    /* renamed from: component5, reason: from getter */
    private final RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus getPaycheckRecurringBrokerageCashStatus() {
        return this.paycheckRecurringBrokerageCashStatus;
    }

    public static /* synthetic */ RecurringBrokerageCashTransferConfirmationViewState copy$default(RecurringBrokerageCashTransferConfirmationViewState recurringBrokerageCashTransferConfirmationViewState, InvestmentSchedule investmentSchedule, InvestmentScheduleAmount investmentScheduleAmount, BrokerageAccountType brokerageAccountType, RetirementMatchRate retirementMatchRate, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            investmentSchedule = recurringBrokerageCashTransferConfirmationViewState.order;
        }
        if ((i & 2) != 0) {
            investmentScheduleAmount = recurringBrokerageCashTransferConfirmationViewState.amount;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = recurringBrokerageCashTransferConfirmationViewState.accountType;
        }
        if ((i & 8) != 0) {
            retirementMatchRate = recurringBrokerageCashTransferConfirmationViewState.retirementMatchRate;
        }
        if ((i & 16) != 0) {
            paycheckRecurringBrokerageCashStatus = recurringBrokerageCashTransferConfirmationViewState.paycheckRecurringBrokerageCashStatus;
        }
        RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus2 = paycheckRecurringBrokerageCashStatus;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        return recurringBrokerageCashTransferConfirmationViewState.copy(investmentSchedule, investmentScheduleAmount, brokerageAccountType2, retirementMatchRate, paycheckRecurringBrokerageCashStatus2);
    }

    public final RecurringBrokerageCashTransferConfirmationViewState copy(InvestmentSchedule order, InvestmentScheduleAmount amount, BrokerageAccountType accountType, RetirementMatchRate retirementMatchRate, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(paycheckRecurringBrokerageCashStatus, "paycheckRecurringBrokerageCashStatus");
        return new RecurringBrokerageCashTransferConfirmationViewState(order, amount, accountType, retirementMatchRate, paycheckRecurringBrokerageCashStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringBrokerageCashTransferConfirmationViewState)) {
            return false;
        }
        RecurringBrokerageCashTransferConfirmationViewState recurringBrokerageCashTransferConfirmationViewState = (RecurringBrokerageCashTransferConfirmationViewState) other;
        return Intrinsics.areEqual(this.order, recurringBrokerageCashTransferConfirmationViewState.order) && Intrinsics.areEqual(this.amount, recurringBrokerageCashTransferConfirmationViewState.amount) && this.accountType == recurringBrokerageCashTransferConfirmationViewState.accountType && Intrinsics.areEqual(this.retirementMatchRate, recurringBrokerageCashTransferConfirmationViewState.retirementMatchRate) && Intrinsics.areEqual(this.paycheckRecurringBrokerageCashStatus, recurringBrokerageCashTransferConfirmationViewState.paycheckRecurringBrokerageCashStatus);
    }

    public int hashCode() {
        InvestmentSchedule investmentSchedule = this.order;
        int iHashCode = (((((investmentSchedule == null ? 0 : investmentSchedule.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.accountType.hashCode()) * 31;
        RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
        return ((iHashCode + (retirementMatchRate != null ? retirementMatchRate.hashCode() : 0)) * 31) + this.paycheckRecurringBrokerageCashStatus.hashCode();
    }

    public String toString() {
        return "RecurringBrokerageCashTransferConfirmationViewState(order=" + this.order + ", amount=" + this.amount + ", accountType=" + this.accountType + ", retirementMatchRate=" + this.retirementMatchRate + ", paycheckRecurringBrokerageCashStatus=" + this.paycheckRecurringBrokerageCashStatus + ")";
    }

    public RecurringBrokerageCashTransferConfirmationViewState(InvestmentSchedule investmentSchedule, InvestmentScheduleAmount amount, BrokerageAccountType accountType, RetirementMatchRate retirementMatchRate, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus) {
        RecurringOrderConfirmationViewState.InvestmentScheduleState investmentScheduleState;
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(paycheckRecurringBrokerageCashStatus, "paycheckRecurringBrokerageCashStatus");
        this.order = investmentSchedule;
        this.amount = amount;
        this.accountType = accountType;
        this.retirementMatchRate = retirementMatchRate;
        this.paycheckRecurringBrokerageCashStatus = paycheckRecurringBrokerageCashStatus;
        if (investmentSchedule == null) {
            investmentScheduleState = null;
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[investmentSchedule.getFrequency().ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                investmentScheduleState = RecurringOrderConfirmationViewState.InvestmentScheduleState.STANDARD;
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (investmentSchedule.getDirectDepositRelationshipId() == null) {
                    investmentScheduleState = RecurringOrderConfirmationViewState.InvestmentScheduleState.PAYCHECK_WITHOUT_DIRECT_DEPOSIT_RELATIONSHIP;
                } else {
                    investmentScheduleState = RecurringOrderConfirmationViewState.InvestmentScheduleState.PAYCHECK_WITH_DIRECT_DEPOSIT_RELATIONSHIP;
                }
            }
        }
        this.investmentScheduleState = investmentScheduleState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecurringBrokerageCashTransferConfirmationViewState(InvestmentSchedule investmentSchedule, InvestmentScheduleAmount investmentScheduleAmount, BrokerageAccountType brokerageAccountType, RetirementMatchRate retirementMatchRate, RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        RecurringOrderConfiguration.PaycheckRecurringBrokerageCashStatus paycheckRecurringBrokerageCashStatus2;
        RetirementMatchRate retirementMatchRate2;
        investmentSchedule = (i & 1) != 0 ? null : investmentSchedule;
        if ((i & 8) != 0) {
            paycheckRecurringBrokerageCashStatus2 = paycheckRecurringBrokerageCashStatus;
            retirementMatchRate2 = null;
        } else {
            paycheckRecurringBrokerageCashStatus2 = paycheckRecurringBrokerageCashStatus;
            retirementMatchRate2 = retirementMatchRate;
        }
        this(investmentSchedule, investmentScheduleAmount, brokerageAccountType, retirementMatchRate2, paycheckRecurringBrokerageCashStatus2);
    }

    public final StringResource getDescription() {
        int i = WhenMappings.$EnumSwitchMapping$2[this.accountType.ordinal()];
        if (i != 1 && i != 2) {
            int i2 = WhenMappings.$EnumSwitchMapping$1[this.amount.getAmountType().ordinal()];
            if (i2 == 1) {
                return StringResource.INSTANCE.invoke(C11595R.string.recurring_brokerage_cash_transfer_confirmation_subtitle_dollar, this.amount.format());
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C11595R.string.recurring_brokerage_cash_transfer_confirmation_subtitle_percent, this.amount.format());
        }
        int i3 = WhenMappings.$EnumSwitchMapping$1[this.amount.getAmountType().ordinal()];
        if (i3 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i4 = C11595R.string.recurring_retirement_transfer_confirmation_subtitle_dollar;
            String str = this.amount.format();
            NumberFormatter interestRateFormatShort = Formats.getInterestRateFormatShort();
            RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
            return companion.invoke(i4, str, NumberFormatter.DefaultImpls.formatNullable$default(interestRateFormatShort, retirementMatchRate != null ? retirementMatchRate.getHighestActiveInternalAccountTransferRate() : null, null, 2, null));
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        int i5 = C11595R.string.recurring_retirement_transfer_confirmation_subtitle_percent;
        String str2 = this.amount.format();
        NumberFormatter interestRateFormatShort2 = Formats.getInterestRateFormatShort();
        RetirementMatchRate retirementMatchRate2 = this.retirementMatchRate;
        return companion2.invoke(i5, str2, NumberFormatter.DefaultImpls.formatNullable$default(interestRateFormatShort2, retirementMatchRate2 != null ? retirementMatchRate2.getHighestActiveInternalAccountTransferRate() : null, null, 2, null));
    }

    public final RecurringOrderConfirmationViewState.SecondaryButtonState getSecondaryButtonState() {
        RecurringOrderConfirmationViewState.InvestmentScheduleState investmentScheduleState = this.investmentScheduleState;
        int i = investmentScheduleState == null ? -1 : WhenMappings.$EnumSwitchMapping$3[investmentScheduleState.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1 || i == 2) {
            InvestmentSchedule investmentSchedule = this.order;
            Intrinsics.checkNotNull(investmentSchedule);
            return new RecurringOrderConfirmationViewState.SecondaryButtonState.ViewRecurringInvestment(investmentSchedule.getInvestmentTarget().getTargetType(), this.order.getId());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new RecurringOrderConfirmationViewState.SecondaryButtonState.SetUpAnotherPaycheckRecurringInvestment(this.paycheckRecurringBrokerageCashStatus);
    }
}

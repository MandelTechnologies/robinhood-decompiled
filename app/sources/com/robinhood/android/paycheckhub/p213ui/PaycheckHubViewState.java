package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.models.p320db.EarlyPayEnrollment;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckHubViewState.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010!\u001a\u0004\u0018\u00010\"J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010+\u001a\u00020\nJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÂ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u00100J\t\u00101\u001a\u00020\nHÂ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u00100J\u000b\u00103\u001a\u0004\u0018\u00010\u000eHÂ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0002\u00100Jr\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\n2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020%HÖ\u0001J\t\u0010:\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0013\u0010$\u001a\u0004\u0018\u00010%8G¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubViewState;", "", "retirementMatchRate", "Ljava/math/BigDecimal;", "earlyPayEnrollment", "Lcom/robinhood/models/db/EarlyPayEnrollment;", "paychecks", "", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "hasPaycheckInvestmentSchedules", "", "isShowAllPaychecksButtonClicked", "hasSwitchedDirectDeposit", "sweepsInterest", "Lcom/robinhood/models/db/mcduckling/SweepsInterest;", "hasRetirementAccount", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/EarlyPayEnrollment;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/SweepsInterest;Ljava/lang/Boolean;)V", "getRetirementMatchRate", "()Ljava/math/BigDecimal;", "Ljava/lang/Boolean;", "latestPaycheck", "paycheckRecurringInvestmentsContent", "Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "getPaycheckRecurringInvestmentsContent", "()Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsContent;", "showZeroPaycheckAmount", "getShowZeroPaycheckAmount", "()Z", "lastPaycheckAmountText", "", "getLastPaycheckAmountText", "()Ljava/lang/String;", "getPaycheckHubSubtitleState", "Lcom/robinhood/android/paycheckhub/ui/PaycheckHubSubtitleState;", "isSetupDirectDepositButtonVisible", "setupDirectDepositButtonTextRes", "", "getSetupDirectDepositButtonTextRes", "()Ljava/lang/Integer;", "showRetirementSetUpCard", "getShowRetirementSetUpCard", "getShownPaychecks", "isShowAllPaychecksButtonVisible", "component1", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "component7", "component8", "copy", "(Ljava/math/BigDecimal;Lcom/robinhood/models/db/EarlyPayEnrollment;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/Boolean;Lcom/robinhood/models/db/mcduckling/SweepsInterest;Ljava/lang/Boolean;)Lcom/robinhood/android/paycheckhub/ui/PaycheckHubViewState;", "equals", "other", "hashCode", "toString", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaycheckHubViewState {
    public static final int paychecksSublistLength = 4;
    private final EarlyPayEnrollment earlyPayEnrollment;
    private final Boolean hasPaycheckInvestmentSchedules;
    private final Boolean hasRetirementAccount;
    private final Boolean hasSwitchedDirectDeposit;
    private final boolean isSetupDirectDepositButtonVisible;
    private final boolean isShowAllPaychecksButtonClicked;
    private final PaycheckV2 latestPaycheck;
    private final List<PaycheckV2> paychecks;
    private final BigDecimal retirementMatchRate;
    private final SweepsInterest sweepsInterest;
    public static final int $stable = 8;
    private static final StringResource subtitleSeparatorStringResource = StringResource.INSTANCE.invoke(C25434R.string.paycheck_hub_separator, new Object[0]);

    public PaycheckHubViewState() {
        this(null, null, null, null, false, null, null, null, 255, null);
    }

    /* renamed from: component2, reason: from getter */
    private final EarlyPayEnrollment getEarlyPayEnrollment() {
        return this.earlyPayEnrollment;
    }

    private final List<PaycheckV2> component3() {
        return this.paychecks;
    }

    /* renamed from: component4, reason: from getter */
    private final Boolean getHasPaycheckInvestmentSchedules() {
        return this.hasPaycheckInvestmentSchedules;
    }

    /* renamed from: component5, reason: from getter */
    private final boolean getIsShowAllPaychecksButtonClicked() {
        return this.isShowAllPaychecksButtonClicked;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean getHasSwitchedDirectDeposit() {
        return this.hasSwitchedDirectDeposit;
    }

    /* renamed from: component7, reason: from getter */
    private final SweepsInterest getSweepsInterest() {
        return this.sweepsInterest;
    }

    /* renamed from: component8, reason: from getter */
    private final Boolean getHasRetirementAccount() {
        return this.hasRetirementAccount;
    }

    public static /* synthetic */ PaycheckHubViewState copy$default(PaycheckHubViewState paycheckHubViewState, BigDecimal bigDecimal, EarlyPayEnrollment earlyPayEnrollment, List list, Boolean bool, boolean z, Boolean bool2, SweepsInterest sweepsInterest, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = paycheckHubViewState.retirementMatchRate;
        }
        if ((i & 2) != 0) {
            earlyPayEnrollment = paycheckHubViewState.earlyPayEnrollment;
        }
        if ((i & 4) != 0) {
            list = paycheckHubViewState.paychecks;
        }
        if ((i & 8) != 0) {
            bool = paycheckHubViewState.hasPaycheckInvestmentSchedules;
        }
        if ((i & 16) != 0) {
            z = paycheckHubViewState.isShowAllPaychecksButtonClicked;
        }
        if ((i & 32) != 0) {
            bool2 = paycheckHubViewState.hasSwitchedDirectDeposit;
        }
        if ((i & 64) != 0) {
            sweepsInterest = paycheckHubViewState.sweepsInterest;
        }
        if ((i & 128) != 0) {
            bool3 = paycheckHubViewState.hasRetirementAccount;
        }
        SweepsInterest sweepsInterest2 = sweepsInterest;
        Boolean bool4 = bool3;
        boolean z2 = z;
        Boolean bool5 = bool2;
        return paycheckHubViewState.copy(bigDecimal, earlyPayEnrollment, list, bool, z2, bool5, sweepsInterest2, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final PaycheckHubViewState copy(BigDecimal retirementMatchRate, EarlyPayEnrollment earlyPayEnrollment, List<PaycheckV2> paychecks, Boolean hasPaycheckInvestmentSchedules, boolean isShowAllPaychecksButtonClicked, Boolean hasSwitchedDirectDeposit, SweepsInterest sweepsInterest, Boolean hasRetirementAccount) {
        return new PaycheckHubViewState(retirementMatchRate, earlyPayEnrollment, paychecks, hasPaycheckInvestmentSchedules, isShowAllPaychecksButtonClicked, hasSwitchedDirectDeposit, sweepsInterest, hasRetirementAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaycheckHubViewState)) {
            return false;
        }
        PaycheckHubViewState paycheckHubViewState = (PaycheckHubViewState) other;
        return Intrinsics.areEqual(this.retirementMatchRate, paycheckHubViewState.retirementMatchRate) && Intrinsics.areEqual(this.earlyPayEnrollment, paycheckHubViewState.earlyPayEnrollment) && Intrinsics.areEqual(this.paychecks, paycheckHubViewState.paychecks) && Intrinsics.areEqual(this.hasPaycheckInvestmentSchedules, paycheckHubViewState.hasPaycheckInvestmentSchedules) && this.isShowAllPaychecksButtonClicked == paycheckHubViewState.isShowAllPaychecksButtonClicked && Intrinsics.areEqual(this.hasSwitchedDirectDeposit, paycheckHubViewState.hasSwitchedDirectDeposit) && Intrinsics.areEqual(this.sweepsInterest, paycheckHubViewState.sweepsInterest) && Intrinsics.areEqual(this.hasRetirementAccount, paycheckHubViewState.hasRetirementAccount);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.retirementMatchRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        EarlyPayEnrollment earlyPayEnrollment = this.earlyPayEnrollment;
        int iHashCode2 = (iHashCode + (earlyPayEnrollment == null ? 0 : earlyPayEnrollment.hashCode())) * 31;
        List<PaycheckV2> list = this.paychecks;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.hasPaycheckInvestmentSchedules;
        int iHashCode4 = (((iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isShowAllPaychecksButtonClicked)) * 31;
        Boolean bool2 = this.hasSwitchedDirectDeposit;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SweepsInterest sweepsInterest = this.sweepsInterest;
        int iHashCode6 = (iHashCode5 + (sweepsInterest == null ? 0 : sweepsInterest.hashCode())) * 31;
        Boolean bool3 = this.hasRetirementAccount;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        return "PaycheckHubViewState(retirementMatchRate=" + this.retirementMatchRate + ", earlyPayEnrollment=" + this.earlyPayEnrollment + ", paychecks=" + this.paychecks + ", hasPaycheckInvestmentSchedules=" + this.hasPaycheckInvestmentSchedules + ", isShowAllPaychecksButtonClicked=" + this.isShowAllPaychecksButtonClicked + ", hasSwitchedDirectDeposit=" + this.hasSwitchedDirectDeposit + ", sweepsInterest=" + this.sweepsInterest + ", hasRetirementAccount=" + this.hasRetirementAccount + ")";
    }

    public PaycheckHubViewState(BigDecimal bigDecimal, EarlyPayEnrollment earlyPayEnrollment, List<PaycheckV2> list, Boolean bool, boolean z, Boolean bool2, SweepsInterest sweepsInterest, Boolean bool3) {
        this.retirementMatchRate = bigDecimal;
        this.earlyPayEnrollment = earlyPayEnrollment;
        this.paychecks = list;
        this.hasPaycheckInvestmentSchedules = bool;
        this.isShowAllPaychecksButtonClicked = z;
        this.hasSwitchedDirectDeposit = bool2;
        this.sweepsInterest = sweepsInterest;
        this.hasRetirementAccount = bool3;
        this.latestPaycheck = list != null ? (PaycheckV2) CollectionsKt.firstOrNull((List) list) : null;
        this.isSetupDirectDepositButtonVisible = getSetupDirectDepositButtonTextRes() != null;
    }

    public /* synthetic */ PaycheckHubViewState(BigDecimal bigDecimal, EarlyPayEnrollment earlyPayEnrollment, List list, Boolean bool, boolean z, Boolean bool2, SweepsInterest sweepsInterest, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : earlyPayEnrollment, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : sweepsInterest, (i & 128) != 0 ? null : bool3);
    }

    public final BigDecimal getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final PaycheckHubViewState3 getPaycheckRecurringInvestmentsContent() {
        return PaycheckHubViewState3.INSTANCE.getState(this.paychecks, this.hasPaycheckInvestmentSchedules, this.sweepsInterest);
    }

    private final boolean getShowZeroPaycheckAmount() {
        List<PaycheckV2> list = this.paychecks;
        return list != null && list.isEmpty();
    }

    public final String getLastPaycheckAmountText() {
        BigDecimal dollarAmount;
        Money money;
        if (getShowZeroPaycheckAmount()) {
            dollarAmount = BigDecimal.ZERO;
        } else {
            PaycheckV2 paycheckV2 = this.latestPaycheck;
            dollarAmount = paycheckV2 != null ? paycheckV2.getDollarAmount() : null;
        }
        if (dollarAmount == null || (money = Money3.toMoney(dollarAmount, Currencies.USD)) == null) {
            return null;
        }
        return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final PaycheckHubViewState2 getPaycheckHubSubtitleState() {
        EarlyPayEnrollment earlyPayEnrollment;
        int i;
        ArrayList arrayList = new ArrayList();
        PaycheckV2 paycheckV2 = this.latestPaycheck;
        if (paycheckV2 != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            if (paycheckV2.isEarlyPay()) {
                i = C25434R.string.early_direct_deposit;
            } else {
                i = C25434R.string.direct_deposit;
            }
            arrayList.add(companion.invoke(i, new Object[0]));
            StringResource stringResource = subtitleSeparatorStringResource;
            arrayList.add(stringResource);
            arrayList.add(companion.invoke(LocalDateFormatter.LONG_WITH_OPTIONAL_YEAR.format(this.latestPaycheck.getGrantDate())));
            arrayList.add(stringResource);
            arrayList.add(companion.invoke(this.latestPaycheck.getOriginatorName()));
        } else {
            Boolean bool = this.hasSwitchedDirectDeposit;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.areEqual(bool, bool2) && (earlyPayEnrollment = this.earlyPayEnrollment) != null && earlyPayEnrollment.isEnrolled()) {
                arrayList.add(StringResource.INSTANCE.invoke(C25434R.string.early_direct_deposit_setup, new Object[0]));
            } else if (Intrinsics.areEqual(this.hasSwitchedDirectDeposit, bool2)) {
                arrayList.add(StringResource.INSTANCE.invoke(C25434R.string.direct_deposit_setup, new Object[0]));
            } else {
                EarlyPayEnrollment earlyPayEnrollment2 = this.earlyPayEnrollment;
                if (earlyPayEnrollment2 == null || !earlyPayEnrollment2.isEnrolled()) {
                    return null;
                }
                arrayList.add(StringResource.INSTANCE.invoke(C25434R.string.signed_up_for_early_direct_deposit, new Object[0]));
            }
        }
        PaycheckV2 paycheckV22 = this.latestPaycheck;
        return new PaycheckHubViewState2(paycheckV22 != null && paycheckV22.isEarlyPay(), arrayList);
    }

    /* renamed from: isSetupDirectDepositButtonVisible, reason: from getter */
    public final boolean getIsSetupDirectDepositButtonVisible() {
        return this.isSetupDirectDepositButtonVisible;
    }

    public final Integer getSetupDirectDepositButtonTextRes() {
        EarlyPayEnrollment earlyPayEnrollment;
        List<PaycheckV2> list = this.paychecks;
        if (list != null && list.isEmpty() && Intrinsics.areEqual(this.hasSwitchedDirectDeposit, Boolean.TRUE)) {
            return Integer.valueOf(C25434R.string.paycheck_hub_setup_another_dd);
        }
        List<PaycheckV2> list2 = this.paychecks;
        if (list2 == null || !list2.isEmpty() || (earlyPayEnrollment = this.earlyPayEnrollment) == null || !earlyPayEnrollment.isEnrolled()) {
            return null;
        }
        return Integer.valueOf(C25434R.string.paycheck_hub_setup_dd);
    }

    public final boolean getShowRetirementSetUpCard() {
        return Intrinsics.areEqual(this.hasRetirementAccount, Boolean.FALSE);
    }

    public final List<PaycheckV2> getShownPaychecks() {
        List<PaycheckV2> listSubList;
        if (!this.isShowAllPaychecksButtonClicked) {
            List<PaycheckV2> list = this.paychecks;
            listSubList = list != null ? list.subList(0, Math.min(list.size(), 4)) : null;
        } else {
            listSubList = this.paychecks;
        }
        return listSubList == null ? CollectionsKt.emptyList() : listSubList;
    }

    public final boolean isShowAllPaychecksButtonVisible() {
        List<PaycheckV2> list = this.paychecks;
        return (list == null || this.isShowAllPaychecksButtonClicked || list.size() <= 4) ? false : true;
    }
}

package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.librobinhood.data.store.SweepsStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.mcduckling.SweepsInterest;
import com.robinhood.models.p355ui.recurring.paycheck.UiPaycheckInvestmentSchedule;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: PaycheckRecurringInvestmentsHubViewState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:BG\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÂ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0019\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000fR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010)\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000fR\u0011\u0010+\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u0015R\u0011\u0010-\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010\u0015¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckRecurringInvestmentsHubViewState;", "", "paycheckInvestmentSchedules", "", "Lcom/robinhood/models/ui/recurring/paycheck/UiPaycheckInvestmentSchedule;", "sweepsStatus", "Lcom/robinhood/librobinhood/data/store/SweepsStatus;", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "isExpanded", "", "individualAccountNumber", "", "<init>", "(Ljava/util/List;Lcom/robinhood/librobinhood/data/store/SweepsStatus;Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;ZLjava/lang/String;)V", "()Z", "getIndividualAccountNumber", "()Ljava/lang/String;", "totalAmountInvestedValueText", "Lcom/robinhood/utils/resource/StringResource;", "getTotalAmountInvestedValueText", "()Lcom/robinhood/utils/resource/StringResource;", "lastUpdatedAtValueText", "getLastUpdatedAtValueText", "totalActiveRecurringInvestmentsValueText", "getTotalActiveRecurringInvestmentsValueText", "totalPausedRecurringInvestmentsValueText", "getTotalPausedRecurringInvestmentsValueText", "stockAndEtfsRecurringInvestments", "getStockAndEtfsRecurringInvestments", "()Ljava/util/List;", "isStocksAndEtfsEmptyMessageVisible", "cryptoRecurringInvestments", "getCryptoRecurringInvestments", "isCryptoEmptyContentVisible", "brokerageCashRecurringTransfers", "getBrokerageCashRecurringTransfers", "brokerageCashEmptyContentVisible", "getBrokerageCashEmptyContentVisible", "retirementRecurringTransfers", "getRetirementRecurringTransfers", "retirementEmptyContentVisible", "getRetirementEmptyContentVisible", "brokerageCashEmptyMessageText", "getBrokerageCashEmptyMessageText", "retirementEmptyMessageText", "getRetirementEmptyMessageText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class PaycheckRecurringInvestmentsHubViewState {
    private final boolean brokerageCashEmptyContentVisible;
    private final List<UiPaycheckInvestmentSchedule> brokerageCashRecurringTransfers;
    private final List<UiPaycheckInvestmentSchedule> cryptoRecurringInvestments;
    private final String individualAccountNumber;
    private final boolean isCryptoEmptyContentVisible;
    private final boolean isExpanded;
    private final boolean isStocksAndEtfsEmptyMessageVisible;
    private final List<UiPaycheckInvestmentSchedule> paycheckInvestmentSchedules;
    private final boolean retirementEmptyContentVisible;
    private final RetirementMatchRate retirementMatchRate;
    private final List<UiPaycheckInvestmentSchedule> retirementRecurringTransfers;
    private final List<UiPaycheckInvestmentSchedule> stockAndEtfsRecurringInvestments;
    private final SweepsStatus sweepsStatus;
    public static final int $stable = 8;
    private static final StringResource generalLabelNaShortStringResource = StringResource.INSTANCE.invoke(C11048R.string.general_label_n_a_short, new Object[0]);

    public PaycheckRecurringInvestmentsHubViewState() {
        this(null, null, null, false, null, 31, null);
    }

    private final List<UiPaycheckInvestmentSchedule> component1() {
        return this.paycheckInvestmentSchedules;
    }

    /* renamed from: component2, reason: from getter */
    private final SweepsStatus getSweepsStatus() {
        return this.sweepsStatus;
    }

    /* renamed from: component3, reason: from getter */
    private final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public static /* synthetic */ PaycheckRecurringInvestmentsHubViewState copy$default(PaycheckRecurringInvestmentsHubViewState paycheckRecurringInvestmentsHubViewState, List list, SweepsStatus sweepsStatus, RetirementMatchRate retirementMatchRate, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paycheckRecurringInvestmentsHubViewState.paycheckInvestmentSchedules;
        }
        if ((i & 2) != 0) {
            sweepsStatus = paycheckRecurringInvestmentsHubViewState.sweepsStatus;
        }
        if ((i & 4) != 0) {
            retirementMatchRate = paycheckRecurringInvestmentsHubViewState.retirementMatchRate;
        }
        if ((i & 8) != 0) {
            z = paycheckRecurringInvestmentsHubViewState.isExpanded;
        }
        if ((i & 16) != 0) {
            str = paycheckRecurringInvestmentsHubViewState.individualAccountNumber;
        }
        String str2 = str;
        RetirementMatchRate retirementMatchRate2 = retirementMatchRate;
        return paycheckRecurringInvestmentsHubViewState.copy(list, sweepsStatus, retirementMatchRate2, z, str2);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final PaycheckRecurringInvestmentsHubViewState copy(List<UiPaycheckInvestmentSchedule> paycheckInvestmentSchedules, SweepsStatus sweepsStatus, RetirementMatchRate retirementMatchRate, boolean isExpanded, String individualAccountNumber) {
        return new PaycheckRecurringInvestmentsHubViewState(paycheckInvestmentSchedules, sweepsStatus, retirementMatchRate, isExpanded, individualAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaycheckRecurringInvestmentsHubViewState)) {
            return false;
        }
        PaycheckRecurringInvestmentsHubViewState paycheckRecurringInvestmentsHubViewState = (PaycheckRecurringInvestmentsHubViewState) other;
        return Intrinsics.areEqual(this.paycheckInvestmentSchedules, paycheckRecurringInvestmentsHubViewState.paycheckInvestmentSchedules) && Intrinsics.areEqual(this.sweepsStatus, paycheckRecurringInvestmentsHubViewState.sweepsStatus) && Intrinsics.areEqual(this.retirementMatchRate, paycheckRecurringInvestmentsHubViewState.retirementMatchRate) && this.isExpanded == paycheckRecurringInvestmentsHubViewState.isExpanded && Intrinsics.areEqual(this.individualAccountNumber, paycheckRecurringInvestmentsHubViewState.individualAccountNumber);
    }

    public int hashCode() {
        List<UiPaycheckInvestmentSchedule> list = this.paycheckInvestmentSchedules;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        SweepsStatus sweepsStatus = this.sweepsStatus;
        int iHashCode2 = (iHashCode + (sweepsStatus == null ? 0 : sweepsStatus.hashCode())) * 31;
        RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
        int iHashCode3 = (((iHashCode2 + (retirementMatchRate == null ? 0 : retirementMatchRate.hashCode())) * 31) + Boolean.hashCode(this.isExpanded)) * 31;
        String str = this.individualAccountNumber;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PaycheckRecurringInvestmentsHubViewState(paycheckInvestmentSchedules=" + this.paycheckInvestmentSchedules + ", sweepsStatus=" + this.sweepsStatus + ", retirementMatchRate=" + this.retirementMatchRate + ", isExpanded=" + this.isExpanded + ", individualAccountNumber=" + this.individualAccountNumber + ")";
    }

    public PaycheckRecurringInvestmentsHubViewState(List<UiPaycheckInvestmentSchedule> list, SweepsStatus sweepsStatus, RetirementMatchRate retirementMatchRate, boolean z, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.paycheckInvestmentSchedules = list;
        this.sweepsStatus = sweepsStatus;
        this.retirementMatchRate = retirementMatchRate;
        this.isExpanded = z;
        this.individualAccountNumber = str;
        ArrayList arrayList4 = null;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule = (UiPaycheckInvestmentSchedule) obj;
                if (uiPaycheckInvestmentSchedule.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && uiPaycheckInvestmentSchedule.isInstrument()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        this.stockAndEtfsRecurringInvestments = arrayList;
        boolean z2 = false;
        this.isStocksAndEtfsEmptyMessageVisible = arrayList != null && arrayList.isEmpty();
        List<UiPaycheckInvestmentSchedule> list2 = this.paycheckInvestmentSchedules;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule2 = (UiPaycheckInvestmentSchedule) obj2;
                if (uiPaycheckInvestmentSchedule2.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && uiPaycheckInvestmentSchedule2.isCrypto()) {
                    arrayList2.add(obj2);
                }
            }
        } else {
            arrayList2 = null;
        }
        this.cryptoRecurringInvestments = arrayList2;
        this.isCryptoEmptyContentVisible = arrayList2 != null && arrayList2.isEmpty();
        List<UiPaycheckInvestmentSchedule> list3 = this.paycheckInvestmentSchedules;
        if (list3 != null) {
            arrayList3 = new ArrayList();
            for (Object obj3 : list3) {
                UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule3 = (UiPaycheckInvestmentSchedule) obj3;
                if (uiPaycheckInvestmentSchedule3.getBrokerageAccountType() == BrokerageAccountType.INDIVIDUAL && uiPaycheckInvestmentSchedule3.isBrokerageCashTransfer()) {
                    arrayList3.add(obj3);
                }
            }
        } else {
            arrayList3 = null;
        }
        this.brokerageCashRecurringTransfers = arrayList3;
        this.brokerageCashEmptyContentVisible = arrayList3 != null && arrayList3.isEmpty();
        List<UiPaycheckInvestmentSchedule> list4 = this.paycheckInvestmentSchedules;
        if (list4 != null) {
            arrayList4 = new ArrayList();
            for (Object obj4 : list4) {
                UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule4 = (UiPaycheckInvestmentSchedule) obj4;
                if (uiPaycheckInvestmentSchedule4.getBrokerageAccountType() == BrokerageAccountType.IRA_TRADITIONAL || uiPaycheckInvestmentSchedule4.getBrokerageAccountType() == BrokerageAccountType.IRA_ROTH) {
                    arrayList4.add(obj4);
                }
            }
        }
        this.retirementRecurringTransfers = arrayList4;
        if (arrayList4 != null && arrayList4.isEmpty()) {
            z2 = true;
        }
        this.retirementEmptyContentVisible = z2;
    }

    public /* synthetic */ PaycheckRecurringInvestmentsHubViewState(List list, SweepsStatus sweepsStatus, RetirementMatchRate retirementMatchRate, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : sweepsStatus, (i & 4) != 0 ? null : retirementMatchRate, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final StringResource getTotalAmountInvestedValueText() {
        Money moneyPlus;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        Money money = Money3.toMoney(ZERO, Currencies.USD);
        List<UiPaycheckInvestmentSchedule> list = this.paycheckInvestmentSchedules;
        if (list != null) {
            Iterator<T> it = list.iterator();
            moneyPlus = money;
            while (it.hasNext()) {
                Money totalInvested = ((UiPaycheckInvestmentSchedule) it.next()).getTotalInvested();
                if (totalInvested == null) {
                    totalInvested = money;
                }
                moneyPlus = moneyPlus.plus(totalInvested);
            }
        } else {
            moneyPlus = null;
        }
        Money money2 = moneyPlus;
        if (money2 != null) {
            return StringResource.INSTANCE.invoke(Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return generalLabelNaShortStringResource;
    }

    public final StringResource getLastUpdatedAtValueText() {
        UiPaycheckInvestmentSchedule uiPaycheckInvestmentSchedule;
        List<UiPaycheckInvestmentSchedule> list = this.paycheckInvestmentSchedules;
        Instant updatedAt = (list == null || (uiPaycheckInvestmentSchedule = (UiPaycheckInvestmentSchedule) CollectionsKt.firstOrNull((List) list)) == null) ? null : uiPaycheckInvestmentSchedule.getUpdatedAt();
        if (updatedAt != null) {
            return StringResource.INSTANCE.invoke(InstantFormatter.SHORT_DATE_IN_SYSTEM_ZONE.format(updatedAt));
        }
        return generalLabelNaShortStringResource;
    }

    public final StringResource getTotalActiveRecurringInvestmentsValueText() {
        Integer numValueOf;
        List<UiPaycheckInvestmentSchedule> list = this.paycheckInvestmentSchedules;
        if (list != null) {
            List<UiPaycheckInvestmentSchedule> list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((UiPaycheckInvestmentSchedule) it.next()).isActive() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return StringResource.INSTANCE.invoke(numValueOf.toString());
        }
        return generalLabelNaShortStringResource;
    }

    public final StringResource getTotalPausedRecurringInvestmentsValueText() {
        Integer numValueOf;
        List<UiPaycheckInvestmentSchedule> list = this.paycheckInvestmentSchedules;
        if (list != null) {
            List<UiPaycheckInvestmentSchedule> list2 = list;
            int i = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((UiPaycheckInvestmentSchedule) it.next()).isPaused() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return StringResource.INSTANCE.invoke(numValueOf.toString());
        }
        return generalLabelNaShortStringResource;
    }

    public final List<UiPaycheckInvestmentSchedule> getStockAndEtfsRecurringInvestments() {
        return this.stockAndEtfsRecurringInvestments;
    }

    /* renamed from: isStocksAndEtfsEmptyMessageVisible, reason: from getter */
    public final boolean getIsStocksAndEtfsEmptyMessageVisible() {
        return this.isStocksAndEtfsEmptyMessageVisible;
    }

    public final List<UiPaycheckInvestmentSchedule> getCryptoRecurringInvestments() {
        return this.cryptoRecurringInvestments;
    }

    /* renamed from: isCryptoEmptyContentVisible, reason: from getter */
    public final boolean getIsCryptoEmptyContentVisible() {
        return this.isCryptoEmptyContentVisible;
    }

    public final List<UiPaycheckInvestmentSchedule> getBrokerageCashRecurringTransfers() {
        return this.brokerageCashRecurringTransfers;
    }

    public final boolean getBrokerageCashEmptyContentVisible() {
        return this.brokerageCashEmptyContentVisible;
    }

    public final List<UiPaycheckInvestmentSchedule> getRetirementRecurringTransfers() {
        return this.retirementRecurringTransfers;
    }

    public final boolean getRetirementEmptyContentVisible() {
        return this.retirementEmptyContentVisible;
    }

    public final StringResource getBrokerageCashEmptyMessageText() {
        SweepsInterest sweepInterest;
        SweepsStatus sweepsStatus = this.sweepsStatus;
        BigDecimal goldInterestRate = (sweepsStatus == null || (sweepInterest = sweepsStatus.getSweepInterest()) == null) ? null : sweepInterest.getGoldInterestRate();
        SweepsStatus sweepsStatus2 = this.sweepsStatus;
        if (sweepsStatus2 != null && sweepsStatus2.getSweepEligible() && goldInterestRate != null) {
            return StringResource.INSTANCE.invoke(C25434R.string.brokerage_cash_empty_message, Formats.getInterestRateFormatShort().format(goldInterestRate));
        }
        return StringResource.INSTANCE.invoke(C25434R.string.brokerage_cash_empty_message_no_rate, new Object[0]);
    }

    public final StringResource getRetirementEmptyMessageText() {
        RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
        BigDecimal highestActiveInternalAccountTransferRate = retirementMatchRate != null ? retirementMatchRate.getHighestActiveInternalAccountTransferRate() : null;
        if (highestActiveInternalAccountTransferRate == null) {
            return StringResource.INSTANCE.invoke(C25434R.string.brokerage_cash_empty_message_no_rate, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C25434R.string.retirement_empty_message, Formats.getInterestRateFormatShort().format(highestActiveInternalAccountTransferRate));
    }
}

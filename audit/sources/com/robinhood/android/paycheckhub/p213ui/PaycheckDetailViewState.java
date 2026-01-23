package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.models.api.bonfire.ApiPaycheckV2;
import com.robinhood.models.p320db.bonfire.PaycheckAllocationV2;
import com.robinhood.models.p320db.bonfire.PaycheckAllocations;
import com.robinhood.models.p320db.bonfire.PaycheckInvestmentV2;
import com.robinhood.models.p320db.bonfire.PaycheckV2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: PaycheckDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0012HÖ\u0001J\t\u0010%\u001a\u00020\nHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckDetailViewState;", "", "paycheck", "Lcom/robinhood/models/db/bonfire/PaycheckV2;", "<init>", "(Lcom/robinhood/models/db/bonfire/PaycheckV2;)V", "allocations", "", "Lcom/robinhood/models/db/bonfire/PaycheckInvestmentV2;", "paycheckAmountVisibilityText", "", "getPaycheckAmountVisibilityText", "()Ljava/lang/String;", "directDepositSubtitleVisibilityText", "Lcom/robinhood/utils/resource/StringResource;", "getDirectDepositSubtitleVisibilityText", "()Lcom/robinhood/utils/resource/StringResource;", "statusSectionVisibilityValueText", "", "getStatusSectionVisibilityValueText", "()Ljava/lang/Integer;", "directDepositSourceSectionVisibilityValueText", "getDirectDepositSourceSectionVisibilityValueText", "dateReceivedSectionVisibilityValueText", "getDateReceivedSectionVisibilityValueText", "netDepositSectionVisibilityValueText", "getNetDepositSectionVisibilityValueText", "recurringBrokerageSplitsSectionVisibilityValueText", "getRecurringBrokerageSplitsSectionVisibilityValueText", "recurringRetirementSplitsSectionVisibilityValueText", "getRecurringRetirementSplitsSectionVisibilityValueText", "component1", "copy", "equals", "", "other", "hashCode", "toString", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class PaycheckDetailViewState {
    public static final int $stable = 8;
    private final List<PaycheckInvestmentV2> allocations;
    private final PaycheckV2 paycheck;

    /* compiled from: PaycheckDetailViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiPaycheckV2.State.values().length];
            try {
                iArr[ApiPaycheckV2.State.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiPaycheckV2.State.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiPaycheckV2.State.PENDING_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiPaycheckV2.State.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiPaycheckV2.State.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiPaycheckV2.State.REVERSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ApiPaycheckV2.State.COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ApiPaycheckV2.State.READY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ApiPaycheckV2.State.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckDetailViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final PaycheckV2 getPaycheck() {
        return this.paycheck;
    }

    public static /* synthetic */ PaycheckDetailViewState copy$default(PaycheckDetailViewState paycheckDetailViewState, PaycheckV2 paycheckV2, int i, Object obj) {
        if ((i & 1) != 0) {
            paycheckV2 = paycheckDetailViewState.paycheck;
        }
        return paycheckDetailViewState.copy(paycheckV2);
    }

    public final PaycheckDetailViewState copy(PaycheckV2 paycheck) {
        return new PaycheckDetailViewState(paycheck);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaycheckDetailViewState) && Intrinsics.areEqual(this.paycheck, ((PaycheckDetailViewState) other).paycheck);
    }

    public int hashCode() {
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null) {
            return 0;
        }
        return paycheckV2.hashCode();
    }

    public String toString() {
        return "PaycheckDetailViewState(paycheck=" + this.paycheck + ")";
    }

    public PaycheckDetailViewState(PaycheckV2 paycheckV2) {
        PaycheckAllocations paycheckAllocations;
        PaycheckAllocationV2 individual;
        this.paycheck = paycheckV2;
        this.allocations = (paycheckV2 == null || (paycheckAllocations = paycheckV2.getPaycheckAllocations()) == null || (individual = paycheckAllocations.getIndividual()) == null) ? null : CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) individual.getEquity(), (Iterable) individual.getCash()), (Iterable) individual.getCrypto());
    }

    public /* synthetic */ PaycheckDetailViewState(PaycheckV2 paycheckV2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paycheckV2);
    }

    public final String getPaycheckAmountVisibilityText() {
        BigDecimal dollarAmount;
        Money money;
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null || (dollarAmount = paycheckV2.getDollarAmount()) == null || (money = Money3.toMoney(dollarAmount, Currencies.USD)) == null) {
            return null;
        }
        return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final StringResource getDirectDepositSubtitleVisibilityText() {
        int i;
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        if (paycheckV2.isEarlyPay()) {
            i = C25434R.string.early_paycheck_detail_subtitle_template;
        } else {
            i = C25434R.string.paycheck_detail_subtitle_template;
        }
        return companion.invoke(i, this.paycheck.getOriginatorName());
    }

    public final Integer getStatusSectionVisibilityValueText() {
        PaycheckV2 paycheckV2 = this.paycheck;
        ApiPaycheckV2.State state = paycheckV2 != null ? paycheckV2.getState() : null;
        switch (state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return Integer.valueOf(C25434R.string.paycheck_state_new);
            case 2:
                return Integer.valueOf(C25434R.string.paycheck_state_pending);
            case 3:
                return Integer.valueOf(C25434R.string.paycheck_state_pending_cancel);
            case 4:
                return Integer.valueOf(C25434R.string.paycheck_state_cancelled);
            case 5:
                return Integer.valueOf(C25434R.string.paycheck_state_failed);
            case 6:
                return Integer.valueOf(C25434R.string.paycheck_state_reversed);
            case 7:
                return Integer.valueOf(C25434R.string.paycheck_state_completed);
            case 8:
                return Integer.valueOf(C25434R.string.paycheck_state_ready);
            case 9:
                return Integer.valueOf(C25434R.string.paycheck_state_unknown);
        }
    }

    public final String getDirectDepositSourceSectionVisibilityValueText() {
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 != null) {
            return paycheckV2.getOriginatorName();
        }
        return null;
    }

    public final String getDateReceivedSectionVisibilityValueText() {
        LocalDate grantDate;
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null || (grantDate = paycheckV2.getGrantDate()) == null) {
            return null;
        }
        return LocalDateFormatter.MEDIUM.format(grantDate);
    }

    public final String getNetDepositSectionVisibilityValueText() {
        PaycheckV2 paycheckV2;
        BigDecimal dollarAmount;
        Money money;
        if (this.allocations != null && (!r1.isEmpty()) && (paycheckV2 = this.paycheck) != null && (dollarAmount = paycheckV2.getDollarAmount()) != null && (money = Money3.toMoney(dollarAmount, Currencies.USD)) != null) {
            List<PaycheckInvestmentV2> list = this.allocations;
            BigDecimal bigDecimalAdd = BigDecimal.ZERO;
            for (Object obj : list) {
                Intrinsics.checkNotNull(bigDecimalAdd);
                bigDecimalAdd = bigDecimalAdd.add(((PaycheckInvestmentV2) obj).getAmount());
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            }
            Intrinsics.checkNotNull(bigDecimalAdd);
            Money moneyMinus = money.minus(Money3.toMoney(bigDecimalAdd, Currencies.USD));
            if (moneyMinus != null) {
                return Money.format$default(moneyMinus, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
        }
        return null;
    }

    public final StringResource getRecurringBrokerageSplitsSectionVisibilityValueText() {
        ArrayList arrayList = new ArrayList();
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null) {
            return null;
        }
        List<PaycheckInvestmentV2> equity = paycheckV2.getPaycheckAllocations().getIndividual().getEquity();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(equity, 10));
        for (PaycheckInvestmentV2 paycheckInvestmentV2 : equity) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C25434R.string.paycheck_detail_recurring_investment_format;
            String str = Money.format$default(Money3.toMoney(paycheckInvestmentV2.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            String assetSymbol = paycheckInvestmentV2.getAssetSymbol();
            Intrinsics.checkNotNull(assetSymbol);
            arrayList2.add(companion.invoke(i, str, assetSymbol));
        }
        arrayList.addAll(arrayList2);
        List<PaycheckInvestmentV2> cash = paycheckV2.getPaycheckAllocations().getIndividual().getCash();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash, 10));
        Iterator<T> it = cash.iterator();
        while (it.hasNext()) {
            arrayList3.add(StringResource.INSTANCE.invoke(C25434R.string.paycheck_detail_recurring_brokerage_cash_transfer_format, Money.format$default(Money3.toMoney(((PaycheckInvestmentV2) it.next()).getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        }
        arrayList.addAll(arrayList3);
        List<PaycheckInvestmentV2> crypto2 = paycheckV2.getPaycheckAllocations().getIndividual().getCrypto();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto2, 10));
        for (PaycheckInvestmentV2 paycheckInvestmentV22 : crypto2) {
            StringResource.Companion companion2 = StringResource.INSTANCE;
            int i2 = C25434R.string.paycheck_detail_recurring_investment_format;
            String str2 = Money.format$default(Money3.toMoney(paycheckInvestmentV22.getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            String assetSymbol2 = paycheckInvestmentV22.getAssetSymbol();
            Intrinsics.checkNotNull(assetSymbol2);
            arrayList4.add(companion2.invoke(i2, str2, assetSymbol2));
        }
        arrayList.addAll(arrayList4);
        if (arrayList.isEmpty()) {
            return null;
        }
        return StringResources6.join(arrayList, "\n");
    }

    public final StringResource getRecurringRetirementSplitsSectionVisibilityValueText() {
        ArrayList arrayList = new ArrayList();
        PaycheckV2 paycheckV2 = this.paycheck;
        if (paycheckV2 == null) {
            return null;
        }
        List<PaycheckInvestmentV2> cash = paycheckV2.getPaycheckAllocations().getIraRoth().getCash();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash, 10));
        Iterator<T> it = cash.iterator();
        while (it.hasNext()) {
            arrayList2.add(StringResource.INSTANCE.invoke(C25434R.string.paycheck_detail_recurring_ira_roth_cash_transfer_format, Money.format$default(Money3.toMoney(((PaycheckInvestmentV2) it.next()).getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        }
        arrayList.addAll(arrayList2);
        List<PaycheckInvestmentV2> cash2 = paycheckV2.getPaycheckAllocations().getIraTraditional().getCash();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(cash2, 10));
        Iterator<T> it2 = cash2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(StringResource.INSTANCE.invoke(C25434R.string.paycheck_detail_recurring_ira_traditional_cash_transfer_format, Money.format$default(Money3.toMoney(((PaycheckInvestmentV2) it2.next()).getAmount(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null)));
        }
        arrayList.addAll(arrayList3);
        if (arrayList.isEmpty()) {
            return null;
        }
        return StringResources6.join(arrayList, "\n");
    }
}

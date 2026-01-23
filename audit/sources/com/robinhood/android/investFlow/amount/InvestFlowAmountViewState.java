package com.robinhood.android.investFlow.amount;

import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet4;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InvestFlowAmountViewState.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001HBu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000fHÂ\u0003J\t\u0010?\u001a\u00020\u0011HÆ\u0003J\t\u0010@\u001a\u00020\u0013HÆ\u0003J\t\u0010A\u001a\u00020\u0015HÆ\u0003J\t\u0010B\u001a\u00020\u0017HÆ\u0003J\u007f\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001J\u0013\u0010D\u001a\u00020\u00132\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\rHÖ\u0001J\t\u0010G\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u0011\u0010-\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010&R\u0011\u0010/\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0011\u00101\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010*R\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b8\u00106¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState;", "", "selectedAmount", "Lcom/robinhood/models/util/Money;", "error", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "overrideCharArray", "", "selectedInstruments", "", "Lcom/robinhood/models/db/Instrument;", "numberSelectedInstruments", "", "unifiedAccount", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "selectedFrequency", "Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "isCrypto", "", "minOrderAmount", "Ljava/math/BigDecimal;", "accountNumber", "", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/udf/UiEvent;[CLjava/util/List;ILcom/robinhood/models/db/phoenix/UnifiedAccountV2;Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;ZLjava/math/BigDecimal;Ljava/lang/String;)V", "getSelectedAmount", "()Lcom/robinhood/models/util/Money;", "getError", "()Lcom/robinhood/udf/UiEvent;", "getOverrideCharArray", "()[C", "getSelectedInstruments", "()Ljava/util/List;", "getNumberSelectedInstruments", "()I", "getSelectedFrequency", "()Lcom/robinhood/android/recurring/contracts/investflow/InvestFlowFrequency;", "()Z", "getMinOrderAmount", "()Ljava/math/BigDecimal;", "getAccountNumber", "()Ljava/lang/String;", "amountCharArray", "getAmountCharArray", "continueButtonEnabled", "getContinueButtonEnabled", "accountBuyingPower", "getAccountBuyingPower", "symbol", "getSymbol", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "descriptionText", "getDescriptionText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "Error", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowAmountViewState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UiEvent<Error> error;
    private final boolean isCrypto;
    private final BigDecimal minOrderAmount;
    private final int numberSelectedInstruments;
    private final char[] overrideCharArray;
    private final Money selectedAmount;
    private final InvestFlowFrequency selectedFrequency;
    private final List<Instrument> selectedInstruments;
    private final UnifiedAccountV2 unifiedAccount;

    /* renamed from: component6, reason: from getter */
    private final UnifiedAccountV2 getUnifiedAccount() {
        return this.unifiedAccount;
    }

    public static /* synthetic */ InvestFlowAmountViewState copy$default(InvestFlowAmountViewState investFlowAmountViewState, Money money, UiEvent uiEvent, char[] cArr, List list, int i, UnifiedAccountV2 unifiedAccountV2, InvestFlowFrequency investFlowFrequency, boolean z, BigDecimal bigDecimal, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            money = investFlowAmountViewState.selectedAmount;
        }
        if ((i2 & 2) != 0) {
            uiEvent = investFlowAmountViewState.error;
        }
        if ((i2 & 4) != 0) {
            cArr = investFlowAmountViewState.overrideCharArray;
        }
        if ((i2 & 8) != 0) {
            list = investFlowAmountViewState.selectedInstruments;
        }
        if ((i2 & 16) != 0) {
            i = investFlowAmountViewState.numberSelectedInstruments;
        }
        if ((i2 & 32) != 0) {
            unifiedAccountV2 = investFlowAmountViewState.unifiedAccount;
        }
        if ((i2 & 64) != 0) {
            investFlowFrequency = investFlowAmountViewState.selectedFrequency;
        }
        if ((i2 & 128) != 0) {
            z = investFlowAmountViewState.isCrypto;
        }
        if ((i2 & 256) != 0) {
            bigDecimal = investFlowAmountViewState.minOrderAmount;
        }
        if ((i2 & 512) != 0) {
            str = investFlowAmountViewState.accountNumber;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        String str2 = str;
        InvestFlowFrequency investFlowFrequency2 = investFlowFrequency;
        boolean z2 = z;
        int i3 = i;
        UnifiedAccountV2 unifiedAccountV22 = unifiedAccountV2;
        return investFlowAmountViewState.copy(money, uiEvent, cArr, list, i3, unifiedAccountV22, investFlowFrequency2, z2, bigDecimal2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Money getSelectedAmount() {
        return this.selectedAmount;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final UiEvent<Error> component2() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final char[] getOverrideCharArray() {
        return this.overrideCharArray;
    }

    public final List<Instrument> component4() {
        return this.selectedInstruments;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNumberSelectedInstruments() {
        return this.numberSelectedInstruments;
    }

    /* renamed from: component7, reason: from getter */
    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: component9, reason: from getter */
    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public final InvestFlowAmountViewState copy(Money selectedAmount, UiEvent<Error> error, char[] overrideCharArray, List<Instrument> selectedInstruments, int numberSelectedInstruments, UnifiedAccountV2 unifiedAccount, InvestFlowFrequency selectedFrequency, boolean isCrypto, BigDecimal minOrderAmount, String accountNumber) {
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        Intrinsics.checkNotNullParameter(selectedInstruments, "selectedInstruments");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new InvestFlowAmountViewState(selectedAmount, error, overrideCharArray, selectedInstruments, numberSelectedInstruments, unifiedAccount, selectedFrequency, isCrypto, minOrderAmount, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowAmountViewState)) {
            return false;
        }
        InvestFlowAmountViewState investFlowAmountViewState = (InvestFlowAmountViewState) other;
        return Intrinsics.areEqual(this.selectedAmount, investFlowAmountViewState.selectedAmount) && Intrinsics.areEqual(this.error, investFlowAmountViewState.error) && Intrinsics.areEqual(this.overrideCharArray, investFlowAmountViewState.overrideCharArray) && Intrinsics.areEqual(this.selectedInstruments, investFlowAmountViewState.selectedInstruments) && this.numberSelectedInstruments == investFlowAmountViewState.numberSelectedInstruments && Intrinsics.areEqual(this.unifiedAccount, investFlowAmountViewState.unifiedAccount) && Intrinsics.areEqual(this.selectedFrequency, investFlowAmountViewState.selectedFrequency) && this.isCrypto == investFlowAmountViewState.isCrypto && Intrinsics.areEqual(this.minOrderAmount, investFlowAmountViewState.minOrderAmount) && Intrinsics.areEqual(this.accountNumber, investFlowAmountViewState.accountNumber);
    }

    public int hashCode() {
        int iHashCode = this.selectedAmount.hashCode() * 31;
        UiEvent<Error> uiEvent = this.error;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        char[] cArr = this.overrideCharArray;
        int iHashCode3 = (((((iHashCode2 + (cArr == null ? 0 : Arrays.hashCode(cArr))) * 31) + this.selectedInstruments.hashCode()) * 31) + Integer.hashCode(this.numberSelectedInstruments)) * 31;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        return ((((((((iHashCode3 + (unifiedAccountV2 != null ? unifiedAccountV2.hashCode() : 0)) * 31) + this.selectedFrequency.hashCode()) * 31) + Boolean.hashCode(this.isCrypto)) * 31) + this.minOrderAmount.hashCode()) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "InvestFlowAmountViewState(selectedAmount=" + this.selectedAmount + ", error=" + this.error + ", overrideCharArray=" + Arrays.toString(this.overrideCharArray) + ", selectedInstruments=" + this.selectedInstruments + ", numberSelectedInstruments=" + this.numberSelectedInstruments + ", unifiedAccount=" + this.unifiedAccount + ", selectedFrequency=" + this.selectedFrequency + ", isCrypto=" + this.isCrypto + ", minOrderAmount=" + this.minOrderAmount + ", accountNumber=" + this.accountNumber + ")";
    }

    public InvestFlowAmountViewState(Money selectedAmount, UiEvent<Error> uiEvent, char[] cArr, List<Instrument> selectedInstruments, int i, UnifiedAccountV2 unifiedAccountV2, InvestFlowFrequency selectedFrequency, boolean z, BigDecimal minOrderAmount, String accountNumber) {
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        Intrinsics.checkNotNullParameter(selectedInstruments, "selectedInstruments");
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(minOrderAmount, "minOrderAmount");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.selectedAmount = selectedAmount;
        this.error = uiEvent;
        this.overrideCharArray = cArr;
        this.selectedInstruments = selectedInstruments;
        this.numberSelectedInstruments = i;
        this.unifiedAccount = unifiedAccountV2;
        this.selectedFrequency = selectedFrequency;
        this.isCrypto = z;
        this.minOrderAmount = minOrderAmount;
        this.accountNumber = accountNumber;
    }

    public /* synthetic */ InvestFlowAmountViewState(Money money, UiEvent uiEvent, char[] cArr, List list, int i, UnifiedAccountV2 unifiedAccountV2, InvestFlowFrequency investFlowFrequency, boolean z, BigDecimal bigDecimal, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Money money2;
        if ((i2 & 1) != 0) {
            Currency currency = Currencies.USD;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            money2 = new Money(currency, ZERO);
        } else {
            money2 = money;
        }
        this(money2, (i2 & 2) != 0 ? null : uiEvent, (i2 & 4) != 0 ? null : cArr, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, i, (i2 & 32) != 0 ? null : unifiedAccountV2, investFlowFrequency, (i2 & 128) != 0 ? false : z, bigDecimal, str);
    }

    public final Money getSelectedAmount() {
        return this.selectedAmount;
    }

    public final UiEvent<Error> getError() {
        return this.error;
    }

    public final char[] getOverrideCharArray() {
        return this.overrideCharArray;
    }

    public final List<Instrument> getSelectedInstruments() {
        return this.selectedInstruments;
    }

    public final int getNumberSelectedInstruments() {
        return this.numberSelectedInstruments;
    }

    public final InvestFlowFrequency getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final boolean isCrypto() {
        return this.isCrypto;
    }

    public final BigDecimal getMinOrderAmount() {
        return this.minOrderAmount;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final char[] getAmountCharArray() {
        char[] cArr = this.overrideCharArray;
        if (cArr != null) {
            return cArr;
        }
        if (BigDecimals7.isInteger(this.selectedAmount.getDecimalValue())) {
            char[] charArray = Formats.getWholeNumberAmountFormat().format(this.selectedAmount.getDecimalValue()).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            return charArray;
        }
        char[] charArray2 = Formats.getAmountFormat().format(this.selectedAmount.getDecimalValue()).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
        return charArray2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getContinueButtonEnabled() {
        boolean z;
        boolean zIsZero = this.selectedAmount.isZero();
        boolean z2 = this.selectedAmount.getDecimalValue().compareTo(this.minOrderAmount) >= 0;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
            z = this.selectedAmount.getDecimalValue().compareTo(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT)) <= 0;
        } else {
            if (!(investFlowFrequency instanceof InvestFlowFrequency.Recurring)) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.selectedAmount.getDecimalValue().compareTo(new BigDecimal(10000)) <= 0) {
            }
        }
        return !zIsZero && z2 && z;
    }

    public final BigDecimal getAccountBuyingPower() {
        Money accountBuyingPower;
        BigDecimal decimalValue;
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 != null && (accountBuyingPower = unifiedAccountV2.getAccountBuyingPower()) != null && (decimalValue = accountBuyingPower.getDecimalValue()) != null) {
            return decimalValue;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    public final String getSymbol() {
        String symbol;
        Instrument instrument = (Instrument) CollectionsKt.firstOrNull((List) this.selectedInstruments);
        return (instrument == null || (symbol = instrument.getSymbol()) == null) ? "" : symbol;
    }

    public final StringResource getTitleText() {
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (investFlowFrequency instanceof InvestFlowFrequency.Once) {
            int i = this.numberSelectedInstruments;
            if (i == 1) {
                return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_amount_title_once_single, getSymbol());
            }
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_amount_title_once_multiple, Integer.valueOf(i));
        }
        if (!(investFlowFrequency instanceof InvestFlowFrequency.Recurring)) {
            throw new NoWhenBranchMatchedException();
        }
        RecurringFrequencyBottomSheet.Row bottomSheetRow = RecurringFrequencyBottomSheet4.toBottomSheetRow(((InvestFlowFrequency.Recurring) investFlowFrequency).getFrequency(), this.isCrypto);
        if (bottomSheetRow == null) {
            return null;
        }
        int titleLowercase = bottomSheetRow.getTitleLowercase();
        int i2 = this.numberSelectedInstruments;
        if (i2 == 1) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return companion.invoke(C19349R.string.invest_flow_amount_title_recurring_single, getSymbol(), companion.invoke(titleLowercase, new Object[0]));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        return companion2.invoke(C19349R.string.invest_flow_amount_title_recurring_multiple, Integer.valueOf(i2), companion2.invoke(titleLowercase, new Object[0]));
    }

    public final StringResource getDescriptionText() {
        Money accountBuyingPower;
        String str;
        InvestFlowFrequency investFlowFrequency = this.selectedFrequency;
        if (!(investFlowFrequency instanceof InvestFlowFrequency.Once)) {
            if (investFlowFrequency instanceof InvestFlowFrequency.Recurring) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        UnifiedAccountV2 unifiedAccountV2 = this.unifiedAccount;
        if (unifiedAccountV2 == null || (accountBuyingPower = unifiedAccountV2.getAccountBuyingPower()) == null || (str = Money.format$default(accountBuyingPower, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_amount_available, str);
    }

    /* compiled from: InvestFlowAmountViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B9\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "message", "positiveButton", "negativeButton", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getMessage", "getPositiveButton", "getNegativeButton", "LessThanMin", "GreaterThanMax", "NotEnoughBuyingPower", "Generic", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$Generic;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$GreaterThanMax;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$LessThanMin;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$NotEnoughBuyingPower;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Error {
        public static final int $stable = StringResource.$stable;
        private final StringResource message;
        private final StringResource negativeButton;
        private final StringResource positiveButton;
        private final StringResource title;

        public /* synthetic */ Error(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, stringResource2, stringResource3, stringResource4);
        }

        private Error(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4) {
            this.title = stringResource;
            this.message = stringResource2;
            this.positiveButton = stringResource3;
            this.negativeButton = stringResource4;
        }

        public /* synthetic */ Error(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stringResource, (i & 2) != 0 ? null : stringResource2, (i & 4) != 0 ? null : stringResource3, (i & 8) != 0 ? null : stringResource4, null);
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getMessage() {
            return this.message;
        }

        public final StringResource getPositiveButton() {
            return this.positiveButton;
        }

        public final StringResource getNegativeButton() {
            return this.negativeButton;
        }

        /* compiled from: InvestFlowAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$LessThanMin;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "message", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class LessThanMin extends Error {
            public static final int $stable = StringResource.$stable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LessThanMin(StringResource message) {
                super(null, message, null, null, 13, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        /* compiled from: InvestFlowAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$GreaterThanMax;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "message", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class GreaterThanMax extends Error {
            public static final int $stable = StringResource.$stable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GreaterThanMax(StringResource message) {
                super(null, message, null, null, 13, null);
                Intrinsics.checkNotNullParameter(message, "message");
            }
        }

        /* compiled from: InvestFlowAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$NotEnoughBuyingPower;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class NotEnoughBuyingPower extends Error {
            public static final int $stable = StringResource.$stable;

            /* JADX WARN: Illegal instructions before constructor call */
            public NotEnoughBuyingPower() {
                StringResource.Companion companion = StringResource.INSTANCE;
                super(companion.invoke(C19349R.string.invest_flow_not_enough_buying_power_error_title, new Object[0]), companion.invoke(C19349R.string.invest_flow_not_enough_buying_power_error_message, new Object[0]), companion.invoke(C19349R.string.invest_flow_not_enough_buying_power_positive_button, new Object[0]), companion.invoke(C19349R.string.invest_flow_not_enough_buying_power_negative_button, new Object[0]), null);
            }
        }

        /* compiled from: InvestFlowAmountViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error$Generic;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Generic extends Error {
            public static final Generic INSTANCE = new Generic();
            public static final int $stable = StringResource.$stable;

            private Generic() {
                super(null, null, null, null, 15, null);
            }
        }
    }
}

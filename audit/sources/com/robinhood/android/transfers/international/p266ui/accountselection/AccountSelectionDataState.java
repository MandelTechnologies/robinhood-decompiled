package com.robinhood.android.transfers.international.p266ui.accountselection;

import com.robinhood.android.models.currencybalance.api.CurrencyBalance;
import com.robinhood.android.transfers.international.p266ui.accountselection.AccountSelectionFragment;
import com.robinhood.models.paymentinstrument.p340db.PaymentInstrumentV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionDataState;", "", "args", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;", "accountNumber", "", "currencyBalances", "", "Lcom/robinhood/android/models/currencybalance/api/CurrencyBalance;", "bankAccountInstruments", "Lcom/robinhood/models/paymentinstrument/db/PaymentInstrumentV2;", "<init>", "(Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getArgs", "()Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionFragment$Args;", "getAccountNumber", "()Ljava/lang/String;", "getCurrencyBalances", "()Ljava/util/List;", "getBankAccountInstruments", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AccountSelectionDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final AccountSelectionFragment.Args args;
    private final List<PaymentInstrumentV2> bankAccountInstruments;
    private final List<CurrencyBalance> currencyBalances;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountSelectionDataState copy$default(AccountSelectionDataState accountSelectionDataState, AccountSelectionFragment.Args args, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            args = accountSelectionDataState.args;
        }
        if ((i & 2) != 0) {
            str = accountSelectionDataState.accountNumber;
        }
        if ((i & 4) != 0) {
            list = accountSelectionDataState.currencyBalances;
        }
        if ((i & 8) != 0) {
            list2 = accountSelectionDataState.bankAccountInstruments;
        }
        return accountSelectionDataState.copy(args, str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final AccountSelectionFragment.Args getArgs() {
        return this.args;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<CurrencyBalance> component3() {
        return this.currencyBalances;
    }

    public final List<PaymentInstrumentV2> component4() {
        return this.bankAccountInstruments;
    }

    public final AccountSelectionDataState copy(AccountSelectionFragment.Args args, String accountNumber, List<CurrencyBalance> currencyBalances, List<PaymentInstrumentV2> bankAccountInstruments) {
        Intrinsics.checkNotNullParameter(args, "args");
        return new AccountSelectionDataState(args, accountNumber, currencyBalances, bankAccountInstruments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSelectionDataState)) {
            return false;
        }
        AccountSelectionDataState accountSelectionDataState = (AccountSelectionDataState) other;
        return Intrinsics.areEqual(this.args, accountSelectionDataState.args) && Intrinsics.areEqual(this.accountNumber, accountSelectionDataState.accountNumber) && Intrinsics.areEqual(this.currencyBalances, accountSelectionDataState.currencyBalances) && Intrinsics.areEqual(this.bankAccountInstruments, accountSelectionDataState.bankAccountInstruments);
    }

    public int hashCode() {
        int iHashCode = this.args.hashCode() * 31;
        String str = this.accountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CurrencyBalance> list = this.currencyBalances;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PaymentInstrumentV2> list2 = this.bankAccountInstruments;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "AccountSelectionDataState(args=" + this.args + ", accountNumber=" + this.accountNumber + ", currencyBalances=" + this.currencyBalances + ", bankAccountInstruments=" + this.bankAccountInstruments + ")";
    }

    public AccountSelectionDataState(AccountSelectionFragment.Args args, String str, List<CurrencyBalance> list, List<PaymentInstrumentV2> list2) {
        Intrinsics.checkNotNullParameter(args, "args");
        this.args = args;
        this.accountNumber = str;
        this.currencyBalances = list;
        this.bankAccountInstruments = list2;
    }

    public /* synthetic */ AccountSelectionDataState(AccountSelectionFragment.Args args, String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(args, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    public final AccountSelectionFragment.Args getArgs() {
        return this.args;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final List<CurrencyBalance> getCurrencyBalances() {
        return this.currencyBalances;
    }

    public final List<PaymentInstrumentV2> getBankAccountInstruments() {
        return this.bankAccountInstruments;
    }
}

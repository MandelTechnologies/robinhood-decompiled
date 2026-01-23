package com.robinhood.android.transfers.cryptocheckout;

import com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionViewState;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherAccount;
import com.robinhood.models.crypto.p314db.CryptoCurrencyPairAccountSwitcher;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.crypto.utils.CryptoCurrencyPairAccountSwitchers;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentMethodSelectionDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionDataState;", "", "isCryptoMibExperimentEnabled", "", "accountSwitcher", "Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "selectedRhsAccountNumber", "", "<init>", "(ZLcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;Ljava/lang/String;)V", "()Z", "getAccountSwitcher", "()Lcom/robinhood/models/crypto/db/CryptoCurrencyPairAccountSwitcher;", "getSelectedRhsAccountNumber", "()Ljava/lang/String;", "headerType", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "getHeaderType", "()Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final /* data */ class PaymentMethodSelectionDataState {
    public static final int $stable = 8;
    private final CryptoCurrencyPairAccountSwitcher accountSwitcher;
    private final boolean isCryptoMibExperimentEnabled;
    private final String selectedRhsAccountNumber;

    public PaymentMethodSelectionDataState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ PaymentMethodSelectionDataState copy$default(PaymentMethodSelectionDataState paymentMethodSelectionDataState, boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = paymentMethodSelectionDataState.isCryptoMibExperimentEnabled;
        }
        if ((i & 2) != 0) {
            cryptoCurrencyPairAccountSwitcher = paymentMethodSelectionDataState.accountSwitcher;
        }
        if ((i & 4) != 0) {
            str = paymentMethodSelectionDataState.selectedRhsAccountNumber;
        }
        return paymentMethodSelectionDataState.copy(z, cryptoCurrencyPairAccountSwitcher, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoCurrencyPairAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedRhsAccountNumber() {
        return this.selectedRhsAccountNumber;
    }

    public final PaymentMethodSelectionDataState copy(boolean isCryptoMibExperimentEnabled, CryptoCurrencyPairAccountSwitcher accountSwitcher, String selectedRhsAccountNumber) {
        return new PaymentMethodSelectionDataState(isCryptoMibExperimentEnabled, accountSwitcher, selectedRhsAccountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodSelectionDataState)) {
            return false;
        }
        PaymentMethodSelectionDataState paymentMethodSelectionDataState = (PaymentMethodSelectionDataState) other;
        return this.isCryptoMibExperimentEnabled == paymentMethodSelectionDataState.isCryptoMibExperimentEnabled && Intrinsics.areEqual(this.accountSwitcher, paymentMethodSelectionDataState.accountSwitcher) && Intrinsics.areEqual(this.selectedRhsAccountNumber, paymentMethodSelectionDataState.selectedRhsAccountNumber);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCryptoMibExperimentEnabled) * 31;
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.accountSwitcher;
        int iHashCode2 = (iHashCode + (cryptoCurrencyPairAccountSwitcher == null ? 0 : cryptoCurrencyPairAccountSwitcher.hashCode())) * 31;
        String str = this.selectedRhsAccountNumber;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethodSelectionDataState(isCryptoMibExperimentEnabled=" + this.isCryptoMibExperimentEnabled + ", accountSwitcher=" + this.accountSwitcher + ", selectedRhsAccountNumber=" + this.selectedRhsAccountNumber + ")";
    }

    public PaymentMethodSelectionDataState(boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, String str) {
        this.isCryptoMibExperimentEnabled = z;
        this.accountSwitcher = cryptoCurrencyPairAccountSwitcher;
        this.selectedRhsAccountNumber = str;
    }

    public /* synthetic */ PaymentMethodSelectionDataState(boolean z, CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : cryptoCurrencyPairAccountSwitcher, (i & 4) != 0 ? null : str);
    }

    public final boolean isCryptoMibExperimentEnabled() {
        return this.isCryptoMibExperimentEnabled;
    }

    public final CryptoCurrencyPairAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final String getSelectedRhsAccountNumber() {
        return this.selectedRhsAccountNumber;
    }

    public final PaymentMethodSelectionViewState.HeaderType getHeaderType() {
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher;
        if (!this.isCryptoMibExperimentEnabled || (cryptoCurrencyPairAccountSwitcher = this.accountSwitcher) == null || this.selectedRhsAccountNumber == null) {
            return PaymentMethodSelectionViewState.HeaderType.Default.INSTANCE;
        }
        if (cryptoCurrencyPairAccountSwitcher.getBuy().getAccounts().size() == 1) {
            return PaymentMethodSelectionViewState.HeaderType.Default.INSTANCE;
        }
        for (CryptoAccountSwitcherAccount cryptoAccountSwitcherAccount : this.accountSwitcher.getBuy().getAccounts()) {
            if (Intrinsics.areEqual(cryptoAccountSwitcherAccount.getRhsAccountNumber(), this.selectedRhsAccountNumber)) {
                return new PaymentMethodSelectionViewState.HeaderType.AccountSwitcher(cryptoAccountSwitcherAccount.getTitle());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        CryptoCurrencyPairAccountSwitcher cryptoCurrencyPairAccountSwitcher = this.accountSwitcher;
        if (cryptoCurrencyPairAccountSwitcher == null) {
            return null;
        }
        Screen screen = new Screen(Screen.Name.CRYPTO_ORDER_SELECT_PAYMENT_METHOD, null, null, null, 14, null);
        String str = this.selectedRhsAccountNumber;
        if (str == null) {
            str = "";
        }
        return CryptoCurrencyPairAccountSwitchers.toAccountSwitcherData(cryptoCurrencyPairAccountSwitcher, str, screen, CryptoCurrencyPairAccountSwitcher.Location.BUY);
    }
}

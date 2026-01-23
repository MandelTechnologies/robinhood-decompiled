package com.robinhood.android.transfers.cryptocheckout;

import bff_money_movement.service.p019v1.BillingAccountDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent;", "", "AccountSelected", "AddAccount", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent$AccountSelected;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent$AddAccount;", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface PaymentMethodSelectionEvent {

    /* compiled from: PaymentMethodSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent$AccountSelected;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent;", "billingAccount", "Lbff_money_movement/service/v1/BillingAccountDto;", "<init>", "(Lbff_money_movement/service/v1/BillingAccountDto;)V", "getBillingAccount", "()Lbff_money_movement/service/v1/BillingAccountDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountSelected implements PaymentMethodSelectionEvent {
        public static final int $stable = 8;
        private final BillingAccountDto billingAccount;

        public static /* synthetic */ AccountSelected copy$default(AccountSelected accountSelected, BillingAccountDto billingAccountDto, int i, Object obj) {
            if ((i & 1) != 0) {
                billingAccountDto = accountSelected.billingAccount;
            }
            return accountSelected.copy(billingAccountDto);
        }

        /* renamed from: component1, reason: from getter */
        public final BillingAccountDto getBillingAccount() {
            return this.billingAccount;
        }

        public final AccountSelected copy(BillingAccountDto billingAccount) {
            Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
            return new AccountSelected(billingAccount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountSelected) && Intrinsics.areEqual(this.billingAccount, ((AccountSelected) other).billingAccount);
        }

        public int hashCode() {
            return this.billingAccount.hashCode();
        }

        public String toString() {
            return "AccountSelected(billingAccount=" + this.billingAccount + ")";
        }

        public AccountSelected(BillingAccountDto billingAccount) {
            Intrinsics.checkNotNullParameter(billingAccount, "billingAccount");
            this.billingAccount = billingAccount;
        }

        public final BillingAccountDto getBillingAccount() {
            return this.billingAccount;
        }
    }

    /* compiled from: PaymentMethodSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent$AddAccount;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AddAccount implements PaymentMethodSelectionEvent {
        public static final int $stable = 0;
        public static final AddAccount INSTANCE = new AddAccount();

        public boolean equals(Object other) {
            return this == other || (other instanceof AddAccount);
        }

        public int hashCode() {
            return -399281230;
        }

        public String toString() {
            return "AddAccount";
        }

        private AddAccount() {
        }
    }
}

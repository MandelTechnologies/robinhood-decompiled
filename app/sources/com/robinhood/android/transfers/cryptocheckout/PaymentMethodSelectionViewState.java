package com.robinhood.android.transfers.cryptocheckout;

import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState;", "", "headerType", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "<init>", "(Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "getHeaderType", "()Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "getAccountSwitcherData", "()Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HeaderType", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PaymentMethodSelectionViewState {
    public static final int $stable = 8;
    private final AccountSwitcherData accountSwitcherData;
    private final HeaderType headerType;

    public static /* synthetic */ PaymentMethodSelectionViewState copy$default(PaymentMethodSelectionViewState paymentMethodSelectionViewState, HeaderType headerType, AccountSwitcherData accountSwitcherData, int i, Object obj) {
        if ((i & 1) != 0) {
            headerType = paymentMethodSelectionViewState.headerType;
        }
        if ((i & 2) != 0) {
            accountSwitcherData = paymentMethodSelectionViewState.accountSwitcherData;
        }
        return paymentMethodSelectionViewState.copy(headerType, accountSwitcherData);
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderType getHeaderType() {
        return this.headerType;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    public final PaymentMethodSelectionViewState copy(HeaderType headerType, AccountSwitcherData accountSwitcherData) {
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        return new PaymentMethodSelectionViewState(headerType, accountSwitcherData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodSelectionViewState)) {
            return false;
        }
        PaymentMethodSelectionViewState paymentMethodSelectionViewState = (PaymentMethodSelectionViewState) other;
        return Intrinsics.areEqual(this.headerType, paymentMethodSelectionViewState.headerType) && Intrinsics.areEqual(this.accountSwitcherData, paymentMethodSelectionViewState.accountSwitcherData);
    }

    public int hashCode() {
        int iHashCode = this.headerType.hashCode() * 31;
        AccountSwitcherData accountSwitcherData = this.accountSwitcherData;
        return iHashCode + (accountSwitcherData == null ? 0 : accountSwitcherData.hashCode());
    }

    public String toString() {
        return "PaymentMethodSelectionViewState(headerType=" + this.headerType + ", accountSwitcherData=" + this.accountSwitcherData + ")";
    }

    public PaymentMethodSelectionViewState(HeaderType headerType, AccountSwitcherData accountSwitcherData) {
        Intrinsics.checkNotNullParameter(headerType, "headerType");
        this.headerType = headerType;
        this.accountSwitcherData = accountSwitcherData;
    }

    public final HeaderType getHeaderType() {
        return this.headerType;
    }

    public final AccountSwitcherData getAccountSwitcherData() {
        return this.accountSwitcherData;
    }

    /* compiled from: PaymentMethodSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "", "<init>", "()V", "Default", "AccountSwitcher", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType$AccountSwitcher;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType$Default;", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class HeaderType {
        public static final int $stable = 0;

        public /* synthetic */ HeaderType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PaymentMethodSelectionViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType$Default;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Default extends HeaderType {
            public static final int $stable = 0;
            public static final Default INSTANCE = new Default();

            public boolean equals(Object other) {
                return this == other || (other instanceof Default);
            }

            public int hashCode() {
                return 648586606;
            }

            public String toString() {
                return "Default";
            }

            private Default() {
                super(null);
            }
        }

        private HeaderType() {
        }

        /* compiled from: PaymentMethodSelectionViewState.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType$AccountSwitcher;", "Lcom/robinhood/android/transfers/cryptocheckout/PaymentMethodSelectionViewState$HeaderType;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-crypto-checkout_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountSwitcher extends HeaderType {
            public static final int $stable = 0;
            private final String name;

            public static /* synthetic */ AccountSwitcher copy$default(AccountSwitcher accountSwitcher, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = accountSwitcher.name;
                }
                return accountSwitcher.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final AccountSwitcher copy(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return new AccountSwitcher(name);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountSwitcher) && Intrinsics.areEqual(this.name, ((AccountSwitcher) other).name);
            }

            public int hashCode() {
                return this.name.hashCode();
            }

            public String toString() {
                return "AccountSwitcher(name=" + this.name + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountSwitcher(String name) {
                super(null);
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
            }

            public final String getName() {
                return this.name;
            }
        }
    }
}

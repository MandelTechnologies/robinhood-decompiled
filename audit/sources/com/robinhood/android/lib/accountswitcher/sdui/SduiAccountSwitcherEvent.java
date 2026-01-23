package com.robinhood.android.lib.accountswitcher.sdui;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SduiAccountSwitcherEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent;", "", "<init>", "()V", "AccountSelected", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent$AccountSelected;", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class SduiAccountSwitcherEvent {
    public static final int $stable = 0;

    public /* synthetic */ SduiAccountSwitcherEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SduiAccountSwitcherEvent() {
    }

    /* compiled from: SduiAccountSwitcherEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent$AccountSelected;", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent;", "accountNumber", "", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountSelected extends SduiAccountSwitcherEvent {
        public static final int $stable = 0;
        private final String accountNumber;
        private final BrokerageAccountType brokerageAccountType;

        public static /* synthetic */ AccountSelected copy$default(AccountSelected accountSelected, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountSelected.accountNumber;
            }
            if ((i & 2) != 0) {
                brokerageAccountType = accountSelected.brokerageAccountType;
            }
            return accountSelected.copy(str, brokerageAccountType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        public final AccountSelected copy(String accountNumber, BrokerageAccountType brokerageAccountType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            return new AccountSelected(accountNumber, brokerageAccountType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountSelected)) {
                return false;
            }
            AccountSelected accountSelected = (AccountSelected) other;
            return Intrinsics.areEqual(this.accountNumber, accountSelected.accountNumber) && this.brokerageAccountType == accountSelected.brokerageAccountType;
        }

        public int hashCode() {
            return (this.accountNumber.hashCode() * 31) + this.brokerageAccountType.hashCode();
        }

        public String toString() {
            return "AccountSelected(accountNumber=" + this.accountNumber + ", brokerageAccountType=" + this.brokerageAccountType + ")";
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final BrokerageAccountType getBrokerageAccountType() {
            return this.brokerageAccountType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
            super(null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
            this.accountNumber = accountNumber;
            this.brokerageAccountType = brokerageAccountType;
        }
    }
}

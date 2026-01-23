package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementContributeFooterButton.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "", "accountNumber", "", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "getAccountNumber", "()Ljava/lang/String;", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ContributeButtonState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final BrokerageAccountType accountType;

    public static /* synthetic */ ContributeButtonState copy$default(ContributeButtonState contributeButtonState, String str, BrokerageAccountType brokerageAccountType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contributeButtonState.accountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = contributeButtonState.accountType;
        }
        return contributeButtonState.copy(str, brokerageAccountType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final ContributeButtonState copy(String accountNumber, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        return new ContributeButtonState(accountNumber, accountType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContributeButtonState)) {
            return false;
        }
        ContributeButtonState contributeButtonState = (ContributeButtonState) other;
        return Intrinsics.areEqual(this.accountNumber, contributeButtonState.accountNumber) && this.accountType == contributeButtonState.accountType;
    }

    public int hashCode() {
        return (this.accountNumber.hashCode() * 31) + this.accountType.hashCode();
    }

    public String toString() {
        return "ContributeButtonState(accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ")";
    }

    public ContributeButtonState(String accountNumber, BrokerageAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }
}

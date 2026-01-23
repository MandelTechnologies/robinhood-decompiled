package com.robinhood.android.transfers.recurring.p270ui.experiment.hub;

import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringDepositHubDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/experiment/hub/RecurringDepositHubDataState;", "", "automaticDeposits", "", "Lcom/robinhood/models/ui/AutomaticDepositWithBankInfo;", "brokerageAccounts", "", "", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getAutomaticDeposits", "()Ljava/util/List;", "getBrokerageAccounts", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RecurringDepositHubDataState {
    public static final int $stable = 8;
    private final List<AutomaticDepositWithBankInfo> automaticDeposits;
    private final Map<String, Account> brokerageAccounts;

    /* JADX WARN: Multi-variable type inference failed */
    public RecurringDepositHubDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringDepositHubDataState copy$default(RecurringDepositHubDataState recurringDepositHubDataState, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recurringDepositHubDataState.automaticDeposits;
        }
        if ((i & 2) != 0) {
            map = recurringDepositHubDataState.brokerageAccounts;
        }
        return recurringDepositHubDataState.copy(list, map);
    }

    public final List<AutomaticDepositWithBankInfo> component1() {
        return this.automaticDeposits;
    }

    public final Map<String, Account> component2() {
        return this.brokerageAccounts;
    }

    public final RecurringDepositHubDataState copy(List<AutomaticDepositWithBankInfo> automaticDeposits, Map<String, Account> brokerageAccounts) {
        Intrinsics.checkNotNullParameter(automaticDeposits, "automaticDeposits");
        Intrinsics.checkNotNullParameter(brokerageAccounts, "brokerageAccounts");
        return new RecurringDepositHubDataState(automaticDeposits, brokerageAccounts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringDepositHubDataState)) {
            return false;
        }
        RecurringDepositHubDataState recurringDepositHubDataState = (RecurringDepositHubDataState) other;
        return Intrinsics.areEqual(this.automaticDeposits, recurringDepositHubDataState.automaticDeposits) && Intrinsics.areEqual(this.brokerageAccounts, recurringDepositHubDataState.brokerageAccounts);
    }

    public int hashCode() {
        return (this.automaticDeposits.hashCode() * 31) + this.brokerageAccounts.hashCode();
    }

    public String toString() {
        return "RecurringDepositHubDataState(automaticDeposits=" + this.automaticDeposits + ", brokerageAccounts=" + this.brokerageAccounts + ")";
    }

    public RecurringDepositHubDataState(List<AutomaticDepositWithBankInfo> automaticDeposits, Map<String, Account> brokerageAccounts) {
        Intrinsics.checkNotNullParameter(automaticDeposits, "automaticDeposits");
        Intrinsics.checkNotNullParameter(brokerageAccounts, "brokerageAccounts");
        this.automaticDeposits = automaticDeposits;
        this.brokerageAccounts = brokerageAccounts;
    }

    public /* synthetic */ RecurringDepositHubDataState(List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    public final List<AutomaticDepositWithBankInfo> getAutomaticDeposits() {
        return this.automaticDeposits;
    }

    public final Map<String, Account> getBrokerageAccounts() {
        return this.brokerageAccounts;
    }
}

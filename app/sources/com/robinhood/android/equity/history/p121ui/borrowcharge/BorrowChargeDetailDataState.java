package com.robinhood.android.equity.history.p121ui.borrowcharge;

import com.robinhood.android.equity.history.p121ui.borrowcharge.BorrowChargeDetailViewState;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.GroupedBorrowCharges;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeDetailDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDataState;", "", "account", "Lcom/robinhood/models/db/Account;", "groupedBorrowCharges", "Lcom/robinhood/models/db/GroupedBorrowCharges;", "instrumentBorrowCharges", "", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState$UiBorrowCharge;", "<init>", "(Lcom/robinhood/models/db/Account;Lcom/robinhood/models/db/GroupedBorrowCharges;Ljava/util/List;)V", "getAccount", "()Lcom/robinhood/models/db/Account;", "getGroupedBorrowCharges", "()Lcom/robinhood/models/db/GroupedBorrowCharges;", "getInstrumentBorrowCharges", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BorrowChargeDetailDataState {
    public static final int $stable = 8;
    private final Account account;
    private final GroupedBorrowCharges groupedBorrowCharges;
    private final List<BorrowChargeDetailViewState.UiBorrowCharge> instrumentBorrowCharges;

    public BorrowChargeDetailDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BorrowChargeDetailDataState copy$default(BorrowChargeDetailDataState borrowChargeDetailDataState, Account account, GroupedBorrowCharges groupedBorrowCharges, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            account = borrowChargeDetailDataState.account;
        }
        if ((i & 2) != 0) {
            groupedBorrowCharges = borrowChargeDetailDataState.groupedBorrowCharges;
        }
        if ((i & 4) != 0) {
            list = borrowChargeDetailDataState.instrumentBorrowCharges;
        }
        return borrowChargeDetailDataState.copy(account, groupedBorrowCharges, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    /* renamed from: component2, reason: from getter */
    public final GroupedBorrowCharges getGroupedBorrowCharges() {
        return this.groupedBorrowCharges;
    }

    public final List<BorrowChargeDetailViewState.UiBorrowCharge> component3() {
        return this.instrumentBorrowCharges;
    }

    public final BorrowChargeDetailDataState copy(Account account, GroupedBorrowCharges groupedBorrowCharges, List<BorrowChargeDetailViewState.UiBorrowCharge> instrumentBorrowCharges) {
        return new BorrowChargeDetailDataState(account, groupedBorrowCharges, instrumentBorrowCharges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorrowChargeDetailDataState)) {
            return false;
        }
        BorrowChargeDetailDataState borrowChargeDetailDataState = (BorrowChargeDetailDataState) other;
        return Intrinsics.areEqual(this.account, borrowChargeDetailDataState.account) && Intrinsics.areEqual(this.groupedBorrowCharges, borrowChargeDetailDataState.groupedBorrowCharges) && Intrinsics.areEqual(this.instrumentBorrowCharges, borrowChargeDetailDataState.instrumentBorrowCharges);
    }

    public int hashCode() {
        Account account = this.account;
        int iHashCode = (account == null ? 0 : account.hashCode()) * 31;
        GroupedBorrowCharges groupedBorrowCharges = this.groupedBorrowCharges;
        int iHashCode2 = (iHashCode + (groupedBorrowCharges == null ? 0 : groupedBorrowCharges.hashCode())) * 31;
        List<BorrowChargeDetailViewState.UiBorrowCharge> list = this.instrumentBorrowCharges;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BorrowChargeDetailDataState(account=" + this.account + ", groupedBorrowCharges=" + this.groupedBorrowCharges + ", instrumentBorrowCharges=" + this.instrumentBorrowCharges + ")";
    }

    public BorrowChargeDetailDataState(Account account, GroupedBorrowCharges groupedBorrowCharges, List<BorrowChargeDetailViewState.UiBorrowCharge> list) {
        this.account = account;
        this.groupedBorrowCharges = groupedBorrowCharges;
        this.instrumentBorrowCharges = list;
    }

    public /* synthetic */ BorrowChargeDetailDataState(Account account, GroupedBorrowCharges groupedBorrowCharges, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : account, (i & 2) != 0 ? null : groupedBorrowCharges, (i & 4) != 0 ? null : list);
    }

    public final Account getAccount() {
        return this.account;
    }

    public final GroupedBorrowCharges getGroupedBorrowCharges() {
        return this.groupedBorrowCharges;
    }

    public final List<BorrowChargeDetailViewState.UiBorrowCharge> getInstrumentBorrowCharges() {
        return this.instrumentBorrowCharges;
    }
}

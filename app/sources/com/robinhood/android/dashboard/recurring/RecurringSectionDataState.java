package com.robinhood.android.dashboard.recurring;

import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.dashboard.recurring.RecurringSectionViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.Account;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RecurringSectionDataState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\n*\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionDataState;", "", "accountNumber", "", "account", "Lcom/robinhood/models/db/Account;", "recurringInvestments", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "cryptoSupported", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/db/Account;Ljava/util/List;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getAccount", "()Lcom/robinhood/models/db/Account;", "getRecurringInvestments", "()Ljava/util/List;", "getCryptoSupported", "()Z", "emptyStateAllowed", "getEmptyStateAllowed", "(Lcom/robinhood/models/db/Account;)Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RecurringSectionDataState {
    private final Account account;
    private final String accountNumber;
    private final boolean cryptoSupported;
    private final List<InvestmentSchedule> recurringInvestments;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RecurringSectionDataState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecurringSectionDataState copy$default(RecurringSectionDataState recurringSectionDataState, String str, Account account, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringSectionDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            account = recurringSectionDataState.account;
        }
        if ((i & 4) != 0) {
            list = recurringSectionDataState.recurringInvestments;
        }
        if ((i & 8) != 0) {
            z = recurringSectionDataState.cryptoSupported;
        }
        return recurringSectionDataState.copy(str, account, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final List<InvestmentSchedule> component3() {
        return this.recurringInvestments;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCryptoSupported() {
        return this.cryptoSupported;
    }

    public final RecurringSectionDataState copy(String accountNumber, Account account, List<InvestmentSchedule> recurringInvestments, boolean cryptoSupported) {
        Intrinsics.checkNotNullParameter(recurringInvestments, "recurringInvestments");
        return new RecurringSectionDataState(accountNumber, account, recurringInvestments, cryptoSupported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringSectionDataState)) {
            return false;
        }
        RecurringSectionDataState recurringSectionDataState = (RecurringSectionDataState) other;
        return Intrinsics.areEqual(this.accountNumber, recurringSectionDataState.accountNumber) && Intrinsics.areEqual(this.account, recurringSectionDataState.account) && Intrinsics.areEqual(this.recurringInvestments, recurringSectionDataState.recurringInvestments) && this.cryptoSupported == recurringSectionDataState.cryptoSupported;
    }

    public int hashCode() {
        String str = this.accountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Account account = this.account;
        return ((((iHashCode + (account != null ? account.hashCode() : 0)) * 31) + this.recurringInvestments.hashCode()) * 31) + Boolean.hashCode(this.cryptoSupported);
    }

    public String toString() {
        return "RecurringSectionDataState(accountNumber=" + this.accountNumber + ", account=" + this.account + ", recurringInvestments=" + this.recurringInvestments + ", cryptoSupported=" + this.cryptoSupported + ")";
    }

    public RecurringSectionDataState(String str, Account account, List<InvestmentSchedule> recurringInvestments, boolean z) {
        Intrinsics.checkNotNullParameter(recurringInvestments, "recurringInvestments");
        this.accountNumber = str;
        this.account = account;
        this.recurringInvestments = recurringInvestments;
        this.cryptoSupported = z;
    }

    public /* synthetic */ RecurringSectionDataState(String str, Account account, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : account, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final List<InvestmentSchedule> getRecurringInvestments() {
        return this.recurringInvestments;
    }

    public final boolean getCryptoSupported() {
        return this.cryptoSupported;
    }

    /* compiled from: RecurringSectionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionDataState;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState;", "<init>", "()V", "reduce", "dataState", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements StateProvider<RecurringSectionDataState, RecurringSectionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RecurringSectionViewState reduce(RecurringSectionDataState dataState) {
            int i;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            if (dataState.getAccountNumber() != null && !dataState.getRecurringInvestments().isEmpty()) {
                String accountNumber = dataState.getAccountNumber();
                ImmutableList immutableList = extensions2.toImmutableList(InvestmentScheduleExtensions.toSummarizedStatefulHistoryEvents$default(dataState.getRecurringInvestments(), 0, 1, null));
                if (dataState.getCryptoSupported()) {
                    i = C11595R.string.recurring_investment_info_bottom_sheet_message_with_crypto;
                } else {
                    i = C11595R.string.recurring_investment_info_bottom_sheet_message;
                }
                return new RecurringSectionViewState.LoadedContent(accountNumber, immutableList, i);
            }
            if (dataState.getAccountNumber() != null && dataState.getEmptyStateAllowed(dataState.getAccount())) {
                return new RecurringSectionViewState.LoadedEmpty(dataState.getAccountNumber());
            }
            return RecurringSectionViewState.Hidden.INSTANCE;
        }
    }

    public final boolean getEmptyStateAllowed(Account account) {
        return account != null && account.getBrokerageAccountType().isCustodial();
    }
}

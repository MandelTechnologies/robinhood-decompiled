package com.robinhood.android.dashboard.recurring;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringSectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState;", "", "Hidden", "LoadedEmpty", "LoadedContent", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$Hidden;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$LoadedContent;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$LoadedEmpty;", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface RecurringSectionViewState {

    /* compiled from: RecurringSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$Hidden;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Hidden implements RecurringSectionViewState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        public boolean equals(Object other) {
            return this == other || (other instanceof Hidden);
        }

        public int hashCode() {
            return 1181345139;
        }

        public String toString() {
            return "Hidden";
        }

        private Hidden() {
        }
    }

    /* compiled from: RecurringSectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$LoadedEmpty;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadedEmpty implements RecurringSectionViewState {
        public static final int $stable = 0;
        private final String accountNumber;

        public static /* synthetic */ LoadedEmpty copy$default(LoadedEmpty loadedEmpty, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadedEmpty.accountNumber;
            }
            return loadedEmpty.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final LoadedEmpty copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new LoadedEmpty(accountNumber);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadedEmpty) && Intrinsics.areEqual(this.accountNumber, ((LoadedEmpty) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "LoadedEmpty(accountNumber=" + this.accountNumber + ")";
        }

        public LoadedEmpty(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: RecurringSectionViewState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0014\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\nHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u00052\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState$LoadedContent;", "Lcom/robinhood/android/dashboard/recurring/RecurringSectionViewState;", "accountNumber", "", "recurringInvestments", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "bottomSheetTextRes", "", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;I)V", "getAccountNumber", "()Ljava/lang/String;", "getRecurringInvestments", "()Lkotlinx/collections/immutable/ImmutableList;", "getBottomSheetTextRes", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "lib-dashboard-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadedContent implements RecurringSectionViewState {
        public static final int $stable = 8;
        private final String accountNumber;
        private final int bottomSheetTextRes;
        private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> recurringInvestments;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadedContent copy$default(LoadedContent loadedContent, String str, ImmutableList immutableList, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = loadedContent.accountNumber;
            }
            if ((i2 & 2) != 0) {
                immutableList = loadedContent.recurringInvestments;
            }
            if ((i2 & 4) != 0) {
                i = loadedContent.bottomSheetTextRes;
            }
            return loadedContent.copy(str, immutableList, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component2() {
            return this.recurringInvestments;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBottomSheetTextRes() {
            return this.bottomSheetTextRes;
        }

        public final LoadedContent copy(String accountNumber, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> recurringInvestments, int bottomSheetTextRes) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(recurringInvestments, "recurringInvestments");
            return new LoadedContent(accountNumber, recurringInvestments, bottomSheetTextRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadedContent)) {
                return false;
            }
            LoadedContent loadedContent = (LoadedContent) other;
            return Intrinsics.areEqual(this.accountNumber, loadedContent.accountNumber) && Intrinsics.areEqual(this.recurringInvestments, loadedContent.recurringInvestments) && this.bottomSheetTextRes == loadedContent.bottomSheetTextRes;
        }

        public int hashCode() {
            return (((this.accountNumber.hashCode() * 31) + this.recurringInvestments.hashCode()) * 31) + Integer.hashCode(this.bottomSheetTextRes);
        }

        public String toString() {
            return "LoadedContent(accountNumber=" + this.accountNumber + ", recurringInvestments=" + this.recurringInvestments + ", bottomSheetTextRes=" + this.bottomSheetTextRes + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoadedContent(String accountNumber, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> recurringInvestments, int i) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(recurringInvestments, "recurringInvestments");
            this.accountNumber = accountNumber;
            this.recurringInvestments = recurringInvestments;
            this.bottomSheetTextRes = i;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getRecurringInvestments() {
            return this.recurringInvestments;
        }

        public final int getBottomSheetTextRes() {
            return this.bottomSheetTextRes;
        }
    }
}

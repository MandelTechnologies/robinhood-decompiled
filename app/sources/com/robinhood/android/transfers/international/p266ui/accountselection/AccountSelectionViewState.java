package com.robinhood.android.transfers.international.p266ui.accountselection;

import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState;", "", "Loading", "Loaded", "Row", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Loading;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface AccountSelectionViewState {

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Loading;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AccountSelectionViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 1161109260;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Loaded;", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState;", "title", "", "rows", "", "Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Row;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getRows", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AccountSelectionViewState {
        public static final int $stable = 8;
        private final List<Row> rows;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                list = loaded.rows;
            }
            return loaded.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<Row> component2() {
            return this.rows;
        }

        public final Loaded copy(String title, List<Row> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            return new Loaded(title, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.rows, loaded.rows);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.rows.hashCode();
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", rows=" + this.rows + ")";
        }

        public Loaded(String title, List<Row> rows) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(rows, "rows");
            this.title = title;
            this.rows = rows;
        }

        public final String getTitle() {
            return this.title;
        }

        public final List<Row> getRows() {
            return this.rows;
        }
    }

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/accountselection/AccountSelectionViewState$Row;", "", "bentoRowState", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "account", "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "<init>", "(Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;)V", "getBentoRowState", "()Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState;", "getAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Row {
        public static final int $stable = BentoBaseRowState.$stable;
        private final MultiCurrencyAccount account;
        private final BentoBaseRowState bentoRowState;

        public static /* synthetic */ Row copy$default(Row row, BentoBaseRowState bentoBaseRowState, MultiCurrencyAccount multiCurrencyAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                bentoBaseRowState = row.bentoRowState;
            }
            if ((i & 2) != 0) {
                multiCurrencyAccount = row.account;
            }
            return row.copy(bentoBaseRowState, multiCurrencyAccount);
        }

        /* renamed from: component1, reason: from getter */
        public final BentoBaseRowState getBentoRowState() {
            return this.bentoRowState;
        }

        /* renamed from: component2, reason: from getter */
        public final MultiCurrencyAccount getAccount() {
            return this.account;
        }

        public final Row copy(BentoBaseRowState bentoRowState, MultiCurrencyAccount account) {
            Intrinsics.checkNotNullParameter(bentoRowState, "bentoRowState");
            return new Row(bentoRowState, account);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.bentoRowState, row.bentoRowState) && Intrinsics.areEqual(this.account, row.account);
        }

        public int hashCode() {
            int iHashCode = this.bentoRowState.hashCode() * 31;
            MultiCurrencyAccount multiCurrencyAccount = this.account;
            return iHashCode + (multiCurrencyAccount == null ? 0 : multiCurrencyAccount.hashCode());
        }

        public String toString() {
            return "Row(bentoRowState=" + this.bentoRowState + ", account=" + this.account + ")";
        }

        public Row(BentoBaseRowState bentoRowState, MultiCurrencyAccount multiCurrencyAccount) {
            Intrinsics.checkNotNullParameter(bentoRowState, "bentoRowState");
            this.bentoRowState = bentoRowState;
            this.account = multiCurrencyAccount;
        }

        public final BentoBaseRowState getBentoRowState() {
            return this.bentoRowState;
        }

        public final MultiCurrencyAccount getAccount() {
            return this.account;
        }
    }
}

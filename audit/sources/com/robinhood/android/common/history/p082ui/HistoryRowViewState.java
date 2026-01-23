package com.robinhood.android.common.history.p082ui;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: HistoryRowViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState$Loaded;", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState$Loading;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface HistoryRowViewState {

    /* compiled from: HistoryRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowViewState$Loading;", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements HistoryRowViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 2121764803;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: HistoryRowViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowViewState$Loaded;", "Lcom/robinhood/android/common/history/ui/HistoryRowViewState;", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "<init>", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary;)V", "getSummary", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements HistoryRowViewState {
        public static final int $stable = TransactionSummary.$stable;
        private final TransactionSummary summary;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, TransactionSummary transactionSummary, int i, Object obj) {
            if ((i & 1) != 0) {
                transactionSummary = loaded.summary;
            }
            return loaded.copy(transactionSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final TransactionSummary getSummary() {
            return this.summary;
        }

        public final Loaded copy(TransactionSummary summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Loaded(summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.summary, ((Loaded) other).summary);
        }

        public int hashCode() {
            return this.summary.hashCode();
        }

        public String toString() {
            return "Loaded(summary=" + this.summary + ")";
        }

        public Loaded(TransactionSummary summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.summary = summary;
        }

        public final TransactionSummary getSummary() {
            return this.summary;
        }
    }
}

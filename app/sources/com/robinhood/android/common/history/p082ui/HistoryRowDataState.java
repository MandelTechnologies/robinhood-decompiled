package com.robinhood.android.common.history.p082ui;

import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: HistoryRowDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/HistoryRowDataState;", "", ErrorBundle.SUMMARY_ENTRY, "Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "statefulHistoryEvent", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "<init>", "(Lcom/robinhood/android/common/history/ui/format/TransactionSummary;Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;)V", "getSummary", "()Lcom/robinhood/android/common/history/ui/format/TransactionSummary;", "getStatefulHistoryEvent", "()Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryRowDataState {
    public static final int $stable = 8;
    private final StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent;
    private final TransactionSummary summary;

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryRowDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryRowDataState copy$default(HistoryRowDataState historyRowDataState, TransactionSummary transactionSummary, StatefulHistoryEvent statefulHistoryEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionSummary = historyRowDataState.summary;
        }
        if ((i & 2) != 0) {
            statefulHistoryEvent = historyRowDataState.statefulHistoryEvent;
        }
        return historyRowDataState.copy(transactionSummary, statefulHistoryEvent);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionSummary getSummary() {
        return this.summary;
    }

    public final StatefulHistoryEvent<HistoryEvent> component2() {
        return this.statefulHistoryEvent;
    }

    public final HistoryRowDataState copy(TransactionSummary summary, StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEvent) {
        return new HistoryRowDataState(summary, statefulHistoryEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryRowDataState)) {
            return false;
        }
        HistoryRowDataState historyRowDataState = (HistoryRowDataState) other;
        return Intrinsics.areEqual(this.summary, historyRowDataState.summary) && Intrinsics.areEqual(this.statefulHistoryEvent, historyRowDataState.statefulHistoryEvent);
    }

    public int hashCode() {
        TransactionSummary transactionSummary = this.summary;
        int iHashCode = (transactionSummary == null ? 0 : transactionSummary.hashCode()) * 31;
        StatefulHistoryEvent<HistoryEvent> statefulHistoryEvent = this.statefulHistoryEvent;
        return iHashCode + (statefulHistoryEvent != null ? statefulHistoryEvent.hashCode() : 0);
    }

    public String toString() {
        return "HistoryRowDataState(summary=" + this.summary + ", statefulHistoryEvent=" + this.statefulHistoryEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryRowDataState(TransactionSummary transactionSummary, StatefulHistoryEvent<? extends HistoryEvent> statefulHistoryEvent) {
        this.summary = transactionSummary;
        this.statefulHistoryEvent = statefulHistoryEvent;
    }

    public /* synthetic */ HistoryRowDataState(TransactionSummary transactionSummary, StatefulHistoryEvent statefulHistoryEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionSummary, (i & 2) != 0 ? null : statefulHistoryEvent);
    }

    public final TransactionSummary getSummary() {
        return this.summary;
    }

    public final StatefulHistoryEvent<HistoryEvent> getStatefulHistoryEvent() {
        return this.statefulHistoryEvent;
    }
}

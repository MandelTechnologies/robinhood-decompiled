package com.robinhood.android.common.detail.component.history;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageHistoryViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/history/HistoryItemWithDuxoKeyPrefix;", "", "historyItem", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "duxoKeyPrefix", "", "<init>", "(Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;Ljava/lang/String;)V", "getHistoryItem", "()Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "getDuxoKeyPrefix", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryItemWithDuxoKeyPrefix {
    public static final int $stable = 8;
    private final String duxoKeyPrefix;
    private final StatefulHistoryEvent<HistoryEvent> historyItem;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryItemWithDuxoKeyPrefix copy$default(HistoryItemWithDuxoKeyPrefix historyItemWithDuxoKeyPrefix, StatefulHistoryEvent statefulHistoryEvent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            statefulHistoryEvent = historyItemWithDuxoKeyPrefix.historyItem;
        }
        if ((i & 2) != 0) {
            str = historyItemWithDuxoKeyPrefix.duxoKeyPrefix;
        }
        return historyItemWithDuxoKeyPrefix.copy(statefulHistoryEvent, str);
    }

    public final StatefulHistoryEvent<HistoryEvent> component1() {
        return this.historyItem;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDuxoKeyPrefix() {
        return this.duxoKeyPrefix;
    }

    public final HistoryItemWithDuxoKeyPrefix copy(StatefulHistoryEvent<? extends HistoryEvent> historyItem, String duxoKeyPrefix) {
        Intrinsics.checkNotNullParameter(historyItem, "historyItem");
        Intrinsics.checkNotNullParameter(duxoKeyPrefix, "duxoKeyPrefix");
        return new HistoryItemWithDuxoKeyPrefix(historyItem, duxoKeyPrefix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryItemWithDuxoKeyPrefix)) {
            return false;
        }
        HistoryItemWithDuxoKeyPrefix historyItemWithDuxoKeyPrefix = (HistoryItemWithDuxoKeyPrefix) other;
        return Intrinsics.areEqual(this.historyItem, historyItemWithDuxoKeyPrefix.historyItem) && Intrinsics.areEqual(this.duxoKeyPrefix, historyItemWithDuxoKeyPrefix.duxoKeyPrefix);
    }

    public int hashCode() {
        return (this.historyItem.hashCode() * 31) + this.duxoKeyPrefix.hashCode();
    }

    public String toString() {
        return "HistoryItemWithDuxoKeyPrefix(historyItem=" + this.historyItem + ", duxoKeyPrefix=" + this.duxoKeyPrefix + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryItemWithDuxoKeyPrefix(StatefulHistoryEvent<? extends HistoryEvent> historyItem, String duxoKeyPrefix) {
        Intrinsics.checkNotNullParameter(historyItem, "historyItem");
        Intrinsics.checkNotNullParameter(duxoKeyPrefix, "duxoKeyPrefix");
        this.historyItem = historyItem;
        this.duxoKeyPrefix = duxoKeyPrefix;
    }

    public final StatefulHistoryEvent<HistoryEvent> getHistoryItem() {
        return this.historyItem;
    }

    public final String getDuxoKeyPrefix() {
        return this.duxoKeyPrefix;
    }
}

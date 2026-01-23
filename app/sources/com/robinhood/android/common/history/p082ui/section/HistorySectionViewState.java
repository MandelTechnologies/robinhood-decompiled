package com.robinhood.android.common.history.p082ui.section;

import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: HistorySectionViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/section/HistorySectionViewState;", "", "showFooter", "", "historyItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "<init>", "(ZLkotlinx/collections/immutable/ImmutableList;)V", "getShowFooter", "()Z", "getHistoryItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistorySectionViewState {
    public static final int $stable = 8;
    private final ImmutableList<StatefulHistoryEvent<HistoryEvent>> historyItems;
    private final boolean showFooter;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistorySectionViewState copy$default(HistorySectionViewState historySectionViewState, boolean z, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            z = historySectionViewState.showFooter;
        }
        if ((i & 2) != 0) {
            immutableList = historySectionViewState.historyItems;
        }
        return historySectionViewState.copy(z, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowFooter() {
        return this.showFooter;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> component2() {
        return this.historyItems;
    }

    public final HistorySectionViewState copy(boolean showFooter, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyItems) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        return new HistorySectionViewState(showFooter, historyItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistorySectionViewState)) {
            return false;
        }
        HistorySectionViewState historySectionViewState = (HistorySectionViewState) other;
        return this.showFooter == historySectionViewState.showFooter && Intrinsics.areEqual(this.historyItems, historySectionViewState.historyItems);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showFooter) * 31) + this.historyItems.hashCode();
    }

    public String toString() {
        return "HistorySectionViewState(showFooter=" + this.showFooter + ", historyItems=" + this.historyItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistorySectionViewState(boolean z, ImmutableList<? extends StatefulHistoryEvent<? extends HistoryEvent>> historyItems) {
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        this.showFooter = z;
        this.historyItems = historyItems;
    }

    public final boolean getShowFooter() {
        return this.showFooter;
    }

    public final ImmutableList<StatefulHistoryEvent<HistoryEvent>> getHistoryItems() {
        return this.historyItems;
    }
}

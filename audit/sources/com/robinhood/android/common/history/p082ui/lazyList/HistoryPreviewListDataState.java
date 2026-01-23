package com.robinhood.android.common.history.p082ui.lazyList;

import androidx.paging.Pager;
import com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListItemsState;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryPreviewListDataState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J#\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\tHÆ\u0003J\t\u0010\u0016\u001a\u00020\u000bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListDataState;", "", "params", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryItemPager;", "listItemsState", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "<init>", "(Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;Landroidx/paging/Pager;Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;)V", "getParams", "()Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListParams;", "getHistoryPager", "()Landroidx/paging/Pager;", "getListItemsState", "()Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListItemsState;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class HistoryPreviewListDataState {
    public static final int $stable = 8;
    private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
    private final HistoryPreviewListItemsState listItemsState;
    private final HistoryPreviewListParams params;

    public HistoryPreviewListDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryPreviewListDataState copy$default(HistoryPreviewListDataState historyPreviewListDataState, HistoryPreviewListParams historyPreviewListParams, Pager pager, HistoryPreviewListItemsState historyPreviewListItemsState, int i, Object obj) {
        if ((i & 1) != 0) {
            historyPreviewListParams = historyPreviewListDataState.params;
        }
        if ((i & 2) != 0) {
            pager = historyPreviewListDataState.historyPager;
        }
        if ((i & 4) != 0) {
            historyPreviewListItemsState = historyPreviewListDataState.listItemsState;
        }
        return historyPreviewListDataState.copy(historyPreviewListParams, pager, historyPreviewListItemsState);
    }

    /* renamed from: component1, reason: from getter */
    public final HistoryPreviewListParams getParams() {
        return this.params;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> component2() {
        return this.historyPager;
    }

    /* renamed from: component3, reason: from getter */
    public final HistoryPreviewListItemsState getListItemsState() {
        return this.listItemsState;
    }

    public final HistoryPreviewListDataState copy(HistoryPreviewListParams params, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, HistoryPreviewListItemsState listItemsState) {
        Intrinsics.checkNotNullParameter(listItemsState, "listItemsState");
        return new HistoryPreviewListDataState(params, historyPager, listItemsState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryPreviewListDataState)) {
            return false;
        }
        HistoryPreviewListDataState historyPreviewListDataState = (HistoryPreviewListDataState) other;
        return Intrinsics.areEqual(this.params, historyPreviewListDataState.params) && Intrinsics.areEqual(this.historyPager, historyPreviewListDataState.historyPager) && Intrinsics.areEqual(this.listItemsState, historyPreviewListDataState.listItemsState);
    }

    public int hashCode() {
        HistoryPreviewListParams historyPreviewListParams = this.params;
        int iHashCode = (historyPreviewListParams == null ? 0 : historyPreviewListParams.hashCode()) * 31;
        Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager = this.historyPager;
        return ((iHashCode + (pager != null ? pager.hashCode() : 0)) * 31) + this.listItemsState.hashCode();
    }

    public String toString() {
        return "HistoryPreviewListDataState(params=" + this.params + ", historyPager=" + this.historyPager + ", listItemsState=" + this.listItemsState + ")";
    }

    public HistoryPreviewListDataState(HistoryPreviewListParams historyPreviewListParams, Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> pager, HistoryPreviewListItemsState listItemsState) {
        Intrinsics.checkNotNullParameter(listItemsState, "listItemsState");
        this.params = historyPreviewListParams;
        this.historyPager = pager;
        this.listItemsState = listItemsState;
    }

    public final HistoryPreviewListParams getParams() {
        return this.params;
    }

    public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> getHistoryPager() {
        return this.historyPager;
    }

    public /* synthetic */ HistoryPreviewListDataState(HistoryPreviewListParams historyPreviewListParams, Pager pager, HistoryPreviewListItemsState historyPreviewListItemsState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : historyPreviewListParams, (i & 2) != 0 ? null : pager, (i & 4) != 0 ? HistoryPreviewListItemsState.EmptyWithoutContent.INSTANCE : historyPreviewListItemsState);
    }

    public final HistoryPreviewListItemsState getListItemsState() {
        return this.listItemsState;
    }
}

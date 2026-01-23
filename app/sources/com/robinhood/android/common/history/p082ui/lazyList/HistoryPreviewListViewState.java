package com.robinhood.android.common.history.p082ui.lazyList;

import androidx.paging.Pager;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryPreviewListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState;", "", "itemCount", "", "getItemCount", "()I", "Loading", "Ready", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState$Loading;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState$Ready;", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface HistoryPreviewListViewState {
    int getItemCount();

    /* compiled from: HistoryPreviewListViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState$Loading;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState;", "itemCount", "", "<init>", "(I)V", "getItemCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements HistoryPreviewListViewState {
        public static final int $stable = 0;
        private final int itemCount;

        public static /* synthetic */ Loading copy$default(Loading loading, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = loading.itemCount;
            }
            return loading.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        public final Loading copy(int itemCount) {
            return new Loading(itemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.itemCount == ((Loading) other).itemCount;
        }

        public int hashCode() {
            return Integer.hashCode(this.itemCount);
        }

        public String toString() {
            return "Loading(itemCount=" + this.itemCount + ")";
        }

        public Loading(int i) {
            this.itemCount = i;
        }

        @Override // com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListViewState
        public int getItemCount() {
            return this.itemCount;
        }
    }

    /* compiled from: HistoryPreviewListViewState.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\tHÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u0002`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState$Ready;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryPreviewListViewState;", "historyPager", "Landroidx/paging/Pager;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent$SortKey;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/android/common/history/ui/lazyList/HistoryItemPager;", "itemCount", "", "<init>", "(Landroidx/paging/Pager;I)V", "getHistoryPager", "()Landroidx/paging/Pager;", "getItemCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements HistoryPreviewListViewState {
        public static final int $stable = 8;
        private final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager;
        private final int itemCount;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ready copy$default(Ready ready, Pager pager, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                pager = ready.historyPager;
            }
            if ((i2 & 2) != 0) {
                i = ready.itemCount;
            }
            return ready.copy(pager, i);
        }

        public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> component1() {
            return this.historyPager;
        }

        /* renamed from: component2, reason: from getter */
        public final int getItemCount() {
            return this.itemCount;
        }

        public final Ready copy(Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, int itemCount) {
            Intrinsics.checkNotNullParameter(historyPager, "historyPager");
            return new Ready(historyPager, itemCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.historyPager, ready.historyPager) && this.itemCount == ready.itemCount;
        }

        public int hashCode() {
            return (this.historyPager.hashCode() * 31) + Integer.hashCode(this.itemCount);
        }

        public String toString() {
            return "Ready(historyPager=" + this.historyPager + ", itemCount=" + this.itemCount + ")";
        }

        public Ready(Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> historyPager, int i) {
            Intrinsics.checkNotNullParameter(historyPager, "historyPager");
            this.historyPager = historyPager;
            this.itemCount = i;
        }

        public final Pager<HistoryEvent.SortKey, StatefulHistoryEvent<HistoryEvent>> getHistoryPager() {
            return this.historyPager;
        }

        @Override // com.robinhood.android.common.history.p082ui.lazyList.HistoryPreviewListViewState
        public int getItemCount() {
            return this.itemCount;
        }
    }
}

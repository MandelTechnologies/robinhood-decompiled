package com.robinhood.utils.p409ui.view.recyclerview;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.RangesKt;

/* compiled from: PaddingGridItemDecoration.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001c\u0010\n\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u000e\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u000f\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u0010\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u0011\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u0012\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u0013\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u001c\u0010\u0014\u001a\u00020\u00032\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010 \u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J&\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/PaddingGridItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "numColumns", "", "<init>", "(I)V", "setDefaultPadding", "", "outRect", "Landroid/graphics/Rect;", "getLeftEdgePadding", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "position", "getTopEdgePadding", "getRightEdgePadding", "getBottomEdgePadding", "getLeftInnerPadding", "getTopInnerPadding", "getRightInnerPadding", "getBottomInnerPadding", "sortedHeaderItemPositions", "", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/utils/ui/view/recyclerview/PaddingGridItemDecoration$OffsetInfo;", "getLeftPadding", "getTopPadding", "getRightPadding", "getBottomPadding", "isLeftEdge", "", "isTopEdge", "isRightEdge", "isBottomEdge", "columnIndex", "isItemHeader", "itemHeaderPositions", "getItemOffsets", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "OffsetInfo", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public class PaddingGridItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private final int numColumns;

    protected int getBottomEdgePadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getBottomInnerPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getLeftEdgePadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getLeftInnerPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getRightEdgePadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getRightInnerPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getTopEdgePadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    protected int getTopInnerPadding(RecyclerView.Adapter<?> adapter, int position) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return 0;
    }

    public PaddingGridItemDecoration(int i) {
        this.numColumns = i;
    }

    /* compiled from: PaddingGridItemDecoration.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/PaddingGridItemDecoration$OffsetInfo;", "", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "position", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/GridLayoutManager;I)V", "getAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final /* data */ class OffsetInfo {
        private final RecyclerView.Adapter<?> adapter;
        private final GridLayoutManager layoutManager;
        private final int position;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OffsetInfo copy$default(OffsetInfo offsetInfo, RecyclerView.Adapter adapter, GridLayoutManager gridLayoutManager, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                adapter = offsetInfo.adapter;
            }
            if ((i2 & 2) != 0) {
                gridLayoutManager = offsetInfo.layoutManager;
            }
            if ((i2 & 4) != 0) {
                i = offsetInfo.position;
            }
            return offsetInfo.copy(adapter, gridLayoutManager, i);
        }

        public final RecyclerView.Adapter<?> component1() {
            return this.adapter;
        }

        /* renamed from: component2, reason: from getter */
        public final GridLayoutManager getLayoutManager() {
            return this.layoutManager;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public final OffsetInfo copy(RecyclerView.Adapter<?> adapter, GridLayoutManager layoutManager, int position) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            return new OffsetInfo(adapter, layoutManager, position);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OffsetInfo)) {
                return false;
            }
            OffsetInfo offsetInfo = (OffsetInfo) other;
            return Intrinsics.areEqual(this.adapter, offsetInfo.adapter) && Intrinsics.areEqual(this.layoutManager, offsetInfo.layoutManager) && this.position == offsetInfo.position;
        }

        public int hashCode() {
            return (((this.adapter.hashCode() * 31) + this.layoutManager.hashCode()) * 31) + Integer.hashCode(this.position);
        }

        public String toString() {
            return "OffsetInfo(adapter=" + this.adapter + ", layoutManager=" + this.layoutManager + ", position=" + this.position + ")";
        }

        public OffsetInfo(RecyclerView.Adapter<?> adapter, GridLayoutManager layoutManager, int i) {
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
            this.adapter = adapter;
            this.layoutManager = layoutManager;
            this.position = i;
        }

        public final RecyclerView.Adapter<?> getAdapter() {
            return this.adapter;
        }

        public final GridLayoutManager getLayoutManager() {
            return this.layoutManager;
        }

        public final int getPosition() {
            return this.position;
        }
    }

    protected void setDefaultPadding(Rect outRect) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        outRect.set(0, 0, 0, 0);
    }

    private final List<Integer> sortedHeaderItemPositions(OffsetInfo info) {
        return CollectionsKt.sorted(itemHeaderPositions(info));
    }

    private final int getLeftPadding(OffsetInfo info) {
        if (isLeftEdge(info)) {
            return getLeftEdgePadding(info.getAdapter(), info.getPosition());
        }
        return getLeftInnerPadding(info.getAdapter(), info.getPosition());
    }

    private final int getTopPadding(OffsetInfo info) {
        if (isTopEdge(info)) {
            return getTopEdgePadding(info.getAdapter(), info.getPosition());
        }
        return getTopInnerPadding(info.getAdapter(), info.getPosition());
    }

    private final int getRightPadding(OffsetInfo info) {
        if (isRightEdge(info)) {
            return getRightEdgePadding(info.getAdapter(), info.getPosition());
        }
        return getRightInnerPadding(info.getAdapter(), info.getPosition());
    }

    private final int getBottomPadding(OffsetInfo info) {
        if (isBottomEdge(info)) {
            return getBottomEdgePadding(info.getAdapter(), info.getPosition());
        }
        return getBottomInnerPadding(info.getAdapter(), info.getPosition());
    }

    private final boolean isLeftEdge(OffsetInfo info) {
        return isItemHeader(info) || columnIndex(info) == 0;
    }

    private final boolean isTopEdge(OffsetInfo info) {
        if (info.getPosition() == 0 && isItemHeader(info)) {
            return true;
        }
        Integer num = (Integer) CollectionsKt.firstOrNull((List) sortedHeaderItemPositions(info));
        return num == null ? info.getPosition() < this.numColumns : info.getPosition() < this.numColumns && info.getPosition() < num.intValue();
    }

    private final boolean isRightEdge(OffsetInfo info) {
        return isItemHeader(info) || columnIndex(info) == this.numColumns - 1;
    }

    private final boolean isBottomEdge(OffsetInfo info) {
        if (info.getPosition() == info.getAdapter().getSize() - 1) {
            return true;
        }
        Integer num = (Integer) CollectionsKt.lastOrNull((List) sortedHeaderItemPositions(info));
        return info.getPosition() > (num != null ? num.intValue() : -1) && info.getPosition() > (info.getAdapter().getSize() - this.numColumns) - 1 && columnIndex(info) <= columnIndex(OffsetInfo.copy$default(info, null, null, info.getAdapter().getSize() + (-1), 3, null));
    }

    private final int columnIndex(OffsetInfo info) {
        Integer numPrevious;
        if (isItemHeader(info)) {
            return 0;
        }
        List<Integer> listSortedHeaderItemPositions = sortedHeaderItemPositions(info);
        ListIterator<Integer> listIterator = listSortedHeaderItemPositions.listIterator(listSortedHeaderItemPositions.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                numPrevious = null;
                break;
            }
            numPrevious = listIterator.previous();
            if (numPrevious.intValue() < info.getPosition()) {
                break;
            }
        }
        return ((info.getPosition() - (numPrevious != null ? r2.intValue() : 0)) - 1) % this.numColumns;
    }

    private final boolean isItemHeader(OffsetInfo info) {
        return itemHeaderPositions(info).contains(Integer.valueOf(info.getPosition()));
    }

    private final List<Integer> itemHeaderPositions(OffsetInfo info) {
        PrimitiveRanges2 primitiveRanges2Until = RangesKt.until(0, info.getAdapter().getSize());
        ArrayList arrayList = new ArrayList();
        for (Integer num : primitiveRanges2Until) {
            if (info.getLayoutManager().getSpanSizeLookup().getSpanSize(num.intValue()) > 1) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        setDefaultPadding(outRect);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            childAdapterPosition = parent.getChildViewHolder(view).getOldPosition();
        }
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        if (childAdapterPosition >= adapter.getSize()) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        OffsetInfo offsetInfo = new OffsetInfo(adapter, (GridLayoutManager) layoutManager, childAdapterPosition);
        int leftPadding = getLeftPadding(offsetInfo);
        int topPadding = getTopPadding(offsetInfo);
        int rightPadding = getRightPadding(offsetInfo);
        int bottomPadding = getBottomPadding(offsetInfo);
        outRect.left = leftPadding;
        outRect.top = topPadding;
        outRect.right = rightPadding;
        outRect.bottom = bottomPadding;
    }
}

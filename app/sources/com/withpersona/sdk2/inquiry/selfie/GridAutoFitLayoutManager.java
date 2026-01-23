package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: GridAutoFitLayoutManager.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "", "columnWidth", "<init>", "(Landroid/content/Context;I)V", "checkedColumnWidth", "(Landroid/content/Context;I)I", "newColumnWidth", "", "setColumnWidth", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "I", "", "columnWidthChanged", "Z", "lastTotalSpace", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GridAutoFitLayoutManager extends GridLayoutManager {
    private int columnWidth;
    private boolean columnWidthChanged;
    private int lastTotalSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridAutoFitLayoutManager(Context context, int i) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.columnWidthChanged = true;
        setColumnWidth(checkedColumnWidth(context, i));
    }

    private final int checkedColumnWidth(Context context, int columnWidth) {
        return columnWidth <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : columnWidth;
    }

    private final void setColumnWidth(int newColumnWidth) {
        if (newColumnWidth <= 0 || newColumnWidth == this.columnWidth) {
            return;
        }
        this.columnWidth = newColumnWidth;
        this.columnWidthChanged = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int height;
        int paddingBottom;
        Intrinsics.checkNotNullParameter(state, "state");
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingBottom = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = height - paddingBottom;
        if ((this.columnWidthChanged && this.columnWidth > 0) || i != this.lastTotalSpace) {
            setSpanCount(RangesKt.coerceAtLeast(1, i / this.columnWidth));
            this.columnWidthChanged = false;
            this.lastTotalSpace = i;
        }
        super.onLayoutChildren(recycler, state);
    }
}

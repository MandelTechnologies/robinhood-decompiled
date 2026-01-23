package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccurateLinearLayoutManager.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/ui/AccurateLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "childHeightArray", "Landroid/util/SparseIntArray;", "onLayoutCompleted", "", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "computeVerticalScrollOffset", "", "getAverageRowHeight", "firstChild", "Landroid/view/View;", "endChild", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class AccurateLinearLayoutManager extends LinearLayoutManager {
    public static final int $stable = 8;
    private final SparseIntArray childHeightArray;

    public AccurateLinearLayoutManager(Context context) {
        super(context);
        this.childHeightArray = new SparseIntArray();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Intrinsics.checkNotNull(childAt);
            this.childHeightArray.put(getPosition(childAt), getDecoratedMeasuredHeight(childAt));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (getChildCount() == 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        Intrinsics.checkNotNull(childAt);
        View childAt2 = getChildAt(getChildCount() - 1);
        Intrinsics.checkNotNull(childAt2);
        int position = getPosition(childAt);
        int i = -getDecoratedTop(childAt);
        int averageRowHeight = getAverageRowHeight(childAt, childAt2);
        for (int i2 = 0; i2 < position; i2++) {
            i += this.childHeightArray.get(i2, averageRowHeight);
        }
        return i;
    }

    private final int getAverageRowHeight(View firstChild, View endChild) {
        return Math.abs(getDecoratedBottom(endChild) - getDecoratedTop(firstChild)) / (Math.abs(getPosition(firstChild) - getPosition(endChild)) + 1);
    }
}

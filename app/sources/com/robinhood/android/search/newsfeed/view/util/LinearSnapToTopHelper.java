package com.robinhood.android.search.newsfeed.view.util;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinearSnapToTopHelper.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/view/util/LinearSnapToTopHelper;", "Landroidx/recyclerview/widget/LinearSnapHelper;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "orientationHelper", "Landroidx/recyclerview/widget/OrientationHelper;", "minFlingVelocity", "", "calculateDistanceToFinalSnap", "", "layoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "targetView", "Landroid/view/View;", "findSnapView", "findTargetSnapPosition", "velocityX", "velocityY", "getOrientationHelper", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class LinearSnapToTopHelper extends LinearSnapHelper {
    public static final int $stable = 8;
    private final int minFlingVelocity;
    private OrientationHelper orientationHelper;

    public LinearSnapToTopHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.minFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View targetView) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        if (!layoutManager.canScrollVertically()) {
            throw new IllegalArgumentException("Only supports vertically scrolling layout managers");
        }
        return new int[]{0, getOrientationHelper(layoutManager).getDecoratedStart(targetView)};
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        if (!layoutManager.canScrollVertically()) {
            throw new IllegalArgumentException("Only supports vertically scrolling layout managers");
        }
        OrientationHelper orientationHelper = getOrientationHelper(layoutManager);
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int startAfterPadding = orientationHelper.getStartAfterPadding();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            Intrinsics.checkNotNull(childAt);
            int iAbs = Math.abs(orientationHelper.getDecoratedStart(childAt) - startAfterPadding);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX, int velocityY) {
        View viewFindSnapView;
        int position;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        if (layoutManager.getItemCount() == 0 || (viewFindSnapView = findSnapView(layoutManager)) == null || (position = layoutManager.getPosition(viewFindSnapView)) == -1) {
            return -1;
        }
        int i = this.minFlingVelocity;
        return velocityY > i ? position + 1 : velocityY < (-i) ? position - 1 : position;
    }

    private final OrientationHelper getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelperCreateVerticalHelper = this.orientationHelper;
        if (orientationHelperCreateVerticalHelper == null) {
            orientationHelperCreateVerticalHelper = OrientationHelper.createVerticalHelper(layoutManager);
        }
        this.orientationHelper = orientationHelperCreateVerticalHelper;
        Intrinsics.checkNotNull(orientationHelperCreateVerticalHelper);
        return orientationHelperCreateVerticalHelper;
    }
}

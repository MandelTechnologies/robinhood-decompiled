package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.PrimitiveIterators6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: CardStackLayoutHelper.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\nJ \u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002J \u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackLayoutHelper;", "", "itemOffsetPixelSize", "", "<init>", "(I)V", "hasMeasuredItemSize", "", "topMargin", "layoutItemView", "", "layoutManager", "Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackLayoutManager;", "scrollOffset", "firstItemMovementPercent", "", "itemView", "Landroid/view/View;", "position", "requestLayout", "getFirstVisibleItemTop", "parentHeight", "getAfterFirstVisibleItemTop", "movementPercent", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CardStackLayoutHelper {
    public static final int $stable = 8;
    private boolean hasMeasuredItemSize;
    private final int itemOffsetPixelSize;
    private int topMargin;

    public CardStackLayoutHelper(int i) {
        this.itemOffsetPixelSize = i;
    }

    public final void layoutItemView(CardStackLayoutManager layoutManager, int scrollOffset, float firstItemMovementPercent, View itemView, int position) {
        int afterFirstVisibleItemTop;
        Intrinsics.checkNotNullParameter(layoutManager, "layoutManager");
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        int height = layoutManager.getHeight();
        if (!this.hasMeasuredItemSize) {
            itemView.measure(View.MeasureSpec.makeMeasureSpec(layoutManager.getWidth(), Integer.MIN_VALUE), 0);
            this.topMargin = (height - itemView.getMeasuredHeight()) / 2;
        }
        if (position == 0) {
            afterFirstVisibleItemTop = getFirstVisibleItemTop(height, scrollOffset, this.topMargin);
        } else {
            afterFirstVisibleItemTop = getAfterFirstVisibleItemTop(position, firstItemMovementPercent, this.topMargin);
        }
        int i = afterFirstVisibleItemTop;
        layoutManager.layoutDecorated(itemView, 0, i, layoutManager.getWidth(), i + itemView.getMeasuredHeight());
    }

    public final void requestLayout() {
        this.hasMeasuredItemSize = false;
    }

    private final int getFirstVisibleItemTop(int parentHeight, int scrollOffset, int topMargin) {
        int i = scrollOffset % parentHeight;
        return i == 0 ? topMargin : topMargin + (parentHeight - i);
    }

    private final int getAfterFirstVisibleItemTop(int position, float movementPercent, int topMargin) {
        float fPow = 1.0f - movementPercent;
        Iterator<Integer> it = RangesKt.until(1, position).iterator();
        while (it.hasNext()) {
            fPow += (float) Math.pow(0.93f, ((PrimitiveIterators6) it).nextInt() - movementPercent);
        }
        return (int) (topMargin - (this.itemOffsetPixelSize * fPow));
    }
}

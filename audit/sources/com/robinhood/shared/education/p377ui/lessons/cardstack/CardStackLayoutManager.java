package com.robinhood.shared.education.p377ui.lessons.cardstack;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CardStackLayoutManager.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u001c\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\n\u0010\u0017\u001a\u00060\u0018R\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\"\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u0014\u0010\"\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0018R\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0003H\u0002J\b\u0010$\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0002J\b\u0010(\u001a\u00020)H\u0003J\u001c\u0010*\u001a\u00020\u0016*\u00020+2\u0006\u0010,\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\f\u0010-\u001a\u00020\u0016*\u00020+H\u0002R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\t\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\n0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "itemOffsetPixelSize", "", "<init>", "(I)V", "topItemPositionSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "topItemPositionObservable", "Lio/reactivex/Observable;", "getTopItemPositionObservable", "()Lio/reactivex/Observable;", "scrollOffset", "layoutHelper", "Lcom/robinhood/shared/education/ui/lessons/cardstack/CardStackLayoutHelper;", "generateDefaultLayoutParams", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "canScrollHorizontally", "", "canScrollVertically", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "scrollVerticallyBy", "dy", "scrollToPosition", "position", "smoothScrollToPosition", "recyclerView", "layoutItemViews", "getFirstVisibleItemPosition", "getLastVisibleItemPosition", "getPositionOffset", "getValidOffset", "expectedOffset", "getFirstVisibleItemMovementPercent", "", "animateLayoutChange", "Landroid/view/View;", "firstItemMovementPercent", "reset", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CardStackLayoutManager extends RecyclerView.LayoutManager {
    private static final float FIRST_VISIBLE_ITEM_DISAPPEAR_SCALE = 0.6f;
    private static final float ITEMS_BEHIND_FIRST_VISIBLE_ITEM_SCALE = 0.95f;
    private static final int MAX_VISIBLE_ITEMS = 5;
    private final CardStackLayoutHelper layoutHelper;
    private int scrollOffset;
    private final Observable<Integer> topItemPositionObservable;
    private final BehaviorSubject<Integer> topItemPositionSubject;
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    public CardStackLayoutManager(int i) {
        BehaviorSubject<Integer> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "create(...)");
        this.topItemPositionSubject = behaviorSubjectCreate;
        this.topItemPositionObservable = behaviorSubjectCreate.hide();
        this.scrollOffset = Integer.MAX_VALUE;
        this.layoutHelper = new CardStackLayoutHelper(i);
    }

    public final Observable<Integer> getTopItemPositionObservable() {
        return this.topItemPositionObservable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return getItemCount() > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        this.layoutHelper.requestLayout();
        detachAndScrapAttachedViews(recycler);
        if (getItemCount() > 0) {
            this.scrollOffset = getValidOffset(this.scrollOffset);
            layoutItemViews(recycler);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int dy, RecyclerView.Recycler recycler, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        int i = this.scrollOffset + dy;
        int validOffset = getValidOffset(i);
        this.scrollOffset = validOffset;
        int i2 = (validOffset - i) + dy;
        if (i2 == 0) {
            return 0;
        }
        detachAndScrapAttachedViews(recycler);
        layoutItemViews(recycler);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int position) {
        if (position < 0 || position >= getItemCount()) {
            return;
        }
        this.scrollOffset = getPositionOffset(position);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (position < 0 || position >= getItemCount()) {
            return;
        }
        int positionOffset = getPositionOffset(position);
        int validOffset = getValidOffset(this.scrollOffset);
        this.scrollOffset = validOffset;
        recyclerView.smoothScrollBy(0, positionOffset - validOffset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void layoutItemViews(RecyclerView.Recycler recycler) {
        CardStackLayoutManager cardStackLayoutManager;
        int firstVisibleItemPosition = getFirstVisibleItemPosition();
        int lastVisibleItemPosition = getLastVisibleItemPosition();
        float firstVisibleItemMovementPercent = getFirstVisibleItemMovementPercent();
        if (firstVisibleItemPosition <= lastVisibleItemPosition) {
            int i = lastVisibleItemPosition;
            while (true) {
                View viewForPosition = recycler.getViewForPosition(i);
                Intrinsics.checkNotNullExpressionValue(viewForPosition, "getViewForPosition(...)");
                addView(viewForPosition);
                int i2 = i - firstVisibleItemPosition;
                cardStackLayoutManager = this;
                this.layoutHelper.layoutItemView(cardStackLayoutManager, this.scrollOffset, firstVisibleItemMovementPercent, viewForPosition, i2);
                animateLayoutChange(viewForPosition, firstVisibleItemMovementPercent, i2);
                if (i == firstVisibleItemPosition) {
                    break;
                } else {
                    i--;
                }
            }
        } else {
            cardStackLayoutManager = this;
        }
        cardStackLayoutManager.topItemPositionSubject.onNext(Integer.valueOf(firstVisibleItemPosition));
        if (firstVisibleItemPosition > 0) {
            View viewForPosition2 = recycler.getViewForPosition(firstVisibleItemPosition - 1);
            Intrinsics.checkNotNullExpressionValue(viewForPosition2, "getViewForPosition(...)");
            reset(viewForPosition2);
            CardStackCardView cardStackCardView = viewForPosition2 instanceof CardStackCardView ? (CardStackCardView) viewForPosition2 : null;
            if (cardStackCardView != null) {
                cardStackCardView.hideContent();
            }
            removeAndRecycleView(viewForPosition2, recycler);
        }
        int i3 = lastVisibleItemPosition + 1;
        if (i3 < getItemCount()) {
            View viewForPosition3 = recycler.getViewForPosition(i3);
            Intrinsics.checkNotNullExpressionValue(viewForPosition3, "getViewForPosition(...)");
            reset(viewForPosition3);
            CardStackCardView cardStackCardView2 = viewForPosition3 instanceof CardStackCardView ? (CardStackCardView) viewForPosition3 : null;
            if (cardStackCardView2 != null) {
                cardStackCardView2.hideContent();
            }
            removeAndRecycleView(viewForPosition3, recycler);
        }
    }

    private final int getFirstVisibleItemPosition() {
        if (getHeight() == 0) {
            return 0;
        }
        return (getItemCount() - 1) - ((int) Math.ceil(this.scrollOffset / getHeight()));
    }

    private final int getLastVisibleItemPosition() {
        return RangesKt.coerceAtMost(getItemCount() - 1, getFirstVisibleItemPosition() + 5);
    }

    private final int getPositionOffset(int position) {
        return getValidOffset(((getItemCount() - 1) - position) * getHeight());
    }

    private final int getValidOffset(int expectedOffset) {
        return RangesKt.coerceIn(expectedOffset, 0, getHeight() * (getItemCount() - 1));
    }

    private final float getFirstVisibleItemMovementPercent() {
        if (getHeight() == 0) {
            return 0.0f;
        }
        float height = 1 - (((this.scrollOffset % getHeight()) * 1.0f) / getHeight());
        if (height == 1.0f) {
            return 0.0f;
        }
        return height;
    }

    private final void animateLayoutChange(View view, float f, int i) {
        float fPow;
        if (i == 0) {
            fPow = 1 - (0.39999998f * f);
        } else {
            double d = ITEMS_BEHIND_FIRST_VISIBLE_ITEM_SCALE;
            float fPow2 = (float) Math.pow(d, i);
            fPow = ((((float) Math.pow(d, i - 1)) - fPow2) * f) + fPow2;
        }
        view.setScaleX(fPow);
        view.setScaleY(fPow);
        if (i != 5) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    private final void reset(View view) {
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
    }
}

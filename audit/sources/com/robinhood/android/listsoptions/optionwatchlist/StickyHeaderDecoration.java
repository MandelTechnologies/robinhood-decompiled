package com.robinhood.android.listsoptions.optionwatchlist;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroup2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;

/* compiled from: StickyHeaderDecoration.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B@\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\nH\u0002J \u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\nH\u0002J(\u0010 \u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/listsoptions/optionwatchlist/StickyHeaderDecoration;", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "parentAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "isHeader", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "itemPosition", "", "<init>", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;Lkotlin/jvm/functions/Function1;)V", "cachedHeaderWithPosition", "Lkotlin/Pair;", "rect", "Landroid/graphics/Rect;", "onDrawOver", "", "c", "Landroid/graphics/Canvas;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "getHeaderViewForItemAtPosition", "Landroid/view/View;", "drawHeader", "header", "paddingTop", "moveHeader", "currentHeader", "nextHeader", "fixLayoutSize", "Landroid/view/ViewGroup;", "view", "feature-lists-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StickyHeaderDecoration<VH extends RecyclerView.ViewHolder> extends RecyclerView.ItemDecoration {
    private Tuples2<? extends RecyclerView.ViewHolder, Integer> cachedHeaderWithPosition;
    private final Function1<Integer, Boolean> isHeader;
    private final RecyclerView parent;
    private final RecyclerView.Adapter<VH> parentAdapter;
    private final Rect rect;

    /* JADX WARN: Multi-variable type inference failed */
    public StickyHeaderDecoration(RecyclerView parent, RecyclerView.Adapter<VH> parentAdapter, Function1<? super Integer, Boolean> isHeader) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parentAdapter, "parentAdapter");
        Intrinsics.checkNotNullParameter(isHeader, "isHeader");
        this.parent = parent;
        this.parentAdapter = parentAdapter;
        this.isHeader = isHeader;
        this.rect = new Rect();
        parentAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.StickyHeaderDecoration.1
            final /* synthetic */ StickyHeaderDecoration<VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                ((StickyHeaderDecoration) this.this$0).cachedHeaderWithPosition = null;
            }
        });
        parent.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.StickyHeaderDecoration.2
            final /* synthetic */ StickyHeaderDecoration<VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ((StickyHeaderDecoration) this.this$0).cachedHeaderWithPosition = null;
            }
        });
        parent.addOnItemTouchListener(new RecyclerView.SimpleOnItemTouchListener(this) { // from class: com.robinhood.android.listsoptions.optionwatchlist.StickyHeaderDecoration.3
            final /* synthetic */ StickyHeaderDecoration<VH> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent event) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(event, "event");
                Tuples2 tuples2 = ((StickyHeaderDecoration) this.this$0).cachedHeaderWithPosition;
                if (tuples2 == null) {
                    return false;
                }
                return event.getAction() == 0 && event.getY() <= ((float) ((RecyclerView.ViewHolder) tuples2.component1()).itemView.getBottom());
            }

            @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
                Intrinsics.checkNotNullParameter(rv, "rv");
                Intrinsics.checkNotNullParameter(e, "e");
                Tuples2 tuples2 = ((StickyHeaderDecoration) this.this$0).cachedHeaderWithPosition;
                if (tuples2 == null) {
                    return;
                }
                ((RecyclerView.ViewHolder) tuples2.component1()).itemView.dispatchTouchEvent(e);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int childAdapterPosition;
        View headerViewForItemAtPosition;
        View next;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c, parent, state);
        View viewFindChildViewUnder = parent.findChildViewUnder(parent.getPaddingLeft(), parent.getPaddingTop());
        if (viewFindChildViewUnder == null || (childAdapterPosition = parent.getChildAdapterPosition(viewFindChildViewUnder)) == -1 || (headerViewForItemAtPosition = getHeaderViewForItemAtPosition(childAdapterPosition)) == null) {
            return;
        }
        int bottom = headerViewForItemAtPosition.getBottom() + parent.getPaddingTop();
        Iterator<View> itIterator2 = ViewGroup2.getChildren(parent).iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            }
            next = itIterator2.next();
            parent.getDecoratedBoundsWithMargins(next, this.rect);
            Rect rect = this.rect;
            if (rect.bottom > bottom && rect.top <= bottom) {
                break;
            }
        }
        View view = next;
        if (view == null) {
            return;
        }
        if (this.isHeader.invoke(Integer.valueOf(parent.getChildAdapterPosition(view))).booleanValue()) {
            moveHeader(c, headerViewForItemAtPosition, view, parent.getPaddingTop());
        } else {
            drawHeader(c, headerViewForItemAtPosition, parent.getPaddingTop());
        }
    }

    private final View getHeaderViewForItemAtPosition(int itemPosition) {
        Integer next;
        Progressions2 progressions2DownTo = RangesKt.downTo(itemPosition, 0);
        Function1<Integer, Boolean> function1 = this.isHeader;
        Iterator<Integer> it = progressions2DownTo.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (function1.invoke(next).booleanValue()) {
                break;
            }
        }
        Integer num = next;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        int itemViewType = this.parentAdapter.getItemViewType(iIntValue);
        Tuples2<? extends RecyclerView.ViewHolder, Integer> tuples2 = this.cachedHeaderWithPosition;
        if (tuples2 != null) {
            RecyclerView.ViewHolder viewHolderComponent1 = tuples2.component1();
            if (tuples2.component2().intValue() == iIntValue && viewHolderComponent1.getItemViewType() == itemViewType) {
                return viewHolderComponent1.itemView;
            }
        }
        RecyclerView.ViewHolder viewHolderCreateViewHolder = this.parentAdapter.createViewHolder(this.parent, itemViewType);
        Intrinsics.checkNotNullExpressionValue(viewHolderCreateViewHolder, "createViewHolder(...)");
        this.parentAdapter.onBindViewHolder(viewHolderCreateViewHolder, iIntValue);
        RecyclerView recyclerView = this.parent;
        View itemView = viewHolderCreateViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        fixLayoutSize(recyclerView, itemView);
        this.cachedHeaderWithPosition = Tuples4.m3642to(viewHolderCreateViewHolder, num);
        return viewHolderCreateViewHolder.itemView;
    }

    private final void drawHeader(Canvas c, View header, int paddingTop) {
        c.save();
        c.translate(0.0f, paddingTop);
        header.draw(c);
        c.restore();
    }

    private final void moveHeader(Canvas c, View currentHeader, View nextHeader, int paddingTop) {
        c.save();
        c.clipRect(0, paddingTop, c.getWidth(), currentHeader.getHeight() + paddingTop);
        c.translate(0.0f, nextHeader.getTop() - currentHeader.getHeight());
        currentHeader.draw(c);
        c.restore();
    }

    private final void fixLayoutSize(ViewGroup parent, View view) {
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), parent.getPaddingLeft() + parent.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0), parent.getPaddingTop() + parent.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}

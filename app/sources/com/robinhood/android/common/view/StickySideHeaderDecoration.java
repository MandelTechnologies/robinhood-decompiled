package com.robinhood.android.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.view.StickySideHeaderDecoration.HeaderItem;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.ranges.Progressions2;
import kotlin.ranges.RangesKt;

/* compiled from: StickySideHeaderDecoration.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001-B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J-\u0010(\u001a\u00020\u00152\u0006\u0010&\u001a\u00020'2\u0006\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"H$¢\u0006\u0002\u0010,R\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u001e\u001a\u00020\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0012\u0010!\u001a\u00020\"X¤\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/common/view/StickySideHeaderDecoration;", "T", "Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "paint", "Landroid/text/TextPaint;", "getPaint", "()Landroid/text/TextPaint;", "spacingSmall", "", "headers", "", "getHeaders", "()Ljava/util/List;", "setHeaders", "(Ljava/util/List;)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "decorationWidth", "getDecorationWidth", "()I", "decorationHeight", "", "getDecorationHeight", "()F", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawHeader", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "topY", "delta", "(Landroid/graphics/Canvas;Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem;FF)V", "HeaderItem", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class StickySideHeaderDecoration<T extends HeaderItem> extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private List<? extends T> headers;
    private final TextPaint paint;
    private final int spacingSmall;

    protected abstract void drawHeader(Canvas canvas, T item, float topY, float delta);

    protected abstract float getDecorationHeight();

    /* renamed from: getDecorationWidth */
    protected abstract int getDateDecorationWidth();

    protected StickySideHeaderDecoration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        textPaint.setTypeface(RhTypeface.MEDIUM.load(context));
        this.spacingSmall = context.getResources().getDimensionPixelOffset(C13997R.dimen.rds_spacing_small);
    }

    protected final TextPaint getPaint() {
        return this.paint;
    }

    public final List<T> getHeaders() {
        return this.headers;
    }

    public final void setHeaders(List<? extends T> list) {
        this.headers = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        outRect.set(getDateDecorationWidth(), 0, this.spacingSmall, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        Progressions2 empty;
        PrimitiveRanges2 indices;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childCount = parent.getChildCount();
        List<? extends T> list = this.headers;
        if (list == null) {
            return;
        }
        if (list == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (list.isEmpty() || childCount == 0) {
            return;
        }
        int childAdapterPosition = parent.getChildAdapterPosition(parent.getChildAt(0));
        int i = (childCount + childAdapterPosition) - 1;
        List<? extends T> list2 = this.headers;
        if (list2 == null || (indices = CollectionsKt.getIndices(list2)) == null || (empty = RangesKt.reversed(indices)) == null) {
            empty = PrimitiveRanges2.INSTANCE.getEMPTY();
        }
        int first = empty.getFirst();
        int last = empty.getLast();
        int step = empty.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return;
        }
        float f = 0.0f;
        while (true) {
            List<? extends T> list3 = this.headers;
            if (list3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            T t = list3.get(first);
            int startPosition = t.getStartPosition();
            int endPosition = t.getEndPosition();
            if (startPosition <= i && endPosition >= childAdapterPosition) {
                float fMax = (float) Math.max(parent.getChildAt(((int) Math.max(startPosition, childAdapterPosition)) - childAdapterPosition).getY(), this.spacingSmall);
                drawHeader(canvas, t, fMax, f == 0.0f ? 0.0f : ((f - fMax) - getDecorationHeight()) - this.spacingSmall);
                f = fMax;
            }
            if (first == last) {
                return;
            } else {
                first += step;
            }
        }
    }

    /* compiled from: StickySideHeaderDecoration.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem;", "", "<init>", "()V", "startPosition", "", "getStartPosition", "()I", "setStartPosition", "(I)V", "endPosition", "getEndPosition", "setEndPosition", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static class HeaderItem {
        private int endPosition;
        private int startPosition;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final void setStartPosition(int i) {
            this.startPosition = i;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final void setEndPosition(int i) {
            this.endPosition = i;
        }

        /* compiled from: StickySideHeaderDecoration.kt */
        @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem$Companion;", "", "<init>", "()V", "setEndPositions", "", "items", "", "Lcom/robinhood/android/common/view/StickySideHeaderDecoration$HeaderItem;", "totalNumItems", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final void setEndPositions(List<? extends HeaderItem> items, int totalNumItems) {
                Intrinsics.checkNotNullParameter(items, "items");
                int size = items.size();
                int i = 0;
                while (i < size) {
                    items.get(i).setEndPosition(i == size + (-1) ? totalNumItems - 1 : items.get(i + 1).getStartPosition() - 1);
                    i++;
                }
            }
        }
    }
}

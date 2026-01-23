package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: VerticalDividerDecoration.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\r8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/VerticalDividerDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dividerBias", "", "getDividerBias", "()F", "setDividerBias", "(F)V", "dividerPadding", "", "getDividerPadding", "()I", "setDividerPadding", "(I)V", "value", ResourceTypes.COLOR, "getColor", "setColor", "paint", "Landroid/graphics/Paint;", "dividerRect", "Landroid/graphics/RectF;", "onDrawOver", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class VerticalDividerDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private float dividerBias;
    private int dividerPadding;
    private final RectF dividerRect;
    private final Paint paint;

    public VerticalDividerDecoration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.dividerBias = 0.5f;
        this.dividerPadding = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
        Paint paint = new Paint();
        this.paint = paint;
        this.dividerRect = new RectF();
        setColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground3));
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(C15314R.dimen.l2_vertical_divider_dot_length);
        paint.setStrokeWidth(dimensionPixelSize);
        paint.setPathEffect(new DashPathEffect(new float[]{dimensionPixelSize, r6.getDimensionPixelSize(C15314R.dimen.l2_vertical_divider_space_length)}, 0.0f));
    }

    public final float getDividerBias() {
        return this.dividerBias;
    }

    public final void setDividerBias(float f) {
        this.dividerBias = f;
    }

    public final int getDividerPadding() {
        return this.dividerPadding;
    }

    public final void setDividerPadding(int i) {
        this.dividerPadding = i;
    }

    public final int getColor() {
        return this.paint.getColor();
    }

    public final void setColor(int i) {
        this.paint.setColor(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c, parent, state);
        float fRint = (float) Math.rint((parent.getRight() - parent.getLeft()) * this.dividerBias);
        int childCount = parent.getChildCount();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            int childAdapterPosition = parent.getChildAdapterPosition(parent.getChildAt(i));
            if (childAdapterPosition != 0) {
                if (!z3) {
                    this.dividerRect.set(fRint, r5.getTop(), fRint, r5.getBottom());
                    z3 = true;
                } else {
                    this.dividerRect.union(fRint, r5.getTop());
                    this.dividerRect.union(fRint, r5.getBottom());
                }
                if (childAdapterPosition == 1) {
                    z = true;
                } else {
                    RecyclerView.Adapter adapter = parent.getAdapter();
                    if (childAdapterPosition == (adapter != null ? adapter.getSize() : -1)) {
                        z2 = true;
                    }
                }
            }
        }
        if (z) {
            this.dividerRect.top += this.dividerPadding;
        }
        if (z2) {
            this.dividerRect.bottom -= this.dividerPadding;
        }
        RectF rectF = this.dividerRect;
        c.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.paint);
    }
}

package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: HorizontalCardsLayoutManager.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016J\f\u0010\u0016\u001a\u00020\u0010*\u00020\u0012H\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/ui/HorizontalCardsLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "peekMargin", "maxChildWidth", "getMaxChildWidth", "()I", "measureChild", "", "child", "Landroid/view/View;", "widthUsed", "heightUsed", "measureChildWithMargins", "remeasureWithConstrainedWidth", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class HorizontalCardsLayoutManager extends LinearLayoutManager {
    public static final int $stable = 8;
    private int peekMargin;

    public /* synthetic */ HorizontalCardsLayoutManager(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalCardsLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setMeasurementCacheEnabled(false);
        int[] RecyclerView = C11048R.styleable.RecyclerView;
        Intrinsics.checkNotNullExpressionValue(RecyclerView, "RecyclerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RecyclerView, i, i2);
        this.peekMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(C11048R.styleable.RecyclerView_peekMargin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final int getMaxChildWidth() {
        return ((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.peekMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChild(View child, int widthUsed, int heightUsed) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.measureChild(child, widthUsed, heightUsed);
        remeasureWithConstrainedWidth(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View child, int widthUsed, int heightUsed) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.measureChildWithMargins(child, widthUsed, heightUsed);
        remeasureWithConstrainedWidth(child);
    }

    private final void remeasureWithConstrainedWidth(View view) {
        if (getItemCount() > 1) {
            view.measure(View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtMost(view.getMeasuredWidth(), getMaxChildWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
        }
    }
}

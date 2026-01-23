package com.robinhood.android.common.util;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BetterDividerItemDecoration.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005J&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\tJ \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J(\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/common/util/BetterDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "orientation", "", "<init>", "(Landroid/content/Context;I)V", "mDivider", "Landroid/graphics/drawable/Drawable;", "mOrientation", "mBounds", "Landroid/graphics/Rect;", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "setOrientation", "", "setPadding", "left", "top", "right", "bottom", "setDrawable", ResourceTypes.DRAWABLE, "onDraw", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "drawVertical", "canvas", "drawHorizontal", "getItemOffsets", "outRect", "view", "Landroid/view/View;", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class BetterDividerItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL = 0;
    private static final String TAG = "DividerItem";
    public static final int VERTICAL = 1;
    private final Rect mBounds;
    private Drawable mDivider;
    private int mOrientation;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    public static final int $stable = 8;
    private static final int[] ATTRS = {R.attr.listDivider};

    @SuppressLint({"LogNotTimber"})
    public BetterDividerItemDecoration(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBounds = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATTRS);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.mDivider = drawable;
        if (drawable == null) {
            Log.w(TAG, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(i);
    }

    public final void setOrientation(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.mOrientation = orientation;
    }

    public final void setPadding(int left, int top, int right, int bottom) {
        this.paddingLeft = left;
        this.paddingTop = top;
        this.paddingRight = right;
        this.paddingBottom = bottom;
    }

    public final void setDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.mDivider = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        if (parent.getLayoutManager() == null || this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawVertical(c, parent);
        } else {
            drawHorizontal(c, parent);
        }
    }

    private final void drawVertical(Canvas canvas, RecyclerView parent) {
        int paddingLeft;
        int width;
        canvas.save();
        if (parent.getClipToPadding()) {
            paddingLeft = parent.getPaddingLeft() + this.paddingLeft;
            width = (parent.getWidth() - parent.getPaddingRight()) - this.paddingRight;
            canvas.clipRect(paddingLeft, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
        } else {
            paddingLeft = this.paddingLeft;
            width = parent.getWidth() - this.paddingRight;
        }
        int childCount = parent.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            parent.getDecoratedBoundsWithMargins(childAt, this.mBounds);
            Drawable drawable = this.mDivider;
            if (drawable != null) {
                int iRound = this.mBounds.bottom + Math.round(childAt.getTranslationY());
                drawable.setBounds(paddingLeft, iRound - drawable.getIntrinsicHeight(), width, iRound);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private final void drawHorizontal(Canvas canvas, RecyclerView parent) {
        int paddingTop;
        int height;
        canvas.save();
        if (parent.getClipToPadding()) {
            paddingTop = parent.getPaddingTop() + this.paddingTop;
            height = (parent.getHeight() - parent.getPaddingBottom()) - this.paddingBottom;
            canvas.clipRect(parent.getPaddingLeft(), paddingTop, parent.getWidth() - parent.getPaddingRight(), height);
        } else {
            paddingTop = this.paddingTop;
            height = parent.getHeight() - this.paddingBottom;
        }
        int childCount = parent.getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.getDecoratedBoundsWithMargins(childAt, this.mBounds);
            }
            Drawable drawable = this.mDivider;
            if (drawable != null) {
                int iRound = this.mBounds.right + Math.round(childAt.getTranslationX());
                drawable.setBounds(iRound - drawable.getIntrinsicWidth(), paddingTop, iRound, height);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.mDivider;
        if (drawable == null) {
            outRect.set(0, 0, 0, 0);
            return;
        }
        if (this.mOrientation == 1) {
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
            outRect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            if (drawable == null) {
                throw new IllegalStateException("Required value was null.");
            }
            outRect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}

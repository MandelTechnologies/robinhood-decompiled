package com.robinhood.android.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhCardView.kt */
@Metadata(m3635d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u000b\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/view/RhCardView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgrounds", "com/robinhood/android/common/view/RhCardView$backgrounds$1", "Lcom/robinhood/android/common/view/RhCardView$backgrounds$1;", "isButtingTop", "", "isButtingBottom", "onLayout", "", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "updateBackground", "notifyButtingBottom", "notifyButtingTop", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public class RhCardView extends FrameLayout {
    public static final int $stable = 8;
    private final RhCardView2 backgrounds;
    private boolean isButtingBottom;
    private boolean isButtingTop;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhCardView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RhCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C11048R.attr.rhCardViewStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RhCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        RhCardView2 rhCardView2 = new RhCardView2(this);
        this.backgrounds = rhCardView2;
        setBackground(rhCardView2.getAll());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int iIndexOfChild;
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null && (iIndexOfChild = viewGroup.indexOfChild(this)) >= 0) {
                View childAt = viewGroup.getChildAt(iIndexOfChild - 1);
                RhCardView rhCardView = childAt instanceof RhCardView ? (RhCardView) childAt : null;
                View childAt2 = viewGroup.getChildAt(iIndexOfChild + 1);
                RhCardView rhCardView2 = childAt2 instanceof RhCardView ? (RhCardView) childAt2 : null;
                if (rhCardView != null && rhCardView.getBottom() == top) {
                    this.isButtingTop = true;
                    rhCardView.notifyButtingBottom();
                } else {
                    this.isButtingTop = false;
                }
                if (rhCardView2 != null && rhCardView2.getTop() == bottom) {
                    this.isButtingBottom = true;
                    rhCardView2.notifyButtingTop();
                } else {
                    this.isButtingBottom = false;
                }
                updateBackground();
            }
        }
    }

    private final void updateBackground() {
        Drawable top;
        boolean z = this.isButtingTop;
        if (z && this.isButtingBottom) {
            top = this.backgrounds.getMiddle();
        } else if (z) {
            top = this.backgrounds.getBottom();
        } else {
            top = this.isButtingBottom ? this.backgrounds.getTop() : this.backgrounds.getAll();
        }
        setBackground(top);
    }

    private final void notifyButtingBottom() {
        if (this.isButtingBottom) {
            return;
        }
        this.isButtingBottom = true;
        updateBackground();
    }

    private final void notifyButtingTop() {
        if (this.isButtingTop) {
            return;
        }
        this.isButtingTop = true;
        updateBackground();
    }
}

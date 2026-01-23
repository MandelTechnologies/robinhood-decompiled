package com.robinhood.utils.p409ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlockableNestedScrollView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0016R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/BlockableNestedScrollView;", "Lcom/robinhood/utils/ui/view/FocusSafeNestedScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "isScrollable", "()Z", "setScrollable", "(Z)V", "canScrollVertically", "direction", "", "canScrollHorizontally", "fullScroll", "arrowScroll", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "scrollBy", "", "x", "y", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class BlockableNestedScrollView extends FocusSafeNestedScrollView {
    public static final int $stable = 8;
    private boolean isScrollable;

    public /* synthetic */ BlockableNestedScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockableNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isScrollable = true;
    }

    /* renamed from: isScrollable, reason: from getter */
    public final boolean getIsScrollable() {
        return this.isScrollable;
    }

    public final void setScrollable(boolean z) {
        this.isScrollable = z;
        setDescendantFocusability(z ? 131072 : 393216);
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.isScrollable && super.canScrollVertically(direction);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.isScrollable && super.canScrollHorizontally(direction);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean fullScroll(int direction) {
        return this.isScrollable && super.fullScroll(direction);
    }

    @Override // androidx.core.widget.NestedScrollView
    public boolean arrowScroll(int direction) {
        return this.isScrollable && super.arrowScroll(direction);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            if (this.isScrollable) {
                if (super.onTouchEvent(event)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
            return false;
        }
    }

    @Override // android.view.View
    public void scrollBy(int x, int y) {
        if (this.isScrollable) {
            super.scrollBy(x, y);
        }
    }
}

package com.robinhood.android.optionschain.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DimmingBottomSheetBehavior.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001/B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\u001fJ-\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010$JE\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020)2\u0006\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010*J5\u0010+\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0002\u0010.R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/optionschain/view/DimmingBottomSheetBehavior;", "V", "Landroid/view/View;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "childLaidOut", "", "interceptor", "Lcom/robinhood/android/optionschain/view/DimmingBottomSheetBehavior$InterceptorCallback;", "setBottomSheetCallback", "", "callback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "getScrimOpacity", "", "parent", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "child", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;)F", "onLayoutChild", "layoutDirection", "", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z", "onInterceptTouchEvent", "event", "Landroid/view/MotionEvent;", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z", "onStopNestedScroll", "coordinatorLayout", "target", "type", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;I)V", "onNestedPreScroll", "dx", "dy", "consumed", "", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V", "onNestedPreFling", "velocityX", "velocityY", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;FF)Z", "InterceptorCallback", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class DimmingBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    private boolean childLaidOut;
    private final InterceptorCallback interceptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DimmingBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        InterceptorCallback interceptorCallback = new InterceptorCallback(null, 1, 0 == true ? 1 : 0);
        this.interceptor = interceptorCallback;
        super.addBottomSheetCallback(interceptorCallback);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public void setBottomSheetCallback(BottomSheetBehavior.BottomSheetCallback callback) {
        this.interceptor.setDelegate(callback);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public float getScrimOpacity(CoordinatorLayout parent, V child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return this.interceptor.getOffset() * 0.87f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout parent, V child, int layoutDirection) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        boolean zOnLayoutChild = super.onLayoutChild(parent, child, layoutDirection);
        if (child.getPaddingTop() != 0) {
            ViewsKt.setPadding(child, 0);
        }
        this.childLaidOut = true;
        return zOnLayoutChild;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.childLaidOut) {
            return false;
        }
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(parent, child, event);
        if (!blocksInteractionBelow(parent, child) || parent.isPointInChildBounds(child, (int) event.getX(), (int) event.getY())) {
            return zOnInterceptTouchEvent;
        }
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int type2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.childLaidOut) {
            super.onStopNestedScroll(coordinatorLayout, child, target, type2);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type2) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (this.childLaidOut) {
            super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed, type2);
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.childLaidOut) {
            return super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY);
        }
        return false;
    }

    /* compiled from: DimmingBottomSheetBehavior.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/view/DimmingBottomSheetBehavior$InterceptorCallback;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "delegate", "<init>", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V", "getDelegate", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "setDelegate", "newValue", "", "busy", "setBusy", "(Z)V", "offset", "", "getOffset", "()F", "setOffset", "(F)V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "onStateChanged", "newState", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InterceptorCallback extends BottomSheetBehavior.BottomSheetCallback {
        public static final int $stable = 8;
        private boolean busy;
        private BottomSheetBehavior.BottomSheetCallback delegate;
        private float offset;

        /* JADX WARN: Multi-variable type inference failed */
        public InterceptorCallback() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ InterceptorCallback(BottomSheetBehavior.BottomSheetCallback bottomSheetCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bottomSheetCallback);
        }

        public final BottomSheetBehavior.BottomSheetCallback getDelegate() {
            return this.delegate;
        }

        public final void setDelegate(BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
            this.delegate = bottomSheetCallback;
        }

        public InterceptorCallback(BottomSheetBehavior.BottomSheetCallback bottomSheetCallback) {
            this.delegate = bottomSheetCallback;
        }

        private final void setBusy(boolean z) {
            if (z != this.busy) {
                this.busy = z;
                if (z) {
                    IdlingResourceCounters2.increment(IdlingResourceType.DIMMING_BOTTOM_SHEET_BEHAVIOR);
                } else {
                    IdlingResourceCounters2.decrement(IdlingResourceType.DIMMING_BOTTOM_SHEET_BEHAVIOR);
                }
            }
        }

        public final float getOffset() {
            return this.offset;
        }

        public final void setOffset(float f) {
            this.offset = f;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View bottomSheet, float slideOffset) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            this.offset = slideOffset;
            View view = (View) bottomSheet.getParent();
            if (view != null) {
                view.invalidate();
            }
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.delegate;
            if (bottomSheetCallback != null) {
                bottomSheetCallback.onSlide(bottomSheet, slideOffset);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            boolean z = true;
            if (newState != 1 && newState != 2) {
                z = false;
            }
            setBusy(z);
            BottomSheetBehavior.BottomSheetCallback bottomSheetCallback = this.delegate;
            if (bottomSheetCallback != null) {
                bottomSheetCallback.onStateChanged(bottomSheet, newState);
            }
        }
    }
}

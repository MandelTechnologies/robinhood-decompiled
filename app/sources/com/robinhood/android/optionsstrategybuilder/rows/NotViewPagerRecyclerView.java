package com.robinhood.android.optionsstrategybuilder.rows;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.optionsstrategybuilder.C24876R;
import com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotViewPagerRecyclerView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView$Callbacks;)V", "gestureDetector", "Landroid/view/GestureDetector;", "onInterceptTouchEvent", "", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroid/view/MotionEvent;", "Callbacks", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes11.dex */
public final class NotViewPagerRecyclerView extends RecyclerView {
    public static final int $stable = 8;
    private Callbacks callbacks;
    private final GestureDetector gestureDetector;

    /* compiled from: NotViewPagerRecyclerView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionsstrategybuilder/rows/NotViewPagerRecyclerView$Callbacks;", "", "currentIndex", "", "getCurrentIndex", "()Ljava/lang/Integer;", "updateTabLayout", "", "newIndex", "canSwipeToIndex", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "updateRows", "feature-options-strategy-builder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        boolean canSwipeToIndex(int index);

        Integer getCurrentIndex();

        void updateRows(int newIndex);

        void updateTabLayout(int newIndex);
    }

    public /* synthetic */ NotViewPagerRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotViewPagerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView$gestureDetector$1
            /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[PHI: r7
              0x0056: PHI (r7v6 java.lang.Integer) = (r7v5 java.lang.Integer), (r7v10 java.lang.Integer) binds: [B:23:0x006f, B:18:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                Integer numValueOf;
                Intrinsics.checkNotNullParameter(e2, "e2");
                boolean z = Math.abs(velocityX) > Math.abs(velocityY);
                boolean z2 = Math.abs(velocityX) > ((float) this.this$0.getResources().getDimensionPixelOffset(C24876R.dimen.horizontal_swipe_velocity_threshold));
                NotViewPagerRecyclerView.Callbacks callbacks = this.this$0.getCallbacks();
                if (callbacks == null) {
                    return false;
                }
                Integer num = null;
                if (velocityX > 0.0f) {
                    Integer currentIndex = callbacks.getCurrentIndex();
                    if (currentIndex != null) {
                        numValueOf = Integer.valueOf(currentIndex.intValue() - 1);
                        if (callbacks.canSwipeToIndex(numValueOf.intValue())) {
                            num = numValueOf;
                        }
                    }
                } else {
                    Integer currentIndex2 = callbacks.getCurrentIndex();
                    if (currentIndex2 != null) {
                        numValueOf = Integer.valueOf(currentIndex2.intValue() + 1);
                        if (callbacks.canSwipeToIndex(numValueOf.intValue())) {
                        }
                    }
                }
                if (!z || !z2 || num == null) {
                    return false;
                }
                callbacks.updateTabLayout(num.intValue());
                callbacks.updateRows(num.intValue());
                return true;
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.optionsstrategybuilder.rows.NotViewPagerRecyclerView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                try {
                    return NotViewPagerRecyclerView.this.gestureDetector.onTouchEvent(motionEvent);
                } catch (NullPointerException unused) {
                    return false;
                }
            }
        });
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        return (e != null ? this.gestureDetector.onTouchEvent(e) : false) || super.onInterceptTouchEvent(e);
    }
}

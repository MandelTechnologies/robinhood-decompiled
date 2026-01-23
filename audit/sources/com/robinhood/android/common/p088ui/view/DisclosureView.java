package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisclosureView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tJ\u0006\u0010\u0013\u001a\u00020\u000fJ(\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DisclosureView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "reviewed", "", "callbacks", "Lcom/robinhood/android/common/ui/view/DisclosureView$Callbacks;", "scrollRunnable", "Ljava/lang/Runnable;", "onDetachedFromWindow", "", "setCallbacks", "review", "scrollToBottom", "forceCheckScrollState", "onScrollChanged", "l", "", "t", "oldl", "oldt", "checkScrollState", "scrollViewBottomY", "getScrollViewBottomY", "()I", "onReviewed", "Callbacks", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DisclosureView extends ScrollView {
    public static final int $stable = 8;
    private Callbacks callbacks;
    private boolean reviewed;
    private final Runnable scrollRunnable;

    /* compiled from: DisclosureView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/DisclosureView$Callbacks;", "", "onReviewed", "", "reviewed", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onReviewed(boolean reviewed);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.scrollRunnable = new Runnable() { // from class: com.robinhood.android.common.ui.view.DisclosureView$scrollRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                DisclosureView disclosureView = this.this$0;
                disclosureView.smoothScrollTo(0, disclosureView.getScrollViewBottomY());
            }
        };
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.scrollRunnable);
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.callbacks = callbacks;
        if (callbacks != null) {
            callbacks.onReviewed(this.reviewed);
        }
    }

    public final boolean review(boolean scrollToBottom) {
        if (this.reviewed) {
            return false;
        }
        onReviewed(true);
        if (scrollToBottom) {
            post(this.scrollRunnable);
        }
        return true;
    }

    public final void forceCheckScrollState() {
        checkScrollState();
    }

    @Override // android.view.View
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        checkScrollState();
    }

    private final void checkScrollState() {
        if (getHeight() + getScrollY() >= getScrollViewBottomY()) {
            onReviewed(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getScrollViewBottomY() {
        return getChildAt(0).getBottom();
    }

    private final void onReviewed(boolean reviewed) {
        if (this.reviewed != reviewed) {
            this.reviewed = reviewed;
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onReviewed(reviewed);
            }
        }
    }
}

package com.robinhood.android.common.view;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: RhFloatingActionButton.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/view/RhFloatingActionButton;", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pushDown", "", "pullUp", "onLayout", "", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "", "top", "right", "bottom", "setStateListAnimator", "stateListAnimator", "Landroid/animation/StateListAnimator;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RhFloatingActionButton extends FloatingActionButton {
    public static final int $stable = 8;
    private final boolean pullUp;
    private final boolean pushDown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhFloatingActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C11048R.styleable.RhFloatingActionButton);
        this.pushDown = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhFloatingActionButton_pushDown, false);
        this.pullUp = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhFloatingActionButton_pullUp, false);
        typedArrayObtainStyledAttributes.recycle();
        super.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, C11048R.anim.fab_statelist));
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.pushDown || this.pullUp) {
            float height = getHeight() / 2.0f;
            if (!this.pushDown) {
                height = -height;
            }
            setTranslationY(height);
        }
    }

    @Override // android.view.View
    public void setStateListAnimator(StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "stateListAnimator");
        Timber.INSTANCE.mo3359v("setStateListAnimator call ignored", new Object[0]);
    }
}

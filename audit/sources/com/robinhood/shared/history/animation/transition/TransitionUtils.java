package com.robinhood.shared.history.animation.transition;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import com.robinhood.android.common.util.transition.NoOverlapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransitionUtils.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J&\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J6\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014J.\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/shared/history/animation/transition/TransitionUtils;", "", "<init>", "()V", "createCircularReveal", "Landroid/animation/Animator;", "view", "Landroid/view/View;", "startRadius", "", "endRadius", "centerX", "", "centerY", "addViewToOverlay", "sceneRoot", "Landroid/view/ViewGroup;", "width", "height", "background", "Landroid/graphics/drawable/Drawable;", "x", "y", "positionView", "", "lib-history-animation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class TransitionUtils {
    public static final TransitionUtils INSTANCE = new TransitionUtils();

    private TransitionUtils() {
    }

    public final Animator createCircularReveal(View view, float startRadius, float endRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        return createCircularReveal(view, view.getWidth() / 2, view.getHeight() / 2, startRadius, endRadius);
    }

    private final Animator createCircularReveal(View view, int centerX, int centerY, float startRadius, float endRadius) {
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius);
        Intrinsics.checkNotNull(animatorCreateCircularReveal);
        return new NoPauseAnimator(animatorCreateCircularReveal);
    }

    public final View addViewToOverlay(ViewGroup sceneRoot, int width, int height, Drawable background) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(background, "background");
        return addViewToOverlay(sceneRoot, 0, 0, width, height, background);
    }

    public final View addViewToOverlay(ViewGroup sceneRoot, int x, int y, int width, int height, Drawable background) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        Intrinsics.checkNotNullParameter(background, "background");
        Context context = sceneRoot.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NoOverlapView noOverlapView = new NoOverlapView(context);
        noOverlapView.setBackground(background);
        positionView(noOverlapView, x, y, width, height);
        sceneRoot.getOverlay().add(noOverlapView);
        return noOverlapView;
    }

    public final void positionView(View view, int x, int y, int width, int height) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
        view.layout(x, y, width + x, height + y);
    }
}

package com.robinhood.shared.history.animation;

import android.app.Activity;
import android.transition.Transition;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.robinhood.android.common.C11048R;
import com.robinhood.compose.bento.component.BentoCurrencyPicker;
import com.robinhood.shared.history.animation.transition.DetailViewRevealTransition;
import com.robinhood.shared.history.animation.transition.RevealTransition;
import com.robinhood.shared.history.animation.transition.ShrinkTransition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Activitys.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u001a\u001a\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002¨\u0006\r"}, m3636d2 = {"setListItemToDetailViewTransition", "", "Landroid/app/Activity;", BentoCurrencyPicker.ROOT_TEST_TAG, "Landroid/view/View;", "transitionName", "", "contentHeaderId", "", "circleColor", "setListItemRevealTransition", "target", "excludeStatusAndNavBarFromTransition", "lib-history-animation_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.history.animation.ActivitysKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class Activitys2 {
    public static final void setListItemToDetailViewTransition(Activity activity, View root, String transitionName, int i, int i2) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(transitionName, "transitionName");
        root.setTransitionName(transitionName);
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(C11048R.attr.rhBackgroundColorPrimary, typedValue, true);
        int i3 = typedValue.data;
        Window window = activity.getWindow();
        window.setSharedElementEnterTransition(new DetailViewRevealTransition(transitionName, i, i2));
        window.setSharedElementReturnTransition(new ShrinkTransition(transitionName, i3));
        excludeStatusAndNavBarFromTransition(activity);
    }

    public static final void setListItemRevealTransition(Activity activity, View target, String transitionName) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(transitionName, "transitionName");
        target.setTransitionName(transitionName);
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(C11048R.attr.rhBackgroundColorPrimary, typedValue, true);
        int i = typedValue.data;
        Window window = activity.getWindow();
        window.setSharedElementEnterTransition(new RevealTransition(transitionName));
        window.setSharedElementReturnTransition(new ShrinkTransition(transitionName, i));
        excludeStatusAndNavBarFromTransition(activity);
    }

    public static final void excludeStatusAndNavBarFromTransition(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Window window = activity.getWindow();
        Transition enterTransition = window.getEnterTransition();
        if (enterTransition != null) {
            enterTransition.excludeTarget(android.R.id.statusBarBackground, true);
            enterTransition.excludeTarget(android.R.id.navigationBarBackground, true);
        }
        Transition exitTransition = window.getExitTransition();
        if (exitTransition != null) {
            exitTransition.excludeTarget(android.R.id.statusBarBackground, true);
            exitTransition.excludeTarget(android.R.id.navigationBarBackground, true);
        }
    }
}

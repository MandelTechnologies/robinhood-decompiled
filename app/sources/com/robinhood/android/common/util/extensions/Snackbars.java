package com.robinhood.android.common.util.extensions;

import android.R;
import android.app.Activity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.robinhood.android.common.C11048R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Snackbars.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0007J*\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000bH\u0007J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/util/extensions/Snackbars;", "", "<init>", "()V", "make", "Lcom/google/android/material/snackbar/Snackbar;", "activity", "Landroid/app/Activity;", "text", "", "duration", "", "container", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "view", "Landroid/view/View;", "show", "showLarge", "animationMode", "findRoot", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Snackbars {
    public static final int $stable = 0;
    public static final Snackbars INSTANCE = new Snackbars();

    @JvmStatic
    @JvmOverloads
    public static final Snackbar show(CoordinatorLayout container, int i, int i2) {
        Intrinsics.checkNotNullParameter(container, "container");
        return show$default(container, i, i2, 0, 8, (Object) null);
    }

    private Snackbars() {
    }

    @JvmStatic
    public static final Snackbar make(Activity activity, CharSequence text, int duration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(text, "text");
        Snackbar snackbarMake = Snackbar.make(INSTANCE.findRoot(activity), text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar make(Activity activity, int text, int duration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Snackbar snackbarMake = Snackbar.make(INSTANCE.findRoot(activity), text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar make(CoordinatorLayout container, CharSequence text, int duration) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(text, "text");
        Snackbar snackbarMake = Snackbar.make(container, text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar make(CoordinatorLayout container, int text, int duration) {
        Intrinsics.checkNotNullParameter(container, "container");
        Snackbar snackbarMake = Snackbar.make(container, text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar make(View view, int text, int duration) {
        Intrinsics.checkNotNullParameter(view, "view");
        Snackbar snackbarMake = Snackbar.make(view, text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar show(Activity activity, CharSequence text, int duration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(text, "text");
        Snackbar snackbarMake = make(activity, text, duration);
        snackbarMake.show();
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar show(Activity activity, int text, int duration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Snackbar snackbarMake = make(activity, text, duration);
        snackbarMake.show();
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar show(View view, int text, int duration) {
        Intrinsics.checkNotNullParameter(view, "view");
        Snackbar snackbarMake = make(view, text, duration);
        snackbarMake.show();
        return snackbarMake;
    }

    @JvmStatic
    public static final Snackbar showLarge(Activity activity, CharSequence text, int duration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(text, "text");
        Snackbar snackbarMake = make(activity, text, duration);
        Snackbars2.setMaxTextViewLines(snackbarMake, 4);
        snackbarMake.show();
        return snackbarMake;
    }

    public static /* synthetic */ Snackbar show$default(CoordinatorLayout coordinatorLayout, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return show(coordinatorLayout, charSequence, i, i2);
    }

    @JvmStatic
    public static final Snackbar show(CoordinatorLayout container, CharSequence text, int duration, int animationMode) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(text, "text");
        Snackbar snackbarMake = Snackbar.make(container, text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        snackbarMake.setAnimationMode(animationMode);
        snackbarMake.show();
        return snackbarMake;
    }

    public static /* synthetic */ Snackbar show$default(CoordinatorLayout coordinatorLayout, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return show(coordinatorLayout, i, i2, i3);
    }

    @JvmStatic
    @JvmOverloads
    public static final Snackbar show(CoordinatorLayout container, int text, int duration, int animationMode) {
        Intrinsics.checkNotNullParameter(container, "container");
        Snackbar snackbarMake = Snackbar.make(container, text, duration);
        Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
        snackbarMake.setAnimationMode(animationMode);
        snackbarMake.show();
        return snackbarMake;
    }

    public final View findRoot(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        View viewFindViewById = activity.findViewById(C11048R.id.snackbar_container);
        if (viewFindViewById == null) {
            viewFindViewById = activity.findViewById(R.id.content);
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("No root found for Snackbar to attach to");
    }
}

package androidx.window.layout.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoundsHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Landroidx/window/layout/util/BoundsHelperApi28Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.layout.util.BoundsHelperApi28Impl, reason: use source file name */
/* loaded from: classes16.dex */
final class BoundsHelper3 implements BoundsHelper {
    public static final BoundsHelper3 INSTANCE = new BoundsHelper3();

    private BoundsHelper3() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public Rect currentWindowBounds(Activity activity) throws Exception {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                Intrinsics.checkNotNull(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (Exception e) {
            if (e instanceof NoSuchFieldException ? true : e instanceof NoSuchMethodException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException) {
                Log.w(BoundsHelper.INSTANCE.getTAG(), e);
                BoundsHelper6.getRectSizeFromDisplay(activity, rect);
            } else {
                throw e;
            }
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = BoundsHelper6.getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == point.y) {
                rect.bottom = i + navigationBarHeight;
            } else {
                int i2 = rect.right;
                if (i2 + navigationBarHeight == point.x) {
                    rect.right = i2 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            Intrinsics.checkNotNull(defaultDisplay);
            DisplayCutout cutoutForDisplay = BoundsHelper6.getCutoutForDisplay(defaultDisplay);
            if (cutoutForDisplay != null) {
                int i3 = rect.left;
                DisplayCompatHelper displayCompatHelper = DisplayCompatHelper.INSTANCE;
                if (i3 == displayCompatHelper.safeInsetLeft(cutoutForDisplay)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == displayCompatHelper.safeInsetRight(cutoutForDisplay)) {
                    rect.right += displayCompatHelper.safeInsetRight(cutoutForDisplay);
                }
                if (rect.top == displayCompatHelper.safeInsetTop(cutoutForDisplay)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == displayCompatHelper.safeInsetBottom(cutoutForDisplay)) {
                    rect.bottom += displayCompatHelper.safeInsetBottom(cutoutForDisplay);
                }
            }
        }
        return rect;
    }
}

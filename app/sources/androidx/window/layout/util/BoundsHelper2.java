package androidx.window.layout.util;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoundsHelper.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Landroidx/window/layout/util/BoundsHelperApi24Impl;", "Landroidx/window/layout/util/BoundsHelper;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/graphics/Rect;", "currentWindowBounds", "(Landroid/app/Activity;)Landroid/graphics/Rect;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.layout.util.BoundsHelperApi24Impl, reason: use source file name */
/* loaded from: classes16.dex */
final class BoundsHelper2 implements BoundsHelper {
    public static final BoundsHelper2 INSTANCE = new BoundsHelper2();

    private BoundsHelper2() {
    }

    @Override // androidx.window.layout.util.BoundsHelper
    public Rect currentWindowBounds(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            DisplayHelper displayHelper = DisplayHelper.INSTANCE;
            Intrinsics.checkNotNull(defaultDisplay);
            Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
            int navigationBarHeight = BoundsHelper6.getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == realSizeForDisplay.y) {
                rect.bottom = i + navigationBarHeight;
                return rect;
            }
            int i2 = rect.right;
            if (i2 + navigationBarHeight == realSizeForDisplay.x) {
                rect.right = i2 + navigationBarHeight;
            }
        }
        return rect;
    }
}

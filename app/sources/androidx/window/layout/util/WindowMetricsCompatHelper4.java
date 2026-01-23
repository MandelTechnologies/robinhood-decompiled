package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.core.Bounds;
import androidx.window.layout.WindowMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowMetricsCompatHelper.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, m3636d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelperBaseImpl;", "Landroidx/window/layout/util/WindowMetricsCompatHelper;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "Landroidx/window/layout/WindowMetrics;", "currentWindowMetrics", "(Landroid/content/Context;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.window.layout.util.WindowMetricsCompatHelperBaseImpl, reason: use source file name */
/* loaded from: classes16.dex */
public final class WindowMetricsCompatHelper4 implements WindowMetricsCompatHelper {
    public static final WindowMetricsCompatHelper4 INSTANCE = new WindowMetricsCompatHelper4();

    private WindowMetricsCompatHelper4() {
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
        Context contextUnwrapUiContext$window_release = ContextCompatHelper.INSTANCE.unwrapUiContext$window_release(context);
        if (contextUnwrapUiContext$window_release instanceof Activity) {
            return currentWindowMetrics((Activity) contextUnwrapUiContext$window_release, densityCompatHelper);
        }
        if (contextUnwrapUiContext$window_release instanceof InputMethodService) {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayHelper displayHelper = DisplayHelper.INSTANCE;
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Intrinsics.checkNotNullExpressionValue(defaultDisplay, "getDefaultDisplay(...)");
            Point realSizeForDisplay = displayHelper.getRealSizeForDisplay(defaultDisplay);
            return new WindowMetrics(new Rect(0, 0, realSizeForDisplay.x, realSizeForDisplay.y), densityCompatHelper.density(context));
        }
        throw new IllegalArgumentException(context + " is not a UiContext");
    }

    @Override // androidx.window.layout.util.WindowMetricsCompatHelper
    public WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(densityCompatHelper, "densityCompatHelper");
        return new WindowMetrics(new Bounds(BoundsHelper.INSTANCE.getInstance().currentWindowBounds(activity)), densityCompatHelper.density(activity));
    }
}

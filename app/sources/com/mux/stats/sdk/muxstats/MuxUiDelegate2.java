package com.mux.stats.sdk.muxstats;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mux.stats.sdk.core.util.MuxLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MuxUiDelegate.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR(\u0010\u0006\u001a\u0004\u0018\u00018\u00002\b\u0010\u001c\u001a\u0004\u0018\u00018\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, m3636d2 = {"Lcom/mux/stats/sdk/muxstats/AndroidUiDelegate;", "Landroid/view/View;", "PlayerView", "Lcom/mux/stats/sdk/muxstats/MuxUiDelegate;", "Landroid/content/Context;", "context", "view", "<init>", "(Landroid/content/Context;Landroid/view/View;)V", "", "displayDensityFromContext", "(Landroid/content/Context;)F", "Landroid/graphics/Point;", "screenSizeFromContext", "(Landroid/content/Context;)Landroid/graphics/Point;", "Landroid/app/Activity;", "activity", "screenSize", "(Landroid/app/Activity;)Landroid/graphics/Point;", "screenSizeApiR", "screenSizeLegacy", "getPlayerViewSize", "()Landroid/graphics/Point;", "displayDensity", "()F", "_screenSize", "Landroid/graphics/Point;", "F", "value", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "core-android_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.mux.stats.sdk.muxstats.AndroidUiDelegate, reason: use source file name */
/* loaded from: classes27.dex */
final class MuxUiDelegate2<PlayerView extends View> extends MuxUiDelegate<PlayerView> {
    private Point _screenSize;
    private float displayDensity;

    public MuxUiDelegate2(Context context, PlayerView playerview) {
        super(playerview);
        this._screenSize = screenSizeFromContext(context);
        this.displayDensity = displayDensityFromContext(context);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxUiDelegate
    public PlayerView getView() {
        return (PlayerView) super.getView();
    }

    @Override // com.mux.stats.sdk.muxstats.MuxUiDelegate
    public void setView(PlayerView playerview) {
        Context context = playerview != null ? playerview.getContext() : null;
        this._screenSize = screenSizeFromContext(context);
        this.displayDensity = displayDensityFromContext(context);
        super.setView((MuxUiDelegate2<PlayerView>) playerview);
    }

    @Override // com.mux.stats.sdk.muxstats.MuxUiDelegate
    public Point getPlayerViewSize() {
        View view = getView();
        if (view != null) {
            Point point = new Point();
            point.x = view.getWidth();
            point.y = view.getHeight();
            return point;
        }
        return new Point();
    }

    private final float displayDensityFromContext(Context context) {
        Resources resources;
        DisplayMetrics displayMetrics;
        if (context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final Point screenSizeFromContext(Context context) {
        Point pointScreenSize;
        if (context != null) {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null && (pointScreenSize = screenSize(activity)) != null) {
                return pointScreenSize;
            }
        }
        return new Point();
    }

    private final Point screenSize(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return screenSizeApiR(activity);
        }
        return screenSizeLegacy(activity);
    }

    @TargetApi(30)
    private final Point screenSizeApiR(Activity activity) {
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        Point point = new Point(bounds.width(), bounds.height());
        Insets insetsIgnoringVisibility = activity.getWindowManager().getCurrentWindowMetrics().getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Point point2 = new Point();
        point2.x = point.x - (insetsIgnoringVisibility.right + insetsIgnoringVisibility.left);
        point2.y = point.y - (insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom);
        return point2;
    }

    private final Point screenSizeLegacy(Activity activity) {
        Display defaultDisplay;
        Point point = new Point();
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getSize(point);
        }
        MuxLogger.m1117d(MuxUiDelegate2.class.getSimpleName(), "displayStuffLegacy: Legacy Screen Size Size: " + point);
        return point;
    }

    @Override // com.mux.stats.sdk.muxstats.MuxUiDelegate
    /* renamed from: displayDensity, reason: from getter */
    public float getDisplayDensity() {
        return this.displayDensity;
    }
}

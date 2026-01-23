package io.bitdrift.capture.replay.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import io.bitdrift.capture.replay.ReplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayManagers.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lio/bitdrift/capture/replay/internal/DisplayManagers;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "windowManager", "Landroid/view/WindowManager;", "computeDisplayRect", "Lio/bitdrift/capture/replay/internal/ReplayRect;", "platform_jvm_replay-lib_kt"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class DisplayManagers {
    private final WindowManager windowManager;

    public DisplayManagers(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
    }

    public final ReplayRect computeDisplayRect() {
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = this.windowManager.getCurrentWindowMetrics().getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            return new ReplayRect(ReplayType.View.INSTANCE, bounds.left, bounds.top, bounds.width(), bounds.height());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return new ReplayRect(ReplayType.View.INSTANCE, 0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}

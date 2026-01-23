package androidx.window.layout.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.window.layout.WindowMetrics;
import kotlin.Metadata;

/* compiled from: WindowMetricsCompatHelper.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m3636d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelper;", "", "Landroid/content/Context;", "context", "Landroidx/window/layout/util/DensityCompatHelper;", "densityCompatHelper", "Landroidx/window/layout/WindowMetrics;", "currentWindowMetrics", "(Landroid/content/Context;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;Landroidx/window/layout/util/DensityCompatHelper;)Landroidx/window/layout/WindowMetrics;", "Companion", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface WindowMetricsCompatHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    WindowMetrics currentWindowMetrics(Activity activity, DensityCompatHelper densityCompatHelper);

    WindowMetrics currentWindowMetrics(Context context, DensityCompatHelper densityCompatHelper);

    /* compiled from: WindowMetricsCompatHelper.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Landroidx/window/layout/util/WindowMetricsCompatHelper$Companion;", "", "()V", "getInstance", "Landroidx/window/layout/util/WindowMetricsCompatHelper;", "window_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final WindowMetricsCompatHelper getInstance() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                return WindowMetricsCompatHelper3.INSTANCE;
            }
            if (i >= 30) {
                return WindowMetricsCompatHelper2.INSTANCE;
            }
            return WindowMetricsCompatHelper4.INSTANCE;
        }
    }
}

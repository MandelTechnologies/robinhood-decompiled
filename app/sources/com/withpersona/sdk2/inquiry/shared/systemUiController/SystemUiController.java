package com.withpersona.sdk2.inquiry.shared.systemUiController;

import android.graphics.Color;
import android.view.Window;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SystemUiController.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\n*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/systemUiController/SystemUiController;", "", "window", "Landroid/view/Window;", "controlNavigationBar", "", "controlStatusBar", "<init>", "(Landroid/view/Window;ZZ)V", "updateSystemUiColor", "", "backgroundColor", "", "updateUiColor", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class SystemUiController {
    private final boolean controlNavigationBar;
    private final boolean controlStatusBar;
    private final Window window;

    public SystemUiController(Window window, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(window, "window");
        this.window = window;
        this.controlNavigationBar = z;
        this.controlStatusBar = z2;
    }

    public final void updateSystemUiColor(int backgroundColor) {
        updateUiColor(this.window, backgroundColor);
    }

    private final void updateUiColor(Window window, int i) {
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double dCalculateContrast = ColorUtils.calculateContrast(-1, iRgb);
        double dCalculateContrast2 = ColorUtils.calculateContrast(-16777216, iRgb);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        if (this.controlNavigationBar) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(dCalculateContrast < dCalculateContrast2);
        }
        if (this.controlStatusBar) {
            windowInsetsControllerCompat.setAppearanceLightStatusBars(dCalculateContrast < dCalculateContrast2);
        }
    }
}

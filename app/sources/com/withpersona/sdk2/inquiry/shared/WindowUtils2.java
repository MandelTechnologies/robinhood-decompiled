package com.withpersona.sdk2.inquiry.shared;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowUtils.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"updateUiColor", "", "Landroid/view/Window;", "backgroundColor", "", "shared_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.shared.WindowUtilsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class WindowUtils2 {
    public static final void updateUiColor(Window window, int i) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        int iRgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        double dCalculateContrast = ColorUtils.calculateContrast(-1, iRgb);
        double dCalculateContrast2 = ColorUtils.calculateContrast(-16777216, iRgb);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, decorView);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(dCalculateContrast < dCalculateContrast2);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(dCalculateContrast < dCalculateContrast2);
    }
}

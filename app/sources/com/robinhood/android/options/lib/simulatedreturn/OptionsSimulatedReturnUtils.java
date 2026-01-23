package com.robinhood.android.options.lib.simulatedreturn;

import android.app.Activity;
import android.util.DisplayMetrics;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsSimulatedReturnUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"isDeviceSmallForOptionsSimulatedReturn", "", "activity", "Landroid/app/Activity;", "(Landroidx/compose/runtime/Composer;I)Z", "SMALL_DEVICE_ASPECT_RATIO_FOR_OPTIONS_SIMULATED_RETURNS", "", "SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS", "", "lib-options-simulated-return_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtilsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsSimulatedReturnUtils {
    public static final float SMALL_DEVICE_ASPECT_RATIO_FOR_OPTIONS_SIMULATED_RETURNS = 1.3333334f;
    public static final int SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS = 640;

    public static final boolean isDeviceSmallForOptionsSimulatedReturn(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        float f3 = displayMetrics.heightPixels / f2;
        return f3 <= 640.0f || f3 / (f / f2) <= 1.3333334f;
    }

    public static final boolean isDeviceSmallForOptionsSimulatedReturn(Composer composer, int i) {
        composer.startReplaceGroup(1835917554);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1835917554, i, -1, "com.robinhood.android.options.lib.simulatedreturn.isDeviceSmallForOptionsSimulatedReturn (OptionsSimulatedReturnUtils.kt:19)");
        }
        int iMo7449getContainerSizeYbymL2g = (int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L);
        boolean z = iMo7449getContainerSizeYbymL2g <= 640 || ((float) (iMo7449getContainerSizeYbymL2g / ((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() >> 32)))) <= 1.3333334f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }
}

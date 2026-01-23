package com.robinhood.android.trade.options;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionOrderSmallDeviceUtil.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0003\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0004\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m3636d2 = {"smallDeviceVerticalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "getOptionOrderRowVerticalPadding", "(Landroidx/compose/runtime/Composer;I)F", "OPTION_ORDER_SMALL_DEVICE_VERTICAL_PADDING", "", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.OptionOrderSmallDeviceUtilKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderSmallDeviceUtil {
    private static final int OPTION_ORDER_SMALL_DEVICE_VERTICAL_PADDING = 700;
    private static final float smallDeviceVerticalPadding = C2002Dp.m7995constructorimpl(10);

    public static final float getOptionOrderRowVerticalPadding(Composer composer, int i) {
        float fM21590getDefaultD9Ej5fM;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1675351360, i, -1, "com.robinhood.android.trade.options.getOptionOrderRowVerticalPadding (OptionOrderSmallDeviceUtil.kt:17)");
        }
        if (((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composer.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L)) < 700.0f) {
            fM21590getDefaultD9Ej5fM = smallDeviceVerticalPadding;
        } else {
            fM21590getDefaultD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fM21590getDefaultD9Ej5fM;
    }
}

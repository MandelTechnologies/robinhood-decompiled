package com.robinhood.android.responsive;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Density.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0011\u0010\u0000\u001a\u00020\u00018G¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"isLowDensityScreen", "", "(Landroidx/compose/runtime/Composer;I)Z", "lib-responsive_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.responsive.DensityKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Density4 {
    @JvmName
    public static final boolean isLowDensityScreen(Composer composer, int i) {
        composer.startReplaceGroup(1726066501);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1726066501, i, -1, "com.robinhood.android.responsive.<get-isLowDensityScreen> (Density.kt:10)");
        }
        boolean z = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity() <= 2.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }
}

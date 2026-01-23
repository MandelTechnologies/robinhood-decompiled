package com.truelayer.payments.p419ui.utils;

import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Converters.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0002\u0010\u0003\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\u0002*\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001e\u0010\b\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m3636d2 = {"intoDp", "Landroidx/compose/ui/unit/Dp;", "", "(FLandroidx/compose/runtime/Composer;I)F", "", "density", "Landroidx/compose/ui/unit/Density;", "(ILandroidx/compose/ui/unit/Density;)F", "intoPx", "intoPx-8Feqmps", "intoPx-D5KLDUw", "(FLandroidx/compose/ui/unit/Density;)F", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.utils.ConvertersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Converters3 {
    /* renamed from: intoPx-8Feqmps, reason: not valid java name */
    public static final float m27183intoPx8Feqmps(float f, Composer composer, int i) {
        composer.startReplaceableGroup(1428357075);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428357075, i, -1, "com.truelayer.payments.ui.utils.intoPx (Converters.kt:8)");
        }
        float fMo5016toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5016toPx0680j_4(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo5016toPx0680j_4;
    }

    /* renamed from: intoPx-D5KLDUw, reason: not valid java name */
    public static final float m27184intoPxD5KLDUw(float f, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo5016toPx0680j_4(f);
    }

    public static final float intoDp(float f, Composer composer, int i) {
        composer.startReplaceableGroup(1795615673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1795615673, i, -1, "com.truelayer.payments.ui.utils.intoDp (Converters.kt:17)");
        }
        float fMo5012toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo5012toDpu2uoSUM(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo5012toDpu2uoSUM;
    }

    public static final float intoDp(int i, Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo5013toDpu2uoSUM(i);
    }
}

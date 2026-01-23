package androidx.compose.material;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: ElevationOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"LocalAbsoluteElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalElevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "getLocalElevationOverlay", "calculateForegroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "elevation", "calculateForegroundColor-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material.ElevationOverlayKt, reason: use source file name */
/* loaded from: classes.dex */
public final class ElevationOverlay3 {
    private static final CompositionLocal6<ElevationOverlay> LocalElevationOverlay = CompositionLocal3.staticCompositionLocalOf(new Function0<ElevationOverlay>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalElevationOverlay$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ElevationOverlay invoke() {
            return ElevationOverlay2.INSTANCE;
        }
    });
    private static final CompositionLocal6<C2002Dp> LocalAbsoluteElevation = CompositionLocal3.compositionLocalOf$default(null, new Function0<C2002Dp>() { // from class: androidx.compose.material.ElevationOverlayKt$LocalAbsoluteElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ C2002Dp invoke() {
            return C2002Dp.m7993boximpl(m5591invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m5591invokeD9Ej5fM() {
            return C2002Dp.m7995constructorimpl(0);
        }
    }, 1, null);

    public static final CompositionLocal6<ElevationOverlay> getLocalElevationOverlay() {
        return LocalElevationOverlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateForegroundColor-CLU3JFs, reason: not valid java name */
    public static final long m5590calculateForegroundColorCLU3JFs(long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613340891, i, -1, "androidx.compose.material.calculateForegroundColor (ElevationOverlay.kt:85)");
        }
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(Colors2.m5565contentColorForek8zF_U(j, composer, i & 14), ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM6705copywmQWz5c$default;
    }

    public static final CompositionLocal6<C2002Dp> getLocalAbsoluteElevation() {
        return LocalAbsoluteElevation;
    }
}

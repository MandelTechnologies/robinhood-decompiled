package androidx.compose.material;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Colors.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0088\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/ui/graphics/Color;", InstantRetirementSplashScreen.PrimaryButtonTag, "primaryVariant", InstantRetirementSplashScreen.SecondaryButtonTag, "secondaryVariant", "background", "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.ColorsKt, reason: use source file name */
/* loaded from: classes.dex */
public final class Colors2 {
    private static final CompositionLocal6<Colors> LocalColors = CompositionLocal3.staticCompositionLocalOf(new Function0<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Colors invoke() {
            return Colors2.m5567lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    });

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m5567lightColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jColor = (i & 1) != 0 ? Color2.Color(4284612846L) : j;
        long jColor2 = (i & 2) != 0 ? Color2.Color(4281794739L) : j2;
        long jColor3 = (i & 4) != 0 ? Color2.Color(4278442694L) : j3;
        long jColor4 = (i & 8) != 0 ? Color2.Color(4278290310L) : j4;
        long jM6727getWhite0d7_KjU = (i & 16) != 0 ? Color.INSTANCE.m6727getWhite0d7_KjU() : j5;
        long jM6727getWhite0d7_KjU2 = (i & 32) != 0 ? Color.INSTANCE.m6727getWhite0d7_KjU() : j6;
        long jColor5 = (i & 64) != 0 ? Color2.Color(4289724448L) : j7;
        long jM6727getWhite0d7_KjU3 = (i & 128) != 0 ? Color.INSTANCE.m6727getWhite0d7_KjU() : j8;
        long j13 = jColor;
        long jM6716getBlack0d7_KjU = (i & 256) != 0 ? Color.INSTANCE.m6716getBlack0d7_KjU() : j9;
        long jM6716getBlack0d7_KjU2 = (i & 512) != 0 ? Color.INSTANCE.m6716getBlack0d7_KjU() : j10;
        long jM6716getBlack0d7_KjU3 = (i & 1024) != 0 ? Color.INSTANCE.m6716getBlack0d7_KjU() : j11;
        if ((i & 2048) != 0) {
            j12 = Color.INSTANCE.m6727getWhite0d7_KjU();
        }
        return m5566lightColors2qZNXz8(j13, jColor2, jColor3, jColor4, jM6727getWhite0d7_KjU, jM6727getWhite0d7_KjU2, jColor5, jM6727getWhite0d7_KjU3, jM6716getBlack0d7_KjU, jM6716getBlack0d7_KjU2, jM6716getBlack0d7_KjU3, j12);
    }

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m5566lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static final long getPrimarySurface(Colors colors) {
        return colors.isLight() ? colors.m5559getPrimary0d7_KjU() : colors.m5563getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m5564contentColorFor4WTKRHQ(Colors colors, long j) {
        if (!Color.m6707equalsimpl0(j, colors.m5559getPrimary0d7_KjU()) && !Color.m6707equalsimpl0(j, colors.m5560getPrimaryVariant0d7_KjU())) {
            if (!Color.m6707equalsimpl0(j, colors.m5561getSecondary0d7_KjU()) && !Color.m6707equalsimpl0(j, colors.m5562getSecondaryVariant0d7_KjU())) {
                return Color.m6707equalsimpl0(j, colors.m5552getBackground0d7_KjU()) ? colors.m5554getOnBackground0d7_KjU() : Color.m6707equalsimpl0(j, colors.m5563getSurface0d7_KjU()) ? colors.m5558getOnSurface0d7_KjU() : Color.m6707equalsimpl0(j, colors.m5553getError0d7_KjU()) ? colors.m5555getOnError0d7_KjU() : Color.INSTANCE.m6726getUnspecified0d7_KjU();
            }
            return colors.m5557getOnSecondary0d7_KjU();
        }
        return colors.m5556getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m5565contentColorForek8zF_U(long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:311)");
        }
        composer.startReplaceGroup(-702388415);
        long jM5564contentColorFor4WTKRHQ = m5564contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (jM5564contentColorFor4WTKRHQ == 16) {
            jM5564contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColor.getLocalContentColor())).getValue();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM5564contentColorFor4WTKRHQ;
    }

    public static final CompositionLocal6<Colors> getLocalColors() {
        return LocalColors;
    }
}

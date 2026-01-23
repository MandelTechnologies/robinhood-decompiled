package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Button.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010$\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010&R\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b*\u0010&R\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010&R\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010&R\u001a\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010\u001dR\u0017\u00100\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u0011\u00105\u001a\u0002028G¢\u0006\u0006\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, m3636d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "<init>", "()V", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "Landroidx/compose/material/ButtonElevation;", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "elevation", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "Landroidx/compose/material/ButtonColors;", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "buttonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "outlinedButtonColors", "textButtonColors-RGew2ao", "textButtonColors", "ButtonHorizontalPadding", "F", "ButtonVerticalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinWidth", "getMinWidth-D9Ej5fM", "()F", "MinHeight", "getMinHeight-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "IconSpacing", "getIconSpacing-D9Ej5fM", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonHorizontalPadding", "TextButtonContentPadding", "getTextButtonContentPadding", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedBorder", "material_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    private ButtonDefaults() {
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m5545getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5544getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m5542buttonColorsro_MJ88(long j, long j2, long j3, long j4, Composer composer, int i, int i2) {
        long jM6732compositeOverOWjLjI;
        long jM5559getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m5559getPrimary0d7_KjU() : j;
        long jM5565contentColorForek8zF_U = (i2 & 2) != 0 ? Colors2.m5565contentColorForek8zF_U(jM5559getPrimary0d7_KjU, composer, i & 14) : j2;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM6732compositeOverOWjLjI = Color2.m6732compositeOverOWjLjI(Color.m6705copywmQWz5c$default(materialTheme.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m5563getSurface0d7_KjU());
        } else {
            jM6732compositeOverOWjLjI = j3;
        }
        long jM6705copywmQWz5c$default = (i2 & 8) != 0 ? Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM5559getPrimary0d7_KjU, jM5565contentColorForek8zF_U, jM6732compositeOverOWjLjI, jM6705copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m5546outlinedButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        long jM5563getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m5563getSurface0d7_KjU() : j;
        long jM5559getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m5559getPrimary0d7_KjU() : j2;
        long jM6705copywmQWz5c$default = (i2 & 4) != 0 ? Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:437)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM5563getSurface0d7_KjU, jM5559getPrimary0d7_KjU, jM5563getSurface0d7_KjU, jM6705copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m5547textButtonColorsRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        long jM6725getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m6725getTransparent0d7_KjU() : j;
        long jM5559getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m5559getPrimary0d7_KjU() : j2;
        long jM6705copywmQWz5c$default = (i2 & 4) != 0 ? Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM6725getTransparent0d7_KjU, jM5559getPrimary0d7_KjU, jM6725getTransparent0d7_KjU, jM6705copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    @JvmName
    public final BorderStroke getOutlinedBorder(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(OutlinedBorderSize, Color.m6705copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m5558getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM4886BorderStrokecXLIe8U;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m5543elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = C2002Dp.m7995constructorimpl(2);
        }
        float f6 = f;
        if ((i2 & 2) != 0) {
            f2 = C2002Dp.m7995constructorimpl(8);
        }
        float f7 = f2;
        if ((i2 & 4) != 0) {
            f3 = C2002Dp.m7995constructorimpl(0);
        }
        float f8 = f3;
        if ((i2 & 8) != 0) {
            f4 = C2002Dp.m7995constructorimpl(4);
        }
        float f9 = f4;
        if ((i2 & 16) != 0) {
            f5 = C2002Dp.m7995constructorimpl(4);
        }
        float f10 = f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f6)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(f7)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f8)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(f9)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(f10)) || (i & 24576) == 16384);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f6, f7, f8, f9, f10, null);
            composer.updateRememberedValue(defaultButtonElevation);
            objRememberedValue = defaultButtonElevation;
        }
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonElevation2;
    }

    static {
        float fM7995constructorimpl = C2002Dp.m7995constructorimpl(16);
        ButtonHorizontalPadding = fM7995constructorimpl;
        float f = 8;
        float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(f);
        ButtonVerticalPadding = fM7995constructorimpl2;
        PaddingValues paddingValuesM5138PaddingValuesa9UjIt4 = PaddingKt.m5138PaddingValuesa9UjIt4(fM7995constructorimpl, fM7995constructorimpl2, fM7995constructorimpl, fM7995constructorimpl2);
        ContentPadding = paddingValuesM5138PaddingValuesa9UjIt4;
        MinWidth = C2002Dp.m7995constructorimpl(64);
        MinHeight = C2002Dp.m7995constructorimpl(36);
        IconSize = C2002Dp.m7995constructorimpl(18);
        IconSpacing = C2002Dp.m7995constructorimpl(f);
        OutlinedBorderSize = C2002Dp.m7995constructorimpl(1);
        float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl(f);
        TextButtonHorizontalPadding = fM7995constructorimpl3;
        TextButtonContentPadding = PaddingKt.m5138PaddingValuesa9UjIt4(fM7995constructorimpl3, paddingValuesM5138PaddingValuesa9UjIt4.getTop(), fM7995constructorimpl3, paddingValuesM5138PaddingValuesa9UjIt4.getBottom());
    }
}

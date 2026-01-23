package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.component.BentoChip2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoChip.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0016\u0010\r\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0016\u0010\u000f\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0011\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0016\u0010\u0013\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007R\u0016\u0010\u0015\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0016\u0010\u0007R\u0016\u0010\u0017\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0018\u0010\u0007R\u0016\u0010\u0019\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001a\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001c\u0010\u0007R\u0016\u0010\u001d\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001e\u0010\u0007R\u0016\u0010\u001f\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b \u0010\u0007R\u0016\u0010!\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\"\u0010\u0007R\u0016\u0010#\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010(R\u0014\u00101\u001a\u00020&8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010(R\u0014\u00103\u001a\u0002048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u000e\u00107\u001a\u000208X\u0080T¢\u0006\u0002\n\u0000¨\u00069"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoChipsDefaults;", "", "<init>", "()V", "shapeRadius", "Landroidx/compose/ui/unit/Dp;", "getShapeRadius-D9Ej5fM$lib_compose_bento_externalRelease", "()F", "F", "outlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM$lib_compose_bento_externalRelease", "paddingStart", "getPaddingStart-D9Ej5fM$lib_compose_bento_externalRelease", "paddingStartWithLargeIcon", "getPaddingStartWithLargeIcon-D9Ej5fM$lib_compose_bento_externalRelease", "paddingEnd", "getPaddingEnd-D9Ej5fM$lib_compose_bento_externalRelease", "paddingEndWithCount", "getPaddingEndWithCount-D9Ej5fM$lib_compose_bento_externalRelease", "paddingVertical", "getPaddingVertical-D9Ej5fM$lib_compose_bento_externalRelease", "chipHeight", "getChipHeight-D9Ej5fM$lib_compose_bento_externalRelease", "spacing", "getSpacing-D9Ej5fM$lib_compose_bento_externalRelease", "iconDropdownSize", "getIconDropdownSize-D9Ej5fM$lib_compose_bento_externalRelease", "accessoryNormalSize", "getAccessoryNormalSize-D9Ej5fM$lib_compose_bento_externalRelease", "accessoryLargeSize", "getAccessoryLargeSize-D9Ej5fM$lib_compose_bento_externalRelease", "countTextPadding", "getCountTextPadding-D9Ej5fM$lib_compose_bento_externalRelease", "countRadius", "getCountRadius-D9Ej5fM$lib_compose_bento_externalRelease", "countMinSize", "getCountMinSize-D9Ej5fM$lib_compose_bento_externalRelease", "defaultColors", "Lcom/robinhood/compose/bento/component/BentoChips$Colors;", "getDefaultColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoChips$Colors;", "pressedColors", "getPressedColors", "disabledColors", "getDisabledColors", "selectedAndDefaultColors", "getSelectedAndDefaultColors", "selectedAndPressedColors", "getSelectedAndPressedColors", "selectedAndDisabledColors", "getSelectedAndDisabledColors", "colors", "Lcom/robinhood/compose/bento/component/BentoChips$StatefulColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoChips$StatefulColors;", "Size28IconDisabledOpacity", "", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoChipsDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoChip3 {
    public static final int $stable = 0;
    public static final float Size28IconDisabledOpacity = 0.4f;
    private static final float accessoryNormalSize;
    private static final float countRadius;
    private static final float countTextPadding;
    private static final float iconDropdownSize;
    private static final float paddingEnd;
    private static final float paddingEndWithCount;
    private static final float paddingStart;
    private static final float paddingVertical;
    private static final float spacing;
    public static final BentoChip3 INSTANCE = new BentoChip3();
    private static final float shapeRadius = C2002Dp.m7995constructorimpl(20);
    private static final float outlinedBorderSize = C2002Dp.m7995constructorimpl(1);
    private static final float paddingStartWithLargeIcon = C2002Dp.m7995constructorimpl(6);
    private static final float chipHeight = C2002Dp.m7995constructorimpl(40);
    private static final float accessoryLargeSize = C2002Dp.m7995constructorimpl(28);
    private static final float countMinSize = C2002Dp.m7995constructorimpl(24);

    static {
        float f = 16;
        paddingStart = C2002Dp.m7995constructorimpl(f);
        paddingEnd = C2002Dp.m7995constructorimpl(f);
        float f2 = 12;
        paddingEndWithCount = C2002Dp.m7995constructorimpl(f2);
        float f3 = 8;
        paddingVertical = C2002Dp.m7995constructorimpl(f3);
        spacing = C2002Dp.m7995constructorimpl(f3);
        iconDropdownSize = C2002Dp.m7995constructorimpl(f2);
        accessoryNormalSize = C2002Dp.m7995constructorimpl(f);
        countTextPadding = C2002Dp.m7995constructorimpl(f3);
        countRadius = C2002Dp.m7995constructorimpl(f2);
    }

    private BentoChip3() {
    }

    /* renamed from: getShapeRadius-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20632getShapeRadiusD9Ej5fM$lib_compose_bento_externalRelease() {
        return shapeRadius;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20627getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return outlinedBorderSize;
    }

    /* renamed from: getPaddingStart-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20630getPaddingStartD9Ej5fM$lib_compose_bento_externalRelease() {
        return paddingStart;
    }

    /* renamed from: getPaddingStartWithLargeIcon-D9Ej5fM$lib_compose_bento_externalRelease */
    public final float m2573x307f99b4() {
        return paddingStartWithLargeIcon;
    }

    /* renamed from: getPaddingEnd-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20628getPaddingEndD9Ej5fM$lib_compose_bento_externalRelease() {
        return paddingEnd;
    }

    /* renamed from: getPaddingEndWithCount-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20629getPaddingEndWithCountD9Ej5fM$lib_compose_bento_externalRelease() {
        return paddingEndWithCount;
    }

    /* renamed from: getPaddingVertical-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20631getPaddingVerticalD9Ej5fM$lib_compose_bento_externalRelease() {
        return paddingVertical;
    }

    /* renamed from: getChipHeight-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20622getChipHeightD9Ej5fM$lib_compose_bento_externalRelease() {
        return chipHeight;
    }

    /* renamed from: getSpacing-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20633getSpacingD9Ej5fM$lib_compose_bento_externalRelease() {
        return spacing;
    }

    /* renamed from: getIconDropdownSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20626getIconDropdownSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return iconDropdownSize;
    }

    /* renamed from: getAccessoryNormalSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20621getAccessoryNormalSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return accessoryNormalSize;
    }

    /* renamed from: getAccessoryLargeSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20620getAccessoryLargeSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return accessoryLargeSize;
    }

    /* renamed from: getCountTextPadding-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20625getCountTextPaddingD9Ej5fM$lib_compose_bento_externalRelease() {
        return countTextPadding;
    }

    /* renamed from: getCountRadius-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20624getCountRadiusD9Ej5fM$lib_compose_bento_externalRelease() {
        return countRadius;
    }

    /* renamed from: getCountMinSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20623getCountMinSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return countMinSize;
    }

    @JvmName
    private final BentoChip2.Colors getDefaultColors(Composer composer, int i) {
        composer.startReplaceGroup(-783043932);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-783043932, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-defaultColors> (BentoChip.kt:405)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        BentoChip2.Colors colors = new BentoChip2.Colors(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colors;
    }

    @JvmName
    private final BentoChip2.Colors getPressedColors(Composer composer, int i) {
        composer.startReplaceGroup(-383663420);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-383663420, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-pressedColors> (BentoChip.kt:413)");
        }
        BentoChip2.Colors colorsM20608copyt635Npw$default = BentoChip2.Colors.m20608copyt635Npw$default(getDefaultColors(composer, i & 14), 0L, 0L, BentoTheme.INSTANCE.getColors(composer, 6).m21372getBg20d7_KjU(), 0L, 0L, 27, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorsM20608copyt635Npw$default;
    }

    @JvmName
    private final BentoChip2.Colors getDisabledColors(Composer composer, int i) {
        composer.startReplaceGroup(1756031438);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756031438, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-disabledColors> (BentoChip.kt:415)");
        }
        BentoChip2.Colors colorsM20608copyt635Npw$default = BentoChip2.Colors.m20608copyt635Npw$default(getDefaultColors(composer, i & 14), BentoTheme.INSTANCE.getColors(composer, 6).m21427getFg30d7_KjU(), 0L, 0L, 0L, 0L, 30, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorsM20608copyt635Npw$default;
    }

    @JvmName
    private final BentoChip2.Colors getSelectedAndDefaultColors(Composer composer, int i) {
        composer.startReplaceGroup(-360540612);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-360540612, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-selectedAndDefaultColors> (BentoChip.kt:417)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        BentoChip2.Colors colors = new BentoChip2.Colors(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colors;
    }

    @JvmName
    private final BentoChip2.Colors getSelectedAndPressedColors(Composer composer, int i) {
        composer.startReplaceGroup(-779197830);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-779197830, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-selectedAndPressedColors> (BentoChip.kt:425)");
        }
        BentoChip2.Colors colorsM20608copyt635Npw$default = BentoChip2.Colors.m20608copyt635Npw$default(getSelectedAndDefaultColors(composer, i & 14), 0L, 0L, 0L, 0L, 0L, 31, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorsM20608copyt635Npw$default;
    }

    @JvmName
    private final BentoChip2.Colors getSelectedAndDisabledColors(Composer composer, int i) {
        composer.startReplaceGroup(1762514436);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762514436, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-selectedAndDisabledColors> (BentoChip.kt:427)");
        }
        BentoChip2.Colors selectedAndDefaultColors = getSelectedAndDefaultColors(composer, i & 14);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, 6).m21372getBg20d7_KjU();
        BentoChip2.Colors colorsM20608copyt635Npw$default = BentoChip2.Colors.m20608copyt635Npw$default(selectedAndDefaultColors, 0L, bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), jM21372getBg20d7_KjU, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return colorsM20608copyt635Npw$default;
    }

    @JvmName
    public final BentoChip2.StatefulColors getColors(Composer composer, int i) {
        composer.startReplaceGroup(-605427342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-605427342, i, -1, "com.robinhood.compose.bento.component.BentoChipsDefaults.<get-colors> (BentoChip.kt:435)");
        }
        int i2 = i & 14;
        BentoChip2.StatefulColors statefulColors = new BentoChip2.StatefulColors(getDefaultColors(composer, i2), getPressedColors(composer, i2), getDisabledColors(composer, i2), getSelectedAndDefaultColors(composer, i2), getSelectedAndPressedColors(composer, i2), getSelectedAndDisabledColors(composer, i2));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return statefulColors;
    }
}

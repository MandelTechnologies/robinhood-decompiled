package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoColors;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoPog.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0002J\f\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0002R\u0011\u0010\b\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0014\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0016\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u0018\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u001a\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\u001c\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u001e\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0012R\u0013\u0010 \u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b!\u0010\u0012R\u0013\u0010\"\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b#\u0010\u0012R\u0013\u0010$\u001a\u00020\u0010¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoPogDefaults;", "", "<init>", "()V", "defaultPogColorsDay", "Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", "Lcom/robinhood/compose/bento/theme/BentoColors;", "defaultPogColorsNight", "defaultColors", "getDefaultColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PogStyle$PogColors;", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/PogStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PogStyle;", "extraSmallPogSize", "Landroidx/compose/ui/unit/Dp;", "getExtraSmallPogSize-D9Ej5fM", "()F", "F", "standardPogSize", "getStandardPogSize-D9Ej5fM", "heroPogSize", "getHeroPogSize-D9Ej5fM", "extraLargePogSize", "getExtraLargePogSize-D9Ej5fM", "extraSmallTextPogPaddingHorizontal", "getExtraSmallTextPogPaddingHorizontal-D9Ej5fM", "standardTextPogPaddingHorizontal", "getStandardTextPogPaddingHorizontal-D9Ej5fM", "heroTextPogPaddingHorizontal", "getHeroTextPogPaddingHorizontal-D9Ej5fM", "extraLargeTextPogPaddingHorizontal", "getExtraLargeTextPogPaddingHorizontal-D9Ej5fM", "numberPogSizeDp", "getNumberPogSizeDp-D9Ej5fM", "numberPoghorizontalPadding", "getNumberPoghorizontalPadding-D9Ej5fM", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BentoPogDefaults {
    public static final int $stable = 0;
    private static final float extraLargeTextPogPaddingHorizontal;
    private static final float extraSmallPogSize;
    private static final float numberPoghorizontalPadding;
    private static final float standardTextPogPaddingHorizontal;
    public static final BentoPogDefaults INSTANCE = new BentoPogDefaults();
    private static final float standardPogSize = C2002Dp.m7995constructorimpl(48);
    private static final float heroPogSize = C2002Dp.m7995constructorimpl(80);
    private static final float extraLargePogSize = C2002Dp.m7995constructorimpl(120);
    private static final float extraSmallTextPogPaddingHorizontal = C2002Dp.m7995constructorimpl(1);
    private static final float heroTextPogPaddingHorizontal = C2002Dp.m7995constructorimpl(8);
    private static final float numberPogSizeDp = C2002Dp.m7995constructorimpl(24);

    static {
        float f = 28;
        extraSmallPogSize = C2002Dp.m7995constructorimpl(f);
        float f2 = 2;
        standardTextPogPaddingHorizontal = C2002Dp.m7995constructorimpl(f2);
        extraLargeTextPogPaddingHorizontal = C2002Dp.m7995constructorimpl(f);
        numberPoghorizontalPadding = C2002Dp.m7995constructorimpl(f2);
    }

    private BentoPogDefaults() {
    }

    private final PogStyle.PogColors defaultPogColorsDay(BentoColors bentoColors) {
        return new PogStyle.PogColors(bentoColors.getNova(), bentoColors.getJet(), bentoColors.getNova(), bentoColors.m21373getBg30d7_KjU(), bentoColors.m21426getFg20d7_KjU(), null);
    }

    private final PogStyle.PogColors defaultPogColorsNight(BentoColors bentoColors) {
        return new PogStyle.PogColors(bentoColors.getNova(), bentoColors.m21372getBg20d7_KjU(), bentoColors.m21427getFg30d7_KjU(), bentoColors.m21372getBg20d7_KjU(), bentoColors.m21426getFg20d7_KjU(), null);
    }

    @JvmName
    public final PogStyle.PogColors getDefaultColors(Composer composer, int i) {
        PogStyle.PogColors pogColorsDefaultPogColorsNight;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2131873701, i, -1, "com.robinhood.compose.bento.component.BentoPogDefaults.<get-defaultColors> (BentoPog.kt:390)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        if (bentoTheme.getColors(composer, 6).getIsDay()) {
            composer.startReplaceGroup(-967941208);
            pogColorsDefaultPogColorsNight = defaultPogColorsDay(bentoTheme.getColors(composer, 6));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-967872698);
            pogColorsDefaultPogColorsNight = defaultPogColorsNight(bentoTheme.getColors(composer, 6));
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pogColorsDefaultPogColorsNight;
    }

    @JvmName
    public final PogStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1359596462, i, -1, "com.robinhood.compose.bento.component.BentoPogDefaults.<get-style> (BentoPog.kt:398)");
        }
        PogStyle.PogColors defaultColors = getDefaultColors(composer, i & 14);
        PogStyle.PogColors pogColors = new PogStyle.PogColors(defaultColors.m21895getForegroundEnabled0d7_KjU(), defaultColors.m21892getBackgroundEnabled0d7_KjU(), defaultColors.m21894getForegroundDisabled0d7_KjU(), defaultColors.m21891getBackgroundDisabled0d7_KjU(), defaultColors.m21893getBorderColor0d7_KjU(), null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        PogStyle pogStyle = new PogStyle(pogColors, new PogStyle.PogTextStyle(bentoTheme.getTypography(composer, 6).getTextS(), bentoTheme.getTypography(composer, 6).getTextL(), bentoTheme.getTypography(composer, 6).getDisplayCapsuleSmall(), bentoTheme.getTypography(composer, 6).getTextS()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pogStyle;
    }

    /* renamed from: getExtraSmallPogSize-D9Ej5fM, reason: not valid java name */
    public final float m20666getExtraSmallPogSizeD9Ej5fM() {
        return extraSmallPogSize;
    }

    /* renamed from: getStandardPogSize-D9Ej5fM, reason: not valid java name */
    public final float m20672getStandardPogSizeD9Ej5fM() {
        return standardPogSize;
    }

    /* renamed from: getHeroPogSize-D9Ej5fM, reason: not valid java name */
    public final float m20668getHeroPogSizeD9Ej5fM() {
        return heroPogSize;
    }

    /* renamed from: getExtraLargePogSize-D9Ej5fM, reason: not valid java name */
    public final float m20664getExtraLargePogSizeD9Ej5fM() {
        return extraLargePogSize;
    }

    /* renamed from: getExtraSmallTextPogPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m20667getExtraSmallTextPogPaddingHorizontalD9Ej5fM() {
        return extraSmallTextPogPaddingHorizontal;
    }

    /* renamed from: getStandardTextPogPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m20673getStandardTextPogPaddingHorizontalD9Ej5fM() {
        return standardTextPogPaddingHorizontal;
    }

    /* renamed from: getHeroTextPogPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m20669getHeroTextPogPaddingHorizontalD9Ej5fM() {
        return heroTextPogPaddingHorizontal;
    }

    /* renamed from: getExtraLargeTextPogPaddingHorizontal-D9Ej5fM, reason: not valid java name */
    public final float m20665getExtraLargeTextPogPaddingHorizontalD9Ej5fM() {
        return extraLargeTextPogPaddingHorizontal;
    }

    /* renamed from: getNumberPogSizeDp-D9Ej5fM, reason: not valid java name */
    public final float m20670getNumberPogSizeDpD9Ej5fM() {
        return numberPogSizeDp;
    }

    /* renamed from: getNumberPoghorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m20671getNumberPoghorizontalPaddingD9Ej5fM() {
        return numberPoghorizontalPadding;
    }
}

package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextStyles.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002¨\u0006\u0006"}, m3636d2 = {"toFontSize", "Landroidx/compose/ui/unit/TextUnit;", "Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextStyle;Landroidx/compose/runtime/Composer;I)J", "toFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.TextStylesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class TextStyles {

    /* compiled from: TextStyles.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.TextStylesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextStyle.values().length];
            try {
                iArr[TextStyle.TEXT_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextStyle.TEXT_SMALL_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextStyle.TEXT_MEDIUM_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TextStyle.TEXT_LARGE_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TextStyle.DISPLAY_SMALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TextStyle.DISPLAY_MEDIUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TextStyle.DISPLAY_LARGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long toFontSize(TextStyle textStyle, Composer composer, int i) {
        long jM7662getFontSizeXSAIIZE;
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        composer.startReplaceGroup(-1354901426);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1354901426, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toFontSize (TextStyles.kt:9)");
        }
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
            case 2:
                composer.startReplaceGroup(-685174474);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            case 3:
            case 4:
                composer.startReplaceGroup(-685171338);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            case 5:
            case 6:
                composer.startReplaceGroup(-685168266);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            case 7:
                composer.startReplaceGroup(-685165514);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            case 8:
                composer.startReplaceGroup(-685162698);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleMedium().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            case 9:
                composer.startReplaceGroup(-685159946);
                jM7662getFontSizeXSAIIZE = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge().m7662getFontSizeXSAIIZE();
                composer.endReplaceGroup();
                break;
            default:
                composer.startReplaceGroup(-685177145);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM7662getFontSizeXSAIIZE;
    }

    public static final FontWeight toFontWeight(TextStyle textStyle) {
        Intrinsics.checkNotNullParameter(textStyle, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[textStyle.ordinal()]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
                return FontWeight.INSTANCE.getNormal();
            case 2:
            case 4:
            case 6:
                return FontWeight.INSTANCE.getBold();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

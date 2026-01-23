package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoButton.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\rX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u00020\rX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoButtonDefaults;", "", "<init>", "()V", "Shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getShape$lib_compose_bento_externalRelease", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding$lib_compose_bento_externalRelease", "()Landroidx/compose/foundation/layout/PaddingValues;", "MinHeight", "Landroidx/compose/ui/unit/Dp;", "F", "IconSpacing", "getIconSpacing-D9Ej5fM$lib_compose_bento_externalRelease", "()F", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM$lib_compose_bento_externalRelease", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "getTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/ButtonStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoButtonDefaults {
    public static final int $stable = 0;
    public static final float OutlinedBorderOpacity = 0.5f;
    public static final BentoButtonDefaults INSTANCE = new BentoButtonDefaults();
    private static final RoundedCornerShape Shape = RoundedCornerShape2.RoundedCornerShape(50);
    private static final PaddingValues ContentPadding = PaddingKt.m5136PaddingValuesYgX7TsA(C2002Dp.m7995constructorimpl(20), C2002Dp.m7995constructorimpl(10));
    private static final float MinHeight = C2002Dp.m7995constructorimpl(44);
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(8);
    private static final float OutlinedBorderSize = C2002Dp.m7995constructorimpl(1);

    private BentoButtonDefaults() {
    }

    public final RoundedCornerShape getShape$lib_compose_bento_externalRelease() {
        return Shape;
    }

    public final PaddingValues getContentPadding$lib_compose_bento_externalRelease() {
        return ContentPadding;
    }

    /* renamed from: getIconSpacing-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20579getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease() {
        return IconSpacing;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20580getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease() {
        return OutlinedBorderSize;
    }

    @JvmName
    private final TextStyle getTextStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1701134721, i, -1, "com.robinhood.compose.bento.component.BentoButtonDefaults.<get-textStyle> (BentoButton.kt:454)");
        }
        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer, 6).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyleM7655copyp1EtxEg$default;
    }

    @JvmName
    public final ButtonStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-21800138, i, -1, "com.robinhood.compose.bento.component.BentoButtonDefaults.<get-style> (BentoButton.kt:461)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        ButtonStyle.Colors colors = new ButtonStyle.Colors(new ButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null), new ButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), null), null);
        PaddingValues paddingValues = ContentPadding;
        float f = MinHeight;
        int i2 = i & 14;
        ButtonStyle.Style style = new ButtonStyle.Style(colors, paddingValues, f, getTextStyle(composer, i2), null);
        Color.Companion companion = Color.INSTANCE;
        ButtonStyle buttonStyle = new ButtonStyle(style, new ButtonStyle.Style(new ButtonStyle.Colors(new ButtonStyle.StateColor(companion.m6725getTransparent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), null), new ButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new ButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null)), paddingValues, f, getTextStyle(composer, i2), null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonStyle;
    }
}

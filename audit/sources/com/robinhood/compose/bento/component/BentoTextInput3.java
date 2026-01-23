package com.robinhood.compose.bento.component;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextInput.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextInputDefaults;", "", "<init>", "()V", "colors", "Lcom/robinhood/compose/bento/component/BentoTextInputColors;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextInputColors;", "ContainerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "ContainerBorderSize", "Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/TextInputStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextInputDefaults, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoTextInput3 {
    public static final BentoTextInput3 INSTANCE = new BentoTextInput3();
    private static final RoundedCornerShape ContainerShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4));
    private static final TextInputStyle.BorderSize ContainerBorderSize = new TextInputStyle.BorderSize(C2002Dp.m7995constructorimpl(1), C2002Dp.m7995constructorimpl(2), null);
    public static final int $stable = TextInputStyle.BorderSize.$stable;

    private BentoTextInput3() {
    }

    @Deprecated
    public final BentoTextInputColors colors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1311108291, i, -1, "com.robinhood.compose.bento.component.BentoTextInputDefaults.colors (BentoTextInput.kt:689)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        BentoTextInputColors bentoTextInputColors = new BentoTextInputColors(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoTextInputColors;
    }

    @JvmName
    public final TextInputStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-376205297, i, -1, "com.robinhood.compose.bento.component.BentoTextInputDefaults.<get-style> (BentoTextInput.kt:718)");
        }
        RoundedCornerShape roundedCornerShape = ContainerShape;
        TextInputStyle.BorderSize borderSize = ContainerBorderSize;
        TextInputStyle.Sizing sizing = new TextInputStyle.Sizing(roundedCornerShape, borderSize, C2002Dp.m7995constructorimpl(44), null);
        float f = 16;
        float f2 = 10;
        float f3 = 8;
        float f4 = 4;
        TextInputStyle.Spacing spacing = new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), null), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f3), null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        TextStyle textM = bentoTheme.getTypography(composer, 6).getTextM();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        TextInputStyle.Typography typography = new TextInputStyle.Typography(TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), bentoTheme.getTypography(composer, 6).getTextM());
        TextInputStyle.StateColor stateColor = new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        TextInputStyle.BorderColor borderColor = new TextInputStyle.BorderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        TextInputStyle.PlaceholderColor placeholderColor = new TextInputStyle.PlaceholderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        TextInputStyle.StateColor stateColor2 = new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        TextInputStyle.StateColor stateColor3 = new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), null);
        TextInputStyle.StateColor stateColor4 = new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null);
        Color.Companion companion2 = Color.INSTANCE;
        TextInputStyle.Colors colors = new TextInputStyle.Colors(stateColor, borderColor, placeholderColor, stateColor2, stateColor3, stateColor4, companion2.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        float f5 = 18;
        float f6 = 0;
        TextInputStyle textInputStyle = new TextInputStyle(new TextInputStyle.Style(sizing, spacing, typography, colors, companion3.getStart()), new TextInputStyle.Style(new TextInputStyle.Sizing(roundedCornerShape, borderSize, C2002Dp.m7995constructorimpl(56), null), new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f5), C2002Dp.m7995constructorimpl(f5), null), C2002Dp.m7995constructorimpl(14), C2002Dp.m7995constructorimpl(f6), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f3), null), new TextInputStyle.Typography(TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextL(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextL(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), bentoTheme.getTypography(composer, 6).getTextM()), new TextInputStyle.Colors(new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.BorderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.PlaceholderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), companion2.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), null), companion3.getCenterHorizontally()), new TextInputStyle.Style(new TextInputStyle.Sizing(roundedCornerShape, borderSize, C2002Dp.m7995constructorimpl(116), null), new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), null), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f6), C2002Dp.m7995constructorimpl(f4), C2002Dp.m7995constructorimpl(f3), null), new TextInputStyle.Typography(TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, 6).getTextM(), bentoTheme.getTypography(composer, 6).getTextM()), new TextInputStyle.Colors(new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.BorderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, 6).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.PlaceholderColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), companion2.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), null), companion3.getStart()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textInputStyle;
    }
}

package com.robinhood.compose.bento.component;

import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTextButton.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoTextButtonDefaults;", "", "<init>", "()V", "IconSpacing", "Landroidx/compose/ui/unit/Dp;", "getIconSpacing-D9Ej5fM$lib_compose_bento_externalRelease", "()F", "F", "ColorOpacity", "", ResourceTypes.COLOR, "Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", "getColor", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextButtonStyle$StateColor;", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/TextButtonStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextButtonStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.BentoTextButtonDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoTextButton {
    public static final int $stable = 0;
    private static final float ColorOpacity = 0.6f;
    public static final BentoTextButton INSTANCE = new BentoTextButton();
    private static final float IconSpacing = C2002Dp.m7995constructorimpl(8);

    private BentoTextButton() {
    }

    /* renamed from: getIconSpacing-D9Ej5fM$lib_compose_bento_externalRelease, reason: not valid java name */
    public final float m20712getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease() {
        return IconSpacing;
    }

    @JvmName
    private final TextButtonStyle.StateColor getColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1667406421, i, -1, "com.robinhood.compose.bento.component.BentoTextButtonDefaults.<get-color> (BentoTextButton.kt:150)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        TextButtonStyle.StateColor stateColor = new TextButtonStyle.StateColor(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), ColorOpacity, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateColor;
    }

    @JvmName
    public final TextButtonStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1835342679, i, -1, "com.robinhood.compose.bento.component.BentoTextButtonDefaults.<get-style> (BentoTextButton.kt:161)");
        }
        int i2 = i & 14;
        TextButtonStyle.StateColor color = getColor(composer, i2);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        TextStyle textM = bentoTheme.getTypography(composer, 6).getTextM();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        TextButtonStyle textButtonStyle = new TextButtonStyle(new TextButtonStyle.Style(color, TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null)), new TextButtonStyle.Style(getColor(composer, i2), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextS(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textButtonStyle;
    }
}

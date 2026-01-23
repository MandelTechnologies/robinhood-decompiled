package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoSpanButtonDefaults.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoSpanButtonDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoSpanButtonDefaults {
    public static final int $stable = 0;
    public static final BentoSpanButtonDefaults INSTANCE = new BentoSpanButtonDefaults();

    private BentoSpanButtonDefaults() {
    }

    @JvmName
    public final SpanButtonStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-966958106, i, -1, "com.robinhood.compose.bento.theme.BentoSpanButtonDefaults.<get-style> (BentoSpanButtonDefaults.kt:14)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        SpanButtonStyle.Colors colors = new SpanButtonStyle.Colors(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), null);
        Color.Companion companion = Color.INSTANCE;
        SpanButtonStyle spanButtonStyle = new SpanButtonStyle(colors, new SpanButtonStyle.Colors(companion.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), companion.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new SpanButtonStyle.Typography(bentoTheme.getTypography(composer, 6).getTextS()), bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21595getXsmallD9Ej5fM(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return spanButtonStyle;
    }
}

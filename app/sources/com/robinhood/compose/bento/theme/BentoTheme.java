package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoTheme.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoTheme;", "", "<init>", "()V", "colors", "Lcom/robinhood/compose/bento/theme/BentoColors;", "getColors", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/theme/BentoColors;", "spacing", "Lcom/robinhood/compose/bento/theme/BentoSpacing;", "getSpacing", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/theme/BentoSpacing;", "typography", "Lcom/robinhood/compose/bento/theme/BentoTypography;", "getTypography", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/theme/BentoTypography;", "styles", "Lcom/robinhood/compose/theme/Styles;", "getStyles", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/Styles;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoTheme {
    public static final int $stable = 0;
    public static final BentoTheme INSTANCE = new BentoTheme();

    private BentoTheme() {
    }

    @JvmName
    public final BentoColors getColors(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1219256641, i, -1, "com.robinhood.compose.bento.theme.BentoTheme.<get-colors> (BentoTheme.kt:46)");
        }
        BentoColors bentoColors = (BentoColors) composer.consume(BentoColors2.getLocalBentoColors());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoColors;
    }

    @JvmName
    public final BentoSpacing getSpacing(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(291517798, i, -1, "com.robinhood.compose.bento.theme.BentoTheme.<get-spacing> (BentoTheme.kt:53)");
        }
        BentoSpacing bentoSpacing = (BentoSpacing) composer.consume(BentoSpacing2.getLocalBentoSpacing());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoSpacing;
    }

    @JvmName
    public final BentoTypography getTypography(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1843502018, i, -1, "com.robinhood.compose.bento.theme.BentoTheme.<get-typography> (BentoTheme.kt:60)");
        }
        BentoTypography bentoTypography = (BentoTypography) composer.consume(BentoTypography2.getLocalBentoTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bentoTypography;
    }

    @JvmName
    public final Styles getStyles(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1035675401, i, -1, "com.robinhood.compose.bento.theme.BentoTheme.<get-styles> (BentoTheme.kt:67)");
        }
        Styles styles = (Styles) composer.consume(Styles2.getLocalStyles());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return styles;
    }
}

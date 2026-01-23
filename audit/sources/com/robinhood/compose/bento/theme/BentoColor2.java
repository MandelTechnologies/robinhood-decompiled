package com.robinhood.compose.bento.theme;

import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;

/* compiled from: BentoColor.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"contrastColor", "Landroidx/compose/ui/graphics/Color;", "light", "dark", "contrastColor-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)J", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.theme.BentoColorKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoColor2 {
    /* renamed from: contrastColor-RGew2ao, reason: not valid java name */
    public static final long m21356contrastColorRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1512387932);
        if ((i2 & 1) != 0) {
            j2 = BentoTheme.INSTANCE.getColors(composer, 6).getNova();
        }
        if ((i2 & 2) != 0) {
            j3 = BentoTheme.INSTANCE.getColors(composer, 6).getJet();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1512387932, i, -1, "com.robinhood.compose.bento.theme.contrastColor (BentoColor.kt:317)");
        }
        if (Color2.m6734luminance8_81llA(j) > 0.5d) {
            j2 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j2;
    }
}

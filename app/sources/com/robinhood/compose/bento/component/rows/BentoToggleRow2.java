package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoToggleRow.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoToggleRowDefaults;", "", "<init>", "()V", "DisabledTrackOpacity", "", "DisabledThumbOpacity", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoToggleRowDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoToggleRow2 {
    public static final int $stable = 0;
    private static final float DisabledThumbOpacity = 0.38f;
    private static final float DisabledTrackOpacity = 0.12f;
    public static final BentoToggleRow2 INSTANCE = new BentoToggleRow2();

    private BentoToggleRow2() {
    }

    @JvmName
    public final ToggleRowStyle getStyle(Composer composer, int i) {
        long nova;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1894035151, i, -1, "com.robinhood.compose.bento.component.rows.BentoToggleRowDefaults.<get-style> (BentoToggleRow.kt:438)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        if (Color2.m6734luminance8_81llA(bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU()) > 0.5f) {
            composer.startReplaceGroup(-2079016834);
            nova = bentoTheme.getColors(composer, 6).getJet();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2078958275);
            nova = bentoTheme.getColors(composer, 6).getNova();
            composer.endReplaceGroup();
        }
        long j = nova;
        long jM21372getBg20d7_KjU = bentoTheme.getColors(composer, 6).m21372getBg20d7_KjU();
        long jM21427getFg30d7_KjU = bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU();
        long jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU();
        ToggleRowStyle toggleRowStyle = new ToggleRowStyle(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, 6).m21368getAccent0d7_KjU(), j, jM21427getFg30d7_KjU, jM21372getBg20d7_KjU, jM21427getFg30d7_KjU2, Color.m6705copywmQWz5c$default(j, DisabledThumbOpacity, 0.0f, 0.0f, 0.0f, 14, null), jM21372getBg20d7_KjU, Color.m6705copywmQWz5c$default(jM21427getFg30d7_KjU, DisabledThumbOpacity, 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(jM21372getBg20d7_KjU, 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m6705copywmQWz5c$default(jM21427getFg30d7_KjU2, DisabledThumbOpacity, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleRowStyle;
    }
}

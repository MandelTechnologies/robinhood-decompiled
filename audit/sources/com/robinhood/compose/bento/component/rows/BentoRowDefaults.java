package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/RowStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RowStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoRowDefaults {
    public static final int $stable = 0;
    public static final BentoRowDefaults INSTANCE = new BentoRowDefaults();

    private BentoRowDefaults() {
    }

    @JvmName
    public final RowStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1712299508, i, -1, "com.robinhood.compose.bento.component.rows.BentoRowDefaults.<get-style> (BentoBaseRow.kt:1043)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        RowStyle rowStyle = new RowStyle(new RowStyle.Colors(bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), Color.m6701boximpl(bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU()), bentoTheme.getColors(composer, 6).m21427getFg30d7_KjU(), null), new RowStyle.Typography(bentoTheme.getTypography(composer, 6).getTextM(), bentoTheme.getTypography(composer, 6).getTextS(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, 6).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rowStyle;
    }
}

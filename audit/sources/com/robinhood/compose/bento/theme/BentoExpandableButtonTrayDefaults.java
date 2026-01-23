package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoExpandableButtonTrayDefaults.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoExpandableButtonTrayDefaults;", "", "<init>", "()V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class BentoExpandableButtonTrayDefaults {
    public static final int $stable = 0;
    public static final BentoExpandableButtonTrayDefaults INSTANCE = new BentoExpandableButtonTrayDefaults();

    private BentoExpandableButtonTrayDefaults() {
    }

    @JvmName
    public final ExpandableButtonTrayStyle getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-495732570, i, -1, "com.robinhood.compose.bento.theme.BentoExpandableButtonTrayDefaults.<get-style> (BentoExpandableButtonTrayDefaults.kt:10)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        ExpandableButtonTrayStyle expandableButtonTrayStyle = new ExpandableButtonTrayStyle(new ExpandableButtonTrayStyle.Colors(bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), null), new ExpandableButtonTrayStyle.Spacing(bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), null), new ExpandableButtonTrayStyle.Typography(bentoTheme.getTypography(composer, 6).getTextS(), bentoTheme.getTypography(composer, 6).getTextM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return expandableButtonTrayStyle;
    }
}

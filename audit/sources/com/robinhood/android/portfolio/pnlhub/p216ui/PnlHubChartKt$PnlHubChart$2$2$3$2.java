package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PnlHubChart.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
final class PnlHubChartKt$PnlHubChart$2$2$3$2 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onChartHeaderSecondaryTextTrailingIconClick;

    PnlHubChartKt$PnlHubChart$2$2$3$2(Function0<Unit> function0) {
        this.$onChartHeaderSecondaryTextTrailingIconClick = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 SduiCursorDataHeader, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SduiCursorDataHeader, "$this$SduiCursorDataHeader");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(822159271, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.PnlHubChart.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PnlHubChart.kt:157)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16), null, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), ClickableKt.m4893clickableXHw0xAI$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, this.$onChartHeaderSecondaryTextTrailingIconClick, 7, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

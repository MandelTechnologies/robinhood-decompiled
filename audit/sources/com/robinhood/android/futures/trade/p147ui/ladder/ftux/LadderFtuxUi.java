package com.robinhood.android.futures.trade.p147ui.ladder.ftux;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LadderFtuxUi.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.ftux.ComposableSingletons$LadderFtuxUiKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderFtuxUi {
    public static final LadderFtuxUi INSTANCE = new LadderFtuxUi();
    private static Function2<Composer, Integer, Unit> lambda$1022004285 = ComposableLambda3.composableLambdaInstance(1022004285, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ftux.ComposableSingletons$LadderFtuxUiKt$lambda$1022004285$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1022004285, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ftux.ComposableSingletons$LadderFtuxUiKt.lambda$1022004285.<anonymous> (LadderFtuxUi.kt:106)");
            }
            IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer, 0), (Modifier) null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1022004285$feature_futures_trade_externalDebug() {
        return lambda$1022004285;
    }
}

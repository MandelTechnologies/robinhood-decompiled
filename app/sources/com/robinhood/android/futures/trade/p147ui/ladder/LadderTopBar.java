package com.robinhood.android.futures.trade.p147ui.ladder;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LadderTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LadderTopBar {
    public static final LadderTopBar INSTANCE = new LadderTopBar();
    private static Function2<Composer, Integer, Unit> lambda$1802874608 = ComposableLambda3.composableLambdaInstance(1802874608, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt$lambda$1802874608$1
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
                ComposerKt.traceEventStart(1802874608, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt.lambda$1802874608.<anonymous> (LadderTopBar.kt:177)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_flatten_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-280057138, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9008lambda$280057138 = ComposableLambda3.composableLambdaInstance(-280057138, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt$lambda$-280057138$1
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
                ComposerKt.traceEventStart(-280057138, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt.lambda$-280057138.<anonymous> (LadderTopBar.kt:186)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_flatten_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1211588395 = ComposableLambda3.composableLambdaInstance(1211588395, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt$lambda$1211588395$1
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
                ComposerKt.traceEventStart(1211588395, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt.lambda$1211588395.<anonymous> (LadderTopBar.kt:245)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_ftux_tooltip, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1647013818, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9007lambda$1647013818 = ComposableLambda3.composableLambdaInstance(-1647013818, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt$lambda$-1647013818$1
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
                ComposerKt.traceEventStart(-1647013818, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt.lambda$-1647013818.<anonymous> (LadderTopBar.kt:396)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C17462R.string.futures_pnl_price_switcher_tooltip_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-849847000, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9009lambda$849847000 = ComposableLambda3.composableLambdaInstance(-849847000, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt$lambda$-849847000$1
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
                ComposerKt.traceEventStart(-849847000, i, -1, "com.robinhood.android.futures.trade.ui.ladder.ComposableSingletons$LadderTopBarKt.lambda$-849847000.<anonymous> (LadderTopBar.kt:405)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17462R.string.futures_pnl_price_switcher_tooltip_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1647013818$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14769getLambda$1647013818$feature_futures_trade_externalDebug() {
        return f9007lambda$1647013818;
    }

    /* renamed from: getLambda$-280057138$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14770getLambda$280057138$feature_futures_trade_externalDebug() {
        return f9008lambda$280057138;
    }

    /* renamed from: getLambda$-849847000$feature_futures_trade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14771getLambda$849847000$feature_futures_trade_externalDebug() {
        return f9009lambda$849847000;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1211588395$feature_futures_trade_externalDebug() {
        return lambda$1211588395;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1802874608$feature_futures_trade_externalDebug() {
        return lambda$1802874608;
    }
}

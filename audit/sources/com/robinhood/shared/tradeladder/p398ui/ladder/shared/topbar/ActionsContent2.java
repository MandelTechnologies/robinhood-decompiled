package com.robinhood.shared.tradeladder.p398ui.ladder.shared.topbar;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.C40888R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ActionsContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ActionsContent2 {
    public static final ActionsContent2 INSTANCE = new ActionsContent2();

    /* renamed from: lambda$-1422770365, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9528lambda$1422770365 = ComposableLambda3.composableLambdaInstance(-1422770365, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$-1422770365$1
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
                ComposerKt.traceEventStart(-1422770365, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt.lambda$-1422770365.<anonymous> (ActionsContent.kt:73)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C40888R.string.flatten_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1099628956 = ComposableLambda3.composableLambdaInstance(1099628956, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$1099628956$1
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
                ComposerKt.traceEventStart(1099628956, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt.lambda$1099628956.<anonymous> (ActionsContent.kt:86)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_flatten_unavailable, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1370133491 = ComposableLambda3.composableLambdaInstance(1370133491, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt$lambda$1370133491$1
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
                ComposerKt.traceEventStart(1370133491, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$ActionsContentKt.lambda$1370133491.<anonymous> (ActionsContent.kt:136)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C40888R.string.ladder_ftux_tooltip, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-949283665, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9530lambda$949283665 = ComposableLambda3.composableLambdaInstance(-949283665, false, ActionsContent5.INSTANCE);

    /* renamed from: lambda$-1655571281, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9529lambda$1655571281 = ComposableLambda3.composableLambdaInstance(-1655571281, false, ActionsContent4.INSTANCE);

    /* renamed from: getLambda$-1422770365$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26286getLambda$1422770365$lib_trade_ladder_externalDebug() {
        return f9528lambda$1422770365;
    }

    /* renamed from: getLambda$-1655571281$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26287getLambda$1655571281$lib_trade_ladder_externalDebug() {
        return f9529lambda$1655571281;
    }

    /* renamed from: getLambda$-949283665$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26288getLambda$949283665$lib_trade_ladder_externalDebug() {
        return f9530lambda$949283665;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1099628956$lib_trade_ladder_externalDebug() {
        return lambda$1099628956;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1370133491$lib_trade_ladder_externalDebug() {
        return lambda$1370133491;
    }
}

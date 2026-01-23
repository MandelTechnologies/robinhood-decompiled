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

/* compiled from: DetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$DetailContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class DetailContent2 {
    public static final DetailContent2 INSTANCE = new DetailContent2();

    /* renamed from: lambda$-810101750, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9531lambda$810101750 = ComposableLambda3.composableLambdaInstance(-810101750, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$DetailContentKt$lambda$-810101750$1
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
                ComposerKt.traceEventStart(-810101750, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$DetailContentKt.lambda$-810101750.<anonymous> (DetailContent.kt:189)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C40888R.string.pnl_price_switcher_tooltip_label, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, null, Color.m6701boximpl(bentoTheme.getColors(composer, i2).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$897489132 = ComposableLambda3.composableLambdaInstance(897489132, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$DetailContentKt$lambda$897489132$1
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
                ComposerKt.traceEventStart(897489132, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.topbar.ComposableSingletons$DetailContentKt.lambda$897489132.<anonymous> (DetailContent.kt:198)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.pnl_price_switcher_tooltip_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextS(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-810101750$lib_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m26292getLambda$810101750$lib_trade_ladder_externalDebug() {
        return f9531lambda$810101750;
    }

    public final Function2<Composer, Integer, Unit> getLambda$897489132$lib_trade_ladder_externalDebug() {
        return lambda$897489132;
    }
}

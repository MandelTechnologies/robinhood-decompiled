package com.robinhood.android.optionschain.sbschain.appbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionSideBySideChainTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.appbar.ComposableSingletons$OptionSideBySideChainTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainTopAppBar {
    public static final OptionSideBySideChainTopAppBar INSTANCE = new OptionSideBySideChainTopAppBar();

    /* renamed from: lambda$-109470276, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9156lambda$109470276 = ComposableLambda3.composableLambdaInstance(-109470276, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.ComposableSingletons$OptionSideBySideChainTopAppBarKt$lambda$-109470276$1
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
                ComposerKt.traceEventStart(-109470276, i, -1, "com.robinhood.android.optionschain.sbschain.appbar.ComposableSingletons$OptionSideBySideChainTopAppBarKt.lambda$-109470276.<anonymous> (OptionSideBySideChainTopAppBar.kt:117)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_side_by_side_chain_nux_switch_to_classic_chain_tooltip, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$81739635 = ComposableLambda3.composableLambdaInstance(81739635, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.sbschain.appbar.ComposableSingletons$OptionSideBySideChainTopAppBarKt$lambda$81739635$1
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
                ComposerKt.traceEventStart(81739635, i, -1, "com.robinhood.android.optionschain.sbschain.appbar.ComposableSingletons$OptionSideBySideChainTopAppBarKt.lambda$81739635.<anonymous> (OptionSideBySideChainTopAppBar.kt:132)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.option_chain_simulated_return_pre_trade_tooltip_nux_switch_chart, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-109470276$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17234getLambda$109470276$feature_options_chain_externalDebug() {
        return f9156lambda$109470276;
    }

    public final Function2<Composer, Integer, Unit> getLambda$81739635$feature_options_chain_externalDebug() {
        return lambda$81739635;
    }
}

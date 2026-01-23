package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionschain.C24135R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionChainSettingsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsFragment2 {
    public static final OptionChainSettingsFragment2 INSTANCE = new OptionChainSettingsFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1661033843 = ComposableLambda3.composableLambdaInstance(1661033843, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsFragmentKt$lambda$1661033843$1
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
                ComposerKt.traceEventStart(1661033843, i, -1, "com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsFragmentKt.lambda$1661033843.<anonymous> (OptionChainSettingsFragment.kt:49)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C24135R.string.options_chain_settings_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1661033843$feature_options_chain_externalDebug() {
        return lambda$1661033843;
    }
}

package com.robinhood.android.optionsupgrade.p210uk;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UkProfessionalTraderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkProfessionalTraderFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class UkProfessionalTraderFragment2 {
    public static final UkProfessionalTraderFragment2 INSTANCE = new UkProfessionalTraderFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1082095897 = ComposableLambda3.composableLambdaInstance(1082095897, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkProfessionalTraderFragmentKt$lambda$1082095897$1
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
                ComposerKt.traceEventStart(1082095897, i, -1, "com.robinhood.android.optionsupgrade.uk.ComposableSingletons$UkProfessionalTraderFragmentKt.lambda$1082095897.<anonymous> (UkProfessionalTraderFragment.kt:75)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25121R.string.option_upgrade_toolbar_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1082095897$feature_options_upgrade_externalDebug() {
        return lambda$1082095897;
    }
}

package com.robinhood.android.optionsupgrade.rhsg;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhsgProfessionalTraderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgProfessionalTraderFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RhsgProfessionalTraderFragment2 {
    public static final RhsgProfessionalTraderFragment2 INSTANCE = new RhsgProfessionalTraderFragment2();
    private static Function2<Composer, Integer, Unit> lambda$295661501 = ComposableLambda3.composableLambdaInstance(295661501, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgProfessionalTraderFragmentKt$lambda$295661501$1
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
                ComposerKt.traceEventStart(295661501, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgProfessionalTraderFragmentKt.lambda$295661501.<anonymous> (RhsgProfessionalTraderFragment.kt:61)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$295661501$feature_options_upgrade_externalDebug() {
        return lambda$295661501;
    }
}

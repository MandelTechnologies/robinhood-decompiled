package com.robinhood.android.optionsupgrade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionProfessionalTraderComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionProfessionalTraderComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionProfessionalTraderComposable {
    public static final OptionProfessionalTraderComposable INSTANCE = new OptionProfessionalTraderComposable();

    /* renamed from: lambda$-51138118, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9162lambda$51138118 = ComposableLambda3.composableLambdaInstance(-51138118, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.ComposableSingletons$OptionProfessionalTraderComposableKt$lambda$-51138118$1
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
                ComposerKt.traceEventStart(-51138118, i, -1, "com.robinhood.android.optionsupgrade.ComposableSingletons$OptionProfessionalTraderComposableKt.lambda$-51138118.<anonymous> (OptionProfessionalTraderComposable.kt:39)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-51138118$feature_options_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17390getLambda$51138118$feature_options_upgrade_externalDebug() {
        return f9162lambda$51138118;
    }
}

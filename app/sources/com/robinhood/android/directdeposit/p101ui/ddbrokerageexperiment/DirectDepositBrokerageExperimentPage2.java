package com.robinhood.android.directdeposit.p101ui.ddbrokerageexperiment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DirectDepositBrokerageExperimentPage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.ComposableSingletons$DirectDepositBrokerageExperimentPageKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DirectDepositBrokerageExperimentPage2 {
    public static final DirectDepositBrokerageExperimentPage2 INSTANCE = new DirectDepositBrokerageExperimentPage2();

    /* renamed from: lambda$-80229603, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8872lambda$80229603 = ComposableLambda3.composableLambdaInstance(-80229603, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.ComposableSingletons$DirectDepositBrokerageExperimentPageKt$lambda$-80229603$1
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
                ComposerKt.traceEventStart(-80229603, i, -1, "com.robinhood.android.directdeposit.ui.ddbrokerageexperiment.ComposableSingletons$DirectDepositBrokerageExperimentPageKt.lambda$-80229603.<anonymous> (DirectDepositBrokerageExperimentPage.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-80229603$feature_direct_deposit_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13307getLambda$80229603$feature_direct_deposit_externalDebug() {
        return f8872lambda$80229603;
    }
}

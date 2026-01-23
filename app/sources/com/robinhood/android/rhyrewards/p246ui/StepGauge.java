package com.robinhood.android.rhyrewards.p246ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: StepGauge.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyrewards.ui.ComposableSingletons$StepGaugeKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class StepGauge {
    public static final StepGauge INSTANCE = new StepGauge();

    /* renamed from: lambda$-962295008, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9232lambda$962295008 = ComposableLambda3.composableLambdaInstance(-962295008, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.ComposableSingletons$StepGaugeKt$lambda$-962295008$1
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
                ComposerKt.traceEventStart(-962295008, i, -1, "com.robinhood.android.rhyrewards.ui.ComposableSingletons$StepGaugeKt.lambda$-962295008.<anonymous> (StepGauge.kt:337)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-962295008$feature_lib_rhy_rewards_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18408getLambda$962295008$feature_lib_rhy_rewards_externalRelease() {
        return f9232lambda$962295008;
    }
}

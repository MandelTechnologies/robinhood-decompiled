package com.robinhood.android.rhyonboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyLearnMoreFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhyonboarding.ComposableSingletons$RhyLearnMoreFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyLearnMoreFragment2 {
    public static final RhyLearnMoreFragment2 INSTANCE = new RhyLearnMoreFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1587591952 = ComposableLambda3.composableLambdaInstance(1587591952, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyonboarding.ComposableSingletons$RhyLearnMoreFragmentKt$lambda$1587591952$1
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
                ComposerKt.traceEventStart(1587591952, i, -1, "com.robinhood.android.rhyonboarding.ComposableSingletons$RhyLearnMoreFragmentKt.lambda$1587591952.<anonymous> (RhyLearnMoreFragment.kt:110)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1587591952$feature_rhy_onboarding_externalDebug() {
        return lambda$1587591952;
    }
}

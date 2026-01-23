package com.robinhood.android.onboarding.drip.p204ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DripOnboardingActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.drip.ui.ComposableSingletons$DripOnboardingActivityKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DripOnboardingActivity2 {
    public static final DripOnboardingActivity2 INSTANCE = new DripOnboardingActivity2();

    /* renamed from: lambda$-1469433426, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9124lambda$1469433426 = ComposableLambda3.composableLambdaInstance(-1469433426, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.drip.ui.ComposableSingletons$DripOnboardingActivityKt$lambda$-1469433426$1
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
                ComposerKt.traceEventStart(-1469433426, i, -1, "com.robinhood.android.onboarding.drip.ui.ComposableSingletons$DripOnboardingActivityKt.lambda$-1469433426.<anonymous> (DripOnboardingActivity.kt:51)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 1, composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1469433426$feature_drip_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16826getLambda$1469433426$feature_drip_onboarding_externalDebug() {
        return f9124lambda$1469433426;
    }
}

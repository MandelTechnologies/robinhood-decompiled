package com.robinhood.android.futures.onboarding.p145ui.arbitration;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOnboardingArbitrationAgreementScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingArbitrationAgreementScreen {
    public static final FuturesOnboardingArbitrationAgreementScreen INSTANCE = new FuturesOnboardingArbitrationAgreementScreen();

    /* renamed from: lambda$-870957668, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8989lambda$870957668 = ComposableLambda3.composableLambdaInstance(-870957668, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementScreenKt$lambda$-870957668$1
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
                ComposerKt.traceEventStart(-870957668, i, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementScreenKt.lambda$-870957668.<anonymous> (FuturesOnboardingArbitrationAgreementScreen.kt:100)");
            }
            FuturesOnboardingArbitrationAgreementScreen3.LoadingArbitrationAgreement(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-870957668$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14690getLambda$870957668$feature_futures_onboarding_externalDebug() {
        return f8989lambda$870957668;
    }
}

package com.robinhood.android.futures.onboarding.p145ui.agreement;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.onboarding.C17293R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: FuturesOnboardingAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.agreement.ComposableSingletons$FuturesOnboardingAgreementFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingAgreementFragment2 {
    public static final FuturesOnboardingAgreementFragment2 INSTANCE = new FuturesOnboardingAgreementFragment2();

    /* renamed from: lambda$-1632260272, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8985lambda$1632260272 = ComposableLambda3.composableLambdaInstance(-1632260272, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.agreement.ComposableSingletons$FuturesOnboardingAgreementFragmentKt$lambda$-1632260272$1
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
                ComposerKt.traceEventStart(-1632260272, i, -1, "com.robinhood.android.futures.onboarding.ui.agreement.ComposableSingletons$FuturesOnboardingAgreementFragmentKt.lambda$-1632260272.<anonymous> (FuturesOnboardingAgreementFragment.kt:49)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17293R.string.futures_agreement_page_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$1211042428 = ComposableLambda3.composableLambdaInstance(1211042428, false, FuturesOnboardingAgreementFragment4.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$155557277 = ComposableLambda3.composableLambdaInstance(155557277, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.agreement.ComposableSingletons$FuturesOnboardingAgreementFragmentKt$lambda$155557277$1
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
                ComposerKt.traceEventStart(155557277, i, -1, "com.robinhood.android.futures.onboarding.ui.agreement.ComposableSingletons$FuturesOnboardingAgreementFragmentKt.lambda$155557277.<anonymous> (FuturesOnboardingAgreementFragment.kt:47)");
            }
            FuturesOnboardingAgreementFragment2 futuresOnboardingAgreementFragment2 = FuturesOnboardingAgreementFragment2.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(futuresOnboardingAgreementFragment2.m14672getLambda$1632260272$feature_futures_onboarding_externalDebug(), null, futuresOnboardingAgreementFragment2.getLambda$1211042428$feature_futures_onboarding_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1632260272$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14672getLambda$1632260272$feature_futures_onboarding_externalDebug() {
        return f8985lambda$1632260272;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$1211042428$feature_futures_onboarding_externalDebug() {
        return lambda$1211042428;
    }

    public final Function2<Composer, Integer, Unit> getLambda$155557277$feature_futures_onboarding_externalDebug() {
        return lambda$155557277;
    }
}

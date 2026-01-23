package com.robinhood.android.futures.onboarding.p145ui.arbitration;

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

/* compiled from: FuturesOnboardingArbitrationAgreementFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingArbitrationAgreementFragment2 {
    public static final FuturesOnboardingArbitrationAgreementFragment2 INSTANCE = new FuturesOnboardingArbitrationAgreementFragment2();

    /* renamed from: lambda$-1380083767, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8986lambda$1380083767 = ComposableLambda3.composableLambdaInstance(-1380083767, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementFragmentKt$lambda$-1380083767$1
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
                ComposerKt.traceEventStart(-1380083767, i, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementFragmentKt.lambda$-1380083767.<anonymous> (FuturesOnboardingArbitrationAgreementFragment.kt:49)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C17293R.string.futures_arbitration_page_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextL(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1612501259, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f8987lambda$1612501259 = ComposableLambda3.composableLambdaInstance(-1612501259, false, FuturesOnboardingArbitrationAgreementFragment4.INSTANCE);

    /* renamed from: lambda$-982864106, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8988lambda$982864106 = ComposableLambda3.composableLambdaInstance(-982864106, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementFragmentKt$lambda$-982864106$1
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
                ComposerKt.traceEventStart(-982864106, i, -1, "com.robinhood.android.futures.onboarding.ui.arbitration.ComposableSingletons$FuturesOnboardingArbitrationAgreementFragmentKt.lambda$-982864106.<anonymous> (FuturesOnboardingArbitrationAgreementFragment.kt:47)");
            }
            FuturesOnboardingArbitrationAgreementFragment2 futuresOnboardingArbitrationAgreementFragment2 = FuturesOnboardingArbitrationAgreementFragment2.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(futuresOnboardingArbitrationAgreementFragment2.m14687getLambda$1380083767$feature_futures_onboarding_externalDebug(), null, futuresOnboardingArbitrationAgreementFragment2.m14688getLambda$1612501259$feature_futures_onboarding_externalDebug(), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1380083767$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14687getLambda$1380083767$feature_futures_onboarding_externalDebug() {
        return f8986lambda$1380083767;
    }

    /* renamed from: getLambda$-1612501259$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m14688getLambda$1612501259$feature_futures_onboarding_externalDebug() {
        return f8987lambda$1612501259;
    }

    /* renamed from: getLambda$-982864106$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14689getLambda$982864106$feature_futures_onboarding_externalDebug() {
        return f8988lambda$982864106;
    }
}

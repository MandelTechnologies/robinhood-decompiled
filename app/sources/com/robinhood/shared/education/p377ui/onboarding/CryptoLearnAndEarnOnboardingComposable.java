package com.robinhood.shared.education.p377ui.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoLearnAndEarnOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.onboarding.ComposableSingletons$CryptoLearnAndEarnOnboardingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoLearnAndEarnOnboardingComposable {
    public static final CryptoLearnAndEarnOnboardingComposable INSTANCE = new CryptoLearnAndEarnOnboardingComposable();

    /* renamed from: lambda$-434461835, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9454lambda$434461835 = ComposableLambda3.composableLambdaInstance(-434461835, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.onboarding.ComposableSingletons$CryptoLearnAndEarnOnboardingComposableKt$lambda$-434461835$1
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
                ComposerKt.traceEventStart(-434461835, i, -1, "com.robinhood.shared.education.ui.onboarding.ComposableSingletons$CryptoLearnAndEarnOnboardingComposableKt.lambda$-434461835.<anonymous> (CryptoLearnAndEarnOnboardingComposable.kt:59)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1463181919, reason: not valid java name */
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> f9453lambda$1463181919 = ComposableLambda3.composableLambdaInstance(-1463181919, false, CryptoLearnAndEarnOnboardingComposable2.INSTANCE);

    /* renamed from: lambda$-440575998, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9455lambda$440575998 = ComposableLambda3.composableLambdaInstance(-440575998, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.education.ui.onboarding.ComposableSingletons$CryptoLearnAndEarnOnboardingComposableKt$lambda$-440575998$1
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
                ComposerKt.traceEventStart(-440575998, i, -1, "com.robinhood.shared.education.ui.onboarding.ComposableSingletons$CryptoLearnAndEarnOnboardingComposableKt.lambda$-440575998.<anonymous> (CryptoLearnAndEarnOnboardingComposable.kt:54)");
            }
            CryptoLearnAndEarnOnboardingComposable cryptoLearnAndEarnOnboardingComposable = CryptoLearnAndEarnOnboardingComposable.INSTANCE;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(cryptoLearnAndEarnOnboardingComposable.m25403getLambda$434461835$feature_education_externalDebug(), null, cryptoLearnAndEarnOnboardingComposable.m25402getLambda$1463181919$feature_education_externalDebug(), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2010);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1463181919$feature_education_externalDebug, reason: not valid java name */
    public final Function3<BentoAppBarScope, Composer, Integer, Unit> m25402getLambda$1463181919$feature_education_externalDebug() {
        return f9453lambda$1463181919;
    }

    /* renamed from: getLambda$-434461835$feature_education_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25403getLambda$434461835$feature_education_externalDebug() {
        return f9454lambda$434461835;
    }

    /* renamed from: getLambda$-440575998$feature_education_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m25404getLambda$440575998$feature_education_externalDebug() {
        return f9455lambda$440575998;
    }
}

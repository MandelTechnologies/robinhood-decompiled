package com.robinhood.shared.crypto.staking.staking.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.models.crypto.p314db.staking.StakingConfig_OnboardingPageMock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CryptoStakingOnboardingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoStakingOnboardingComposable {
    public static final CryptoStakingOnboardingComposable INSTANCE = new CryptoStakingOnboardingComposable();
    private static Function2<Composer, Integer, Unit> lambda$1943167867 = ComposableLambda3.composableLambdaInstance(1943167867, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt$lambda$1943167867$1
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
                ComposerKt.traceEventStart(1943167867, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt.lambda$1943167867.<anonymous> (CryptoStakingOnboardingComposable.kt:114)");
            }
            CryptoStakingOnboardingComposable7.TopBar(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-461985655, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9413lambda$461985655 = ComposableLambda3.composableLambdaInstance(-461985655, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt$lambda$-461985655$1
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
                ComposerKt.traceEventStart(-461985655, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt.lambda$-461985655.<anonymous> (CryptoStakingOnboardingComposable.kt:140)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$759777125 = ComposableLambda3.composableLambdaInstance(759777125, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt$lambda$759777125$1
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
                ComposerKt.traceEventStart(759777125, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt.lambda$759777125.<anonymous> (CryptoStakingOnboardingComposable.kt:186)");
            }
            CryptoStakingOnboardingComposable7.MainContent(StakingConfig_OnboardingPageMock.INSTANCE.generate(), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-672688111, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9414lambda$672688111 = ComposableLambda3.composableLambdaInstance(-672688111, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt$lambda$-672688111$1
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
                ComposerKt.traceEventStart(-672688111, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt.lambda$-672688111.<anonymous> (CryptoStakingOnboardingComposable.kt:197)");
            }
            CryptoStakingOnboardingComposable7.LoadingReviewContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$903894225 = ComposableLambda3.composableLambdaInstance(903894225, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt$lambda$903894225$1
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
                ComposerKt.traceEventStart(903894225, i, -1, "com.robinhood.shared.crypto.staking.staking.onboarding.ComposableSingletons$CryptoStakingOnboardingComposableKt.lambda$903894225.<anonymous> (CryptoStakingOnboardingComposable.kt:196)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.INSTANCE), CryptoStakingOnboardingComposable.INSTANCE.m24958getLambda$672688111$feature_crypto_staking_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-461985655$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24957getLambda$461985655$feature_crypto_staking_externalDebug() {
        return f9413lambda$461985655;
    }

    /* renamed from: getLambda$-672688111$feature_crypto_staking_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24958getLambda$672688111$feature_crypto_staking_externalDebug() {
        return f9414lambda$672688111;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1943167867$feature_crypto_staking_externalDebug() {
        return lambda$1943167867;
    }

    public final Function2<Composer, Integer, Unit> getLambda$759777125$feature_crypto_staking_externalDebug() {
        return lambda$759777125;
    }

    public final Function2<Composer, Integer, Unit> getLambda$903894225$feature_crypto_staking_externalDebug() {
        return lambda$903894225;
    }
}

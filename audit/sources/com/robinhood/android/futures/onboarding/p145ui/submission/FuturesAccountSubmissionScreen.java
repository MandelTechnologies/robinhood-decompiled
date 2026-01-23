package com.robinhood.android.futures.onboarding.p145ui.submission;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountSubmissionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.submission.ComposableSingletons$FuturesAccountSubmissionScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAccountSubmissionScreen {
    public static final FuturesAccountSubmissionScreen INSTANCE = new FuturesAccountSubmissionScreen();

    /* renamed from: lambda$-674630746, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8993lambda$674630746 = ComposableLambda3.composableLambdaInstance(-674630746, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.submission.ComposableSingletons$FuturesAccountSubmissionScreenKt$lambda$-674630746$1
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
                ComposerKt.traceEventStart(-674630746, i, -1, "com.robinhood.android.futures.onboarding.ui.submission.ComposableSingletons$FuturesAccountSubmissionScreenKt.lambda$-674630746.<anonymous> (FuturesAccountSubmissionScreen.kt:42)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1170555526, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8992lambda$1170555526 = ComposableLambda3.composableLambdaInstance(-1170555526, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.submission.ComposableSingletons$FuturesAccountSubmissionScreenKt$lambda$-1170555526$1
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
                ComposerKt.traceEventStart(-1170555526, i, -1, "com.robinhood.android.futures.onboarding.ui.submission.ComposableSingletons$FuturesAccountSubmissionScreenKt.lambda$-1170555526.<anonymous> (FuturesAccountSubmissionScreen.kt:96)");
            }
            FuturesAccountSubmissionScreen4.Loading(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1170555526$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14711getLambda$1170555526$feature_futures_onboarding_externalDebug() {
        return f8992lambda$1170555526;
    }

    /* renamed from: getLambda$-674630746$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14712getLambda$674630746$feature_futures_onboarding_externalDebug() {
        return f8993lambda$674630746;
    }
}

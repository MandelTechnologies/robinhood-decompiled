package com.robinhood.android.futures.onboarding.p145ui.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesAccountResultFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$FuturesAccountResultFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesAccountResultFragment2 {
    public static final FuturesAccountResultFragment2 INSTANCE = new FuturesAccountResultFragment2();

    /* renamed from: lambda$-814475530, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8990lambda$814475530 = ComposableLambda3.composableLambdaInstance(-814475530, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$FuturesAccountResultFragmentKt$lambda$-814475530$1
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
                ComposerKt.traceEventStart(-814475530, i, -1, "com.robinhood.android.futures.onboarding.ui.result.ComposableSingletons$FuturesAccountResultFragmentKt.lambda$-814475530.<anonymous> (FuturesAccountResultFragment.kt:96)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-814475530$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14706getLambda$814475530$feature_futures_onboarding_externalDebug() {
        return f8990lambda$814475530;
    }
}

package com.robinhood.android.retirement.partnerships.matchhub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RetirementMatchHubScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.partnerships.matchhub.ComposableSingletons$RetirementMatchHubScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementMatchHubScreen {
    public static final RetirementMatchHubScreen INSTANCE = new RetirementMatchHubScreen();

    /* renamed from: lambda$-30555719, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9219lambda$30555719 = ComposableLambda3.composableLambdaInstance(-30555719, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.partnerships.matchhub.ComposableSingletons$RetirementMatchHubScreenKt$lambda$-30555719$1
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
                ComposerKt.traceEventStart(-30555719, i, -1, "com.robinhood.android.retirement.partnerships.matchhub.ComposableSingletons$RetirementMatchHubScreenKt.lambda$-30555719.<anonymous> (RetirementMatchHubScreen.kt:65)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-30555719$feature_retirement_partnerships_externalDebug */
    public final Function2<Composer, Integer, Unit> m2437xab38d59e() {
        return f9219lambda$30555719;
    }
}

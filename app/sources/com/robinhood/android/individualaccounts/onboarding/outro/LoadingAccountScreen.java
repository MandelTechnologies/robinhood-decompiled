package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LoadingAccountScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$LoadingAccountScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LoadingAccountScreen {
    public static final LoadingAccountScreen INSTANCE = new LoadingAccountScreen();

    /* renamed from: lambda$-271374771, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9034lambda$271374771 = ComposableLambda3.composableLambdaInstance(-271374771, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$LoadingAccountScreenKt$lambda$-271374771$1
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
                ComposerKt.traceEventStart(-271374771, i, -1, "com.robinhood.android.individualaccounts.onboarding.outro.ComposableSingletons$LoadingAccountScreenKt.lambda$-271374771.<anonymous> (LoadingAccountScreen.kt:70)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-271374771$feature_individual_account_onboarding_externalDebug */
    public final Function2<Composer, Integer, Unit> m2062x9f44e36() {
        return f9034lambda$271374771;
    }
}

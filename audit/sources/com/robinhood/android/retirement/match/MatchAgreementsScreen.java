package com.robinhood.android.retirement.match;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchAgreementsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.match.ComposableSingletons$MatchAgreementsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MatchAgreementsScreen {
    public static final MatchAgreementsScreen INSTANCE = new MatchAgreementsScreen();

    /* renamed from: lambda$-1246667577, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9213lambda$1246667577 = ComposableLambda3.composableLambdaInstance(-1246667577, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.match.ComposableSingletons$MatchAgreementsScreenKt$lambda$-1246667577$1
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
                ComposerKt.traceEventStart(-1246667577, i, -1, "com.robinhood.android.retirement.match.ComposableSingletons$MatchAgreementsScreenKt.lambda$-1246667577.<anonymous> (MatchAgreementsScreen.kt:55)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1246667577$lib_retirement_contributions_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18142getLambda$1246667577$lib_retirement_contributions_externalDebug() {
        return f9213lambda$1246667577;
    }
}

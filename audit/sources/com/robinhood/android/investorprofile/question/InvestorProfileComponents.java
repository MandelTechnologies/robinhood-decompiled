package com.robinhood.android.investorprofile.question;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestorProfileComponents.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.question.ComposableSingletons$InvestorProfileComponentsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestorProfileComponents {
    public static final InvestorProfileComponents INSTANCE = new InvestorProfileComponents();

    /* renamed from: lambda$-528487358, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9075lambda$528487358 = ComposableLambda3.composableLambdaInstance(-528487358, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.ComposableSingletons$InvestorProfileComponentsKt$lambda$-528487358$1
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
                ComposerKt.traceEventStart(-528487358, i, -1, "com.robinhood.android.investorprofile.question.ComposableSingletons$InvestorProfileComponentsKt.lambda$-528487358.<anonymous> (InvestorProfileComponents.kt:103)");
            }
            InvestorProfileComponents3.InvestorProfileHeader("Investor Profile", "Answer a few questions to help us understand your investing preferences.", null, composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-528487358$feature_investor_profile_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15647getLambda$528487358$feature_investor_profile_externalDebug() {
        return f9075lambda$528487358;
    }
}

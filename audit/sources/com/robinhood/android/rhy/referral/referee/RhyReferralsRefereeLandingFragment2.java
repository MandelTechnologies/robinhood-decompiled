package com.robinhood.android.rhy.referral.referee;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralsRefereeLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.referee.ComposableSingletons$RhyReferralsRefereeLandingFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsRefereeLandingFragment2 {
    public static final RhyReferralsRefereeLandingFragment2 INSTANCE = new RhyReferralsRefereeLandingFragment2();

    /* renamed from: lambda$-1296184248, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9230lambda$1296184248 = ComposableLambda3.composableLambdaInstance(-1296184248, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referee.ComposableSingletons$RhyReferralsRefereeLandingFragmentKt$lambda$-1296184248$1
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
                ComposerKt.traceEventStart(-1296184248, i, -1, "com.robinhood.android.rhy.referral.referee.ComposableSingletons$RhyReferralsRefereeLandingFragmentKt.lambda$-1296184248.<anonymous> (RhyReferralsRefereeLandingFragment.kt:209)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1296184248$feature_rhy_referral_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18288getLambda$1296184248$feature_rhy_referral_externalDebug() {
        return f9230lambda$1296184248;
    }
}

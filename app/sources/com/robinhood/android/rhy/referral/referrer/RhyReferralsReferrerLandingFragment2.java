package com.robinhood.android.rhy.referral.referrer;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyReferralsReferrerLandingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.referrer.ComposableSingletons$RhyReferralsReferrerLandingFragmentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsReferrerLandingFragment2 {
    public static final RhyReferralsReferrerLandingFragment2 INSTANCE = new RhyReferralsReferrerLandingFragment2();

    /* renamed from: lambda$-1467400723, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9231lambda$1467400723 = ComposableLambda3.composableLambdaInstance(-1467400723, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.referrer.ComposableSingletons$RhyReferralsReferrerLandingFragmentKt$lambda$-1467400723$1
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
                ComposerKt.traceEventStart(-1467400723, i, -1, "com.robinhood.android.rhy.referral.referrer.ComposableSingletons$RhyReferralsReferrerLandingFragmentKt.lambda$-1467400723.<anonymous> (RhyReferralsReferrerLandingFragment.kt:177)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1467400723$feature_rhy_referral_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18302getLambda$1467400723$feature_rhy_referral_externalDebug() {
        return f9231lambda$1467400723;
    }
}

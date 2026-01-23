package com.robinhood.android.advisory.onboarding.firstdeposit.timeline;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvisoryFirstDepositTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.timeline.ComposableSingletons$AdvisoryFirstDepositTimelineFragmentKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryFirstDepositTimelineFragment2 {
    public static final AdvisoryFirstDepositTimelineFragment2 INSTANCE = new AdvisoryFirstDepositTimelineFragment2();
    private static Function2<Composer, Integer, Unit> lambda$432132787 = ComposableLambda3.composableLambdaInstance(432132787, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.firstdeposit.timeline.ComposableSingletons$AdvisoryFirstDepositTimelineFragmentKt$lambda$432132787$1
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
                ComposerKt.traceEventStart(432132787, i, -1, "com.robinhood.android.advisory.onboarding.firstdeposit.timeline.ComposableSingletons$AdvisoryFirstDepositTimelineFragmentKt.lambda$432132787.<anonymous> (AdvisoryFirstDepositTimelineFragment.kt:68)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$432132787$feature_advisory_onboarding_externalDebug() {
        return lambda$432132787;
    }
}

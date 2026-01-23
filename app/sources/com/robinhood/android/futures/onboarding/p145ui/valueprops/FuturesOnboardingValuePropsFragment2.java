package com.robinhood.android.futures.onboarding.p145ui.valueprops;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOnboardingValuePropsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.onboarding.ui.valueprops.ComposableSingletons$FuturesOnboardingValuePropsFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class FuturesOnboardingValuePropsFragment2 {
    public static final FuturesOnboardingValuePropsFragment2 INSTANCE = new FuturesOnboardingValuePropsFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1114766883 = ComposableLambda3.composableLambdaInstance(1114766883, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.ComposableSingletons$FuturesOnboardingValuePropsFragmentKt$lambda$1114766883$1
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
                ComposerKt.traceEventStart(1114766883, i, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ComposableSingletons$FuturesOnboardingValuePropsFragmentKt.lambda$1114766883.<anonymous> (FuturesOnboardingValuePropsFragment.kt:131)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2078095314, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8995lambda$2078095314 = ComposableLambda3.composableLambdaInstance(-2078095314, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.onboarding.ui.valueprops.ComposableSingletons$FuturesOnboardingValuePropsFragmentKt$lambda$-2078095314$1
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
                ComposerKt.traceEventStart(-2078095314, i, -1, "com.robinhood.android.futures.onboarding.ui.valueprops.ComposableSingletons$FuturesOnboardingValuePropsFragmentKt.lambda$-2078095314.<anonymous> (FuturesOnboardingValuePropsFragment.kt:172)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2078095314$feature_futures_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14724getLambda$2078095314$feature_futures_onboarding_externalDebug() {
        return f8995lambda$2078095314;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1114766883$feature_futures_onboarding_externalDebug() {
        return lambda$1114766883;
    }
}

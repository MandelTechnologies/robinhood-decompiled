package com.robinhood.android.optionsupgrade.rhsg;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhsgOptionOnboardingApprovedTradesFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgOptionOnboardingApprovedTradesFragmentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RhsgOptionOnboardingApprovedTradesFragment2 {
    public static final RhsgOptionOnboardingApprovedTradesFragment2 INSTANCE = new RhsgOptionOnboardingApprovedTradesFragment2();

    /* renamed from: lambda$-929093255, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9163lambda$929093255 = ComposableLambda3.composableLambdaInstance(-929093255, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgOptionOnboardingApprovedTradesFragmentKt$lambda$-929093255$1
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
                ComposerKt.traceEventStart(-929093255, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgOptionOnboardingApprovedTradesFragmentKt.lambda$-929093255.<anonymous> (RhsgOptionOnboardingApprovedTradesFragment.kt:49)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1908746566 = ComposableLambda3.composableLambdaInstance(1908746566, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgOptionOnboardingApprovedTradesFragmentKt$lambda$1908746566$1
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
                ComposerKt.traceEventStart(1908746566, i, -1, "com.robinhood.android.optionsupgrade.rhsg.ComposableSingletons$RhsgOptionOnboardingApprovedTradesFragmentKt.lambda$1908746566.<anonymous> (RhsgOptionOnboardingApprovedTradesFragment.kt:49)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(RhsgOptionOnboardingApprovedTradesFragment2.INSTANCE.m17466getLambda$929093255$feature_options_upgrade_externalDebug(), null, null, null, null, false, false, null, null, 0L, null, composer, 6, 0, 2046);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-929093255$feature_options_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17466getLambda$929093255$feature_options_upgrade_externalDebug() {
        return f9163lambda$929093255;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1908746566$feature_options_upgrade_externalDebug() {
        return lambda$1908746566;
    }
}

package com.robinhood.android.margin.upgrade.p175uk.investorprofile;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: UkMarginOnboardingQuestionnaireFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.uk.investorprofile.ComposableSingletons$UkMarginOnboardingQuestionnaireFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class UkMarginOnboardingQuestionnaireFragment2 {
    public static final UkMarginOnboardingQuestionnaireFragment2 INSTANCE = new UkMarginOnboardingQuestionnaireFragment2();

    /* renamed from: lambda$-1975140070, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9106lambda$1975140070 = ComposableLambda3.composableLambdaInstance(-1975140070, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.upgrade.uk.investorprofile.ComposableSingletons$UkMarginOnboardingQuestionnaireFragmentKt$lambda$-1975140070$1
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
                ComposerKt.traceEventStart(-1975140070, i, -1, "com.robinhood.android.margin.upgrade.uk.investorprofile.ComposableSingletons$UkMarginOnboardingQuestionnaireFragmentKt.lambda$-1975140070.<anonymous> (UkMarginOnboardingQuestionnaireFragment.kt:182)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1975140070$feature_margin_upgrade_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m16257getLambda$1975140070$feature_margin_upgrade_externalDebug() {
        return f9106lambda$1975140070;
    }
}

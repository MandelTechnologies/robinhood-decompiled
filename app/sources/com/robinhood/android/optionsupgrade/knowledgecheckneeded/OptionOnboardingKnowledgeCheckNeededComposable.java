package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OptionOnboardingKnowledgeCheckNeededComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingKnowledgeCheckNeededComposable {
    public static final OptionOnboardingKnowledgeCheckNeededComposable INSTANCE = new OptionOnboardingKnowledgeCheckNeededComposable();
    private static Function2<Composer, Integer, Unit> lambda$1131898238 = ComposableLambda3.composableLambdaInstance(1131898238, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt$lambda$1131898238$1
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
                ComposerKt.traceEventStart(1131898238, i, -1, "com.robinhood.android.optionsupgrade.knowledgecheckneeded.ComposableSingletons$OptionOnboardingKnowledgeCheckNeededComposableKt.lambda$1131898238.<anonymous> (OptionOnboardingKnowledgeCheckNeededComposable.kt:141)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1277396183 = ComposableLambda3.composableLambdaInstance(1277396183, false, OptionOnboardingKnowledgeCheckNeededComposable3.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1131898238$feature_options_upgrade_externalDebug() {
        return lambda$1131898238;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1277396183$feature_options_upgrade_externalDebug() {
        return lambda$1277396183;
    }
}

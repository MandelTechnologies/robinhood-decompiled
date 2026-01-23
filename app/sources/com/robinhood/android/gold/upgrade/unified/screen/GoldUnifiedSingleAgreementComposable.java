package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldUnifiedSingleAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedSingleAgreementComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedSingleAgreementComposable {
    public static final GoldUnifiedSingleAgreementComposable INSTANCE = new GoldUnifiedSingleAgreementComposable();
    private static Function2<Composer, Integer, Unit> lambda$247875260 = ComposableLambda3.composableLambdaInstance(247875260, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedSingleAgreementComposableKt$lambda$247875260$1
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
                ComposerKt.traceEventStart(247875260, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedSingleAgreementComposableKt.lambda$247875260.<anonymous> (GoldUnifiedSingleAgreementComposable.kt:138)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$247875260$feature_gold_upgrade_externalRelease() {
        return lambda$247875260;
    }
}

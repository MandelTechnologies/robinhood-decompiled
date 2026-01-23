package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldUnifiedAgreementDisplayComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedAgreementDisplayComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldUnifiedAgreementDisplayComposable {
    public static final GoldUnifiedAgreementDisplayComposable INSTANCE = new GoldUnifiedAgreementDisplayComposable();

    /* renamed from: lambda$-1893292933, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9028lambda$1893292933 = ComposableLambda3.composableLambdaInstance(-1893292933, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedAgreementDisplayComposableKt$lambda$-1893292933$1
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
                ComposerKt.traceEventStart(-1893292933, i, -1, "com.robinhood.android.gold.upgrade.unified.screen.ComposableSingletons$GoldUnifiedAgreementDisplayComposableKt.lambda$-1893292933.<anonymous> (GoldUnifiedAgreementDisplayComposable.kt:101)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1893292933$feature_gold_upgrade_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15152getLambda$1893292933$feature_gold_upgrade_externalRelease() {
        return f9028lambda$1893292933;
    }
}

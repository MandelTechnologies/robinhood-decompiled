package com.robinhood.android.advisory.tlh.strategy.selection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.tlh.Components2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategySelectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt$lambda$-894029395$1, reason: use source file name */
/* loaded from: classes7.dex */
final class StrategySelectionScreen2 implements Function2<Composer, Integer, Unit> {
    public static final StrategySelectionScreen2 INSTANCE = new StrategySelectionScreen2();

    StrategySelectionScreen2() {
    }

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
            ComposerKt.traceEventStart(-894029395, i, -1, "com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt.lambda$-894029395.<anonymous> (StrategySelectionScreen.kt:316)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt$lambda$-894029395$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Components2.TaxLossHarvestingScaffold((Function0) objRememberedValue, null, false, false, null, null, StrategySelectionScreen.INSTANCE.getLambda$817448086$feature_tax_loss_harvesting_externalDebug(), composer, 1572870, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

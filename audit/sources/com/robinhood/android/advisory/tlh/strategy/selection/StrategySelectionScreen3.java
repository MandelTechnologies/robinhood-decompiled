package com.robinhood.android.advisory.tlh.strategy.selection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategies;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesBanner;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategy;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StrategySelectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt$lambda$817448086$1, reason: use source file name */
/* loaded from: classes7.dex */
final class StrategySelectionScreen3 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final StrategySelectionScreen3 INSTANCE = new StrategySelectionScreen3();

    StrategySelectionScreen3() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(paddingValues) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(817448086, i2, -1, "com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt.lambda$817448086.<anonymous> (StrategySelectionScreen.kt:319)");
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null);
        StrategySelectionScreenViewState strategySelectionScreenViewState = new StrategySelectionScreenViewState(new TaxLossHarvestStrategies("Choose your tax loss strategy", CollectionsKt.listOf((Object[]) new TaxLossHarvestStrategy[]{new TaxLossHarvestStrategy(TaxLossHarvestStrategyType.OFFSET_MANAGED, "Only offset managed gains", "Est losses to harvest: $1,000", "We’ll aim to sell enough of your managed holdings to offset gains in your managed account. Your est net [gain] after the sale will be $1,000.", true, null, null), new TaxLossHarvestStrategy(TaxLossHarvestStrategyType.OFFSET_ALL, "Offset gains in this account only", "Est losses to harvest: $2,000", "We'll aim to sell just enough holdings to offset realized gains in your managed account.", false, null, null), new TaxLossHarvestStrategy(TaxLossHarvestStrategyType.MAX_LOSSES, "Harvest the max losses possible", "Est losses to harvest: $3,950", "We'll sell as many managed holdings as possible to maximize your potential tax savings.", false, null, null), new TaxLossHarvestStrategy(TaxLossHarvestStrategyType.DO_NOT_HARVEST, "Don't harvest any losses", "", "We’ll continue to manage your portfolio as usual.", false, null, null)}), "Robinhood Strategies doesn’t provide tax advice.", new TaxLossHarvestStrategiesBanner("info_filled_24", "Selecting a **strategy** here won’t impact your portfolio until you confirm the transactions in the next step.")));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt$lambda$817448086$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return StrategySelectionScreen3.invoke$lambda$1$lambda$0((TaxLossHarvestStrategy) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        StrategySelectionScreen4.TaxLossHarvestingStrategySelectionComposable(strategySelectionScreenViewState, (Function1) objRememberedValue, modifierFillMaxSize$default, composer, 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(TaxLossHarvestStrategy it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}

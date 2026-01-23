package com.robinhood.android.advisory.tlh.strategy.celebration;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyCelebration;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyCelebrationRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestStrategyCelebrationScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt$lambda$-1315250206$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyCelebrationScreen2 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final HarvestStrategyCelebrationScreen2 INSTANCE = new HarvestStrategyCelebrationScreen2();

    HarvestStrategyCelebrationScreen2() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1315250206, i, -1, "com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt.lambda$-1315250206.<anonymous> (HarvestStrategyCelebrationScreen.kt:187)");
        }
        TaxLossHarvestStrategyCelebration taxLossHarvestStrategyCelebration = new TaxLossHarvestStrategyCelebration("", "All set! Your strategy is active.", "You can change or turn off your strategy at any time.", CollectionsKt.listOf((Object[]) new TaxLossHarvestStrategyCelebrationRow[]{new TaxLossHarvestStrategyCelebrationRow("We'll automatically sell investments at a loss to help offset gains.", "sparkle_bullet_24"), new TaxLossHarvestStrategyCelebrationRow("We'll reinvest the proceeds in similar, but not identical, investments.", "sparkle_bullet_24"), new TaxLossHarvestStrategyCelebrationRow("We'll monitor your account and notify you of any important activity.", "sparkle_bullet_24")}));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt$lambda$-1315250206$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HarvestStrategyCelebrationScreen4.HarvestStrategyCelebrationScreenContent(taxLossHarvestStrategyCelebration, (Function0) objRememberedValue, null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

package com.robinhood.android.advisory.tlh.strategy.celebration;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.tlh.Components2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestStrategyCelebrationScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt$lambda$446667833$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestStrategyCelebrationScreen3 implements Function2<Composer, Integer, Unit> {
    public static final HarvestStrategyCelebrationScreen3 INSTANCE = new HarvestStrategyCelebrationScreen3();

    HarvestStrategyCelebrationScreen3() {
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
            ComposerKt.traceEventStart(446667833, i, -1, "com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt.lambda$446667833.<anonymous> (HarvestStrategyCelebrationScreen.kt:182)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.strategy.celebration.ComposableSingletons$HarvestStrategyCelebrationScreenKt$lambda$446667833$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Components2.TaxLossHarvestingScaffold((Function0) objRememberedValue, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), true, false, null, null, HarvestStrategyCelebrationScreen.INSTANCE.m11287getLambda$1315250206$feature_tax_loss_harvesting_externalDebug(), composer, 1573302, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

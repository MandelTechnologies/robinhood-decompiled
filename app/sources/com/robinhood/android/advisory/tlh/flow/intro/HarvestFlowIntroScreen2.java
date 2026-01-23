package com.robinhood.android.advisory.tlh.flow.intro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategiesIntro;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: HarvestFlowIntroScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.flow.intro.ComposableSingletons$HarvestFlowIntroScreenKt$lambda$-576432893$1, reason: use source file name */
/* loaded from: classes7.dex */
final class HarvestFlowIntroScreen2 implements Function2<Composer, Integer, Unit> {
    public static final HarvestFlowIntroScreen2 INSTANCE = new HarvestFlowIntroScreen2();

    HarvestFlowIntroScreen2() {
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
            ComposerKt.traceEventStart(-576432893, i, -1, "com.robinhood.android.advisory.tlh.flow.intro.ComposableSingletons$HarvestFlowIntroScreenKt.lambda$-576432893.<anonymous> (HarvestFlowIntroScreen.kt:157)");
        }
        PaddingValues paddingValuesM5135PaddingValues0680j_4 = PaddingKt.m5135PaddingValues0680j_4(C2002Dp.m7995constructorimpl(0));
        TaxLossHarvestStrategiesIntro taxLossHarvestStrategiesIntro = new TaxLossHarvestStrategiesIntro("Let’s see how many losses we can harvest", "Keep in mind we’ll only harvest losses in your **managed individual** account.", "", "Continue", "");
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m6727getWhite0d7_KjU(), null, 2, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.intro.ComposableSingletons$HarvestFlowIntroScreenKt$lambda$-576432893$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        HarvestFlowIntroScreen3.LoadedHarvestFlowIntroScreen(taxLossHarvestStrategiesIntro, paddingValuesM5135PaddingValues0680j_4, (Function0) objRememberedValue, modifierM4872backgroundbw27NRU$default, composer, 3504, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

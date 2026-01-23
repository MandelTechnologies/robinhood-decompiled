package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerSwitcher.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerSwitcher {
    public static final InvestmentsTrackerSwitcher INSTANCE = new InvestmentsTrackerSwitcher();
    private static Function2<Composer, Integer, Unit> lambda$579806403 = ComposableLambda3.composableLambdaInstance(579806403, false, InvestmentsTrackerSwitcher3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$425496494 = ComposableLambda3.composableLambdaInstance(425496494, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt$lambda$425496494$1
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
                ComposerKt.traceEventStart(425496494, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerSwitcherKt.lambda$425496494.<anonymous> (InvestmentsTrackerSwitcher.kt:34)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerSwitcher.INSTANCE.getLambda$579806403$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$425496494$feature_investments_tracker_externalDebug() {
        return lambda$425496494;
    }

    public final Function2<Composer, Integer, Unit> getLambda$579806403$feature_investments_tracker_externalDebug() {
        return lambda$579806403;
    }
}

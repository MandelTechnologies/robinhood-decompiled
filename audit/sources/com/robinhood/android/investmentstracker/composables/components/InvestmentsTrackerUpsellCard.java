package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InvestmentsTrackerUpsellCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerUpsellCard {
    public static final InvestmentsTrackerUpsellCard INSTANCE = new InvestmentsTrackerUpsellCard();

    /* renamed from: lambda$-627705277, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9074lambda$627705277 = ComposableLambda3.composableLambdaInstance(-627705277, false, InvestmentsTrackerUpsellCard3.INSTANCE);

    /* renamed from: lambda$-2054293586, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9073lambda$2054293586 = ComposableLambda3.composableLambdaInstance(-2054293586, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt$lambda$-2054293586$1
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
                ComposerKt.traceEventStart(-2054293586, i, -1, "com.robinhood.android.investmentstracker.composables.components.ComposableSingletons$InvestmentsTrackerUpsellCardKt.lambda$-2054293586.<anonymous> (InvestmentsTrackerUpsellCard.kt:40)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(InvestmentsTrackerUpsellCard.INSTANCE.m15608getLambda$627705277$feature_investments_tracker_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2054293586$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15607getLambda$2054293586$feature_investments_tracker_externalDebug() {
        return f9073lambda$2054293586;
    }

    /* renamed from: getLambda$-627705277$feature_investments_tracker_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m15608getLambda$627705277$feature_investments_tracker_externalDebug() {
        return f9074lambda$627705277;
    }
}

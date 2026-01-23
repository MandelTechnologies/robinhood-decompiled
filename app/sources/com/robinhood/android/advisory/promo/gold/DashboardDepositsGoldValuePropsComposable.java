package com.robinhood.android.advisory.promo.gold;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DashboardDepositsGoldValuePropsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.promo.gold.ComposableSingletons$DashboardDepositsGoldValuePropsComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DashboardDepositsGoldValuePropsComposable {
    public static final DashboardDepositsGoldValuePropsComposable INSTANCE = new DashboardDepositsGoldValuePropsComposable();
    private static Function2<Composer, Integer, Unit> lambda$817312231 = ComposableLambda3.composableLambdaInstance(817312231, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.promo.gold.ComposableSingletons$DashboardDepositsGoldValuePropsComposableKt$lambda$817312231$1
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
                ComposerKt.traceEventStart(817312231, i, -1, "com.robinhood.android.advisory.promo.gold.ComposableSingletons$DashboardDepositsGoldValuePropsComposableKt.lambda$817312231.<anonymous> (DashboardDepositsGoldValuePropsComposable.kt:57)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$817312231$feature_advisory_promo_externalDebug() {
        return lambda$817312231;
    }
}
